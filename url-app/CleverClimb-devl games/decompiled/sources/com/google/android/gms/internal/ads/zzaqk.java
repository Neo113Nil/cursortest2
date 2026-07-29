package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzaqk implements Runnable {
    private final /* synthetic */ String val$message;
    private final /* synthetic */ String zzcce;
    private final /* synthetic */ String zzdba;
    private final /* synthetic */ zzaqh zzdbe;
    private final /* synthetic */ String zzdbf;

    zzaqk(zzaqh zzaqhVar, String str, String str2, String str3, String str4) {
        this.zzdbe = zzaqhVar;
        this.zzcce = str;
        this.zzdba = str2;
        this.zzdbf = str3;
        this.val$message = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String zzdq;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.zzcce);
        if (!TextUtils.isEmpty(this.zzdba)) {
            hashMap.put("cachedSrc", this.zzdba);
        }
        zzaqh zzaqhVar = this.zzdbe;
        zzdq = zzaqh.zzdq(this.zzdbf);
        hashMap.put("type", zzdq);
        hashMap.put("reason", this.zzdbf);
        if (!TextUtils.isEmpty(this.val$message)) {
            hashMap.put(TJAdUnitConstants.String.MESSAGE, this.val$message);
        }
        this.zzdbe.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
