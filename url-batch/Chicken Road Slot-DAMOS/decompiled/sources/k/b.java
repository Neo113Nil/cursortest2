package k;

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
import kotlin.collections.i0;
import l.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    public CharSequence A;
    public final /* synthetic */ c D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f5262a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5268h;

    /* renamed from: i, reason: collision with root package name */
    public int f5269i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f5270k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f5271l;

    /* renamed from: m, reason: collision with root package name */
    public int f5272m;

    /* renamed from: n, reason: collision with root package name */
    public char f5273n;

    /* renamed from: o, reason: collision with root package name */
    public int f5274o;

    /* renamed from: p, reason: collision with root package name */
    public char f5275p;

    /* renamed from: q, reason: collision with root package name */
    public int f5276q;

    /* renamed from: r, reason: collision with root package name */
    public int f5277r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5278s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5279t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5280u;

    /* renamed from: v, reason: collision with root package name */
    public int f5281v;

    /* renamed from: w, reason: collision with root package name */
    public int f5282w;

    /* renamed from: x, reason: collision with root package name */
    public String f5283x;

    /* renamed from: y, reason: collision with root package name */
    public String f5284y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f5285z;
    public ColorStateList B = null;
    public PorterDuff.Mode C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f5263b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f5264c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f5265d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f5266e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5267f = true;
    public boolean g = true;

    public b(c cVar, Menu menu) {
        this.D = cVar;
        this.f5262a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.D.f5290c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        c cVar = this.D;
        Context context = cVar.f5290c;
        boolean z10 = false;
        menuItem.setChecked(this.f5278s).setVisible(this.f5279t).setEnabled(this.f5280u).setCheckable(this.f5277r >= 1).setTitleCondensed(this.f5271l).setIcon(this.f5272m);
        int i3 = this.f5281v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        if (this.f5284y != null) {
            if (context.isRestricted()) {
                i0.l("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (cVar.f5291d == null) {
                cVar.f5291d = c.a(context);
            }
            Object obj = cVar.f5291d;
            String str = this.f5284y;
            a aVar = new a();
            aVar.f5260a = obj;
            Class<?> cls = obj.getClass();
            try {
                aVar.f5261b = cls.getMethod(str, a.f5259c);
                menuItem.setOnMenuItemClickListener(aVar);
            } catch (Exception e2) {
                StringBuilder q3 = v4.a.q("Couldn't resolve menu item onClick handler ", str, " in class ");
                q3.append(cls.getName());
                InflateException inflateException = new InflateException(q3.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f5277r >= 2 && (menuItem instanceof j)) {
            j jVar = (j) menuItem;
            jVar.f5704x = (jVar.f5704x & (-5)) | 4;
        }
        String str2 = this.f5283x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, c.f5286e, cVar.f5288a));
            z10 = true;
        }
        int i10 = this.f5282w;
        if (i10 > 0) {
            if (z10) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        CharSequence charSequence = this.f5285z;
        boolean z11 = menuItem instanceof j;
        if (z11) {
            ((j) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e3.j.k(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.A;
        if (z11) {
            ((j) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e3.j.s(menuItem, charSequence2);
        }
        char c10 = this.f5273n;
        int i11 = this.f5274o;
        if (z11) {
            ((j) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e3.j.i(menuItem, c10, i11);
        }
        char c11 = this.f5275p;
        int i12 = this.f5276q;
        if (z11) {
            ((j) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            e3.j.o(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.C;
        if (mode != null) {
            if (z11) {
                ((j) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                e3.j.n(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            if (z11) {
                ((j) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                e3.j.m(menuItem, colorStateList);
            }
        }
    }
}
