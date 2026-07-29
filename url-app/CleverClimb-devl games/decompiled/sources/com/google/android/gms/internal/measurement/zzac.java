package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzac extends zzi<zzac> {
    public String zztw;
    public boolean zztx;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("description", this.zztw);
        hashMap.put("fatal", Boolean.valueOf(this.zztx));
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzac zzacVar) {
        zzac zzacVar2 = zzacVar;
        if (!TextUtils.isEmpty(this.zztw)) {
            zzacVar2.zztw = this.zztw;
        }
        if (this.zztx) {
            zzacVar2.zztx = this.zztx;
        }
    }
}
