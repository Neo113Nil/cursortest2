package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f9828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9829c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9830d;

    public /* synthetic */ b(Pigeon.Result result, Object obj, Object obj2, int i4) {
        this.f9827a = i4;
        this.f9828b = result;
        this.f9830d = obj;
        this.f9829c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9827a) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onError$1(this.f9828b, (DeferredDeeplinkListener.Error) this.f9830d, (String) this.f9829c);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onError$1(this.f9828b, (DeferredDeeplinkParametersListener.Error) this.f9830d, (String) this.f9829c);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onRequestError$1(this.f9828b, (StartupParamsCallback.Result) this.f9830d, (StartupParamsCallback.Reason) this.f9829c);
                break;
        }
    }
}
