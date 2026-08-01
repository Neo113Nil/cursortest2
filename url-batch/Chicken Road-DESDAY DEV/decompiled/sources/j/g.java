package j;

import K.AbstractC0012m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.ActionProviderVisibilityListenerC0164p;
import k.C0163o;
import k.MenuItemC0168t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2489A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2490B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f2493E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2494a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2500j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2501k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2502l;

    /* renamed from: m, reason: collision with root package name */
    public int f2503m;

    /* renamed from: n, reason: collision with root package name */
    public char f2504n;

    /* renamed from: o, reason: collision with root package name */
    public int f2505o;

    /* renamed from: p, reason: collision with root package name */
    public char f2506p;

    /* renamed from: q, reason: collision with root package name */
    public int f2507q;

    /* renamed from: r, reason: collision with root package name */
    public int f2508r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2509s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2510t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2511u;

    /* renamed from: v, reason: collision with root package name */
    public int f2512v;

    /* renamed from: w, reason: collision with root package name */
    public int f2513w;

    /* renamed from: x, reason: collision with root package name */
    public String f2514x;

    /* renamed from: y, reason: collision with root package name */
    public String f2515y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0164p f2516z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2491C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2492D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2495b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2496c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2497e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2498f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2499g = true;

    public g(h hVar, Menu menu) {
        this.f2493E = hVar;
        this.f2494a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2493E.f2521c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2509s).setVisible(this.f2510t).setEnabled(this.f2511u).setCheckable(this.f2508r >= 1).setTitleCondensed(this.f2502l).setIcon(this.f2503m);
        int i = this.f2512v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2515y;
        h hVar = this.f2493E;
        if (str != null) {
            if (hVar.f2521c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2521c);
            }
            Object obj = hVar.d;
            String str2 = this.f2515y;
            f fVar = new f();
            fVar.f2487a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2488b = cls.getMethod(str2, f.f2486c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2508r >= 2) {
            if (menuItem instanceof C0163o) {
                C0163o c0163o = (C0163o) menuItem;
                c0163o.f2659x = (c0163o.f2659x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0168t) {
                MenuItemC0168t menuItemC0168t = (MenuItemC0168t) menuItem;
                try {
                    Method method = menuItemC0168t.d;
                    E.a aVar = menuItemC0168t.f2670c;
                    if (method == null) {
                        menuItemC0168t.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0168t.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2514x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2517e, hVar.f2519a));
            z2 = true;
        }
        int i2 = this.f2513w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0164p actionProviderVisibilityListenerC0164p = this.f2516z;
        if (actionProviderVisibilityListenerC0164p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0164p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2489A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0012m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2490B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0012m.m(menuItem, charSequence2);
        }
        char c2 = this.f2504n;
        int i3 = this.f2505o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0012m.g(menuItem, c2, i3);
        }
        char c3 = this.f2506p;
        int i4 = this.f2507q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0012m.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2492D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0012m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2491C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0012m.i(menuItem, colorStateList);
            }
        }
    }
}
