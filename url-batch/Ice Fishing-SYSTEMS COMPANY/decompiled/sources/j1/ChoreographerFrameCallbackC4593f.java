package j1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: j1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC4593f extends ValueAnimator implements Choreographer.FrameCallback {

    /* renamed from: E, reason: collision with root package name */
    public X0.i f38494E;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f38497n = new CopyOnWriteArraySet();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArraySet f38498u = new CopyOnWriteArraySet();

    /* renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArraySet f38499v = new CopyOnWriteArraySet();

    /* renamed from: w, reason: collision with root package name */
    public float f38500w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f38501x = false;

    /* renamed from: y, reason: collision with root package name */
    public long f38502y = 0;

    /* renamed from: z, reason: collision with root package name */
    public float f38503z = 0.0f;

    /* renamed from: A, reason: collision with root package name */
    public float f38490A = 0.0f;

    /* renamed from: B, reason: collision with root package name */
    public int f38491B = 0;

    /* renamed from: C, reason: collision with root package name */
    public float f38492C = -2.1474836E9f;

    /* renamed from: D, reason: collision with root package name */
    public float f38493D = 2.1474836E9f;

    /* renamed from: F, reason: collision with root package name */
    public boolean f38495F = false;

    /* renamed from: G, reason: collision with root package name */
    public boolean f38496G = false;

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f38498u.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f38499v.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38497n.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f38498u.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        l(k());
        n(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j9) {
        boolean z8 = false;
        if (this.f38495F) {
            n(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        X0.i iVar = this.f38494E;
        if (iVar == null || !this.f38495F) {
            return;
        }
        float abs = (this.f38502y != 0 ? j9 - r2 : 0L) / ((1.0E9f / iVar.f3681n) / Math.abs(this.f38500w));
        float f6 = this.f38503z;
        if (k()) {
            abs = -abs;
        }
        float f9 = f6 + abs;
        float j10 = j();
        float i = i();
        PointF pointF = h.f38505a;
        if (f9 >= j10 && f9 <= i) {
            z8 = true;
        }
        float f10 = this.f38503z;
        float b9 = h.b(f9, j(), i());
        this.f38503z = b9;
        if (this.f38496G) {
            b9 = (float) Math.floor(b9);
        }
        this.f38490A = b9;
        this.f38502y = j9;
        if (z8) {
            if (!this.f38496G || this.f38503z != f10) {
                m();
            }
        } else if (getRepeatCount() == -1 || this.f38491B < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f38501x = !this.f38501x;
                this.f38500w = -this.f38500w;
            } else {
                float i4 = k() ? i() : j();
                this.f38503z = i4;
                this.f38490A = i4;
            }
            this.f38502y = j9;
            if (!this.f38496G || this.f38503z != f10) {
                m();
            }
            Iterator it = this.f38498u.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f38491B++;
        } else {
            float j11 = this.f38500w < 0.0f ? j() : i();
            this.f38503z = j11;
            this.f38490A = j11;
            n(true);
            if (!this.f38496G || this.f38503z != f10) {
                m();
            }
            l(k());
        }
        if (this.f38494E == null) {
            return;
        }
        float f11 = this.f38490A;
        if (f11 < this.f38492C || f11 > this.f38493D) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f38492C), Float.valueOf(this.f38493D), Float.valueOf(this.f38490A)));
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float j9;
        float i;
        float j10;
        if (this.f38494E == null) {
            return 0.0f;
        }
        if (k()) {
            j9 = i() - this.f38490A;
            i = i();
            j10 = j();
        } else {
            j9 = this.f38490A - j();
            i = i();
            j10 = j();
        }
        return j9 / (i - j10);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        X0.i iVar = this.f38494E;
        if (iVar == null) {
            return 0L;
        }
        return (long) iVar.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final float h() {
        X0.i iVar = this.f38494E;
        if (iVar == null) {
            return 0.0f;
        }
        float f6 = this.f38490A;
        float f9 = iVar.f3679l;
        return (f6 - f9) / (iVar.f3680m - f9);
    }

    public final float i() {
        X0.i iVar = this.f38494E;
        if (iVar == null) {
            return 0.0f;
        }
        float f6 = this.f38493D;
        return f6 == 2.1474836E9f ? iVar.f3680m : f6;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f38495F;
    }

    public final float j() {
        X0.i iVar = this.f38494E;
        if (iVar == null) {
            return 0.0f;
        }
        float f6 = this.f38492C;
        return f6 == -2.1474836E9f ? iVar.f3679l : f6;
    }

    public final boolean k() {
        return this.f38500w < 0.0f;
    }

    public final void l(boolean z8) {
        Iterator it = this.f38498u.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z8);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void m() {
        Iterator it = this.f38497n.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void n(boolean z8) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z8) {
            this.f38495F = false;
        }
    }

    public final void o(float f6) {
        if (this.f38503z == f6) {
            return;
        }
        float b9 = h.b(f6, j(), i());
        this.f38503z = b9;
        if (this.f38496G) {
            b9 = (float) Math.floor(b9);
        }
        this.f38490A = b9;
        this.f38502y = 0L;
        m();
    }

    public final void p(float f6, float f9) {
        if (f6 > f9) {
            throw new IllegalArgumentException("minFrame (" + f6 + ") must be <= maxFrame (" + f9 + ")");
        }
        X0.i iVar = this.f38494E;
        float f10 = iVar == null ? -3.4028235E38f : iVar.f3679l;
        float f11 = iVar == null ? Float.MAX_VALUE : iVar.f3680m;
        float b9 = h.b(f6, f10, f11);
        float b10 = h.b(f9, f10, f11);
        if (b9 == this.f38492C && b10 == this.f38493D) {
            return;
        }
        this.f38492C = b9;
        this.f38493D = b10;
        o((int) h.b(this.f38490A, b9, b10));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f38498u.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f38497n.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f38498u.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f38499v.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38497n.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j9) {
        setDuration(j9);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f38501x) {
            return;
        }
        this.f38501x = false;
        this.f38500w = -this.f38500w;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j9) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j9) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
