package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static volatile NetworkServiceLocator f8904b;

    /* renamed from: a, reason: collision with root package name */
    private final NetworkCore f8905a;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f8904b;
            if (networkServiceLocator != null) {
                return networkServiceLocator;
            }
            j.g("instance");
            throw null;
        }

        public final void init(IExecutionPolicy iExecutionPolicy) {
            if (NetworkServiceLocator.f8904b == null) {
                synchronized (NetworkServiceLocator.class) {
                    if (NetworkServiceLocator.f8904b == null) {
                        NetworkServiceLocator.f8904b = new NetworkServiceLocator(iExecutionPolicy);
                    }
                }
            }
        }

        private Companion() {
        }

        public final void init(NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.f8904b = networkServiceLocator;
        }
    }

    public NetworkServiceLocator(IExecutionPolicy iExecutionPolicy) {
        NetworkCore networkCore = new NetworkCore(iExecutionPolicy);
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.f8905a = networkCore;
    }

    public static final NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    public static final void init(IExecutionPolicy iExecutionPolicy) {
        Companion.init(iExecutionPolicy);
    }

    public final NetworkCore getNetworkCore() {
        return this.f8905a;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.f8905a.stopTasks();
    }

    public static final void init(NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }
}
