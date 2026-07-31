package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzin;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
final class zzgh extends zzii {
    static final Pair<String, Long> zza = new Pair<>("", 0L);
    private long zzaa;
    public zzgl zzb;
    public final zzgm zzc;
    public final zzgm zzd;
    public final zzgn zze;
    public final zzgm zzf;
    public final zzgk zzg;
    public final zzgn zzh;
    public final zzgj zzi;
    public final zzgk zzj;
    public final zzgm zzk;
    public final zzgm zzl;
    public boolean zzm;
    public zzgk zzn;
    public zzgk zzo;
    public zzgm zzp;
    public final zzgn zzq;
    public final zzgn zzr;
    public final zzgm zzs;
    public final zzgj zzt;
    private SharedPreferences zzv;
    private Object zzw;
    private SharedPreferences zzx;
    private String zzy;
    private boolean zzz;

    protected final SharedPreferences zzc() {
        zzt();
        zzac();
        if (this.zzx == null) {
            synchronized (this.zzw) {
                if (this.zzx == null) {
                    String str = zza().getPackageName() + "_preferences";
                    zzj().zzp().zza("Default prefs file", str);
                    this.zzx = zza().getSharedPreferences(str, 0);
                }
            }
        }
        return this.zzx;
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    protected final boolean zzo() {
        return true;
    }

    protected final SharedPreferences zzg() {
        zzt();
        zzac();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    final Pair<String, Boolean> zza(String str) {
        zzt();
        if (!zzn().zza(zzin.zza.AD_STORAGE)) {
            return new Pair<>("", false);
        }
        long elapsedRealtime = zzb().elapsedRealtime();
        if (this.zzy != null && elapsedRealtime < this.zzaa) {
            return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
        }
        this.zzaa = elapsedRealtime + zze().zzd(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.zzy = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.zzy = id;
            }
            this.zzz = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            zzj().zzc().zza("Unable to get advertising id", e);
            this.zzy = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
    }

    final SparseArray<Long> zzh() {
        Bundle zza2 = this.zzi.zza();
        if (zza2 == null) {
            return new SparseArray<>();
        }
        int[] intArray = zza2.getIntArray("uriSources");
        long[] longArray = zza2.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().zzg().zza("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    final zzav zzm() {
        zzt();
        return zzav.zza(zzg().getString("dma_consent_settings", null));
    }

    final zzin zzn() {
        zzt();
        return zzin.zza(zzg().getString("consent_settings", "G1"), zzg().getInt("consent_source", 100));
    }

    final Boolean zzp() {
        zzt();
        if (zzg().contains("use_service")) {
            return Boolean.valueOf(zzg().getBoolean("use_service", false));
        }
        return null;
    }

    final Boolean zzu() {
        zzt();
        if (zzg().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    final Boolean zzv() {
        zzt();
        if (zzg().contains("measurement_enabled")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final String zzw() {
        zzt();
        String string = zzg().getString("previous_os_version", null);
        zzf().zzac();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = zzg().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    final String zzx() {
        zzt();
        return zzg().getString("admob_app_id", null);
    }

    final String zzy() {
        zzt();
        return zzg().getString("gmp_app_id", null);
    }

    zzgh(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzw = new Object();
        this.zzf = new zzgm(this, "session_timeout", 1800000L);
        this.zzg = new zzgk(this, "start_new_session", true);
        this.zzk = new zzgm(this, "last_pause_time", 0L);
        this.zzl = new zzgm(this, "session_id", 0L);
        this.zzh = new zzgn(this, "non_personalized_ads", null);
        this.zzi = new zzgj(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzgk(this, "allow_remote_dynamite", false);
        this.zzc = new zzgm(this, "first_open_time", 0L);
        this.zzd = new zzgm(this, "app_install_time", 0L);
        this.zze = new zzgn(this, "app_instance_id", null);
        this.zzn = new zzgk(this, "app_backgrounded", false);
        this.zzo = new zzgk(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzgm(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzgn(this, "firebase_feature_rollouts", null);
        this.zzr = new zzgn(this, "deferred_attribution_cache", null);
        this.zzs = new zzgm(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzgj(this, "default_event_parameters", null);
    }

    final void zzz() {
        zzt();
        Boolean zzv = zzv();
        SharedPreferences.Editor edit = zzg().edit();
        edit.clear();
        edit.apply();
        if (zzv != null) {
            zza(zzv);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    protected final void zzaa() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z;
        if (!z) {
            SharedPreferences.Editor edit = this.zzv.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzb = new zzgl(this, "health_monitor", Math.max(0L, zzbf.zzc.zza(null).longValue()));
    }

    final void zzb(String str) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    final void zzc(String str) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    final void zza(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    final void zzb(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    final void zza(boolean z) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    final void zzb(boolean z) {
        zzt();
        zzj().zzp().zza("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    final void zza(SparseArray<Long> sparseArray) {
        if (sparseArray == null) {
            this.zzi.zza(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            iArr[i] = sparseArray.keyAt(i);
            jArr[i] = sparseArray.valueAt(i).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.zzi.zza(bundle);
    }

    final boolean zzab() {
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean zza(long j) {
        return j - this.zzf.zza() > this.zzk.zza();
    }

    final boolean zza(zzav zzavVar) {
        zzt();
        if (!zzin.zza(zzavVar.zza(), zzm().zza())) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("dma_consent_settings", zzavVar.zzf());
        edit.apply();
        return true;
    }

    final boolean zza(zzin zzinVar) {
        zzt();
        int zza2 = zzinVar.zza();
        if (!zza(zza2)) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("consent_settings", zzinVar.zzh());
        edit.putInt("consent_source", zza2);
        edit.apply();
        return true;
    }

    final boolean zza(int i) {
        return zzin.zza(i, zzg().getInt("consent_source", 100));
    }

    protected final boolean zza(zzms zzmsVar) {
        zzt();
        String string = zzg().getString("stored_tcf_param", "");
        String zzc = zzmsVar.zzc();
        if (zzc.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("stored_tcf_param", zzc);
        edit.apply();
        return true;
    }
}
