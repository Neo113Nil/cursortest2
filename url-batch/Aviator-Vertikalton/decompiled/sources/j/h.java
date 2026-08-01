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
import k.ActionProviderVisibilityListenerC0203p;
import k.C0202o;
import k.MenuItemC0207t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2825A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2826B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ i f2829E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2830a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2837j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2838k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2839l;

    /* renamed from: m, reason: collision with root package name */
    public int f2840m;

    /* renamed from: n, reason: collision with root package name */
    public char f2841n;

    /* renamed from: o, reason: collision with root package name */
    public int f2842o;

    /* renamed from: p, reason: collision with root package name */
    public char f2843p;

    /* renamed from: q, reason: collision with root package name */
    public int f2844q;

    /* renamed from: r, reason: collision with root package name */
    public int f2845r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2846s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2847t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2848u;

    /* renamed from: v, reason: collision with root package name */
    public int f2849v;

    /* renamed from: w, reason: collision with root package name */
    public int f2850w;

    /* renamed from: x, reason: collision with root package name */
    public String f2851x;

    /* renamed from: y, reason: collision with root package name */
    public String f2852y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0203p f2853z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2827C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2828D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2831b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2832c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2833d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2834e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2835f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2836g = true;

    public h(i iVar, Menu menu) {
        this.f2829E = iVar;
        this.f2830a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2829E.f2858c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2846s).setVisible(this.f2847t).setEnabled(this.f2848u).setCheckable(this.f2845r >= 1).setTitleCondensed(this.f2839l).setIcon(this.f2840m);
        int i = this.f2849v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2852y;
        i iVar = this.f2829E;
        if (str != null) {
            if (iVar.f2858c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (iVar.f2859d == null) {
                iVar.f2859d = i.a(iVar.f2858c);
            }
            Object obj = iVar.f2859d;
            String str2 = this.f2852y;
            g gVar = new g();
            gVar.f2823a = obj;
            Class<?> cls = obj.getClass();
            try {
                gVar.f2824b = cls.getMethod(str2, g.f2822c);
                menuItem.setOnMenuItemClickListener(gVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2845r >= 2) {
            if (menuItem instanceof C0202o) {
                C0202o c0202o = (C0202o) menuItem;
                c0202o.f3106x = (c0202o.f3106x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0207t) {
                MenuItemC0207t menuItemC0207t = (MenuItemC0207t) menuItem;
                try {
                    Method method = menuItemC0207t.f3118d;
                    E.a aVar = menuItemC0207t.f3117c;
                    if (method == null) {
                        menuItemC0207t.f3118d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0207t.f3118d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2851x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, i.f2854e, iVar.f2856a));
            z2 = true;
        }
        int i2 = this.f2850w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p = this.f2853z;
        if (actionProviderVisibilityListenerC0203p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0203p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2825A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0020p.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2826B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0020p.m(menuItem, charSequence2);
        }
        char c2 = this.f2841n;
        int i3 = this.f2842o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0020p.g(menuItem, c2, i3);
        }
        char c3 = this.f2843p;
        int i4 = this.f2844q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0020p.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2828D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0020p.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2827C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0020p.i(menuItem, colorStateList);
            }
        }
    }
}
