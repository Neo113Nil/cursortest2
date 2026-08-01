package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzelh implements zzefv {
    private final zzefx zza;
    private final zzegb zzb;
    private final zzfiu zzc;
    private final zzgbl zzd;

    public zzelh(zzfiu zzfiuVar, zzgbl zzgblVar, zzefx zzefxVar, zzegb zzegbVar) {
        this.zzc = zzfiuVar;
        this.zzd = zzgblVar;
        this.zzb = zzegbVar;
        this.zza = zzefxVar;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(final zzfeh zzfehVar, final zzfdu zzfduVar) {
        final zzefy zzefyVar;
        Iterator it = zzfduVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzefyVar = null;
                break;
            }
            try {
                zzefyVar = this.zza.zza((String) it.next(), zzfduVar.zzw);
                break;
            } catch (zzfev unused) {
            }
        }
        if (zzefyVar == null) {
            return zzgbb.zzg(new zzeix("Unable to instantiate mediation adapter class."));
        }
        zzccf zzccfVar = new zzccf();
        zzefyVar.zzc.zza(new zzelg(this, zzefyVar, zzccfVar));
        if (zzfduVar.zzN) {
            Bundle bundle = zzfehVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfiu zzfiuVar = this.zzc;
        return zzfie.zzd(new zzfhy() { // from class: com.google.android.gms.internal.ads.zzele
            @Override // com.google.android.gms.internal.ads.zzfhy
            public final void zza() {
                zzelh.this.zzd(zzfehVar, zzfduVar, zzefyVar);
            }
        }, this.zzd, zzfio.ADAPTER_LOAD_AD_SYN, zzfiuVar).zzb(zzfio.ADAPTER_LOAD_AD_ACK).zzd(zzccfVar).zzb(zzfio.ADAPTER_WRAP_ADAPTER).zze(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzelf
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj) {
                return zzelh.this.zzc(zzfehVar, zzfduVar, zzefyVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final boolean zzb(zzfeh zzfehVar, zzfdu zzfduVar) {
        return !zzfduVar.zzu.isEmpty();
    }

    final /* synthetic */ Object zzc(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar, Void r4) throws Exception {
        return this.zzb.zza(zzfehVar, zzfduVar, zzefyVar);
    }

    final /* synthetic */ void zzd(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws Exception {
        this.zzb.zzb(zzfehVar, zzfduVar, zzefyVar);
    }
}
