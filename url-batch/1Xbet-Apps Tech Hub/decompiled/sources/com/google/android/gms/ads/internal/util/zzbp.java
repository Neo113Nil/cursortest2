package com.google.android.gms.ads.internal.util;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.internal.ads.zzamw;
import com.google.android.gms.internal.ads.zzana;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzanx;
import com.google.android.gms.internal.ads.zzcbm;
import com.google.android.gms.internal.ads.zzccf;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbp extends zzana {
    private final zzccf zza;
    private final zzcbm zzb;

    public zzbp(String str, Map map, zzccf zzccfVar) {
        super(0, str, new zzbo(zzccfVar));
        this.zza = zzccfVar;
        zzcbm zzcbmVar = new zzcbm(null);
        this.zzb = zzcbmVar;
        zzcbmVar.zzd(str, ShareTarget.METHOD_GET, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    protected final zzang zzh(zzamw zzamwVar) {
        return zzang.zzb(zzamwVar, zzanx.zzb(zzamwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzana
    protected final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzamw zzamwVar = (zzamw) obj;
        this.zzb.zzf(zzamwVar.zzc, zzamwVar.zza);
        byte[] bArr = zzamwVar.zzb;
        if (zzcbm.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.zzc(zzamwVar);
    }
}
