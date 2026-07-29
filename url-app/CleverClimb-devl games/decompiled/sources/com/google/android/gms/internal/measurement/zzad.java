package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzad extends zzi<zzad> {
    private String zzty;
    private String zztz;
    private String zzua;
    private String zzub;
    private boolean zzuc;
    private String zzud;
    private boolean zzue;
    private double zzuf;

    public final void setClientId(String str) {
        this.zztz = str;
    }

    public final void setUserId(String str) {
        this.zzua = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.zzty);
        hashMap.put("clientId", this.zztz);
        hashMap.put("userId", this.zzua);
        hashMap.put("androidAdId", this.zzub);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.zzuc));
        hashMap.put("sessionControl", this.zzud);
        hashMap.put("nonInteraction", Boolean.valueOf(this.zzue));
        hashMap.put("sampleRate", Double.valueOf(this.zzuf));
        return zza((Object) hashMap);
    }

    public final void zza(boolean z) {
        this.zzuc = z;
    }

    public final String zzay() {
        return this.zzty;
    }

    public final String zzaz() {
        return this.zztz;
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzad zzadVar) {
        zzad zzadVar2 = zzadVar;
        if (!TextUtils.isEmpty(this.zzty)) {
            zzadVar2.zzty = this.zzty;
        }
        if (!TextUtils.isEmpty(this.zztz)) {
            zzadVar2.zztz = this.zztz;
        }
        if (!TextUtils.isEmpty(this.zzua)) {
            zzadVar2.zzua = this.zzua;
        }
        if (!TextUtils.isEmpty(this.zzub)) {
            zzadVar2.zzub = this.zzub;
        }
        if (this.zzuc) {
            zzadVar2.zzuc = true;
        }
        if (!TextUtils.isEmpty(this.zzud)) {
            zzadVar2.zzud = this.zzud;
        }
        if (this.zzue) {
            zzadVar2.zzue = this.zzue;
        }
        if (this.zzuf != 0.0d) {
            double d2 = this.zzuf;
            Preconditions.checkArgument(d2 >= 0.0d && d2 <= 100.0d, "Sample rate must be between 0% and 100%");
            zzadVar2.zzuf = d2;
        }
    }

    public final void zzb(boolean z) {
        this.zzue = true;
    }

    public final String zzba() {
        return this.zzua;
    }

    public final String zzbb() {
        return this.zzub;
    }

    public final boolean zzbc() {
        return this.zzuc;
    }

    public final String zzbd() {
        return this.zzud;
    }

    public final boolean zzbe() {
        return this.zzue;
    }

    public final double zzbf() {
        return this.zzuf;
    }

    public final void zzl(String str) {
        this.zzty = str;
    }

    public final void zzm(String str) {
        this.zzub = str;
    }
}
