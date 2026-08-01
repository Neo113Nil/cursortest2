package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzddb extends zzddv implements zzbiv {
    public zzddb(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final synchronized void zzb(final String str, final String str2) {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdda
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
