package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import r3.c;

/* loaded from: classes.dex */
public final class q80 extends y2.c<y80> {
    q80(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(kj0.a(context), looper, 166, aVar, bVar, null);
    }

    @Override // r3.c
    protected final String D() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // r3.c
    protected final String E() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final y80 i0() {
        return (y80) super.C();
    }

    @Override // r3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof y80 ? (y80) queryLocalInterface : new y80(iBinder);
    }
}
