package k;

import L.AbstractC0015m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.ActionProviderVisibilityListenerC0172p;
import l.C0171o;
import l.MenuItemC0176t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2689A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2690B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f2693E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2694a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2700h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2701j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2702k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2703l;

    /* renamed from: m, reason: collision with root package name */
    public int f2704m;

    /* renamed from: n, reason: collision with root package name */
    public char f2705n;

    /* renamed from: o, reason: collision with root package name */
    public int f2706o;

    /* renamed from: p, reason: collision with root package name */
    public char f2707p;

    /* renamed from: q, reason: collision with root package name */
    public int f2708q;

    /* renamed from: r, reason: collision with root package name */
    public int f2709r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2710s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2711t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2712u;

    /* renamed from: v, reason: collision with root package name */
    public int f2713v;

    /* renamed from: w, reason: collision with root package name */
    public int f2714w;

    /* renamed from: x, reason: collision with root package name */
    public String f2715x;

    /* renamed from: y, reason: collision with root package name */
    public String f2716y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0172p f2717z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2691C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2692D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2695b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2696c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2697e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2698f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2699g = true;

    public g(h hVar, Menu menu) {
        this.f2693E = hVar;
        this.f2694a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2693E.f2722c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2710s).setVisible(this.f2711t).setEnabled(this.f2712u).setCheckable(this.f2709r >= 1).setTitleCondensed(this.f2703l).setIcon(this.f2704m);
        int i = this.f2713v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2716y;
        h hVar = this.f2693E;
        if (str != null) {
            if (hVar.f2722c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2722c);
            }
            Object obj = hVar.d;
            String str2 = this.f2716y;
            f fVar = new f();
            fVar.f2687a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2688b = cls.getMethod(str2, f.f2686c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2709r >= 2) {
            if (menuItem instanceof C0171o) {
                C0171o c0171o = (C0171o) menuItem;
                c0171o.f2864x = (c0171o.f2864x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0176t) {
                MenuItemC0176t menuItemC0176t = (MenuItemC0176t) menuItem;
                try {
                    Method method = menuItemC0176t.d;
                    F.a aVar = menuItemC0176t.f2875c;
                    if (method == null) {
                        menuItemC0176t.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0176t.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2715x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2718e, hVar.f2720a));
            z2 = true;
        }
        int i2 = this.f2714w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p = this.f2717z;
        if (actionProviderVisibilityListenerC0172p != null) {
            if (menuItem instanceof F.a) {
                ((F.a) menuItem).b(actionProviderVisibilityListenerC0172p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2689A;
        boolean z3 = menuItem instanceof F.a;
        if (z3) {
            ((F.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0015m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2690B;
        if (z3) {
            ((F.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0015m.m(menuItem, charSequence2);
        }
        char c2 = this.f2705n;
        int i3 = this.f2706o;
        if (z3) {
            ((F.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0015m.g(menuItem, c2, i3);
        }
        char c3 = this.f2707p;
        int i4 = this.f2708q;
        if (z3) {
            ((F.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0015m.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2692D;
        if (mode != null) {
            if (z3) {
                ((F.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0015m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2691C;
        if (colorStateList != null) {
            if (z3) {
                ((F.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0015m.i(menuItem, colorStateList);
            }
        }
    }
}
