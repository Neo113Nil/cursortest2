package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgx implements zzgq {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzgq zzc;
    private zzgq zzd;
    private zzgq zze;
    private zzgq zzf;
    private zzgq zzg;
    private zzgq zzh;
    private zzgq zzi;
    private zzgq zzj;
    private zzgq zzk;

    public zzgx(Context context, zzgq zzgqVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzgqVar;
    }

    private final zzgq zzg() {
        if (this.zze == null) {
            zzgj zzgjVar = new zzgj(this.zza);
            this.zze = zzgjVar;
            zzh(zzgjVar);
        }
        return this.zze;
    }

    private final void zzh(zzgq zzgqVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzgqVar.zzf((zzhs) this.zzb.get(i));
        }
    }

    private static final void zzi(zzgq zzgqVar, zzhs zzhsVar) {
        if (zzgqVar != null) {
            zzgqVar.zzf(zzhsVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final long zzb(zzgv zzgvVar) throws IOException {
        zzgq zzgqVar;
        zzef.zzf(this.zzk == null);
        String scheme = zzgvVar.zza.getScheme();
        Uri uri = zzgvVar.zza;
        int i = zzfs.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = zzgvVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzhg zzhgVar = new zzhg();
                    this.zzd = zzhgVar;
                    zzh(zzhgVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            if (this.zzf == null) {
                zzgn zzgnVar = new zzgn(this.zza);
                this.zzf = zzgnVar;
                zzh(zzgnVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzgq zzgqVar2 = (zzgq) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzgqVar2;
                    zzh(zzgqVar2);
                } catch (ClassNotFoundException unused) {
                    zzez.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzhu zzhuVar = new zzhu(AdError.SERVER_ERROR_CODE);
                this.zzh = zzhuVar;
                zzh(zzhuVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzgo zzgoVar = new zzgo();
                this.zzi = zzgoVar;
                zzh(zzgoVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzhq zzhqVar = new zzhq(this.zza);
                    this.zzj = zzhqVar;
                    zzh(zzhqVar);
                }
                zzgqVar = this.zzj;
            } else {
                zzgqVar = this.zzc;
            }
            this.zzk = zzgqVar;
        }
        return this.zzk.zzb(zzgvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Uri zzc() {
        zzgq zzgqVar = this.zzk;
        if (zzgqVar == null) {
            return null;
        }
        return zzgqVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzd() throws IOException {
        zzgq zzgqVar = this.zzk;
        if (zzgqVar != null) {
            try {
                zzgqVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Map zze() {
        zzgq zzgqVar = this.zzk;
        return zzgqVar == null ? Collections.emptyMap() : zzgqVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzgq zzgqVar = this.zzk;
        zzgqVar.getClass();
        return zzgqVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzf(zzhs zzhsVar) {
        zzhsVar.getClass();
        this.zzc.zzf(zzhsVar);
        this.zzb.add(zzhsVar);
        zzi(this.zzd, zzhsVar);
        zzi(this.zze, zzhsVar);
        zzi(this.zzf, zzhsVar);
        zzi(this.zzg, zzhsVar);
        zzi(this.zzh, zzhsVar);
        zzi(this.zzi, zzhsVar);
        zzi(this.zzj, zzhsVar);
    }
}
