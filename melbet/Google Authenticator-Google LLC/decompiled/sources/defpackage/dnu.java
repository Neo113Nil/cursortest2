package defpackage;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dnu extends Drawable {
    private static final String a = "dnu";
    public static final /* synthetic */ int c = 0;
    public Animator b;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;

    protected abstract Animator a(boolean z);

    protected abstract void b(ColorStateList colorStateList);

    protected abstract void c(PorterDuff.Mode mode);

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        Animator animator = this.b;
        if (animator != null) {
            animator.end();
            this.b = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean stateSetMatches = StateSet.stateSetMatches(dob.a, iArr);
        boolean z = this.f != stateSetMatches;
        if (z) {
            this.f = stateSetMatches;
            Animator animator = this.b;
            if (animator != null && animator.isRunning()) {
                this.b.cancel();
            }
            Animator a2 = a(stateSetMatches);
            this.b = a2;
            a2.addListener(new dnt(this));
            this.b.start();
        }
        return super.onStateChange(iArr) || z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Log.w(a, "setColorFilter() is not supported, use setTintList() and setTintMode() instead");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            b(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            c(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (visible) {
            jumpToCurrentState();
        }
        return visible;
    }
}
