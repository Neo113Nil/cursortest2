package io.ktor.client.engine;

import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.util.CoroutinesUtilsKt;
import io.ktor.util.InternalAPI;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;

/* compiled from: HttpClientEngineBase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/HttpClientEngine;", "", "close", "()V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext$delegate", "Lkotlin/Lazy;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "", "engineName", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "ktor-client-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class HttpClientEngineBase implements HttpClientEngine {
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientEngineBase.class, "closed");
    private volatile /* synthetic */ int closed;

    /* renamed from: coroutineContext$delegate, reason: from kotlin metadata */
    private final Lazy coroutineContext;
    private final CoroutineDispatcher dispatcher;
    private final String engineName;

    public HttpClientEngineBase(String engineName) {
        Intrinsics.checkNotNullParameter(engineName, "engineName");
        this.engineName = engineName;
        this.closed = 0;
        this.dispatcher = HttpClientEngineBase_jvmKt.ioDispatcher();
        this.coroutineContext = LazyKt.lazy(new Function0<CoroutineContext>() { // from class: io.ktor.client.engine.HttpClientEngineBase$coroutineContext$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CoroutineContext invoke() {
                String str;
                CoroutineContext plus = CoroutinesUtilsKt.SilentSupervisor$default(null, 1, null).plus(HttpClientEngineBase.this.getDispatcher());
                StringBuilder sb = new StringBuilder();
                str = HttpClientEngineBase.this.engineName;
                return plus.plus(new CoroutineName(sb.append(str).append("-context").toString()));
            }
        });
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public Set<HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return HttpClientEngine.DefaultImpls.getSupportedCapabilities(this);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    @InternalAPI
    public void install(HttpClient httpClient) {
        HttpClientEngine.DefaultImpls.install(this, httpClient);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.coroutineContext.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closed$FU.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element element = getCoroutineContext().get(Job.INSTANCE);
            CompletableJob completableJob = element instanceof CompletableJob ? (CompletableJob) element : null;
            if (completableJob == null) {
                return;
            }
            completableJob.complete();
        }
    }
}
