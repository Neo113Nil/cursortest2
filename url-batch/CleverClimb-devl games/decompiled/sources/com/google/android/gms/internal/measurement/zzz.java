package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.umeng.commonsdk.proguard.d;
import java.util.HashMap;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzz extends zzi<zzz> {
    private String zztp;
    public int zztq;
    public int zztr;
    public int zzts;
    public int zztt;
    public int zztu;

    public final String getLanguage() {
        return this.zztp;
    }

    public final void setLanguage(String str) {
        this.zztp = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put(d.M, this.zztp);
        hashMap.put("screenColors", Integer.valueOf(this.zztq));
        hashMap.put("screenWidth", Integer.valueOf(this.zztr));
        hashMap.put("screenHeight", Integer.valueOf(this.zzts));
        hashMap.put("viewportWidth", Integer.valueOf(this.zztt));
        hashMap.put("viewportHeight", Integer.valueOf(this.zztu));
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzz zzzVar) {
        zzz zzzVar2 = zzzVar;
        if (this.zztq != 0) {
            zzzVar2.zztq = this.zztq;
        }
        if (this.zztr != 0) {
            zzzVar2.zztr = this.zztr;
        }
        if (this.zzts != 0) {
            zzzVar2.zzts = this.zzts;
        }
        if (this.zztt != 0) {
            zzzVar2.zztt = this.zztt;
        }
        if (this.zztu != 0) {
            zzzVar2.zztu = this.zztu;
        }
        if (TextUtils.isEmpty(this.zztp)) {
            return;
        }
        zzzVar2.zztp = this.zztp;
    }
}
