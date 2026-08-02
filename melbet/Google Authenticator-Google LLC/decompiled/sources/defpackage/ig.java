package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ig extends ic {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public ig(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable mutate = drawable.mutate();
                this.c = mutate;
                if (this.f) {
                    mutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.ic
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.b;
        Context context = seekBar.getContext();
        int[] iArr = em.g;
        byo u = byo.u(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        yq.k(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) u.a, R.attr.seekBarStyle, 0);
        Drawable k = u.k(0);
        if (k != null) {
            seekBar.setThumb(k);
        }
        Drawable j = u.j(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = j;
        if (j != null) {
            j.setCallback(seekBar);
            j.setLayoutDirection(seekBar.getLayoutDirection());
            if (j.isStateful()) {
                j.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (u.p(3)) {
            int e = u.e(3, -1);
            PorterDuff.Mode mode = this.e;
            Rect rect = jl.a;
            this.e = a.q(e, mode);
            this.g = true;
        }
        if (u.p(2)) {
            this.d = u.i(2);
            this.f = true;
        }
        u.n();
        c();
    }
}
