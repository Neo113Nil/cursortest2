package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzat;
import java.util.ListIterator;

@VisibleForTesting
/* loaded from: classes.dex */
public class zza extends zzj<zza> {
    private final zzat zzqh;
    private boolean zzqi;

    @VisibleForTesting
    public zza(zzat zzatVar) {
        super(zzatVar.zzbw(), zzatVar.zzbt());
        this.zzqh = zzatVar;
    }

    public final void enableAdvertisingIdCollection(boolean z) {
        this.zzqi = z;
    }

    @Override // com.google.android.gms.analytics.zzj
    protected final void zza(zzg zzgVar) {
        zzad zzadVar = (zzad) zzgVar.zzb(zzad.class);
        if (TextUtils.isEmpty(zzadVar.zzaz())) {
            zzadVar.setClientId(this.zzqh.zzcn().zzdn());
        }
        if (this.zzqi && TextUtils.isEmpty(zzadVar.zzbb())) {
            zzah zzcm = this.zzqh.zzcm();
            zzadVar.zzm(zzcm.zzbj());
            zzadVar.zza(zzcm.zzbc());
        }
    }

    public final void zza(String str) {
        Preconditions.checkNotEmpty(str);
        Uri zzb = zzb.zzb(str);
        ListIterator<zzo> listIterator = this.zzru.zzq().listIterator();
        while (listIterator.hasNext()) {
            if (zzb.equals(listIterator.next().zzk())) {
                listIterator.remove();
            }
        }
        this.zzru.zzq().add(new zzb(this.zzqh, str));
    }

    @VisibleForTesting
    final zzat zzh() {
        return this.zzqh;
    }

    @Override // com.google.android.gms.analytics.zzj
    public final zzg zzi() {
        zzg zzo = this.zzru.zzo();
        zzo.zza(this.zzqh.zzce().zzdb());
        zzo.zza(this.zzqh.zzcf().zzeg());
        zzd(zzo);
        return zzo;
    }
}
