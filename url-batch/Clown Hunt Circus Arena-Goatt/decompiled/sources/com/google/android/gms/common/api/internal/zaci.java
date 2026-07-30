package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
final class zaci implements Runnable {
    final /* synthetic */ zacl zaa;

    zaci(zacl zaclVar) {
        Objects.requireNonNull(zaclVar);
        this.zaa = zaclVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zaf().zaa(new ConnectionResult(4));
    }
}
