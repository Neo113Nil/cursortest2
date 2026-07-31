package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import r3.c;

/* loaded from: classes.dex */
public final class gi0 extends y2.c<ni0> {
    public gi0(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(kj0.a(context), looper, 8, aVar, bVar, null);
    }

    @Override // r3.c
    protected final String D() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // r3.c
    protected final String E() {
        return "com.google.android.gms.ads.service.START";
    }

    public final ni0 i0() {
        return (ni0) super.C();
    }

    @Override // r3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof ni0 ? (ni0) queryLocalInterface : new li0(iBinder);
    }
}
