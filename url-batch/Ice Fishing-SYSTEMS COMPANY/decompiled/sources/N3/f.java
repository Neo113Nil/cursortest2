package N3;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.icefishing.icefishingliveapp.A;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2163a;

    @Override // Y3.a
    public final Object get() {
        switch (this.f2163a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                n nVar = ExecutorsRegistrar.f36345a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new O3.f(Executors.newFixedThreadPool(4, new O3.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f36348d.get());
            case 3:
                n nVar2 = ExecutorsRegistrar.f36345a;
                return new O3.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new O3.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f36348d.get());
            case 4:
                n nVar3 = ExecutorsRegistrar.f36345a;
                return new O3.f(Executors.newCachedThreadPool(new O3.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f36348d.get());
            case 5:
                n nVar4 = ExecutorsRegistrar.f36345a;
                return Executors.newSingleThreadScheduledExecutor(new O3.a("Firebase Scheduler", 0, null));
            default:
                A a9 = FirebaseMessaging.f36352k;
                return null;
        }
    }
}
