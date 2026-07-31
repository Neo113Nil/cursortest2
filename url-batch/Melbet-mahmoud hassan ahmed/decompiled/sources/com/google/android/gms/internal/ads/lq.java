package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import r3.c;

/* loaded from: classes.dex */
public final class lq extends y2.c<oq> {
    lq(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(kj0.a(context), looper, 123, aVar, bVar, null);
    }

    @Override // r3.c
    protected final String D() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // r3.c
    protected final String E() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean i0() {
        return ((Boolean) sw.c().b(m10.f8290r1)).booleanValue() && v3.a.b(l(), r2.z.f21192a);
    }

    public final oq j0() {
        return (oq) super.C();
    }

    @Override // r3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof oq ? (oq) queryLocalInterface : new oq(iBinder);
    }

    @Override // r3.c
    public final o3.d[] v() {
        return r2.z.f21193b;
    }
}
