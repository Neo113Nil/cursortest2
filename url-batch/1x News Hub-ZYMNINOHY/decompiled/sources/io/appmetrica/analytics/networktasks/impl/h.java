package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
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
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f8873a;

    /* renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f8874b;

    /* renamed from: c, reason: collision with root package name */
    public final f f8875c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f8873a = networkTask;
        this.f8874b = interruptionSafeThread;
        this.f8875c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f8873a.getExponentialBackoffPolicy();
        boolean canBeExecuted = this.f8873a.getConnectionExecutionPolicy().canBeExecuted();
        boolean canBeExecuted2 = this.f8873a.getExponentialBackoffPolicy().canBeExecuted(this.f8873a.getRetryPolicyConfig());
        if (!this.f8874b.isRunning() || !canBeExecuted || !canBeExecuted2) {
            this.f8873a.onShouldNotExecute();
            return;
        }
        boolean onCreateNetworkTask = this.f8873a.onCreateNetworkTask();
        Boolean bool = null;
        while (this.f8874b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f8873a.getRetryPolicyConfig())) {
            f fVar = this.f8875c;
            NetworkTask networkTask = this.f8873a;
            fVar.getClass();
            boolean z2 = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url != null) {
                    int length = url.length() - 1;
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 <= length) {
                        char charAt = url.charAt(!z3 ? i3 : length);
                        boolean z4 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
                        if (z3) {
                            if (!z4) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z4) {
                            i3++;
                        } else {
                            z3 = true;
                        }
                    }
                    if (!TextUtils.isEmpty(url.subSequence(i3, length + 1).toString())) {
                        Request.Builder addHeader = new Request.Builder(url).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
                        RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                        Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            addHeader.addHeader((String) entry.getKey(), c2.e.S((Iterable) entry.getValue(), StringUtils.COMMA, null, null, null, 62));
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
                        int i4 = b.f8869a;
                        Response execute = builder.withConnectTimeout(i4).withReadTimeout(i4).withSslSocketFactory(networkTask.getSslSocketFactory()).build().newCall(addHeader.build()).execute();
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
                            if (!z && this.f8873a.shouldTryNextHost()) {
                                z2 = true;
                            }
                            exponentialBackoffPolicy.onHostAttemptFinished(z);
                            onCreateNetworkTask = z2;
                        } else {
                            networkTask.onRequestError(execute.getException());
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("Task ");
                sb.append(networkTask.description());
                sb.append(" url is `");
                sb.append(url);
                sb.append("`. All hosts = ");
                List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                sb.append(allHosts != null ? allHosts.toString() : null);
                networkTask.onRequestError(new IllegalArgumentException(sb.toString()));
            } else {
                networkTask.onRequestError(null);
            }
            z = false;
            bool = Boolean.valueOf(z);
            if (!z) {
                z2 = true;
            }
            exponentialBackoffPolicy.onHostAttemptFinished(z);
            onCreateNetworkTask = z2;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(j.a(bool, Boolean.TRUE));
    }
}
