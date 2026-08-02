package h;

import A.AbstractC0006g;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import i.MenuItemC0212j;
import java.lang.reflect.Constructor;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2249A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ d f2252D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2253a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2260h;

    /* renamed from: i, reason: collision with root package name */
    public int f2261i;

    /* renamed from: j, reason: collision with root package name */
    public int f2262j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2263k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2264l;

    /* renamed from: m, reason: collision with root package name */
    public int f2265m;

    /* renamed from: n, reason: collision with root package name */
    public char f2266n;

    /* renamed from: o, reason: collision with root package name */
    public int f2267o;

    /* renamed from: p, reason: collision with root package name */
    public char f2268p;

    /* renamed from: q, reason: collision with root package name */
    public int f2269q;

    /* renamed from: r, reason: collision with root package name */
    public int f2270r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2271s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2272t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2273u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public int f2274w;

    /* renamed from: x, reason: collision with root package name */
    public String f2275x;

    /* renamed from: y, reason: collision with root package name */
    public String f2276y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f2277z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2250B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f2251C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2254b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2255c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2256d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2257e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2258f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2259g = true;

    public C0192c(d dVar, Menu menu) {
        this.f2252D = dVar;
        this.f2253a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2252D.f2282c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2271s).setVisible(this.f2272t).setEnabled(this.f2273u).setCheckable(this.f2270r >= 1).setTitleCondensed(this.f2264l).setIcon(this.f2265m);
        int i2 = this.v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f2276y;
        d dVar = this.f2252D;
        if (str != null) {
            if (dVar.f2282c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f2283d == null) {
                dVar.f2283d = d.a(dVar.f2282c);
            }
            Object obj = dVar.f2283d;
            String str2 = this.f2276y;
            MenuItemOnMenuItemClickListenerC0191b menuItemOnMenuItemClickListenerC0191b = new MenuItemOnMenuItemClickListenerC0191b();
            menuItemOnMenuItemClickListenerC0191b.f2247a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0191b.f2248b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0191b.f2246c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0191b);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        boolean z3 = menuItem instanceof MenuItemC0212j;
        if (z3) {
        }
        if (this.f2270r >= 2 && z3) {
            MenuItemC0212j menuItemC0212j = (MenuItemC0212j) menuItem;
            menuItemC0212j.f2452x = (menuItemC0212j.f2452x & (-5)) | 4;
        }
        String str3 = this.f2275x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.f2278e, dVar.f2280a));
            z2 = true;
        }
        int i3 = this.f2274w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        CharSequence charSequence = this.f2277z;
        boolean z4 = menuItem instanceof MenuItemC0212j;
        if (z4) {
            ((MenuItemC0212j) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0006g.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2249A;
        if (z4) {
            ((MenuItemC0212j) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0006g.m(menuItem, charSequence2);
        }
        char c2 = this.f2266n;
        int i4 = this.f2267o;
        if (z4) {
            ((MenuItemC0212j) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0006g.g(menuItem, c2, i4);
        }
        char c3 = this.f2268p;
        int i5 = this.f2269q;
        if (z4) {
            ((MenuItemC0212j) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0006g.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f2251C;
        if (mode != null) {
            if (z4) {
                ((MenuItemC0212j) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0006g.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2250B;
        if (colorStateList != null) {
            if (z4) {
                ((MenuItemC0212j) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0006g.i(menuItem, colorStateList);
            }
        }
    }
}
