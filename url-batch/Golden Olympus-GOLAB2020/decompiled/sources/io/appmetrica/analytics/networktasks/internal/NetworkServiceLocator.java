package io.appmetrica.analytics.networktasks.internal;

import com.ironsource.C1513m5;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static volatile NetworkServiceLocator f40611b;

    /* renamed from: a, reason: collision with root package name */
    private final NetworkCore f40612a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f40611b;
            if (networkServiceLocator != null) {
                return networkServiceLocator;
            }
            Intrinsics.throwUninitializedPropertyAccessException(C1513m5.f17169p);
            return null;
        }

        public final void init(@NotNull IExecutionPolicy iExecutionPolicy) {
            if (NetworkServiceLocator.f40611b == null) {
                synchronized (NetworkServiceLocator.class) {
                    try {
                        if (NetworkServiceLocator.f40611b == null) {
                            NetworkServiceLocator.f40611b = new NetworkServiceLocator(iExecutionPolicy);
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        private Companion() {
        }

        public final void init(@NotNull NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.f40611b = networkServiceLocator;
        }
    }

    public NetworkServiceLocator(@NotNull IExecutionPolicy iExecutionPolicy) {
        NetworkCore networkCore = new NetworkCore(iExecutionPolicy);
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.f40612a = networkCore;
    }

    @NotNull
    public static final NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    public static final void init(@NotNull IExecutionPolicy iExecutionPolicy) {
        Companion.init(iExecutionPolicy);
    }

    @NotNull
    public final NetworkCore getNetworkCore() {
        return this.f40612a;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.f40612a.stopTasks();
    }

    public static final void init(@NotNull NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }
}
