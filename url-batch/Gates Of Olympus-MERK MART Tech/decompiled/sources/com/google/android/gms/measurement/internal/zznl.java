package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import coil3.disk.DiskLruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.internal.zzin;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
public final class zznl extends zzmx {
    @Override // com.google.android.gms.measurement.internal.zzmx
    protected final boolean zzc() {
        return false;
    }

    static int zza(zzfn.zzk.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i = 0; i < zzaVar.zzd(); i++) {
            if (str.equals(zzaVar.zzk(i).zzg())) {
                return i;
            }
        }
        return -1;
    }

    final long zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zza(str.getBytes(Charset.forName("UTF-8")));
    }

    final long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzq().zzt();
        MessageDigest zzu = zznp.zzu();
        if (zzu == null) {
            zzj().zzg().zza("Failed to get MD5");
            return 0L;
        }
        return zznp.zza(zzu.digest(bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    static Bundle zza(List<zzfn.zzh> list) {
        Bundle bundle = new Bundle();
        for (zzfn.zzh zzhVar : list) {
            String zzg = zzhVar.zzg();
            if (zzhVar.zzj()) {
                bundle.putDouble(zzg, zzhVar.zza());
            } else if (zzhVar.zzk()) {
                bundle.putFloat(zzg, zzhVar.zzb());
            } else if (zzhVar.zzn()) {
                bundle.putString(zzg, zzhVar.zzh());
            } else if (zzhVar.zzl()) {
                bundle.putLong(zzg, zzhVar.zzd());
            }
        }
        return bundle;
    }

    private final Bundle zza(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(zza((Map<String, Object>) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    final <T extends Parcelable> T zza(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzj().zzg().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzu zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    final zzbd zza(com.google.android.gms.internal.measurement.zzad zzadVar) {
        String str;
        Object obj;
        Bundle zza = zza(zzadVar.zzc(), true);
        if (zza.containsKey("_o") && (obj = zza.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String zzb = zziq.zzb(zzadVar.zzb());
        if (zzb == null) {
            zzb = zzadVar.zzb();
        }
        return new zzbd(zzb, new zzbc(zza), str2, zzadVar.zza());
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzgt zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzmc zzn() {
        return super.zzn();
    }

    final zzmu zza(String str, zzfn.zzk.zza zzaVar, zzfn.zzf.zza zzaVar2, String str2) {
        int indexOf;
        if (!zzpg.zza() || !zze().zze(str, zzbf.zzbz)) {
            return null;
        }
        long currentTimeMillis = zzb().currentTimeMillis();
        String[] split = zze().zzd(str, zzbf.zzbe).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            if (!hashSet.add(Objects.requireNonNull(str3))) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        zzna zzo = zzo();
        String zzf = zzo.zzm().zzf(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(zzo.zze().zzd(str, zzbf.zzax));
        if (!TextUtils.isEmpty(zzf)) {
            builder.authority(zzf + "." + zzo.zze().zzd(str, zzbf.zzay));
        } else {
            builder.authority(zzo.zze().zzd(str, zzbf.zzay));
        }
        builder.path(zzo.zze().zzd(str, zzbf.zzaz));
        zza(builder, "gmp_app_id", zzaVar.zzx(), (Set<String>) unmodifiableSet);
        zza(builder, "gmp_version", "97001", (Set<String>) unmodifiableSet);
        String zzu = zzaVar.zzu();
        if (zze().zze(str, zzbf.zzcc) && zzm().zzp(str)) {
            zzu = "";
        }
        zza(builder, "app_instance_id", zzu, (Set<String>) unmodifiableSet);
        zza(builder, "rdid", zzaVar.zzz(), (Set<String>) unmodifiableSet);
        zza(builder, "bundle_id", zzaVar.zzt(), (Set<String>) unmodifiableSet);
        String zze = zzaVar2.zze();
        String zza = zziq.zza(zze);
        if (!TextUtils.isEmpty(zza)) {
            zze = zza;
        }
        zza(builder, "app_event_name", zze, (Set<String>) unmodifiableSet);
        zza(builder, "app_version", String.valueOf(zzaVar.zzb()), (Set<String>) unmodifiableSet);
        String zzy = zzaVar.zzy();
        if (zze().zze(str, zzbf.zzcc) && zzm().zzt(str) && !TextUtils.isEmpty(zzy) && (indexOf = zzy.indexOf(".")) != -1) {
            zzy = zzy.substring(0, indexOf);
        }
        zza(builder, "os_version", zzy, (Set<String>) unmodifiableSet);
        zza(builder, "timestamp", String.valueOf(zzaVar2.zzc()), (Set<String>) unmodifiableSet);
        boolean zzad = zzaVar.zzad();
        String str4 = DiskLruCache.VERSION;
        if (zzad) {
            zza(builder, "lat", DiskLruCache.VERSION, (Set<String>) unmodifiableSet);
        }
        zza(builder, "privacy_sandbox_version", String.valueOf(zzaVar.zza()), (Set<String>) unmodifiableSet);
        zza(builder, "trigger_uri_source", DiskLruCache.VERSION, (Set<String>) unmodifiableSet);
        zza(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), (Set<String>) unmodifiableSet);
        zza(builder, "request_uuid", str2, (Set<String>) unmodifiableSet);
        List<zzfn.zzh> zzf2 = zzaVar2.zzf();
        Bundle bundle = new Bundle();
        for (zzfn.zzh zzhVar : zzf2) {
            String zzg = zzhVar.zzg();
            if (zzhVar.zzj()) {
                bundle.putString(zzg, String.valueOf(zzhVar.zza()));
            } else if (zzhVar.zzk()) {
                bundle.putString(zzg, String.valueOf(zzhVar.zzb()));
            } else if (zzhVar.zzn()) {
                bundle.putString(zzg, zzhVar.zzh());
            } else if (zzhVar.zzl()) {
                bundle.putString(zzg, String.valueOf(zzhVar.zzd()));
            }
        }
        zza(builder, zze().zzd(str, zzbf.zzbd).split("\\|"), bundle, (Set<String>) unmodifiableSet);
        List<zzfn.zzo> zzab = zzaVar.zzab();
        Bundle bundle2 = new Bundle();
        for (zzfn.zzo zzoVar : zzab) {
            String zzg2 = zzoVar.zzg();
            if (zzoVar.zzi()) {
                bundle2.putString(zzg2, String.valueOf(zzoVar.zza()));
            } else if (zzoVar.zzj()) {
                bundle2.putString(zzg2, String.valueOf(zzoVar.zzb()));
            } else if (zzoVar.zzm()) {
                bundle2.putString(zzg2, zzoVar.zzh());
            } else if (zzoVar.zzk()) {
                bundle2.putString(zzg2, String.valueOf(zzoVar.zzc()));
            }
        }
        zza(builder, zze().zzd(str, zzbf.zzbc).split("\\|"), bundle2, (Set<String>) unmodifiableSet);
        if (!zzaVar.zzac()) {
            str4 = "0";
        }
        zza(builder, "dma", str4, (Set<String>) unmodifiableSet);
        if (!zzaVar.zzw().isEmpty()) {
            zza(builder, "dma_cps", zzaVar.zzw(), (Set<String>) unmodifiableSet);
        }
        if (zze().zza(zzbf.zzce) && zzaVar.zzae()) {
            zzfn.zza zzg3 = zzaVar.zzg();
            if (!zzg3.zzh().isEmpty()) {
                zza(builder, "dl_gclid", zzg3.zzh(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzg().isEmpty()) {
                zza(builder, "dl_gbraid", zzg3.zzg(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzf().isEmpty()) {
                zza(builder, "dl_gs", zzg3.zzf(), (Set<String>) unmodifiableSet);
            }
            if (zzg3.zza() > 0) {
                zza(builder, "dl_ss_ts", String.valueOf(zzg3.zza()), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzk().isEmpty()) {
                zza(builder, "mr_gclid", zzg3.zzk(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzj().isEmpty()) {
                zza(builder, "mr_gbraid", zzg3.zzj(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzi().isEmpty()) {
                zza(builder, "mr_gs", zzg3.zzi(), (Set<String>) unmodifiableSet);
            }
            if (zzg3.zzb() > 0) {
                zza(builder, "mr_click_ts", String.valueOf(zzg3.zzb()), (Set<String>) unmodifiableSet);
            }
        }
        return new zzmu(builder.build().toString(), currentTimeMillis, 1);
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzna zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zznl g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    final zzfn.zzf zza(zzba zzbaVar) {
        zzfn.zzf.zza zza = zzfn.zzf.zze().zza(zzbaVar.zzd);
        Iterator<String> it = zzbaVar.zze.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfn.zzh.zza zza2 = zzfn.zzh.zze().zza(next);
            Object zzc = zzbaVar.zze.zzc(next);
            Preconditions.checkNotNull(zzc);
            zza(zza2, zzc);
            zza.zza(zza2);
        }
        return (zzfn.zzf) ((com.google.android.gms.internal.measurement.zzjk) zza.zzai());
    }

    static zzfn.zzh zza(zzfn.zzf zzfVar, String str) {
        for (zzfn.zzh zzhVar : zzfVar.zzh()) {
            if (zzhVar.zzg().equals(str)) {
                return zzhVar;
            }
        }
        return null;
    }

    static <BuilderT extends com.google.android.gms.internal.measurement.zzks> BuilderT zza(BuilderT buildert, byte[] bArr) throws com.google.android.gms.internal.measurement.zzjs {
        com.google.android.gms.internal.measurement.zzix zza = com.google.android.gms.internal.measurement.zzix.zza();
        if (zza != null) {
            return (BuilderT) buildert.zza(bArr, zza);
        }
        return (BuilderT) buildert.zza(bArr);
    }

    static Object zzb(zzfn.zzf zzfVar, String str) {
        zzfn.zzh zza = zza(zzfVar, str);
        if (zza == null) {
            return null;
        }
        if (zza.zzn()) {
            return zza.zzh();
        }
        if (zza.zzl()) {
            return Long.valueOf(zza.zzd());
        }
        if (zza.zzj()) {
            return Double.valueOf(zza.zza());
        }
        if (zza.zzc() <= 0) {
            return null;
        }
        List<zzfn.zzh> zzi = zza.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfn.zzh zzhVar : zzi) {
            if (zzhVar != null) {
                Bundle bundle = new Bundle();
                for (zzfn.zzh zzhVar2 : zzhVar.zzi()) {
                    if (zzhVar2.zzn()) {
                        bundle.putString(zzhVar2.zzg(), zzhVar2.zzh());
                    } else if (zzhVar2.zzl()) {
                        bundle.putLong(zzhVar2.zzg(), zzhVar2.zzd());
                    } else if (zzhVar2.zzj()) {
                        bundle.putDouble(zzhVar2.zzg(), zzhVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static Object zza(zzfn.zzf zzfVar, String str, Object obj) {
        Object zzb = zzb(zzfVar, str);
        return zzb == null ? obj : zzb;
    }

    final String zza(zzfn.zzj zzjVar) {
        zzfn.zzc zzv;
        if (zzjVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (zzpn.zza() && zze().zza(zzbf.zzbs) && zzjVar.zza() > 0) {
            zzq();
            if (zznp.zzf(zzjVar.zza(0).zzz()) && zzjVar.zzf()) {
                zza(sb, 0, "UploadSubdomain", zzjVar.zzd());
            }
        }
        for (zzfn.zzk zzkVar : zzjVar.zze()) {
            if (zzkVar != null) {
                zza(sb, 1);
                sb.append("bundle {\n");
                if (zzkVar.zzbo()) {
                    zza(sb, 1, "protocol_version", Integer.valueOf(zzkVar.zzf()));
                }
                if (zzph.zza() && zze().zze(zzkVar.zzz(), zzbf.zzbr) && zzkVar.zzbr()) {
                    zza(sb, 1, "session_stitching_token", zzkVar.zzao());
                }
                zza(sb, 1, "platform", zzkVar.zzam());
                if (zzkVar.zzbj()) {
                    zza(sb, 1, "gmp_version", Long.valueOf(zzkVar.zzn()));
                }
                if (zzkVar.zzbw()) {
                    zza(sb, 1, "uploading_gmp_version", Long.valueOf(zzkVar.zzt()));
                }
                if (zzkVar.zzbh()) {
                    zza(sb, 1, "dynamite_version", Long.valueOf(zzkVar.zzl()));
                }
                if (zzkVar.zzbb()) {
                    zza(sb, 1, "config_version", Long.valueOf(zzkVar.zzj()));
                }
                zza(sb, 1, "gmp_app_id", zzkVar.zzaj());
                zza(sb, 1, "admob_app_id", zzkVar.zzy());
                zza(sb, 1, "app_id", zzkVar.zzz());
                zza(sb, 1, "app_version", zzkVar.zzac());
                if (zzkVar.zzay()) {
                    zza(sb, 1, "app_version_major", Integer.valueOf(zzkVar.zzb()));
                }
                zza(sb, 1, "firebase_instance_id", zzkVar.zzai());
                if (zzkVar.zzbg()) {
                    zza(sb, 1, "dev_cert_hash", Long.valueOf(zzkVar.zzk()));
                }
                zza(sb, 1, "app_store", zzkVar.zzab());
                if (zzkVar.zzbv()) {
                    zza(sb, 1, "upload_timestamp_millis", Long.valueOf(zzkVar.zzs()));
                }
                if (zzkVar.zzbs()) {
                    zza(sb, 1, "start_timestamp_millis", Long.valueOf(zzkVar.zzq()));
                }
                if (zzkVar.zzbi()) {
                    zza(sb, 1, "end_timestamp_millis", Long.valueOf(zzkVar.zzm()));
                }
                if (zzkVar.zzbn()) {
                    zza(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzkVar.zzp()));
                }
                if (zzkVar.zzbm()) {
                    zza(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzkVar.zzo()));
                }
                zza(sb, 1, "app_instance_id", zzkVar.zzaa());
                zza(sb, 1, "resettable_device_id", zzkVar.zzan());
                zza(sb, 1, "ds_id", zzkVar.zzah());
                if (zzkVar.zzbl()) {
                    zza(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzkVar.zzav()));
                }
                zza(sb, 1, "os_version", zzkVar.zzal());
                zza(sb, 1, "device_model", zzkVar.zzag());
                zza(sb, 1, "user_default_language", zzkVar.zzap());
                if (zzkVar.zzbu()) {
                    zza(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzkVar.zzh()));
                }
                if (zzkVar.zzba()) {
                    zza(sb, 1, "bundle_sequential_index", Integer.valueOf(zzkVar.zzc()));
                }
                if (zzpn.zza()) {
                    zzq();
                    if (zznp.zzf(zzkVar.zzz()) && zze().zza(zzbf.zzbs) && zzkVar.zzbf()) {
                        zza(sb, 1, "delivery_index", Integer.valueOf(zzkVar.zzd()));
                    }
                }
                if (zzkVar.zzbq()) {
                    zza(sb, 1, "service_upload", Boolean.valueOf(zzkVar.zzaw()));
                }
                zza(sb, 1, "health_monitor", zzkVar.zzak());
                if (zzkVar.zzbp()) {
                    zza(sb, 1, "retry_counter", Integer.valueOf(zzkVar.zzg()));
                }
                if (zzkVar.zzbd()) {
                    zza(sb, 1, "consent_signals", zzkVar.zzae());
                }
                if (zzkVar.zzbk()) {
                    zza(sb, 1, "is_dma_region", Boolean.valueOf(zzkVar.zzau()));
                }
                if (zzkVar.zzbe()) {
                    zza(sb, 1, "core_platform_services", zzkVar.zzaf());
                }
                if (zzkVar.zzbc()) {
                    zza(sb, 1, "consent_diagnostics", zzkVar.zzad());
                }
                if (zzkVar.zzbt()) {
                    zza(sb, 1, "target_os_version", Long.valueOf(zzkVar.zzr()));
                }
                if (zzpg.zza() && zze().zze(zzkVar.zzz(), zzbf.zzbz)) {
                    zza(sb, 1, "ad_services_version", Integer.valueOf(zzkVar.zza()));
                    if (zzkVar.zzaz() && (zzv = zzkVar.zzv()) != null) {
                        zza(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        zza(sb, 2, "eligible", Boolean.valueOf(zzv.zzf()));
                        zza(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzv.zzh()));
                        zza(sb, 2, "pre_r", Boolean.valueOf(zzv.zzi()));
                        zza(sb, 2, "r_extensions_too_old", Boolean.valueOf(zzv.zzj()));
                        zza(sb, 2, "adservices_extension_too_old", Boolean.valueOf(zzv.zze()));
                        zza(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(zzv.zzd()));
                        zza(sb, 2, "measurement_manager_disabled", Boolean.valueOf(zzv.zzg()));
                        zza(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (zzoj.zza() && zze().zza(zzbf.zzcm) && zzkVar.zzax()) {
                    zza(sb, 1, "ad_campaign_info", zzkVar.zzu());
                }
                List<zzfn.zzo> zzas = zzkVar.zzas();
                if (zzas != null) {
                    for (zzfn.zzo zzoVar : zzas) {
                        if (zzoVar != null) {
                            zza(sb, 2);
                            sb.append("user_property {\n");
                            zza(sb, 2, "set_timestamp_millis", zzoVar.zzl() ? Long.valueOf(zzoVar.zzd()) : null);
                            zza(sb, 2, "name", zzi().zzc(zzoVar.zzg()));
                            zza(sb, 2, "string_value", zzoVar.zzh());
                            zza(sb, 2, "int_value", zzoVar.zzk() ? Long.valueOf(zzoVar.zzc()) : null);
                            zza(sb, 2, "double_value", zzoVar.zzi() ? Double.valueOf(zzoVar.zza()) : null);
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfn.zzd> zzaq = zzkVar.zzaq();
                zzkVar.zzz();
                if (zzaq != null) {
                    for (zzfn.zzd zzdVar : zzaq) {
                        if (zzdVar != null) {
                            zza(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzdVar.zzg()) {
                                zza(sb, 2, "audience_id", Integer.valueOf(zzdVar.zza()));
                            }
                            if (zzdVar.zzh()) {
                                zza(sb, 2, "new_audience", Boolean.valueOf(zzdVar.zzf()));
                            }
                            zza(sb, 2, "current_data", zzdVar.zzd());
                            if (zzdVar.zzi()) {
                                zza(sb, 2, "previous_data", zzdVar.zze());
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfn.zzf> zzar = zzkVar.zzar();
                if (zzar != null) {
                    for (zzfn.zzf zzfVar : zzar) {
                        if (zzfVar != null) {
                            zza(sb, 2);
                            sb.append("event {\n");
                            zza(sb, 2, "name", zzi().zza(zzfVar.zzg()));
                            if (zzfVar.zzk()) {
                                zza(sb, 2, "timestamp_millis", Long.valueOf(zzfVar.zzd()));
                            }
                            if (zzfVar.zzj()) {
                                zza(sb, 2, "previous_timestamp_millis", Long.valueOf(zzfVar.zzc()));
                            }
                            if (zzfVar.zzi()) {
                                zza(sb, 2, "count", Integer.valueOf(zzfVar.zza()));
                            }
                            if (zzfVar.zzb() != 0) {
                                zza(sb, 2, zzfVar.zzh());
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zza(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final String zza(zzff.zzb zzbVar) {
        if (zzbVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzbVar.zzl()) {
            zza(sb, 0, "filter_id", Integer.valueOf(zzbVar.zzb()));
        }
        zza(sb, 0, "event_name", zzi().zza(zzbVar.zzf()));
        String zza = zza(zzbVar.zzh(), zzbVar.zzi(), zzbVar.zzj());
        if (!zza.isEmpty()) {
            zza(sb, 0, "filter_type", zza);
        }
        if (zzbVar.zzk()) {
            zza(sb, 1, "event_count_filter", zzbVar.zze());
        }
        if (zzbVar.zza() > 0) {
            sb.append("  filters {\n");
            Iterator<zzff.zzc> it = zzbVar.zzg().iterator();
            while (it.hasNext()) {
                zza(sb, 2, it.next());
            }
        }
        zza(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    private static String zza(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    final String zza(zzff.zze zzeVar) {
        if (zzeVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzeVar.zzi()) {
            zza(sb, 0, "filter_id", Integer.valueOf(zzeVar.zza()));
        }
        zza(sb, 0, "property_name", zzi().zzc(zzeVar.zze()));
        String zza = zza(zzeVar.zzf(), zzeVar.zzg(), zzeVar.zzh());
        if (!zza.isEmpty()) {
            zza(sb, 0, "filter_type", zza);
        }
        zza(sb, 1, zzeVar.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    final List<Long> zza(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().zzu().zza("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().zzu().zza("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    final List<Integer> zzu() {
        Map<String, String> zza = zzbf.zza(this.zzf.zza());
        if (zza == null || zza.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = zzbf.zzap.zza(null).intValue();
        for (Map.Entry<String, String> entry : zza.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().zzu().zza("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    zzj().zzu().zza("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    static List<Long> zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(zza((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r5.add(zza((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r5.add(zza((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Map<String, Object> zza(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (!z2 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    zznl(zznc zzncVar) {
        super(zzncVar);
    }

    static void zza(zzfn.zzf.zza zzaVar, String str, Object obj) {
        List<zzfn.zzh> zzf = zzaVar.zzf();
        int i = 0;
        while (true) {
            if (i >= zzf.size()) {
                i = -1;
                break;
            } else if (str.equals(zzf.get(i).zzg())) {
                break;
            } else {
                i++;
            }
        }
        zzfn.zzh.zza zza = zzfn.zzh.zze().zza(str);
        if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            zzaVar.zza(i, zza);
        } else {
            zzaVar.zza(zza);
        }
    }

    private static void zza(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                zza(builder, str3, string, set);
            }
        }
    }

    private static void zza(StringBuilder sb, int i, String str, zzfn.zzm zzmVar) {
        if (zzmVar == null) {
            return;
        }
        zza(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzmVar.zzb() != 0) {
            zza(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : zzmVar.zzi()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zzmVar.zzd() != 0) {
            zza(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : zzmVar.zzk()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zzmVar.zza() != 0) {
            zza(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (zzfn.zze zzeVar : zzmVar.zzh()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(zzeVar.zzf() ? Integer.valueOf(zzeVar.zza()) : null).append(":").append(zzeVar.zze() ? Long.valueOf(zzeVar.zzb()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zzmVar.zzc() != 0) {
            zza(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (zzfn.zzn zznVar : zzmVar.zzj()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(zznVar.zzf() ? Integer.valueOf(zznVar.zzb()) : null).append(": [");
                Iterator<Long> it = zznVar.zze().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        zza(sb, 3);
        sb.append("}\n");
    }

    private final void zza(StringBuilder sb, int i, List<zzfn.zzh> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (zzfn.zzh zzhVar : list) {
            if (zzhVar != null) {
                zza(sb, i2);
                sb.append("param {\n");
                zza(sb, i2, "name", zzhVar.zzm() ? zzi().zzb(zzhVar.zzg()) : null);
                zza(sb, i2, "string_value", zzhVar.zzn() ? zzhVar.zzh() : null);
                zza(sb, i2, "int_value", zzhVar.zzl() ? Long.valueOf(zzhVar.zzd()) : null);
                zza(sb, i2, "double_value", zzhVar.zzj() ? Double.valueOf(zzhVar.zza()) : null);
                if (zzhVar.zzc() > 0) {
                    zza(sb, i2, zzhVar.zzi());
                }
                zza(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private final void zza(StringBuilder sb, int i, zzff.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        zza(sb, i);
        sb.append("filter {\n");
        if (zzcVar.zzg()) {
            zza(sb, i, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            zza(sb, i, "param_name", zzi().zzb(zzcVar.zze()));
        }
        if (zzcVar.zzj()) {
            int i2 = i + 1;
            zzff.zzf zzd = zzcVar.zzd();
            if (zzd != null) {
                zza(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (zzd.zzj()) {
                    zza(sb, i2, "match_type", zzd.zzb().name());
                }
                if (zzd.zzi()) {
                    zza(sb, i2, "expression", zzd.zze());
                }
                if (zzd.zzh()) {
                    zza(sb, i2, "case_sensitive", Boolean.valueOf(zzd.zzg()));
                }
                if (zzd.zza() > 0) {
                    zza(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str : zzd.zzf()) {
                        zza(sb, i + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zza(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzcVar.zzh()) {
            zza(sb, i + 1, "number_filter", zzcVar.zzc());
        }
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void zza(StringBuilder sb, int i, String str, zzff.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        zza(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzdVar.zzh()) {
            zza(sb, i, "comparison_type", zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            zza(sb, i, "match_as_float", Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            zza(sb, i, "comparison_value", zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            zza(sb, i, "min_comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            zza(sb, i, "max_comparison_value", zzdVar.zze());
        }
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    final void zza(zzfn.zzk.zza zzaVar) {
        zzj().zzp().zza("Checking account type status for ad personalization signals");
        if (zzc(zzaVar.zzt())) {
            zzj().zzc().zza("Turning off ad personalization due to account type");
            zzfn.zzo zzoVar = (zzfn.zzo) ((com.google.android.gms.internal.measurement.zzjk) zzfn.zzo.zze().zza("_npa").zzb(zzf().zzc()).zza(1L).zzai());
            int i = 0;
            while (true) {
                if (i < zzaVar.zzd()) {
                    if ("_npa".equals(zzaVar.zzk(i).zzg())) {
                        zzaVar.zza(i, zzoVar);
                        break;
                    }
                    i++;
                } else {
                    zzaVar.zza(zzoVar);
                    break;
                }
            }
            zzah zza = zzah.zza(zzaVar.zzv());
            zza.zza(zzin.zza.AD_PERSONALIZATION, zzak.CHILD_ACCOUNT);
            zzaVar.zzf(zza.toString());
        }
    }

    final void zza(zzfn.zzh.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfn.zzh.zza zze = zzfn.zzh.zze();
                    for (String str : bundle.keySet()) {
                        zzfn.zzh.zza zza = zzfn.zzh.zze().zza(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zza.zza(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zza.zzb((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zza.zza(((Double) obj2).doubleValue());
                        }
                        zze.zza(zza);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzfn.zzh) ((com.google.android.gms.internal.measurement.zzjk) zze.zzai()));
                    }
                }
            }
            zzaVar.zza(arrayList);
            return;
        }
        zzj().zzg().zza("Ignoring invalid (type) event param value", obj);
    }

    final void zza(zzfn.zzo.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zzc().zzb().zza();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            zzj().zzg().zza("Ignoring invalid (type) user attribute value", obj);
        }
    }

    static boolean zza(zzbd zzbdVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbdVar);
        Preconditions.checkNotNull(zzoVar);
        return (TextUtils.isEmpty(zzoVar.zzb) && TextUtils.isEmpty(zzoVar.zzp)) ? false : true;
    }

    static boolean zza(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    final boolean zza(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzb().currentTimeMillis() - j) > j2;
    }

    static boolean zzb(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    final boolean zzc(String str) {
        if (com.google.android.gms.internal.measurement.zznq.zza() && zze().zza(zzbf.zzco)) {
            return false;
        }
        Preconditions.checkNotNull(str);
        zzg zze = zzh().zze(str);
        return zze != null && zzf().zzn() && zze.zzaq() && zzm().zzk(str);
    }

    final byte[] zzb(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzj().zzg().zza("Failed to gzip content", e);
            throw e;
        }
    }

    final byte[] zzc(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            this.zzj().zzg().zza("Failed to ungzip content", e);
            throw e;
        }
    }
}
