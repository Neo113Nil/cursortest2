package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzflw extends zzflz {
    private static final zzflw zzb = new zzflw();

    private zzflw() {
    }

    public static zzflw zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzflz
    public final void zzb(boolean z) {
        Iterator it = zzflx.zza().zzc().iterator();
        while (it.hasNext()) {
            zzfmk zzg = ((zzflj) it.next()).zzg();
            if (zzg.zzl()) {
                zzfmd.zza().zzb(zzg.zza(), "setState", true != z ? "backgrounded" : "foregrounded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflz
    public final boolean zzc() {
        Iterator it = zzflx.zza().zzb().iterator();
        while (it.hasNext()) {
            View zzf = ((zzflj) it.next()).zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
