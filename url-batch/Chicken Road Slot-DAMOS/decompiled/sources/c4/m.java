package c4;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1767e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1768i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1769r;

    public /* synthetic */ m(p6.b bVar, k6.i iVar, a2.r rVar, k6.h hVar) {
        this.f1766d = 7;
        this.f1767e = bVar;
        this.f1768i = iVar;
        this.f1769r = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1766d) {
            case 0:
                o oVar = (o) this.f1767e;
                a.a aVar = (a.a) this.f1768i;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1769r;
                try {
                    t l10 = z4.w.l(oVar.f1772d);
                    if (l10 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((j) l10.f1754b);
                    synchronized (sVar.f1782r) {
                        sVar.f1784t = threadPoolExecutor;
                    }
                    ((j) l10.f1754b).b(new n(aVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    aVar.R(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ((AFa1ySDK) this.f1767e).e_((Context) this.f1768i, (Intent) this.f1769r);
                return;
            case 2:
                AFd1wSDK.getCurrencyIso4217Code((AFd1wSDK) this.f1767e, (Throwable) this.f1768i, (String) this.f1769r);
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((AFj1sSDK) this.f1767e).getMediationNetwork((AFi1aSDK) this.f1768i, (Runnable) this.f1769r);
                return;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.f1767e;
                Intent intent = (Intent) this.f1768i;
                w7.g gVar2 = (w7.g) this.f1769r;
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    gVar2.a(null);
                }
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                com.onesignal.core.internal.application.impl.a.decorViewReady$lambda$1((com.onesignal.core.internal.application.impl.a) this.f1767e, (Runnable) this.f1768i, (com.onesignal.core.internal.application.impl.a) this.f1769r);
                return;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                PermissionsActivity.onRequestPermissionsResult$lambda$0((PermissionsActivity) this.f1767e, (String[]) this.f1768i, (int[]) this.f1769r);
                return;
            default:
                p6.b bVar = (p6.b) this.f1767e;
                k6.i iVar = (k6.i) this.f1768i;
                String str = iVar.f5464a;
                k6.h hVar = (k6.h) this.f1769r;
                bVar.getClass();
                Logger logger = p6.b.f7682f;
                try {
                    l6.e a9 = bVar.f7685c.a(str);
                    if (a9 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        bVar.f7687e.m(new p6.a(bVar, iVar, ((i6.c) a9).a(hVar), 0));
                    }
                    return;
                } catch (Exception e2) {
                    logger.warning("Error scheduling event " + e2.getMessage());
                    return;
                }
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i3) {
        this.f1766d = i3;
        this.f1767e = obj;
        this.f1768i = obj2;
        this.f1769r = obj3;
    }
}
