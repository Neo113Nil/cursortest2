package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.internal.j;
import com.iab.omid.library.ironsrc.processor.a;
import com.iab.omid.library.ironsrc.utils.f;
import com.iab.omid.library.ironsrc.utils.h;
import com.iab.omid.library.ironsrc.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TreeWalker implements a.InterfaceC0141a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f14594i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f14595j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f14596k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f14597l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f14598m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f14600b;

    /* renamed from: h, reason: collision with root package name */
    private long f14606h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f14599a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f14601c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.ironsrc.weakreference.a> f14602d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.a f14604f = new com.iab.omid.library.ironsrc.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.processor.b f14603e = new com.iab.omid.library.ironsrc.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.b f14605g = new com.iab.omid.library.ironsrc.walking.b(new com.iab.omid.library.ironsrc.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i4, long j4);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i4, long j4);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f14605g.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f14596k != null) {
                TreeWalker.f14596k.post(TreeWalker.f14597l);
                TreeWalker.f14596k.postDelayed(TreeWalker.f14598m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f14606h);
    }

    private void e() {
        this.f14600b = 0;
        this.f14602d.clear();
        this.f14601c = false;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f14601c = true;
                break;
            }
        }
        this.f14606h = f.b();
    }

    public static TreeWalker getInstance() {
        return f14594i;
    }

    private void i() {
        if (f14596k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f14596k = handler;
            handler.post(f14597l);
            f14596k.postDelayed(f14598m, 200L);
        }
    }

    private void k() {
        Handler handler = f14596k;
        if (handler != null) {
            handler.removeCallbacks(f14598m);
            f14596k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f14599a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f14599a.add(treeWalkerTimeLogger);
    }

    void f() {
        TreeWalker treeWalker;
        this.f14604f.e();
        long b4 = f.b();
        com.iab.omid.library.ironsrc.processor.a a4 = this.f14603e.a();
        if (this.f14604f.b().size() > 0) {
            Iterator<String> it = this.f14604f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a5 = a4.a(null);
                a(next, this.f14604f.a(next), a5);
                com.iab.omid.library.ironsrc.utils.c.b(a5);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f14605g.a(a5, hashSet, b4);
            }
        }
        if (this.f14604f.c().size() > 0) {
            JSONObject a6 = a4.a(null);
            treeWalker = this;
            treeWalker.a(null, a4, a6, com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.ironsrc.utils.c.b(a6);
            treeWalker.f14605g.b(a6, treeWalker.f14604f.c(), b4);
            if (treeWalker.f14601c) {
                Iterator<com.iab.omid.library.ironsrc.adsession.a> it2 = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f14602d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f14605g.b();
        }
        treeWalker.f14604f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f14599a.clear();
        f14595j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f14599a.contains(treeWalkerTimeLogger)) {
            this.f14599a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j4) {
        if (this.f14599a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f14599a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f14600b, TimeUnit.NANOSECONDS.toMillis(j4));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f14600b, j4);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String c4 = this.f14604f.c(view);
        if (c4 == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, c4);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, Boolean.valueOf(this.f14604f.e(view)));
        com.iab.omid.library.ironsrc.utils.c.b(jSONObject, Boolean.valueOf(this.f14604f.c(c4)));
        this.f14604f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.ironsrc.walking.c cVar, boolean z4) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, z4);
    }

    @Override // com.iab.omid.library.ironsrc.processor.a.InterfaceC0141a
    public void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, boolean z4) {
        com.iab.omid.library.ironsrc.walking.c d4;
        TreeWalker treeWalker;
        if (h.f(view) && (d4 = this.f14604f.d(view)) != com.iab.omid.library.ironsrc.walking.c.UNDERLYING_VIEW) {
            JSONObject a4 = aVar.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, a4);
            if (b(view, a4)) {
                treeWalker = this;
            } else {
                boolean z5 = z4 || a(view, a4);
                if (this.f14601c && d4 == com.iab.omid.library.ironsrc.walking.c.OBSTRUCTION_VIEW && !z5) {
                    this.f14602d.add(new com.iab.omid.library.ironsrc.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, a4, d4, z5);
            }
            treeWalker.f14600b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.processor.a b4 = this.f14603e.b();
        String b5 = this.f14604f.b(str);
        if (b5 != null) {
            JSONObject a4 = b4.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(a4, str);
            com.iab.omid.library.ironsrc.utils.c.b(a4, b5);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, a4);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0143a b4 = this.f14604f.b(view);
        if (b4 == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, b4);
        return true;
    }
}
