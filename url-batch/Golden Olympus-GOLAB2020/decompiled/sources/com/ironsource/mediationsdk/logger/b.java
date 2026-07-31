package com.ironsource.mediationsdk.logger;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes2.dex */
public class b extends IronSourceLogger {

    /* renamed from: e, reason: collision with root package name */
    private static final String f17656e = "publisher";

    /* renamed from: c, reason: collision with root package name */
    private LogListener f17657c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17658d;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f17659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceLogger.IronSourceTag f17660b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17661c;

        a(String str, IronSourceLogger.IronSourceTag ironSourceTag, int i4) {
            this.f17659a = str;
            this.f17660b = ironSourceTag;
            this.f17661c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f17657c == null || this.f17659a == null) {
                return;
            }
            b.this.f17657c.onLog(this.f17660b, this.f17659a, this.f17661c);
        }
    }

    private b() {
        super("publisher");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i4) {
        a aVar = new a(str, ironSourceTag, i4);
        if (this.f17658d) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(aVar);
        } else {
            IronSourceThreadManager.INSTANCE.postPublisherCallback(aVar);
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }

    public b(LogListener logListener, int i4) {
        super("publisher", i4);
        this.f17657c = logListener;
        this.f17658d = false;
    }

    public void a(LogListener logListener) {
        this.f17657c = logListener;
    }

    public void a(boolean z4) {
        this.f17658d = z4;
    }
}
