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
import k.ActionProviderVisibilityListenerC0163p;
import k.C0162o;
import k.MenuItemC0167t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2540A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2541B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f2544E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2545a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2551j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2552k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2553l;

    /* renamed from: m, reason: collision with root package name */
    public int f2554m;

    /* renamed from: n, reason: collision with root package name */
    public char f2555n;

    /* renamed from: o, reason: collision with root package name */
    public int f2556o;

    /* renamed from: p, reason: collision with root package name */
    public char f2557p;

    /* renamed from: q, reason: collision with root package name */
    public int f2558q;

    /* renamed from: r, reason: collision with root package name */
    public int f2559r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2560s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2561t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2562u;

    /* renamed from: v, reason: collision with root package name */
    public int f2563v;

    /* renamed from: w, reason: collision with root package name */
    public int f2564w;

    /* renamed from: x, reason: collision with root package name */
    public String f2565x;

    /* renamed from: y, reason: collision with root package name */
    public String f2566y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0163p f2567z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2542C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2543D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2546b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2547c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2548e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2549f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2550g = true;

    public g(h hVar, Menu menu) {
        this.f2544E = hVar;
        this.f2545a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2544E.f2572c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2560s).setVisible(this.f2561t).setEnabled(this.f2562u).setCheckable(this.f2559r >= 1).setTitleCondensed(this.f2553l).setIcon(this.f2554m);
        int i = this.f2563v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2566y;
        h hVar = this.f2544E;
        if (str != null) {
            if (hVar.f2572c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2572c);
            }
            Object obj = hVar.d;
            String str2 = this.f2566y;
            f fVar = new f();
            fVar.f2538a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2539b = cls.getMethod(str2, f.f2537c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2559r >= 2) {
            if (menuItem instanceof C0162o) {
                C0162o c0162o = (C0162o) menuItem;
                c0162o.f2708x = (c0162o.f2708x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0167t) {
                MenuItemC0167t menuItemC0167t = (MenuItemC0167t) menuItem;
                try {
                    Method method = menuItemC0167t.d;
                    E.a aVar = menuItemC0167t.f2719c;
                    if (method == null) {
                        menuItemC0167t.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0167t.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2565x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2568e, hVar.f2570a));
            z2 = true;
        }
        int i2 = this.f2564w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0163p actionProviderVisibilityListenerC0163p = this.f2567z;
        if (actionProviderVisibilityListenerC0163p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0163p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2540A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0012m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2541B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0012m.m(menuItem, charSequence2);
        }
        char c2 = this.f2555n;
        int i3 = this.f2556o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0012m.g(menuItem, c2, i3);
        }
        char c3 = this.f2557p;
        int i4 = this.f2558q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0012m.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2543D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0012m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2542C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0012m.i(menuItem, colorStateList);
            }
        }
    }
}
