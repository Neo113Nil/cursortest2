package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.google.common.net.HttpHeaders;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbry extends zzbsb {
    private final Map zza;
    private final Context zzb;

    public zzbry(zzcek zzcekVar, Map map) {
        super(zzcekVar, "storePicture");
        this.zza = map;
        this.zzb = zzcekVar.zzj();
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbbp(context).zza()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String.valueOf(str);
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzc();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            String.valueOf(lastPathSegment);
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder zzO = com.google.android.gms.ads.internal.util.zzs.zzO(context);
        zzO.setTitle(zzf != null ? zzf.getString(R.string.s1) : "Save image");
        zzO.setMessage(zzf != null ? zzf.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        zzO.setPositiveButton(zzf != null ? zzf.getString(R.string.s3) : HttpHeaders.ACCEPT, new zzbrw(this, str, lastPathSegment));
        zzO.setNegativeButton(zzf != null ? zzf.getString(R.string.s4) : "Decline", new zzbrx(this));
        zzO.create().show();
    }

    final /* synthetic */ Context zzb() {
        return this.zzb;
    }
}
