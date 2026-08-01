package defpackage;

import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moontiko.really.admiralcasino.data.Note;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class rc0 implements sc0, cx, kw, qt, zy, y5, ow, wv, fe, he, kj, cv {
    public static rc0 h;
    public static final ky i = new ky(19);
    public final /* synthetic */ int f;
    public Object g;

    public rc0(int i2) {
        this.f = i2;
        switch (i2) {
            case 17:
                TimeUnit.MINUTES.getClass();
                this.g = new m10(l80.h);
                break;
            case 25:
                this.g = new ArrayList(20);
                break;
            case 28:
                this.g = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.g = new l0(this);
                break;
        }
    }

    public static rc0 C(Context context, int i2) {
        b9.d("Cannot create a CalendarItemStyle with a styleResId of 0", i2 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, y00.v);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList w = kr.w(context, obtainStyledAttributes, 4);
        ColorStateList w2 = kr.w(context, obtainStyledAttributes, 9);
        ColorStateList w3 = kr.w(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
        g gVar = new g(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        f50 a = f50.h(contextThemeWrapper.obtainStyledAttributes(y00.H), gVar).a();
        obtainStyledAttributes.recycle();
        return new rc0(w, w2, w3, dimensionPixelSize, a, rect);
    }

    public kp A() {
        return new kp((String[]) ((ArrayList) this.g).toArray(new String[0]));
    }

    public pc0 B(Class cls, Application application) {
        if (!x2.class.isAssignableFrom(cls)) {
            return D(cls);
        }
        try {
            pc0 pc0Var = (pc0) cls.getConstructor(Application.class).newInstance(application);
            pc0Var.getClass();
            return pc0Var;
        } catch (IllegalAccessException e) {
            g9.o("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            g9.o("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            g9.o("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            g9.o("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public pc0 D(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (pc0) newInstance;
        } catch (IllegalAccessException e) {
            g9.o("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            g9.o("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            g9.o("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public k0 E(int i2) {
        return null;
    }

    public k0 F(int i2) {
        return null;
    }

    public void G(int i2, int i3) {
        b7 b7Var = (b7) this.g;
        Object obj = b7Var.f.get(i2);
        Object obj2 = b7Var.g.get(i3);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        b7Var.i.b.getClass();
    }

    public void H() {
        ((rm) this.g).u.M();
    }

    public boolean I(int i2, int i3, Bundle bundle) {
        return false;
    }

    public void J(String str) {
        ArrayList arrayList = (ArrayList) this.g;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                arrayList.remove(i2);
                arrayList.remove(i2);
                i2 -= 2;
            }
            i2 += 2;
        }
    }

    @Override // defpackage.cx
    public void a(mw mwVar, boolean z) {
        if (mwVar instanceof p70) {
            ((p70) mwVar).z.k().c(false);
        }
        cx cxVar = ((i1) this.g).j;
        if (cxVar != null) {
            cxVar.a(mwVar, z);
        }
    }

    @Override // defpackage.sc0
    public pc0 b(Class cls) {
        Application application = (Application) this.g;
        if (application != null) {
            return B(cls, application);
        }
        g9.u("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.fe
    public ie build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.g).build();
        return new ie(new rc0(build));
    }

    @Override // defpackage.he
    public ClipData c() {
        ClipData clip;
        clip = ((ContentInfo) this.g).getClip();
        return clip;
    }

    @Override // defpackage.qt
    public void d(int i2, int i3) {
        ((ny) this.g).a.e(i2, i3);
    }

    @Override // defpackage.qt
    public void e(int i2, int i3) {
        ((ny) this.g).a.b(i2, i3);
    }

    @Override // defpackage.kw
    public boolean g(mw mwVar, MenuItem menuItem) {
        l1 l1Var = ((ActionMenuView) this.g).E;
        if (l1Var == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((l90) l1Var).f.L.i).iterator();
        while (it.hasNext()) {
            if (((ym) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ow
    public void h(mw mwVar, MenuItem menuItem) {
        ((da) this.g).l.removeCallbacksAndMessages(mwVar);
    }

    @Override // defpackage.kj
    public void i(final b9 b9Var) {
        zc zcVar = new zc("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), zcVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: nj
            @Override // java.lang.Runnable
            public final void run() {
                rc0 rc0Var = rc0.this;
                b9 b9Var2 = b9Var;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    yl p = la0.p((Context) rc0Var.g);
                    if (p == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    xl xlVar = (xl) ((kj) p.b);
                    synchronized (xlVar.i) {
                        xlVar.k = threadPoolExecutor2;
                    }
                    ((kj) p.b).i(new oj(b9Var2, threadPoolExecutor2));
                } catch (Throwable th) {
                    b9Var2.y(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // defpackage.ow
    public void j(mw mwVar, qw qwVar) {
        da daVar = (da) this.g;
        Handler handler = daVar.l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = daVar.n;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (mwVar == ((ca) arrayList.get(i2)).b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        handler.postAtTime(new ba(this, i3 < arrayList.size() ? (ca) arrayList.get(i3) : null, qwVar, mwVar), mwVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.sc0
    public pc0 k(Class cls, qx qxVar) {
        if (((Application) this.g) != null) {
            return b(cls);
        }
        Application application = (Application) ((LinkedHashMap) qxVar.a).get(i);
        if (application != null) {
            return B(cls, application);
        }
        if (!x2.class.isAssignableFrom(cls)) {
            return D(cls);
        }
        g9.i("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy
    public ye0 l(View view, ye0 ye0Var) {
        int i2 = 0;
        switch (this.f) {
            case 7:
                AppBarLayout appBarLayout = (AppBarLayout) this.g;
                ye0 ye0Var2 = appBarLayout.getFitsSystemWindows() ? ye0Var : null;
                if (!Objects.equals(appBarLayout.l, ye0Var2)) {
                    appBarLayout.l = ye0Var2;
                    if (appBarLayout.B != null && appBarLayout.getTopInset() > 0) {
                        i2 = 1;
                    }
                    appBarLayout.setWillNotDraw(i2 ^ 1);
                    appBarLayout.requestLayout();
                    break;
                }
                break;
            case 12:
                z8 z8Var = (z8) this.g;
                y8 y8Var = z8Var.s;
                if (y8Var != null) {
                    z8Var.l.a0.remove(y8Var);
                }
                y8 y8Var2 = new y8(z8Var.o, ye0Var);
                z8Var.s = y8Var2;
                y8Var2.e(z8Var.getWindow());
                BottomSheetBehavior bottomSheetBehavior = z8Var.l;
                y8 y8Var3 = z8Var.s;
                ArrayList arrayList = bottomSheetBehavior.a0;
                if (!arrayList.contains(y8Var3)) {
                    arrayList.add(y8Var3);
                    break;
                }
                break;
            default:
                ve0 ve0Var = ye0Var.a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g;
                if (!Objects.equals(coordinatorLayout.s, ye0Var)) {
                    coordinatorLayout.s = ye0Var;
                    boolean z = ye0Var.d() > 0;
                    coordinatorLayout.t = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!ve0Var.r()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i2 < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i2);
                            WeakHashMap weakHashMap = ic0.a;
                            if (!childAt.getFitsSystemWindows() || ((re) childAt.getLayoutParams()).a == null || !ve0Var.r()) {
                                i2++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    break;
                }
                break;
        }
        return ye0Var;
    }

    @Override // defpackage.he
    public int m() {
        int flags;
        flags = ((ContentInfo) this.g).getFlags();
        return flags;
    }

    @Override // defpackage.he
    public ContentInfo n() {
        return (ContentInfo) this.g;
    }

    @Override // defpackage.qt
    public void o(int i2, int i3) {
        ((ny) this.g).a.c(i2, i3);
    }

    @Override // defpackage.qt
    public void p(int i2, int i3) {
        ((ny) this.g).a.d(i2, i3);
    }

    @Override // defpackage.kw
    public void q(mw mwVar) {
        l90 l90Var = ((ActionMenuView) this.g).z;
        if (l90Var != null) {
            l90Var.q(mwVar);
        }
    }

    @Override // defpackage.sc0
    public pc0 r(gb gbVar, qx qxVar) {
        return k(gbVar.a(), qxVar);
    }

    @Override // defpackage.fe
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.g).setExtras(bundle);
    }

    @Override // defpackage.fe
    public void t(Uri uri) {
        ((ContentInfo.Builder) this.g).setLinkUri(uri);
    }

    public String toString() {
        switch (this.f) {
            case 19:
                return "ContentInfoCompat{" + ((ContentInfo) this.g) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.he
    public int u() {
        int source;
        source = ((ContentInfo) this.g).getSource();
        return source;
    }

    @Override // defpackage.cx
    public boolean w(mw mwVar) {
        i1 i1Var = (i1) this.g;
        if (mwVar == i1Var.h) {
            return false;
        }
        ((p70) mwVar).A.getClass();
        cx cxVar = i1Var.j;
        if (cxVar != null) {
            return cxVar.w(mwVar);
        }
        return false;
    }

    @Override // defpackage.fe
    public void x(int i2) {
        ((ContentInfo.Builder) this.g).setFlags(i2);
    }

    public boolean y(int i2, int i3) {
        b7 b7Var = (b7) this.g;
        Object obj = b7Var.f.get(i2);
        Object obj2 = b7Var.g.get(i3);
        if (obj != null && obj2 != null) {
            b7Var.i.b.getClass();
            return ((Note) obj).equals((Note) obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean z(int i2, int i3) {
        b7 b7Var = (b7) this.g;
        Object obj = b7Var.f.get(i2);
        Object obj2 = b7Var.g.get(i3);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        b7Var.i.b.getClass();
        return ((Note) obj).getId() == ((Note) obj2).getId();
    }

    public /* synthetic */ rc0(int i2, boolean z) {
        this.f = i2;
    }

    public rc0(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, f50 f50Var, Rect rect) {
        this.f = 13;
        b9.e(rect.left);
        b9.e(rect.top);
        b9.e(rect.right);
        b9.e(rect.bottom);
        this.g = f50Var;
    }

    public rc0(TextView textView) {
        this.f = 23;
        this.g = new ak(textView);
    }

    public rc0(EditText editText) {
        this.f = 22;
        this.g = new a5(editText, 13);
    }

    public /* synthetic */ rc0(int i2, Object obj) {
        this.f = i2;
        this.g = obj;
    }

    public rc0(Context context) {
        this.f = 21;
        this.g = context.getApplicationContext();
    }

    @Override // defpackage.y5
    public void f(int i2) {
    }

    @Override // defpackage.y5
    public void s(int i2) {
    }

    public rc0(ContentInfo contentInfo) {
        this.f = 19;
        contentInfo.getClass();
        this.g = q8.l(contentInfo);
    }

    public rc0(ClipData clipData, int i2) {
        this.f = 18;
        this.g = q8.j(clipData, i2);
    }

    public void v(int i2, float f) {
    }
}
