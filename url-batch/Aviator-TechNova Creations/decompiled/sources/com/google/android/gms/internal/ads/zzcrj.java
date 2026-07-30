package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcrj implements zzcql {
    private final zzebf zza;

    zzcrj(zzebf zzebfVar) {
        this.zza = zzebfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcql
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzc(str.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE));
    }
}
