package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzadh
/* loaded from: classes2.dex */
final class zzst {
    private final List<zzts> zzxo = new ArrayList();

    zzst() {
    }

    final void zza(zztt zzttVar) {
        Handler handler = zzakk.zzcrm;
        Iterator<zzts> it = this.zzxo.iterator();
        while (it.hasNext()) {
            handler.post(new zztr(this, it.next(), zzttVar));
        }
        this.zzxo.clear();
    }
}
