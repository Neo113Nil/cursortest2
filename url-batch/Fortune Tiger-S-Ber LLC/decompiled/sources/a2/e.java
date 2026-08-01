package a2;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.emoji2.text.z;
import androidx.fragment.app.d0;
import androidx.fragment.app.v0;
import androidx.fragment.app.w;
import com.google.android.material.behavior.SwipeDismissBehavior;
import j.e0;
import j.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.d2;
import k.s2;
import k.w0;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class e implements androidx.emoji2.text.k, androidx.emoji2.text.q, g0.a, d2, x, j.k, w0, k0.c, k0.e, l0.o {
    public static e h;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6f;
    public Object g;

    public /* synthetic */ e(int i4, Object obj) {
        this.f6f = i4;
        this.g = obj;
    }

    public static e v(Context context, int i4) {
        k3.d.e("Cannot create a CalendarItemStyle with a styleResId of 0", i4 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, l1.a.f2870p);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList u3 = k3.m.u(context, obtainStyledAttributes, 4);
        ColorStateList u4 = k3.m.u(context, obtainStyledAttributes, 9);
        ColorStateList u5 = k3.m.u(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
        g2.a aVar = new g2.a(0);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        g2.o a4 = g2.o.g(contextThemeWrapper.obtainStyledAttributes(l1.a.A), aVar).a();
        obtainStyledAttributes.recycle();
        return new e(u3, u4, u5, dimensionPixelSize, a4, rect);
    }

    public void A(String str) {
        ArrayList arrayList = (ArrayList) this.g;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i4))) {
                arrayList.remove(i4);
                arrayList.remove(i4);
                i4 -= 2;
            }
            i4 += 2;
        }
    }

    @Override // j.x
    public void a(j.m mVar, boolean z3) {
        if (mVar instanceof e0) {
            ((e0) mVar).f2156z.k().c(false);
        }
        x xVar = ((k.k) this.g).f2569j;
        if (xVar != null) {
            xVar.a(mVar, z3);
        }
    }

    @Override // k0.c
    public k0.f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.g).build();
        return new k0.f(new e(build));
    }

    @Override // k0.e
    public ClipData c() {
        ClipData clip;
        clip = ((ContentInfo) this.g).getClip();
        return clip;
    }

    @Override // l0.o
    public boolean d(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.g;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        boolean z3 = view.getLayoutDirection() == 1;
        int i4 = swipeDismissBehavior.f1191d;
        int width = (!(i4 == 0 && z3) && (i4 != 1 || z3)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = j0.f2752a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // k.d2
    public void e(j.m mVar, MenuItem menuItem) {
        ((j.g) this.g).f2162l.removeCallbacksAndMessages(mVar);
    }

    @Override // androidx.emoji2.text.k
    public void f(final k3.m mVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.m
            @Override // java.lang.Runnable
            public final void run() {
                a2.e eVar = a2.e.this;
                k3.m mVar2 = mVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    u p4 = k3.d.p((Context) eVar.g);
                    if (p4 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    t tVar = (t) ((k) p4.f337b);
                    synchronized (tVar.f360i) {
                        tVar.f362k = threadPoolExecutor2;
                    }
                    ((k) p4.f337b).f(new n(mVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    mVar2.J(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // androidx.emoji2.text.q
    public boolean h(CharSequence charSequence, int i4, int i5, z zVar) {
        if (!TextUtils.equals(charSequence.subSequence(i4, i5), (String) this.g)) {
            return true;
        }
        zVar.c = (zVar.c & 3) | 4;
        return false;
    }

    @Override // j.x
    public boolean i(j.m mVar) {
        k.k kVar = (k.k) this.g;
        if (mVar == kVar.h) {
            return false;
        }
        ((e0) mVar).A.getClass();
        kVar.getClass();
        x xVar = kVar.f2569j;
        if (xVar != null) {
            return xVar.i(mVar);
        }
        return false;
    }

    @Override // j.k
    public void j(j.m mVar) {
        s2 s2Var = ((ActionMenuView) this.g).f224z;
        if (s2Var != null) {
            s2Var.j(mVar);
        }
    }

    @Override // k.d2
    public void k(j.m mVar, j.o oVar) {
        j.g gVar = (j.g) this.g;
        Handler handler = gVar.f2162l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f2164n;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (mVar == ((j.f) arrayList.get(i4)).f2158b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            return;
        }
        int i5 = i4 + 1;
        handler.postAtTime(new j.e(this, i5 < arrayList.size() ? (j.f) arrayList.get(i5) : null, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // j.k
    public boolean l(j.m mVar, MenuItem menuItem) {
        k.n nVar = ((ActionMenuView) this.g).E;
        if (nVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((s2) nVar).f2649f.L.c).iterator();
        while (it.hasNext()) {
            if (((d0) it.next()).f414a.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // k0.e
    public int m() {
        int flags;
        flags = ((ContentInfo) this.g).getFlags();
        return flags;
    }

    @Override // k0.e
    public ContentInfo n() {
        return (ContentInfo) this.g;
    }

    @Override // g0.a
    public void onCancel() {
        ((v0) this.g).a();
    }

    @Override // k0.c
    public void p(Uri uri) {
        ((ContentInfo.Builder) this.g).setLinkUri(uri);
    }

    @Override // k0.e
    public int q() {
        int source;
        source = ((ContentInfo) this.g).getSource();
        return source;
    }

    @Override // k0.c
    public void s(int i4) {
        ((ContentInfo.Builder) this.g).setFlags(i4);
    }

    @Override // k0.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.g).setExtras(bundle);
    }

    public void t(String str, String str2) {
        u2.c.e(str, "name");
        u2.c.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.g;
        arrayList.add(str);
        arrayList.add(b3.e.q0(str2).toString());
    }

    public String toString() {
        switch (this.f6f) {
            case 23:
                return "ContentInfoCompat{" + ((ContentInfo) this.g) + "}";
            default:
                return super.toString();
        }
    }

    public c3.k u() {
        return new c3.k((String[]) ((ArrayList) this.g).toArray(new String[0]));
    }

    public l0.e w(int i4) {
        return null;
    }

    public l0.e x(int i4) {
        return null;
    }

    public void y() {
        ((w) this.g).f550n.M();
    }

    public boolean z(int i4, int i5, Bundle bundle) {
        return false;
    }

    public /* synthetic */ e(int i4, boolean z3) {
        this.f6f = i4;
    }

    public e(int i4) {
        this.f6f = i4;
        switch (i4) {
            case 10:
                this.g = new ArrayList(20);
                break;
            case 15:
                this.g = new LinkedHashSet();
                break;
            case 16:
                this.g = new Object();
                new Handler(Looper.getMainLooper(), new i2.e(this));
                break;
            case 24:
                this.g = new l0.f(this);
                break;
            case 27:
                this.g = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                u2.c.e(TimeUnit.MINUTES, "timeUnit");
                this.g = new g3.m(f3.d.h);
                break;
        }
    }

    public e(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i4, g2.o oVar, Rect rect) {
        this.f6f = 11;
        k3.d.f(rect.left);
        k3.d.f(rect.top);
        k3.d.f(rect.right);
        k3.d.f(rect.bottom);
        this.g = oVar;
    }

    public e(Context context) {
        this.f6f = 1;
        this.g = context.getApplicationContext();
    }

    public e(d3.b bVar) {
        this.f6f = 13;
        this.g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
    }

    public e(ContentInfo contentInfo) {
        this.f6f = 23;
        contentInfo.getClass();
        this.g = d2.e.g(contentInfo);
    }

    public e(ClipData clipData, int i4) {
        this.f6f = 22;
        this.g = d2.e.e(clipData, i4);
    }

    @Override // k.w0
    public void g(int i4) {
    }

    @Override // k.w0
    public void o(int i4) {
    }

    @Override // androidx.emoji2.text.q
    public Object b() {
        return this;
    }

    @Override // k.w0
    public void r(int i4, float f4) {
    }
}
