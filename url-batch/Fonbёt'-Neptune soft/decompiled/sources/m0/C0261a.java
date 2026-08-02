package m0;

import P.O;
import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261a {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f3134f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.l f3135a;

    /* renamed from: b, reason: collision with root package name */
    public final O f3136b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3137c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3138d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f3139e;

    public C0261a(io.flutter.embedding.engine.renderer.l lVar, boolean z2) {
        this.f3135a = lVar;
        if (O.f872h == null) {
            O.f872h = new O(12);
        }
        this.f3136b = O.f872h;
        this.f3137c = z2;
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 5) {
            return 4;
        }
        if (i2 == 6) {
            return 6;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i2 == 7) {
            return 3;
        }
        if (i2 == 3) {
            return 0;
        }
        return i2 == 8 ? 3 : -1;
    }

    public final void a(MotionEvent motionEvent, int i2, int i3, int i4, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i5;
        int i6;
        long j2;
        int i7;
        long j3;
        float[] fArr;
        double d2;
        double d3;
        MotionEvent motionEvent2;
        double d4;
        double d5;
        double d6;
        C0261a c0261a;
        float c2;
        float scaledHorizontalScrollFactor;
        InputDevice.MotionRange motionRange;
        if (i3 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i2);
        int toolType = motionEvent.getToolType(i2);
        if (toolType == 1) {
            i5 = 0;
        } else if (toolType != 2) {
            i5 = 3;
            if (toolType == 3) {
                i5 = 1;
            } else if (toolType != 4) {
                i5 = 5;
            }
        } else {
            i5 = 2;
        }
        float[] fArr2 = {motionEvent.getX(i2), motionEvent.getY(i2)};
        matrix.mapPoints(fArr2);
        HashMap hashMap = this.f3138d;
        if (i5 == 1) {
            j2 = motionEvent.getButtonState() & 31;
            if (j2 == 0 && motionEvent.getSource() == 8194) {
                i6 = 4;
                if (i3 == 4) {
                    hashMap.put(Integer.valueOf(pointerId), fArr2);
                }
            } else {
                i6 = 4;
            }
        } else {
            i6 = 4;
            j2 = i5 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            i7 = i3 == i6 ? 7 : i3 == 5 ? 8 : (i3 == 6 || i3 == 0) ? 9 : -1;
            if (i7 == -1) {
                return;
            }
        } else {
            i7 = -1;
        }
        if (this.f3137c) {
            O o2 = this.f3136b;
            o2.getClass();
            j3 = G.f3132b.incrementAndGet();
            ((LongSparseArray) o2.f875f).put(j3, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) o2.f876g).add(Long.valueOf(j3));
        } else {
            j3 = 0;
        }
        int i8 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long j4 = j2;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(j3);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(i7);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i3);
            byteBuffer.putLong(i5);
        }
        byteBuffer.putLong(i8);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr3[0]);
            byteBuffer.putDouble(fArr3[1]);
        } else {
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j4);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i2));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            fArr = fArr2;
            d2 = 0.0d;
            d3 = 1.0d;
        } else {
            d2 = motionRange.getMin();
            fArr = fArr2;
            d3 = motionRange.getMax();
        }
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(d3);
        if (i5 == 2) {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, i2));
            byteBuffer.putDouble(0.0d);
        } else {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i2));
        byteBuffer.putDouble(motionEvent.getToolMajor(i2));
        byteBuffer.putDouble(motionEvent.getToolMinor(i2));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, i2));
        if (i5 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, i2));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(i4);
        if (i8 == 1) {
            if (context != null) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 26) {
                    scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c2 = scaledHorizontalScrollFactor;
                    c0261a = this;
                } else {
                    c0261a = this;
                    c2 = c0261a.c(context);
                }
                d5 = c2;
                d6 = i9 >= 26 ? ViewConfiguration.get(context).getScaledVerticalScrollFactor() : c0261a.c(context);
            } else {
                d5 = 48.0d;
                d6 = 48.0d;
            }
            byteBuffer.putDouble(d5 * (-motionEvent2.getAxisValue(10, i2)));
            byteBuffer.putDouble(d6 * (-motionEvent2.getAxisValue(9, i2)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr4 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr4[0]);
            byteBuffer.putDouble(fArr[1] - fArr4[1]);
            d4 = 0.0d;
        } else {
            d4 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d4);
        byteBuffer.putLong(0L);
        if (containsKey && i7 == 9) {
            hashMap.remove(Integer.valueOf(pointerId));
        }
    }

    public final int c(Context context) {
        if (this.f3139e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f3139e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3139e;
    }

    public final void d(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int b2 = b(motionEvent.getActionMasked());
        char c2 = 5;
        boolean z2 = actionMasked == 0 || actionMasked == 5;
        boolean z3 = !z2 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c2 = 0;
        } else if (toolType == 2) {
            c2 = 2;
        } else if (toolType == 3) {
            c2 = 1;
        } else if (toolType == 4) {
            c2 = 3;
        }
        int i2 = (z3 && c2 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i2) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z2) {
            a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, allocateDirect, null);
        } else if (z3) {
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (i3 != motionEvent.getActionIndex() && motionEvent.getToolType(i3) == 1) {
                    a(motionEvent, i3, 5, 1, matrix, allocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, allocateDirect, null);
            if (i2 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect, null);
            }
        } else {
            for (int i4 = 0; i4 < pointerCount; i4++) {
                a(motionEvent, i4, b2, 0, matrix, allocateDirect, null);
            }
        }
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f3135a.f2537a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
    }
}
