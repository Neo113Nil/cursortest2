package com.yandex.div.internal.viewpool;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ViewPoolProfiler {

    @NotNull
    private final FrameWatcher frameWatcher;

    @NotNull
    private final Handler handler;

    @NotNull
    private final Reporter reporter;

    @NotNull
    private final ProfilingSession session;

    @Metadata
    private final class FrameWatcher implements Runnable {
        private boolean watching;

        public FrameWatcher() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPoolProfiler.this.onFrameReady$div_release();
            this.watching = false;
        }

        public final void watch(@NotNull Handler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            if (this.watching) {
                return;
            }
            handler.post(this);
            this.watching = true;
        }
    }

    @Metadata
    public interface Reporter {

        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;

        @NotNull
        public static final Reporter NO_OP = new Reporter() { // from class: com.yandex.div.internal.viewpool.ViewPoolProfiler$Reporter$Companion$NO_OP$1
            @Override // com.yandex.div.internal.viewpool.ViewPoolProfiler.Reporter
            public void reportEvent(@NotNull String message, @NotNull Map<String, ? extends Object> result) {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(result, "result");
            }
        };

        @Metadata
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        void reportEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map);
    }

    public ViewPoolProfiler(@NotNull Reporter reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.reporter = reporter;
        this.session = new ProfilingSession();
        this.frameWatcher = new FrameWatcher();
        this.handler = new Handler(Looper.getMainLooper());
    }

    public final void onFrameReady$div_release() {
        synchronized (this.session) {
            try {
                if (this.session.hasLongEvents()) {
                    this.reporter.reportEvent("view pool profiling", this.session.flush());
                }
                this.session.clear();
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onViewObtainedWithBlock$div_release(@NotNull String viewName, long j4) {
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        synchronized (this.session) {
            this.session.viewObtainedWithBlock(viewName, j4);
            this.frameWatcher.watch(this.handler);
            Unit unit = Unit.f41027a;
        }
    }

    public final void onViewObtainedWithoutBlock$div_release(long j4) {
        synchronized (this.session) {
            this.session.viewObtainedWithoutBlock(j4);
            this.frameWatcher.watch(this.handler);
            Unit unit = Unit.f41027a;
        }
    }

    public final void onViewRequested$div_release(long j4) {
        this.session.viewRequested(j4);
        this.frameWatcher.watch(this.handler);
    }
}
