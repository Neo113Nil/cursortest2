package com.tencent.bugly.crashreport.common.strategy;

import android.content.Context;
import com.tencent.bugly.crashreport.biz.b;
import com.tencent.bugly.proguard.ap;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.r;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.List;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f8608a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private static a f8609b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.tencent.bugly.a> f8610c;
    private Context g;
    private StrategyBean f = null;
    private final StrategyBean e = new StrategyBean();

    /* renamed from: d, reason: collision with root package name */
    private final w f8611d = w.a();

    private a(Context context, List<com.tencent.bugly.a> list) {
        this.g = context;
        this.f8610c = list;
    }

    public static synchronized a a(Context context, List<com.tencent.bugly.a> list) {
        a aVar;
        synchronized (a.class) {
            if (f8609b == null) {
                f8609b = new a(context, list);
            }
            aVar = f8609b;
        }
        return aVar;
    }

    public final void a(long j) {
        this.f8611d.a(new Thread() { // from class: com.tencent.bugly.crashreport.common.strategy.a.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    Map<String, byte[]> a2 = p.a().a(a.f8608a, (o) null, true);
                    if (a2 != null) {
                        byte[] bArr = a2.get("key_imei");
                        byte[] bArr2 = a2.get("key_ip");
                        if (bArr != null) {
                            com.tencent.bugly.crashreport.common.info.a.a(a.this.g).e(new String(bArr));
                        }
                        if (bArr2 != null) {
                            com.tencent.bugly.crashreport.common.info.a.a(a.this.g).d(new String(bArr2));
                        }
                    }
                    a aVar = a.this;
                    a.this.f = a.d();
                } catch (Throwable th) {
                    if (!x.a(th)) {
                        th.printStackTrace();
                    }
                }
                a.this.a(a.this.f, false);
            }
        }, j);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            aVar = f8609b;
        }
        return aVar;
    }

    public final synchronized boolean b() {
        return this.f != null;
    }

    public final StrategyBean c() {
        if (this.f != null) {
            return this.f;
        }
        return this.e;
    }

    protected final void a(StrategyBean strategyBean, boolean z) {
        x.c("[Strategy] Notify %s", b.class.getName());
        b.a(strategyBean, z);
        for (com.tencent.bugly.a aVar : this.f8610c) {
            try {
                x.c("[Strategy] Notify %s", aVar.getClass().getName());
                aVar.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    public final void a(ap apVar) {
        if (apVar == null) {
            return;
        }
        if (this.f == null || apVar.h != this.f.p) {
            StrategyBean strategyBean = new StrategyBean();
            strategyBean.g = apVar.f8726a;
            strategyBean.i = apVar.f8728c;
            strategyBean.h = apVar.f8727b;
            if (z.c(apVar.f8729d)) {
                x.c("[Strategy] Upload url changes to %s", apVar.f8729d);
                strategyBean.r = apVar.f8729d;
            }
            if (z.c(apVar.e)) {
                x.c("[Strategy] Exception upload url changes to %s", apVar.e);
                strategyBean.s = apVar.e;
            }
            if (apVar.f != null && !z.a(apVar.f.f8724a)) {
                strategyBean.u = apVar.f.f8724a;
            }
            if (apVar.h != 0) {
                strategyBean.p = apVar.h;
            }
            if (apVar.g != null && apVar.g.size() > 0) {
                strategyBean.v = apVar.g;
                String str = apVar.g.get("B11");
                if (str != null && str.equals("1")) {
                    strategyBean.j = true;
                } else {
                    strategyBean.j = false;
                }
                String str2 = apVar.g.get("B3");
                if (str2 != null) {
                    strategyBean.y = Long.valueOf(str2).longValue();
                }
                strategyBean.q = apVar.i;
                strategyBean.x = apVar.i;
                String str3 = apVar.g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt > 0) {
                            strategyBean.w = parseInt;
                        }
                    } catch (Exception e) {
                        if (!x.a(e)) {
                            e.printStackTrace();
                        }
                    }
                }
                String str4 = apVar.g.get("B25");
                if (str4 != null && str4.equals("1")) {
                    strategyBean.l = true;
                } else {
                    strategyBean.l = false;
                }
            }
            x.a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean.g), Boolean.valueOf(strategyBean.i), Boolean.valueOf(strategyBean.h), Boolean.valueOf(strategyBean.j), Boolean.valueOf(strategyBean.k), Boolean.valueOf(strategyBean.n), Boolean.valueOf(strategyBean.o), Long.valueOf(strategyBean.q), Boolean.valueOf(strategyBean.l), Long.valueOf(strategyBean.p));
            this.f = strategyBean;
            p.a().b(2);
            r rVar = new r();
            rVar.f8777b = 2;
            rVar.f8776a = strategyBean.e;
            rVar.e = strategyBean.f;
            rVar.g = z.a(strategyBean);
            p.a().a(rVar);
            a(strategyBean, true);
        }
    }

    public static StrategyBean d() {
        List<r> a2 = p.a().a(2);
        if (a2 == null || a2.size() <= 0) {
            return null;
        }
        r rVar = a2.get(0);
        if (rVar.g != null) {
            return (StrategyBean) z.a(rVar.g, StrategyBean.CREATOR);
        }
        return null;
    }
}
