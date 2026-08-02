package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import d3.i;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f13289a;

    /* renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f13290b;

    /* renamed from: c, reason: collision with root package name */
    public final f f13291c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f13289a = networkTask;
        this.f13290b = interruptionSafeThread;
        this.f13291c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f13289a.getExponentialBackoffPolicy();
        boolean canBeExecuted = this.f13289a.getConnectionExecutionPolicy().canBeExecuted();
        boolean canBeExecuted2 = this.f13289a.getExponentialBackoffPolicy().canBeExecuted(this.f13289a.getRetryPolicyConfig());
        if (!this.f13290b.isRunning() || !canBeExecuted || !canBeExecuted2) {
            this.f13289a.onShouldNotExecute();
            return;
        }
        boolean onCreateNetworkTask = this.f13289a.onCreateNetworkTask();
        Boolean bool = null;
        while (this.f13290b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f13289a.getRetryPolicyConfig())) {
            f fVar = this.f13291c;
            NetworkTask networkTask = this.f13289a;
            fVar.getClass();
            boolean z4 = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(AbstractC1510g.r0(url).toString())) {
                    StringBuilder sb = new StringBuilder("Task ");
                    sb.append(networkTask.description());
                    sb.append(" url is `");
                    sb.append(url);
                    sb.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb.toString()));
                } else {
                    Request.Builder addHeader = new Request.Builder(url).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        addHeader.addHeader((String) entry.getKey(), i.g0((Iterable) entry.getValue(), StringUtils.COMMA, null, null, null, 62));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            addHeader.withMethod(Request.Method.POST);
                            addHeader.withBody(postData);
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
                    NetworkClientBuilder networkClientBuilder = new NetworkClientBuilder();
                    NetworkClientSettings.Builder builder = new NetworkClientSettings.Builder();
                    int i4 = b.f13285a;
                    Response execute = networkClientBuilder.withSettings(builder.withConnectTimeout(i4).withReadTimeout(i4).withSslSocketFactory(networkTask.getSslSocketFactory()).build()).build().newCall(addHeader.build()).execute();
                    int code = execute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(execute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(execute.getResponseData());
                    }
                    if (execute.isCompleted()) {
                        z = networkTask.onRequestComplete();
                        bool = Boolean.valueOf(z);
                        if (!z && this.f13289a.shouldTryNextHost()) {
                            z4 = true;
                        }
                        exponentialBackoffPolicy.onHostAttemptFinished(z);
                        onCreateNetworkTask = z4;
                    } else {
                        networkTask.onRequestError(execute.getException());
                    }
                }
            } else {
                networkTask.onRequestError(null);
            }
            z = false;
            bool = Boolean.valueOf(z);
            if (!z) {
                z4 = true;
            }
            exponentialBackoffPolicy.onHostAttemptFinished(z);
            onCreateNetworkTask = z4;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(kotlin.jvm.internal.i.a(bool, Boolean.TRUE));
    }
}
