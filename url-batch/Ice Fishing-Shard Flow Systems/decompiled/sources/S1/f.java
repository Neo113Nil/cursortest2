package S1;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import e2.InterfaceC0372a;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0372a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2474a;

    public /* synthetic */ f(int i2) {
        this.f2474a = i2;
    }

    @Override // e2.InterfaceC0372a
    public final Object get() {
        switch (this.f2474a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                n nVar = ExecutorsRegistrar.f4405a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i2 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i2 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new T1.f(Executors.newFixedThreadPool(4, new T1.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f4408d.get());
            case 3:
                n nVar2 = ExecutorsRegistrar.f4405a;
                return new T1.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new T1.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f4408d.get());
            case 4:
                n nVar3 = ExecutorsRegistrar.f4405a;
                return new T1.f(Executors.newCachedThreadPool(new T1.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f4408d.get());
            case 5:
                n nVar4 = ExecutorsRegistrar.f4405a;
                return Executors.newSingleThreadScheduledExecutor(new T1.a("Firebase Scheduler", 0, null));
            default:
                B.f fVar = FirebaseMessaging.f4435m;
                return null;
        }
    }
}
