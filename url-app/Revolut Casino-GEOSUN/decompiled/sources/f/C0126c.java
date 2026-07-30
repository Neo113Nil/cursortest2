package f;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import g.k;
import java.lang.reflect.Constructor;
import w.AbstractC0260f;

/* renamed from: f.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f1888A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0127d f1891D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f1892a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1899h;

    /* renamed from: i, reason: collision with root package name */
    public int f1900i;

    /* renamed from: j, reason: collision with root package name */
    public int f1901j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1902k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1903l;

    /* renamed from: m, reason: collision with root package name */
    public int f1904m;

    /* renamed from: n, reason: collision with root package name */
    public char f1905n;

    /* renamed from: o, reason: collision with root package name */
    public int f1906o;

    /* renamed from: p, reason: collision with root package name */
    public char f1907p;

    /* renamed from: q, reason: collision with root package name */
    public int f1908q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1909s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1910t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1911u;

    /* renamed from: v, reason: collision with root package name */
    public int f1912v;

    /* renamed from: w, reason: collision with root package name */
    public int f1913w;

    /* renamed from: x, reason: collision with root package name */
    public String f1914x;

    /* renamed from: y, reason: collision with root package name */
    public String f1915y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f1916z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1889B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f1890C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f1893b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1894c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1895d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f1896e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1897f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1898g = true;

    public C0126c(C0127d c0127d, Menu menu) {
        this.f1891D = c0127d;
        this.f1892a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f1891D.f1921c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f1909s).setVisible(this.f1910t).setEnabled(this.f1911u).setCheckable(this.r >= 1).setTitleCondensed(this.f1903l).setIcon(this.f1904m);
        int i2 = this.f1912v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f1915y;
        C0127d c0127d = this.f1891D;
        if (str != null) {
            if (c0127d.f1921c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0127d.f1922d == null) {
                c0127d.f1922d = C0127d.a(c0127d.f1921c);
            }
            Object obj = c0127d.f1922d;
            String str2 = this.f1915y;
            MenuItemOnMenuItemClickListenerC0125b menuItemOnMenuItemClickListenerC0125b = new MenuItemOnMenuItemClickListenerC0125b();
            menuItemOnMenuItemClickListenerC0125b.f1886a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0125b.f1887b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0125b.f1885c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0125b);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        boolean z3 = menuItem instanceof k;
        if (z3) {
        }
        if (this.r >= 2 && z3) {
            k kVar = (k) menuItem;
            kVar.f2019x = (kVar.f2019x & (-5)) | 4;
        }
        String str3 = this.f1914x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0127d.f1917e, c0127d.f1919a));
            z2 = true;
        }
        int i3 = this.f1913w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        CharSequence charSequence = this.f1916z;
        boolean z4 = menuItem instanceof k;
        if (z4) {
            ((k) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0260f.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f1888A;
        if (z4) {
            ((k) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0260f.m(menuItem, charSequence2);
        }
        char c2 = this.f1905n;
        int i4 = this.f1906o;
        if (z4) {
            ((k) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0260f.g(menuItem, c2, i4);
        }
        char c3 = this.f1907p;
        int i5 = this.f1908q;
        if (z4) {
            ((k) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0260f.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f1890C;
        if (mode != null) {
            if (z4) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0260f.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f1889B;
        if (colorStateList != null) {
            if (z4) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0260f.i(menuItem, colorStateList);
            }
        }
    }
}
