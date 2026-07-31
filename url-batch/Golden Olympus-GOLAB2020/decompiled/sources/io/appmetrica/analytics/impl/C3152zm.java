package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.zm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3152zm implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final Bm f40402a;

    /* renamed from: b, reason: collision with root package name */
    public C2580dm f40403b;

    /* renamed from: c, reason: collision with root package name */
    public Jl f40404c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f40405d;

    /* renamed from: e, reason: collision with root package name */
    public final ConfigProvider f40406e;

    /* renamed from: f, reason: collision with root package name */
    public final ResponseDataHolder f40407f;

    /* renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f40408g;

    /* renamed from: h, reason: collision with root package name */
    public final Rl f40409h;

    public C3152zm(@NonNull Bm bm, @NonNull FullUrlFormer<C2526bm> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider<C2526bm> configProvider) {
        this(bm, new Rl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "Startup task for component: " + this.f40402a.f37259a.f37316f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f40408g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f40405d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f40407f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C2526bm) this.f40406e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Al) Ia.f37730F.y()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f40405d.setHeader("Accept-Encoding", "encrypted");
        return this.f40402a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z4) {
        if (z4) {
            return;
        }
        this.f40404c = Jl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C2580dm handle = this.f40409h.handle(this.f40407f);
        this.f40403b = handle;
        return handle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
        this.f40404c = Jl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f40404c = Jl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f40403b == null || this.f40407f.getResponseHeaders() == null) {
            return;
        }
        this.f40402a.a(this.f40403b, (C2526bm) this.f40406e.getConfig(), this.f40407f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f40404c == null) {
            this.f40404c = Jl.UNKNOWN;
        }
        this.f40402a.a(this.f40404c);
    }

    public C3152zm(Bm bm, Rl rl, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f40402a = bm;
        this.f40409h = rl;
        this.f40405d = requestDataHolder;
        this.f40407f = responseDataHolder;
        this.f40406e = configProvider;
        this.f40408g = fullUrlFormer;
        fullUrlFormer.setHosts(((C2526bm) configProvider.getConfig()).k());
    }
}
