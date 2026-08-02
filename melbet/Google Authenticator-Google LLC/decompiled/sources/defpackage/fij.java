package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fij extends Drawable.ConstantState {
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
    public fof t;
    public int u;
    public int v;
    public Rect w;
    public int[] x;
    public int y;

    public fij(fij fijVar) {
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
        this.x = FocusRingDrawable.a;
        this.y = Integer.MIN_VALUE;
        if (fijVar != null) {
            this.a = fijVar.a;
            this.b = fijVar.b;
            this.c = fijVar.c;
            this.d = fijVar.d;
            this.e = fijVar.e;
            this.f = fijVar.f;
            this.g = fijVar.g;
            this.h = fijVar.h;
            this.i = fijVar.i;
            this.j = fijVar.j;
            this.k = fijVar.k;
            this.l = fijVar.l;
            this.m = fijVar.m;
            this.n = fijVar.n;
            this.o = fijVar.o;
            this.p = fijVar.p;
            this.q = fijVar.q;
            this.r = fijVar.r;
            this.s = fijVar.s;
            this.u = fijVar.u;
            this.v = fijVar.v;
            fof fofVar = fijVar.t;
            if (fofVar instanceof fog) {
                this.t = new fog(new gbw((fog) fofVar));
            } else {
                this.t = fofVar instanceof foy ? new fox((foy) fofVar).a() : fofVar;
            }
            Rect rect = fijVar.w;
            if (rect != null) {
                this.w = new Rect(rect);
            }
            int[] iArr = fijVar.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
            this.y = fijVar.y;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, 0 == true ? 1 : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
