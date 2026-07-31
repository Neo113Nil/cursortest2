package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
final class zzgb extends ContentObserver {
    private final /* synthetic */ zzfz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgb(zzfz zzfzVar, Handler handler) {
        super(null);
        this.zza = zzfzVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zza;
        atomicBoolean.set(true);
    }
}
