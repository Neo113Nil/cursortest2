package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzu extends zzi<zzu> {
    private String zztb;
    private String zztc;
    private String zztd;
    private String zzte;

    public final void setAppId(String str) {
        this.zztd = str;
    }

    public final void setAppInstallerId(String str) {
        this.zzte = str;
    }

    public final void setAppName(String str) {
        this.zztb = str;
    }

    public final void setAppVersion(String str) {
        this.zztc = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.zztb);
        hashMap.put("appVersion", this.zztc);
        hashMap.put("appId", this.zztd);
        hashMap.put("appInstallerId", this.zzte);
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzu zzuVar) {
        if (!TextUtils.isEmpty(this.zztb)) {
            zzuVar.zztb = this.zztb;
        }
        if (!TextUtils.isEmpty(this.zztc)) {
            zzuVar.zztc = this.zztc;
        }
        if (!TextUtils.isEmpty(this.zztd)) {
            zzuVar.zztd = this.zztd;
        }
        if (TextUtils.isEmpty(this.zzte)) {
            return;
        }
        zzuVar.zzte = this.zzte;
    }

    public final String zzaf() {
        return this.zztb;
    }

    public final String zzag() {
        return this.zztc;
    }

    public final String zzah() {
        return this.zztd;
    }

    public final String zzai() {
        return this.zzte;
    }
}
