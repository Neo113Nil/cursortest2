package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class pt extends Drawable.ConstantState {
    public l20 a;
    public wg b;
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

    public pt(pt ptVar) {
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
        this.a = ptVar.a;
        this.b = ptVar.b;
        this.j = ptVar.j;
        this.c = ptVar.c;
        this.d = ptVar.d;
        this.f = ptVar.f;
        this.e = ptVar.e;
        this.k = ptVar.k;
        this.h = ptVar.h;
        this.o = ptVar.o;
        this.i = ptVar.i;
        this.l = ptVar.l;
        this.m = ptVar.m;
        this.n = ptVar.n;
        this.p = ptVar.p;
        if (ptVar.g != null) {
            this.g = new Rect(ptVar.g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        rt rtVar = new rt(this);
        rtVar.k = true;
        rtVar.l = true;
        return rtVar;
    }

    public pt(l20 l20Var) {
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
        this.a = l20Var;
        this.b = null;
    }
}
