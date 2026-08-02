package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ResultReceiverC0985yg extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0623kg f8643a;

    public ResultReceiverC0985yg(Handler handler, InterfaceC0623kg interfaceC0623kg) {
        super(handler);
        this.f8643a = interfaceC0623kg;
    }

    public static void a(ResultReceiver resultReceiver, C0830sg c0830sg) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c0830sg == null ? null : c0830sg.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i3, Bundle bundle) {
        if (i3 == 1) {
            C0830sg c0830sg = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c0830sg = new C0830sg(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f8643a.a(c0830sg);
        }
    }
}
