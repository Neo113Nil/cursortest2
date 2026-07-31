package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.C1712z2;
import java.util.Map;

/* renamed from: com.my.tracker.obfuscated.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1657l2 extends AbstractC1679r1 {

    /* renamed from: c, reason: collision with root package name */
    private final r f21414c = new r(65536);

    public synchronized byte[] a(C1712z2.a aVar, C1615b3 c1615b3, C1680r2 c1680r2, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        try {
            if (context == null) {
                AbstractC1708y2.b("TimeSpentMessageBuilder: context is empty");
                throw new Exception("TimeSpentMessageBuilder: context is empty");
            }
            try {
                C1635g0 a4 = C1639h0.a().a(aVar.f21625m, aVar.f21619g, aVar.f21617e, str, okHttpClientProvider, context);
                this.f21414c.a();
                try {
                    a(this.f21414c, aVar, c1615b3, a4, c1680r2);
                    byte[] c4 = this.f21414c.c();
                    this.f21414c.d();
                    a();
                    return c4;
                } catch (Exception e4) {
                    e = e4;
                    Exception exc = e;
                    AbstractC1708y2.b("TimeSpentMessageBuilder: something went wrong while generating tick packet", exc);
                    throw new Exception(exc);
                }
            } catch (Exception e5) {
                e = e5;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void a(AbstractC1683s1 abstractC1683s1, InterfaceC1697w[] interfaceC1697wArr, r rVar) {
        if (interfaceC1697wArr != null) {
            for (InterfaceC1697w interfaceC1697w : interfaceC1697wArr) {
                rVar.a();
                rVar.a(1, interfaceC1697w.a());
                rVar.a(2, interfaceC1697w.d());
                abstractC1683s1.a(38, rVar);
            }
        }
    }

    private static void a(AbstractC1683s1 abstractC1683s1, InterfaceC1633f2 interfaceC1633f2, InterfaceC1633f2[] interfaceC1633f2Arr, r rVar) {
        if (interfaceC1633f2 != null) {
            rVar.a();
            rVar.a(1, interfaceC1633f2.a());
            rVar.a(2, interfaceC1633f2.b());
            rVar.a(3, interfaceC1633f2.c());
            abstractC1683s1.a(39, rVar);
        }
        if (interfaceC1633f2Arr != null) {
            for (InterfaceC1633f2 interfaceC1633f22 : interfaceC1633f2Arr) {
                rVar.a();
                rVar.a(1, interfaceC1633f22.a());
                rVar.a(2, interfaceC1633f22.b());
                rVar.a(3, interfaceC1633f22.c());
                abstractC1683s1.a(39, rVar);
            }
        }
    }

    private void a(AbstractC1683s1 abstractC1683s1, C1712z2.a aVar, C1615b3 c1615b3, C1635g0 c1635g0, C1680r2 c1680r2) {
        String str;
        String str2;
        Map map = aVar.f21623k.f20860e;
        if (map.isEmpty()) {
            str = null;
            str2 = null;
        } else {
            String str3 = (String) map.get("android_id");
            str2 = (String) map.get("mac");
            str = str3;
        }
        abstractC1683s1.a(1, MyTracker.VERSION);
        abstractC1683s1.a(2, aVar.f21613a);
        abstractC1683s1.a(3, c1680r2.c());
        AbstractC1679r1.a(abstractC1683s1, c1635g0.f21321a, c1635g0.f21323c, this.f21515a, this.f21516b);
        AbstractC1679r1.a(abstractC1683s1, c1615b3, this.f21515a);
        AbstractC1679r1.a(abstractC1683s1, str, str2, c1635g0, this.f21515a, this.f21516b);
        AbstractC1679r1.a(abstractC1683s1, c1635g0.f21326f, c1635g0.f21322b, c1635g0.f21323c, this.f21515a);
        AbstractC1679r1.a(abstractC1683s1, c1635g0.f21327g, this.f21515a);
        a(abstractC1683s1, c1680r2.b(), this.f21515a);
        a(abstractC1683s1, c1680r2.a(), c1680r2.d(), this.f21515a);
    }
}
