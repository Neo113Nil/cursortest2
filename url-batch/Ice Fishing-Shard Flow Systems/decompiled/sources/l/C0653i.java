package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import m.o;
import m.p;
import m.t;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653i {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f6221A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f6222B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ j f6225E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f6226a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6233h;

    /* renamed from: i, reason: collision with root package name */
    public int f6234i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f6235k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f6236l;

    /* renamed from: m, reason: collision with root package name */
    public int f6237m;

    /* renamed from: n, reason: collision with root package name */
    public char f6238n;

    /* renamed from: o, reason: collision with root package name */
    public int f6239o;

    /* renamed from: p, reason: collision with root package name */
    public char f6240p;

    /* renamed from: q, reason: collision with root package name */
    public int f6241q;

    /* renamed from: r, reason: collision with root package name */
    public int f6242r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6243s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6244t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6245u;

    /* renamed from: v, reason: collision with root package name */
    public int f6246v;

    /* renamed from: w, reason: collision with root package name */
    public int f6247w;

    /* renamed from: x, reason: collision with root package name */
    public String f6248x;

    /* renamed from: y, reason: collision with root package name */
    public String f6249y;

    /* renamed from: z, reason: collision with root package name */
    public p f6250z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f6223C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f6224D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f6227b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f6228c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f6229d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f6230e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6231f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6232g = true;

    public C0653i(j jVar, Menu menu) {
        this.f6225E = jVar;
        this.f6226a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f6225E.f6255c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e7) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z7 = false;
        menuItem.setChecked(this.f6243s).setVisible(this.f6244t).setEnabled(this.f6245u).setCheckable(this.f6242r >= 1).setTitleCondensed(this.f6236l).setIcon(this.f6237m);
        int i2 = this.f6246v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f6249y;
        j jVar = this.f6225E;
        if (str != null) {
            if (jVar.f6255c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (jVar.f6256d == null) {
                jVar.f6256d = j.a(jVar.f6255c);
            }
            Object obj = jVar.f6256d;
            String str2 = this.f6249y;
            MenuItemOnMenuItemClickListenerC0652h menuItemOnMenuItemClickListenerC0652h = new MenuItemOnMenuItemClickListenerC0652h();
            menuItemOnMenuItemClickListenerC0652h.f6219a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0652h.f6220b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0652h.f6218c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0652h);
            } catch (Exception e7) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }
        if (this.f6242r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f6462x = (oVar.f6462x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                D.a aVar = tVar.f6472c;
                try {
                    if (tVar.f6473d == null) {
                        tVar.f6473d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f6473d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e8) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e8);
                }
            }
        }
        String str3 = this.f6248x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, j.f6251e, jVar.f6253a));
            z7 = true;
        }
        int i5 = this.f6247w;
        if (i5 > 0) {
            if (z7) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        p pVar = this.f6250z;
        if (pVar != null) {
            if (menuItem instanceof D.a) {
                ((D.a) menuItem).a(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f6221A;
        boolean z8 = menuItem instanceof D.a;
        if (z8) {
            ((D.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C.a.j(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f6222B;
        if (z8) {
            ((D.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C.a.r(menuItem, charSequence2);
        }
        char c7 = this.f6238n;
        int i7 = this.f6239o;
        if (z8) {
            ((D.a) menuItem).setAlphabeticShortcut(c7, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C.a.h(menuItem, c7, i7);
        }
        char c8 = this.f6240p;
        int i8 = this.f6241q;
        if (z8) {
            ((D.a) menuItem).setNumericShortcut(c8, i8);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C.a.n(menuItem, c8, i8);
        }
        PorterDuff.Mode mode = this.f6224D;
        if (mode != null) {
            if (z8) {
                ((D.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C.a.m(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f6223C;
        if (colorStateList != null) {
            if (z8) {
                ((D.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C.a.l(menuItem, colorStateList);
            }
        }
    }
}
