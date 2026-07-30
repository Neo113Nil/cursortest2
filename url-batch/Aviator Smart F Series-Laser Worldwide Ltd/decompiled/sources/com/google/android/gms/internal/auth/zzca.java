package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class zzca extends ContentObserver {
    zzca(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzcb.zzk;
        atomicBoolean.set(true);
    }
}
