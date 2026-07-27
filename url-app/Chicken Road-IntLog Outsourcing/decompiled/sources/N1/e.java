package N1;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Y1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2005a;

    public /* synthetic */ e(int i2) {
        this.f2005a = i2;
    }

    @Override // Y1.a
    public final Object get() {
        switch (this.f2005a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                m mVar = ExecutorsRegistrar.f5312a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i2 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i2 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new O1.g(Executors.newFixedThreadPool(4, new O1.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f5315d.get());
            case 3:
                m mVar2 = ExecutorsRegistrar.f5312a;
                return new O1.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new O1.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f5315d.get());
            case 4:
                m mVar3 = ExecutorsRegistrar.f5312a;
                return new O1.g(Executors.newCachedThreadPool(new O1.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f5315d.get());
            case 5:
                m mVar4 = ExecutorsRegistrar.f5312a;
                return Executors.newSingleThreadScheduledExecutor(new O1.a("Firebase Scheduler", 0, null));
            default:
                U.e eVar = FirebaseMessaging.f5319k;
                return null;
        }
    }
}
