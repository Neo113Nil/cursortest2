package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcq extends atf {
    private static final hkh a = hkh.l("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory");
    private final Map b;
    private final gva c;
    private final Map d;
    private final gzp e;
    private final gzp f;

    public gcq(Map map, gva gvaVar, Map map2, gzp gzpVar, gzp gzpVar2) {
        this.b = map;
        this.c = gvaVar;
        this.d = map2;
        this.e = gzpVar;
        this.f = gzpVar2;
    }

    @Override // defpackage.atf
    public final asp a(Context context, String str, WorkerParameters workerParameters) {
        koe koeVar;
        String str2;
        asp a2;
        try {
            gut d = this.c.d(132, "WorkerFactory.createWorker()");
            try {
                if (str.equals(TikTokListenableWorker.class.getName())) {
                    hfm a3 = gcv.a(workerParameters.c);
                    if (a3.size() != 1) {
                        ((hkf) ((hkf) a.f()).i("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 88, "TikTokWorkerFactory.java")).u("A TikTok worker was created, but it has %s count tags instead of 1, so it was skipped", new eki(a3.size()));
                        d.close();
                        return null;
                    }
                    str2 = (String) hnu.X(a3);
                    koeVar = (koe) this.b.get(str2);
                } else {
                    koeVar = (koe) this.b.get(str);
                    if (koeVar != null) {
                        Set set = workerParameters.c;
                        Pattern pattern = gcv.a;
                        set.add("TikTokWorker#".concat(str));
                    }
                    str2 = str;
                }
                gzp gzpVar = this.f;
                if (gzpVar.f() && (a2 = ((gcj) gzpVar.b()).a()) != null) {
                    d.close();
                    return a2;
                }
                if (koeVar != null) {
                    if (str2 != null) {
                        guc gucVar = gub.a;
                        try {
                            gzp gzpVar2 = this.e;
                            if (gzpVar2.f()) {
                                gucVar = ((gcc) gzpVar2.b()).a();
                            }
                        } catch (RuntimeException e) {
                            ((hkf) ((hkf) ((hkf) a.g()).h(e)).i("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 137, "TikTokWorkerFactory.java")).s("Failed to get SpanExtras for a TikTokWorker");
                        }
                        TikTokListenableWorker tikTokListenableWorker = new TikTokListenableWorker(context, this.c, this.d, koeVar, workerParameters, gucVar);
                        d.close();
                        return tikTokListenableWorker;
                    }
                    str2 = null;
                }
                if (str.equals(TikTokListenableWorker.class.getName())) {
                    ((hkf) ((hkf) a.f()).i("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "maybeLogMissingWorkerMessage", 160, "TikTokWorkerFactory.java")).u("A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear.", str2);
                }
                d.close();
                return null;
            } finally {
            }
        } catch (RuntimeException e2) {
            ((hkf) ((hkf) ((hkf) a.g()).h(e2)).i("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", (char) 148, "TikTokWorkerFactory.java")).s("TikTokWorkerFactory failed to instantiate a TikTokWorker");
            return null;
        }
    }
}
