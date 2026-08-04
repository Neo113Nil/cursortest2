package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcvn {
    public static final zzbxf zza(Context context, VersionInfoParcel versionInfoParcel, zzfcj zzfcjVar, zzbxb zzbxbVar) {
        zzbxc zzbxcVar = zzfcjVar.zzA;
        if (zzbxcVar == null) {
            return null;
        }
        zzfco zzfcoVar = zzfcjVar.zzs;
        return new zzbxa(context, versionInfoParcel, zzbxcVar, zzfcoVar != null ? zzfcoVar.zzb : null, zzbxbVar);
    }
}
