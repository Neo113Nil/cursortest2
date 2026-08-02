package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gia implements gzf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gia(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, krt] */
    @Override // defpackage.gzf
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                ggw ggwVar = (ggw) obj;
                ggwVar.getClass();
                if (!ggwVar.a) {
                    ((Optional) ((iee) this.a).c).isPresent();
                    break;
                }
                break;
            case 9:
                ((List) obj).getClass();
                break;
            case 10:
                iwq iwqVar = gjw.m;
                break;
            case 11:
                iwq iwqVar2 = gjw.m;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                iwq iwqVar3 = gjw.m;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                this.a.a(obj);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.a.a(obj);
                break;
            case 15:
                this.a.a(obj);
                break;
            case 16:
                boolean z = ((hrz) obj).g() == 1;
                Object obj2 = this.a;
                Boolean valueOf = Boolean.valueOf(z);
                ((gnp) obj2).b.set(valueOf);
                break;
            case 17:
                ((hkf) ((hkf) ((hkf) gnp.a.g()).h((Throwable) obj)).i("com/google/apps/tiktok/monitoring/checkbox/TikTokCheckboxCheckerImpl", "shouldLog", 70, "TikTokCheckboxCheckerImpl.java")).s("fetching usage reporting opt-in failed");
                ((gnp) this.a).b.set(false);
                break;
            case 18:
                Long l = (Long) obj;
                qi qiVar = new qi();
                gsa gsaVar = gsa.a;
                Object obj3 = this.a;
                try {
                    for (grz grzVar : ((gqh) obj3).a().d) {
                        long j = grzVar.e;
                        gsc gscVar = grzVar.c;
                        if (gscVar == null) {
                            gscVar = gsc.a;
                        }
                        gqs gqsVar = new gqs(gscVar);
                        if (j <= 0) {
                            j = l.longValue();
                        }
                        qiVar.put(gqsVar, Long.valueOf(j));
                    }
                    break;
                } catch (IOException e) {
                    ((gqh) obj3).g(e);
                    return qiVar;
                }
            case 19:
                ((gqn) this.a).i((Set) obj);
                break;
            default:
                hkf hkfVar = (hkf) ((hkf) grg.a.b()).i("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleWorker", 140, "SyncWorkManagerOneTimeScheduler.java");
                gqt gqtVar = (gqt) this.a;
                hkfVar.E(gqtVar.a, gqtVar.b);
                break;
        }
        return null;
    }
}
