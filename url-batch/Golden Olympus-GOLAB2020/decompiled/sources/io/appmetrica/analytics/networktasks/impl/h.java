package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import com.ironsource.cc;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f40578a;

    /* renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f40579b;

    /* renamed from: c, reason: collision with root package name */
    public final f f40580c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f40578a = networkTask;
        this.f40579b = interruptionSafeThread;
        this.f40580c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f40578a.getExponentialBackoffPolicy();
        boolean canBeExecuted = this.f40578a.getConnectionExecutionPolicy().canBeExecuted();
        boolean canBeExecuted2 = this.f40578a.getExponentialBackoffPolicy().canBeExecuted(this.f40578a.getRetryPolicyConfig());
        if (!this.f40579b.isRunning() || !canBeExecuted || !canBeExecuted2) {
            this.f40578a.onShouldNotExecute();
            return;
        }
        boolean onCreateNetworkTask = this.f40578a.onCreateNetworkTask();
        Boolean bool = null;
        while (this.f40579b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f40578a.getRetryPolicyConfig())) {
            f fVar = this.f40580c;
            NetworkTask networkTask = this.f40578a;
            fVar.getClass();
            boolean z5 = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(StringsKt.W0(url).toString())) {
                    StringBuilder sb = new StringBuilder("Task ");
                    sb.append(networkTask.description());
                    sb.append(" url is `");
                    sb.append(url);
                    sb.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb.toString()));
                } else {
                    Request.Builder addHeader = new Request.Builder(url).addHeader("Accept", cc.f15719L).addHeader("User-Agent", networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        addHeader.addHeader((String) entry.getKey(), CollectionsKt.joinToString$default((Iterable) entry.getValue(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            addHeader.post(postData);
                            Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                addHeader.addHeader("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(sendTimestamp.longValue())));
                            }
                            Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                addHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    NetworkClient.Builder builder = new NetworkClient.Builder();
                    int i4 = b.f40574a;
                    Response execute = builder.withConnectTimeout(i4).withReadTimeout(i4).withSslSocketFactory(networkTask.getSslSocketFactory()).build().newCall(addHeader.build()).execute();
                    int code = execute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(execute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(execute.getResponseData());
                    }
                    if (execute.isCompleted()) {
                        z4 = networkTask.onRequestComplete();
                        bool = Boolean.valueOf(z4);
                        if (!z4 && this.f40578a.shouldTryNextHost()) {
                            z5 = true;
                        }
                        exponentialBackoffPolicy.onHostAttemptFinished(z4);
                        onCreateNetworkTask = z5;
                    } else {
                        networkTask.onRequestError(execute.getException());
                    }
                }
            } else {
                networkTask.onRequestError(null);
            }
            z4 = false;
            bool = Boolean.valueOf(z4);
            if (!z4) {
                z5 = true;
            }
            exponentialBackoffPolicy.onHostAttemptFinished(z4);
            onCreateNetworkTask = z5;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(Intrinsics.areEqual(bool, Boolean.TRUE));
    }
}
