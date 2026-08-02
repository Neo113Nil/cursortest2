package defpackage;

import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class eri implements hsl {
    @Override // defpackage.hsl
    public final Instant a() {
        return Instant.ofEpochMilli(SystemClock.elapsedRealtime());
    }
}
