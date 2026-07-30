package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzra;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes3.dex */
public final class zzkv extends zzks {
    zzkv(zzlg zzlgVar) {
        super(zzlgVar);
    }

    private final String zzd(String str) {
        String zzi = this.zzf.zzo().zzi(str);
        if (TextUtils.isEmpty(zzi)) {
            return (String) zzeh.zzq.zza(null);
        }
        Uri parse = Uri.parse((String) zzeh.zzq.zza(null));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.authority(zzi + "." + parse.getAuthority());
        return buildUpon.build().toString();
    }

    public final zzku zza(String str) {
        zzra.zzc();
        zzku zzkuVar = null;
        if (this.zzt.zzf().zzs(null, zzeh.zzaq)) {
            this.zzt.zzaA().zzj().zza("sgtm feature flag enabled.");
            zzh zzj = this.zzf.zzi().zzj(str);
            if (zzj == null) {
                return new zzku(zzd(str));
            }
            if (zzj.zzan()) {
                this.zzt.zzaA().zzj().zza("sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.zzff zze = this.zzf.zzo().zze(zzj.zzu());
                if (zze != null) {
                    String zzj2 = zze.zzj();
                    if (!TextUtils.isEmpty(zzj2)) {
                        String zzi = zze.zzi();
                        this.zzt.zzaA().zzj().zzc("sgtm configured with upload_url, server_info", zzj2, true != TextUtils.isEmpty(zzi) ? "N" : "Y");
                        if (TextUtils.isEmpty(zzi)) {
                            this.zzt.zzay();
                            zzkuVar = new zzku(zzj2);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", zzi);
                            zzkuVar = new zzku(zzj2, hashMap);
                        }
                    }
                }
            }
            if (zzkuVar != null) {
                return zzkuVar;
            }
        }
        return new zzku(zzd(str));
    }
}
