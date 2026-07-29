package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzol implements com.google.android.gms.ads.internal.gmsg.zzv<Object> {
    private final /* synthetic */ zzok zzbhr;

    zzol(zzok zzokVar) {
        this.zzbhr = zzokVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        zzro zzroVar;
        zzro zzroVar2;
        try {
            this.zzbhr.zzbhp = Long.valueOf(Long.parseLong(map.get(TapjoyConstants.TJC_TIMESTAMP)));
        } catch (NumberFormatException unused) {
            zzakb.e("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.zzbhr.zzbho = map.get("id");
        String str = map.get("asset_id");
        zzroVar = this.zzbhr.zzbhm;
        if (zzroVar == null) {
            zzakb.zzck("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzroVar2 = this.zzbhr.zzbhm;
            zzroVar2.onUnconfirmedClickReceived(str);
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }
}
