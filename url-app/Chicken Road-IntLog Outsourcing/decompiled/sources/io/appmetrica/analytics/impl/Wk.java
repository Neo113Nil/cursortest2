package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import g4.AbstractC0466k;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Wk {

    /* renamed from: a, reason: collision with root package name */
    public final C0608e5 f7673a;

    /* renamed from: b, reason: collision with root package name */
    public final Vk f7674b;

    /* renamed from: c, reason: collision with root package name */
    public final C0583d5 f7675c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0654g f7676d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0654g f7677e;

    /* renamed from: f, reason: collision with root package name */
    public Ik f7678f;

    /* renamed from: g, reason: collision with root package name */
    public int f7679g = 0;

    public Wk(C0608e5 c0608e5, Vk vk, C0583d5 c0583d5, C0872oa c0872oa, H2 h22) {
        this.f7673a = c0608e5;
        this.f7675c = c0583d5;
        this.f7676d = c0872oa;
        this.f7677e = h22;
        this.f7674b = vk;
    }

    public final synchronized long a() {
        Ik ik;
        ik = this.f7678f;
        return ik == null ? 10000000000L : ik.f6968d - 1;
    }

    public final void b(Ik ik, W5 w5) {
        if (ik.f6971g && ik.f6968d > 0) {
            C0583d5 c0583d5 = this.f7675c;
            W5 a6 = W5.a(w5, EnumC0718ib.EVENT_TYPE_ALIVE);
            Yk yk = new Yk();
            yk.f7754a = ik.f6968d;
            yk.f7757d = ik.f6967c.f7099a;
            long andIncrement = ik.f6970f.getAndIncrement();
            Zk zk = ik.f6966b;
            zk.a(Zk.f7799g, Long.valueOf(ik.f6970f.get()));
            zk.b();
            yk.f7755b = andIncrement;
            yk.f7756c = TimeUnit.MILLISECONDS.toSeconds(Math.max(ik.f6973i - ik.f6969e, ik.f6974j));
            c0583d5.f8029a.f8098n.a(a6, yk);
            if (ik.f6971g) {
                ik.f6971g = false;
                Zk zk2 = ik.f6966b;
                zk2.a(Zk.f7801i, Boolean.FALSE);
                zk2.b();
            }
        }
        PublicLogger publicLogger = this.f7673a.f8097m;
        int ordinal = ik.f6967c.f7099a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (ik) {
            Zk zk3 = ik.f6966b;
            zk3.getClass();
            zk3.f7804c = new C0821mb();
            zk3.b();
            ik.f6972h = null;
        }
    }

    public final synchronized void c(W5 w5) {
        try {
            if (this.f7679g == 0) {
                Ik b6 = this.f7676d.b();
                if (a(b6, w5)) {
                    this.f7678f = b6;
                    this.f7679g = 3;
                } else {
                    Ik b7 = this.f7677e.b();
                    if (a(b7, w5)) {
                        this.f7678f = b7;
                        this.f7679g = 2;
                    } else {
                        this.f7678f = null;
                        this.f7679g = 1;
                    }
                }
            }
            int a6 = Q7.a(this.f7679g);
            if (a6 == 0) {
                this.f7678f = a(w5);
            } else if (a6 == 1) {
                b(this.f7678f, w5);
                this.f7678f = a(w5);
            } else if (a6 == 2) {
                if (a(this.f7678f, w5)) {
                    Ik ik = this.f7678f;
                    long j2 = w5.f7656i;
                    ik.f6973i = j2;
                    Zk zk = ik.f6966b;
                    zk.a(Zk.f7796d, Long.valueOf(j2));
                    zk.b();
                } else {
                    this.f7678f = a(w5);
                }
            }
        } finally {
        }
    }

    public final Ik a(W5 w5) {
        this.f7673a.f8097m.info("Start foreground session", new Object[0]);
        long j2 = w5.f7656i;
        AbstractC0654g abstractC0654g = this.f7676d;
        Jk jk = new Jk(j2, w5.f7657j);
        abstractC0654g.getClass();
        Ik a6 = abstractC0654g.a(jk);
        this.f7679g = 3;
        ((C0944r5) this.f7673a.f8100p).e();
        C0583d5 c0583d5 = this.f7675c;
        c0583d5.f8029a.f8098n.a(W5.a(w5, C1027ua.f9366H.i()), a(a6, j2));
        return a6;
    }

    public static Yk a(Ik ik, long j2) {
        Yk yk = new Yk();
        yk.f7754a = ik.f6968d;
        long andIncrement = ik.f6970f.getAndIncrement();
        Zk zk = ik.f6966b;
        zk.a(Zk.f7799g, Long.valueOf(ik.f6970f.get()));
        zk.b();
        yk.f7755b = andIncrement;
        Zk zk2 = ik.f6966b;
        long j6 = j2 - ik.f6969e;
        ik.f6974j = j6;
        zk2.a(Zk.f7797e, Long.valueOf(j6));
        yk.f7756c = TimeUnit.MILLISECONDS.toSeconds(ik.f6974j);
        yk.f7757d = ik.f6967c.f7099a;
        return yk;
    }

    public final synchronized Ik b(W5 w5) {
        try {
            if (this.f7679g == 0) {
                Ik b6 = this.f7676d.b();
                if (a(b6, w5)) {
                    this.f7678f = b6;
                    this.f7679g = 3;
                } else {
                    Ik b7 = this.f7677e.b();
                    if (a(b7, w5)) {
                        this.f7678f = b7;
                        this.f7679g = 2;
                    } else {
                        this.f7678f = null;
                        this.f7679g = 1;
                    }
                }
            }
            if (this.f7679g != 1 && !a(this.f7678f, w5)) {
                this.f7679g = 1;
                this.f7678f = null;
            }
            int a6 = Q7.a(this.f7679g);
            if (a6 == 1) {
                Ik ik = this.f7678f;
                long j2 = w5.f7656i;
                ik.f6973i = j2;
                Zk zk = ik.f6966b;
                zk.a(Zk.f7796d, Long.valueOf(j2));
                zk.b();
                return this.f7678f;
            }
            if (a6 != 2) {
                this.f7673a.f8097m.info("Start background session", new Object[0]);
                this.f7679g = 2;
                long j6 = w5.f7656i;
                AbstractC0654g abstractC0654g = this.f7677e;
                Jk jk = new Jk(j6, w5.f7657j);
                abstractC0654g.getClass();
                Ik a7 = abstractC0654g.a(jk);
                if (this.f7673a.f8104t.c()) {
                    C0583d5 c0583d5 = this.f7675c;
                    c0583d5.f8029a.f8098n.a(W5.a(w5, C1027ua.f9366H.i()), a(a7, w5.f7656i));
                } else {
                    int i2 = w5.f7651d;
                    EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
                    if (i2 == 6145) {
                        C0583d5 c0583d52 = this.f7675c;
                        c0583d52.f8029a.f8098n.a(w5, a(a7, j6));
                        C0583d5 c0583d53 = this.f7675c;
                        c0583d53.f8029a.f8098n.a(W5.a(w5, C1027ua.f9366H.i()), a(a7, j6));
                    }
                }
                this.f7678f = a7;
                return a7;
            }
            return this.f7678f;
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
        boolean z5;
        boolean z6;
        if (ik == null) {
            return false;
        }
        long j2 = w5.f7656i;
        boolean z7 = ik.f6968d >= 0;
        if (ik.f6972h == null) {
            synchronized (ik) {
                if (ik.f6972h == null) {
                    try {
                        String asString = ik.f6965a.f8089e.a(ik.f6968d, ik.f6967c.f7099a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            ik.f6972h = new Xk(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Xk xk = ik.f6972h;
        if (xk != null) {
            C0905ph c0905ph = (C0905ph) ik.f6965a.f8095k.a();
            List A02 = AbstractC0466k.A0(Boolean.valueOf(TextUtils.equals(c0905ph.getAnalyticsSdkVersionName(), xk.f7709a)), Boolean.valueOf(TextUtils.equals(c0905ph.getAnalyticsSdkBuildNumber(), xk.f7710b)), Boolean.valueOf(TextUtils.equals(c0905ph.getAppVersion(), xk.f7711c)), Boolean.valueOf(TextUtils.equals(c0905ph.getAppBuildNumber(), xk.f7712d)), Boolean.valueOf(TextUtils.equals(c0905ph.getOsVersion(), xk.f7713e)), Boolean.valueOf(xk.f7714f == c0905ph.getOsApiLevel()), Boolean.valueOf(xk.f7715g == c0905ph.f9021r));
            if (!A02.isEmpty()) {
                Iterator it = A02.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z = true;
            long elapsedRealtime = ik.f6975k.elapsedRealtime();
            long j6 = ik.f6973i;
            z5 = elapsedRealtime >= j6;
            long j7 = j2 - j6;
            long j8 = j2 - ik.f6969e;
            if (!z5) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Lk lk = ik.f6967c;
                int i2 = ((C0905ph) ik.f6965a.f8095k.a()).f9009f;
                Integer num = lk.f7102d;
                if (num != null) {
                    i2 = num.intValue();
                }
                if (j7 < timeUnit.toMillis(i2) && j8 < timeUnit.toMillis(Mk.f7158a)) {
                    z6 = false;
                    if (!z7 && z && !z6) {
                        return true;
                    }
                    b(ik, w5);
                    return false;
                }
            }
            z6 = true;
            if (!z7) {
            }
            b(ik, w5);
            return false;
        }
        z = false;
        long elapsedRealtime2 = ik.f6975k.elapsedRealtime();
        long j62 = ik.f6973i;
        if (elapsedRealtime2 >= j62) {
        }
        long j72 = j2 - j62;
        long j82 = j2 - ik.f6969e;
        if (!z5) {
        }
        z6 = true;
        if (!z7) {
        }
        b(ik, w5);
        return false;
    }
}
