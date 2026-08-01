package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class e10 extends Drawable.ConstantState {
    public ed0 a;
    public tl b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public Rect g;
    public final float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public final Paint.Style p;

    public e10(e10 e10Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.a = e10Var.a;
        this.b = e10Var.b;
        this.j = e10Var.j;
        this.c = e10Var.c;
        this.d = e10Var.d;
        this.f = e10Var.f;
        this.e = e10Var.e;
        this.k = e10Var.k;
        this.h = e10Var.h;
        this.o = e10Var.o;
        this.i = e10Var.i;
        this.l = e10Var.l;
        this.m = e10Var.m;
        this.n = e10Var.n;
        this.p = e10Var.p;
        if (e10Var.g != null) {
            this.g = new Rect(e10Var.g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g10 g10Var = new g10(this);
        g10Var.k = true;
        g10Var.l = true;
        return g10Var;
    }

    public e10(ed0 ed0Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.a = ed0Var;
        this.b = null;
    }
}
