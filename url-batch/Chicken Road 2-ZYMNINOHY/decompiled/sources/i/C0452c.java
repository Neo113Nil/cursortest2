package i;

import E.AbstractC0012m;
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
public final class C0452c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f9246A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0453d f9249D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f9250a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9257h;

    /* renamed from: i, reason: collision with root package name */
    public int f9258i;

    /* renamed from: j, reason: collision with root package name */
    public int f9259j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f9260k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f9261l;

    /* renamed from: m, reason: collision with root package name */
    public int f9262m;
    public char n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public char f9263p;

    /* renamed from: q, reason: collision with root package name */
    public int f9264q;

    /* renamed from: r, reason: collision with root package name */
    public int f9265r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9266s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9267t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9268u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public int f9269w;

    /* renamed from: x, reason: collision with root package name */
    public String f9270x;

    /* renamed from: y, reason: collision with root package name */
    public String f9271y;
    public CharSequence z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f9247B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f9248C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f9251b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9252c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f9253d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f9254e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9255f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9256g = true;

    public C0452c(C0453d c0453d, Menu menu) {
        this.f9249D = c0453d;
        this.f9250a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f9249D.f9276c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f9266s).setVisible(this.f9267t).setEnabled(this.f9268u).setCheckable(this.f9265r >= 1).setTitleCondensed(this.f9261l).setIcon(this.f9262m);
        int i4 = this.v;
        if (i4 >= 0) {
            menuItem.setShowAsAction(i4);
        }
        String str = this.f9271y;
        C0453d c0453d = this.f9249D;
        if (str != null) {
            if (c0453d.f9276c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0453d.f9277d == null) {
                c0453d.f9277d = C0453d.a(c0453d.f9276c);
            }
            Object obj = c0453d.f9277d;
            String str2 = this.f9271y;
            MenuItemOnMenuItemClickListenerC0451b menuItemOnMenuItemClickListenerC0451b = new MenuItemOnMenuItemClickListenerC0451b();
            menuItemOnMenuItemClickListenerC0451b.f9244a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0451b.f9245b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0451b.f9243c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0451b);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        boolean z4 = menuItem instanceof k;
        if (z4) {
        }
        if (this.f9265r >= 2 && z4) {
            k kVar = (k) menuItem;
            kVar.f13688x = (kVar.f13688x & (-5)) | 4;
        }
        String str3 = this.f9270x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0453d.f9272e, c0453d.f9274a));
            z = true;
        }
        int i5 = this.f9269w;
        if (i5 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        CharSequence charSequence = this.z;
        boolean z5 = menuItem instanceof k;
        if (z5) {
            ((k) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0012m.j(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f9246A;
        if (z5) {
            ((k) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0012m.r(menuItem, charSequence2);
        }
        char c4 = this.n;
        int i6 = this.o;
        if (z5) {
            ((k) menuItem).setAlphabeticShortcut(c4, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0012m.h(menuItem, c4, i6);
        }
        char c5 = this.f9263p;
        int i7 = this.f9264q;
        if (z5) {
            ((k) menuItem).setNumericShortcut(c5, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0012m.n(menuItem, c5, i7);
        }
        PorterDuff.Mode mode = this.f9248C;
        if (mode != null) {
            if (z5) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0012m.m(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f9247B;
        if (colorStateList != null) {
            if (z5) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0012m.l(menuItem, colorStateList);
            }
        }
    }
}
