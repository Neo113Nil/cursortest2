package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzfa extends IOException {
    zzfa() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzfa(long j4, long j5, int i4, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i4))), th);
    }

    zzfa(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
