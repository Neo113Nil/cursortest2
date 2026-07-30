package com.iab.omid.library.toponad.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.toponad.internal.j;
import com.iab.omid.library.toponad.processor.a;
import com.iab.omid.library.toponad.utils.f;
import com.iab.omid.library.toponad.utils.h;
import com.iab.omid.library.toponad.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TreeWalker implements a.InterfaceC0169a {
    private static TreeWalker i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f36459j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f36460k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f36461l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f36462m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f36464b;

    /* renamed from: h, reason: collision with root package name */
    private long f36470h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f36463a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f36465c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.toponad.weakreference.a> f36466d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.toponad.walking.a f36468f = new com.iab.omid.library.toponad.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.toponad.processor.b f36467e = new com.iab.omid.library.toponad.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.toponad.walking.b f36469g = new com.iab.omid.library.toponad.walking.b(new com.iab.omid.library.toponad.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j9);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j9);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f36469g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f36460k != null) {
                TreeWalker.f36460k.post(TreeWalker.f36461l);
                TreeWalker.f36460k.postDelayed(TreeWalker.f36462m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f36470h);
    }

    private void e() {
        this.f36464b = 0;
        this.f36466d.clear();
        this.f36465c = false;
        Iterator<com.iab.omid.library.toponad.adsession.a> it = com.iab.omid.library.toponad.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f36465c = true;
                break;
            }
        }
        this.f36470h = f.b();
    }

    public static TreeWalker getInstance() {
        return i;
    }

    private void i() {
        if (f36460k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f36460k = handler;
            handler.post(f36461l);
            f36460k.postDelayed(f36462m, 200L);
        }
    }

    private void k() {
        Handler handler = f36460k;
        if (handler != null) {
            handler.removeCallbacks(f36462m);
            f36460k = null;
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
        if (this.f36463a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f36463a.add(treeWalkerTimeLogger);
    }

    public void f() {
        TreeWalker treeWalker;
        this.f36468f.e();
        long b9 = f.b();
        com.iab.omid.library.toponad.processor.a a9 = this.f36467e.a();
        if (this.f36468f.b().size() > 0) {
            Iterator<String> it = this.f36468f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a10 = a9.a(null);
                a(next, this.f36468f.a(next), a10);
                com.iab.omid.library.toponad.utils.c.b(a10);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f36469g.a(a10, hashSet, b9);
            }
        }
        if (this.f36468f.c().size() > 0) {
            JSONObject a11 = a9.a(null);
            treeWalker = this;
            treeWalker.a(null, a9, a11, com.iab.omid.library.toponad.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.toponad.utils.c.b(a11);
            treeWalker.f36469g.b(a11, treeWalker.f36468f.c(), b9);
            if (treeWalker.f36465c) {
                Iterator<com.iab.omid.library.toponad.adsession.a> it2 = com.iab.omid.library.toponad.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f36466d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f36469g.b();
        }
        treeWalker.f36468f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f36463a.clear();
        f36459j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f36463a.contains(treeWalkerTimeLogger)) {
            this.f36463a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j9) {
        if (this.f36463a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f36463a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f36464b, TimeUnit.NANOSECONDS.toMillis(j9));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f36464b, j9);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String c4 = this.f36468f.c(view);
        if (c4 == null) {
            return false;
        }
        com.iab.omid.library.toponad.utils.c.a(jSONObject, c4);
        com.iab.omid.library.toponad.utils.c.a(jSONObject, Boolean.valueOf(this.f36468f.e(view)));
        com.iab.omid.library.toponad.utils.c.b(jSONObject, Boolean.valueOf(this.f36468f.c(c4)));
        this.f36468f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.toponad.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.toponad.walking.c cVar, boolean z8) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.toponad.walking.c.PARENT_VIEW, z8);
    }

    @Override // com.iab.omid.library.toponad.processor.a.InterfaceC0169a
    public void a(View view, com.iab.omid.library.toponad.processor.a aVar, JSONObject jSONObject, boolean z8) {
        com.iab.omid.library.toponad.walking.c d2;
        TreeWalker treeWalker;
        if (h.f(view) && (d2 = this.f36468f.d(view)) != com.iab.omid.library.toponad.walking.c.UNDERLYING_VIEW) {
            JSONObject a9 = aVar.a(view);
            com.iab.omid.library.toponad.utils.c.a(jSONObject, a9);
            if (b(view, a9)) {
                treeWalker = this;
            } else {
                boolean z9 = z8 || a(view, a9);
                if (this.f36465c && d2 == com.iab.omid.library.toponad.walking.c.OBSTRUCTION_VIEW && !z9) {
                    this.f36466d.add(new com.iab.omid.library.toponad.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, a9, d2, z9);
            }
            treeWalker.f36464b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.toponad.processor.a b9 = this.f36467e.b();
        String b10 = this.f36468f.b(str);
        if (b10 != null) {
            JSONObject a9 = b9.a(view);
            com.iab.omid.library.toponad.utils.c.a(a9, str);
            com.iab.omid.library.toponad.utils.c.b(a9, b10);
            com.iab.omid.library.toponad.utils.c.a(jSONObject, a9);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0171a b9 = this.f36468f.b(view);
        if (b9 == null) {
            return false;
        }
        com.iab.omid.library.toponad.utils.c.a(jSONObject, b9);
        return true;
    }
}
