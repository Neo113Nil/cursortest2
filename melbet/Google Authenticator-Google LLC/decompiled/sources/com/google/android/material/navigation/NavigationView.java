package com.google.android.material.navigation;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.NavigationMenuView;
import defpackage.aat;
import defpackage.abw;
import defpackage.abx;
import defpackage.adx;
import defpackage.byo;
import defpackage.fes;
import defpackage.fhq;
import defpackage.fhr;
import defpackage.fiz;
import defpackage.fjc;
import defpackage.fjh;
import defpackage.fjj;
import defpackage.fjp;
import defpackage.fjw;
import defpackage.fke;
import defpackage.fkn;
import defpackage.fko;
import defpackage.fkq;
import defpackage.fkr;
import defpackage.fks;
import defpackage.fkt;
import defpackage.fku;
import defpackage.fkv;
import defpackage.fkw;
import defpackage.fkx;
import defpackage.fm;
import defpackage.fmq;
import defpackage.fny;
import defpackage.fob;
import defpackage.fog;
import defpackage.fos;
import defpackage.fou;
import defpackage.fow;
import defpackage.frj;
import defpackage.gbw;
import defpackage.gp;
import defpackage.gu;
import defpackage.iyi;
import defpackage.mu;
import defpackage.mx;
import defpackage.yq;
import defpackage.zz;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationView extends fjp implements fke {
    private static final int[] o = {R.attr.state_checked};
    private static final int[] p = {-16842910};
    private final abw A;
    private final fku B;
    public final fjj g;
    public fkv h;
    public final int[] i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final iyi n;
    private final fiz q;
    private final int r;
    private MenuInflater s;
    private ViewTreeObserver.OnGlobalLayoutListener t;
    private int u;
    private final boolean v;
    private final int w;
    private final fos x;
    private fog y;
    private final fko z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, com.google.android.apps.authenticator2.R.style.Widget_Design_NavigationView), attributeSet, i);
        int i2;
        int d;
        fjj fjjVar = new fjj();
        this.g = fjjVar;
        this.i = new int[2];
        this.j = true;
        this.k = true;
        this.l = true;
        this.m = true;
        this.u = 0;
        this.x = Build.VERSION.SDK_INT >= 33 ? new fow(this) : new fou(this);
        this.z = new fko(this);
        this.n = new iyi(this);
        this.A = new fks(this);
        this.B = new fku(this);
        Context context2 = getContext();
        fiz fizVar = new fiz(context2);
        this.q = fizVar;
        byo c = fjw.c(context2, attributeSet, fkx.a, i, com.google.android.apps.authenticator2.R.style.Widget_Design_NavigationView, new int[0]);
        if (c.p(1)) {
            setBackground(c.j(1));
        }
        int d2 = c.d(7, 0);
        this.u = d2;
        this.v = d2 == 0;
        this.w = getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList b = fhr.b(background);
        if (background == null || b != null) {
            fob fobVar = new fob(new fog(fog.k(context2, attributeSet, i, com.google.android.apps.authenticator2.R.style.Widget_Design_NavigationView)));
            if (b != null) {
                fobVar.M(b);
            }
            fobVar.J(context2);
            setBackground(fobVar);
        }
        if (c.p(8)) {
            setElevation(c.d(8, 0));
        }
        setFitsSystemWindows(c.o(2, false));
        this.r = c.d(3, 0);
        ColorStateList i3 = c.p(33) ? c.i(33) : null;
        int h = c.p(36) ? c.h(36, 0) : 0;
        if (h == 0) {
            i3 = i3 == null ? c(R.attr.textColorSecondary) : i3;
            h = 0;
        }
        ColorStateList i4 = c.p(15) ? c.i(15) : c(R.attr.textColorSecondary);
        int h2 = c.p(25) ? c.h(25, 0) : 0;
        boolean o2 = c.o(26, true);
        if (c.p(14) && fjjVar.r != (d = c.d(14, 0))) {
            fjjVar.r = d;
            fjjVar.w = true;
            fjjVar.p();
        }
        ColorStateList i5 = c.p(27) ? c.i(27) : null;
        if (h2 == 0) {
            i5 = i5 == null ? c(R.attr.textColorPrimary) : i5;
            h2 = 0;
        }
        Drawable j = c.j(11);
        if (j == null && (c.p(18) || c.p(19))) {
            j = f(c, fny.r(getContext(), c, 20));
            ColorStateList r = fny.r(context2, c, 17);
            if (r != null) {
                RippleDrawable rippleDrawable = new RippleDrawable(fmq.b(r), null, f(c, null));
                FocusRingDrawable a = FocusRingDrawable.a(context2, rippleDrawable, null);
                if (a != null) {
                    a.c.t = this.y;
                }
                fjjVar.n = rippleDrawable;
                fjjVar.p();
            }
        }
        if (c.p(12)) {
            i2 = 0;
            fjjVar.o = c.d(12, 0);
            fjjVar.p();
        } else {
            i2 = 0;
        }
        if (c.p(28)) {
            fjjVar.p = c.d(28, i2);
            fjjVar.p();
        }
        fjjVar.s = c.d(6, i2);
        fjjVar.m();
        fjjVar.t = c.d(5, i2);
        fjjVar.m();
        fjjVar.u = c.d(35, i2);
        fjjVar.o();
        fjjVar.v = c.d(34, i2);
        fjjVar.o();
        this.j = c.o(37, this.j);
        this.k = c.o(4, this.k);
        this.l = c.o(32, this.l);
        this.m = c.o(9, this.m);
        int d3 = c.d(13, 0);
        fjjVar.y = c.e(16, 1);
        fjjVar.p();
        fizVar.b = new fkt(this);
        fjjVar.d = 1;
        fjjVar.c(context2, fizVar);
        if (h != 0) {
            fjjVar.g = h;
            fjjVar.o();
        }
        fjjVar.h = i3;
        fjjVar.o();
        fjjVar.l = i4;
        fjjVar.p();
        fjjVar.k(getOverScrollMode());
        if (h2 != 0) {
            fjjVar.i = h2;
            fjjVar.p();
        }
        fjjVar.j = o2;
        fjjVar.p();
        fjjVar.k = i5;
        fjjVar.p();
        fjjVar.m = j;
        fjjVar.p();
        fjjVar.q = d3;
        fjjVar.p();
        fizVar.g(fjjVar);
        if (fjjVar.a == null) {
            fjjVar.a = (NavigationMenuView) fjjVar.f.inflate(com.google.android.apps.authenticator2.R.layout.design_navigation_menu, (ViewGroup) this, false);
            fjjVar.a.W(new fjh(fjjVar, fjjVar.a));
            if (fjjVar.e == null) {
                fjjVar.e = new fjc(fjjVar);
                fjjVar.e.o(true);
            }
            int i6 = fjjVar.B;
            if (i6 != -1) {
                fjjVar.a.setOverScrollMode(i6);
            }
            fjjVar.b = (LinearLayout) fjjVar.f.inflate(com.google.android.apps.authenticator2.R.layout.design_navigation_item_header, (ViewGroup) fjjVar.a, false);
            fjjVar.b.setImportantForAccessibility(2);
            fjjVar.a.X(fjjVar.e);
        }
        addView(fjjVar.a);
        ?? r9 = 0;
        if (c.p(29)) {
            int h3 = c.h(29, 0);
            fjjVar.l(true);
            if (this.s == null) {
                this.s = new fm(getContext());
            }
            this.s.inflate(h3, fizVar);
            r9 = 0;
            fjjVar.l(false);
            fjjVar.j();
        }
        if (c.p(10)) {
            fjjVar.b.addView(fjjVar.f.inflate(c.h(10, r9), fjjVar.b, (boolean) r9));
            NavigationMenuView navigationMenuView = fjjVar.a;
            navigationMenuView.setPadding(r9, r9, r9, navigationMenuView.getPaddingBottom());
        }
        c.n();
        this.t = new gu(this, 6);
        getViewTreeObserver().addOnGlobalLayoutListener(this.t);
    }

    private final ColorStateList c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList d = aat.d(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.google.android.apps.authenticator2.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = d.getDefaultColor();
        int[] iArr = p;
        return new ColorStateList(new int[][]{iArr, o, EMPTY_STATE_SET}, new int[]{d.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private final Pair d() {
        ViewParent parent = getParent();
        boolean z = parent instanceof DrawerLayout;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (z && (layoutParams instanceof abx)) {
            return new Pair((DrawerLayout) parent, (abx) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private final void e(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof abx)) {
            if ((this.u > 0 || this.v) && (getBackground() instanceof fob)) {
                int absoluteGravity = Gravity.getAbsoluteGravity(((abx) getLayoutParams()).a, getLayoutDirection());
                fob fobVar = (fob) getBackground();
                gbw gbwVar = new gbw(fobVar.F());
                gbwVar.k(this.u);
                if (absoluteGravity == 3) {
                    gbwVar.i(0.0f);
                    gbwVar.g(0.0f);
                } else {
                    gbwVar.j(0.0f);
                    gbwVar.h(0.0f);
                }
                fog fogVar = new fog(gbwVar);
                fobVar.bz(fogVar);
                fos fosVar = this.x;
                fosVar.b = fogVar;
                fosVar.b();
                fosVar.a(this);
                fosVar.c = new RectF(0.0f, 0.0f, i, i2);
                fosVar.b();
                fosVar.a(this);
                fosVar.a = true;
                fosVar.a(this);
            }
        }
    }

    private final Drawable f(byo byoVar, ColorStateList colorStateList) {
        int[] iArr = fkx.a;
        this.y = new fog(fog.j(getContext(), byoVar.h(18, 0), byoVar.h(19, 0)));
        fob fobVar = new fob(this.y);
        fobVar.M(colorStateList);
        return new InsetDrawable((Drawable) fobVar, byoVar.d(23, 0), byoVar.d(24, 0), byoVar.d(22, 0), byoVar.d(21, 0));
    }

    @Override // defpackage.fke
    public final void M() {
        d();
        this.z.e();
        b();
    }

    @Override // defpackage.fke
    public final void O() {
        int i;
        Pair d = d();
        DrawerLayout drawerLayout = (DrawerLayout) d.first;
        fko fkoVar = this.z;
        mx c = fkoVar.c();
        if (c == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.i(this, true);
            return;
        }
        int i2 = ((abx) d.second).a;
        int i3 = fkr.a;
        fkq fkqVar = new fkq(drawerLayout, this);
        mu muVar = new mu(drawerLayout, 10, null);
        boolean h = fkoVar.h(i2);
        View view = fkoVar.a;
        float width = view.getWidth() * view.getScaleX();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i = h ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i = 0;
        }
        float f = width + i;
        Property property = View.TRANSLATION_X;
        if (h) {
            f = -f;
        }
        boolean z = c.c == 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        ofFloat.addUpdateListener(muVar);
        ofFloat.setInterpolator(new adx());
        ofFloat.setDuration(fes.b(fkoVar.b, fkoVar.c, c.b));
        ofFloat.addListener(new fkn(fkoVar, z, i2));
        ofFloat.addListener(fkqVar);
        ofFloat.start();
    }

    @Override // defpackage.fke
    public final void T(mx mxVar) {
        d();
        this.z.e = mxVar;
    }

    @Override // defpackage.fke
    public final void V(mx mxVar) {
        int i = ((abx) d().second).a;
        fko fkoVar = this.z;
        fkoVar.f(mxVar, i);
        if (this.v) {
            this.u = fes.b(0, this.w, fkoVar.a(mxVar.b));
            e(getWidth(), getHeight());
        }
    }

    @Override // defpackage.fjp
    public final void a(zz zzVar) {
        fjj fjjVar = this.g;
        int d = zzVar.d();
        if (fjjVar.z != d) {
            fjjVar.z = d;
            fjjVar.q();
        }
        NavigationMenuView navigationMenuView = fjjVar.a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, zzVar.a());
        yq.q(fjjVar.b, zzVar);
    }

    public final void b() {
        if (!this.v || this.u == 0) {
            return;
        }
        this.u = 0;
        e(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        fos fosVar = this.x;
        if (fosVar.c()) {
            Path path = fosVar.d;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // defpackage.fjp, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fhq.x(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            fku fkuVar = this.B;
            fkuVar.d();
            drawerLayout.k(fkuVar);
            drawerLayout.h(fkuVar);
            iyi iyiVar = this.n;
            if (iyiVar.c != null) {
                abw abwVar = this.A;
                drawerLayout.k(abwVar);
                drawerLayout.h(abwVar);
                if (drawerLayout.r(this)) {
                    iyiVar.p(true);
                }
            }
        }
    }

    @Override // defpackage.fjp, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.t);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.k(this.A);
            drawerLayout.k(this.B);
        }
        this.n.q();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.r), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.r, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof fkw)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fkw fkwVar = (fkw) parcelable;
        super.onRestoreInstanceState(fkwVar.d);
        fiz fizVar = this.q;
        SparseArray sparseParcelableArray = fkwVar.a.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = fizVar.i;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                gp gpVar = (gp) weakReference.get();
                if (gpVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int a = gpVar.a();
                    if (a > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(a)) != null) {
                        gpVar.n(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable bh;
        fkw fkwVar = new fkw(super.onSaveInstanceState());
        fkwVar.a = new Bundle();
        Bundle bundle = fkwVar.a;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q.i;
        if (copyOnWriteArrayList.isEmpty()) {
            return fkwVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            gp gpVar = (gp) weakReference.get();
            if (gpVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int a = gpVar.a();
                if (a > 0 && (bh = gpVar.bh()) != null) {
                    sparseArray.put(a, bh);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return fkwVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        fhq.w(this, f);
    }

    @Override // android.view.View
    public final void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        fjj fjjVar = this.g;
        if (fjjVar != null) {
            fjjVar.k(i);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.navigationViewStyle);
    }

    public NavigationView(Context context) {
        this(context, null);
    }
}
