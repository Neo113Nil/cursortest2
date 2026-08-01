package j;

import K.AbstractC0013n;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.ActionProviderVisibilityListenerC0170p;
import k.C0169o;
import k.MenuItemC0174t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2606A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2607B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f2610E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2611a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2617j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2618k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2619l;

    /* renamed from: m, reason: collision with root package name */
    public int f2620m;

    /* renamed from: n, reason: collision with root package name */
    public char f2621n;

    /* renamed from: o, reason: collision with root package name */
    public int f2622o;

    /* renamed from: p, reason: collision with root package name */
    public char f2623p;

    /* renamed from: q, reason: collision with root package name */
    public int f2624q;

    /* renamed from: r, reason: collision with root package name */
    public int f2625r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2626s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2627t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2628u;

    /* renamed from: v, reason: collision with root package name */
    public int f2629v;

    /* renamed from: w, reason: collision with root package name */
    public int f2630w;

    /* renamed from: x, reason: collision with root package name */
    public String f2631x;

    /* renamed from: y, reason: collision with root package name */
    public String f2632y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0170p f2633z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2608C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2609D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2612b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2613c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2614e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2615f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2616g = true;

    public g(h hVar, Menu menu) {
        this.f2610E = hVar;
        this.f2611a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2610E.f2638c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2626s).setVisible(this.f2627t).setEnabled(this.f2628u).setCheckable(this.f2625r >= 1).setTitleCondensed(this.f2619l).setIcon(this.f2620m);
        int i = this.f2629v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2632y;
        h hVar = this.f2610E;
        if (str != null) {
            if (hVar.f2638c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2638c);
            }
            Object obj = hVar.d;
            String str2 = this.f2632y;
            f fVar = new f();
            fVar.f2604a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2605b = cls.getMethod(str2, f.f2603c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2625r >= 2) {
            if (menuItem instanceof C0169o) {
                C0169o c0169o = (C0169o) menuItem;
                c0169o.f2793x = (c0169o.f2793x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0174t) {
                MenuItemC0174t menuItemC0174t = (MenuItemC0174t) menuItem;
                try {
                    Method method = menuItemC0174t.d;
                    E.a aVar = menuItemC0174t.f2804c;
                    if (method == null) {
                        menuItemC0174t.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0174t.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2631x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2634e, hVar.f2636a));
            z2 = true;
        }
        int i2 = this.f2630w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0170p actionProviderVisibilityListenerC0170p = this.f2633z;
        if (actionProviderVisibilityListenerC0170p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0170p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2606A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0013n.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2607B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0013n.m(menuItem, charSequence2);
        }
        char c2 = this.f2621n;
        int i3 = this.f2622o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0013n.g(menuItem, c2, i3);
        }
        char c3 = this.f2623p;
        int i4 = this.f2624q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0013n.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2609D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0013n.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2608C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0013n.i(menuItem, colorStateList);
            }
        }
    }
}
