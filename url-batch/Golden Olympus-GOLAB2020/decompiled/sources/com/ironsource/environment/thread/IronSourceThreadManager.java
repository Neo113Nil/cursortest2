package com.ironsource.environment.thread;

import W1.h;
import W1.i;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.jr;
import com.ironsource.o9;
import com.ironsource.zj;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class IronSourceThreadManager {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f16098a;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Handler f16100c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final zj f16101d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final zj f16102e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final zj f16103f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final h f16104g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final h f16105h;

    @NotNull
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Handler f16099b = new Handler(Looper.getMainLooper());

    @Metadata
    static final class a extends s implements Function0<jr> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16106a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jr invoke() {
            return new jr(0, null, null, 7, null);
        }
    }

    @Metadata
    static final class b extends s implements Function0<zj> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16107a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zj invoke() {
            zj zjVar = new zj("managersThread");
            zjVar.start();
            zjVar.a();
            return zjVar;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        f16100c = new Handler(handlerThread.getLooper());
        zj zjVar = new zj("mediationBackground");
        zjVar.start();
        zjVar.a();
        f16101d = zjVar;
        zj zjVar2 = new zj("adapterBackground");
        zjVar2.start();
        zjVar2.a();
        f16102e = zjVar2;
        zj zjVar3 = new zj("publisher-callbacks");
        zjVar3.start();
        zjVar3.a();
        f16103f = zjVar3;
        f16104g = i.b(a.f16106a);
        f16105h = i.b(b.f16107a);
    }

    private IronSourceThreadManager() {
    }

    private final jr a() {
        return (jr) f16104g.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j4);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j4);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j4);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j4);
    }

    public final void executeTasks(boolean z4, boolean z5, @NotNull List<? extends Runnable> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!z4) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z5) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        for (final Runnable runnable : tasks) {
            postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.b
                @Override // java.lang.Runnable
                public final void run() {
                    IronSourceThreadManager.a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e4) {
            o9.d().a(e4);
        }
    }

    @NotNull
    public final Handler getInitHandler() {
        return f16100c;
    }

    @NotNull
    public final zj getSharedManagersThread() {
        return (zj) f16105h.getValue();
    }

    @NotNull
    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f16098a;
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            f16102e.b(action);
        }
    }

    public final void removeMediationBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            f16101d.b(action);
        }
    }

    public final void removeUiThreadTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        f16099b.removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z4) {
        f16098a = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, final CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new Runnable() { // from class: com.ironsource.environment.thread.a
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(latch);
            }
        }.run();
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable action, long j4) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f16098a) {
            a().schedule(action, j4, TimeUnit.MILLISECONDS);
        } else {
            f16102e.a(action, j4);
        }
    }

    public final void postMediationBackgroundTask(@NotNull Runnable action, long j4) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f16098a) {
            a().schedule(action, j4, TimeUnit.MILLISECONDS);
        } else {
            f16101d.a(action, j4);
        }
    }

    public final void postOnUiThreadTask(@NotNull Runnable action, long j4) {
        Intrinsics.checkNotNullParameter(action, "action");
        f16099b.postDelayed(action, j4);
    }

    public final void postPublisherCallback(@NotNull Runnable action, long j4) {
        Intrinsics.checkNotNullParameter(action, "action");
        f16103f.a(action, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }

    private final boolean a(Runnable runnable) {
        return f16098a && a().getQueue().contains(runnable);
    }
}
