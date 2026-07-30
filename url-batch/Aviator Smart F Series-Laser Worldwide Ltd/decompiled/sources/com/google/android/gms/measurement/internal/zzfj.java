package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.baidu.ar.statistic.StatisticConstants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
final class zzfj extends zzgy {
    static final Pair zza = new Pair("", 0L);
    public zzfh zzb;
    public final zzff zzc;
    public final zzff zzd;
    public final zzfi zze;
    public final zzff zzf;
    public final zzfd zzg;
    public final zzfi zzh;
    public final zzfd zzi;
    public final zzff zzj;
    public final zzff zzk;
    public boolean zzl;
    public final zzfd zzm;
    public final zzfd zzn;
    public final zzff zzo;
    public final zzfi zzp;
    public final zzfi zzq;
    public final zzff zzr;
    public final zzfe zzs;
    private SharedPreferences zzu;
    private String zzv;
    private boolean zzw;
    private long zzx;

    zzfj(zzge zzgeVar) {
        super(zzgeVar);
        this.zzf = new zzff(this, "session_timeout", 1800000L);
        this.zzg = new zzfd(this, "start_new_session", true);
        this.zzj = new zzff(this, "last_pause_time", 0L);
        this.zzk = new zzff(this, StatisticConstants.VPS_SESSION_ID, 0L);
        this.zzh = new zzfi(this, "non_personalized_ads", null);
        this.zzi = new zzfd(this, "allow_remote_dynamite", false);
        this.zzc = new zzff(this, "first_open_time", 0L);
        this.zzd = new zzff(this, "app_install_time", 0L);
        this.zze = new zzfi(this, "app_instance_id", null);
        this.zzm = new zzfd(this, "app_backgrounded", false);
        this.zzn = new zzfd(this, "deep_link_retrieval_complete", false);
        this.zzo = new zzff(this, "deep_link_retrieval_attempts", 0L);
        this.zzp = new zzfi(this, "firebase_feature_rollouts", null);
        this.zzq = new zzfi(this, "deferred_attribution_cache", null);
        this.zzr = new zzff(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzs = new zzfe(this, "default_event_parameters", null);
    }

    @WorkerThread
    protected final SharedPreferences zza() {
        zzg();
        zzv();
        Preconditions.checkNotNull(this.zzu);
        return this.zzu;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    @WorkerThread
    protected final void zzaC() {
        SharedPreferences sharedPreferences = this.zzt.zzaw().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzu = sharedPreferences;
        boolean z7 = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzl = z7;
        if (!z7) {
            SharedPreferences.Editor edit = this.zzu.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzt.zzf();
        this.zzb = new zzfh(this, "health_monitor", Math.max(0L, ((Long) zzeh.zzc.zza(null)).longValue()), null);
    }

    @WorkerThread
    final Pair zzb(String str) {
        zzg();
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        String str2 = this.zzv;
        if (str2 != null && elapsedRealtime < this.zzx) {
            return new Pair(str2, Boolean.valueOf(this.zzw));
        }
        this.zzx = elapsedRealtime + this.zzt.zzf().zzi(str, zzeh.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzaw());
            this.zzv = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.zzv = id;
            }
            this.zzw = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e8) {
            this.zzt.zzaA().zzc().zzb("Unable to get advertising id", e8);
            this.zzv = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzv, Boolean.valueOf(this.zzw));
    }

    @WorkerThread
    final zzai zzc() {
        zzg();
        return zzai.zzb(zza().getString("consent_settings", "G1"));
    }

    @WorkerThread
    final Boolean zzd() {
        zzg();
        if (zza().contains("measurement_enabled")) {
            return Boolean.valueOf(zza().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    protected final boolean zzf() {
        return true;
    }

    @WorkerThread
    final void zzh(Boolean bool) {
        zzg();
        SharedPreferences.Editor edit = zza().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    @WorkerThread
    final void zzi(boolean z7) {
        zzg();
        this.zzt.zzaA().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z7));
        SharedPreferences.Editor edit = zza().edit();
        edit.putBoolean("deferred_analytics_collection", z7);
        edit.apply();
    }

    @WorkerThread
    final boolean zzj() {
        SharedPreferences sharedPreferences = this.zzu;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean zzk(long j8) {
        return j8 - this.zzf.zza() > this.zzj.zza();
    }

    @WorkerThread
    final boolean zzl(int i8) {
        return zzai.zzj(i8, zza().getInt("consent_source", 100));
    }
}
