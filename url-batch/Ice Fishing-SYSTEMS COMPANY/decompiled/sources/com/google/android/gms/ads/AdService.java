package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.InterfaceC3101de;
import q2.C4887f;
import q2.C4903n;
import q2.C4907p;
import u2.i;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            C4903n c4903n = C4907p.f40108g.f40110b;
            BinderC3317hd binderC3317hd = new BinderC3317hd();
            c4903n.getClass();
            ((InterfaceC3101de) new C4887f(c4903n, this, binderC3317hd).d(this, false)).q0(intent);
        } catch (RemoteException e6) {
            i.c("RemoteException calling handleNotificationIntent: ".concat(e6.toString()));
        }
    }
}
