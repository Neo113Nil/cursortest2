package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.o;
import j.p;
import j.t;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2043a;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f2048i;

    /* renamed from: j, reason: collision with root package name */
    public int f2049j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2050k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2051l;

    /* renamed from: m, reason: collision with root package name */
    public int f2052m;

    /* renamed from: n, reason: collision with root package name */
    public char f2053n;

    /* renamed from: o, reason: collision with root package name */
    public int f2054o;

    /* renamed from: p, reason: collision with root package name */
    public char f2055p;

    /* renamed from: q, reason: collision with root package name */
    public int f2056q;

    /* renamed from: r, reason: collision with root package name */
    public int f2057r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2058s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2059t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2060u;

    /* renamed from: v, reason: collision with root package name */
    public int f2061v;

    /* renamed from: w, reason: collision with root package name */
    public int f2062w;

    /* renamed from: x, reason: collision with root package name */
    public String f2063x;

    /* renamed from: y, reason: collision with root package name */
    public String f2064y;

    /* renamed from: z, reason: collision with root package name */
    public p f2065z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2044b = 0;
    public int c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2045d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2046e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2047f = true;
    public boolean g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f2043a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.c;
        boolean z3 = false;
        menuItem.setChecked(this.f2058s).setVisible(this.f2059t).setEnabled(this.f2060u).setCheckable(this.f2057r >= 1).setTitleCondensed(this.f2051l).setIcon(this.f2052m);
        int i4 = this.f2061v;
        if (i4 >= 0) {
            menuItem.setShowAsAction(i4);
        }
        if (this.f2064y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f2070d == null) {
                hVar.f2070d = h.a(context);
            }
            Object obj = hVar.f2070d;
            String str = this.f2064y;
            f fVar = new f();
            fVar.f2041a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2042b = cls.getMethod(str, f.c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        if (this.f2057r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f2231x = (oVar.f2231x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                e0.a aVar = tVar.c;
                try {
                    if (tVar.f2241d == null) {
                        tVar.f2241d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f2241d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e5) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e5);
                }
            }
        }
        String str2 = this.f2063x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f2066e, hVar.f2068a));
            z3 = true;
        }
        int i5 = this.f2062w;
        if (i5 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        p pVar = this.f2065z;
        if (pVar != null) {
            if (menuItem instanceof e0.a) {
                ((e0.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z4 = menuItem instanceof e0.a;
        if (z4) {
            ((e0.a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z4) {
            ((e0.a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.f2053n;
        int i6 = this.f2054o;
        if (z4) {
            ((e0.a) menuItem).setAlphabeticShortcut(c, i6);
        } else {
            menuItem.setAlphabeticShortcut(c, i6);
        }
        char c4 = this.f2055p;
        int i7 = this.f2056q;
        if (z4) {
            ((e0.a) menuItem).setNumericShortcut(c4, i7);
        } else {
            menuItem.setNumericShortcut(c4, i7);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z4) {
                ((e0.a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z4) {
                ((e0.a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
