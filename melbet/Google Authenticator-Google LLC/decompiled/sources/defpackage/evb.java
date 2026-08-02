package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.CancellationSignal;
import android.util.Log;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import j$.util.Objects;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class evb implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public evb(guq guqVar, Runnable runnable, int i) {
        this.c = i;
        this.a = guqVar;
        this.b = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v32, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [ekk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [icd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v27, types: [hvi, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v30, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v31, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v57, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v68, types: [icd, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.c) {
            case 0:
                ((evi) this.a).b(this.b);
                return;
            case 1:
                try {
                    hnu.aR(this.b);
                    return;
                } catch (Exception e) {
                    Log.w("FlagStore", "Failed to store account on flag read for: " + ((evi) this.a).d + " which may lead to stale flags.", e);
                    return;
                }
            case 2:
                Map a = evm.a(((etd) this.a).c);
                Object obj = this.b;
                if (a.containsKey(obj)) {
                    return;
                }
                Log.e("FilePhenotypeFlags", a.Z((String) obj, "Config package ", " cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                return;
            case 3:
                if (((hvj) this.b).isCancelled()) {
                    ((CancellationSignal) ((fwm) this.a).a).cancel();
                    return;
                }
                return;
            case 4:
                try {
                    ((fen) this.a).d.set((qy) hnu.aR(this.b));
                    return;
                } catch (ExecutionException e2) {
                    throw new RuntimeException(e2);
                }
            case 5:
                this.b.execute(this.a);
                return;
            case 6:
                Object obj2 = ((ikm) this.b).b;
                String a2 = fxl.a((frv) this.a);
                hjr it = ((gpj) obj2).a().iterator();
                while (it.hasNext()) {
                    File file = new File((File) it.next(), a2);
                    if (file.exists() && !file.setWritable(true, true)) {
                        throw new RuntimeException("Could not make data dir writable.");
                    }
                }
                return;
            case 7:
                Object obj3 = this.a;
                File b = ((gac) obj3).e.b((gpk) this.b);
                String[] list = b.list(new gab(obj3, i));
                if (list != null) {
                    while (i < list.length) {
                        String str = list[i];
                        if (new File(b, str).delete()) {
                            ((hkf) ((hkf) gac.a.e()).i("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "clean", 100, "OrphanCacheSingletonSynclet.java")).u("Removed orphaned cache file: %s", str);
                        } else {
                            ((hkf) ((hkf) gac.a.f()).i("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "clean", 102, "OrphanCacheSingletonSynclet.java")).u("Failed to remove orphaned cache file: %s", str);
                        }
                        i++;
                    }
                    return;
                }
                return;
            case 8:
                this.b.cancel(true);
                ?? r10 = this.a;
                if (r10.isCancelled()) {
                    return;
                }
                try {
                    hnu.aR(r10);
                    return;
                } catch (ExecutionException e3) {
                    gwd.k(e3.getCause());
                    return;
                }
            case 9:
                if (this.a.isCancelled()) {
                    this.b.cancel(true);
                    return;
                }
                return;
            case 10:
                TikTokListenableWorker.c(this.b, this.a);
                return;
            case 11:
                Object obj4 = this.b;
                Object obj5 = this.a;
                try {
                    ServiceInfo serviceInfo = ((gcg) obj5).e.getServiceInfo(new ComponentName(((gcg) obj5).b, "androidx.work.impl.background.systemjob.SystemJobService"), 262144);
                    boolean equals = Objects.equals(serviceInfo.processName, obj4);
                    ((hkf) ((hkf) gcg.a.e()).i("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 99, "DefaultProcessValidator.java")).F(((gcg) obj5).f, Boolean.valueOf(equals), serviceInfo.processName, obj4);
                    if (equals) {
                        return;
                    }
                    int ordinal = ((gcg) obj5).f.ordinal();
                    if (ordinal == 1) {
                        ((hkf) ((hkf) gcg.a.f()).i("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 126, "DefaultProcessValidator.java")).w("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", obj4, serviceInfo.processName);
                        return;
                    } else {
                        if (ordinal != 2) {
                            return;
                        }
                        ((hkf) ((hkf) gcg.a.g()).i("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 121, "DefaultProcessValidator.java")).s("Invalid process");
                        throw new IllegalStateException(String.format("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", obj4, serviceInfo.processName));
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    ((hkf) ((hkf) ((hkf) gcg.a.g()).h(e4)).i("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'l', "DefaultProcessValidator.java")).s("The WorkManager SystemJobService could not be found. If you are trying to disable WorkManager, make sure not to initialize it.");
                    return;
                } catch (RuntimeException e5) {
                    ((hkf) ((hkf) ((hkf) gcg.a.g()).h(e5)).i("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'r', "DefaultProcessValidator.java")).s("Failed to look up WorkManager manifest process");
                    return;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                this.b.run();
                ThreadLocal threadLocal = ((gdh) this.a).a;
                Throwable th = (Throwable) threadLocal.get();
                threadLocal.remove();
                if (th != null) {
                    throw th;
                }
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Set set = ((gfo) this.a).g;
                if (set != null) {
                    set.remove(this.b);
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((gfo) this.a).d((hrz) this.b);
                return;
            case 15:
                ?? r0 = this.a;
                gun a3 = gta.a();
                guq h = gta.h(a3, r0);
                try {
                    this.b.run();
                    return;
                } catch (Throwable th2) {
                    try {
                        gsv.c(th2);
                        throw th2;
                    } finally {
                        gta.h(a3, h);
                    }
                }
            case 16:
                ((hks) this.b).a.remove(this.a);
                return;
            case 17:
                hvh hvhVar = htz.a;
                bry bryVar = new bry(this.b, (char[]) null);
                Object obj6 = ((kee) this.a).a;
                synchronized (((gdy) obj6).a) {
                    ((gdy) obj6).c = bryVar;
                }
                return;
            case 18:
                Object obj7 = this.a;
                icd icdVar = ((iax) obj7).b;
                ?? r102 = this.b;
                if (icdVar != iax.a) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (obj7) {
                    ((iax) obj7).b = r102;
                }
                return;
            case 19:
                ((iau) this.a).c(this.b);
                return;
            default:
                Map map = ((idp) this.b).b;
                Object obj8 = this.a;
                synchronized (map) {
                    map.remove(obj8);
                }
                return;
        }
    }

    public evb(hks hksVar, hkr hkrVar, int i) {
        this.c = i;
        this.a = hkrVar;
        this.b = hksVar;
    }

    public /* synthetic */ evb(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ evb(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
