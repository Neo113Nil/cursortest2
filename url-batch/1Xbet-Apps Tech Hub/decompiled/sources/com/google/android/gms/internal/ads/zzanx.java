package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import io.ktor.client.utils.CacheControl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzanx {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzanm.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzanm.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzamj zzb(zzamw zzamwVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzamwVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get(HttpHeaders.DATE);
        long zza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get(HttpHeaders.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals(CacheControl.NO_CACHE) || trim.equals(CacheControl.NO_STORE)) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals(CacheControl.MUST_REVALIDATE) || trim.equals(CacheControl.PROXY_REVALIDATE)) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get(HttpHeaders.EXPIRES);
        long zza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get(HttpHeaders.LAST_MODIFIED);
        long zza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get(HttpHeaders.ETAG);
        if (i != 0) {
            j4 = currentTimeMillis + (j2 * 1000);
            j3 = z ? j4 : (j * 1000) + j4;
        } else {
            j3 = 0;
            if (zza <= 0 || zza2 < zza) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zza2 - zza);
                j3 = j4;
            }
        }
        zzamj zzamjVar = new zzamj();
        zzamjVar.zza = zzamwVar.zzb;
        zzamjVar.zzb = str5;
        zzamjVar.zzf = j4;
        zzamjVar.zze = j3;
        zzamjVar.zzc = zza;
        zzamjVar.zzd = zza3;
        zzamjVar.zzg = map;
        zzamjVar.zzh = zzamwVar.zzd;
        return zzamjVar;
    }

    static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
