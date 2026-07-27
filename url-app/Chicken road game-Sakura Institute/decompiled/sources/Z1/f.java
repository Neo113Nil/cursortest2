package Z1;

import a2.ScheduledExecutorServiceC0418g;
import a2.ThreadFactoryC0412a;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import u2.InterfaceC1229b;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC1229b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4569a;

    public /* synthetic */ f(int i2) {
        this.f4569a = i2;
    }

    @Override // u2.InterfaceC1229b
    public final Object get() {
        switch (this.f4569a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                o oVar = ExecutorsRegistrar.f6057a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new ScheduledExecutorServiceC0418g(Executors.newFixedThreadPool(4, new ThreadFactoryC0412a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f6060d.get());
            case 3:
                o oVar2 = ExecutorsRegistrar.f6057a;
                return new ScheduledExecutorServiceC0418g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC0412a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f6060d.get());
            case 4:
                o oVar3 = ExecutorsRegistrar.f6057a;
                return new ScheduledExecutorServiceC0418g(Executors.newCachedThreadPool(new ThreadFactoryC0412a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f6060d.get());
            default:
                o oVar4 = ExecutorsRegistrar.f6057a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0412a("Firebase Scheduler", 0, null));
        }
    }
}
