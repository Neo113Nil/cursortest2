package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class zaal extends zabe {
    final /* synthetic */ ConnectionResult zaa;
    final /* synthetic */ zaan zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaal(zaan zaanVar, zabd zabdVar, ConnectionResult connectionResult) {
        super(zabdVar);
        this.zaa = connectionResult;
        this.zab = zaanVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabe
    public final void zaa() {
        this.zab.zaa.zaD(this.zaa);
    }
}
