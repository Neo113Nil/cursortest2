package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzflg {
    private final zzflo zza;
    private final zzflo zzb;
    private final zzflk zzc;
    private final zzfln zzd;

    private zzflg(zzflk zzflkVar, zzfln zzflnVar, zzflo zzfloVar, zzflo zzfloVar2, boolean z) {
        this.zzc = zzflkVar;
        this.zzd = zzflnVar;
        this.zza = zzfloVar;
        if (zzfloVar2 == null) {
            this.zzb = zzflo.NONE;
        } else {
            this.zzb = zzfloVar2;
        }
    }

    public static zzflg zza(zzflk zzflkVar, zzfln zzflnVar, zzflo zzfloVar, zzflo zzfloVar2, boolean z) {
        zzfmv.zzb(zzflnVar, "ImpressionType is null");
        zzfmv.zzb(zzfloVar, "Impression owner is null");
        if (zzfloVar == zzflo.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzflkVar == zzflk.DEFINED_BY_JAVASCRIPT && zzfloVar == zzflo.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzflnVar == zzfln.DEFINED_BY_JAVASCRIPT && zzfloVar == zzflo.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzflg(zzflkVar, zzflnVar, zzfloVar, zzfloVar2, true);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfmq.zze(jSONObject, "impressionOwner", this.zza);
        zzfmq.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfmq.zze(jSONObject, "creativeType", this.zzc);
        zzfmq.zze(jSONObject, "impressionType", this.zzd);
        zzfmq.zze(jSONObject, "isolateVerificationScripts", true);
        return jSONObject;
    }
}
