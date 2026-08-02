package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f5573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5574c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5575d;

    public /* synthetic */ b(Pigeon.Result result, Object obj, Object obj2, int i3) {
        this.f5572a = i3;
        this.f5573b = result;
        this.f5575d = obj;
        this.f5574c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5572a) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onError$1(this.f5573b, (DeferredDeeplinkListener.Error) this.f5575d, (String) this.f5574c);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onError$1(this.f5573b, (DeferredDeeplinkParametersListener.Error) this.f5575d, (String) this.f5574c);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onRequestError$1(this.f5573b, (StartupParamsCallback.Result) this.f5575d, (StartupParamsCallback.Reason) this.f5574c);
                break;
        }
    }
}
