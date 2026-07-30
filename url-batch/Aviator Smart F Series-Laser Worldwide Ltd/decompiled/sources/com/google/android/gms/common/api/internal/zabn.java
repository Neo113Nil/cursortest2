package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zabn implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ zabq zab;

    zabn(zabq zabqVar, int i8) {
        this.zab = zabqVar;
        this.zaa = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }
}
