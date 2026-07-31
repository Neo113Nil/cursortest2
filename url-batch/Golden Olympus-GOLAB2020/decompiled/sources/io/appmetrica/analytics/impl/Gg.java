package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public final class Gg extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2964sg f37577a;

    public Gg(Handler handler, InterfaceC2964sg interfaceC2964sg) {
        super(handler);
        this.f37577a = interfaceC2964sg;
    }

    public static void a(ResultReceiver resultReceiver, Ag ag) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", ag == null ? null : ag.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, Bundle bundle) {
        if (i4 == 1) {
            Ag ag = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    ag = new Ag(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f37577a.a(ag);
        }
    }
}
