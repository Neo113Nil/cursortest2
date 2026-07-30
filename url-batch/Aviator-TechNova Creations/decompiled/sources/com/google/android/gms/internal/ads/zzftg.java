package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzftg extends zzftj {
    private static final zzftg zzb = new zzftg();

    private zzftg() {
    }

    public static zzftg zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final boolean zzb() {
        Iterator it = zzfth.zza().zzf().iterator();
        while (it.hasNext()) {
            View zzi = ((zzfsn) it.next()).zzi();
            if (zzi != null && zzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final void zzc(boolean z) {
        Iterator it = zzfth.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfsn) it.next()).zzg().zzf(z);
        }
    }
}
