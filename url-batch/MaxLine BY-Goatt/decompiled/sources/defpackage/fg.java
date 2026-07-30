package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fg extends t21 {
    public final eg q;
    public Drawable r;
    public ColorStateList s;
    public PorterDuff.Mode t;
    public boolean u;
    public boolean v;

    public fg(eg egVar) {
        super((AbsSeekBar) egVar);
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = false;
        this.q = egVar;
    }

    @Override // defpackage.t21
    public final void B(AttributeSet attributeSet, int i) {
        super.B(attributeSet, R.attr.seekBarStyle);
        eg egVar = this.q;
        Context context = egVar.getContext();
        int[] iArr = b62.g;
        mh z = mh.z(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) z.n;
        e53.h(egVar, egVar.getContext(), iArr, attributeSet, (TypedArray) z.n, R.attr.seekBarStyle);
        Drawable r = z.r(0);
        if (r != null) {
            egVar.setThumb(r);
        }
        Drawable q = z.q(1);
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.r = q;
        if (q != null) {
            q.setCallback(egVar);
            q.setLayoutDirection(egVar.getLayoutDirection());
            if (q.isStateful()) {
                q.setState(egVar.getDrawableState());
            }
            L();
        }
        egVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.t = he0.b(typedArray.getInt(3, -1), this.t);
            this.v = true;
        }
        if (typedArray.hasValue(2)) {
            this.s = z.p(2);
            this.u = true;
        }
        z.B();
        L();
    }

    public final void L() {
        Drawable drawable = this.r;
        if (drawable != null) {
            if (this.u || this.v) {
                Drawable mutate = drawable.mutate();
                this.r = mutate;
                if (this.u) {
                    mutate.setTintList(this.s);
                }
                if (this.v) {
                    this.r.setTintMode(this.t);
                }
                if (this.r.isStateful()) {
                    this.r.setState(this.q.getDrawableState());
                }
            }
        }
    }

    public final void M(Canvas canvas) {
        if (this.r != null) {
            int max = this.q.getMax();
            if (max > 1) {
                int intrinsicWidth = this.r.getIntrinsicWidth();
                int intrinsicHeight = this.r.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.r.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.r.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
