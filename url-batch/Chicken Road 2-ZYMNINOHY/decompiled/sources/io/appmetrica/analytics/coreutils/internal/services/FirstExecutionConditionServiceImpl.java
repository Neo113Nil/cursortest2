package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f9750a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private UtilityServiceConfiguration f9751b;

    /* renamed from: c, reason: collision with root package name */
    final UtilityServiceProvider f9752c;

    public static class FirstExecutionConditionChecker {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9753a = false;

        /* renamed from: b, reason: collision with root package name */
        private long f9754b;

        /* renamed from: c, reason: collision with root package name */
        private long f9755c;

        /* renamed from: d, reason: collision with root package name */
        private long f9756d;

        /* renamed from: e, reason: collision with root package name */
        private final FirstExecutionDelayChecker f9757e;
        public final String tag;

        public FirstExecutionConditionChecker(UtilityServiceConfiguration utilityServiceConfiguration, FirstExecutionDelayChecker firstExecutionDelayChecker, String str) {
            this.f9757e = firstExecutionDelayChecker;
            this.f9755c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f9754b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f9756d = Long.MAX_VALUE;
            this.tag = str;
        }

        public final void a(long j4) {
            this.f9756d = TimeUnit.SECONDS.toMillis(j4);
        }

        public final boolean b() {
            if (this.f9753a) {
                return true;
            }
            return this.f9757e.delaySinceFirstStartupWasPassed(this.f9755c, this.f9754b, this.f9756d);
        }

        public final void a() {
            this.f9753a = true;
        }

        public final void a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f9755c = utilityServiceConfiguration.getInitialConfigTime();
            this.f9754b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j4, long j5, long j6) {
            return j5 - j4 >= j6;
        }
    }

    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* renamed from: a, reason: collision with root package name */
        private final FirstExecutionConditionChecker f9758a;

        /* renamed from: b, reason: collision with root package name */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f9759b;

        /* renamed from: c, reason: collision with root package name */
        private final ICommonExecutor f9760c;

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i4) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean b4 = this.f9758a.b();
            if (b4) {
                this.f9758a.a();
            }
            return b4;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j4) {
            this.f9758a.a(j4);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j4) {
            if (!this.f9758a.b()) {
                return false;
            }
            this.f9759b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j4), this.f9760c);
            this.f9758a.a();
            return true;
        }

        public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f9758a.a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f9759b = activationBarrierHelper;
            this.f9758a = firstExecutionConditionChecker;
            this.f9760c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(UtilityServiceProvider utilityServiceProvider) {
        this.f9752c = utilityServiceProvider;
    }

    public final synchronized FirstExecutionHandler a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f9750a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    public synchronized FirstExecutionDelayedTask createDelayedTask(String str, ICommonExecutor iCommonExecutor, Runnable runnable) {
        return a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f9752c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f9751b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f9751b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f9750a);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((FirstExecutionHandler) obj).updateConfig(utilityServiceConfiguration);
        }
    }
}
