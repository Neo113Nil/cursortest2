package H1;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import q1.ThreadFactoryC0596a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements A1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f979a;

    public /* synthetic */ o(int i7) {
        this.f979a = i7;
    }

    @Override // A1.a
    public final Object get() {
        switch (this.f979a) {
            case 0:
                D3.M m4 = FirebaseMessaging.f3898k;
                return null;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return Collections.EMPTY_SET;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return null;
            case 3:
                p1.k kVar = ExecutorsRegistrar.f3891a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i7 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i7 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new q1.e(Executors.newFixedThreadPool(4, new ThreadFactoryC0596a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f3894d.get());
            case 4:
                p1.k kVar2 = ExecutorsRegistrar.f3891a;
                return new q1.e(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC0596a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f3894d.get());
            case 5:
                p1.k kVar3 = ExecutorsRegistrar.f3891a;
                return new q1.e(Executors.newCachedThreadPool(new ThreadFactoryC0596a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f3894d.get());
            default:
                p1.k kVar4 = ExecutorsRegistrar.f3891a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0596a("Firebase Scheduler", 0, null));
        }
    }
}
