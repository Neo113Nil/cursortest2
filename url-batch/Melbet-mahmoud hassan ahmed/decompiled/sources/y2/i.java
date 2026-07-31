package y2;

import a3.g2;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.fb;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.s23;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.u03;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.x13;
import com.google.android.gms.internal.ads.za;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i implements Runnable, cb {

    /* renamed from: i, reason: collision with root package name */
    protected boolean f23401i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f23402j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f23403k;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f23404l;

    /* renamed from: m, reason: collision with root package name */
    private final u03 f23405m;

    /* renamed from: n, reason: collision with root package name */
    private Context f23406n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f23407o;

    /* renamed from: p, reason: collision with root package name */
    private po0 f23408p;

    /* renamed from: q, reason: collision with root package name */
    private final po0 f23409q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f23410r;

    /* renamed from: t, reason: collision with root package name */
    private int f23412t;

    /* renamed from: f, reason: collision with root package name */
    private final List<Object[]> f23398f = new Vector();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<cb> f23399g = new AtomicReference<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<cb> f23400h = new AtomicReference<>();

    /* renamed from: s, reason: collision with root package name */
    final CountDownLatch f23411s = new CountDownLatch(1);

    public i(Context context, po0 po0Var) {
        this.f23406n = context;
        this.f23407o = context;
        this.f23408p = po0Var;
        this.f23409q = po0Var;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f23404l = newCachedThreadPool;
        boolean booleanValue = ((Boolean) sw.c().b(m10.E1)).booleanValue();
        this.f23410r = booleanValue;
        this.f23405m = u03.a(context, newCachedThreadPool, booleanValue);
        this.f23402j = ((Boolean) sw.c().b(m10.A1)).booleanValue();
        this.f23403k = ((Boolean) sw.c().b(m10.F1)).booleanValue();
        if (((Boolean) sw.c().b(m10.D1)).booleanValue()) {
            this.f23412t = 2;
        } else {
            this.f23412t = 1;
        }
        if (!((Boolean) sw.c().b(m10.f8187e2)).booleanValue()) {
            this.f23401i = j();
        }
        if (!((Boolean) sw.c().b(m10.Z1)).booleanValue()) {
            qw.b();
            if (!bo0.p()) {
                run();
                return;
            }
        }
        wo0.f13894a.execute(this);
    }

    private final cb m() {
        return (l() == 2 ? this.f23400h : this.f23399g).get();
    }

    private final void n() {
        cb m7 = m();
        if (this.f23398f.isEmpty() || m7 == null) {
            return;
        }
        for (Object[] objArr : this.f23398f) {
            int length = objArr.length;
            if (length == 1) {
                m7.a((MotionEvent) objArr[0]);
            } else if (length == 3) {
                m7.e(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f23398f.clear();
    }

    private final void o(boolean z6) {
        this.f23399g.set(fb.w(this.f23408p.f10301f, p(this.f23406n), z6, this.f23412t));
    }

    private static final Context p(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void a(MotionEvent motionEvent) {
        cb m7 = m();
        if (m7 == null) {
            this.f23398f.add(new Object[]{motionEvent});
        } else {
            n();
            m7.a(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void b(View view) {
        cb m7 = m();
        if (m7 != null) {
            m7.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String c(Context context, View view, Activity activity) {
        if (!((Boolean) sw.c().b(m10.f7)).booleanValue()) {
            cb m7 = m();
            if (((Boolean) sw.c().b(m10.g7)).booleanValue()) {
                t.q();
                g2.n(view, 2, null);
            }
            return m7 != null ? m7.c(context, view, null) : "";
        }
        if (!k()) {
            return "";
        }
        cb m8 = m();
        if (((Boolean) sw.c().b(m10.g7)).booleanValue()) {
            t.q();
            g2.n(view, 2, null);
        }
        return m8 != null ? m8.c(context, view, null) : "";
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String d(Context context) {
        cb m7;
        if (!k() || (m7 = m()) == null) {
            return "";
        }
        n();
        return m7.d(p(context));
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void e(int i7, int i8, int i9) {
        cb m7 = m();
        if (m7 == null) {
            this.f23398f.add(new Object[]{Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)});
        } else {
            n();
            m7.e(i7, i8, i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String f(Context context, String str, View view) {
        return g(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String g(Context context, String str, View view, Activity activity) {
        if (!k()) {
            return "";
        }
        cb m7 = m();
        if (((Boolean) sw.c().b(m10.g7)).booleanValue()) {
            t.q();
            g2.n(view, 4, null);
        }
        if (m7 == null) {
            return "";
        }
        n();
        return m7.g(p(context), str, view, activity);
    }

    final /* synthetic */ void i(boolean z6) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            za.h(this.f23409q.f10301f, p(this.f23407o), z6, this.f23410r).o();
        } catch (NullPointerException e7) {
            this.f23405m.c(2027, System.currentTimeMillis() - currentTimeMillis, e7);
        }
    }

    protected final boolean j() {
        Context context = this.f23406n;
        u03 u03Var = this.f23405m;
        h hVar = new h(this);
        return new s23(this.f23406n, x13.b(context, u03Var), hVar, ((Boolean) sw.c().b(m10.B1)).booleanValue()).d(1);
    }

    public final boolean k() {
        try {
            this.f23411s.await();
            return true;
        } catch (InterruptedException e7) {
            io0.h("Interrupted during GADSignals creation.", e7);
            return false;
        }
    }

    protected final int l() {
        if (!this.f23402j || this.f23401i) {
            return this.f23412t;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) sw.c().b(m10.f8187e2)).booleanValue()) {
                this.f23401i = j();
            }
            boolean z6 = this.f23408p.f10304i;
            final boolean z7 = false;
            if (!((Boolean) sw.c().b(m10.K0)).booleanValue() && z6) {
                z7 = true;
            }
            if (l() == 1) {
                o(z7);
                if (this.f23412t == 2) {
                    this.f23404l.execute(new Runnable() { // from class: y2.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            i.this.i(z7);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    za h7 = za.h(this.f23408p.f10301f, p(this.f23406n), z7, this.f23410r);
                    this.f23400h.set(h7);
                    if (this.f23403k && !h7.q()) {
                        this.f23412t = 1;
                        o(z7);
                    }
                } catch (NullPointerException e7) {
                    this.f23412t = 1;
                    o(z7);
                    this.f23405m.c(2031, System.currentTimeMillis() - currentTimeMillis, e7);
                }
            }
        } finally {
            this.f23411s.countDown();
            this.f23406n = null;
            this.f23408p = null;
        }
    }
}
