package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzv extends zzi<zzv> {
    private String name;
    private String zznj;
    private String zztf;
    private String zztg;
    private String zzth;
    private String zzti;
    private String zztj;
    private String zztk;
    private String zztl;
    private String zztm;

    public final String getId() {
        return this.zznj;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSource() {
        return this.zztf;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.name);
        hashMap.put("source", this.zztf);
        hashMap.put("medium", this.zztg);
        hashMap.put("keyword", this.zzth);
        hashMap.put("content", this.zzti);
        hashMap.put("id", this.zznj);
        hashMap.put("adNetworkId", this.zztj);
        hashMap.put("gclid", this.zztk);
        hashMap.put("dclid", this.zztl);
        hashMap.put("aclid", this.zztm);
        return zza((Object) hashMap);
    }

    public final String zzaj() {
        return this.zztg;
    }

    public final String zzak() {
        return this.zzth;
    }

    public final String zzal() {
        return this.zzti;
    }

    public final String zzam() {
        return this.zztj;
    }

    public final String zzan() {
        return this.zztk;
    }

    public final String zzao() {
        return this.zztl;
    }

    public final String zzap() {
        return this.zztm;
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzv zzvVar) {
        zzv zzvVar2 = zzvVar;
        if (!TextUtils.isEmpty(this.name)) {
            zzvVar2.name = this.name;
        }
        if (!TextUtils.isEmpty(this.zztf)) {
            zzvVar2.zztf = this.zztf;
        }
        if (!TextUtils.isEmpty(this.zztg)) {
            zzvVar2.zztg = this.zztg;
        }
        if (!TextUtils.isEmpty(this.zzth)) {
            zzvVar2.zzth = this.zzth;
        }
        if (!TextUtils.isEmpty(this.zzti)) {
            zzvVar2.zzti = this.zzti;
        }
        if (!TextUtils.isEmpty(this.zznj)) {
            zzvVar2.zznj = this.zznj;
        }
        if (!TextUtils.isEmpty(this.zztj)) {
            zzvVar2.zztj = this.zztj;
        }
        if (!TextUtils.isEmpty(this.zztk)) {
            zzvVar2.zztk = this.zztk;
        }
        if (!TextUtils.isEmpty(this.zztl)) {
            zzvVar2.zztl = this.zztl;
        }
        if (TextUtils.isEmpty(this.zztm)) {
            return;
        }
        zzvVar2.zztm = this.zztm;
    }

    public final void zzc(String str) {
        this.zztf = str;
    }

    public final void zzd(String str) {
        this.zztg = str;
    }

    public final void zze(String str) {
        this.zzth = str;
    }

    public final void zzf(String str) {
        this.zzti = str;
    }

    public final void zzg(String str) {
        this.zznj = str;
    }

    public final void zzh(String str) {
        this.zztj = str;
    }

    public final void zzi(String str) {
        this.zztk = str;
    }

    public final void zzj(String str) {
        this.zztl = str;
    }

    public final void zzk(String str) {
        this.zztm = str;
    }
}
