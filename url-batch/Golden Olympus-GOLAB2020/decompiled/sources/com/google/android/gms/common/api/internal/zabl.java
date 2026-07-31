package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class zabl implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ zabo zab;

    zabl(zabo zaboVar, int i4) {
        this.zaa = i4;
        this.zab = zaboVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }
}
