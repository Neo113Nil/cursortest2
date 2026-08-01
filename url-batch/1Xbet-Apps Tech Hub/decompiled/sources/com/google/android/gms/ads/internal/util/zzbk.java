package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzami;
import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzanf;
import com.google.android.gms.internal.ads.zzaoe;
import com.google.android.gms.internal.ads.zzcbm;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbk extends zzaoe {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzcbm zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbk(zzbq zzbqVar, int i, String str, zzanf zzanfVar, zzane zzaneVar, byte[] bArr, Map map, zzcbm zzcbmVar) {
        super(i, str, zzanfVar, zzaneVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final Map zzl() throws zzami {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzaoe, com.google.android.gms.internal.ads.zzana
    protected final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final byte[] zzx() throws zzami {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaoe
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
