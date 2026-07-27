package j;

import E.AbstractC0037l;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import k.j;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1196c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f10405A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C1197d f10408D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f10409a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10416h;

    /* renamed from: i, reason: collision with root package name */
    public int f10417i;

    /* renamed from: j, reason: collision with root package name */
    public int f10418j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f10419k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f10420l;

    /* renamed from: m, reason: collision with root package name */
    public int f10421m;

    /* renamed from: n, reason: collision with root package name */
    public char f10422n;

    /* renamed from: o, reason: collision with root package name */
    public int f10423o;

    /* renamed from: p, reason: collision with root package name */
    public char f10424p;

    /* renamed from: q, reason: collision with root package name */
    public int f10425q;

    /* renamed from: r, reason: collision with root package name */
    public int f10426r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10427s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10428t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10429u;

    /* renamed from: v, reason: collision with root package name */
    public int f10430v;

    /* renamed from: w, reason: collision with root package name */
    public int f10431w;

    /* renamed from: x, reason: collision with root package name */
    public String f10432x;

    /* renamed from: y, reason: collision with root package name */
    public String f10433y;
    public CharSequence z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f10406B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f10407C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f10410b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f10411c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f10412d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f10413e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10414f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10415g = true;

    public C1196c(C1197d c1197d, Menu menu) {
        this.f10408D = c1197d;
        this.f10409a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f10408D.f10438c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f10427s).setVisible(this.f10428t).setEnabled(this.f10429u).setCheckable(this.f10426r >= 1).setTitleCondensed(this.f10420l).setIcon(this.f10421m);
        int i2 = this.f10430v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f10433y;
        C1197d c1197d = this.f10408D;
        if (str != null) {
            if (c1197d.f10438c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c1197d.f10439d == null) {
                c1197d.f10439d = C1197d.a(c1197d.f10438c);
            }
            Object obj = c1197d.f10439d;
            String str2 = this.f10433y;
            MenuItemOnMenuItemClickListenerC1195b menuItemOnMenuItemClickListenerC1195b = new MenuItemOnMenuItemClickListenerC1195b();
            menuItemOnMenuItemClickListenerC1195b.f10403a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC1195b.f10404b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC1195b.f10402c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC1195b);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        boolean z5 = menuItem instanceof j;
        if (z5) {
        }
        if (this.f10426r >= 2 && z5) {
            j jVar = (j) menuItem;
            jVar.f10631x = (jVar.f10631x & (-5)) | 4;
        }
        String str3 = this.f10432x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C1197d.f10434e, c1197d.f10436a));
            z = true;
        }
        int i3 = this.f10431w;
        if (i3 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        CharSequence charSequence = this.z;
        boolean z6 = menuItem instanceof j;
        if (z6) {
            ((j) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0037l.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f10405A;
        if (z6) {
            ((j) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0037l.m(menuItem, charSequence2);
        }
        char c2 = this.f10422n;
        int i6 = this.f10423o;
        if (z6) {
            ((j) menuItem).setAlphabeticShortcut(c2, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0037l.g(menuItem, c2, i6);
        }
        char c6 = this.f10424p;
        int i7 = this.f10425q;
        if (z6) {
            ((j) menuItem).setNumericShortcut(c6, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0037l.k(menuItem, c6, i7);
        }
        PorterDuff.Mode mode = this.f10407C;
        if (mode != null) {
            if (z6) {
                ((j) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0037l.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f10406B;
        if (colorStateList != null) {
            if (z6) {
                ((j) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0037l.i(menuItem, colorStateList);
            }
        }
    }
}
