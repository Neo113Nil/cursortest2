package B5;

import S.j;
import U.l;
import U.p;
import U.q;
import a1.h;
import a1.i;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1rSDK;
import com.google.firebase.messaging.AbstractServiceC0319i;
import f1.C0393a;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import v5.C0977c;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f182e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f183i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f184l;

    public /* synthetic */ b(f1.b bVar, i iVar, A4.c cVar, h hVar) {
        this.f181d = 8;
        this.f184l = bVar;
        this.f182e = iVar;
        this.f183i = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f181d) {
            case 0:
                c cVar = (c) this.f184l;
                C0977c c0977c = (C0977c) this.f182e;
                C0977c c0977c2 = (C0977c) this.f183i;
                cVar.f198u = false;
                C0977c shutdown = cVar.f189l.shutdown();
                shutdown.f(new b(c0977c, shutdown, c0977c2));
                return;
            case 1:
                C0977c c0977c3 = (C0977c) this.f182e;
                C0977c c0977c4 = (C0977c) this.f183i;
                C0977c c0977c5 = (C0977c) this.f184l;
                if (c0977c3.b() && c0977c4.b()) {
                    c0977c5.e();
                    return;
                } else {
                    c0977c5.a(null);
                    return;
                }
            case 2:
                N1.i iVar = (N1.i) this.f184l;
                V6.b bVar = (V6.b) this.f182e;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f183i;
                try {
                    q o7 = P0.f.o(iVar.f1819d);
                    if (o7 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p pVar = (p) o7.f2697a;
                    synchronized (pVar.f2691l) {
                        pVar.f2693n = threadPoolExecutor;
                    }
                    o7.f2697a.a(new l(bVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    bVar.G(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                ((AFa1tSDK) this.f184l).e_((Context) this.f182e, (Intent) this.f183i);
                return;
            case 4:
                AFd1wSDK.AFAdRevenueData((AFd1wSDK) this.f184l, (Throwable) this.f182e, (String) this.f183i);
                return;
            case 5:
                ((AFj1rSDK) this.f184l).getMediationNetwork((AFi1aSDK) this.f182e, (Runnable) this.f183i);
                return;
            case 6:
                AbstractServiceC0319i abstractServiceC0319i = (AbstractServiceC0319i) this.f184l;
                Intent intent = (Intent) this.f182e;
                K1.h hVar = (K1.h) this.f183i;
                abstractServiceC0319i.getClass();
                try {
                    abstractServiceC0319i.handleIntent(intent);
                    return;
                } finally {
                    hVar.b(null);
                }
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                com.onesignal.core.internal.application.impl.a.decorViewReady$lambda$1((com.onesignal.core.internal.application.impl.a) this.f184l, (Runnable) this.f182e, (com.onesignal.core.internal.application.impl.a) this.f183i);
                return;
            default:
                f1.b bVar2 = (f1.b) this.f184l;
                i iVar2 = (i) this.f182e;
                String str = iVar2.f3067a;
                h hVar2 = (h) this.f183i;
                bVar2.getClass();
                Logger logger = f1.b.f4767f;
                try {
                    b1.f a7 = bVar2.f4770c.a(str);
                    if (a7 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((h1.h) bVar2.f4772e).s(new C0393a(bVar2, iVar2, ((Y0.c) a7).a(hVar2), 0));
                    }
                    return;
                } catch (Exception e7) {
                    logger.warning("Error scheduling event " + e7.getMessage());
                    return;
                }
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i2) {
        this.f181d = i2;
        this.f184l = obj;
        this.f182e = obj2;
        this.f183i = obj3;
    }

    public /* synthetic */ b(C0977c c0977c, C0977c c0977c2, C0977c c0977c3) {
        this.f181d = 1;
        this.f182e = c0977c;
        this.f183i = c0977c2;
        this.f184l = c0977c3;
    }
}
