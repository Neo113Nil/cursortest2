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
import k.j;
import q3.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {
    public CharSequence A;
    public final /* synthetic */ d D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f3492a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3499h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3500j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3501k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3502l;

    /* renamed from: m, reason: collision with root package name */
    public int f3503m;

    /* renamed from: n, reason: collision with root package name */
    public char f3504n;

    /* renamed from: o, reason: collision with root package name */
    public int f3505o;

    /* renamed from: p, reason: collision with root package name */
    public char f3506p;

    /* renamed from: q, reason: collision with root package name */
    public int f3507q;

    /* renamed from: r, reason: collision with root package name */
    public int f3508r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3509s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3510t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3511u;

    /* renamed from: v, reason: collision with root package name */
    public int f3512v;

    /* renamed from: w, reason: collision with root package name */
    public int f3513w;

    /* renamed from: x, reason: collision with root package name */
    public String f3514x;

    /* renamed from: y, reason: collision with root package name */
    public String f3515y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f3516z;
    public ColorStateList B = null;
    public PorterDuff.Mode C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3493b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f3494c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3495d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3496e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3497f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3498g = true;

    public c(d dVar, Menu menu) {
        this.D = dVar;
        this.f3492a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.D.f3521c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e8) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e8);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        d dVar = this.D;
        Context context = dVar.f3521c;
        boolean z3 = false;
        menuItem.setChecked(this.f3509s).setVisible(this.f3510t).setEnabled(this.f3511u).setCheckable(this.f3508r >= 1).setTitleCondensed(this.f3502l).setIcon(this.f3503m);
        int i = this.f3512v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f3515y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f3522d == null) {
                dVar.f3522d = d.a(context);
            }
            Object obj = dVar.f3522d;
            String str = this.f3515y;
            b bVar = new b();
            bVar.f3490a = obj;
            Class<?> cls = obj.getClass();
            try {
                bVar.f3491b = cls.getMethod(str, b.f3489c);
                menuItem.setOnMenuItemClickListener(bVar);
            } catch (Exception e8) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e8);
                throw inflateException;
            }
        }
        if (this.f3508r >= 2 && (menuItem instanceof j)) {
            j jVar = (j) menuItem;
            jVar.f4111x = (jVar.f4111x & (-5)) | 4;
        }
        String str2 = this.f3514x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, d.f3517e, dVar.f3519a));
            z3 = true;
        }
        int i8 = this.f3513w;
        if (i8 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i8);
            }
        }
        CharSequence charSequence = this.f3516z;
        boolean z7 = menuItem instanceof j;
        if (z7) {
            ((j) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            l.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.A;
        if (z7) {
            ((j) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            l.l(menuItem, charSequence2);
        }
        char c8 = this.f3504n;
        int i9 = this.f3505o;
        if (z7) {
            ((j) menuItem).setAlphabeticShortcut(c8, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            l.g(menuItem, c8, i9);
        }
        char c9 = this.f3506p;
        int i10 = this.f3507q;
        if (z7) {
            ((j) menuItem).setNumericShortcut(c9, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            l.k(menuItem, c9, i10);
        }
        PorterDuff.Mode mode = this.C;
        if (mode != null) {
            if (z7) {
                ((j) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                l.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            if (z7) {
                ((j) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                l.i(menuItem, colorStateList);
            }
        }
    }
}
