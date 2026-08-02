package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fnz extends Drawable.ConstantState {
    public fof a;
    public fhs b;
    ColorFilter c;
    ColorStateList d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    PorterDuff.Mode h;
    public Rect i;
    float j;
    public float k;
    float l;
    int m;
    float n;
    float o;
    float p;
    int q;
    int r;
    int s;
    int t;
    boolean u;
    Paint.Style v;

    public fnz(fnz fnzVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = fnzVar.a;
        this.b = fnzVar.b;
        this.l = fnzVar.l;
        this.c = fnzVar.c;
        this.d = fnzVar.d;
        this.e = fnzVar.e;
        this.h = fnzVar.h;
        this.g = fnzVar.g;
        this.m = fnzVar.m;
        this.j = fnzVar.j;
        this.s = fnzVar.s;
        this.q = fnzVar.q;
        boolean z = fnzVar.u;
        this.u = false;
        this.k = fnzVar.k;
        this.n = fnzVar.n;
        this.o = fnzVar.o;
        float f = fnzVar.p;
        this.p = 0.0f;
        this.r = fnzVar.r;
        this.t = fnzVar.t;
        ColorStateList colorStateList = fnzVar.f;
        this.f = null;
        this.v = fnzVar.v;
        Rect rect = fnzVar.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        fob fobVar = new fob(this);
        fobVar.t = true;
        fobVar.u = true;
        return fobVar;
    }

    public fnz(fof fofVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = fofVar;
        this.b = null;
    }
}
