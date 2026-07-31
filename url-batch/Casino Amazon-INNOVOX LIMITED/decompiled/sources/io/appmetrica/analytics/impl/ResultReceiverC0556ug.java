package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ResultReceiverC0556ug extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0203gg f1517a;

    public ResultReceiverC0556ug(Handler handler, InterfaceC0203gg interfaceC0203gg) {
        super(handler);
        this.f1517a = interfaceC0203gg;
    }

    public static void a(ResultReceiver resultReceiver, C0407og c0407og) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c0407og == null ? null : c0407og.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C0407og c0407og = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c0407og = new C0407og(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f1517a.a(c0407og);
        }
    }
}
