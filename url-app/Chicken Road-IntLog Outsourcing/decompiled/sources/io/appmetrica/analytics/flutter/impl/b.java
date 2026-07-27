package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f6339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6340c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6341d;

    public /* synthetic */ b(Pigeon.Result result, Object obj, Object obj2, int i2) {
        this.f6338a = i2;
        this.f6339b = result;
        this.f6341d = obj;
        this.f6340c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6338a) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onError$1(this.f6339b, (DeferredDeeplinkListener.Error) this.f6341d, (String) this.f6340c);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onError$1(this.f6339b, (DeferredDeeplinkParametersListener.Error) this.f6341d, (String) this.f6340c);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onRequestError$1(this.f6339b, (StartupParamsCallback.Result) this.f6341d, (StartupParamsCallback.Reason) this.f6340c);
                break;
        }
    }
}
