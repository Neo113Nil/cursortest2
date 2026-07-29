package com.google.android.gms.internal.measurement;

import java.io.PrintStream;
import java.util.List;

/* loaded from: classes2.dex */
final class zzwm extends zzwj {
    private final zzwk zzbnf = new zzwk();

    zzwm() {
    }

    @Override // com.google.android.gms.internal.measurement.zzwj
    public final void zza(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> zza = this.zzbnf.zza(th, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (Throwable th2 : zza) {
                printStream.print("Suppressed: ");
                th2.printStackTrace(printStream);
            }
        }
    }
}
