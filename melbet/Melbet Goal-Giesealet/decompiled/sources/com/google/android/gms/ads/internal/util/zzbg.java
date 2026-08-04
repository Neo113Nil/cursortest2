package com.google.android.gms.ads.internal.util;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbg implements zzapl {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final void zza(zzapq zzapqVar) {
        String str = this.zza;
        String zzapqVar2 = zzapqVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzapqVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb.append(zzapqVar2);
        String sb2 = sb.toString();
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        this.zzb.zza((Object) null);
    }
}
