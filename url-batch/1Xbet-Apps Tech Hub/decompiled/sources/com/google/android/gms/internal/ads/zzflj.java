package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzflj extends zzflf {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzflh zzb;
    private final zzflg zzc;
    private zzfnm zze;
    private zzfmk zzf;
    private final List zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    zzflj(zzflg zzflgVar, zzflh zzflhVar) {
        this.zzc = zzflgVar;
        this.zzb = zzflhVar;
        zzk(null);
        if (zzflhVar.zzd() == zzfli.HTML || zzflhVar.zzd() == zzfli.JAVASCRIPT) {
            this.zzf = new zzfml(zzflhVar.zza());
        } else {
            this.zzf = new zzfmo(zzflhVar.zzi(), null);
        }
        this.zzf.zzk();
        zzflx.zza().zzd(this);
        zzfmd.zza().zzd(this.zzf.zza(), zzflgVar.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfnm(view);
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final void zzb(View view, zzflm zzflmVar, String str) {
        zzfma zzfmaVar;
        if (this.zzh) {
            return;
        }
        if (!zza.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.zzd.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzfmaVar = null;
                break;
            } else {
                zzfmaVar = (zzfma) it.next();
                if (zzfmaVar.zzb().get() == view) {
                    break;
                }
            }
        }
        if (zzfmaVar == null) {
            this.zzd.add(new zzfma(view, zzflmVar, "Ad overlay"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        if (!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzfmd.zza().zzc(this.zzf.zza());
        zzflx.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final void zzd(View view) {
        if (this.zzh || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzf.zzb();
        Collection<zzflj> zzc = zzflx.zza().zzc();
        if (zzc == null || zzc.isEmpty()) {
            return;
        }
        for (zzflj zzfljVar : zzc) {
            if (zzfljVar != this && zzfljVar.zzf() == view) {
                zzfljVar.zze.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflf
    public final void zze() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzflx.zza().zzf(this);
        this.zzf.zzi(zzfme.zzb().zza());
        this.zzf.zze(zzflv.zza().zzb());
        this.zzf.zzg(this, this.zzb);
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfmk zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
