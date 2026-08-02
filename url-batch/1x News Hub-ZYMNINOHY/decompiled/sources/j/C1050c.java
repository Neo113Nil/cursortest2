package j;

import E.AbstractC0005f;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import k.MenuItemC1066k;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f9464A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ d f9467D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f9468a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9474h;

    /* renamed from: i, reason: collision with root package name */
    public int f9475i;

    /* renamed from: j, reason: collision with root package name */
    public int f9476j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f9477k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f9478l;

    /* renamed from: m, reason: collision with root package name */
    public int f9479m;

    /* renamed from: n, reason: collision with root package name */
    public char f9480n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public char f9481p;

    /* renamed from: q, reason: collision with root package name */
    public int f9482q;

    /* renamed from: r, reason: collision with root package name */
    public int f9483r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9484s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9485t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9486u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public int f9487w;

    /* renamed from: x, reason: collision with root package name */
    public String f9488x;

    /* renamed from: y, reason: collision with root package name */
    public String f9489y;
    public CharSequence z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f9465B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f9466C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f9469b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9470c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f9471d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f9472e = 0;
    public boolean f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9473g = true;

    public C1050c(d dVar, Menu menu) {
        this.f9467D = dVar;
        this.f9468a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f9467D.f9493c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f9484s).setVisible(this.f9485t).setEnabled(this.f9486u).setCheckable(this.f9483r >= 1).setTitleCondensed(this.f9478l).setIcon(this.f9479m);
        int i3 = this.v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.f9489y;
        d dVar = this.f9467D;
        if (str != null) {
            if (dVar.f9493c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f9494d == null) {
                dVar.f9494d = d.a(dVar.f9493c);
            }
            Object obj = dVar.f9494d;
            String str2 = this.f9489y;
            MenuItemOnMenuItemClickListenerC1049b menuItemOnMenuItemClickListenerC1049b = new MenuItemOnMenuItemClickListenerC1049b();
            menuItemOnMenuItemClickListenerC1049b.f9462a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC1049b.f9463b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC1049b.f9461c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC1049b);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        boolean z2 = menuItem instanceof MenuItemC1066k;
        if (z2) {
        }
        if (this.f9483r >= 2 && z2) {
            MenuItemC1066k menuItemC1066k = (MenuItemC1066k) menuItem;
            menuItemC1066k.f9638x = (menuItemC1066k.f9638x & (-5)) | 4;
        }
        String str3 = this.f9488x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.f9490e, dVar.f9491a));
            z = true;
        }
        int i4 = this.f9487w;
        if (i4 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        CharSequence charSequence = this.z;
        boolean z3 = menuItem instanceof MenuItemC1066k;
        if (z3) {
            ((MenuItemC1066k) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.j(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f9464A;
        if (z3) {
            ((MenuItemC1066k) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.r(menuItem, charSequence2);
        }
        char c3 = this.f9480n;
        int i5 = this.o;
        if (z3) {
            ((MenuItemC1066k) menuItem).setAlphabeticShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.h(menuItem, c3, i5);
        }
        char c4 = this.f9481p;
        int i6 = this.f9482q;
        if (z3) {
            ((MenuItemC1066k) menuItem).setNumericShortcut(c4, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.n(menuItem, c4, i6);
        }
        PorterDuff.Mode mode = this.f9466C;
        if (mode != null) {
            if (z3) {
                ((MenuItemC1066k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0005f.m(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f9465B;
        if (colorStateList != null) {
            if (z3) {
                ((MenuItemC1066k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0005f.l(menuItem, colorStateList);
            }
        }
    }
}
