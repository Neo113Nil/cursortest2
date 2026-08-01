package l;

import M.AbstractC0015k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import m.ActionProviderVisibilityListenerC0232p;
import m.C0231o;
import m.MenuItemC0236t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f3205A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f3206B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f3209E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f3210a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3216h;
    public int i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3217k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3218l;

    /* renamed from: m, reason: collision with root package name */
    public int f3219m;

    /* renamed from: n, reason: collision with root package name */
    public char f3220n;

    /* renamed from: o, reason: collision with root package name */
    public int f3221o;

    /* renamed from: p, reason: collision with root package name */
    public char f3222p;

    /* renamed from: q, reason: collision with root package name */
    public int f3223q;

    /* renamed from: r, reason: collision with root package name */
    public int f3224r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3225s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3226t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3227u;

    /* renamed from: v, reason: collision with root package name */
    public int f3228v;

    /* renamed from: w, reason: collision with root package name */
    public int f3229w;

    /* renamed from: x, reason: collision with root package name */
    public String f3230x;

    /* renamed from: y, reason: collision with root package name */
    public String f3231y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0232p f3232z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f3207C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f3208D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3211b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f3212c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3213d = 0;
    public int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3214f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3215g = true;

    public g(h hVar, Menu menu) {
        this.f3209E = hVar;
        this.f3210a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3209E.f3236c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f3225s).setVisible(this.f3226t).setEnabled(this.f3227u).setCheckable(this.f3224r >= 1).setTitleCondensed(this.f3218l).setIcon(this.f3219m);
        int i = this.f3228v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f3231y;
        h hVar = this.f3209E;
        if (str != null) {
            if (hVar.f3236c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f3237d == null) {
                hVar.f3237d = h.a(hVar.f3236c);
            }
            Object obj = hVar.f3237d;
            String str2 = this.f3231y;
            f fVar = new f();
            fVar.f3203a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f3204b = cls.getMethod(str2, f.f3202c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f3224r >= 2) {
            if (menuItem instanceof C0231o) {
                C0231o c0231o = (C0231o) menuItem;
                c0231o.f3395x = (c0231o.f3395x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0236t) {
                MenuItemC0236t menuItemC0236t = (MenuItemC0236t) menuItem;
                try {
                    Method method = menuItemC0236t.f3407d;
                    G.a aVar = menuItemC0236t.f3406c;
                    if (method == null) {
                        menuItemC0236t.f3407d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0236t.f3407d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str3 = this.f3230x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.e, hVar.f3234a));
            z2 = true;
        }
        int i2 = this.f3229w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p = this.f3232z;
        if (actionProviderVisibilityListenerC0232p != null) {
            if (menuItem instanceof G.a) {
                ((G.a) menuItem).a(actionProviderVisibilityListenerC0232p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f3205A;
        boolean z3 = menuItem instanceof G.a;
        if (z3) {
            ((G.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0015k.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f3206B;
        if (z3) {
            ((G.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0015k.m(menuItem, charSequence2);
        }
        char c2 = this.f3220n;
        int i3 = this.f3221o;
        if (z3) {
            ((G.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0015k.g(menuItem, c2, i3);
        }
        char c3 = this.f3222p;
        int i4 = this.f3223q;
        if (z3) {
            ((G.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0015k.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f3208D;
        if (mode != null) {
            if (z3) {
                ((G.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0015k.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f3207C;
        if (colorStateList != null) {
            if (z3) {
                ((G.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0015k.i(menuItem, colorStateList);
            }
        }
    }
}
