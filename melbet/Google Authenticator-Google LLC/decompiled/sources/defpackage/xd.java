package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xd {
    private final Context a;
    private final xe b;
    private VelocityTracker c;
    private float d;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private final int[] h = {Integer.MAX_VALUE, 0};

    public xd(Context context, xe xeVar) {
        this.a = context;
        this.b = xeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent, int i) {
        char c;
        int d;
        int i2;
        int i3;
        final int i4;
        int d2;
        boolean z;
        float f;
        int i5;
        long j;
        float f2;
        float a;
        float f3;
        int i6;
        float f4;
        int i7 = i;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f == source && this.g == deviceId && this.e == i7) {
            z = false;
        } else {
            Context context = this.a;
            int[] iArr = this.h;
            final ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            if (Build.VERSION.SDK_INT >= 34) {
                d = viewConfiguration.getScaledMinimumFlingVelocity(deviceId2, i7, source2);
            } else if (yi.e(deviceId2, i7, source2)) {
                Resources resources = context.getResources();
                int identifier = (source2 == 4194304 && i7 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                viewConfiguration.getClass();
                final int i8 = 0;
                c = 0;
                d = yi.d(resources, identifier, new wt() { // from class: yr
                    @Override // defpackage.wt
                    public final Object a() {
                        int i9 = i8;
                        ViewConfiguration viewConfiguration2 = viewConfiguration;
                        return i9 != 0 ? Integer.valueOf(viewConfiguration2.getScaledMaximumFlingVelocity()) : Integer.valueOf(viewConfiguration2.getScaledMinimumFlingVelocity());
                    }
                }, Integer.MAX_VALUE);
                iArr[c] = d;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (Build.VERSION.SDK_INT < 34) {
                    d2 = viewConfiguration.getScaledMaximumFlingVelocity(deviceId3, i7, source3);
                    i2 = i7;
                } else if (yi.e(deviceId3, i7, source3)) {
                    Resources resources2 = context.getResources();
                    if (source3 == 4194304 && i7 == 26) {
                        i3 = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                        i2 = 26;
                    } else {
                        i2 = i7;
                        i3 = -1;
                    }
                    viewConfiguration.getClass();
                    i4 = 1;
                    d2 = yi.d(resources2, i3, new wt() { // from class: yr
                        @Override // defpackage.wt
                        public final Object a() {
                            int i9 = i4;
                            ViewConfiguration viewConfiguration2 = viewConfiguration;
                            return i9 != 0 ? Integer.valueOf(viewConfiguration2.getScaledMaximumFlingVelocity()) : Integer.valueOf(viewConfiguration2.getScaledMinimumFlingVelocity());
                        }
                    }, Integer.MIN_VALUE);
                    iArr[i4] = d2;
                    this.f = source;
                    this.g = deviceId;
                    this.e = i7;
                    i7 = i2;
                    z = true;
                } else {
                    i2 = i7;
                    d2 = Integer.MIN_VALUE;
                }
                i4 = 1;
                iArr[i4] = d2;
                this.f = source;
                this.g = deviceId;
                this.e = i7;
                i7 = i2;
                z = true;
            } else {
                d = Integer.MAX_VALUE;
            }
            c = 0;
            iArr[c] = d;
            int deviceId32 = motionEvent.getDeviceId();
            int source32 = motionEvent.getSource();
            if (Build.VERSION.SDK_INT < 34) {
            }
            i4 = 1;
            iArr[i4] = d2;
            this.f = source;
            this.g = deviceId;
            this.e = i7;
            i7 = i2;
            z = true;
        }
        int[] iArr2 = this.h;
        int i9 = iArr2[0];
        VelocityTracker velocityTracker = this.c;
        if (i9 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.c = velocityTracker;
        }
        Map map = xy.a;
        velocityTracker.addMovement(motionEvent);
        int i10 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = xy.a;
            if (!map2.containsKey(velocityTracker)) {
                map2.put(velocityTracker, new xz());
            }
            xz xzVar = (xz) map2.get(velocityTracker);
            long eventTime = motionEvent.getEventTime();
            int i11 = xzVar.d;
            if (i11 != 0 && eventTime - xzVar.b[xzVar.e] > 40) {
                xzVar.d = 0;
                xzVar.c = 0.0f;
                i11 = 0;
            }
            int i12 = (xzVar.e + 1) % 20;
            xzVar.e = i12;
            if (i11 != 20) {
                xzVar.d = i11 + 1;
            }
            xzVar.a[i12] = motionEvent.getAxisValue(26);
            xzVar.b[xzVar.e] = eventTime;
        }
        float f5 = Float.MAX_VALUE;
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        xz a2 = xy.a(velocityTracker);
        if (a2 != null) {
            int i13 = a2.d;
            if (i13 >= 2) {
                int i14 = a2.e;
                long[] jArr = a2.b;
                long j2 = jArr[i14];
                int i15 = (i14 + 20) - (i13 - 1);
                while (true) {
                    i5 = i15 % 20;
                    j = jArr[i5];
                    if (j2 - j <= 100) {
                        break;
                    }
                    i15 = i5 + 1;
                    a2.d--;
                }
                int i16 = a2.d;
                if (i16 >= 2) {
                    if (i16 == 2) {
                        int i17 = (i5 + 1) % 20;
                        if (j != jArr[i17]) {
                            a = a2.a[i17] / (r6 - j);
                            f2 = Float.MAX_VALUE;
                        }
                    } else {
                        float f6 = 0.0f;
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < a2.d - 1) {
                            int i20 = i18 + i5;
                            int i21 = i20 % 20;
                            int i22 = (i20 + 1) % i10;
                            if (jArr[i22] != jArr[i21]) {
                                i19++;
                                float a3 = xz.a(f6);
                                f3 = f5;
                                float f7 = a2.a[i22];
                                long j3 = jArr[i22];
                                i6 = i18;
                                float f8 = f7 / (j3 - r20);
                                f6 += (f8 - a3) * Math.abs(f8);
                                if (i19 == 1) {
                                    f6 *= 0.5f;
                                }
                            } else {
                                f3 = f5;
                                i6 = i18;
                            }
                            i18 = i6 + 1;
                            f5 = f3;
                            i10 = 20;
                        }
                        f2 = f5;
                        a = xz.a(f6);
                    }
                    f4 = a * 1000.0f;
                    a2.c = f4;
                    if (f4 >= (-Math.abs(f2))) {
                        a2.c = -Math.abs(f2);
                    } else if (a2.c > Math.abs(f2)) {
                        a2.c = Math.abs(f2);
                    }
                }
            }
            f2 = Float.MAX_VALUE;
            a = 0.0f;
            f4 = a * 1000.0f;
            a2.c = f4;
            if (f4 >= (-Math.abs(f2))) {
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f = velocityTracker.getAxisVelocity(i7);
        } else {
            xz a4 = xy.a(velocityTracker);
            f = (a4 == null || i7 != 26) ? 0.0f : a4.c;
        }
        xe xeVar = this.b;
        float a5 = f * xeVar.a();
        float signum = Math.signum(a5);
        if (z || (signum != Math.signum(this.d) && signum != 0.0f)) {
            xeVar.b();
        }
        if (Math.abs(a5) >= iArr2[0]) {
            float max = Math.max(-r3, Math.min(a5, iArr2[1]));
            this.d = true == xeVar.c(max) ? max : 0.0f;
        }
    }
}
