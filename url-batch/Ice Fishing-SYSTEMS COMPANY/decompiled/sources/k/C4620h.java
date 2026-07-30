package k;

import O.AbstractC0353o;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.internal.ads.CL;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.o;
import l.s;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4620h {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f38624A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f38625B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C4621i f38628E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f38629a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f38636h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f38637j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f38638k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f38639l;

    /* renamed from: m, reason: collision with root package name */
    public int f38640m;

    /* renamed from: n, reason: collision with root package name */
    public char f38641n;

    /* renamed from: o, reason: collision with root package name */
    public int f38642o;

    /* renamed from: p, reason: collision with root package name */
    public char f38643p;

    /* renamed from: q, reason: collision with root package name */
    public int f38644q;

    /* renamed from: r, reason: collision with root package name */
    public int f38645r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f38646s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f38647t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f38648u;

    /* renamed from: v, reason: collision with root package name */
    public int f38649v;

    /* renamed from: w, reason: collision with root package name */
    public int f38650w;

    /* renamed from: x, reason: collision with root package name */
    public String f38651x;

    /* renamed from: y, reason: collision with root package name */
    public String f38652y;

    /* renamed from: z, reason: collision with root package name */
    public o f38653z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f38626C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f38627D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f38630b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f38631c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f38632d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f38633e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38634f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38635g = true;

    public C4620h(C4621i c4621i, Menu menu) {
        this.f38628E = c4621i;
        this.f38629a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f38628E.f38658c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e6) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z8 = false;
        menuItem.setChecked(this.f38646s).setVisible(this.f38647t).setEnabled(this.f38648u).setCheckable(this.f38645r >= 1).setTitleCondensed(this.f38639l).setIcon(this.f38640m);
        int i = this.f38649v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f38652y;
        C4621i c4621i = this.f38628E;
        if (str != null) {
            if (c4621i.f38658c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c4621i.f38659d == null) {
                c4621i.f38659d = C4621i.a(c4621i.f38658c);
            }
            Object obj = c4621i.f38659d;
            String str2 = this.f38652y;
            MenuItemOnMenuItemClickListenerC4619g menuItemOnMenuItemClickListenerC4619g = new MenuItemOnMenuItemClickListenerC4619g();
            menuItemOnMenuItemClickListenerC4619g.f38622a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC4619g.f38623b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC4619g.f38621c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC4619g);
            } catch (Exception e6) {
                StringBuilder m8 = CL.m("Couldn't resolve menu item onClick handler ", str2, " in class ");
                m8.append(cls.getName());
                InflateException inflateException = new InflateException(m8.toString());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }
        if (this.f38645r >= 2) {
            if (menuItem instanceof l.n) {
                l.n nVar = (l.n) menuItem;
                nVar.f38987Q = (nVar.f38987Q & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                try {
                    Method method = sVar.f39009x;
                    I.a aVar = sVar.f39008w;
                    if (method == null) {
                        sVar.f39009x = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f39009x.invoke(aVar, Boolean.TRUE);
                } catch (Exception e9) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e9);
                }
            }
        }
        String str3 = this.f38651x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C4621i.f38654e, c4621i.f38656a));
            z8 = true;
        }
        int i4 = this.f38650w;
        if (i4 > 0) {
            if (z8) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        o oVar = this.f38653z;
        if (oVar != null) {
            if (menuItem instanceof I.a) {
                ((I.a) menuItem).b(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f38624A;
        boolean z9 = menuItem instanceof I.a;
        if (z9) {
            ((I.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0353o.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f38625B;
        if (z9) {
            ((I.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0353o.m(menuItem, charSequence2);
        }
        char c4 = this.f38641n;
        int i9 = this.f38642o;
        if (z9) {
            ((I.a) menuItem).setAlphabeticShortcut(c4, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0353o.g(menuItem, c4, i9);
        }
        char c9 = this.f38643p;
        int i10 = this.f38644q;
        if (z9) {
            ((I.a) menuItem).setNumericShortcut(c9, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0353o.k(menuItem, c9, i10);
        }
        PorterDuff.Mode mode = this.f38627D;
        if (mode != null) {
            if (z9) {
                ((I.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0353o.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f38626C;
        if (colorStateList != null) {
            if (z9) {
                ((I.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0353o.i(menuItem, colorStateList);
            }
        }
    }
}
