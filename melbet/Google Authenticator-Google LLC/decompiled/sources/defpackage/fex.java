package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fex {
    public int a = 0;
    public int b = 1;
    private final long c;
    private final long d;
    private final TimeInterpolator e;

    public fex(long j, long j2, TimeInterpolator timeInterpolator) {
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.e;
        return timeInterpolator != null ? timeInterpolator : fes.b;
    }

    public final void b(Animator animator) {
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.a);
            valueAnimator.setRepeatMode(this.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fex)) {
            return false;
        }
        fex fexVar = (fex) obj;
        if (this.c == fexVar.c && this.d == fexVar.d && this.a == fexVar.a && this.b == fexVar.b) {
            return a().getClass().equals(fexVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = a().getClass().hashCode();
        long j = this.d;
        long j2 = this.c;
        return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + hashCode) * 31) + this.a) * 31) + this.b;
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.c + " duration: " + this.d + " interpolator: " + a().getClass() + " repeatCount: " + this.a + " repeatMode: " + this.b + "}\n";
    }
}
