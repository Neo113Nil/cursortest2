package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class m50 extends zd implements o50 {
    m50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final void e3(e50 e50Var, String str) {
        Parcel E = E();
        be.f(E, e50Var);
        E.writeString(str);
        O0(1, E);
    }
}
