package io.flutter.embedding.android;

import android.graphics.Matrix;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final Matrix f17061e = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    private final k5.a f17062a;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17064c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, float[]> f17065d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final s f17063b = s.a();

    public a(k5.a aVar, boolean z6) {
        this.f17062a = aVar;
        this.f17064c = z6;
    }

    private void a(MotionEvent motionEvent, int i7, int i8, int i9, Matrix matrix, ByteBuffer byteBuffer) {
        long j7;
        long j8;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        InputDevice.MotionRange motionRange;
        if (i8 == -1) {
            return;
        }
        long d12 = this.f17064c ? this.f17063b.c(motionEvent).d() : 0L;
        int d13 = d(motionEvent.getToolType(i7));
        float[] fArr = {motionEvent.getX(i7), motionEvent.getY(i7)};
        matrix.mapPoints(fArr);
        if (d13 == 1) {
            j7 = motionEvent.getButtonState() & 31;
            if (j7 == 0 && motionEvent.getSource() == 8194 && i8 == 4) {
                this.f17065d.put(Integer.valueOf(motionEvent.getPointerId(i7)), fArr);
            }
        } else {
            j7 = d13 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = this.f17065d.containsKey(Integer.valueOf(motionEvent.getPointerId(i7)));
        int i10 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(d12);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(c(i8));
            j8 = 4;
        } else {
            byteBuffer.putLong(i8);
            j8 = d13;
        }
        byteBuffer.putLong(j8);
        byteBuffer.putLong(i10);
        byteBuffer.putLong(motionEvent.getPointerId(i7));
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = this.f17065d.get(Integer.valueOf(motionEvent.getPointerId(i7)));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j7);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i7));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d7 = 1.0d;
            d8 = 0.0d;
        } else {
            d8 = motionRange.getMin();
            d7 = motionRange.getMax();
        }
        byteBuffer.putDouble(d8);
        byteBuffer.putDouble(d7);
        if (d13 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i7));
            d9 = 0.0d;
        } else {
            d9 = 0.0d;
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(motionEvent.getSize(i7));
        byteBuffer.putDouble(motionEvent.getToolMajor(i7));
        byteBuffer.putDouble(motionEvent.getToolMinor(i7));
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i7));
        if (d13 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i7));
        } else {
            byteBuffer.putDouble(d9);
        }
        byteBuffer.putLong(i9);
        if (i10 == 1) {
            byteBuffer.putDouble(-motionEvent.getAxisValue(10));
            d10 = -motionEvent.getAxisValue(9);
        } else {
            d10 = 0.0d;
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d10);
        if (containsKey) {
            float[] fArr3 = this.f17065d.get(Integer.valueOf(motionEvent.getPointerId(i7)));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d11 = 0.0d;
        } else {
            d11 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d11);
        if (containsKey && c(i8) == 9) {
            this.f17065d.remove(Integer.valueOf(motionEvent.getPointerId(i7)));
        }
    }

    private int b(int i7) {
        if (i7 == 0) {
            return 4;
        }
        if (i7 == 1) {
            return 6;
        }
        if (i7 == 5) {
            return 4;
        }
        if (i7 == 6) {
            return 6;
        }
        if (i7 == 2) {
            return 5;
        }
        if (i7 == 7) {
            return 3;
        }
        if (i7 == 3) {
            return 0;
        }
        if (i7 == 8) {
            return 3;
        }
        throw new AssertionError("Unexpected masked action");
    }

    private int c(int i7) {
        if (i7 == 4) {
            return 7;
        }
        if (i7 == 5) {
            return 8;
        }
        if (i7 == 6 || i7 == 0) {
            return 9;
        }
        throw new AssertionError("Unexpected pointer change");
    }

    private int d(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 != 3) {
            return i7 != 4 ? 5 : 3;
        }
        return 1;
    }

    public boolean e(MotionEvent motionEvent) {
        boolean z6 = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z7 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z6 || !z7) {
            return false;
        }
        int b7 = b(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        a(motionEvent, motionEvent.getActionIndex(), b7, 0, f17061e, allocateDirect);
        if (allocateDirect.position() % 280 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f17062a.j(allocateDirect, allocateDirect.position());
        return true;
    }

    public boolean f(MotionEvent motionEvent) {
        return g(motionEvent, f17061e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(MotionEvent motionEvent, Matrix matrix) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int b7 = b(motionEvent.getActionMasked());
        boolean z6 = actionMasked == 0 || actionMasked == 5;
        boolean z7 = !z6 && (actionMasked == 1 || actionMasked == 6);
        if (!z6) {
            int i7 = 0;
            if (!z7) {
                while (i7 < pointerCount) {
                    a(motionEvent, i7, b7, 0, matrix, allocateDirect);
                    i7++;
                }
                if (allocateDirect.position() % 280 == 0) {
                    throw new AssertionError("Packet position is not on field boundary");
                }
                this.f17062a.j(allocateDirect, allocateDirect.position());
                return true;
            }
            while (i7 < pointerCount) {
                if (i7 != motionEvent.getActionIndex() && motionEvent.getToolType(i7) == 1) {
                    a(motionEvent, i7, 5, 1, matrix, allocateDirect);
                }
                i7++;
            }
        }
        a(motionEvent, motionEvent.getActionIndex(), b7, 0, matrix, allocateDirect);
        if (allocateDirect.position() % 280 == 0) {
        }
    }
}
