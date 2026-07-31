package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class p50 extends zd implements r50 {
    p50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void G1(e50 e50Var) {
        Parcel E = E();
        be.f(E, e50Var);
        O0(1, E);
    }
}
