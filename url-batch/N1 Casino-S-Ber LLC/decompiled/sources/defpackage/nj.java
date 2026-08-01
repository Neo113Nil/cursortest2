package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class nj extends Drawable.ConstantState {
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
    public b20 t;
    public int u;
    public int v;
    public final Rect w;
    public int[] x;

    public nj(nj njVar) {
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
        if (njVar != null) {
            this.a = njVar.a;
            this.b = njVar.b;
            this.c = njVar.c;
            this.d = njVar.d;
            this.e = njVar.e;
            this.f = njVar.f;
            this.g = njVar.g;
            this.h = njVar.h;
            this.i = njVar.i;
            this.j = njVar.j;
            this.k = njVar.k;
            this.l = njVar.l;
            this.m = njVar.m;
            this.n = njVar.n;
            this.o = njVar.o;
            this.p = njVar.p;
            this.q = njVar.q;
            this.r = njVar.r;
            this.s = njVar.s;
            this.u = njVar.u;
            this.v = njVar.v;
            b20 b20Var = njVar.t;
            if (b20Var instanceof d20) {
                this.t = ((d20) b20Var).k().a();
            } else if (b20Var instanceof x30) {
                this.t = ((x30) b20Var).j().c();
            } else {
                this.t = b20Var;
            }
            if (njVar.w != null) {
                this.w = new Rect(njVar.w);
            }
            int[] iArr = njVar.x;
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
