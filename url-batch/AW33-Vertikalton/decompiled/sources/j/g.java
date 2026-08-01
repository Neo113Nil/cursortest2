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
    public CharSequence f2556A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2557B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f2560E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2561a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2567j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2568k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2569l;

    /* renamed from: m, reason: collision with root package name */
    public int f2570m;

    /* renamed from: n, reason: collision with root package name */
    public char f2571n;

    /* renamed from: o, reason: collision with root package name */
    public int f2572o;

    /* renamed from: p, reason: collision with root package name */
    public char f2573p;

    /* renamed from: q, reason: collision with root package name */
    public int f2574q;

    /* renamed from: r, reason: collision with root package name */
    public int f2575r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2576s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2577t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2578u;

    /* renamed from: v, reason: collision with root package name */
    public int f2579v;

    /* renamed from: w, reason: collision with root package name */
    public int f2580w;

    /* renamed from: x, reason: collision with root package name */
    public String f2581x;

    /* renamed from: y, reason: collision with root package name */
    public String f2582y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0160p f2583z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2558C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2559D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2562b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2563c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2564e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2565f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2566g = true;

    public g(h hVar, Menu menu) {
        this.f2560E = hVar;
        this.f2561a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2560E.f2588c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2576s).setVisible(this.f2577t).setEnabled(this.f2578u).setCheckable(this.f2575r >= 1).setTitleCondensed(this.f2569l).setIcon(this.f2570m);
        int i = this.f2579v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2582y;
        h hVar = this.f2560E;
        if (str != null) {
            if (hVar.f2588c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2588c);
            }
            Object obj = hVar.d;
            String str2 = this.f2582y;
            f fVar = new f();
            fVar.f2554a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2555b = cls.getMethod(str2, f.f2553c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2575r >= 2) {
            if (menuItem instanceof C0159o) {
                C0159o c0159o = (C0159o) menuItem;
                c0159o.f2728x = (c0159o.f2728x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0164t) {
                MenuItemC0164t menuItemC0164t = (MenuItemC0164t) menuItem;
                try {
                    Method method = menuItemC0164t.d;
                    E.a aVar = menuItemC0164t.f2739c;
                    if (method == null) {
                        menuItemC0164t.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0164t.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2581x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2584e, hVar.f2586a));
            z2 = true;
        }
        int i2 = this.f2580w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p = this.f2583z;
        if (actionProviderVisibilityListenerC0160p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0160p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2556A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0013m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2557B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0013m.m(menuItem, charSequence2);
        }
        char c2 = this.f2571n;
        int i3 = this.f2572o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0013m.g(menuItem, c2, i3);
        }
        char c3 = this.f2573p;
        int i4 = this.f2574q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0013m.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2559D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0013m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2558C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0013m.i(menuItem, colorStateList);
            }
        }
    }
}
