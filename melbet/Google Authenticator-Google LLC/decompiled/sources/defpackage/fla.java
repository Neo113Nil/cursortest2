package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class fla extends ProgressBar {
    public final flb a;
    public int b;
    public final int c;
    public boolean d;
    public final int e;
    public boolean f;
    public final Runnable g;
    public final Runnable h;
    private final boolean i;
    private final aqc j;
    private final aqc k;

    protected fla(Context context, AttributeSet attributeSet, int i, int i2) {
        super(frj.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.d = false;
        this.e = 4;
        this.g = new evp(this, 14, null);
        this.h = new evp(this, 15, null);
        this.j = new fky(this);
        this.k = new fkz(this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray a = fjw.a(context2, attributeSet, fmh.a, i, i2, new int[0]);
        a.getInt(7, -1);
        this.c = Math.min(a.getInt(5, -1), 1000);
        a.recycle();
        this.i = true;
    }

    private final flv h() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().a;
        }
        if (getProgressDrawable() != null) {
            return getProgressDrawable().a;
        }
        return null;
    }

    public abstract flb a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final flp getProgressDrawable() {
        return (flp) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final flx getIndeterminateDrawable() {
        return (flx) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (this.i) {
            ((flt) getCurrentDrawable()).l(f(), false, z);
        }
    }

    public final void e() {
        if (this.c > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    final boolean f() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public void g(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.d = true;
            if (!getIndeterminateDrawable().isVisible() || fny.o(getContext().getContentResolver()) == 0.0f) {
                this.j.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().b.d();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.c(this.j);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().h(this.k);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().h(this.k);
        }
        if (f()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.h);
        removeCallbacks(this.g);
        ((flt) getCurrentDrawable()).l(false, false, false);
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().n(this.k);
            getIndeterminateDrawable().b.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().n(this.k);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        flv h = h();
        if (h == null) {
            return;
        }
        setMeasuredDimension(h.b() < 0 ? getDefaultSize(getSuggestedMinimumWidth(), i) : h.b() + getPaddingLeft() + getPaddingRight(), h.a() < 0 ? getDefaultSize(getSuggestedMinimumHeight(), i2) : h.a() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((flt) currentDrawable).l(false, false, false);
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((flt) currentDrawable2).l(f(), false, false);
        }
        if ((currentDrawable2 instanceof flx) && f()) {
            ((flx) currentDrawable2).b.f();
        }
        this.d = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof flx) {
            ((flt) drawable).l(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.f) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        g(i);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof flp)) {
            if (this.f) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            flp flpVar = (flp) drawable;
            flpVar.l(false, false, false);
            super.setProgressDrawable(flpVar);
            flpVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }
}
