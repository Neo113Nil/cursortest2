package defpackage;

import android.os.Trace;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljo {
    public final lkc a;
    final Executor b;
    final Executor c;
    public final /* synthetic */ ljq d;

    public ljo(ljq ljqVar, UrlRequest.Callback callback, Executor executor) {
        this.d = ljqVar;
        this.a = new lkc(callback);
        if (ljqVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new pl(executor, 5);
            this.c = executor;
        }
    }

    public final void a(ljr ljrVar, String str) {
        try {
            b(new kyf(this.d, ljrVar, 7), str);
        } catch (RejectedExecutionException e) {
            this.d.b(new lis("Exception posting task to executor", e));
        }
    }

    final void b(Runnable runnable, String str) {
        byte[] bArr = null;
        new cyi("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str), 2, null);
        try {
            this.b.execute(new kyf(str, runnable, 12, bArr));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        this.d.d(new kkh(this, 15, null), "maybeReportMetrics");
    }

    final void d() {
        a(new ljh(this, 5), "onResponseStarted");
    }
}
