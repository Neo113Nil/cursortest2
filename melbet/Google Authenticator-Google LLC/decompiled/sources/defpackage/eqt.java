package defpackage;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqt extends eos implements ekq, emk {
    public static final long a;
    public final emi b;
    public final Context c;
    public final jpt d;
    public final erj e;
    private final ekv f;
    private final Executor g;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 43200000L;
    }

    public eqt(ldt ldtVar, Context context, ekv ekvVar, Executor executor, jpt jptVar, erj erjVar, koe koeVar) {
        super((byte[]) null);
        this.b = ldtVar.n(executor, jptVar, koeVar);
        this.g = executor;
        this.c = context;
        this.d = jptVar;
        this.e = erjVar;
        this.f = ekvVar;
    }

    @Override // defpackage.ekq
    public final void g(eik eikVar) {
        this.f.b(this);
        hnu.aN(new htq() { // from class: eqs
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, koe] */
            /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Object, koe] */
            /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, koe] */
            @Override // defpackage.htq
            public final hvi a() {
                List storageVolumes;
                String state;
                String uuid;
                UUID uuid2;
                UUID uuid3;
                StorageStats queryStatsForPackage;
                UUID uuid4;
                long appBytes;
                long dataBytes;
                long cacheBytes;
                long cacheBytes2;
                long appBytes2;
                long dataBytes2;
                long cacheBytes3;
                long cacheBytes4;
                long j;
                eqt eqtVar = eqt.this;
                Context context = eqtVar.c;
                if (!djl.i(context)) {
                    ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 109, "StorageMetricServiceImpl.java")).s("Device locked.");
                    return hve.a;
                }
                fao.b();
                erj erjVar = eqtVar.e;
                long j2 = eqt.a;
                fao.b();
                Context context2 = (Context) erjVar.a;
                if (djl.i(context2)) {
                    long j3 = djl.i(context2) ? ((SharedPreferences) erjVar.b.b()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime < j3) {
                        if (((SharedPreferences) erjVar.b.b()).edit().remove("primes.packageMetric.lastSendTime").commit()) {
                            j = -1;
                        } else {
                            j = -1;
                            ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/sampling/PersistentRateLimiting", "hasRecentTimeStamp", 51, "PersistentRateLimiting.java")).s("Failure storing timestamp to SharedPreferences");
                        }
                        j3 = j;
                    } else {
                        j = -1;
                    }
                    if (j3 != j && elapsedRealtime <= j3 + j2) {
                        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 113, "StorageMetricServiceImpl.java")).s("Ignoring storage metric request, storage metric collection occurred too recently.");
                        return hve.a;
                    }
                }
                PackageStats packageStats = null;
                if (!eqtVar.b.c(null)) {
                    return hve.a;
                }
                fao.b();
                fao.b();
                StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
                String str = "PackageStatsCaptureO.java";
                if (storageManager == null) {
                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", 30, "PackageStatsCaptureO.java")).s("StorageManager is not available");
                } else {
                    StorageStatsManager m = am$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(am$$ExternalSyntheticApiModelOutline0.m44m()));
                    if (m == null) {
                        ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", 35, "PackageStatsCaptureO.java")).s("StorageStatsManager is not available");
                    } else {
                        String packageName = context.getPackageName();
                        PackageStats packageStats2 = new PackageStats(packageName);
                        storageVolumes = storageManager.getStorageVolumes();
                        Iterator it = storageVolumes.iterator();
                        while (it.hasNext()) {
                            StorageVolume m7m = a$$ExternalSyntheticApiModelOutline0.m7m(it.next());
                            state = m7m.getState();
                            if (state.equals("mounted")) {
                                uuid = m7m.getUuid();
                                if ("1AEF-1A1E".equals(uuid)) {
                                    uuid2 = packageStats;
                                } else {
                                    try {
                                        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getUuid", 71, "PackageStatsCaptureO.java")).u("UUID for %s", uuid);
                                        if (uuid == null) {
                                            uuid3 = StorageManager.UUID_DEFAULT;
                                            uuid2 = uuid3;
                                        } else {
                                            uuid2 = UUID.fromString(uuid);
                                        }
                                    } catch (IllegalArgumentException e) {
                                        ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getUuid", 76, "PackageStatsCaptureO.java")).u("Invalid UUID format: '%s'", uuid);
                                        uuid2 = 0;
                                    }
                                }
                                if (uuid2 != 0) {
                                    try {
                                        queryStatsForPackage = m.queryStatsForPackage(uuid2, packageName, Process.myUserHandle());
                                        uuid4 = StorageManager.UUID_DEFAULT;
                                        if (uuid4.equals(uuid2)) {
                                            long j4 = packageStats2.codeSize;
                                            appBytes2 = queryStatsForPackage.getAppBytes();
                                            packageStats2.codeSize = j4 + appBytes2;
                                            long j5 = packageStats2.dataSize;
                                            dataBytes2 = queryStatsForPackage.getDataBytes();
                                            cacheBytes3 = queryStatsForPackage.getCacheBytes();
                                            packageStats2.dataSize = j5 + (dataBytes2 - cacheBytes3);
                                            long j6 = packageStats2.cacheSize;
                                            cacheBytes4 = queryStatsForPackage.getCacheBytes();
                                            packageStats2.cacheSize = j6 + cacheBytes4;
                                        } else {
                                            long j7 = packageStats2.externalCodeSize;
                                            appBytes = queryStatsForPackage.getAppBytes();
                                            packageStats2.externalCodeSize = j7 + appBytes;
                                            long j8 = packageStats2.externalDataSize;
                                            dataBytes = queryStatsForPackage.getDataBytes();
                                            cacheBytes = queryStatsForPackage.getCacheBytes();
                                            packageStats2.externalDataSize = j8 + (dataBytes - cacheBytes);
                                            long j9 = packageStats2.externalCacheSize;
                                            cacheBytes2 = queryStatsForPackage.getCacheBytes();
                                            packageStats2.externalCacheSize = j9 + cacheBytes2;
                                        }
                                    } catch (PackageManager.NameNotFoundException | IOException | RuntimeException e2) {
                                        String str2 = str;
                                        ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", '3', str2)).s("queryStatsForPackage() call failed");
                                        m = m;
                                        packageStats2 = packageStats2;
                                        str = str2;
                                    }
                                }
                                packageStats = null;
                            }
                        }
                        packageStats = packageStats2;
                    }
                }
                if (packageStats == null) {
                    return hnu.aI(new IllegalStateException("PackageStats capture failed."));
                }
                jkj k = lgv.a.k();
                jkj k2 = lgr.a.k();
                long j10 = packageStats.cacheSize;
                if (!k2.b.M()) {
                    k2.t();
                }
                lgr lgrVar = (lgr) k2.b;
                lgrVar.b |= 1;
                lgrVar.c = j10;
                long j11 = packageStats.codeSize;
                if (!k2.b.M()) {
                    k2.t();
                }
                lgr lgrVar2 = (lgr) k2.b;
                lgrVar2.b |= 2;
                lgrVar2.d = j11;
                long j12 = packageStats.dataSize;
                if (!k2.b.M()) {
                    k2.t();
                }
                lgr lgrVar3 = (lgr) k2.b;
                lgrVar3.b |= 4;
                lgrVar3.e = j12;
                long j13 = packageStats.externalCacheSize;
                if (!k2.b.M()) {
                    k2.t();
                }
                lgr lgrVar4 = (lgr) k2.b;
                lgrVar4.b |= 8;
                lgrVar4.f = j13;
                long j14 = packageStats.externalCodeSize;
                if (!k2.b.M()) {
                    k2.t();
                }
                lgr lgrVar5 = (lgr) k2.b;
                lgrVar5.b |= 16;
                lgrVar5.g = j14;
                long j15 = packageStats.externalDataSize;
                if (!k2.b.M()) {
                    k2.t();
                }
                lgr lgrVar6 = (lgr) k2.b;
                lgrVar6.b |= 32;
                lgrVar6.h = j15;
                long j16 = packageStats.externalMediaSize;
                if (!k2.b.M()) {
                    k2.t();
                }
                lgr lgrVar7 = (lgr) k2.b;
                lgrVar7.b |= 64;
                lgrVar7.i = j16;
                long j17 = packageStats.externalObbSize;
                if (!k2.b.M()) {
                    k2.t();
                }
                lgr lgrVar8 = (lgr) k2.b;
                lgrVar8.b |= 128;
                lgrVar8.j = j17;
                jkj C = ((lgr) k2.q()).C();
                gzp gzpVar = ((eqr) eqtVar.d.b()).a;
                if (!k.b.M()) {
                    k.t();
                }
                lgv lgvVar = (lgv) k.b;
                lgr lgrVar9 = (lgr) C.q();
                lgrVar9.getClass();
                lgvVar.j = lgrVar9;
                lgvVar.b |= 128;
                erj erjVar2 = eqtVar.e;
                if (!djl.i((Context) erjVar2.a) || !((SharedPreferences) erjVar2.b.b()).edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit()) {
                    ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 147, "StorageMetricServiceImpl.java")).s("Failure storing timestamp persistently");
                }
                emi emiVar = eqtVar.b;
                eme a2 = emf.a();
                a2.f((lgv) k.q());
                return emiVar.b(a2.a());
            }
        }, this.g);
    }

    @Override // defpackage.emk
    public final void k() {
        this.f.a(this);
    }

    @Override // defpackage.ekq
    public final /* synthetic */ void j(eik eikVar) {
    }
}
