package j;

import K.AbstractC0020p;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.ActionProviderVisibilityListenerC0205p;
import k.C0204o;
import k.MenuItemC0209t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2829A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2830B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ i f2833E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2834a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2841j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2842k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2843l;

    /* renamed from: m, reason: collision with root package name */
    public int f2844m;

    /* renamed from: n, reason: collision with root package name */
    public char f2845n;

    /* renamed from: o, reason: collision with root package name */
    public int f2846o;

    /* renamed from: p, reason: collision with root package name */
    public char f2847p;

    /* renamed from: q, reason: collision with root package name */
    public int f2848q;

    /* renamed from: r, reason: collision with root package name */
    public int f2849r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2850s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2851t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2852u;

    /* renamed from: v, reason: collision with root package name */
    public int f2853v;

    /* renamed from: w, reason: collision with root package name */
    public int f2854w;

    /* renamed from: x, reason: collision with root package name */
    public String f2855x;

    /* renamed from: y, reason: collision with root package name */
    public String f2856y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0205p f2857z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2831C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2832D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2835b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2836c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2837d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2838e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2839f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2840g = true;

    public h(i iVar, Menu menu) {
        this.f2833E = iVar;
        this.f2834a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2833E.f2862c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2850s).setVisible(this.f2851t).setEnabled(this.f2852u).setCheckable(this.f2849r >= 1).setTitleCondensed(this.f2843l).setIcon(this.f2844m);
        int i = this.f2853v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2856y;
        i iVar = this.f2833E;
        if (str != null) {
            if (iVar.f2862c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (iVar.f2863d == null) {
                iVar.f2863d = i.a(iVar.f2862c);
            }
            Object obj = iVar.f2863d;
            String str2 = this.f2856y;
            g gVar = new g();
            gVar.f2827a = obj;
            Class<?> cls = obj.getClass();
            try {
                gVar.f2828b = cls.getMethod(str2, g.f2826c);
                menuItem.setOnMenuItemClickListener(gVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2849r >= 2) {
            if (menuItem instanceof C0204o) {
                C0204o c0204o = (C0204o) menuItem;
                c0204o.f3110x = (c0204o.f3110x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0209t) {
                MenuItemC0209t menuItemC0209t = (MenuItemC0209t) menuItem;
                try {
                    Method method = menuItemC0209t.f3122d;
                    E.a aVar = menuItemC0209t.f3121c;
                    if (method == null) {
                        menuItemC0209t.f3122d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0209t.f3122d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2855x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, i.f2858e, iVar.f2860a));
            z2 = true;
        }
        int i2 = this.f2854w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p = this.f2857z;
        if (actionProviderVisibilityListenerC0205p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0205p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2829A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0020p.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2830B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0020p.m(menuItem, charSequence2);
        }
        char c2 = this.f2845n;
        int i3 = this.f2846o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0020p.g(menuItem, c2, i3);
        }
        char c3 = this.f2847p;
        int i4 = this.f2848q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0020p.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2832D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0020p.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2831C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0020p.i(menuItem, colorStateList);
            }
        }
    }
}
