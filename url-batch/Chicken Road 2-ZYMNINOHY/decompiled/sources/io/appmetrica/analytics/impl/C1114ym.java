package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114ym implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final Am f13078a;

    /* renamed from: b, reason: collision with root package name */
    public C0571dm f13079b;

    /* renamed from: c, reason: collision with root package name */
    public Jl f13080c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f13081d;

    /* renamed from: e, reason: collision with root package name */
    public final ConfigProvider f13082e;

    /* renamed from: f, reason: collision with root package name */
    public final ResponseDataHolder f13083f;

    /* renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f13084g;

    /* renamed from: h, reason: collision with root package name */
    public final Rl f13085h;

    public C1114ym(Am am, FullUrlFormer<C0519bm> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C0519bm> configProvider) {
        this(am, new Rl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "Startup task for component: " + this.f13078a.f10061a.f10128f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f13084g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f13081d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f13083f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0519bm) this.f13082e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Al) C0817na.f12417I.z()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f13081d.setHeader("Accept-Encoding", "encrypted");
        return this.f13078a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        if (z) {
            return;
        }
        this.f13080c = Jl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C0571dm handle = this.f13085h.handle(this.f13083f);
        this.f13079b = handle;
        return handle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
        this.f13080c = Jl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f13080c = Jl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f13079b == null || this.f13083f.getResponseHeaders() == null) {
            return;
        }
        this.f13078a.a(this.f13079b, (C0519bm) this.f13082e.getConfig(), this.f13083f.getResponseHeaders());
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
        if (this.f13080c == null) {
            this.f13080c = Jl.UNKNOWN;
        }
        this.f13078a.a(this.f13080c);
    }

    public C1114ym(Am am, Rl rl, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f13078a = am;
        this.f13085h = rl;
        this.f13081d = requestDataHolder;
        this.f13083f = responseDataHolder;
        this.f13082e = configProvider;
        this.f13084g = fullUrlFormer;
        fullUrlFormer.setHosts(((C0519bm) configProvider.getConfig()).k());
    }
}
