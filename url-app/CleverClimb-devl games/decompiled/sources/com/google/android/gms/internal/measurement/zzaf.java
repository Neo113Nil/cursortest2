package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzaf extends zzi<zzaf> {
    public String zzun;
    public String zzuo;
    public String zzup;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("network", this.zzun);
        hashMap.put("action", this.zzuo);
        hashMap.put("target", this.zzup);
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzaf zzafVar) {
        zzaf zzafVar2 = zzafVar;
        if (!TextUtils.isEmpty(this.zzun)) {
            zzafVar2.zzun = this.zzun;
        }
        if (!TextUtils.isEmpty(this.zzuo)) {
            zzafVar2.zzuo = this.zzuo;
        }
        if (TextUtils.isEmpty(this.zzup)) {
            return;
        }
        zzafVar2.zzup = this.zzup;
    }
}
