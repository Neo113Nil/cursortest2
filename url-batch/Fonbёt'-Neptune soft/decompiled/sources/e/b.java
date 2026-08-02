package e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import n.C0270c;
import n.C0277j;

/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: A, reason: collision with root package name */
    public boolean f2117A;

    /* renamed from: B, reason: collision with root package name */
    public ColorFilter f2118B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2119C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f2120D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f2121E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2122F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2123G;

    /* renamed from: H, reason: collision with root package name */
    public int[][] f2124H;

    /* renamed from: I, reason: collision with root package name */
    public C0270c f2125I;
    public C0277j J;

    /* renamed from: a, reason: collision with root package name */
    public final e f2126a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f2127b;

    /* renamed from: c, reason: collision with root package name */
    public int f2128c;

    /* renamed from: d, reason: collision with root package name */
    public int f2129d;

    /* renamed from: e, reason: collision with root package name */
    public int f2130e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f2131f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f2132g;

    /* renamed from: h, reason: collision with root package name */
    public int f2133h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2134i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2135j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f2136k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2137l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2138m;

    /* renamed from: n, reason: collision with root package name */
    public int f2139n;

    /* renamed from: o, reason: collision with root package name */
    public int f2140o;

    /* renamed from: p, reason: collision with root package name */
    public int f2141p;

    /* renamed from: q, reason: collision with root package name */
    public int f2142q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2143r;

    /* renamed from: s, reason: collision with root package name */
    public int f2144s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2145t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2146u;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2147w;

    /* renamed from: x, reason: collision with root package name */
    public int f2148x;

    /* renamed from: y, reason: collision with root package name */
    public int f2149y;

    /* renamed from: z, reason: collision with root package name */
    public int f2150z;

    public b(b bVar, e eVar, Resources resources) {
        this.f2128c = 160;
        this.f2134i = false;
        this.f2137l = false;
        this.f2147w = true;
        this.f2149y = 0;
        this.f2150z = 0;
        this.f2126a = eVar;
        this.f2127b = resources != null ? resources : bVar != null ? bVar.f2127b : null;
        int i2 = bVar != null ? bVar.f2128c : 0;
        int i3 = f.f2162q;
        i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
        int i4 = i2 != 0 ? i2 : 160;
        this.f2128c = i4;
        if (bVar != null) {
            this.f2129d = bVar.f2129d;
            this.f2130e = bVar.f2130e;
            this.f2146u = true;
            this.v = true;
            this.f2134i = bVar.f2134i;
            this.f2137l = bVar.f2137l;
            this.f2147w = bVar.f2147w;
            this.f2148x = bVar.f2148x;
            this.f2149y = bVar.f2149y;
            this.f2150z = bVar.f2150z;
            this.f2117A = bVar.f2117A;
            this.f2118B = bVar.f2118B;
            this.f2119C = bVar.f2119C;
            this.f2120D = bVar.f2120D;
            this.f2121E = bVar.f2121E;
            this.f2122F = bVar.f2122F;
            this.f2123G = bVar.f2123G;
            if (bVar.f2128c == i4) {
                if (bVar.f2135j) {
                    this.f2136k = new Rect(bVar.f2136k);
                    this.f2135j = true;
                }
                if (bVar.f2138m) {
                    this.f2139n = bVar.f2139n;
                    this.f2140o = bVar.f2140o;
                    this.f2141p = bVar.f2141p;
                    this.f2142q = bVar.f2142q;
                    this.f2138m = true;
                }
            }
            if (bVar.f2143r) {
                this.f2144s = bVar.f2144s;
                this.f2143r = true;
            }
            if (bVar.f2145t) {
                this.f2145t = true;
            }
            Drawable[] drawableArr = bVar.f2132g;
            this.f2132g = new Drawable[drawableArr.length];
            this.f2133h = bVar.f2133h;
            SparseArray sparseArray = bVar.f2131f;
            if (sparseArray != null) {
                this.f2131f = sparseArray.clone();
            } else {
                this.f2131f = new SparseArray(this.f2133h);
            }
            int i5 = this.f2133h;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f2131f.put(i6, constantState);
                    } else {
                        this.f2132g[i6] = drawableArr[i6];
                    }
                }
            }
        } else {
            this.f2132g = new Drawable[10];
            this.f2133h = 0;
        }
        if (bVar != null) {
            this.f2124H = bVar.f2124H;
        } else {
            this.f2124H = new int[this.f2132g.length][];
        }
        if (bVar != null) {
            this.f2125I = bVar.f2125I;
            this.J = bVar.J;
        } else {
            this.f2125I = new C0270c();
            this.J = new C0277j();
        }
    }

    public final int a(Drawable drawable) {
        int i2 = this.f2133h;
        if (i2 >= this.f2132g.length) {
            int i3 = i2 + 10;
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.f2132g, 0, drawableArr, 0, i2);
            this.f2132g = drawableArr;
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f2124H, 0, iArr, 0, i2);
            this.f2124H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f2126a);
        this.f2132g[i2] = drawable;
        this.f2133h++;
        this.f2130e = drawable.getChangingConfigurations() | this.f2130e;
        this.f2143r = false;
        this.f2145t = false;
        this.f2136k = null;
        this.f2135j = false;
        this.f2138m = false;
        this.f2146u = false;
        return i2;
    }

    public final void b() {
        this.f2138m = true;
        c();
        int i2 = this.f2133h;
        Drawable[] drawableArr = this.f2132g;
        this.f2140o = -1;
        this.f2139n = -1;
        this.f2142q = 0;
        this.f2141p = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f2139n) {
                this.f2139n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f2140o) {
                this.f2140o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f2141p) {
                this.f2141p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f2142q) {
                this.f2142q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f2131f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.f2131f.keyAt(i2);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f2131f.valueAt(i2);
                Drawable[] drawableArr = this.f2132g;
                Drawable newDrawable = constantState.newDrawable(this.f2127b);
                if (Build.VERSION.SDK_INT >= 23) {
                    newDrawable.setLayoutDirection(this.f2148x);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f2126a);
                drawableArr[keyAt] = mutate;
            }
            this.f2131f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i2 = this.f2133h;
        Drawable[] drawableArr = this.f2132g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f2131f.get(i3);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i2) {
        int indexOfKey;
        Drawable drawable = this.f2132g[i2];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f2131f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f2131f.valueAt(indexOfKey)).newDrawable(this.f2127b);
        if (Build.VERSION.SDK_INT >= 23) {
            newDrawable.setLayoutDirection(this.f2148x);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f2126a);
        this.f2132g[i2] = mutate;
        this.f2131f.removeAt(indexOfKey);
        if (this.f2131f.size() == 0) {
            this.f2131f = null;
        }
        return mutate;
    }

    public final int e(int[] iArr) {
        int[][] iArr2 = this.f2124H;
        int i2 = this.f2133h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f2129d | this.f2130e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
