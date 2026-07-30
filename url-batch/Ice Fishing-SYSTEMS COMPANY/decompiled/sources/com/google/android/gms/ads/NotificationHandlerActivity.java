package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.InterfaceC3101de;
import q2.C4887f;
import q2.C4903n;
import q2.C4907p;
import u2.i;

/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C4903n c4903n = C4907p.f40108g.f40110b;
            BinderC3317hd binderC3317hd = new BinderC3317hd();
            c4903n.getClass();
            InterfaceC3101de interfaceC3101de = (InterfaceC3101de) new C4887f(c4903n, this, binderC3317hd).d(this, false);
            if (interfaceC3101de == null) {
                i.c("OfflineUtils is null");
            } else {
                interfaceC3101de.q0(getIntent());
            }
        } catch (RemoteException e6) {
            i.c("RemoteException calling handleNotificationIntent: ".concat(e6.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
