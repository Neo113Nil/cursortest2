package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import okhttp3.internal.connection.RealConnection;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Sk {

    /* renamed from: a, reason: collision with root package name */
    public final Y4 f1047a;
    public final Rk b;
    public final X4 c;
    public final AbstractC0186g d;
    public final AbstractC0186g e;
    public Ek f;
    public int g = 0;

    public Sk(Y4 y4, Rk rk, X4 x4, C0249ia c0249ia, A2 a2) {
        this.f1047a = y4;
        this.c = x4;
        this.d = c0249ia;
        this.e = a2;
        this.b = rk;
    }

    public final synchronized long a() {
        Ek ek;
        ek = this.f;
        return ek == null ? RealConnection.IDLE_CONNECTION_HEALTHY_NS : ek.d - 1;
    }

    public final void b(Ek ek, Q5 q5) {
        if (ek.g && ek.d > 0) {
            X4 x4 = this.c;
            Q5 a2 = Q5.a(q5, EnumC0095cb.EVENT_TYPE_ALIVE);
            Uk uk = new Uk();
            uk.f1080a = ek.d;
            uk.d = ek.c.f877a;
            long andIncrement = ek.f.getAndIncrement();
            Vk vk = ek.b;
            vk.a(Vk.g, Long.valueOf(ek.f.get()));
            vk.b();
            uk.b = andIncrement;
            uk.c = TimeUnit.MILLISECONDS.toSeconds(Math.max(ek.i - ek.e, ek.j));
            x4.f1112a.n.a(a2, uk);
            if (ek.g) {
                ek.g = false;
                Vk vk2 = ek.b;
                vk2.a(Vk.i, Boolean.FALSE);
                vk2.b();
            }
        }
        PublicLogger publicLogger = this.f1047a.m;
        int ordinal = ek.c.f877a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (ek) {
            Vk vk3 = ek.b;
            vk3.getClass();
            vk3.c = new C0198gb();
            vk3.b();
            ek.h = null;
        }
    }

    public final synchronized void c(Q5 q5) {
        if (this.g == 0) {
            Ek b = this.d.b();
            if (a(b, q5)) {
                this.f = b;
                this.g = 3;
            } else {
                Ek b2 = this.e.b();
                if (a(b2, q5)) {
                    this.f = b2;
                    this.g = 2;
                } else {
                    this.f = null;
                    this.g = 1;
                }
            }
        }
        int a2 = L7.a(this.g);
        if (a2 == 0) {
            this.f = a(q5);
        } else if (a2 == 1) {
            b(this.f, q5);
            this.f = a(q5);
        } else if (a2 == 2) {
            if (a(this.f, q5)) {
                Ek ek = this.f;
                long j = q5.i;
                ek.i = j;
                Vk vk = ek.b;
                vk.a(Vk.d, Long.valueOf(j));
                vk.b();
            } else {
                this.f = a(q5);
            }
        }
    }

    public final Ek a(Q5 q5) {
        this.f1047a.m.info("Start foreground session", new Object[0]);
        long j = q5.i;
        AbstractC0186g abstractC0186g = this.d;
        Fk fk = new Fk(j, q5.j);
        abstractC0186g.getClass();
        Ek a2 = abstractC0186g.a(fk);
        this.g = 3;
        ((C0321l5) this.f1047a.p).e();
        X4 x4 = this.c;
        x4.f1112a.n.a(Q5.a(q5, C0401oa.I.i()), a(a2, j));
        return a2;
    }

    public static Uk a(Ek ek, long j) {
        Uk uk = new Uk();
        uk.f1080a = ek.d;
        long andIncrement = ek.f.getAndIncrement();
        Vk vk = ek.b;
        vk.a(Vk.g, Long.valueOf(ek.f.get()));
        vk.b();
        uk.b = andIncrement;
        Vk vk2 = ek.b;
        long j2 = j - ek.e;
        ek.j = j2;
        vk2.a(Vk.e, Long.valueOf(j2));
        uk.c = TimeUnit.MILLISECONDS.toSeconds(ek.j);
        uk.d = ek.c.f877a;
        return uk;
    }

    public final synchronized Ek b(Q5 q5) {
        if (this.g == 0) {
            Ek b = this.d.b();
            if (a(b, q5)) {
                this.f = b;
                this.g = 3;
            } else {
                Ek b2 = this.e.b();
                if (a(b2, q5)) {
                    this.f = b2;
                    this.g = 2;
                } else {
                    this.f = null;
                    this.g = 1;
                }
            }
        }
        if (this.g != 1 && !a(this.f, q5)) {
            this.g = 1;
            this.f = null;
        }
        int a2 = L7.a(this.g);
        if (a2 == 1) {
            Ek ek = this.f;
            long j = q5.i;
            ek.i = j;
            Vk vk = ek.b;
            vk.a(Vk.d, Long.valueOf(j));
            vk.b();
            return this.f;
        }
        if (a2 != 2) {
            this.f1047a.m.info("Start background session", new Object[0]);
            this.g = 2;
            long j2 = q5.i;
            AbstractC0186g abstractC0186g = this.e;
            Fk fk = new Fk(j2, q5.j);
            abstractC0186g.getClass();
            Ek a3 = abstractC0186g.a(fk);
            if (this.f1047a.t.c()) {
                X4 x4 = this.c;
                x4.f1112a.n.a(Q5.a(q5, C0401oa.I.i()), a(a3, q5.i));
            } else {
                int i = q5.d;
                EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_UNDEFINED;
                if (i == 6145) {
                    X4 x42 = this.c;
                    x42.f1112a.n.a(q5, a(a3, j2));
                    X4 x43 = this.c;
                    x43.f1112a.n.a(Q5.a(q5, C0401oa.I.i()), a(a3, j2));
                }
            }
            this.f = a3;
            return a3;
        }
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Ek ek, Q5 q5) {
        boolean z;
        boolean z2;
        boolean z3;
        if (ek == null) {
            return false;
        }
        long j = q5.i;
        boolean z4 = ek.d >= 0;
        if (ek.h == null) {
            synchronized (ek) {
                if (ek.h == null) {
                    try {
                        String asString = ek.f831a.e.a(ek.d, ek.c.f877a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            ek.h = new Tk(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Tk tk = ek.h;
        if (tk != null) {
            C0333lh c0333lh = (C0333lh) ek.f831a.k.a();
            Boolean[] boolArr = new Boolean[7];
            boolArr[0] = Boolean.valueOf(TextUtils.equals(c0333lh.getAnalyticsSdkVersionName(), tk.f1063a));
            boolArr[1] = Boolean.valueOf(TextUtils.equals(c0333lh.getAnalyticsSdkBuildNumber(), tk.b));
            boolArr[2] = Boolean.valueOf(TextUtils.equals(c0333lh.getAppVersion(), tk.c));
            boolArr[3] = Boolean.valueOf(TextUtils.equals(c0333lh.getAppBuildNumber(), tk.d));
            boolArr[4] = Boolean.valueOf(TextUtils.equals(c0333lh.getOsVersion(), tk.e));
            boolArr[5] = Boolean.valueOf(tk.f == c0333lh.getOsApiLevel());
            boolArr[6] = Boolean.valueOf(tk.g == c0333lh.r);
            List listOf = CollectionsKt.listOf((Object[]) boolArr);
            if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
                Iterator it = listOf.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z = true;
            long elapsedRealtime = ek.k.elapsedRealtime();
            long j2 = ek.i;
            z2 = elapsedRealtime >= j2;
            long j3 = j - j2;
            long j4 = j - ek.e;
            if (!z2) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Hk hk = ek.c;
                int i = ((C0333lh) ek.f831a.k.a()).f;
                Integer num = hk.d;
                if (num != null) {
                    i = num.intValue();
                }
                if (j3 < timeUnit.toMillis(i) && j4 < timeUnit.toMillis(Ik.f894a)) {
                    z3 = false;
                    if (!z4 && z && !z3) {
                        return true;
                    }
                    b(ek, q5);
                    return false;
                }
            }
            z3 = true;
            if (!z4) {
            }
            b(ek, q5);
            return false;
        }
        z = false;
        long elapsedRealtime2 = ek.k.elapsedRealtime();
        long j22 = ek.i;
        if (elapsedRealtime2 >= j22) {
        }
        long j32 = j - j22;
        long j42 = j - ek.e;
        if (!z2) {
        }
        z3 = true;
        if (!z4) {
        }
        b(ek, q5);
        return false;
    }
}
