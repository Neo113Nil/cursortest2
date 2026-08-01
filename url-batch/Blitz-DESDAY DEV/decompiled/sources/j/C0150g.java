package j;

import M.AbstractC0011l;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.o;
import k.p;
import k.t;

/* renamed from: j.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2637A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2638B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0151h f2641E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2642a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2648j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2649k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2650l;

    /* renamed from: m, reason: collision with root package name */
    public int f2651m;

    /* renamed from: n, reason: collision with root package name */
    public char f2652n;

    /* renamed from: o, reason: collision with root package name */
    public int f2653o;

    /* renamed from: p, reason: collision with root package name */
    public char f2654p;

    /* renamed from: q, reason: collision with root package name */
    public int f2655q;

    /* renamed from: r, reason: collision with root package name */
    public int f2656r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2657s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2658t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2659u;

    /* renamed from: v, reason: collision with root package name */
    public int f2660v;

    /* renamed from: w, reason: collision with root package name */
    public int f2661w;

    /* renamed from: x, reason: collision with root package name */
    public String f2662x;

    /* renamed from: y, reason: collision with root package name */
    public String f2663y;

    /* renamed from: z, reason: collision with root package name */
    public p f2664z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2639C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2640D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2643b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2644c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2645e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2646f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2647g = true;

    public C0150g(C0151h c0151h, Menu menu) {
        this.f2641E = c0151h;
        this.f2642a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2641E.f2669c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2657s).setVisible(this.f2658t).setEnabled(this.f2659u).setCheckable(this.f2656r >= 1).setTitleCondensed(this.f2650l).setIcon(this.f2651m);
        int i = this.f2660v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2663y;
        C0151h c0151h = this.f2641E;
        if (str != null) {
            if (c0151h.f2669c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0151h.d == null) {
                c0151h.d = C0151h.a(c0151h.f2669c);
            }
            Object obj = c0151h.d;
            String str2 = this.f2663y;
            MenuItemOnMenuItemClickListenerC0149f menuItemOnMenuItemClickListenerC0149f = new MenuItemOnMenuItemClickListenerC0149f();
            menuItemOnMenuItemClickListenerC0149f.f2635a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0149f.f2636b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0149f.f2634c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0149f);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2656r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f2812x = (oVar.f2812x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                try {
                    Method method = tVar.d;
                    G.a aVar = tVar.f2823c;
                    if (method == null) {
                        tVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2662x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0151h.f2665e, c0151h.f2667a));
            z2 = true;
        }
        int i2 = this.f2661w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        p pVar = this.f2664z;
        if (pVar != null) {
            if (menuItem instanceof G.a) {
                ((G.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2637A;
        boolean z3 = menuItem instanceof G.a;
        if (z3) {
            ((G.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0011l.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2638B;
        if (z3) {
            ((G.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0011l.m(menuItem, charSequence2);
        }
        char c2 = this.f2652n;
        int i3 = this.f2653o;
        if (z3) {
            ((G.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0011l.g(menuItem, c2, i3);
        }
        char c3 = this.f2654p;
        int i4 = this.f2655q;
        if (z3) {
            ((G.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0011l.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2640D;
        if (mode != null) {
            if (z3) {
                ((G.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0011l.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2639C;
        if (colorStateList != null) {
            if (z3) {
                ((G.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0011l.i(menuItem, colorStateList);
            }
        }
    }
}
