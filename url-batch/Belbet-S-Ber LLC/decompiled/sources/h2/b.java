package h2;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;
import o2.c0;
import o2.m;
import o2.o;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public Drawable.ConstantState f1974a;

    /* renamed from: b, reason: collision with root package name */
    public int f1975b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1976c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1977e;

    /* renamed from: f, reason: collision with root package name */
    public int f1978f;

    /* renamed from: g, reason: collision with root package name */
    public int f1979g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public float f1980j;

    /* renamed from: k, reason: collision with root package name */
    public int f1981k;

    /* renamed from: l, reason: collision with root package name */
    public float f1982l;

    /* renamed from: m, reason: collision with root package name */
    public int f1983m;

    /* renamed from: n, reason: collision with root package name */
    public float f1984n;

    /* renamed from: o, reason: collision with root package name */
    public int f1985o;

    /* renamed from: p, reason: collision with root package name */
    public float f1986p;

    /* renamed from: q, reason: collision with root package name */
    public int f1987q;

    /* renamed from: r, reason: collision with root package name */
    public float f1988r;

    /* renamed from: s, reason: collision with root package name */
    public int f1989s;

    /* renamed from: t, reason: collision with root package name */
    public m f1990t;

    /* renamed from: u, reason: collision with root package name */
    public int f1991u;

    /* renamed from: v, reason: collision with root package name */
    public int f1992v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f1993w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f1994x;

    public b(b bVar) {
        this.f1975b = 0;
        this.f1976c = false;
        this.d = Integer.MIN_VALUE;
        this.f1977e = false;
        this.f1978f = Integer.MIN_VALUE;
        this.f1979g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.f1980j = Float.NaN;
        this.f1981k = Integer.MIN_VALUE;
        this.f1982l = Float.NaN;
        this.f1983m = Integer.MIN_VALUE;
        this.f1984n = Float.NaN;
        this.f1985o = Integer.MIN_VALUE;
        this.f1986p = Float.NaN;
        this.f1987q = Integer.MIN_VALUE;
        this.f1988r = Float.NaN;
        this.f1989s = Integer.MIN_VALUE;
        this.f1990t = null;
        this.f1991u = Integer.MIN_VALUE;
        this.f1992v = Integer.MIN_VALUE;
        this.f1993w = null;
        this.f1994x = FocusRingDrawable.f1153v;
        if (bVar != null) {
            this.f1974a = bVar.f1974a;
            this.f1975b = bVar.f1975b;
            this.f1976c = bVar.f1976c;
            this.d = bVar.d;
            this.f1977e = bVar.f1977e;
            this.f1978f = bVar.f1978f;
            this.f1979g = bVar.f1979g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.f1980j = bVar.f1980j;
            this.f1981k = bVar.f1981k;
            this.f1982l = bVar.f1982l;
            this.f1983m = bVar.f1983m;
            this.f1984n = bVar.f1984n;
            this.f1985o = bVar.f1985o;
            this.f1986p = bVar.f1986p;
            this.f1987q = bVar.f1987q;
            this.f1988r = bVar.f1988r;
            this.f1989s = bVar.f1989s;
            this.f1991u = bVar.f1991u;
            this.f1992v = bVar.f1992v;
            m mVar = bVar.f1990t;
            if (mVar instanceof o) {
                this.f1990t = ((o) mVar).k().a();
            } else if (mVar instanceof c0) {
                this.f1990t = ((c0) mVar).j().b();
            } else {
                this.f1990t = mVar;
            }
            if (bVar.f1993w != null) {
                this.f1993w = new Rect(bVar.f1993w);
            }
            int[] iArr = bVar.f1994x;
            this.f1994x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.f1974a;
        return (constantState != null ? constantState.getChangingConfigurations() : 0) | this.f1975b;
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
