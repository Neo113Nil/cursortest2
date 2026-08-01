package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xo extends Drawable.ConstantState {
    public Drawable.ConstantState a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public ed0 t;
    public int u;
    public int v;
    public final Rect w;
    public int[] x;

    public xo(xo xoVar) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.v;
        if (xoVar != null) {
            this.a = xoVar.a;
            this.b = xoVar.b;
            this.c = xoVar.c;
            this.d = xoVar.d;
            this.e = xoVar.e;
            this.f = xoVar.f;
            this.g = xoVar.g;
            this.h = xoVar.h;
            this.i = xoVar.i;
            this.j = xoVar.j;
            this.k = xoVar.k;
            this.l = xoVar.l;
            this.m = xoVar.m;
            this.n = xoVar.n;
            this.o = xoVar.o;
            this.p = xoVar.p;
            this.q = xoVar.q;
            this.r = xoVar.r;
            this.s = xoVar.s;
            this.u = xoVar.u;
            this.v = xoVar.v;
            ed0 ed0Var = xoVar.t;
            if (ed0Var instanceof gd0) {
                this.t = ((gd0) ed0Var).k().a();
            } else if (ed0Var instanceof gf0) {
                this.t = ((gf0) ed0Var).j().c();
            } else {
                this.t = ed0Var;
            }
            if (xoVar.w != null) {
                this.w = new Rect(xoVar.w);
            }
            int[] iArr = xoVar.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
