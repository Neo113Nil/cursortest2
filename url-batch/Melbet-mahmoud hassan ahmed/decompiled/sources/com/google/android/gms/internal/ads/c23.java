package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import r3.c;

/* loaded from: classes.dex */
public final class c23 extends y2.c<h23> {
    private final int F;

    public c23(Context context, Looper looper, c.a aVar, c.b bVar, int i7) {
        super(context, looper, 116, aVar, bVar, null);
        this.F = i7;
    }

    @Override // r3.c
    protected final String D() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // r3.c
    protected final String E() {
        return "com.google.android.gms.gass.START";
    }

    public final h23 i0() {
        return (h23) super.C();
    }

    @Override // r3.c
    public final int j() {
        return this.F;
    }

    @Override // r3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof h23 ? (h23) queryLocalInterface : new h23(iBinder);
    }
}
