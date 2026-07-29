package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzab extends zzi<zzab> {
    private String category;
    private String label;
    private long value;
    private String zztv;

    public final String getAction() {
        return this.zztv;
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getValue() {
        return this.value;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("category", this.category);
        hashMap.put("action", this.zztv);
        hashMap.put("label", this.label);
        hashMap.put("value", Long.valueOf(this.value));
        return zza((Object) hashMap);
    }

    public final String zzax() {
        return this.category;
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzab zzabVar) {
        zzab zzabVar2 = zzabVar;
        if (!TextUtils.isEmpty(this.category)) {
            zzabVar2.category = this.category;
        }
        if (!TextUtils.isEmpty(this.zztv)) {
            zzabVar2.zztv = this.zztv;
        }
        if (!TextUtils.isEmpty(this.label)) {
            zzabVar2.label = this.label;
        }
        if (this.value != 0) {
            zzabVar2.value = this.value;
        }
    }
}
