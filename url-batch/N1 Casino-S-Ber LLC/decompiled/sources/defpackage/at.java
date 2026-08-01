package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class at extends Drawable.ConstantState {
    public b20 a;
    public eh b;
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

    public at(at atVar) {
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
        this.a = atVar.a;
        this.b = atVar.b;
        this.j = atVar.j;
        this.c = atVar.c;
        this.d = atVar.d;
        this.f = atVar.f;
        this.e = atVar.e;
        this.k = atVar.k;
        this.h = atVar.h;
        this.o = atVar.o;
        this.i = atVar.i;
        this.l = atVar.l;
        this.m = atVar.m;
        this.n = atVar.n;
        this.p = atVar.p;
        if (atVar.g != null) {
            this.g = new Rect(atVar.g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        ct ctVar = new ct(this);
        ctVar.k = true;
        ctVar.l = true;
        return ctVar;
    }

    public at(b20 b20Var) {
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
        this.a = b20Var;
        this.b = null;
    }
}
