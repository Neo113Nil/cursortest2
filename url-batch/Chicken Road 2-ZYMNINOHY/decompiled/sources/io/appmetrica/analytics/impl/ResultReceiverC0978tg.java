package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ResultReceiverC0978tg extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0616fg f12783a;

    public ResultReceiverC0978tg(Handler handler, InterfaceC0616fg interfaceC0616fg) {
        super(handler);
        this.f12783a = interfaceC0616fg;
    }

    public static void a(ResultReceiver resultReceiver, C0823ng c0823ng) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c0823ng == null ? null : c0823ng.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, Bundle bundle) {
        if (i4 == 1) {
            C0823ng c0823ng = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c0823ng = new C0823ng(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f12783a.a(c0823ng);
        }
    }
}
