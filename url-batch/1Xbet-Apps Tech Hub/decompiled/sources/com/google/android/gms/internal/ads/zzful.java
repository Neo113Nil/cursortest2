package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzful {
    private final zzftk zza;
    private final zzfuk zzb;

    private zzful(zzfuk zzfukVar) {
        zzftk zzftkVar = zzftj.zza;
        this.zzb = zzfukVar;
        this.zza = zzftkVar;
    }

    public static zzful zzb(int i) {
        return new zzful(new zzfuh(4000));
    }

    public static zzful zzc(zzftk zzftkVar) {
        return new zzful(new zzfuf(zzftkVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfui(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
