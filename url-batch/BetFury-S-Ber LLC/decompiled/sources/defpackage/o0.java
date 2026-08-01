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
import com.trembin.nirefon.betfury.data.Note;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class o0 implements g20, p10, oy, q40, g6, t10, z00, wf, yf, yl {
    public final /* synthetic */ int f;
    public Object g;

    public o0(int i) {
        this.f = i;
        switch (i) {
            case 16:
                TimeUnit.MINUTES.getClass();
                this.g = new r70(kh0.h);
                break;
            case 27:
                this.g = new ArrayList(20);
                break;
            default:
                this.g = new n0(this);
                break;
        }
    }

    public static o0 y(Context context, int i) {
        bi.n("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c70.u);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList r = mv.r(context, obtainStyledAttributes, 4);
        ColorStateList r2 = mv.r(context, obtainStyledAttributes, 9);
        ColorStateList r3 = mv.r(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
        g gVar = new g(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        gd0 a = gd0.h(contextThemeWrapper.obtainStyledAttributes(c70.G), gVar).a();
        obtainStyledAttributes.recycle();
        return new o0(r, r2, r3, dimensionPixelSize, a, rect);
    }

    public m0 A(int i) {
        return null;
    }

    public void B(int i, int i2) {
        k7 k7Var = (k7) this.g;
        Object obj = k7Var.f.get(i);
        Object obj2 = k7Var.g.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        k7Var.i.b.getClass();
    }

    public void C() {
        ((xp) this.g).r.M();
    }

    public boolean D(int i, int i2, Bundle bundle) {
        return false;
    }

    public void E(String str) {
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

    @Override // defpackage.g20
    public void a(r10 r10Var, boolean z) {
        if (r10Var instanceof wf0) {
            ((wf0) r10Var).z.k().c(false);
        }
        g20 g20Var = ((l1) this.g).j;
        if (g20Var != null) {
            g20Var.a(r10Var, z);
        }
    }

    @Override // defpackage.yl
    public void b(final bi biVar) {
        be beVar = new be("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), beVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: bm
            @Override // java.lang.Runnable
            public final void run() {
                o0 o0Var = o0.this;
                bi biVar2 = biVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    ep k = mv.k((Context) o0Var.g);
                    if (k == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    dp dpVar = (dp) ((yl) k.b);
                    synchronized (dpVar.i) {
                        dpVar.k = threadPoolExecutor2;
                    }
                    ((yl) k.b).b(new cm(biVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    biVar2.L(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // defpackage.wf
    public zf build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.g).build();
        return new zf(new o0(build));
    }

    @Override // defpackage.yf
    public ClipData c() {
        ClipData clip;
        clip = ((ContentInfo) this.g).getClip();
        return clip;
    }

    @Override // defpackage.oy
    public void d(int i, int i2) {
        ((c40) this.g).a.e(i, i2);
    }

    @Override // defpackage.oy
    public void e(int i, int i2) {
        ((c40) this.g).a.b(i, i2);
    }

    @Override // defpackage.p10
    public boolean g(r10 r10Var, MenuItem menuItem) {
        boolean onMenuItemSelected;
        o1 o1Var = ((ActionMenuView) this.g).F;
        if (o1Var != null) {
            Toolbar toolbar = ((pi0) o1Var).f;
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    ti0 ti0Var = toolbar.N;
                    onMenuItemSelected = ti0Var != null ? ((vi0) ti0Var).f.t.onMenuItemSelected(0, menuItem) : false;
                } else if (((eq) it.next()).a.o()) {
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

    @Override // defpackage.t10
    public void h(r10 r10Var, MenuItem menuItem) {
        ((wa) this.g).l.removeCallbacksAndMessages(r10Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q40
    public dp0 i(View view, dp0 dp0Var) {
        int i = 0;
        switch (this.f) {
            case 6:
                AppBarLayout appBarLayout = (AppBarLayout) this.g;
                dp0 dp0Var2 = appBarLayout.getFitsSystemWindows() ? dp0Var : null;
                if (!Objects.equals(appBarLayout.l, dp0Var2)) {
                    appBarLayout.l = dp0Var2;
                    if (appBarLayout.B != null && appBarLayout.getTopInset() > 0) {
                        i = 1;
                    }
                    appBarLayout.setWillNotDraw(i ^ 1);
                    appBarLayout.requestLayout();
                    break;
                }
                break;
            case 11:
                l9 l9Var = (l9) this.g;
                k9 k9Var = l9Var.s;
                if (k9Var != null) {
                    l9Var.l.a0.remove(k9Var);
                }
                k9 k9Var2 = new k9(l9Var.o, dp0Var);
                l9Var.s = k9Var2;
                k9Var2.e(l9Var.getWindow());
                BottomSheetBehavior bottomSheetBehavior = l9Var.l;
                k9 k9Var3 = l9Var.s;
                ArrayList arrayList = bottomSheetBehavior.a0;
                if (!arrayList.contains(k9Var3)) {
                    arrayList.add(k9Var3);
                    break;
                }
                break;
            default:
                ap0 ap0Var = dp0Var.a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g;
                if (!Objects.equals(coordinatorLayout.s, dp0Var)) {
                    coordinatorLayout.s = dp0Var;
                    boolean z = dp0Var.d() > 0;
                    coordinatorLayout.t = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!ap0Var.r()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = hm0.a;
                            if (!childAt.getFitsSystemWindows() || ((kg) childAt.getLayoutParams()).a == null || !ap0Var.r()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    break;
                }
                break;
        }
        return dp0Var;
    }

    @Override // defpackage.t10
    public void j(r10 r10Var, u10 u10Var) {
        wa waVar = (wa) this.g;
        Handler handler = waVar.l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = waVar.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (r10Var == ((va) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new ua(this, i2 < arrayList.size() ? (va) arrayList.get(i2) : null, u10Var, r10Var), r10Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.yf
    public int k() {
        int flags;
        flags = ((ContentInfo) this.g).getFlags();
        return flags;
    }

    @Override // defpackage.yf
    public ContentInfo l() {
        return (ContentInfo) this.g;
    }

    @Override // defpackage.oy
    public void m(int i, int i2) {
        ((c40) this.g).a.c(i, i2);
    }

    @Override // defpackage.oy
    public void n(int i, int i2) {
        ((c40) this.g).a.d(i, i2);
    }

    @Override // defpackage.p10
    public void o(r10 r10Var) {
        p10 p10Var = ((ActionMenuView) this.g).A;
        if (p10Var != null) {
            p10Var.o(r10Var);
        }
    }

    @Override // defpackage.wf
    public void q(Uri uri) {
        ((ContentInfo.Builder) this.g).setLinkUri(uri);
    }

    @Override // defpackage.yf
    public int r() {
        int source;
        source = ((ContentInfo) this.g).getSource();
        return source;
    }

    @Override // defpackage.wf
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.g).setExtras(bundle);
    }

    @Override // defpackage.g20
    public boolean t(r10 r10Var) {
        l1 l1Var = (l1) this.g;
        if (r10Var == l1Var.h) {
            return false;
        }
        ((wf0) r10Var).A.getClass();
        g20 g20Var = l1Var.j;
        if (g20Var != null) {
            return g20Var.t(r10Var);
        }
        return false;
    }

    public String toString() {
        switch (this.f) {
            case 18:
                return "ContentInfoCompat{" + ((ContentInfo) this.g) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.wf
    public void u(int i) {
        ((ContentInfo.Builder) this.g).setFlags(i);
    }

    public boolean v(int i, int i2) {
        k7 k7Var = (k7) this.g;
        Object obj = k7Var.f.get(i);
        Object obj2 = k7Var.g.get(i2);
        if (obj != null && obj2 != null) {
            k7Var.i.b.getClass();
            return ((Note) obj).equals((Note) obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean w(int i, int i2) {
        k7 k7Var = (k7) this.g;
        Object obj = k7Var.f.get(i);
        Object obj2 = k7Var.g.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        k7Var.i.b.getClass();
        return ((Note) obj).getId() == ((Note) obj2).getId();
    }

    public bt x() {
        return new bt((String[]) ((ArrayList) this.g).toArray(new String[0]));
    }

    public m0 z(int i) {
        return null;
    }

    public /* synthetic */ o0(int i, boolean z) {
        this.f = i;
    }

    public o0(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, gd0 gd0Var, Rect rect) {
        this.f = 12;
        bi.o(rect.left);
        bi.o(rect.top);
        bi.o(rect.right);
        bi.o(rect.bottom);
        this.g = gd0Var;
    }

    public o0(Context context, zv zvVar) {
        this.f = 26;
        this.g = new GestureDetector(context, zvVar, null);
    }

    public o0(TextView textView) {
        this.f = 22;
        this.g = new om(textView);
    }

    public o0(EditText editText) {
        this.f = 21;
        this.g = new i5(editText, 13);
    }

    public /* synthetic */ o0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public o0(Context context) {
        this.f = 20;
        this.g = context.getApplicationContext();
    }

    public o0(ContentInfo contentInfo) {
        this.f = 18;
        contentInfo.getClass();
        this.g = c9.l(contentInfo);
    }

    public o0(ClipData clipData, int i) {
        this.f = 17;
        this.g = c9.j(clipData, i);
    }

    public void f(int i) {
    }

    public void p(int i) {
    }

    public void s(int i, float f) {
    }
}
