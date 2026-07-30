package com.drake.net.body;

import android.os.SystemClock;
import com.drake.net.interfaces.c;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.b;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.d;
import okio.j0;
import okio.l;
import okio.v0;
import y5.f;

/* loaded from: classes3.dex */
public final class NetRequestBody extends RequestBody {
    private final RequestBody body;
    private final f contentLength$delegate;
    private final p4.a progress;
    private final ConcurrentLinkedQueue<c> progressListeners;

    public static final class a extends l {
        final /* synthetic */ NetRequestBody this$0;
        private long writeByteCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v0 v0Var, NetRequestBody netRequestBody) {
            super(v0Var);
            this.this$0 = netRequestBody;
        }

        @Override // okio.l, okio.v0
        public void write(okio.c source, long j8) {
            s.checkNotNullParameter(source, "source");
            super.write(source, j8);
            ConcurrentLinkedQueue concurrentLinkedQueue = this.this$0.progressListeners;
            if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return;
            }
            this.writeByteCount += j8;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ConcurrentLinkedQueue<c> concurrentLinkedQueue2 = this.this$0.progressListeners;
            NetRequestBody netRequestBody = this.this$0;
            for (c cVar : concurrentLinkedQueue2) {
                cVar.setIntervalByteCount(cVar.getIntervalByteCount() + j8);
                long elapsedTime = elapsedRealtime - cVar.getElapsedTime();
                if (!netRequestBody.progress.getFinish() && (this.writeByteCount == netRequestBody.getContentLength() || elapsedTime >= cVar.getInterval())) {
                    if (this.writeByteCount == netRequestBody.getContentLength()) {
                        netRequestBody.progress.setFinish$net_release(true);
                    }
                    p4.a aVar = netRequestBody.progress;
                    aVar.setCurrentByteCount$net_release(this.writeByteCount);
                    aVar.setTotalByteCount$net_release(netRequestBody.getContentLength());
                    aVar.setIntervalByteCount$net_release(cVar.getIntervalByteCount());
                    aVar.setIntervalTime$net_release(elapsedTime);
                    cVar.onProgress(aVar);
                    cVar.setElapsedTime(elapsedRealtime);
                    cVar.setIntervalByteCount(0L);
                }
            }
        }
    }

    public /* synthetic */ NetRequestBody(RequestBody requestBody, ConcurrentLinkedQueue concurrentLinkedQueue, int i8, o oVar) {
        this(requestBody, (i8 & 2) != 0 ? null : concurrentLinkedQueue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentLength() {
        return ((Number) this.contentLength$delegate.getValue()).longValue();
    }

    private final a toProgress(v0 v0Var) {
        return new a(v0Var, this);
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return getContentLength();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.body.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d sink) {
        boolean contains$default;
        ConcurrentLinkedQueue<c> concurrentLinkedQueue;
        s.checkNotNullParameter(sink, "sink");
        if (!(sink instanceof okio.c)) {
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) sink.toString(), (CharSequence) "com.android.tools.profiler.support.network.HttpTracker$OutputStreamTracker", false, 2, (Object) null);
            if (!contains$default) {
                d buffer = j0.buffer(toProgress(sink));
                this.body.writeTo(buffer);
                Util.closeQuietly(buffer);
                if (getContentLength() != -1 || (concurrentLinkedQueue = this.progressListeners) == null) {
                    return;
                }
                for (c cVar : concurrentLinkedQueue) {
                    p4.a aVar = this.progress;
                    aVar.setFinish$net_release(true);
                    cVar.onProgress(aVar);
                }
                return;
            }
        }
        this.body.writeTo(sink);
    }

    public NetRequestBody(RequestBody body, ConcurrentLinkedQueue<c> concurrentLinkedQueue) {
        f lazy;
        s.checkNotNullParameter(body, "body");
        this.body = body;
        this.progressListeners = concurrentLinkedQueue;
        this.progress = new p4.a();
        lazy = b.lazy(new f6.a() { // from class: com.drake.net.body.NetRequestBody$contentLength$2
            {
                super(0);
            }

            @Override // f6.a
            public final Long invoke() {
                RequestBody requestBody;
                requestBody = NetRequestBody.this.body;
                return Long.valueOf(requestBody.contentLength());
            }
        });
        this.contentLength$delegate = lazy;
    }
}
