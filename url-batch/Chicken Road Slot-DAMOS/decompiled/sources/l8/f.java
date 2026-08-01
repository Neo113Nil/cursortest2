package l8;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements w8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5906a;

    @Override // w8.a
    public final Object get() {
        switch (this.f5906a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                n nVar = ExecutorsRegistrar.f3069a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new m8.g(Executors.newFixedThreadPool(4, new m8.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f3072d.get());
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                n nVar2 = ExecutorsRegistrar.f3069a;
                return new m8.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new m8.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f3072d.get());
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                n nVar3 = ExecutorsRegistrar.f3069a;
                return new m8.g(Executors.newCachedThreadPool(new m8.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f3072d.get());
            default:
                n nVar4 = ExecutorsRegistrar.f3069a;
                return Executors.newSingleThreadScheduledExecutor(new m8.a("Firebase Scheduler", 0, null));
        }
    }
}
