package defpackage;

import android.os.StrictMode;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ck implements p01 {
    public final /* synthetic */ int a;

    @Override // defpackage.p01
    public final Object get() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Collections.EMPTY_SET;
            case 1:
                be0 be0Var = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new fr(Executors.newFixedThreadPool(4, new fo("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                be0 be0Var2 = ExecutorsRegistrar.a;
                return new fr(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new fo("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                be0 be0Var3 = ExecutorsRegistrar.a;
                return new fr(Executors.newCachedThreadPool(new fo("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                be0 be0Var4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new fo("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
