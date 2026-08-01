package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfxs extends zzfxw {
    final /* synthetic */ Comparator zza;

    zzfxs(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfxw
    final Map zza() {
        return new TreeMap(this.zza);
    }
}
