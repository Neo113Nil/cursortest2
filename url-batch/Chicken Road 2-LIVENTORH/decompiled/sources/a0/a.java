package a0;

import a.y;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.r;
import androidx.emoji2.text.t;
import androidx.emoji2.text.z;
import androidx.fragment.app.d0;
import androidx.fragment.app.v0;
import androidx.fragment.app.w;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.e0;
import k.m;
import k.x;
import l.g2;
import l.l;
import l.w2;
import l.z0;
import n0.l0;
import n0.n;
import n0.n1;
import n0.q1;
import o0.o;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class a implements n, n0, androidx.emoji2.text.k, r, j0.b, d1.e, g2, x, k.k, z0, n0.c, n0.e, o {

    /* renamed from: h, reason: collision with root package name */
    public static a f79h;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f80f;

    /* renamed from: g, reason: collision with root package name */
    public Object f81g;

    public /* synthetic */ a(int i, Object obj) {
        this.f80f = i;
        this.f81g = obj;
    }

    public void A() {
        ((w) this.f81g).f570q.K();
    }

    public boolean B(int i, int i4, Bundle bundle) {
        return false;
    }

    @Override // k.x
    public void a(m mVar, boolean z3) {
        if (mVar instanceof e0) {
            ((e0) mVar).f2024z.k().c(false);
        }
        x xVar = ((l) this.f81g).f2362j;
        if (xVar != null) {
            xVar.a(mVar, z3);
        }
    }

    @Override // n0.c
    public n0.f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f81g).build();
        return new n0.f(new a(build));
    }

    @Override // l.g2
    public void c(m mVar, k.o oVar) {
        k.g gVar = (k.g) this.f81g;
        Handler handler = gVar.f2031k;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f2033m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((k.f) arrayList.get(i)).f2026b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i4 = i + 1;
        handler.postAtTime(new k.e(this, i4 < arrayList.size() ? (k.f) arrayList.get(i4) : null, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.x
    public boolean d(m mVar) {
        l lVar = (l) this.f81g;
        if (mVar == lVar.f2361h) {
            return false;
        }
        lVar.D = ((e0) mVar).A.f2085a;
        x xVar = lVar.f2362j;
        if (xVar != null) {
            return xVar.d(mVar);
        }
        return false;
    }

    @Override // n0.e
    public ClipData f() {
        ClipData clip;
        clip = ((ContentInfo) this.f81g).getClip();
        return clip;
    }

    @Override // o0.o
    public boolean g(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f81g;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        boolean z3 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        int width = (!(i == 0 && z3) && (i != 1 || z3)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = l0.f2757a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // n0.e
    public int h() {
        int flags;
        flags = ((ContentInfo) this.f81g).getFlags();
        return flags;
    }

    @Override // d1.e
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.g2
    public void j(m mVar, MenuItem menuItem) {
        ((k.g) this.f81g).f2031k.removeCallbacksAndMessages(mVar);
    }

    @Override // k.k
    public boolean k(m mVar, MenuItem menuItem) {
        l.o oVar = ((ActionMenuView) this.f81g).E;
        if (oVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((w2) oVar).f2489f.L.f356c).iterator();
        while (it.hasNext()) {
            if (((d0) it.next()).f416a.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.e
    public ContentInfo l() {
        return (ContentInfo) this.f81g;
    }

    @Override // d1.e
    public void m(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f81g).setResultCode(i);
    }

    @Override // androidx.emoji2.text.r
    public boolean o(CharSequence charSequence, int i, int i4, z zVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i4), (String) this.f81g)) {
            return true;
        }
        zVar.f372c = (zVar.f372c & 3) | 4;
        return false;
    }

    @Override // j0.b
    public void onCancel() {
        ((v0) this.f81g).a();
    }

    @Override // n0.c
    public void q(Uri uri) {
        ((ContentInfo.Builder) this.f81g).setLinkUri(uri);
    }

    @Override // n0.e
    public int r() {
        int source;
        source = ((ContentInfo) this.f81g).getSource();
        return source;
    }

    @Override // androidx.lifecycle.n0
    public androidx.lifecycle.l0 s(Class cls, a1.c cVar) {
        j0 j0Var = null;
        for (a1.d dVar : (a1.d[]) this.f81g) {
            dVar.getClass();
            if (j0.class.equals(cls)) {
                j0Var = new j0();
            }
        }
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // n0.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f81g).setExtras(bundle);
    }

    @Override // n0.n
    public q1 t(View view, q1 q1Var) {
        n1 n1Var = q1Var.f2775a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f81g;
        if (!Objects.equals(coordinatorLayout.f271s, q1Var)) {
            coordinatorLayout.f271s = q1Var;
            boolean z3 = q1Var.d() > 0;
            coordinatorLayout.f272t = z3;
            coordinatorLayout.setWillNotDraw(!z3 && coordinatorLayout.getBackground() == null);
            if (!n1Var.n()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = l0.f2757a;
                    if (childAt.getFitsSystemWindows() && ((e) childAt.getLayoutParams()).f83a != null && n1Var.n()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return q1Var;
    }

    public String toString() {
        switch (this.f80f) {
            case 21:
                return "ContentInfoCompat{" + ((ContentInfo) this.f81g) + "}";
            default:
                return super.toString();
        }
    }

    @Override // k.k
    public void v(m mVar) {
        w2 w2Var = ((ActionMenuView) this.f81g).f203z;
        if (w2Var != null) {
            w2Var.v(mVar);
        }
    }

    @Override // androidx.emoji2.text.k
    public void w(final y yVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.m
            @Override // java.lang.Runnable
            public final void run() {
                a0.a aVar = a0.a.this;
                a.y yVar2 = yVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    v q3 = a.y.q((Context) aVar.f81g);
                    if (q3 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    u uVar = (u) ((k) q3.f326b);
                    synchronized (uVar.i) {
                        uVar.f361k = threadPoolExecutor2;
                    }
                    ((k) q3.f326b).w(new n(yVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    yVar2.L(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // n0.c
    public void x(int i) {
        ((ContentInfo.Builder) this.f81g).setFlags(i);
    }

    public o0.e y(int i) {
        return null;
    }

    public o0.e z(int i) {
        return null;
    }

    public /* synthetic */ a(int i, boolean z3) {
        this.f80f = i;
    }

    public a(int i) {
        this.f80f = i;
        switch (i) {
            case 24:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f81g = new o0.g(this);
                    break;
                } else {
                    this.f81g = new o0.f(this);
                    break;
                }
            case 25:
            default:
                this.f81g = new Object();
                new Handler(Looper.getMainLooper(), new n2.e(this));
                break;
            case 26:
                this.f81g = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public a(a1.d[] dVarArr) {
        this.f80f = 1;
        f3.d.e(dVarArr, "initializers");
        this.f81g = dVarArr;
    }

    public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f80f = 25;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f81g = new p0.f(uri, clipDescription, uri2);
        } else {
            this.f81g = new t(uri, clipDescription, uri2);
        }
    }

    public a(Context context) {
        this.f80f = 2;
        this.f81g = context.getApplicationContext();
    }

    public a(ContentInfo contentInfo) {
        this.f80f = 21;
        contentInfo.getClass();
        this.f81g = f0.f.k(contentInfo);
    }

    public a(ClipData clipData, int i) {
        this.f80f = 20;
        this.f81g = f0.f.i(clipData, i);
    }

    @Override // l.z0
    public void n(int i) {
    }

    @Override // l.z0
    public void p(int i) {
    }

    @Override // androidx.emoji2.text.r
    public Object e() {
        return this;
    }

    @Override // l.z0
    public void u(int i, float f2) {
    }
}
