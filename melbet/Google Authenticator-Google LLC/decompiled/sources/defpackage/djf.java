package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djf {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(dix dixVar, hrz hrzVar) {
        final ExecutorService threadPoolExecutor;
        Context context = dixVar.a;
        final dbw dbwVar = new dbw(context);
        String valueOf = String.valueOf(context.getPackageName());
        if (hrzVar.a == null) {
            try {
                hrzVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                hrzVar.a = -1;
            }
        }
        final String concat = "com.google.android.libraries.consentverifier#".concat(valueOf);
        ddi f = dbwVar.f(concat, ((Integer) hrzVar.a).intValue(), c, null);
        if (dih.b(dixVar.a)) {
            dih dihVar = cxc.a;
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(10, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cxb(0));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            threadPoolExecutor = Executors.unconfigurableExecutorService(threadPoolExecutor2);
        } else {
            RejectedExecutionHandler rejectedExecutionHandler = dji.a;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            ids idsVar = new ids((char[]) null, (byte[]) null);
            idsVar.n("ConsentVerifierLibraryThread-%d");
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, ids.p(idsVar), dji.a);
        }
        try {
            f.j(threadPoolExecutor, new dde() { // from class: dje
                @Override // defpackage.dde
                public final void d(Object obj) {
                    boolean z = djf.a;
                    dbw dbwVar2 = dbw.this;
                    String str = concat;
                    dbwVar2.q(str).i(threadPoolExecutor, new cvy(str, 6));
                }
            });
            f.i(threadPoolExecutor, new cvy(concat, 5));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", concat, e));
        }
    }
}
