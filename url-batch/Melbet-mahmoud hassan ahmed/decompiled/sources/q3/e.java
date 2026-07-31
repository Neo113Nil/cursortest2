package q3;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p3.a;

/* loaded from: classes.dex */
public class e implements Handler.Callback {

    /* renamed from: w, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f20240w = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: x, reason: collision with root package name */
    private static final Status f20241x = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: y, reason: collision with root package name */
    private static final Object f20242y = new Object();

    /* renamed from: z, reason: collision with root package name */
    private static e f20243z;

    /* renamed from: j, reason: collision with root package name */
    private r3.r f20248j;

    /* renamed from: k, reason: collision with root package name */
    private r3.t f20249k;

    /* renamed from: l, reason: collision with root package name */
    private final Context f20250l;

    /* renamed from: m, reason: collision with root package name */
    private final o3.e f20251m;

    /* renamed from: n, reason: collision with root package name */
    private final r3.d0 f20252n;

    /* renamed from: r, reason: collision with root package name */
    private q f20256r;

    /* renamed from: u, reason: collision with root package name */
    private final Handler f20259u;

    /* renamed from: v, reason: collision with root package name */
    private volatile boolean f20260v;

    /* renamed from: f, reason: collision with root package name */
    private long f20244f = 5000;

    /* renamed from: g, reason: collision with root package name */
    private long f20245g = 120000;

    /* renamed from: h, reason: collision with root package name */
    private long f20246h = 10000;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20247i = false;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicInteger f20253o = new AtomicInteger(1);

    /* renamed from: p, reason: collision with root package name */
    private final AtomicInteger f20254p = new AtomicInteger(0);

    /* renamed from: q, reason: collision with root package name */
    private final Map<b<?>, z<?>> f20255q = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: s, reason: collision with root package name */
    private final Set<b<?>> f20257s = new h.b();

    /* renamed from: t, reason: collision with root package name */
    private final Set<b<?>> f20258t = new h.b();

    private e(Context context, Looper looper, o3.e eVar) {
        this.f20260v = true;
        this.f20250l = context;
        a4.e eVar2 = new a4.e(looper, this);
        this.f20259u = eVar2;
        this.f20251m = eVar;
        this.f20252n = new r3.d0(eVar);
        if (v3.h.a(context)) {
            this.f20260v = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    static /* synthetic */ boolean a(e eVar, boolean z6) {
        eVar.f20247i = true;
        return true;
    }

    private final z<?> h(p3.e<?> eVar) {
        b<?> f7 = eVar.f();
        z<?> zVar = this.f20255q.get(f7);
        if (zVar == null) {
            zVar = new z<>(this, eVar);
            this.f20255q.put(f7, zVar);
        }
        if (zVar.C()) {
            this.f20258t.add(f7);
        }
        zVar.z();
        return zVar;
    }

    private final <T> void i(j4.i<T> iVar, int i7, p3.e eVar) {
        e0 b7;
        if (i7 == 0 || (b7 = e0.b(this, i7, eVar.f())) == null) {
            return;
        }
        j4.h<T> a7 = iVar.a();
        Handler handler = this.f20259u;
        handler.getClass();
        a7.c(t.a(handler), b7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status j(b<?> bVar, o3.b bVar2) {
        String b7 = bVar.b();
        String valueOf = String.valueOf(bVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(b7).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b7);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(bVar2, sb.toString());
    }

    private final void k() {
        r3.r rVar = this.f20248j;
        if (rVar != null) {
            if (rVar.c() > 0 || s()) {
                l().b(rVar);
            }
            this.f20248j = null;
        }
    }

    private final r3.t l() {
        if (this.f20249k == null) {
            this.f20249k = r3.s.a(this.f20250l);
        }
        return this.f20249k;
    }

    @RecentlyNonNull
    public static e m(@RecentlyNonNull Context context) {
        e eVar;
        synchronized (f20242y) {
            if (f20243z == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f20243z = new e(context.getApplicationContext(), handlerThread.getLooper(), o3.e.l());
            }
            eVar = f20243z;
        }
        return eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@RecentlyNonNull Message message) {
        b bVar;
        boolean l7;
        j4.i<Boolean> b7;
        Boolean valueOf;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        int i7 = message.what;
        z<?> zVar = null;
        switch (i7) {
            case 1:
                this.f20246h = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f20259u.removeMessages(12);
                for (b<?> bVar6 : this.f20255q.keySet()) {
                    Handler handler = this.f20259u;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar6), this.f20246h);
                }
                return true;
            case 2:
                v0 v0Var = (v0) message.obj;
                Iterator<b<?>> it = v0Var.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        b<?> next = it.next();
                        z<?> zVar2 = this.f20255q.get(next);
                        if (zVar2 == null) {
                            v0Var.b(next, new o3.b(13), null);
                        } else if (zVar2.B()) {
                            v0Var.b(next, o3.b.f19842j, zVar2.s().m());
                        } else {
                            o3.b v6 = zVar2.v();
                            if (v6 != null) {
                                v0Var.b(next, v6, null);
                            } else {
                                zVar2.A(v0Var);
                                zVar2.z();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (z<?> zVar3 : this.f20255q.values()) {
                    zVar3.u();
                    zVar3.z();
                }
                return true;
            case 4:
            case c4.w0.f2150p /* 8 */:
            case 13:
                j0 j0Var = (j0) message.obj;
                z<?> zVar4 = this.f20255q.get(j0Var.f20288c.f());
                if (zVar4 == null) {
                    zVar4 = h(j0Var.f20288c);
                }
                if (!zVar4.C() || this.f20254p.get() == j0Var.f20287b) {
                    zVar4.q(j0Var.f20286a);
                } else {
                    j0Var.f20286a.a(f20240w);
                    zVar4.r();
                }
                return true;
            case 5:
                int i8 = message.arg1;
                o3.b bVar7 = (o3.b) message.obj;
                Iterator<z<?>> it2 = this.f20255q.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        z<?> next2 = it2.next();
                        if (next2.D() == i8) {
                            zVar = next2;
                        }
                    }
                }
                if (zVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i8);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                } else if (bVar7.c() == 13) {
                    String e7 = this.f20251m.e(bVar7.c());
                    String g7 = bVar7.g();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(e7).length() + 69 + String.valueOf(g7).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(e7);
                    sb2.append(": ");
                    sb2.append(g7);
                    zVar.i(new Status(17, sb2.toString()));
                } else {
                    bVar = ((z) zVar).f20337h;
                    zVar.i(j(bVar, bVar7));
                }
                return true;
            case 6:
                if (this.f20250l.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f20250l.getApplicationContext());
                    c.b().a(new u(this));
                    if (!c.b().e(true)) {
                        this.f20246h = 300000L;
                    }
                }
                return true;
            case c4.w0.f2149o /* 7 */:
                h((p3.e) message.obj);
                return true;
            case 9:
                if (this.f20255q.containsKey(message.obj)) {
                    this.f20255q.get(message.obj).w();
                }
                return true;
            case 10:
                Iterator<b<?>> it3 = this.f20258t.iterator();
                while (it3.hasNext()) {
                    z<?> remove = this.f20255q.remove(it3.next());
                    if (remove != null) {
                        remove.r();
                    }
                }
                this.f20258t.clear();
                return true;
            case 11:
                if (this.f20255q.containsKey(message.obj)) {
                    this.f20255q.get(message.obj).x();
                }
                return true;
            case 12:
                if (this.f20255q.containsKey(message.obj)) {
                    this.f20255q.get(message.obj).y();
                }
                return true;
            case 14:
                r rVar = (r) message.obj;
                b<?> a7 = rVar.a();
                if (this.f20255q.containsKey(a7)) {
                    l7 = this.f20255q.get(a7).l(false);
                    b7 = rVar.b();
                    valueOf = Boolean.valueOf(l7);
                } else {
                    b7 = rVar.b();
                    valueOf = Boolean.FALSE;
                }
                b7.c(valueOf);
                return true;
            case 15:
                a0 a0Var = (a0) message.obj;
                Map<b<?>, z<?>> map = this.f20255q;
                bVar2 = a0Var.f20220a;
                if (map.containsKey(bVar2)) {
                    Map<b<?>, z<?>> map2 = this.f20255q;
                    bVar3 = a0Var.f20220a;
                    z.I(map2.get(bVar3), a0Var);
                }
                return true;
            case 16:
                a0 a0Var2 = (a0) message.obj;
                Map<b<?>, z<?>> map3 = this.f20255q;
                bVar4 = a0Var2.f20220a;
                if (map3.containsKey(bVar4)) {
                    Map<b<?>, z<?>> map4 = this.f20255q;
                    bVar5 = a0Var2.f20220a;
                    z.J(map4.get(bVar5), a0Var2);
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                f0 f0Var = (f0) message.obj;
                if (f0Var.f20267c == 0) {
                    l().b(new r3.r(f0Var.f20266b, Arrays.asList(f0Var.f20265a)));
                } else {
                    r3.r rVar2 = this.f20248j;
                    if (rVar2 != null) {
                        List<r3.m> g8 = rVar2.g();
                        if (this.f20248j.c() != f0Var.f20266b || (g8 != null && g8.size() >= f0Var.f20268d)) {
                            this.f20259u.removeMessages(17);
                            k();
                        } else {
                            this.f20248j.h(f0Var.f20265a);
                        }
                    }
                    if (this.f20248j == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(f0Var.f20265a);
                        this.f20248j = new r3.r(f0Var.f20266b, arrayList);
                        Handler handler2 = this.f20259u;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), f0Var.f20267c);
                    }
                }
                return true;
            case 19:
                this.f20247i = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i7);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final int n() {
        return this.f20253o.getAndIncrement();
    }

    public final void o(@RecentlyNonNull p3.e<?> eVar) {
        Handler handler = this.f20259u;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    final z p(b<?> bVar) {
        return this.f20255q.get(bVar);
    }

    public final void q() {
        Handler handler = this.f20259u;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final <O extends a.d, ResultT> void r(@RecentlyNonNull p3.e<O> eVar, int i7, @RecentlyNonNull n<a.b, ResultT> nVar, @RecentlyNonNull j4.i<ResultT> iVar, @RecentlyNonNull m mVar) {
        i(iVar, nVar.e(), eVar);
        s0 s0Var = new s0(i7, nVar, iVar, mVar);
        Handler handler = this.f20259u;
        handler.sendMessage(handler.obtainMessage(4, new j0(s0Var, this.f20254p.get(), eVar)));
    }

    final boolean s() {
        if (this.f20247i) {
            return false;
        }
        r3.q a7 = r3.p.b().a();
        if (a7 != null && !a7.h()) {
            return false;
        }
        int b7 = this.f20252n.b(this.f20250l, 203390000);
        return b7 == -1 || b7 == 0;
    }

    final boolean t(o3.b bVar, int i7) {
        return this.f20251m.p(this.f20250l, bVar, i7);
    }

    public final void u(@RecentlyNonNull o3.b bVar, int i7) {
        if (t(bVar, i7)) {
            return;
        }
        Handler handler = this.f20259u;
        handler.sendMessage(handler.obtainMessage(5, i7, 0, bVar));
    }

    final void v(r3.m mVar, int i7, long j7, int i8) {
        Handler handler = this.f20259u;
        handler.sendMessage(handler.obtainMessage(18, new f0(mVar, i7, j7, i8)));
    }
}
