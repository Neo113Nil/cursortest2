package defpackage;

import android.app.Application;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class grv implements gzf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ grv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, koe] */
    @Override // defpackage.gzf
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            if (((Boolean) obj).booleanValue()) {
                ldt ldtVar = (ldt) this.a;
                goh gohVar = (goh) ldtVar.e.b();
                ikj ikjVar = (ikj) ldtVar.a;
                gohVar.a((String) ikjVar.b, (String) ikjVar.a, "poke");
            }
            return null;
        }
        if (i == 1) {
            hkf hkfVar = (hkf) ((hkf) gri.a.b()).i("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleWorker", 213, "SyncWorkManagerPeriodicScheduler.java");
            gqt gqtVar = (gqt) this.a;
            hkfVar.E(gqtVar.a, gqtVar.b);
            return null;
        }
        if (i == 2) {
            if (((Boolean) obj).booleanValue()) {
                ldt ldtVar2 = (ldt) this.a;
                goh gohVar2 = (goh) ldtVar2.e.b();
                ikj ikjVar2 = (ikj) ldtVar2.a;
                gohVar2.a((String) ikjVar2.b, (String) ikjVar2.a, "sync");
            }
            return null;
        }
        if (i == 3) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) obj;
            activityLifecycleCallbacks.getClass();
            return new guw((gva) this.a, activityLifecycleCallbacks);
        }
        if (i != 4) {
            return new hgm((hgu) this.a, obj);
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return new hhj(entry, (kee) this.a);
    }
}
