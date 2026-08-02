package defpackage;

import android.app.Activity;
import android.os.Process;
import android.support.v7.widget.Toolbar;
import android.util.LongSparseArray;
import com.google.android.apps.authenticator2.R;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbp {
    public final Object a;

    public cbp(byte[] bArr) {
        this.a = new ConcurrentHashMap();
        c(new dio("Main", 1, true, diq.a)).d(Process.myPid());
    }

    public static Toolbar a(Activity activity) {
        return (Toolbar) activity.findViewById(R.id.toolbar);
    }

    public static boolean f(gdm gdmVar, geh gehVar, Instant instant) {
        return gdmVar.d() && gdmVar.e() && gdmVar.b().isAfter(instant.minus(gehVar.k));
    }

    public static final htz g(gdn gdnVar, String str) {
        gty aC = hoq.aC(135, str);
        try {
            htz a = gdnVar.a();
            aC.a(a);
            aC.close();
            return a;
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static cbp j(hvi hviVar) {
        return new cbp(hti.f(hviVar, new fxn(4), huf.a));
    }

    public static cbp k(hvi hviVar) {
        return new cbp(hti.f(hviVar, new gzg(null), huf.a));
    }

    public final void b(int i) {
        Object obj = this.a;
        LongSparseArray longSparseArray = ((cxd) obj).b;
        synchronized (longSparseArray) {
            long j = i;
            long[] jArr = (long[]) longSparseArray.get(j);
            if (jArr == null) {
                return;
            }
            long j2 = jArr[0] - 1;
            jArr[0] = j2;
            if (j2 <= 0) {
                longSparseArray.delete(j);
            } else {
                long j3 = ((cxd) obj).a + 1;
                ((cxd) obj).a = j3;
                jArr[1] = j3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final dis c(dio dioVar) {
        dit ditVar = new dit(dioVar);
        this.a.put(dioVar, ditVar);
        return ditVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dgp, java.lang.Object] */
    public final hvm d(hvm hvmVar) {
        ?? r0 = this.a;
        return r0 == 0 ? hvmVar : r0.a();
    }

    public final hvi e(final gdn gdnVar, final geh gehVar) {
        gty aC = hoq.aC(133, "getDataAsFuture");
        try {
            final Instant now = Instant.now();
            htz g = g(gdnVar, "First load");
            htt d = gvx.d(new htt() { // from class: gds
                @Override // defpackage.htt
                public final htz a(bry bryVar, Object obj) {
                    gdm gdmVar = (gdm) obj;
                    geh gehVar2 = gehVar;
                    Instant instant = now;
                    boolean f = cbp.f(gdmVar, gehVar2, instant);
                    gdn gdnVar2 = gdnVar;
                    if (f) {
                        return new htz(hnu.aJ(gdmVar.c()));
                    }
                    gty aC2 = hoq.aC(134, "getDataAsFuture fetch");
                    try {
                        hvi b = gdnVar2.b();
                        aC2.b(b);
                        cbp cbpVar = cbp.this;
                        aC2.close();
                        ((iwq) cbpVar.a).k(b, "com.google.apps.tiktok.account.data.AllAccounts");
                        htz htzVar = new htz(b);
                        htt d2 = gvx.d(new fda(gdnVar2, 6));
                        huf hufVar = huf.a;
                        return htzVar.b(d2, hufVar).a(gvx.e(new gvp(gehVar2, instant, 1)), hufVar);
                    } catch (Throwable th) {
                        try {
                            aC2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
            huf hufVar = huf.a;
            htz b = g.b(d, hufVar);
            aC.a(b);
            hvc f = b.a(new gdt(), hufVar).f();
            aC.close();
            return f;
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean h() {
        return ((gzp) this.a).f();
    }

    public final hvi i() {
        gzp gzpVar = (gzp) this.a;
        return gzpVar.f() ? ((fzv) gzpVar.b()).a() : hve.a;
    }

    public cbp(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public cbp() {
        this.a = new cxd();
    }

    public cbp(gzp gzpVar, byte[] bArr) {
        gzpVar.getClass();
        this.a = gzpVar;
    }

    public cbp(gzp gzpVar) {
        this.a = (dgp) gzpVar.e();
    }

    public cbp(Object obj) {
        this.a = obj;
    }
}
