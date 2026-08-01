package j;

import K.AbstractC0013m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.ActionProviderVisibilityListenerC0160p;
import k.C0159o;
import k.MenuItemC0164t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2561A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2562B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f2565E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2566a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2572j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2573k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2574l;

    /* renamed from: m, reason: collision with root package name */
    public int f2575m;

    /* renamed from: n, reason: collision with root package name */
    public char f2576n;

    /* renamed from: o, reason: collision with root package name */
    public int f2577o;

    /* renamed from: p, reason: collision with root package name */
    public char f2578p;

    /* renamed from: q, reason: collision with root package name */
    public int f2579q;

    /* renamed from: r, reason: collision with root package name */
    public int f2580r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2581s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2582t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2583u;

    /* renamed from: v, reason: collision with root package name */
    public int f2584v;

    /* renamed from: w, reason: collision with root package name */
    public int f2585w;

    /* renamed from: x, reason: collision with root package name */
    public String f2586x;

    /* renamed from: y, reason: collision with root package name */
    public String f2587y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0160p f2588z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2563C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2564D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2567b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2568c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2569e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2570f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2571g = true;

    public g(h hVar, Menu menu) {
        this.f2565E = hVar;
        this.f2566a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2565E.f2593c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2581s).setVisible(this.f2582t).setEnabled(this.f2583u).setCheckable(this.f2580r >= 1).setTitleCondensed(this.f2574l).setIcon(this.f2575m);
        int i = this.f2584v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2587y;
        h hVar = this.f2565E;
        if (str != null) {
            if (hVar.f2593c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2593c);
            }
            Object obj = hVar.d;
            String str2 = this.f2587y;
            f fVar = new f();
            fVar.f2559a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2560b = cls.getMethod(str2, f.f2558c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2580r >= 2) {
            if (menuItem instanceof C0159o) {
                C0159o c0159o = (C0159o) menuItem;
                c0159o.f2733x = (c0159o.f2733x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0164t) {
                MenuItemC0164t menuItemC0164t = (MenuItemC0164t) menuItem;
                try {
                    Method method = menuItemC0164t.d;
                    E.a aVar = menuItemC0164t.f2744c;
                    if (method == null) {
                        menuItemC0164t.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0164t.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2586x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2589e, hVar.f2591a));
            z2 = true;
        }
        int i2 = this.f2585w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p = this.f2588z;
        if (actionProviderVisibilityListenerC0160p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0160p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2561A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0013m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2562B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0013m.m(menuItem, charSequence2);
        }
        char c2 = this.f2576n;
        int i3 = this.f2577o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0013m.g(menuItem, c2, i3);
        }
        char c3 = this.f2578p;
        int i4 = this.f2579q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0013m.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2564D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0013m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2563C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0013m.i(menuItem, colorStateList);
            }
        }
    }
}
