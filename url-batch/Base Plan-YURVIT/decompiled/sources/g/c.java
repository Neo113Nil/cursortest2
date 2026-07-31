package g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import h.MenuItemC0144k;
import java.lang.reflect.Constructor;
import y.AbstractC0262f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f1893A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ d f1896D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f1897a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1904h;

    /* renamed from: i, reason: collision with root package name */
    public int f1905i;

    /* renamed from: j, reason: collision with root package name */
    public int f1906j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1907k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1908l;

    /* renamed from: m, reason: collision with root package name */
    public int f1909m;

    /* renamed from: n, reason: collision with root package name */
    public char f1910n;

    /* renamed from: o, reason: collision with root package name */
    public int f1911o;

    /* renamed from: p, reason: collision with root package name */
    public char f1912p;

    /* renamed from: q, reason: collision with root package name */
    public int f1913q;

    /* renamed from: r, reason: collision with root package name */
    public int f1914r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1915s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1916u;

    /* renamed from: v, reason: collision with root package name */
    public int f1917v;

    /* renamed from: w, reason: collision with root package name */
    public int f1918w;

    /* renamed from: x, reason: collision with root package name */
    public String f1919x;

    /* renamed from: y, reason: collision with root package name */
    public String f1920y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f1921z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1894B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f1895C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f1898b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1899c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1900d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f1901e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1902f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1903g = true;

    public c(d dVar, Menu menu) {
        this.f1896D = dVar;
        this.f1897a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f1896D.f1926c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f1915s).setVisible(this.t).setEnabled(this.f1916u).setCheckable(this.f1914r >= 1).setTitleCondensed(this.f1908l).setIcon(this.f1909m);
        int i2 = this.f1917v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f1920y;
        d dVar = this.f1896D;
        if (str != null) {
            if (dVar.f1926c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f1927d == null) {
                dVar.f1927d = d.a(dVar.f1926c);
            }
            Object obj = dVar.f1927d;
            String str2 = this.f1920y;
            b bVar = new b();
            bVar.f1891a = obj;
            Class<?> cls = obj.getClass();
            try {
                bVar.f1892b = cls.getMethod(str2, b.f1890c);
                menuItem.setOnMenuItemClickListener(bVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        boolean z3 = menuItem instanceof MenuItemC0144k;
        if (z3) {
        }
        if (this.f1914r >= 2 && z3) {
            MenuItemC0144k menuItemC0144k = (MenuItemC0144k) menuItem;
            menuItemC0144k.f2052x = (menuItemC0144k.f2052x & (-5)) | 4;
        }
        String str3 = this.f1919x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.f1922e, dVar.f1924a));
            z2 = true;
        }
        int i3 = this.f1918w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        CharSequence charSequence = this.f1921z;
        boolean z4 = menuItem instanceof MenuItemC0144k;
        if (z4) {
            ((MenuItemC0144k) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0262f.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f1893A;
        if (z4) {
            ((MenuItemC0144k) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0262f.m(menuItem, charSequence2);
        }
        char c2 = this.f1910n;
        int i4 = this.f1911o;
        if (z4) {
            ((MenuItemC0144k) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0262f.g(menuItem, c2, i4);
        }
        char c3 = this.f1912p;
        int i5 = this.f1913q;
        if (z4) {
            ((MenuItemC0144k) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0262f.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f1895C;
        if (mode != null) {
            if (z4) {
                ((MenuItemC0144k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0262f.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f1894B;
        if (colorStateList != null) {
            if (z4) {
                ((MenuItemC0144k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0262f.i(menuItem, colorStateList);
            }
        }
    }
}
