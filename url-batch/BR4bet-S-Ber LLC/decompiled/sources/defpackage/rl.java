package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class rl extends Drawable.ConstantState {
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
    public d50 t;
    public int u;
    public int v;
    public final Rect w;
    public int[] x;

    public rl(rl rlVar) {
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
        if (rlVar != null) {
            this.a = rlVar.a;
            this.b = rlVar.b;
            this.c = rlVar.c;
            this.d = rlVar.d;
            this.e = rlVar.e;
            this.f = rlVar.f;
            this.g = rlVar.g;
            this.h = rlVar.h;
            this.i = rlVar.i;
            this.j = rlVar.j;
            this.k = rlVar.k;
            this.l = rlVar.l;
            this.m = rlVar.m;
            this.n = rlVar.n;
            this.o = rlVar.o;
            this.p = rlVar.p;
            this.q = rlVar.q;
            this.r = rlVar.r;
            this.s = rlVar.s;
            this.u = rlVar.u;
            this.v = rlVar.v;
            d50 d50Var = rlVar.t;
            if (d50Var instanceof f50) {
                this.t = ((f50) d50Var).k().a();
            } else if (d50Var instanceof a70) {
                this.t = ((a70) d50Var).j().c();
            } else {
                this.t = d50Var;
            }
            if (rlVar.w != null) {
                this.w = new Rect(rlVar.w);
            }
            int[] iArr = rlVar.x;
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
