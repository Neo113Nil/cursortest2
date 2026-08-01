package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import k.o;
import k.p;
import k.t;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f1848a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1854h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f1855j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1856k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1857l;

    /* renamed from: m, reason: collision with root package name */
    public int f1858m;

    /* renamed from: n, reason: collision with root package name */
    public char f1859n;

    /* renamed from: o, reason: collision with root package name */
    public int f1860o;

    /* renamed from: p, reason: collision with root package name */
    public char f1861p;

    /* renamed from: q, reason: collision with root package name */
    public int f1862q;

    /* renamed from: r, reason: collision with root package name */
    public int f1863r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1864s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1865t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1866u;

    /* renamed from: v, reason: collision with root package name */
    public int f1867v;

    /* renamed from: w, reason: collision with root package name */
    public int f1868w;

    /* renamed from: x, reason: collision with root package name */
    public String f1869x;

    /* renamed from: y, reason: collision with root package name */
    public String f1870y;

    /* renamed from: z, reason: collision with root package name */
    public p f1871z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f1849b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1850c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f1851e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1852f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1853g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f1848a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f1876c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.f1876c;
        boolean z3 = false;
        menuItem.setChecked(this.f1864s).setVisible(this.f1865t).setEnabled(this.f1866u).setCheckable(this.f1863r >= 1).setTitleCondensed(this.f1857l).setIcon(this.f1858m);
        int i = this.f1867v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f1870y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(context);
            }
            Object obj = hVar.d;
            String str = this.f1870y;
            f fVar = new f();
            fVar.f1846a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f1847b = cls.getMethod(str, f.f1845c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        if (this.f1863r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f2106x = (oVar.f2106x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                h0.a aVar = tVar.f2116c;
                try {
                    if (tVar.d == null) {
                        tVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e5) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e5);
                }
            }
        }
        String str2 = this.f1869x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f1872e, hVar.f1874a));
            z3 = true;
        }
        int i4 = this.f1868w;
        if (i4 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        p pVar = this.f1871z;
        if (pVar != null) {
            if (menuItem instanceof h0.a) {
                ((h0.a) menuItem).a(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z4 = menuItem instanceof h0.a;
        if (z4) {
            ((h0.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0.j.d(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z4) {
            ((h0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0.j.h(menuItem, charSequence2);
        }
        char c4 = this.f1859n;
        int i5 = this.f1860o;
        if (z4) {
            ((h0.a) menuItem).setAlphabeticShortcut(c4, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0.j.c(menuItem, c4, i5);
        }
        char c5 = this.f1861p;
        int i6 = this.f1862q;
        if (z4) {
            ((h0.a) menuItem).setNumericShortcut(c5, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0.j.g(menuItem, c5, i6);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z4) {
                ((h0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n0.j.f(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z4) {
                ((h0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n0.j.e(menuItem, colorStateList);
            }
        }
    }
}
