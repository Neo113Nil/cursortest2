package androidx.activity;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.s;
import y5.w;

/* loaded from: classes.dex */
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;

    @GuardedBy("lock")
    private final List<f6.a> onReportCallbacks;
    private final f6.a reportFullyDrawn;

    @GuardedBy("lock")
    private boolean reportPosted;
    private final Runnable reportRunnable;

    @GuardedBy("lock")
    private boolean reportedFullyDrawn;

    @GuardedBy("lock")
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, f6.a reportFullyDrawn) {
        s.checkNotNullParameter(executor, "executor");
        s.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = reportFullyDrawn;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.j
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.reportRunnable$lambda$2(FullyDrawnReporter.this);
            }
        };
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter this$0) {
        s.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                this$0.reportPosted = false;
                if (this$0.reporterCount == 0 && !this$0.reportedFullyDrawn) {
                    this$0.reportFullyDrawn.invoke();
                    this$0.fullyDrawnReported();
                }
                w wVar = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void addOnReportDrawnListener(f6.a callback) {
        boolean z7;
        s.checkNotNullParameter(callback, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z7 = true;
            } else {
                this.onReportCallbacks.add(callback);
                z7 = false;
            }
        }
        if (z7) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn) {
                    this.reporterCount++;
                }
                w wVar = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((f6.a) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
                w wVar = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z7;
        synchronized (this.lock) {
            z7 = this.reportedFullyDrawn;
        }
        return z7;
    }

    public final void removeOnReportDrawnListener(f6.a callback) {
        s.checkNotNullParameter(callback, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(callback);
            w wVar = w.INSTANCE;
        }
    }

    public final void removeReporter() {
        int i8;
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn && (i8 = this.reporterCount) > 0) {
                    this.reporterCount = i8 - 1;
                    postWhenReportersAreDone();
                }
                w wVar = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
