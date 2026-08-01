package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ij extends Drawable.ConstantState {
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
    public l20 t;
    public int u;
    public int v;
    public final Rect w;
    public int[] x;

    public ij(ij ijVar) {
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
        if (ijVar != null) {
            this.a = ijVar.a;
            this.b = ijVar.b;
            this.c = ijVar.c;
            this.d = ijVar.d;
            this.e = ijVar.e;
            this.f = ijVar.f;
            this.g = ijVar.g;
            this.h = ijVar.h;
            this.i = ijVar.i;
            this.j = ijVar.j;
            this.k = ijVar.k;
            this.l = ijVar.l;
            this.m = ijVar.m;
            this.n = ijVar.n;
            this.o = ijVar.o;
            this.p = ijVar.p;
            this.q = ijVar.q;
            this.r = ijVar.r;
            this.s = ijVar.s;
            this.u = ijVar.u;
            this.v = ijVar.v;
            l20 l20Var = ijVar.t;
            if (l20Var instanceof n20) {
                this.t = ((n20) l20Var).k().a();
            } else if (l20Var instanceof g40) {
                this.t = ((g40) l20Var).j().c();
            } else {
                this.t = l20Var;
            }
            if (ijVar.w != null) {
                this.w = new Rect(ijVar.w);
            }
            int[] iArr = ijVar.x;
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
