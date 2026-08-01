package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class bw extends Drawable.ConstantState {
    public d50 a;
    public fj b;
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

    public bw(bw bwVar) {
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
        this.a = bwVar.a;
        this.b = bwVar.b;
        this.j = bwVar.j;
        this.c = bwVar.c;
        this.d = bwVar.d;
        this.f = bwVar.f;
        this.e = bwVar.e;
        this.k = bwVar.k;
        this.h = bwVar.h;
        this.o = bwVar.o;
        this.i = bwVar.i;
        this.l = bwVar.l;
        this.m = bwVar.m;
        this.n = bwVar.n;
        this.p = bwVar.p;
        if (bwVar.g != null) {
            this.g = new Rect(bwVar.g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        dw dwVar = new dw(this);
        dwVar.k = true;
        dwVar.l = true;
        return dwVar;
    }

    public bw(d50 d50Var) {
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
        this.a = d50Var;
        this.b = null;
    }
}
