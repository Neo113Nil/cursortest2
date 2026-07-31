package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Sk {

    /* renamed from: a, reason: collision with root package name */
    public final C2953s5 f38262a;

    /* renamed from: b, reason: collision with root package name */
    public final Rk f38263b;

    /* renamed from: c, reason: collision with root package name */
    public final C2927r5 f38264c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2637g f38265d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC2637g f38266e;

    /* renamed from: f, reason: collision with root package name */
    public Ek f38267f;

    /* renamed from: g, reason: collision with root package name */
    public int f38268g = 0;

    public Sk(C2953s5 c2953s5, Rk rk, C2927r5 c2927r5, Ca ca, L2 l22) {
        this.f38262a = c2953s5;
        this.f38264c = c2927r5;
        this.f38265d = ca;
        this.f38266e = l22;
        this.f38263b = rk;
    }

    public final synchronized long a() {
        Ek ek;
        ek = this.f38267f;
        return ek == null ? 10000000000L : ek.f37477d - 1;
    }

    public final void b(Ek ek, C2773l6 c2773l6) {
        if (ek.f37480g && ek.f37477d > 0) {
            C2927r5 c2927r5 = this.f38264c;
            C2773l6 a4 = C2773l6.a(c2773l6, EnumC3063wb.EVENT_TYPE_ALIVE);
            Uk uk = new Uk();
            uk.f38378a = ek.f37477d;
            uk.f38381d = ek.f37476c.f37662a;
            long andIncrement = ek.f37479f.getAndIncrement();
            Vk vk = ek.f37475b;
            vk.a(Vk.f38439g, Long.valueOf(ek.f37479f.get()));
            vk.b();
            uk.f38379b = andIncrement;
            uk.f38380c = TimeUnit.MILLISECONDS.toSeconds(Math.max(ek.f37482i - ek.f37478e, ek.f37483j));
            c2927r5.f39700a.f39778n.a(a4, uk);
            if (ek.f37480g) {
                ek.f37480g = false;
                Vk vk2 = ek.f37475b;
                vk2.a(Vk.f38441i, Boolean.FALSE);
                vk2.b();
            }
        }
        PublicLogger publicLogger = this.f38262a.f39777m;
        int ordinal = ek.f37476c.f37662a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (ek) {
            Vk vk3 = ek.f37475b;
            vk3.getClass();
            vk3.f38444c = new Ab();
            vk3.b();
            ek.f37481h = null;
        }
    }

    public final synchronized void c(C2773l6 c2773l6) {
        try {
            if (this.f38268g == 0) {
                Ek b4 = this.f38265d.b();
                if (a(b4, c2773l6)) {
                    this.f38267f = b4;
                    this.f38268g = 3;
                } else {
                    Ek b5 = this.f38266e.b();
                    if (a(b5, c2773l6)) {
                        this.f38267f = b5;
                        this.f38268g = 2;
                    } else {
                        this.f38267f = null;
                        this.f38268g = 1;
                    }
                }
            }
            int a4 = AbstractC2592e8.a(this.f38268g);
            if (a4 == 0) {
                this.f38267f = a(c2773l6);
            } else if (a4 == 1) {
                b(this.f38267f, c2773l6);
                this.f38267f = a(c2773l6);
            } else if (a4 == 2) {
                if (a(this.f38267f, c2773l6)) {
                    Ek ek = this.f38267f;
                    long j4 = c2773l6.f39384i;
                    ek.f37482i = j4;
                    Vk vk = ek.f37475b;
                    vk.a(Vk.f38436d, Long.valueOf(j4));
                    vk.b();
                } else {
                    this.f38267f = a(c2773l6);
                }
            }
        } finally {
        }
    }

    public final Ek a(C2773l6 c2773l6) {
        this.f38262a.f39777m.info("Start foreground session", new Object[0]);
        long j4 = c2773l6.f39384i;
        AbstractC2637g abstractC2637g = this.f38265d;
        Fk fk = new Fk(j4, c2773l6.f39385j);
        abstractC2637g.getClass();
        Ek a4 = abstractC2637g.a(fk);
        this.f38268g = 3;
        ((F5) this.f38262a.f39780p).e();
        C2927r5 c2927r5 = this.f38264c;
        c2927r5.f39700a.f39778n.a(C2773l6.a(c2773l6, Ia.f37730F.h()), a(a4, j4));
        return a4;
    }

    public static Uk a(Ek ek, long j4) {
        Uk uk = new Uk();
        uk.f38378a = ek.f37477d;
        long andIncrement = ek.f37479f.getAndIncrement();
        Vk vk = ek.f37475b;
        vk.a(Vk.f38439g, Long.valueOf(ek.f37479f.get()));
        vk.b();
        uk.f38379b = andIncrement;
        Vk vk2 = ek.f37475b;
        long j5 = j4 - ek.f37478e;
        ek.f37483j = j5;
        vk2.a(Vk.f38437e, Long.valueOf(j5));
        uk.f38380c = TimeUnit.MILLISECONDS.toSeconds(ek.f37483j);
        uk.f38381d = ek.f37476c.f37662a;
        return uk;
    }

    public final synchronized Ek b(C2773l6 c2773l6) {
        try {
            if (this.f38268g == 0) {
                Ek b4 = this.f38265d.b();
                if (a(b4, c2773l6)) {
                    this.f38267f = b4;
                    this.f38268g = 3;
                } else {
                    Ek b5 = this.f38266e.b();
                    if (a(b5, c2773l6)) {
                        this.f38267f = b5;
                        this.f38268g = 2;
                    } else {
                        this.f38267f = null;
                        this.f38268g = 1;
                    }
                }
            }
            if (this.f38268g != 1 && !a(this.f38267f, c2773l6)) {
                this.f38268g = 1;
                this.f38267f = null;
            }
            int a4 = AbstractC2592e8.a(this.f38268g);
            if (a4 == 1) {
                Ek ek = this.f38267f;
                long j4 = c2773l6.f39384i;
                ek.f37482i = j4;
                Vk vk = ek.f37475b;
                vk.a(Vk.f38436d, Long.valueOf(j4));
                vk.b();
                return this.f38267f;
            }
            if (a4 != 2) {
                this.f38262a.f39777m.info("Start background session", new Object[0]);
                this.f38268g = 2;
                long j5 = c2773l6.f39384i;
                AbstractC2637g abstractC2637g = this.f38266e;
                Fk fk = new Fk(j5, c2773l6.f39385j);
                abstractC2637g.getClass();
                Ek a5 = abstractC2637g.a(fk);
                if (this.f38262a.f39784t.c()) {
                    C2927r5 c2927r5 = this.f38264c;
                    c2927r5.f39700a.f39778n.a(C2773l6.a(c2773l6, Ia.f37730F.h()), a(a5, c2773l6.f39384i));
                } else {
                    int i4 = c2773l6.f39379d;
                    EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
                    if (i4 == 6145) {
                        C2927r5 c2927r52 = this.f38264c;
                        c2927r52.f39700a.f39778n.a(c2773l6, a(a5, j5));
                        C2927r5 c2927r53 = this.f38264c;
                        c2927r53.f39700a.f39778n.a(C2773l6.a(c2773l6, Ia.f37730F.h()), a(a5, j5));
                    }
                }
                this.f38267f = a5;
                return a5;
            }
            return this.f38267f;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Ek ek, C2773l6 c2773l6) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (ek == null) {
            return false;
        }
        long j4 = c2773l6.f39384i;
        boolean z7 = ek.f37477d >= 0;
        if (ek.f37481h == null) {
            synchronized (ek) {
                if (ek.f37481h == null) {
                    try {
                        String asString = ek.f37474a.f39769e.a(ek.f37477d, ek.f37476c.f37662a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            ek.f37481h = new Tk(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Tk tk = ek.f37481h;
        if (tk != null) {
            C3095xh c3095xh = (C3095xh) ek.f37474a.f39775k.a();
            List listOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(TextUtils.equals(c3095xh.getAnalyticsSdkVersionName(), tk.f38327a)), Boolean.valueOf(TextUtils.equals(c3095xh.getAnalyticsSdkBuildNumber(), tk.f38328b)), Boolean.valueOf(TextUtils.equals(c3095xh.getAppVersion(), tk.f38329c)), Boolean.valueOf(TextUtils.equals(c3095xh.getAppBuildNumber(), tk.f38330d)), Boolean.valueOf(TextUtils.equals(c3095xh.getOsVersion(), tk.f38331e)), Boolean.valueOf(tk.f38332f == c3095xh.getOsApiLevel()), Boolean.valueOf(tk.f38333g == c3095xh.f40191r)});
            if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
                Iterator it = listOf.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z4 = true;
            long elapsedRealtime = ek.f37484k.elapsedRealtime();
            long j5 = ek.f37482i;
            z5 = elapsedRealtime >= j5;
            long j6 = j4 - j5;
            long j7 = j4 - ek.f37478e;
            if (!z5) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Hk hk = ek.f37476c;
                int i4 = ((C3095xh) ek.f37474a.f39775k.a()).f40179f;
                Integer num = hk.f37665d;
                if (num != null) {
                    i4 = num.intValue();
                }
                if (j6 < timeUnit.toMillis(i4) && j7 < timeUnit.toMillis(Ik.f37771a)) {
                    z6 = false;
                    if (!z7 && z4 && !z6) {
                        return true;
                    }
                    b(ek, c2773l6);
                    return false;
                }
            }
            z6 = true;
            if (!z7) {
            }
            b(ek, c2773l6);
            return false;
        }
        z4 = false;
        long elapsedRealtime2 = ek.f37484k.elapsedRealtime();
        long j52 = ek.f37482i;
        if (elapsedRealtime2 >= j52) {
        }
        long j62 = j4 - j52;
        long j72 = j4 - ek.f37478e;
        if (!z5) {
        }
        z6 = true;
        if (!z7) {
        }
        b(ek, c2773l6);
        return false;
    }
}
