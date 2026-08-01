package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import k.o;
import k.p;
import k.t;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2092a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2098j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2099k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2100l;

    /* renamed from: m, reason: collision with root package name */
    public int f2101m;

    /* renamed from: n, reason: collision with root package name */
    public char f2102n;

    /* renamed from: o, reason: collision with root package name */
    public int f2103o;

    /* renamed from: p, reason: collision with root package name */
    public char f2104p;

    /* renamed from: q, reason: collision with root package name */
    public int f2105q;

    /* renamed from: r, reason: collision with root package name */
    public int f2106r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2107s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2108t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2109u;

    /* renamed from: v, reason: collision with root package name */
    public int f2110v;

    /* renamed from: w, reason: collision with root package name */
    public int f2111w;

    /* renamed from: x, reason: collision with root package name */
    public String f2112x;

    /* renamed from: y, reason: collision with root package name */
    public String f2113y;

    /* renamed from: z, reason: collision with root package name */
    public p f2114z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2093b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2094c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2095e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2096f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2097g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f2092a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f2119c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.f2119c;
        boolean z4 = false;
        menuItem.setChecked(this.f2107s).setVisible(this.f2108t).setEnabled(this.f2109u).setCheckable(this.f2106r >= 1).setTitleCondensed(this.f2100l).setIcon(this.f2101m);
        int i = this.f2110v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f2113y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(context);
            }
            Object obj = hVar.d;
            String str = this.f2113y;
            f fVar = new f();
            fVar.f2090a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2091b = cls.getMethod(str, f.f2089c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        if (this.f2106r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f2254x = (oVar.f2254x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                h0.a aVar = tVar.f2264c;
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
        String str2 = this.f2112x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f2115e, hVar.f2117a));
            z4 = true;
        }
        int i4 = this.f2111w;
        if (i4 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        p pVar = this.f2114z;
        if (pVar != null) {
            if (menuItem instanceof h0.a) {
                ((h0.a) menuItem).a(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z5 = menuItem instanceof h0.a;
        if (z5) {
            ((h0.a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z5) {
            ((h0.a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c5 = this.f2102n;
        int i5 = this.f2103o;
        if (z5) {
            ((h0.a) menuItem).setAlphabeticShortcut(c5, i5);
        } else {
            menuItem.setAlphabeticShortcut(c5, i5);
        }
        char c6 = this.f2104p;
        int i6 = this.f2105q;
        if (z5) {
            ((h0.a) menuItem).setNumericShortcut(c6, i6);
        } else {
            menuItem.setNumericShortcut(c6, i6);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z5) {
                ((h0.a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z5) {
                ((h0.a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
