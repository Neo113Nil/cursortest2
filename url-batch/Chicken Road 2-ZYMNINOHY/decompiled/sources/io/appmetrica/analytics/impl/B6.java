package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class B6 extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final A6 f10090a;

    public B6(Handler handler, A6 a6) {
        super(handler);
        this.f10090a = a6;
    }

    public static void a(ResultReceiver resultReceiver, S3 s32) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            s32.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f10090a.a(i4, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Jl jl, S3 s32) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", jl.f10503a);
            s32.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
