package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class zabb extends zabu {
    private final WeakReference zaa;

    zabb(zabc zabcVar) {
        this.zaa = new WeakReference(zabcVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zaa() {
        zabc zabcVar = (zabc) this.zaa.get();
        if (zabcVar == null) {
            return;
        }
        zabc.zai(zabcVar);
    }
}
