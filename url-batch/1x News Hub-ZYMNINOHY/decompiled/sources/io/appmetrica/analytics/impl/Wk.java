package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Wk {

    /* renamed from: a, reason: collision with root package name */
    public final C0457e5 f6838a;

    /* renamed from: b, reason: collision with root package name */
    public final Vk f6839b;

    /* renamed from: c, reason: collision with root package name */
    public final C0432d5 f6840c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0503g f6841d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0503g f6842e;
    public Ik f;

    /* renamed from: g, reason: collision with root package name */
    public int f6843g = 0;

    public Wk(C0457e5 c0457e5, Vk vk, C0432d5 c0432d5, C0721oa c0721oa, H2 h22) {
        this.f6838a = c0457e5;
        this.f6840c = c0432d5;
        this.f6841d = c0721oa;
        this.f6842e = h22;
        this.f6839b = vk;
    }

    public final synchronized long a() {
        Ik ik;
        ik = this.f;
        return ik == null ? 10000000000L : ik.f6168d - 1;
    }

    public final void b(Ik ik, W5 w5) {
        if (ik.f6170g && ik.f6168d > 0) {
            C0432d5 c0432d5 = this.f6840c;
            W5 a3 = W5.a(w5, EnumC0567ib.EVENT_TYPE_ALIVE);
            Yk yk = new Yk();
            yk.f6914a = ik.f6168d;
            yk.f6917d = ik.f6167c.f6292a;
            long andIncrement = ik.f.getAndIncrement();
            Zk zk = ik.f6166b;
            zk.a(Zk.f6958g, Long.valueOf(ik.f.get()));
            zk.b();
            yk.f6915b = andIncrement;
            yk.f6916c = TimeUnit.MILLISECONDS.toSeconds(Math.max(ik.f6172i - ik.f6169e, ik.f6173j));
            c0432d5.f7172a.f7237n.a(a3, yk);
            if (ik.f6170g) {
                ik.f6170g = false;
                Zk zk2 = ik.f6166b;
                zk2.a(Zk.f6960i, Boolean.FALSE);
                zk2.b();
            }
        }
        PublicLogger publicLogger = this.f6838a.f7236m;
        int ordinal = ik.f6167c.f6292a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (ik) {
            Zk zk3 = ik.f6166b;
            zk3.getClass();
            zk3.f6963c = new C0670mb();
            zk3.b();
            ik.f6171h = null;
        }
    }

    public final synchronized void c(W5 w5) {
        try {
            if (this.f6843g == 0) {
                Ik b3 = this.f6841d.b();
                if (a(b3, w5)) {
                    this.f = b3;
                    this.f6843g = 3;
                } else {
                    Ik b4 = this.f6842e.b();
                    if (a(b4, w5)) {
                        this.f = b4;
                        this.f6843g = 2;
                    } else {
                        this.f = null;
                        this.f6843g = 1;
                    }
                }
            }
            int a3 = Q7.a(this.f6843g);
            if (a3 == 0) {
                this.f = a(w5);
            } else if (a3 == 1) {
                b(this.f, w5);
                this.f = a(w5);
            } else if (a3 == 2) {
                if (a(this.f, w5)) {
                    Ik ik = this.f;
                    long j3 = w5.f6822i;
                    ik.f6172i = j3;
                    Zk zk = ik.f6166b;
                    zk.a(Zk.f6956d, Long.valueOf(j3));
                    zk.b();
                } else {
                    this.f = a(w5);
                }
            }
        } finally {
        }
    }

    public final Ik a(W5 w5) {
        this.f6838a.f7236m.info("Start foreground session", new Object[0]);
        long j3 = w5.f6822i;
        AbstractC0503g abstractC0503g = this.f6841d;
        Jk jk = new Jk(j3, w5.f6823j);
        abstractC0503g.getClass();
        Ik a3 = abstractC0503g.a(jk);
        this.f6843g = 3;
        ((C0793r5) this.f6838a.f7238p).e();
        C0432d5 c0432d5 = this.f6840c;
        c0432d5.f7172a.f7237n.a(W5.a(w5, C0876ua.f8420H.i()), a(a3, j3));
        return a3;
    }

    public static Yk a(Ik ik, long j3) {
        Yk yk = new Yk();
        yk.f6914a = ik.f6168d;
        long andIncrement = ik.f.getAndIncrement();
        Zk zk = ik.f6166b;
        zk.a(Zk.f6958g, Long.valueOf(ik.f.get()));
        zk.b();
        yk.f6915b = andIncrement;
        Zk zk2 = ik.f6166b;
        long j4 = j3 - ik.f6169e;
        ik.f6173j = j4;
        zk2.a(Zk.f6957e, Long.valueOf(j4));
        yk.f6916c = TimeUnit.MILLISECONDS.toSeconds(ik.f6173j);
        yk.f6917d = ik.f6167c.f6292a;
        return yk;
    }

    public final synchronized Ik b(W5 w5) {
        try {
            if (this.f6843g == 0) {
                Ik b3 = this.f6841d.b();
                if (a(b3, w5)) {
                    this.f = b3;
                    this.f6843g = 3;
                } else {
                    Ik b4 = this.f6842e.b();
                    if (a(b4, w5)) {
                        this.f = b4;
                        this.f6843g = 2;
                    } else {
                        this.f = null;
                        this.f6843g = 1;
                    }
                }
            }
            if (this.f6843g != 1 && !a(this.f, w5)) {
                this.f6843g = 1;
                this.f = null;
            }
            int a3 = Q7.a(this.f6843g);
            if (a3 == 1) {
                Ik ik = this.f;
                long j3 = w5.f6822i;
                ik.f6172i = j3;
                Zk zk = ik.f6166b;
                zk.a(Zk.f6956d, Long.valueOf(j3));
                zk.b();
                return this.f;
            }
            if (a3 != 2) {
                this.f6838a.f7236m.info("Start background session", new Object[0]);
                this.f6843g = 2;
                long j4 = w5.f6822i;
                AbstractC0503g abstractC0503g = this.f6842e;
                Jk jk = new Jk(j4, w5.f6823j);
                abstractC0503g.getClass();
                Ik a4 = abstractC0503g.a(jk);
                if (this.f6838a.f7242t.c()) {
                    C0432d5 c0432d5 = this.f6840c;
                    c0432d5.f7172a.f7237n.a(W5.a(w5, C0876ua.f8420H.i()), a(a4, w5.f6822i));
                } else {
                    int i3 = w5.f6818d;
                    EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
                    if (i3 == 6145) {
                        C0432d5 c0432d52 = this.f6840c;
                        c0432d52.f7172a.f7237n.a(w5, a(a4, j4));
                        C0432d5 c0432d53 = this.f6840c;
                        c0432d53.f7172a.f7237n.a(W5.a(w5, C0876ua.f8420H.i()), a(a4, j4));
                    }
                }
                this.f = a4;
                return a4;
            }
            return this.f;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Ik ik, W5 w5) {
        boolean z;
        boolean z2;
        boolean z3;
        if (ik == null) {
            return false;
        }
        long j3 = w5.f6822i;
        boolean z4 = ik.f6168d >= 0;
        if (ik.f6171h == null) {
            synchronized (ik) {
                if (ik.f6171h == null) {
                    try {
                        String asString = ik.f6165a.f7229e.a(ik.f6168d, ik.f6167c.f6292a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            ik.f6171h = new Xk(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Xk xk = ik.f6171h;
        if (xk != null) {
            C0754ph c0754ph = (C0754ph) ik.f6165a.f7234k.a();
            List L = c2.f.L(Boolean.valueOf(TextUtils.equals(c0754ph.getAnalyticsSdkVersionName(), xk.f6872a)), Boolean.valueOf(TextUtils.equals(c0754ph.getAnalyticsSdkBuildNumber(), xk.f6873b)), Boolean.valueOf(TextUtils.equals(c0754ph.getAppVersion(), xk.f6874c)), Boolean.valueOf(TextUtils.equals(c0754ph.getAppBuildNumber(), xk.f6875d)), Boolean.valueOf(TextUtils.equals(c0754ph.getOsVersion(), xk.f6876e)), Boolean.valueOf(xk.f == c0754ph.getOsApiLevel()), Boolean.valueOf(xk.f6877g == c0754ph.f8094r));
            if (!L.isEmpty()) {
                Iterator it = L.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z = true;
            long elapsedRealtime = ik.f6174k.elapsedRealtime();
            long j4 = ik.f6172i;
            z2 = elapsedRealtime >= j4;
            long j5 = j3 - j4;
            long j6 = j3 - ik.f6169e;
            if (!z2) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Lk lk = ik.f6167c;
                int i3 = ((C0754ph) ik.f6165a.f7234k.a()).f;
                Integer num = lk.f6295d;
                if (num != null) {
                    i3 = num.intValue();
                }
                if (j5 < timeUnit.toMillis(i3) && j6 < timeUnit.toMillis(Mk.f6348a)) {
                    z3 = false;
                    if (!z4 && z && !z3) {
                        return true;
                    }
                    b(ik, w5);
                    return false;
                }
            }
            z3 = true;
            if (!z4) {
            }
            b(ik, w5);
            return false;
        }
        z = false;
        long elapsedRealtime2 = ik.f6174k.elapsedRealtime();
        long j42 = ik.f6172i;
        if (elapsedRealtime2 >= j42) {
        }
        long j52 = j3 - j42;
        long j62 = j3 - ik.f6169e;
        if (!z2) {
        }
        z3 = true;
        if (!z4) {
        }
        b(ik, w5);
        return false;
    }
}
