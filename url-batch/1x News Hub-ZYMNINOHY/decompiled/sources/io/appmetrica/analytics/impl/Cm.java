package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class Cm implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final Em f5861a;

    /* renamed from: b, reason: collision with root package name */
    public C0552hm f5862b;

    /* renamed from: c, reason: collision with root package name */
    public Nl f5863c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f5864d;

    /* renamed from: e, reason: collision with root package name */
    public final ConfigProvider f5865e;
    public final ResponseDataHolder f;

    /* renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f5866g;

    /* renamed from: h, reason: collision with root package name */
    public final Vl f5867h;

    public Cm(Em em, FullUrlFormer<C0500fm> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C0500fm> configProvider) {
        this(em, new Vl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "Startup task for component: " + this.f5861a.f5968a.f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f5866g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f5864d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0500fm) this.f5865e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((El) C0876ua.f8420H.A()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f5864d.setHeader("Accept-Encoding", "encrypted");
        return this.f5861a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        if (z) {
            return;
        }
        this.f5863c = Nl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C0552hm handle = this.f5867h.handle(this.f);
        this.f5862b = handle;
        return handle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
        this.f5863c = Nl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f5863c = Nl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f5862b == null || this.f.getResponseHeaders() == null) {
            return;
        }
        this.f5861a.a(this.f5862b, (C0500fm) this.f5865e.getConfig(), this.f.getResponseHeaders());
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
        if (this.f5863c == null) {
            this.f5863c = Nl.UNKNOWN;
        }
        this.f5861a.a(this.f5863c);
    }

    public Cm(Em em, Vl vl, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f5861a = em;
        this.f5867h = vl;
        this.f5864d = requestDataHolder;
        this.f = responseDataHolder;
        this.f5865e = configProvider;
        this.f5866g = fullUrlFormer;
        fullUrlFormer.setHosts(((C0500fm) configProvider.getConfig()).k());
    }
}
