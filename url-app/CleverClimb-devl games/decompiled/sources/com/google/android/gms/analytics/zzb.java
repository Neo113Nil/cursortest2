package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.cmplay.base.util.webview.util.WebUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzab;
import com.google.android.gms.internal.measurement.zzac;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzaw;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.internal.measurement.zzw;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.internal.measurement.zzy;
import com.google.android.gms.internal.measurement.zzz;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzb extends zzaq implements zzo {
    private static DecimalFormat zzql;
    private final zzat zzqh;
    private final String zzqm;
    private final Uri zzqn;

    public zzb(zzat zzatVar, String str) {
        this(zzatVar, str, true, false);
    }

    private zzb(zzat zzatVar, String str, boolean z, boolean z2) {
        super(zzatVar);
        Preconditions.checkNotEmpty(str);
        this.zzqh = zzatVar;
        this.zzqm = str;
        this.zzqn = zzb(this.zzqm);
    }

    private static String zza(double d2) {
        if (zzql == null) {
            zzql = new DecimalFormat("0.######");
        }
        return zzql.format(d2);
    }

    private static void zza(Map<String, String> map, String str, double d2) {
        if (d2 != 0.0d) {
            map.put(str, zza(d2));
        }
    }

    private static void zza(Map<String, String> map, String str, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        map.put(str, sb.toString());
    }

    private static void zza(Map<String, String> map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    private static void zza(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    static Uri zzb(String str) {
        Preconditions.checkNotEmpty(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    @VisibleForTesting
    private static Map<String, String> zzc(zzg zzgVar) {
        HashMap hashMap = new HashMap();
        zzy zzyVar = (zzy) zzgVar.zza(zzy.class);
        if (zzyVar != null) {
            for (Map.Entry<String, Object> entry : zzyVar.zzas().entrySet()) {
                Object value = entry.getValue();
                String str = null;
                if (value != null) {
                    if (value instanceof String) {
                        String str2 = (String) value;
                        if (!TextUtils.isEmpty(str2)) {
                            str = str2;
                        }
                    } else if (value instanceof Double) {
                        Double d2 = (Double) value;
                        if (d2.doubleValue() != 0.0d) {
                            str = zza(d2.doubleValue());
                        }
                    } else if (!(value instanceof Boolean)) {
                        str = String.valueOf(value);
                    } else if (value != Boolean.FALSE) {
                        str = "1";
                    }
                }
                if (str != null) {
                    hashMap.put(entry.getKey(), str);
                }
            }
        }
        zzad zzadVar = (zzad) zzgVar.zza(zzad.class);
        if (zzadVar != null) {
            zza(hashMap, "t", zzadVar.zzay());
            zza(hashMap, "cid", zzadVar.zzaz());
            zza(hashMap, "uid", zzadVar.zzba());
            zza(hashMap, WebUtils.SC, zzadVar.zzbd());
            zza(hashMap, "sf", zzadVar.zzbf());
            zza(hashMap, "ni", zzadVar.zzbe());
            zza(hashMap, "adid", zzadVar.zzbb());
            zza(hashMap, "ate", zzadVar.zzbc());
        }
        zzae zzaeVar = (zzae) zzgVar.zza(zzae.class);
        if (zzaeVar != null) {
            zza(hashMap, "cd", zzaeVar.zzbg());
            zza(hashMap, "a", zzaeVar.zzbh());
            zza(hashMap, "dr", zzaeVar.zzbi());
        }
        zzab zzabVar = (zzab) zzgVar.zza(zzab.class);
        if (zzabVar != null) {
            zza(hashMap, "ec", zzabVar.zzax());
            zza(hashMap, "ea", zzabVar.getAction());
            zza(hashMap, "el", zzabVar.getLabel());
            zza(hashMap, "ev", zzabVar.getValue());
        }
        zzv zzvVar = (zzv) zzgVar.zza(zzv.class);
        if (zzvVar != null) {
            zza(hashMap, "cn", zzvVar.getName());
            zza(hashMap, "cs", zzvVar.getSource());
            zza(hashMap, "cm", zzvVar.zzaj());
            zza(hashMap, "ck", zzvVar.zzak());
            zza(hashMap, "cc", zzvVar.zzal());
            zza(hashMap, "ci", zzvVar.getId());
            zza(hashMap, "anid", zzvVar.zzam());
            zza(hashMap, "gclid", zzvVar.zzan());
            zza(hashMap, "dclid", zzvVar.zzao());
            zza(hashMap, "aclid", zzvVar.zzap());
        }
        zzac zzacVar = (zzac) zzgVar.zza(zzac.class);
        if (zzacVar != null) {
            zza(hashMap, "exd", zzacVar.zztw);
            zza(hashMap, "exf", zzacVar.zztx);
        }
        zzaf zzafVar = (zzaf) zzgVar.zza(zzaf.class);
        if (zzafVar != null) {
            zza(hashMap, "sn", zzafVar.zzun);
            zza(hashMap, "sa", zzafVar.zzuo);
            zza(hashMap, "st", zzafVar.zzup);
        }
        zzag zzagVar = (zzag) zzgVar.zza(zzag.class);
        if (zzagVar != null) {
            zza(hashMap, "utv", zzagVar.zzuq);
            zza(hashMap, "utt", zzagVar.zzur);
            zza(hashMap, "utc", zzagVar.mCategory);
            zza(hashMap, "utl", zzagVar.zzus);
        }
        zzw zzwVar = (zzw) zzgVar.zza(zzw.class);
        if (zzwVar != null) {
            for (Map.Entry<Integer, String> entry2 : zzwVar.zzaq().entrySet()) {
                String zzc = zzd.zzc(entry2.getKey().intValue());
                if (!TextUtils.isEmpty(zzc)) {
                    hashMap.put(zzc, entry2.getValue());
                }
            }
        }
        zzx zzxVar = (zzx) zzgVar.zza(zzx.class);
        if (zzxVar != null) {
            for (Map.Entry<Integer, Double> entry3 : zzxVar.zzar().entrySet()) {
                String zze = zzd.zze(entry3.getKey().intValue());
                if (!TextUtils.isEmpty(zze)) {
                    hashMap.put(zze, zza(entry3.getValue().doubleValue()));
                }
            }
        }
        zzaa zzaaVar = (zzaa) zzgVar.zza(zzaa.class);
        if (zzaaVar != null) {
            ProductAction zzat = zzaaVar.zzat();
            if (zzat != null) {
                for (Map.Entry<String, String> entry4 : zzat.build().entrySet()) {
                    hashMap.put(entry4.getKey().startsWith("&") ? entry4.getKey().substring(1) : entry4.getKey(), entry4.getValue());
                }
            }
            Iterator<Promotion> it = zzaaVar.zzaw().iterator();
            int i = 1;
            while (it.hasNext()) {
                hashMap.putAll(it.next().zzn(zzd.zzi(i)));
                i++;
            }
            Iterator<Product> it2 = zzaaVar.zzau().iterator();
            int i2 = 1;
            while (it2.hasNext()) {
                hashMap.putAll(it2.next().zzn(zzd.zzg(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry<String, List<Product>> entry5 : zzaaVar.zzav().entrySet()) {
                List<Product> value2 = entry5.getValue();
                String zzl = zzd.zzl(i3);
                int i4 = 1;
                for (Product product : value2) {
                    String valueOf = String.valueOf(zzl);
                    String valueOf2 = String.valueOf(zzd.zzj(i4));
                    hashMap.putAll(product.zzn(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i4++;
                }
                if (!TextUtils.isEmpty(entry5.getKey())) {
                    String valueOf3 = String.valueOf(zzl);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), entry5.getKey());
                }
                i3++;
            }
        }
        zzz zzzVar = (zzz) zzgVar.zza(zzz.class);
        if (zzzVar != null) {
            zza(hashMap, "ul", zzzVar.getLanguage());
            zza(hashMap, "sd", zzzVar.zztq);
            zza(hashMap, "sr", zzzVar.zztr, zzzVar.zzts);
            zza(hashMap, "vp", zzzVar.zztt, zzzVar.zztu);
        }
        zzu zzuVar = (zzu) zzgVar.zza(zzu.class);
        if (zzuVar != null) {
            zza(hashMap, "an", zzuVar.zzaf());
            zza(hashMap, "aid", zzuVar.zzah());
            zza(hashMap, "aiid", zzuVar.zzai());
            zza(hashMap, "av", zzuVar.zzag());
        }
        return hashMap;
    }

    @Override // com.google.android.gms.analytics.zzo
    public final void zzb(zzg zzgVar) {
        Preconditions.checkNotNull(zzgVar);
        Preconditions.checkArgument(zzgVar.zzt(), "Can't deliver not submitted measurement");
        Preconditions.checkNotMainThread("deliver should be called on worker thread");
        zzg zzo = zzgVar.zzo();
        zzad zzadVar = (zzad) zzo.zzb(zzad.class);
        if (TextUtils.isEmpty(zzadVar.zzay())) {
            zzbu().zza(zzc(zzo), "Ignoring measurement without type");
            return;
        }
        if (TextUtils.isEmpty(zzadVar.zzaz())) {
            zzbu().zza(zzc(zzo), "Ignoring measurement without client id");
            return;
        }
        if (this.zzqh.zzck().getAppOptOut()) {
            return;
        }
        double zzbf = zzadVar.zzbf();
        if (zzdd.zza(zzbf, zzadVar.zzaz())) {
            zzb("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(zzbf));
            return;
        }
        Map<String, String> zzc = zzc(zzo);
        zzc.put("v", "1");
        zzc.put("_v", zzas.zzvk);
        zzc.put("tid", this.zzqm);
        if (this.zzqh.zzck().isDryRunEnabled()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : zzc.entrySet()) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
            }
            zzc("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
            return;
        }
        HashMap hashMap = new HashMap();
        zzdd.zzb(hashMap, "uid", zzadVar.zzba());
        zzu zzuVar = (zzu) zzgVar.zza(zzu.class);
        if (zzuVar != null) {
            zzdd.zzb(hashMap, "an", zzuVar.zzaf());
            zzdd.zzb(hashMap, "aid", zzuVar.zzah());
            zzdd.zzb(hashMap, "av", zzuVar.zzag());
            zzdd.zzb(hashMap, "aiid", zzuVar.zzai());
        }
        zzc.put("_s", String.valueOf(zzby().zza(new zzaw(0L, zzadVar.zzaz(), this.zzqm, !TextUtils.isEmpty(zzadVar.zzbb()), 0L, hashMap))));
        zzby().zza(new zzch(zzbu(), zzc, zzgVar.zzr(), true));
    }

    @Override // com.google.android.gms.analytics.zzo
    public final Uri zzk() {
        return this.zzqn;
    }
}
