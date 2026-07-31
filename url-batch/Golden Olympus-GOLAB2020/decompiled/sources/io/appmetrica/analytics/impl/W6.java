package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public final class W6 extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final V6 f38457a;

    public W6(Handler handler, V6 v6) {
        super(handler);
        this.f38457a = v6;
    }

    public static void a(ResultReceiver resultReceiver, C2849o4 c2849o4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c2849o4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f38457a.a(i4, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Jl jl, C2849o4 c2849o4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", jl.f37850a);
            c2849o4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
