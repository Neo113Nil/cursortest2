package com.drake.net.body;

import android.os.SystemClock;
import com.drake.net.body.NetResponseBody;
import com.drake.net.interfaces.c;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.b;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.e;
import okio.j0;
import okio.m;
import okio.x0;
import y5.f;

/* loaded from: classes3.dex */
public final class NetResponseBody extends ResponseBody {
    private final ResponseBody body;
    private final f bufferedSource$delegate;
    private final f6.a complete;
    private final f contentLength$delegate;
    private final p4.a progress;
    private final ConcurrentLinkedQueue<c> progressListeners;

    public static final class a extends m {
        private long readByteCount;
        final /* synthetic */ NetResponseBody this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x0 x0Var, NetResponseBody netResponseBody) {
            super(x0Var);
            this.this$0 = netResponseBody;
        }

        @Override // okio.m, okio.x0
        public long read(okio.c sink, long j8) {
            long j9;
            f6.a aVar;
            s.checkNotNullParameter(sink, "sink");
            try {
                long read = super.read(sink, j8);
                ConcurrentLinkedQueue concurrentLinkedQueue = this.this$0.progressListeners;
                if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                    this.readByteCount += read != -1 ? read : 0L;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    ConcurrentLinkedQueue<c> concurrentLinkedQueue2 = this.this$0.progressListeners;
                    NetResponseBody netResponseBody = this.this$0;
                    for (c cVar : concurrentLinkedQueue2) {
                        cVar.setIntervalByteCount(cVar.getIntervalByteCount() + (read != -1 ? read : 0L));
                        long elapsedTime = elapsedRealtime - cVar.getElapsedTime();
                        j9 = (netResponseBody.progress.getFinish() || !(this.readByteCount == netResponseBody.getContentLength() || read == -1 || elapsedTime >= cVar.getInterval())) ? -1L : -1L;
                        if (this.readByteCount == netResponseBody.getContentLength() || read == -1) {
                            netResponseBody.progress.setFinish$net_release(true);
                        }
                        p4.a aVar2 = netResponseBody.progress;
                        aVar2.setCurrentByteCount$net_release(this.readByteCount);
                        aVar2.setTotalByteCount$net_release(netResponseBody.getContentLength());
                        aVar2.setIntervalByteCount$net_release(cVar.getIntervalByteCount());
                        aVar2.setIntervalTime$net_release(elapsedTime);
                        cVar.onProgress(aVar2);
                        cVar.setElapsedTime(elapsedRealtime);
                        cVar.setIntervalByteCount(0L);
                    }
                    if (read == j9 && (aVar = this.this$0.complete) != null) {
                        aVar.invoke();
                    }
                    return read;
                }
                j9 = -1;
                if (read == j9) {
                    aVar.invoke();
                }
                return read;
            } catch (Exception e8) {
                f6.a aVar3 = this.this$0.complete;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                throw e8;
            }
        }
    }

    public /* synthetic */ NetResponseBody(ResponseBody responseBody, ConcurrentLinkedQueue concurrentLinkedQueue, f6.a aVar, int i8, o oVar) {
        this(responseBody, (i8 & 2) != 0 ? null : concurrentLinkedQueue, (i8 & 4) != 0 ? null : aVar);
    }

    private final e getBufferedSource() {
        return (e) this.bufferedSource$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentLength() {
        return ((Number) this.contentLength$delegate.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a toProgress(x0 x0Var) {
        return new a(x0Var, this);
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return getContentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.body.contentType();
    }

    @Override // okhttp3.ResponseBody
    public e source() {
        return getBufferedSource();
    }

    public NetResponseBody(ResponseBody body, ConcurrentLinkedQueue<c> concurrentLinkedQueue, f6.a aVar) {
        f lazy;
        f lazy2;
        s.checkNotNullParameter(body, "body");
        this.body = body;
        this.progressListeners = concurrentLinkedQueue;
        this.complete = aVar;
        this.progress = new p4.a();
        lazy = b.lazy(new f6.a() { // from class: com.drake.net.body.NetResponseBody$bufferedSource$2
            {
                super(0);
            }

            @Override // f6.a
            public final e invoke() {
                ResponseBody responseBody;
                NetResponseBody.a progress;
                NetResponseBody netResponseBody = NetResponseBody.this;
                responseBody = netResponseBody.body;
                progress = netResponseBody.toProgress(responseBody.source());
                return j0.buffer(progress);
            }
        });
        this.bufferedSource$delegate = lazy;
        lazy2 = b.lazy(new f6.a() { // from class: com.drake.net.body.NetResponseBody$contentLength$2
            {
                super(0);
            }

            @Override // f6.a
            public final Long invoke() {
                ResponseBody responseBody;
                responseBody = NetResponseBody.this.body;
                return Long.valueOf(responseBody.contentLength());
            }
        });
        this.contentLength$delegate = lazy2;
    }
}
