package j;

import K.AbstractC0015k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.ActionProviderVisibilityListenerC0193q;
import k.C0192p;
import k.MenuItemC0197u;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f3035A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f3036B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f3039E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f3040a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3046j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3047k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3048l;

    /* renamed from: m, reason: collision with root package name */
    public int f3049m;

    /* renamed from: n, reason: collision with root package name */
    public char f3050n;

    /* renamed from: o, reason: collision with root package name */
    public int f3051o;

    /* renamed from: p, reason: collision with root package name */
    public char f3052p;

    /* renamed from: q, reason: collision with root package name */
    public int f3053q;

    /* renamed from: r, reason: collision with root package name */
    public int f3054r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3055s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3056t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3057u;

    /* renamed from: v, reason: collision with root package name */
    public int f3058v;

    /* renamed from: w, reason: collision with root package name */
    public int f3059w;

    /* renamed from: x, reason: collision with root package name */
    public String f3060x;

    /* renamed from: y, reason: collision with root package name */
    public String f3061y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0193q f3062z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f3037C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f3038D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3041b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f3042c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3043e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3044f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3045g = true;

    public g(h hVar, Menu menu) {
        this.f3039E = hVar;
        this.f3040a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3039E.f3067c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f3055s).setVisible(this.f3056t).setEnabled(this.f3057u).setCheckable(this.f3054r >= 1).setTitleCondensed(this.f3048l).setIcon(this.f3049m);
        int i = this.f3058v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f3061y;
        h hVar = this.f3039E;
        if (str != null) {
            if (hVar.f3067c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f3067c);
            }
            Object obj = hVar.d;
            String str2 = this.f3061y;
            f fVar = new f();
            fVar.f3033a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f3034b = cls.getMethod(str2, f.f3032c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f3054r >= 2) {
            if (menuItem instanceof C0192p) {
                C0192p c0192p = (C0192p) menuItem;
                c0192p.f3211x = (c0192p.f3211x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0197u) {
                MenuItemC0197u menuItemC0197u = (MenuItemC0197u) menuItem;
                try {
                    Method method = menuItemC0197u.d;
                    E.a aVar = menuItemC0197u.f3222c;
                    if (method == null) {
                        menuItemC0197u.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0197u.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f3060x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f3063e, hVar.f3065a));
            z2 = true;
        }
        int i2 = this.f3059w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q = this.f3062z;
        if (actionProviderVisibilityListenerC0193q != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0193q);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f3035A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0015k.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f3036B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0015k.m(menuItem, charSequence2);
        }
        char c2 = this.f3050n;
        int i3 = this.f3051o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0015k.g(menuItem, c2, i3);
        }
        char c3 = this.f3052p;
        int i4 = this.f3053q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0015k.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f3038D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0015k.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f3037C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0015k.i(menuItem, colorStateList);
            }
        }
    }
}
