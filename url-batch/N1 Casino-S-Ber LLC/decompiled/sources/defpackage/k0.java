package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class k0 implements bu, kt, zq, wv, o5, ot, fd, hd, jh, uh, h90 {
    public final /* synthetic */ int f;
    public Object g;

    public k0(int i) {
        this.f = i;
        switch (i) {
            case 8:
                break;
            case 13:
                TimeUnit.MINUTES.getClass();
                this.g = new ky(f50.h);
                break;
            case 25:
                this.g = new ArrayList(20);
                break;
            case 29:
                this.g = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.g = new j0(this);
                break;
        }
    }

    public static k0 C(Context context, int i) {
        zo.c("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, vx.s);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList y = e70.y(context, obtainStyledAttributes, 4);
        ColorStateList y2 = e70.y(context, obtainStyledAttributes, 9);
        ColorStateList y3 = e70.y(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
        g gVar = new g(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        d20 a = d20.h(contextThemeWrapper.obtainStyledAttributes(vx.E), gVar).a();
        obtainStyledAttributes.recycle();
        return new k0(y, y2, y3, dimensionPixelSize, a, rect);
    }

    public boolean A(int i, int i2) {
        r6 r6Var = (r6) this.g;
        Object obj = r6Var.f.get(i);
        Object obj2 = r6Var.g.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        Object obj3 = r6Var.i.b.h;
        ov ovVar = (ov) obj;
        ov ovVar2 = (ov) obj2;
        if ((ovVar instanceof mv) && (ovVar2 instanceof mv)) {
            return ((mv) ovVar).a.equals(((mv) ovVar2).a);
        }
        if ((ovVar instanceof nv) && (ovVar2 instanceof nv)) {
            return ((nv) ovVar).a.a.equals(((nv) ovVar2).a.a);
        }
        return false;
    }

    public ym B() {
        return new ym((String[]) ((ArrayList) this.g).toArray(new String[0]));
    }

    public i0 D(int i) {
        return null;
    }

    public i0 E(int i) {
        return null;
    }

    public void F(int i, int i2) {
        r6 r6Var = (r6) this.g;
        Object obj = r6Var.f.get(i);
        Object obj2 = r6Var.g.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        Object obj3 = r6Var.i.b.h;
    }

    public void G() {
        ((ok) this.g).r.M();
    }

    public boolean H(int i, int i2, Bundle bundle) {
        return false;
    }

    public void I(String str) {
        ArrayList arrayList = (ArrayList) this.g;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    @Override // defpackage.bu
    public void a(mt mtVar, boolean z) {
        if (mtVar instanceof m40) {
            ((m40) mtVar).z.k().c(false);
        }
        bu buVar = ((h1) this.g).j;
        if (buVar != null) {
            buVar.a(mtVar, z);
        }
    }

    @Override // defpackage.fd
    public id build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.g).build();
        return new id(new k0(build));
    }

    @Override // defpackage.hd
    public ClipData d() {
        ClipData clip;
        clip = ((ContentInfo) this.g).getClip();
        return clip;
    }

    @Override // defpackage.jh
    public void e(final zo zoVar) {
        zb zbVar = new zb("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), zbVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: lh
            @Override // java.lang.Runnable
            public final void run() {
                k0 k0Var = k0.this;
                zo zoVar2 = zoVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    uj k = e70.k((Context) k0Var.g);
                    if (k == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    tj tjVar = (tj) ((jh) k.b);
                    synchronized (tjVar.i) {
                        tjVar.k = threadPoolExecutor2;
                    }
                    ((jh) k.b).e(new mh(zoVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    zoVar2.A(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // defpackage.zq
    public void f(int i, int i2) {
        ((jv) this.g).a.e(i, i2);
    }

    @Override // defpackage.zq
    public void g(int i, int i2) {
        ((jv) this.g).a.b(i, i2);
    }

    @Override // defpackage.kt
    public boolean i(mt mtVar, MenuItem menuItem) {
        boolean onMenuItemSelected;
        k1 k1Var = ((ActionMenuView) this.g).F;
        if (k1Var != null) {
            Toolbar toolbar = ((b60) k1Var).f;
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    f60 f60Var = toolbar.N;
                    onMenuItemSelected = f60Var != null ? ((h60) f60Var).f.t.onMenuItemSelected(0, menuItem) : false;
                } else if (((vk) it.next()).a.o()) {
                    onMenuItemSelected = true;
                    break;
                }
            }
            if (onMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ot
    public void j(mt mtVar, MenuItem menuItem) {
        ((q9) this.g).l.removeCallbacksAndMessages(mtVar);
    }

    @Override // defpackage.ot
    public void k(mt mtVar, pt ptVar) {
        q9 q9Var = (q9) this.g;
        Handler handler = q9Var.l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = q9Var.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mtVar == ((p9) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new o9(this, i2 < arrayList.size() ? (p9) arrayList.get(i2) : null, ptVar, mtVar), mtVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.h90
    public f90 l(Class cls, pu puVar) {
        c10 c10Var = null;
        for (g90 g90Var : (g90[]) this.g) {
            g90Var.getClass();
            if (c10.class.equals(cls)) {
                c10Var = new c10();
            }
        }
        if (c10Var != null) {
            return c10Var;
        }
        t8.k("No initializer set for given class ".concat(cls.getName()));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wv
    public rb0 m(View view, rb0 rb0Var) {
        int i = 0;
        switch (this.f) {
            case 5:
                AppBarLayout appBarLayout = (AppBarLayout) this.g;
                rb0 rb0Var2 = appBarLayout.getFitsSystemWindows() ? rb0Var : null;
                if (!Objects.equals(appBarLayout.l, rb0Var2)) {
                    appBarLayout.l = rb0Var2;
                    if (appBarLayout.B != null && appBarLayout.getTopInset() > 0) {
                        i = 1;
                    }
                    appBarLayout.setWillNotDraw(i ^ 1);
                    appBarLayout.requestLayout();
                    break;
                }
                break;
            case 9:
                l8 l8Var = (l8) this.g;
                k8 k8Var = l8Var.s;
                if (k8Var != null) {
                    l8Var.l.a0.remove(k8Var);
                }
                k8 k8Var2 = new k8(l8Var.o, rb0Var);
                l8Var.s = k8Var2;
                k8Var2.e(l8Var.getWindow());
                BottomSheetBehavior bottomSheetBehavior = l8Var.l;
                k8 k8Var3 = l8Var.s;
                ArrayList arrayList = bottomSheetBehavior.a0;
                if (!arrayList.contains(k8Var3)) {
                    arrayList.add(k8Var3);
                    break;
                }
                break;
            default:
                ob0 ob0Var = rb0Var.a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g;
                if (!Objects.equals(coordinatorLayout.s, rb0Var)) {
                    coordinatorLayout.s = rb0Var;
                    boolean z = rb0Var.d() > 0;
                    coordinatorLayout.t = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!ob0Var.r()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = x80.a;
                            if (!childAt.getFitsSystemWindows() || ((qd) childAt.getLayoutParams()).a == null || !ob0Var.r()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    break;
                }
                break;
        }
        return rb0Var;
    }

    @Override // defpackage.hd
    public int n() {
        int flags;
        flags = ((ContentInfo) this.g).getFlags();
        return flags;
    }

    @Override // defpackage.hd
    public ContentInfo o() {
        return (ContentInfo) this.g;
    }

    @Override // defpackage.zq
    public void p(int i, int i2) {
        ((jv) this.g).a.c(i, i2);
    }

    @Override // defpackage.zq
    public void q(int i, int i2) {
        ((jv) this.g).a.d(i, i2);
    }

    @Override // defpackage.kt
    public void r(mt mtVar) {
        kt ktVar = ((ActionMenuView) this.g).A;
        if (ktVar != null) {
            ktVar.r(mtVar);
        }
    }

    @Override // defpackage.uh
    public boolean s(CharSequence charSequence, int i, int i2, l70 l70Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.g)) {
            return true;
        }
        l70Var.c = (l70Var.c & 3) | 4;
        return false;
    }

    @Override // defpackage.fd
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.g).setExtras(bundle);
    }

    public String toString() {
        switch (this.f) {
            case 15:
                return "ContentInfoCompat{" + ((ContentInfo) this.g) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fd
    public void u(Uri uri) {
        ((ContentInfo.Builder) this.g).setLinkUri(uri);
    }

    @Override // defpackage.hd
    public int v() {
        int source;
        source = ((ContentInfo) this.g).getSource();
        return source;
    }

    @Override // defpackage.bu
    public boolean x(mt mtVar) {
        h1 h1Var = (h1) this.g;
        if (mtVar == h1Var.h) {
            return false;
        }
        ((m40) mtVar).A.getClass();
        bu buVar = h1Var.j;
        if (buVar != null) {
            return buVar.x(mtVar);
        }
        return false;
    }

    @Override // defpackage.fd
    public void y(int i) {
        ((ContentInfo.Builder) this.g).setFlags(i);
    }

    public boolean z(int i, int i2) {
        r6 r6Var = (r6) this.g;
        Object obj = r6Var.f.get(i);
        Object obj2 = r6Var.g.get(i2);
        if (obj != null && obj2 != null) {
            Object obj3 = r6Var.i.b.h;
            return ((ov) obj).equals((ov) obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public k0(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, d20 d20Var, Rect rect) {
        this.f = 10;
        zo.d(rect.left);
        zo.d(rect.top);
        zo.d(rect.right);
        zo.d(rect.bottom);
        this.g = d20Var;
    }

    public k0(Context context, dp dpVar) {
        this.f = 24;
        this.g = new GestureDetector(context, dpVar, null);
    }

    public k0(TextView textView) {
        this.f = 21;
        this.g = new xh(textView);
    }

    @Override // defpackage.o5
    public void h(int i) {
    }

    @Override // defpackage.o5
    public void t(int i) {
    }

    public k0(EditText editText) {
        this.f = 19;
        this.g = new q4(editText, 14);
    }

    public /* synthetic */ k0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public k0(Context context) {
        this.f = 18;
        this.g = context.getApplicationContext();
    }

    public k0(ContentInfo contentInfo) {
        this.f = 15;
        contentInfo.getClass();
        this.g = c8.l(contentInfo);
    }

    public k0(ClipData clipData, int i) {
        this.f = 14;
        this.g = c8.j(clipData, i);
    }

    @Override // defpackage.uh
    public Object b() {
        return this;
    }

    @Override // defpackage.o5
    public void w(int i, float f) {
    }
}
