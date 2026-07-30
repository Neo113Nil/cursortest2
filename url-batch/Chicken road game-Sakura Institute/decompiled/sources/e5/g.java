package e5;

import android.os.Build;
import android.os.StrictMode;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2768a;

    public /* synthetic */ g(int i7) {
        this.f2768a = i7;
    }

    @Override // z5.b
    public final Object get() {
        switch (this.f2768a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                p pVar = ExecutorsRegistrar.f1802a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i7 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i7 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new f5.g(Executors.newFixedThreadPool(4, new f5.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f1805d.get());
            case 3:
                p pVar2 = ExecutorsRegistrar.f1802a;
                return new f5.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new f5.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f1805d.get());
            case 4:
                p pVar3 = ExecutorsRegistrar.f1802a;
                return new f5.g(Executors.newCachedThreadPool(new f5.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f1805d.get());
            default:
                p pVar4 = ExecutorsRegistrar.f1802a;
                return Executors.newSingleThreadScheduledExecutor(new f5.a("Firebase Scheduler", 0, null));
        }
    }
}
