package n0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2775a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2776b;

    /* renamed from: c, reason: collision with root package name */
    public VelocityTracker f2777c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public int f2778e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2779f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2780g = -1;
    public final int[] h = {Integer.MAX_VALUE, 0};

    public g(Context context, h hVar) {
        this.f2775a = context;
        this.f2776b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00b8, code lost:
    
        if (r5 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0071, code lost:
    
        if (r14 >= 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent, int i) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        float f5;
        float f6;
        long j2;
        float f7;
        float sqrt;
        float f8;
        float f9;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i8 = this.f2779f;
        int[] iArr = this.h;
        if (i8 == source && this.f2780g == deviceId && this.f2778e == i) {
            z4 = false;
            i4 = 1;
            i5 = 0;
        } else {
            Context context = this.f2775a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i4 = 1;
            int i9 = Build.VERSION.SDK_INT;
            i5 = 0;
            if (i9 >= 34) {
                i6 = y.f(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i6 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i6 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i6 = Integer.MAX_VALUE;
            }
            iArr[0] = i6;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i9 >= 34) {
                i7 = y.e(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i, source3) != null) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        i7 = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        i7 = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                i7 = Integer.MIN_VALUE;
            }
            iArr[1] = i7;
            this.f2779f = source;
            this.f2780g = deviceId;
            this.f2778e = i;
            z4 = true;
        }
        if (iArr[i5] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f2777c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2777c = null;
                return;
            }
            return;
        }
        if (this.f2777c == null) {
            this.f2777c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f2777c;
        Map map = z.f2856a;
        velocityTracker2.addMovement(motionEvent);
        float f10 = 0.0f;
        int i10 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = z.f2856a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new a0());
            }
            a0 a0Var = (a0) map2.get(velocityTracker2);
            long[] jArr = a0Var.f2750b;
            long eventTime = motionEvent.getEventTime();
            if (a0Var.d != 0 && eventTime - jArr[a0Var.f2752e] > 40) {
                a0Var.d = i5;
                a0Var.f2751c = 0.0f;
            }
            int i11 = (a0Var.f2752e + 1) % 20;
            a0Var.f2752e = i11;
            int i12 = a0Var.d;
            if (i12 != 20) {
                a0Var.d = i12 + 1;
            }
            a0Var.f2749a[i11] = motionEvent.getAxisValue(26);
            jArr[a0Var.f2752e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        a0 a0Var2 = (a0) z.f2856a.get(velocityTracker2);
        if (a0Var2 != null) {
            float[] fArr = a0Var2.f2749a;
            long[] jArr2 = a0Var2.f2750b;
            int i13 = a0Var2.d;
            if (i13 >= 2) {
                int i14 = a0Var2.f2752e;
                int i15 = ((i14 + 20) - (i13 - 1)) % 20;
                long j4 = jArr2[i14];
                while (true) {
                    j2 = jArr2[i15];
                    if (j4 - j2 <= 100) {
                        break;
                    }
                    a0Var2.d--;
                    i15 = (i15 + 1) % 20;
                }
                int i16 = a0Var2.d;
                if (i16 >= 2) {
                    if (i16 == 2) {
                        int i17 = (i15 + 1) % 20;
                        if (j2 != jArr2[i17]) {
                            sqrt = fArr[i17] / (r13 - j2);
                            f7 = Float.MAX_VALUE;
                            f5 = 0.0f;
                        }
                    } else {
                        f7 = Float.MAX_VALUE;
                        float f11 = 0.0f;
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            if (i18 >= a0Var2.d - 1) {
                                break;
                            }
                            int i20 = i18 + i15;
                            long j5 = jArr2[i20 % 20];
                            int i21 = (i20 + 1) % i10;
                            if (jArr2[i21] == j5) {
                                f8 = f10;
                            } else {
                                i19++;
                                f8 = f10;
                                float sqrt2 = (f11 < f10 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f11) * 2.0f));
                                float f12 = fArr[i21] / (jArr2[i21] - j5);
                                f11 += Math.abs(f12) * (f12 - sqrt2);
                                if (i19 == i4) {
                                    f11 *= 0.5f;
                                }
                            }
                            i18++;
                            f10 = f8;
                            i10 = 20;
                            i4 = 1;
                        }
                        f5 = f10;
                        sqrt = (f11 < f5 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f11) * 2.0f));
                    }
                    f9 = sqrt * 1000;
                    a0Var2.f2751c = f9;
                    if (f9 >= (-Math.abs(f7))) {
                        a0Var2.f2751c = -Math.abs(f7);
                    } else if (a0Var2.f2751c > Math.abs(f7)) {
                        a0Var2.f2751c = Math.abs(f7);
                    }
                }
            }
            f7 = Float.MAX_VALUE;
            sqrt = 0.0f;
            f5 = 0.0f;
            f9 = sqrt * 1000;
            a0Var2.f2751c = f9;
            if (f9 >= (-Math.abs(f7))) {
            }
        } else {
            f5 = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f6 = y.b(velocityTracker2, i);
        } else if (i == 0) {
            f6 = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            f6 = velocityTracker2.getYVelocity();
        } else {
            a0 a0Var3 = (a0) z.f2856a.get(velocityTracker2);
            f6 = (a0Var3 == null || i != 26) ? f5 : a0Var3.f2751c;
        }
        h hVar = this.f2776b;
        float c5 = hVar.c() * f6;
        float signum = Math.signum(c5);
        if (z4 || (signum != Math.signum(this.d) && signum != f5)) {
            hVar.d();
        }
        if (Math.abs(c5) < iArr[0]) {
            return;
        }
        float max = Math.max(-r1, Math.min(c5, iArr[1]));
        this.d = hVar.b(max) ? max : f5;
    }
}
