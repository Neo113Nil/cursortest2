package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static volatile NetworkServiceLocator f9879b;

    /* renamed from: a, reason: collision with root package name */
    private final NetworkCore f9880a;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f9879b;
            if (networkServiceLocator != null) {
                return networkServiceLocator;
            }
            i.l("instance");
            throw null;
        }

        public final void init(IExecutionPolicy iExecutionPolicy) {
            if (NetworkServiceLocator.f9879b == null) {
                synchronized (NetworkServiceLocator.class) {
                    if (NetworkServiceLocator.f9879b == null) {
                        NetworkServiceLocator.f9879b = new NetworkServiceLocator(iExecutionPolicy);
                    }
                }
            }
        }

        private Companion() {
        }

        public final void init(NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.f9879b = networkServiceLocator;
        }
    }

    public NetworkServiceLocator(IExecutionPolicy iExecutionPolicy) {
        NetworkCore networkCore = new NetworkCore(iExecutionPolicy);
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.f9880a = networkCore;
    }

    public static final NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    public static final void init(IExecutionPolicy iExecutionPolicy) {
        Companion.init(iExecutionPolicy);
    }

    public final NetworkCore getNetworkCore() {
        return this.f9880a;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.f9880a.stopTasks();
    }

    public static final void init(NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }
}
