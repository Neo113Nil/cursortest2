package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Rk {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f10889a;

    /* renamed from: b, reason: collision with root package name */
    public final Qk f10890b;

    /* renamed from: c, reason: collision with root package name */
    public final W4 f10891c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0625g f10892d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0625g f10893e;

    /* renamed from: f, reason: collision with root package name */
    public Dk f10894f;

    /* renamed from: g, reason: collision with root package name */
    public int f10895g = 0;

    public Rk(X4 x4, Qk qk, W4 w4, C0662ha c0662ha, C1120z2 c1120z2) {
        this.f10889a = x4;
        this.f10891c = w4;
        this.f10892d = c0662ha;
        this.f10893e = c1120z2;
        this.f10890b = qk;
    }

    public final synchronized long a() {
        Dk dk;
        dk = this.f10894f;
        return dk == null ? 10000000000L : dk.f10210d - 1;
    }

    public final void b(Dk dk, P5 p5) {
        if (dk.f10213g && dk.f10210d > 0) {
            W4 w4 = this.f10891c;
            P5 a3 = P5.a(p5, EnumC0508bb.EVENT_TYPE_ALIVE);
            Tk tk = new Tk();
            tk.f11010a = dk.f10210d;
            tk.f11013d = dk.f10209c.f10331a;
            long andIncrement = dk.f10212f.getAndIncrement();
            Uk uk = dk.f10208b;
            uk.a(Uk.f11064g, Long.valueOf(dk.f10212f.get()));
            uk.b();
            tk.f11011b = andIncrement;
            tk.f11012c = TimeUnit.MILLISECONDS.toSeconds(Math.max(dk.f10215i - dk.f10211e, dk.f10216j));
            w4.f11161a.n.a(a3, tk);
            if (dk.f10213g) {
                dk.f10213g = false;
                Uk uk2 = dk.f10208b;
                uk2.a(Uk.f11066i, Boolean.FALSE);
                uk2.b();
            }
        }
        PublicLogger publicLogger = this.f10889a.f11234m;
        int ordinal = dk.f10209c.f10331a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (dk) {
            Uk uk3 = dk.f10208b;
            uk3.getClass();
            uk3.f11069c = new C0611fb();
            uk3.b();
            dk.f10214h = null;
        }
    }

    public final synchronized void c(P5 p5) {
        try {
            if (this.f10895g == 0) {
                Dk b4 = this.f10892d.b();
                if (a(b4, p5)) {
                    this.f10894f = b4;
                    this.f10895g = 3;
                } else {
                    Dk b5 = this.f10893e.b();
                    if (a(b5, p5)) {
                        this.f10894f = b5;
                        this.f10895g = 2;
                    } else {
                        this.f10894f = null;
                        this.f10895g = 1;
                    }
                }
            }
            int a3 = K7.a(this.f10895g);
            if (a3 == 0) {
                this.f10894f = a(p5);
            } else if (a3 == 1) {
                b(this.f10894f, p5);
                this.f10894f = a(p5);
            } else if (a3 == 2) {
                if (a(this.f10894f, p5)) {
                    Dk dk = this.f10894f;
                    long j4 = p5.f10802i;
                    dk.f10215i = j4;
                    Uk uk = dk.f10208b;
                    uk.a(Uk.f11061d, Long.valueOf(j4));
                    uk.b();
                } else {
                    this.f10894f = a(p5);
                }
            }
        } finally {
        }
    }

    public final Dk a(P5 p5) {
        this.f10889a.f11234m.info("Start foreground session", new Object[0]);
        long j4 = p5.f10802i;
        AbstractC0625g abstractC0625g = this.f10892d;
        Ek ek = new Ek(j4, p5.f10803j);
        abstractC0625g.getClass();
        Dk a3 = abstractC0625g.a(ek);
        this.f10895g = 3;
        ((C0734k5) this.f10889a.f11235p).e();
        W4 w4 = this.f10891c;
        w4.f11161a.n.a(P5.a(p5, C0817na.f12417I.i()), a(a3, j4));
        return a3;
    }

    public static Tk a(Dk dk, long j4) {
        Tk tk = new Tk();
        tk.f11010a = dk.f10210d;
        long andIncrement = dk.f10212f.getAndIncrement();
        Uk uk = dk.f10208b;
        uk.a(Uk.f11064g, Long.valueOf(dk.f10212f.get()));
        uk.b();
        tk.f11011b = andIncrement;
        Uk uk2 = dk.f10208b;
        long j5 = j4 - dk.f10211e;
        dk.f10216j = j5;
        uk2.a(Uk.f11062e, Long.valueOf(j5));
        tk.f11012c = TimeUnit.MILLISECONDS.toSeconds(dk.f10216j);
        tk.f11013d = dk.f10209c.f10331a;
        return tk;
    }

    public final synchronized Dk b(P5 p5) {
        try {
            if (this.f10895g == 0) {
                Dk b4 = this.f10892d.b();
                if (a(b4, p5)) {
                    this.f10894f = b4;
                    this.f10895g = 3;
                } else {
                    Dk b5 = this.f10893e.b();
                    if (a(b5, p5)) {
                        this.f10894f = b5;
                        this.f10895g = 2;
                    } else {
                        this.f10894f = null;
                        this.f10895g = 1;
                    }
                }
            }
            if (this.f10895g != 1 && !a(this.f10894f, p5)) {
                this.f10895g = 1;
                this.f10894f = null;
            }
            int a3 = K7.a(this.f10895g);
            if (a3 == 1) {
                Dk dk = this.f10894f;
                long j4 = p5.f10802i;
                dk.f10215i = j4;
                Uk uk = dk.f10208b;
                uk.a(Uk.f11061d, Long.valueOf(j4));
                uk.b();
                return this.f10894f;
            }
            if (a3 != 2) {
                this.f10889a.f11234m.info("Start background session", new Object[0]);
                this.f10895g = 2;
                long j5 = p5.f10802i;
                AbstractC0625g abstractC0625g = this.f10893e;
                Ek ek = new Ek(j5, p5.f10803j);
                abstractC0625g.getClass();
                Dk a4 = abstractC0625g.a(ek);
                if (this.f10889a.f11239t.c()) {
                    W4 w4 = this.f10891c;
                    w4.f11161a.n.a(P5.a(p5, C0817na.f12417I.i()), a(a4, p5.f10802i));
                } else {
                    int i4 = p5.f10797d;
                    EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
                    if (i4 == 6145) {
                        W4 w42 = this.f10891c;
                        w42.f11161a.n.a(p5, a(a4, j5));
                        W4 w43 = this.f10891c;
                        w43.f11161a.n.a(P5.a(p5, C0817na.f12417I.i()), a(a4, j5));
                    }
                }
                this.f10894f = a4;
                return a4;
            }
            return this.f10894f;
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
    public final boolean a(Dk dk, P5 p5) {
        boolean z;
        boolean z4;
        boolean z5;
        if (dk == null) {
            return false;
        }
        long j4 = p5.f10802i;
        boolean z6 = dk.f10210d >= 0;
        if (dk.f10214h == null) {
            synchronized (dk) {
                if (dk.f10214h == null) {
                    try {
                        String asString = dk.f10207a.f11226e.a(dk.f10210d, dk.f10209c.f10331a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            dk.f10214h = new Sk(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Sk sk = dk.f10214h;
        if (sk != null) {
            C0746kh c0746kh = (C0746kh) dk.f10207a.f11232k.a();
            List W4 = d3.j.W(Boolean.valueOf(TextUtils.equals(c0746kh.getAnalyticsSdkVersionName(), sk.f10953a)), Boolean.valueOf(TextUtils.equals(c0746kh.getAnalyticsSdkBuildNumber(), sk.f10954b)), Boolean.valueOf(TextUtils.equals(c0746kh.getAppVersion(), sk.f10955c)), Boolean.valueOf(TextUtils.equals(c0746kh.getAppBuildNumber(), sk.f10956d)), Boolean.valueOf(TextUtils.equals(c0746kh.getOsVersion(), sk.f10957e)), Boolean.valueOf(sk.f10958f == c0746kh.getOsApiLevel()), Boolean.valueOf(sk.f10959g == c0746kh.f12234r));
            if (!W4.isEmpty()) {
                Iterator it = W4.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z = true;
            long elapsedRealtime = dk.f10217k.elapsedRealtime();
            long j5 = dk.f10215i;
            z4 = elapsedRealtime >= j5;
            long j6 = j4 - j5;
            long j7 = j4 - dk.f10211e;
            if (!z4) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Gk gk = dk.f10209c;
                int i4 = ((C0746kh) dk.f10207a.f11232k.a()).f12224f;
                Integer num = gk.f10334d;
                if (num != null) {
                    i4 = num.intValue();
                }
                if (j6 < timeUnit.toMillis(i4) && j7 < timeUnit.toMillis(Hk.f10381a)) {
                    z5 = false;
                    if (!z6 && z && !z5) {
                        return true;
                    }
                    b(dk, p5);
                    return false;
                }
            }
            z5 = true;
            if (!z6) {
            }
            b(dk, p5);
            return false;
        }
        z = false;
        long elapsedRealtime2 = dk.f10217k.elapsedRealtime();
        long j52 = dk.f10215i;
        if (elapsedRealtime2 >= j52) {
        }
        long j62 = j4 - j52;
        long j72 = j4 - dk.f10211e;
        if (!z4) {
        }
        z5 = true;
        if (!z6) {
        }
        b(dk, p5);
        return false;
    }
}
