package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;

/* renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ServiceConnectionC0633Nj implements ServiceConnection {
    public final /* synthetic */ HandlerC0634Nk A00;

    public ServiceConnectionC0633Nj(HandlerC0634Nk handlerC0634Nk) {
        this.A00 = handlerC0634Nk;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        AbstractRunnableC0846Vt abstractRunnableC0846Vt;
        C1133cu c1133cu;
        Messenger messenger;
        handler = this.A00.A04;
        abstractRunnableC0846Vt = this.A00.A08;
        handler.removeCallbacks(abstractRunnableC0846Vt);
        this.A00.A00 = new Messenger(iBinder);
        c1133cu = this.A00.A07;
        if (UA.A09(c1133cu)) {
            HandlerC0634Nk handlerC0634Nk = this.A00;
            messenger = this.A00.A00;
            handlerC0634Nk.A07(messenger);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.A09();
    }
}
