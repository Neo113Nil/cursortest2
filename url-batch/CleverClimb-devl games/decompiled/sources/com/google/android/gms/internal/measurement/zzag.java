package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzag extends zzi<zzag> {
    public String mCategory;
    public String zzuq;
    public long zzur;
    public String zzus;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("variableName", this.zzuq);
        hashMap.put("timeInMillis", Long.valueOf(this.zzur));
        hashMap.put("category", this.mCategory);
        hashMap.put("label", this.zzus);
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzag zzagVar) {
        zzag zzagVar2 = zzagVar;
        if (!TextUtils.isEmpty(this.zzuq)) {
            zzagVar2.zzuq = this.zzuq;
        }
        if (this.zzur != 0) {
            zzagVar2.zzur = this.zzur;
        }
        if (!TextUtils.isEmpty(this.mCategory)) {
            zzagVar2.mCategory = this.mCategory;
        }
        if (TextUtils.isEmpty(this.zzus)) {
            return;
        }
        zzagVar2.zzus = this.zzus;
    }
}
