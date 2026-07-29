package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;

@zzadh
/* loaded from: classes2.dex */
public final class zzajb {
    public static Uri zzb(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzbv.zzfh().zzx(context) || !TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri;
        }
        String zzab = com.google.android.gms.ads.internal.zzbv.zzfh().zzab(context);
        Uri zzb = zzb(uri.toString(), "fbs_aeid", zzab);
        com.google.android.gms.ads.internal.zzbv.zzfh().zze(context, zzab);
        return zzb;
    }

    @VisibleForTesting
    private static Uri zzb(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String zzb(String str, Context context) {
        String zzab;
        if (!com.google.android.gms.ads.internal.zzbv.zzfh().zzs(context) || TextUtils.isEmpty(str) || (zzab = com.google.android.gms.ads.internal.zzbv.zzfh().zzab(context)) == null) {
            return str;
        }
        if (!((Boolean) zzkb.zzik().zzd(zznk.zzaxr)).booleanValue()) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (com.google.android.gms.ads.internal.zzbv.zzek().zzcx(str)) {
                com.google.android.gms.ads.internal.zzbv.zzfh().zze(context, zzab);
                return zzb(str, "fbs_aeid", zzab).toString();
            }
            if (!com.google.android.gms.ads.internal.zzbv.zzek().zzcy(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzbv.zzfh().zzf(context, zzab);
            return zzb(str, "fbs_aeid", zzab).toString();
        }
        CharSequence charSequence = (String) zzkb.zzik().zzd(zznk.zzaxs);
        if (!str.contains(charSequence)) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzbv.zzek().zzcx(str)) {
            com.google.android.gms.ads.internal.zzbv.zzfh().zze(context, zzab);
            return str.replace(charSequence, zzab);
        }
        if (!com.google.android.gms.ads.internal.zzbv.zzek().zzcy(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzbv.zzfh().zzf(context, zzab);
        return str.replace(charSequence, zzab);
    }

    public static String zzc(String str, Context context) {
        String zzab;
        if (!com.google.android.gms.ads.internal.zzbv.zzfh().zzs(context) || TextUtils.isEmpty(str) || (zzab = com.google.android.gms.ads.internal.zzbv.zzfh().zzab(context)) == null || !com.google.android.gms.ads.internal.zzbv.zzek().zzcy(str)) {
            return str;
        }
        if (!((Boolean) zzkb.zzik().zzd(zznk.zzaxr)).booleanValue()) {
            return !str.contains("fbs_aeid") ? zzb(str, "fbs_aeid", zzab).toString() : str;
        }
        CharSequence charSequence = (String) zzkb.zzik().zzd(zznk.zzaxs);
        return str.contains(charSequence) ? str.replace(charSequence, zzab) : str;
    }
}
