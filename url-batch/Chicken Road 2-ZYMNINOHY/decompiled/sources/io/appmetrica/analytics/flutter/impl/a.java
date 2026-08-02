package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f9825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9826c;

    public /* synthetic */ a(Pigeon.Result result, Object obj, int i4) {
        this.f9824a = i4;
        this.f9825b = result;
        this.f9826c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9824a) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onDeeplinkLoaded$0(this.f9825b, (String) this.f9826c);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onParametersLoaded$0(this.f9825b, (Map) this.f9826c);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onReceive$0(this.f9825b, (StartupParamsCallback.Result) this.f9826c);
                break;
        }
    }
}
