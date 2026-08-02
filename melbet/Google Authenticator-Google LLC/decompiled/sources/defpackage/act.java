package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.os.Build;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class act extends acr {
    public acu t;
    private float u;
    private boolean v;

    public act(Object obj, acs acsVar) {
        super(obj, acsVar);
        this.t = null;
        this.u = Float.MAX_VALUE;
        this.v = false;
    }

    @Override // defpackage.acr
    public final void b() {
        if (!acf.a().b()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.n) {
            super.c(true);
        }
        float f = this.u;
        if (f != Float.MAX_VALUE) {
            acu acuVar = this.t;
            if (acuVar == null) {
                this.t = new acu(f);
            } else {
                acuVar.d(f);
            }
            this.u = Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    @Override // defpackage.acr
    public final void e() {
        float durationScale;
        acu acuVar = this.t;
        if (acuVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double a = acuVar.a();
        if (a > 3.4028234663852886E38d) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (a < -3.4028234663852886E38d) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.q * 0.75f);
        acuVar.c = abs;
        acuVar.d = abs * 62.5d;
        if (!acf.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.n;
        if (z || z) {
            return;
        }
        this.n = true;
        if (!this.k) {
            this.j = this.m.a(this.l);
        }
        float f = this.j;
        if (f > Float.MAX_VALUE || f < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        acf a2 = acf.a();
        ArrayList arrayList = a2.b;
        if (arrayList.size() == 0) {
            a2.g.d(a2.c);
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                a2.e = durationScale;
                if (a2.f == null) {
                    a2.f = new acd(a2);
                }
                final acd acdVar = a2.f;
                if (acdVar.a == null) {
                    acdVar.a = new ValueAnimator$DurationScaleChangeListener() { // from class: acc
                        public final void onChanged(float f2) {
                            ((acf) acd.this.b).e = f2;
                        }
                    };
                    ValueAnimator.registerDurationScaleChangeListener(acdVar.a);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    @Override // defpackage.acr
    public final boolean f(long j) {
        float f;
        boolean z = this.v;
        float f2 = this.u;
        if (z) {
            if (f2 != Float.MAX_VALUE) {
                this.t.d(f2);
                this.u = Float.MAX_VALUE;
            }
            this.j = this.t.a();
            this.i = 0.0f;
            this.v = false;
            return true;
        }
        acu acuVar = this.t;
        if (f2 != Float.MAX_VALUE) {
            long j2 = j / 2;
            aco b = acuVar.b(this.j, this.i, j2);
            this.t.d(this.u);
            this.u = Float.MAX_VALUE;
            aco b2 = this.t.b(b.a, b.b, j2);
            f = b2.a;
            this.j = f;
            this.i = b2.b;
        } else {
            aco b3 = acuVar.b(this.j, this.i, j);
            f = b3.a;
            this.j = f;
            this.i = b3.b;
        }
        float max = Math.max(f, -3.4028235E38f);
        this.j = max;
        this.j = Math.min(max, Float.MAX_VALUE);
        float f3 = this.i;
        acu acuVar2 = this.t;
        if (Math.abs(f3) >= acuVar2.d || Math.abs(r1 - acuVar2.a()) >= acuVar2.c) {
            return false;
        }
        this.j = this.t.a();
        this.i = 0.0f;
        return true;
    }

    public final void j(float f) {
        if (this.n) {
            this.u = f;
            return;
        }
        acu acuVar = this.t;
        if (acuVar == null) {
            acuVar = new acu(f);
            this.t = acuVar;
        }
        acuVar.d(f);
        e();
    }

    public final void k() {
        if (!l()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!acf.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.n) {
            this.v = true;
        }
    }

    public final boolean l() {
        return this.t.b > 0.0d;
    }
}
