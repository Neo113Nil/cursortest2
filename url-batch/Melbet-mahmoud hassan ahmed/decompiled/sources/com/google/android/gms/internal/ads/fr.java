package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class fr {

    /* renamed from: a, reason: collision with root package name */
    ee f5179a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5180b;

    public fr() {
    }

    public fr(Context context) {
        m10.c(context);
        if (((Boolean) sw.c().b(m10.f8322v3)).booleanValue()) {
            try {
                this.f5179a = (ee) no0.b(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new lo0() { // from class: com.google.android.gms.internal.ads.br
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.lo0
                    public final Object c(Object obj) {
                        return de.s6(obj);
                    }
                });
                x3.b.B3(context);
                this.f5179a.S0(x3.b.B3(context), "GMA_SDK");
                this.f5180b = true;
            } catch (RemoteException | mo0 | NullPointerException unused) {
                io0.b("Cannot dynamite load clearcut");
            }
        }
    }
}
