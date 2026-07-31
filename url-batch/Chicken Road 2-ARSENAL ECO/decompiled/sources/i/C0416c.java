package i;

import D.AbstractC0098k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.k;
import java.lang.reflect.Constructor;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f4360A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0417d f4363D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f4364a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4371h;

    /* renamed from: i, reason: collision with root package name */
    public int f4372i;

    /* renamed from: j, reason: collision with root package name */
    public int f4373j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4374k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4375l;

    /* renamed from: m, reason: collision with root package name */
    public int f4376m;

    /* renamed from: n, reason: collision with root package name */
    public char f4377n;

    /* renamed from: o, reason: collision with root package name */
    public int f4378o;

    /* renamed from: p, reason: collision with root package name */
    public char f4379p;

    /* renamed from: q, reason: collision with root package name */
    public int f4380q;

    /* renamed from: r, reason: collision with root package name */
    public int f4381r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4382s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4383t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4384u;

    /* renamed from: v, reason: collision with root package name */
    public int f4385v;

    /* renamed from: w, reason: collision with root package name */
    public int f4386w;

    /* renamed from: x, reason: collision with root package name */
    public String f4387x;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f4388z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f4361B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f4362C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f4365b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f4366c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f4367d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f4368e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4369f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4370g = true;

    public C0416c(C0417d c0417d, Menu menu) {
        this.f4363D = c0417d;
        this.f4364a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f4363D.f4393c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z5 = false;
        menuItem.setChecked(this.f4382s).setVisible(this.f4383t).setEnabled(this.f4384u).setCheckable(this.f4381r >= 1).setTitleCondensed(this.f4375l).setIcon(this.f4376m);
        int i7 = this.f4385v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        String str = this.y;
        C0417d c0417d = this.f4363D;
        if (str != null) {
            if (c0417d.f4393c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0417d.f4394d == null) {
                c0417d.f4394d = C0417d.a(c0417d.f4393c);
            }
            Object obj = c0417d.f4394d;
            String str2 = this.y;
            MenuItemOnMenuItemClickListenerC0415b menuItemOnMenuItemClickListenerC0415b = new MenuItemOnMenuItemClickListenerC0415b();
            menuItemOnMenuItemClickListenerC0415b.f4358a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0415b.f4359b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0415b.f4357c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0415b);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        if (this.f4381r >= 2 && (menuItem instanceof k)) {
            k kVar = (k) menuItem;
            kVar.f4840x = (kVar.f4840x & (-5)) | 4;
        }
        String str3 = this.f4387x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0417d.f4389e, c0417d.f4391a));
            z5 = true;
        }
        int i8 = this.f4386w;
        if (i8 > 0) {
            if (z5) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i8);
            }
        }
        CharSequence charSequence = this.f4388z;
        boolean z6 = menuItem instanceof k;
        if (z6) {
            ((k) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0098k.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f4360A;
        if (z6) {
            ((k) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0098k.m(menuItem, charSequence2);
        }
        char c7 = this.f4377n;
        int i9 = this.f4378o;
        if (z6) {
            ((k) menuItem).setAlphabeticShortcut(c7, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0098k.g(menuItem, c7, i9);
        }
        char c8 = this.f4379p;
        int i10 = this.f4380q;
        if (z6) {
            ((k) menuItem).setNumericShortcut(c8, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0098k.k(menuItem, c8, i10);
        }
        PorterDuff.Mode mode = this.f4362C;
        if (mode != null) {
            if (z6) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0098k.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f4361B;
        if (colorStateList != null) {
            if (z6) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0098k.i(menuItem, colorStateList);
            }
        }
    }
}
