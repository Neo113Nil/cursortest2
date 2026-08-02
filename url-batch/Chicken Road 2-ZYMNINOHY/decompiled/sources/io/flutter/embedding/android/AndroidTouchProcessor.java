package io.flutter.embedding.android;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AndroidTouchProcessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BYTES_PER_FIELD = 8;
    static final int DEFAULT_HORIZONTAL_SCROLL_FACTOR = 48;
    static final int DEFAULT_VERTICAL_SCROLL_FACTOR = 48;
    private static final Matrix IDENTITY_TRANSFORM = new Matrix();
    private static final int IMPLICIT_VIEW_ID = 0;
    static final int POINTER_DATA_FIELD_COUNT = 36;
    private static final int POINTER_DATA_FLAG_BATCHED = 1;
    private static final int POINTER_DATA_FLAG_MULTIPLE = 2;
    private static final int POINTER_DATA_MULTIPLE_POINTER_COUNT_SHIFT = 8;
    private static final String TAG = "AndroidTouchProcessor";
    private static final int TOOL_TYPE_BITS = 3;
    private static final int TOOL_TYPE_MASK = 7;
    private int cachedVerticalScrollFactor;
    private final FlutterRenderer renderer;
    private final boolean trackMotionEvents;
    private final Map<Integer, float[]> ongoingPans = new HashMap();
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

    public @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int PAN_ZOOM_END = 9;
        public static final int PAN_ZOOM_START = 7;
        public static final int PAN_ZOOM_UPDATE = 8;
        public static final int REMOVE = 2;
        public static final int UP = 6;
    }

    public @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int TRACKPAD = 4;
        public static final int UNKNOWN = 5;
    }

    public @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCALE = 3;
        public static final int SCROLL = 1;
        public static final int SCROLL_INERTIA_CANCEL = 2;
        public static final int UNKNOWN = 4;
    }

    public AndroidTouchProcessor(FlutterRenderer flutterRenderer, boolean z) {
        this.renderer = flutterRenderer;
        this.trackMotionEvents = z;
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i4, int i5, int i6, Matrix matrix, ByteBuffer byteBuffer) {
        addPointerForIndex(motionEvent, i4, i5, i6, matrix, byteBuffer, null);
    }

    private float getHorizontalScrollFactor(Context context) {
        float scaledHorizontalScrollFactor;
        if (Build.VERSION.SDK_INT < 26) {
            return getVerticalScrollFactorPre26(context);
        }
        scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
        return scaledHorizontalScrollFactor;
    }

    private int getPointerChangeForAction(int i4) {
        if (i4 == 0) {
            return 4;
        }
        if (i4 == 1) {
            return 6;
        }
        if (i4 == 5) {
            return 4;
        }
        if (i4 == 6) {
            return 6;
        }
        if (i4 == 2) {
            return 5;
        }
        if (i4 == 7) {
            return 3;
        }
        if (i4 == 3) {
            return 0;
        }
        return i4 == 8 ? 3 : -1;
    }

    private int getPointerChangeForPanZoom(int i4) {
        if (i4 == 4) {
            return 7;
        }
        if (i4 == 5) {
            return 8;
        }
        return (i4 == 6 || i4 == 0) ? 9 : -1;
    }

    private int getPointerDeviceTypeForToolType(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 2;
        }
        if (i4 != 3) {
            return i4 != 4 ? 5 : 3;
        }
        return 1;
    }

    private float getVerticalScrollFactor(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? getVerticalScrollFactorAbove26(context) : getVerticalScrollFactorPre26(context);
    }

    private float getVerticalScrollFactorAbove26(Context context) {
        float scaledVerticalScrollFactor;
        scaledVerticalScrollFactor = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
        return scaledVerticalScrollFactor;
    }

    private int getVerticalScrollFactorPre26(Context context) {
        if (this.cachedVerticalScrollFactor == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.cachedVerticalScrollFactor = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.cachedVerticalScrollFactor;
    }

    private int uniquePointerIdByType(MotionEvent motionEvent, int i4) {
        return (motionEvent.getToolType(i4) & 7) | (motionEvent.getPointerId(i4) << 3);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent, Context context) {
        boolean isFromSource = motionEvent.isFromSource(2);
        boolean z = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!isFromSource || !z) {
            return false;
        }
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, IDENTITY_TRANSFORM, allocateDirect, context);
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.renderer.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent, IDENTITY_TRANSFORM);
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i4, int i5, int i6, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i7;
        int i8;
        long j4;
        long j5;
        double d4;
        double d5;
        double d6;
        double d7;
        InputDevice.MotionRange motionRange;
        int i9 = -1;
        if (i5 == -1) {
            return;
        }
        int uniquePointerIdByType = uniquePointerIdByType(motionEvent, i4);
        int pointerDeviceTypeForToolType = getPointerDeviceTypeForToolType(motionEvent.getToolType(i4));
        float[] fArr = {motionEvent.getX(i4), motionEvent.getY(i4)};
        matrix.mapPoints(fArr);
        if (pointerDeviceTypeForToolType == 1) {
            i8 = 0;
            j4 = 0;
            long buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0) {
                i7 = 1;
                if (motionEvent.getSource() == 8194 && i5 == 4) {
                    this.ongoingPans.put(Integer.valueOf(uniquePointerIdByType), fArr);
                }
            } else {
                i7 = 1;
            }
            j5 = buttonState;
        } else {
            i7 = 1;
            i8 = 0;
            j4 = 0;
            j5 = pointerDeviceTypeForToolType == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = this.ongoingPans.containsKey(Integer.valueOf(uniquePointerIdByType));
        if (containsKey) {
            int pointerChangeForPanZoom = getPointerChangeForPanZoom(i5);
            if (pointerChangeForPanZoom == -1) {
                return;
            } else {
                i9 = pointerChangeForPanZoom;
            }
        }
        long id = this.trackMotionEvents ? this.motionEventTracker.track(motionEvent).getId() : j4;
        int i10 = motionEvent.getActionMasked() == 8 ? i7 : i8;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(id);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(i9);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i5);
            byteBuffer.putLong(pointerDeviceTypeForToolType);
        }
        byteBuffer.putLong(i10);
        byteBuffer.putLong(uniquePointerIdByType);
        byteBuffer.putLong(j4);
        if (containsKey) {
            float[] fArr2 = this.ongoingPans.get(Integer.valueOf(uniquePointerIdByType));
            byteBuffer.putDouble(fArr2[i8]);
            byteBuffer.putDouble(fArr2[i7]);
        } else {
            byteBuffer.putDouble(fArr[i8]);
            byteBuffer.putDouble(fArr[i7]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j5);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i4));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d4 = 0.0d;
            d5 = 1.0d;
        } else {
            d4 = motionRange.getMin();
            d5 = motionRange.getMax();
        }
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(d5);
        if (pointerDeviceTypeForToolType == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i4));
            byteBuffer.putDouble(0.0d);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i4));
        byteBuffer.putDouble(motionEvent.getToolMajor(i4));
        byteBuffer.putDouble(motionEvent.getToolMinor(i4));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i4));
        if (pointerDeviceTypeForToolType == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i4));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(i6);
        if (i10 == i7) {
            if (context != null) {
                d6 = getHorizontalScrollFactor(context);
                d7 = getVerticalScrollFactor(context);
            } else {
                d6 = 48.0d;
                d7 = 48.0d;
            }
            byteBuffer.putDouble(d6 * (-motionEvent.getAxisValue(10, i4)));
            byteBuffer.putDouble(d7 * (-motionEvent.getAxisValue(9, i4)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr3 = this.ongoingPans.get(Integer.valueOf(uniquePointerIdByType));
            byteBuffer.putDouble(fArr[i8] - fArr3[i8]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(0L);
        if (containsKey && i9 == 9) {
            this.ongoingPans.remove(Integer.valueOf(uniquePointerIdByType));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z4 = !z && (actionMasked == 1 || actionMasked == 6);
        int i4 = (z4 && getPointerDeviceTypeForToolType(motionEvent.getToolType(motionEvent.getActionIndex())) == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i4) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z) {
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, allocateDirect);
        } else if (z4) {
            for (int i5 = 0; i5 < pointerCount; i5++) {
                if (i5 != motionEvent.getActionIndex() && motionEvent.getToolType(i5) == 1) {
                    addPointerForIndex(motionEvent, i5, 5, 1, matrix, allocateDirect);
                }
            }
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, allocateDirect);
            if (i4 != 0) {
                addPointerForIndex(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect);
            }
        } else {
            for (int i6 = 0; i6 < pointerCount; i6++) {
                addPointerForIndex(motionEvent, i6, pointerChangeForAction, (pointerCount << 8) | 2, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.renderer.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
        return true;
    }
}
