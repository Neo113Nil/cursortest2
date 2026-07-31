package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzou;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.firebase.messaging.ServiceStarter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
public final class zzbf {
    public static final zzfj<Long> zza;
    public static final zzfj<Long> zzaa;
    public static final zzfj<Long> zzab;
    public static final zzfj<Integer> zzac;
    public static final zzfj<Long> zzad;
    public static final zzfj<Integer> zzae;
    public static final zzfj<Integer> zzaf;
    public static final zzfj<Integer> zzag;
    public static final zzfj<Integer> zzah;
    public static final zzfj<Integer> zzai;
    public static final zzfj<Long> zzaj;
    public static final zzfj<Boolean> zzak;
    public static final zzfj<String> zzal;
    public static final zzfj<Long> zzam;
    public static final zzfj<Integer> zzan;
    public static final zzfj<Double> zzao;
    public static final zzfj<Integer> zzap;
    public static final zzfj<Integer> zzaq;
    public static final zzfj<Integer> zzar;
    public static final zzfj<Integer> zzas;
    public static final zzfj<Long> zzat;
    public static final zzfj<Long> zzau;
    public static final zzfj<Integer> zzav;
    public static final zzfj<Integer> zzaw;
    public static final zzfj<String> zzax;
    public static final zzfj<String> zzay;
    public static final zzfj<String> zzaz;
    public static final zzfj<Long> zzb;
    public static final zzfj<Long> zzba;
    public static final zzfj<String> zzbb;
    public static final zzfj<String> zzbc;
    public static final zzfj<String> zzbd;
    public static final zzfj<String> zzbe;
    public static final zzfj<Long> zzbf;
    public static final zzfj<Boolean> zzbg;
    public static final zzfj<Boolean> zzbh;
    public static final zzfj<Boolean> zzbi;
    public static final zzfj<Boolean> zzbj;
    public static final zzfj<Boolean> zzbk;
    public static final zzfj<Boolean> zzbl;
    public static final zzfj<Boolean> zzbm;
    public static final zzfj<Boolean> zzbn;
    public static final zzfj<Integer> zzbo;
    public static final zzfj<Boolean> zzbp;
    public static final zzfj<Boolean> zzbq;
    public static final zzfj<Boolean> zzbr;
    public static final zzfj<Boolean> zzbs;
    public static final zzfj<Boolean> zzbt;
    public static final zzfj<String> zzbu;
    public static final zzfj<Boolean> zzbv;
    public static final zzfj<Boolean> zzbw;
    public static final zzfj<Boolean> zzbx;
    public static final zzfj<Boolean> zzby;
    public static final zzfj<Boolean> zzbz;
    public static final zzfj<Long> zzc;
    public static final zzfj<Boolean> zzca;
    public static final zzfj<Boolean> zzcb;
    public static final zzfj<Boolean> zzcc;
    public static final zzfj<Boolean> zzcd;
    public static final zzfj<Boolean> zzce;
    public static final zzfj<Boolean> zzcf;
    public static final zzfj<Boolean> zzcg;
    public static final zzfj<Boolean> zzch;
    public static final zzfj<Boolean> zzci;
    public static final zzfj<Boolean> zzcj;
    public static final zzfj<Boolean> zzck;
    public static final zzfj<Boolean> zzcl;
    public static final zzfj<Boolean> zzcm;
    public static final zzfj<Boolean> zzcn;
    public static final zzfj<Boolean> zzco;
    public static final zzfj<Boolean> zzcp;
    public static final zzfj<Boolean> zzcq;
    public static final zzfj<Boolean> zzcr;
    public static final zzfj<Boolean> zzcs;
    public static final zzfj<Boolean> zzct;
    public static final zzfj<Boolean> zzcu;
    public static final zzfj<Boolean> zzcv;
    public static final zzfj<Boolean> zzcw;
    public static final zzfj<Boolean> zzcx;
    public static final zzfj<Boolean> zzcy;
    private static final List<zzfj<?>> zzcz = Collections.synchronizedList(new ArrayList());
    public static final zzfj<Long> zzd;
    public static final zzfj<String> zze;
    public static final zzfj<String> zzf;
    public static final zzfj<Integer> zzg;
    public static final zzfj<Integer> zzh;
    public static final zzfj<Integer> zzi;
    public static final zzfj<Integer> zzj;
    public static final zzfj<Integer> zzk;
    public static final zzfj<Integer> zzl;
    public static final zzfj<Integer> zzm;
    public static final zzfj<Integer> zzn;
    public static final zzfj<Integer> zzo;
    public static final zzfj<Integer> zzp;
    public static final zzfj<String> zzq;
    public static final zzfj<Long> zzr;
    public static final zzfj<Long> zzs;
    public static final zzfj<Long> zzt;
    public static final zzfj<Long> zzu;
    public static final zzfj<Long> zzv;
    public static final zzfj<Long> zzw;
    public static final zzfj<Long> zzx;
    public static final zzfj<Long> zzy;
    public static final zzfj<Long> zzz;

    private static <V> zzfj<V> zza(String str, V v, zzfh<V> zzfhVar) {
        return zza(str, v, v, zzfhVar, true);
    }

    private static <V> zzfj<V> zza(String str, V v, V v2, zzfh<V> zzfhVar, boolean z) {
        zzfj<V> zzfjVar = new zzfj<>(str, v, v2, zzfhVar, z);
        if (z) {
            zzcz.add(zzfjVar);
        }
        return zzfjVar;
    }

    private static <V> zzfj<V> zza(String str, V v) {
        return zza(str, v, v, null, false);
    }

    private static <V> zzfj<V> zzb(String str, V v, zzfh<V> zzfhVar) {
        return zza(str, v, v, zzfhVar, false);
    }

    static /* synthetic */ Long zzcc() {
        zzab zzabVar = zzfk.zza;
        return Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzd());
    }

    public static Map<String, String> zza(Context context) {
        com.google.android.gms.internal.measurement.zzgk zza2 = com.google.android.gms.internal.measurement.zzgk.zza(context.getContentResolver(), com.google.android.gms.internal.measurement.zzgw.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.measurement.zzgz.zzc();
            }
        });
        return zza2 == null ? Collections.emptyMap() : zza2.zza();
    }

    static {
        Collections.synchronizedSet(new HashSet());
        Long valueOf = Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS);
        zza = zzb("measurement.ad_id_cache_time", valueOf, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbh
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf2;
                valueOf2 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zza());
                return valueOf2;
            }
        });
        Long valueOf2 = Long.valueOf(DurationKt.MILLIS_IN_HOUR);
        zzb = zzb("measurement.app_uninstalled_additional_ad_id_cache_time", valueOf2, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf3;
                valueOf3 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzb());
                return valueOf3;
            }
        });
        zzc = zzb("measurement.monitoring.sample_period_millis", 86400000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf3;
                valueOf3 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzq());
                return valueOf3;
            }
        });
        zzd = zza("measurement.config.cache_time", 86400000L, valueOf2, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                return zzbf.zzcc();
            }
        }, false);
        zze = zzb("measurement.config.url_scheme", "https", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzap2;
                zzap2 = com.google.android.gms.internal.measurement.zzmz.zzap();
                return zzap2;
            }
        });
        zzf = zzb("measurement.config.url_authority", "app-measurement.com", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzds
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzao2;
                zzao2 = com.google.android.gms.internal.measurement.zzmz.zzao();
                return zzao2;
            }
        });
        zzg = zzb("measurement.upload.max_bundles", 100, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzee
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf3;
                valueOf3 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzac());
                return valueOf3;
            }
        });
        zzh = zzb("measurement.upload.max_batch_size", 65536, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzeq
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf3;
                valueOf3 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzak());
                return valueOf3;
            }
        });
        zzi = zzb("measurement.upload.max_bundle_size", 65536, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzfc
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf3;
                valueOf3 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzab());
                return valueOf3;
            }
        });
        zzj = zzb("measurement.upload.max_events_per_bundle", 1000, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbn
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf3;
                valueOf3 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzaf());
                return valueOf3;
            }
        });
        Integer valueOf3 = Integer.valueOf(AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        zzk = zzb("measurement.upload.max_events_per_day", valueOf3, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzag());
                return valueOf4;
            }
        });
        zzl = zzb("measurement.upload.max_error_events_per_day", 1000, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzec
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzae());
                return valueOf4;
            }
        });
        zzm = zzb("measurement.upload.max_public_events_per_day", 50000, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzel
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzah());
                return valueOf4;
            }
        });
        zzn = zzb("measurement.upload.max_conversions_per_day", 10000, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzey
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzad());
                return valueOf4;
            }
        });
        zzo = zzb("measurement.upload.max_realtime_events_per_day", 10, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzaj());
                return valueOf4;
            }
        });
        zzp = zzb("measurement.store.max_stored_events_per_app", valueOf3, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzj());
                return valueOf4;
            }
        });
        zzq = zzb("measurement.upload.url", "https://app-measurement.com/a", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzay2;
                zzay2 = com.google.android.gms.internal.measurement.zzmz.zzay();
                return zzay2;
            }
        });
        zzb("measurement.sgtm.google_signal.url", "https://app-measurement.com/s", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzar2;
                zzar2 = com.google.android.gms.internal.measurement.zzmz.zzar();
                return zzar2;
            }
        });
        zzr = zzb("measurement.upload.backoff_period", 43200000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzy());
                return valueOf4;
            }
        });
        zzs = zzb("measurement.upload.window_interval", valueOf2, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzan());
                return valueOf4;
            }
        });
        zzt = zzb("measurement.upload.interval", valueOf2, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzaa());
                return valueOf4;
            }
        });
        zzu = zzb("measurement.upload.realtime_upload_interval", valueOf, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzr());
                return valueOf4;
            }
        });
        zzv = zzb("measurement.upload.debug_upload_interval", 1000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zze());
                return valueOf4;
            }
        });
        zzw = zzb("measurement.upload.minimum_delay", 500L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzp());
                return valueOf4;
            }
        });
        zzx = zzb("measurement.alarm_manager.minimum_interval", Long.valueOf(DurationKt.MILLIS_IN_MINUTE), new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbz
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzo());
                return valueOf4;
            }
        });
        zzy = zzb("measurement.upload.stale_data_deletion_interval", 86400000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzu());
                return valueOf4;
            }
        });
        zzz = zzb("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzs());
                return valueOf4;
            }
        });
        zzaa = zzb("measurement.upload.initial_upload_delay_time", 15000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzz());
                return valueOf4;
            }
        });
        zzab = zzb("measurement.upload.retry_time", 1800000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzam());
                return valueOf4;
            }
        });
        zzac = zzb("measurement.upload.retry_count", 6, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzal());
                return valueOf4;
            }
        });
        zzad = zzb("measurement.upload.max_queue_time", 2419200000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzai());
                return valueOf4;
            }
        });
        zzae = zzb("measurement.lifetimevalue.max_currency_tracked", 4, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzg());
                return valueOf4;
            }
        });
        zzaf = zzb("measurement.audience.filter_result_max_count", 200, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzl());
                return valueOf4;
            }
        });
        zzag = zza("measurement.upload.max_public_user_properties", 25);
        zzah = zza("measurement.upload.max_event_name_cardinality", Integer.valueOf(ServiceStarter.ERROR_UNKNOWN));
        zzai = zza("measurement.upload.max_public_event_params", 25);
        zzaj = zzb("measurement.service_client.idle_disconnect_millis", Long.valueOf(CoroutineLiveDataKt.DEFAULT_TIMEOUT), new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzt());
                return valueOf4;
            }
        });
        zzak = zzb("measurement.test.boolean_flag", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpa.zzf());
                return valueOf4;
            }
        });
        zzal = zzb("measurement.test.string_flag", "---", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zze2;
                zze2 = zzpa.zze();
                return zze2;
            }
        });
        zzam = zzb("measurement.test.long_flag", -1L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(zzpa.zzd());
                return valueOf4;
            }
        });
        zza("measurement.test.cached_long_flag", -1L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(zzpa.zzb());
                return valueOf4;
            }
        });
        zzan = zzb("measurement.test.int_flag", -2, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) zzpa.zzc());
                return valueOf4;
            }
        });
        zzao = zzb("measurement.test.double_flag", Double.valueOf(-3.0d), new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Double valueOf4;
                valueOf4 = Double.valueOf(zzpa.zza());
                return valueOf4;
            }
        });
        zzap = zzb("measurement.experiment.max_ids", 50, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzk());
                return valueOf4;
            }
        });
        zzaq = zzb("measurement.upload.max_item_scoped_custom_parameters", 27, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzm());
                return valueOf4;
            }
        });
        zzar = zza("measurement.upload.max_event_parameter_value_length", 100, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzi());
                return valueOf4;
            }
        });
        zzas = zzb("measurement.max_bundles_per_iteration", 100, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzc());
                return valueOf4;
            }
        });
        zzat = zzb("measurement.sdk.attribution.cache.ttl", 604800000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzw());
                return valueOf4;
            }
        });
        zzau = zzb("measurement.redaction.app_instance_id.ttl", 7200000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzx());
                return valueOf4;
            }
        });
        zzav = zzb("measurement.rb.attribution.client.min_ad_services_version", 7, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzn());
                return valueOf4;
            }
        });
        zzaw = zzb("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzmz.zzh());
                return valueOf4;
            }
        });
        zzax = zzb("measurement.rb.attribution.uri_scheme", "https", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzax2;
                zzax2 = com.google.android.gms.internal.measurement.zzmz.zzax();
                return zzax2;
            }
        });
        zzay = zzb("measurement.rb.attribution.uri_authority", "google-analytics.com", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzau2;
                zzau2 = com.google.android.gms.internal.measurement.zzmz.zzau();
                return zzau2;
            }
        });
        zzaz = zzb("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzav2;
                zzav2 = com.google.android.gms.internal.measurement.zzmz.zzav();
                return zzav2;
            }
        });
        zzba = zzb("measurement.session.engagement_interval", valueOf2, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzf());
                return valueOf4;
            }
        });
        zzbb = zzb("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzas2;
                zzas2 = com.google.android.gms.internal.measurement.zzmz.zzas();
                return zzas2;
            }
        });
        zzbc = zzb("measurement.rb.attribution.user_properties", "_npa,npa", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzaz2;
                zzaz2 = com.google.android.gms.internal.measurement.zzmz.zzaz();
                return zzaz2;
            }
        });
        zzbd = zzb("measurement.rb.attribution.event_params", "value|currency", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzaq2;
                zzaq2 = com.google.android.gms.internal.measurement.zzmz.zzaq();
                return zzaq2;
            }
        });
        zzbe = zzb("measurement.rb.attribution.query_parameters_to_remove", "", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzaw2;
                zzaw2 = com.google.android.gms.internal.measurement.zzmz.zzaw();
                return zzaw2;
            }
        });
        zzbf = zzb("measurement.rb.attribution.max_queue_time", 1209600000L, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzmz.zzv());
                return valueOf4;
            }
        });
        zzbg = zzb("measurement.collection.log_event_and_bundle_v2", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpb.zza());
                return valueOf4;
            }
        });
        zzbh = zza("measurement.quality.checksum", false);
        zzbi = zzb("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzoc.zzc());
                return valueOf4;
            }
        });
        zzbj = zzb("measurement.audience.refresh_event_count_filters_timestamp", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzoc.zzb());
                return valueOf4;
            }
        });
        zzbk = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdr
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzoc.zzd());
                return valueOf4;
            }
        });
        zzbl = zzb("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdu
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzov.zza());
                return valueOf4;
            }
        });
        zzbm = zzb("measurement.integration.disable_firebase_instance_id", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdt
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzps.zzb());
                return valueOf4;
            }
        });
        zzbn = zzb("measurement.collection.service.update_with_analytics_fix", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdw
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpt.zza());
                return valueOf4;
            }
        });
        zzbo = zzb("measurement.service.storage_consent_support_version", 203600, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdv
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zznf.zza());
                return valueOf4;
            }
        });
        zzbp = zzb("measurement.service.store_null_safelist", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdy
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zznw.zzb());
                return valueOf4;
            }
        });
        zzbq = zzb("measurement.service.store_safelist", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdx
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zznw.zzc());
                return valueOf4;
            }
        });
        zzbr = zzb("measurement.session_stitching_token_enabled", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzea
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzph.zzb());
                return valueOf4;
            }
        });
        zzbs = zza("measurement.sgtm.service", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdz
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzd());
                return valueOf4;
            }
        });
        zzbt = zza("measurement.sgtm.preview_mode_enabled", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzeb
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzc());
                return valueOf4;
            }
        });
        zzbu = zza("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda", new zzfh() { // from class: com.google.android.gms.measurement.internal.zzed
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                String zzat2;
                zzat2 = com.google.android.gms.internal.measurement.zzmz.zzat();
                return zzat2;
            }
        });
        zzb("measurement.sgtm.upload_queue", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzeg
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zze());
                return valueOf4;
            }
        });
        zzb("measurement.sgtm.google_signal.enable", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzef
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzb());
                return valueOf4;
            }
        });
        zzbv = zzb("measurement.gmscore_feature_tracking", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzei
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzoo.zzb());
                return valueOf4;
            }
        });
        zzbw = zza("measurement.fix_health_monitor_stack_trace", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzeh
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzoi.zzb());
                return valueOf4;
            }
        });
        zzbx = zza("measurement.item_scoped_custom_parameters.client", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzek
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzou.zzb());
                return valueOf4;
            }
        });
        zzby = zzb("measurement.item_scoped_custom_parameters.service", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzej
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzou.zzc());
                return valueOf4;
            }
        });
        zzbz = zza("measurement.rb.attribution.service", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzem
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpg.zzf());
                return valueOf4;
            }
        });
        zzca = zza("measurement.rb.attribution.client2", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzeo
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpg.zzc());
                return valueOf4;
            }
        });
        zzcb = zzb("measurement.rb.attribution.uuid_generation", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzen
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpg.zzh());
                return valueOf4;
            }
        });
        zzcc = zzb("measurement.rb.attribution.enable_trigger_redaction", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzep
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpg.zzg());
                return valueOf4;
            }
        });
        zzb("measurement.rb.attribution.followup1.service", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzes
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpg.zzd());
                return valueOf4;
            }
        });
        zzcd = zzb("measurement.rb.attribution.registration_regardless_consent", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzer
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpg.zze());
                return valueOf4;
            }
        });
        zzce = zzb("measurement.rb.attribution.ad_campaign_info", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzeu
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpg.zzb());
                return valueOf4;
            }
        });
        zzcf = zza("measurement.rb.attribution.improved_retry", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzet
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpg.zzi());
                return valueOf4;
            }
        });
        zzcg = zzb("measurement.client.sessions.enable_fix_background_engagement", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzew
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                return Boolean.valueOf(zzpm.zza());
            }
        });
        zzch = zzb("measurement.client.sessions.enable_pause_engagement_in_background", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzev
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                return Boolean.valueOf(zzpm.zzb());
            }
        });
        zzci = zzb("measurement.dma_consent.service_dcu_event2", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzex
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznr.zzb());
                return valueOf4;
            }
        });
        zzcj = zzb("measurement.dma_consent.services_database_update_fix", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzfa
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznr.zza());
                return valueOf4;
            }
        });
        zzck = zza("measurement.service.deferred_first_open", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzez
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznl.zzb());
                return valueOf4;
            }
        });
        zzcl = zza("measurement.gbraid_campaign.gbraid.client.dev", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzfb
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzoj.zzb());
                return valueOf4;
            }
        });
        zzcm = zza("measurement.gbraid_campaign.gbraid.service", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzfe
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzoj.zzc());
                return valueOf4;
            }
        });
        zzcn = zza("measurement.increase_param_lengths", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzfd
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzop.zzb());
                return valueOf4;
            }
        });
        zzco = zzb("measurement.disable_npa_for_dasher_and_unicorn", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzfg
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznq.zzb());
                return valueOf4;
            }
        });
        zzcp = zza("measurement.consent_regional_defaults.service", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzff
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzne.zzc());
                return valueOf4;
            }
        });
        zzcq = zza("measurement.consent_regional_defaults.client2", false, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzfi
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzne.zzb());
                return valueOf4;
            }
        });
        zzcr = zzb("measurement.service.consent.pfo_on_fx", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbj
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zznx.zzc());
                return valueOf4;
            }
        });
        zzcs = zzb("measurement.service.consent.params_on_fx", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zznx.zzb());
                return valueOf4;
            }
        });
        zzct = zzb("measurement.service.consent.app_start_fix", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbl
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zznx.zza());
                return valueOf4;
            }
        });
        zzcu = zza("measurement.consent.stop_reset_on_storage_denied.client", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznk.zzb());
                return valueOf4;
            }
        });
        zzcv = zza("measurement.consent.stop_reset_on_storage_denied.service", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzbx
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznk.zzc());
                return valueOf4;
            }
        });
        zzcw = zzb("measurement.consent.scrub_audience_data_analytics_consent", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznk.zzd());
                return valueOf4;
            }
        });
        zzcx = zzb("measurement.consent.fix_first_open_count_from_snapshot", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznk.zze());
                return valueOf4;
            }
        });
        zzcy = zzb("measurement.fix_engagement_on_reset_analytics_data", true, new zzfh() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzfh
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzod.zza());
                return valueOf4;
            }
        });
    }
}
