package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.measurement.internal.zzin;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
public class zzhj implements zzil {
    private static volatile zzhj zzb;
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    private Boolean zzad;
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private int zzah;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzab zzh;
    private final zzag zzi;
    private final zzgh zzj;
    private final zzfw zzk;
    private final zzhc zzl;
    private final zzmh zzm;
    private final zznp zzn;
    private final zzfr zzo;
    private final Clock zzp;
    private final zzks zzq;
    private final zziv zzr;
    private final zzb zzs;
    private final zzkj zzt;
    private final String zzu;
    private zzfp zzv;
    private zzkx zzw;
    private zzax zzx;
    private zzfq zzy;
    private boolean zzz = false;
    private AtomicInteger zzai = new AtomicInteger(0);

    public final int zzc() {
        zzl().zzt();
        if (this.zzi.zzw()) {
            return 1;
        }
        Boolean bool = this.zzae;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!zzad()) {
            return 8;
        }
        Boolean zzv = zzn().zzv();
        if (zzv != null) {
            return zzv.booleanValue() ? 0 : 3;
        }
        Boolean zze = this.zzi.zze("firebase_analytics_collection_enabled");
        if (zze != null) {
            return zze.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.zzad;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzac == null || this.zzac.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Pure
    public final Context zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Pure
    public final Clock zzb() {
        return this.zzp;
    }

    @Pure
    public final zzb zze() {
        zzb zzbVar = this.zzs;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Pure
    public final zzab zzd() {
        return this.zzh;
    }

    @Pure
    public final zzag zzf() {
        return this.zzi;
    }

    @Pure
    public final zzax zzg() {
        zza((zzii) this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzfq zzh() {
        zza((zze) this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzfp zzi() {
        zza((zze) this.zzv);
        return this.zzv;
    }

    @Pure
    public final zzfr zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Pure
    public final zzfw zzj() {
        zza((zzii) this.zzk);
        return this.zzk;
    }

    public final zzfw zzm() {
        zzfw zzfwVar = this.zzk;
        if (zzfwVar == null || !zzfwVar.zzaf()) {
            return null;
        }
        return this.zzk;
    }

    @Pure
    public final zzgh zzn() {
        zza((zzij) this.zzj);
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Pure
    public final zzhc zzl() {
        zza((zzii) this.zzl);
        return this.zzl;
    }

    @SideEffectFree
    final zzhc zzo() {
        return this.zzl;
    }

    public static zzhj zza(Context context, com.google.android.gms.internal.measurement.zzdo zzdoVar, Long l) {
        if (zzdoVar != null && (zzdoVar.zze == null || zzdoVar.zzf == null)) {
            zzdoVar = new com.google.android.gms.internal.measurement.zzdo(zzdoVar.zza, zzdoVar.zzb, zzdoVar.zzc, zzdoVar.zzd, null, null, zzdoVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzhj.class) {
                if (zzb == null) {
                    zzb = new zzhj(new zzit(context, zzdoVar, l));
                }
            }
        } else if (zzdoVar != null && zzdoVar.zzg != null && zzdoVar.zzg.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzb);
            zzb.zza(zzdoVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzb);
        return zzb;
    }

    @Pure
    public final zziv zzp() {
        zza((zze) this.zzr);
        return this.zzr;
    }

    @Pure
    private final zzkj zzai() {
        zza((zzii) this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzks zzq() {
        zza((zze) this.zzq);
        return this.zzq;
    }

    @Pure
    public final zzkx zzr() {
        zza((zze) this.zzw);
        return this.zzw;
    }

    @Pure
    public final zzmh zzs() {
        zza((zze) this.zzm);
        return this.zzm;
    }

    @Pure
    public final zznp zzt() {
        zza((zzij) this.zzn);
        return this.zzn;
    }

    @Pure
    public final String zzu() {
        return this.zzd;
    }

    @Pure
    public final String zzv() {
        return this.zze;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzu;
    }

    static /* synthetic */ void zza(zzhj zzhjVar, zzit zzitVar) {
        zzhjVar.zzl().zzt();
        zzax zzaxVar = new zzax(zzhjVar);
        zzaxVar.zzad();
        zzhjVar.zzx = zzaxVar;
        zzfq zzfqVar = new zzfq(zzhjVar, zzitVar.zzf);
        zzfqVar.zzv();
        zzhjVar.zzy = zzfqVar;
        zzfp zzfpVar = new zzfp(zzhjVar);
        zzfpVar.zzv();
        zzhjVar.zzv = zzfpVar;
        zzkx zzkxVar = new zzkx(zzhjVar);
        zzkxVar.zzv();
        zzhjVar.zzw = zzkxVar;
        zzhjVar.zzn.zzae();
        zzhjVar.zzj.zzae();
        zzhjVar.zzy.zzw();
        zzhjVar.zzj().zzn().zza("App measurement initialized, version", 97001L);
        zzhjVar.zzj().zzn().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzad = zzfqVar.zzad();
        if (TextUtils.isEmpty(zzhjVar.zzd)) {
            if (zzhjVar.zzt().zzd(zzad, zzhjVar.zzi.zzp())) {
                zzhjVar.zzj().zzn().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzhjVar.zzj().zzn().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + zzad);
            }
        }
        zzhjVar.zzj().zzc().zza("Debug-level message logging enabled");
        if (zzhjVar.zzag != zzhjVar.zzai.get()) {
            zzhjVar.zzj().zzg().zza("Not all components initialized", Integer.valueOf(zzhjVar.zzag), Integer.valueOf(zzhjVar.zzai.get()));
        }
        zzhjVar.zzz = true;
    }

    private zzhj(zzit zzitVar) {
        long currentTimeMillis;
        boolean z = false;
        Preconditions.checkNotNull(zzitVar);
        zzab zzabVar = new zzab(zzitVar.zza);
        this.zzh = zzabVar;
        zzfk.zza = zzabVar;
        Context context = zzitVar.zza;
        this.zzc = context;
        this.zzd = zzitVar.zzb;
        this.zze = zzitVar.zzc;
        this.zzf = zzitVar.zzd;
        this.zzg = zzitVar.zzh;
        this.zzac = zzitVar.zze;
        this.zzu = zzitVar.zzj;
        this.zzaf = true;
        com.google.android.gms.internal.measurement.zzdo zzdoVar = zzitVar.zzg;
        if (zzdoVar != null && zzdoVar.zzg != null) {
            Object obj = zzdoVar.zzg.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzad = (Boolean) obj;
            }
            Object obj2 = zzdoVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzae = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzgz.zzb(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzp = defaultClock;
        if (zzitVar.zzi != null) {
            currentTimeMillis = zzitVar.zzi.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zza = currentTimeMillis;
        this.zzi = new zzag(this);
        zzgh zzghVar = new zzgh(this);
        zzghVar.zzad();
        this.zzj = zzghVar;
        zzfw zzfwVar = new zzfw(this);
        zzfwVar.zzad();
        this.zzk = zzfwVar;
        zznp zznpVar = new zznp(this);
        zznpVar.zzad();
        this.zzn = zznpVar;
        this.zzo = new zzfr(new zziw(zzitVar, this));
        this.zzs = new zzb(this);
        zzks zzksVar = new zzks(this);
        zzksVar.zzv();
        this.zzq = zzksVar;
        zziv zzivVar = new zziv(this);
        zzivVar.zzv();
        this.zzr = zzivVar;
        zzmh zzmhVar = new zzmh(this);
        zzmhVar.zzv();
        this.zzm = zzmhVar;
        zzkj zzkjVar = new zzkj(this);
        zzkjVar.zzad();
        this.zzt = zzkjVar;
        zzhc zzhcVar = new zzhc(this);
        zzhcVar.zzad();
        this.zzl = zzhcVar;
        if (zzitVar.zzg != null && zzitVar.zzg.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            zzp().zzb(z2);
        } else {
            zzj().zzu().zza("Application context is not an Application");
        }
        zzhcVar.zzb(new zzhk(this, zzitVar));
    }

    private static void zza(zzij zzijVar) {
        if (zzijVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zze zzeVar) {
        if (zzeVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzeVar.zzy()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zzeVar.getClass()));
    }

    private static void zza(zzii zziiVar) {
        if (zziiVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zziiVar.zzaf()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zziiVar.getClass()));
    }

    final void zzy() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void zzz() {
        this.zzai.incrementAndGet();
    }

    final /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        if ((i != 200 && i != 204 && i != 304) || th != null) {
            zzj().zzu().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        zzn().zzo.zza(true);
        if (bArr == null || bArr.length == 0) {
            zzj().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            if (TextUtils.isEmpty(optString)) {
                zzj().zzc().zza("Deferred Deep Link is empty.");
                return;
            }
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            String optString4 = jSONObject.optString("gad_source", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            Bundle bundle = new Bundle();
            if (zzoj.zza() && this.zzi.zza(zzbf.zzcl)) {
                if (!zzt().zzi(optString)) {
                    zzj().zzu().zza("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                if (!TextUtils.isEmpty(optString3)) {
                    bundle.putString("gbraid", optString3);
                }
                if (!TextUtils.isEmpty(optString4)) {
                    bundle.putString("gad_source", optString4);
                }
            } else if (!zzt().zzi(optString)) {
                zzj().zzu().zza("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            if (zzoj.zza()) {
                this.zzi.zza(zzbf.zzcl);
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.zzr.zzc(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
            zznp zzt = zzt();
            if (TextUtils.isEmpty(optString) || !zzt.zza(optString, optDouble)) {
                return;
            }
            zzt.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            zzj().zzg().zza("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    final void zzaa() {
        this.zzag++;
    }

    final void zza(boolean z) {
        this.zzac = Boolean.valueOf(z);
    }

    public final void zzb(boolean z) {
        zzl().zzt();
        this.zzaf = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00ee, code lost:
    
        if (r1.zzk() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0163, code lost:
    
        if (r1.zzk() != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zzin zzinVar;
        Boolean zza;
        zzav zza2;
        zzl().zzt();
        if (zzpg.zza() && this.zzi.zza(zzbf.zzca) && zzt().zzw()) {
            zznp zzt = zzt();
            zzt.zzt();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            ContextCompat.registerReceiver(zzt.zza(), new zzq(zzt.zzu), intentFilter, 2);
            zzt.zzj().zzc().zza("Registered app receiver");
        }
        zzin zzn = zzn().zzn();
        int zza3 = zzn.zza();
        if (com.google.android.gms.internal.measurement.zzne.zza() && this.zzi.zza(zzbf.zzcq)) {
            zzim zzc = this.zzi.zzc("google_analytics_default_allow_ad_storage", false);
            zzim zzc2 = this.zzi.zzc("google_analytics_default_allow_analytics_storage", false);
            if ((zzc != zzim.UNINITIALIZED || zzc2 != zzim.UNINITIALIZED) && zzn().zza(-10)) {
                zzinVar = zzin.zza(zzc, zzc2, -10);
            } else {
                if (!TextUtils.isEmpty(zzh().zzae()) && (zza3 == 0 || zza3 == 30 || zza3 == 10 || zza3 == 30 || zza3 == 30 || zza3 == 40)) {
                    zzp().zza(new zzin(null, null, -10), this.zza, false);
                } else if (TextUtils.isEmpty(zzh().zzae()) && zzdoVar != null && zzdoVar.zzg != null && zzn().zza(30)) {
                    zzinVar = zzin.zza(zzdoVar.zzg, 30);
                }
                zzinVar = null;
            }
        } else {
            Boolean zze = this.zzi.zze("google_analytics_default_allow_ad_storage");
            Boolean zze2 = this.zzi.zze("google_analytics_default_allow_analytics_storage");
            if ((zze != null || zze2 != null) && zzn().zza(-10)) {
                zzinVar = new zzin(zze, zze2, -10);
            } else {
                if (!TextUtils.isEmpty(zzh().zzae()) && (zza3 == 0 || zza3 == 30 || zza3 == 10 || zza3 == 30 || zza3 == 30 || zza3 == 40)) {
                    zzp().zza(new zzin(null, null, -10), this.zza, false);
                } else if (TextUtils.isEmpty(zzh().zzae()) && zzdoVar != null && zzdoVar.zzg != null && zzn().zza(30)) {
                    zzinVar = zzin.zza(zzdoVar.zzg, 30);
                }
                zzinVar = null;
            }
        }
        if (zzinVar != null) {
            zzp().zza(zzinVar, this.zza, this.zzi.zza(zzbf.zzct));
            zzn = zzinVar;
        }
        zzp().zza(zzn);
        int zza4 = zzn().zzm().zza();
        if (com.google.android.gms.internal.measurement.zzne.zza() && this.zzi.zza(zzbf.zzcq)) {
            zzim zzc3 = this.zzi.zzc("google_analytics_default_allow_ad_personalization_signals", true);
            if (zzc3 != zzim.UNINITIALIZED) {
                zzj().zzp().zza("Default ad personalization consent from Manifest", zzc3);
            }
            zzim zzc4 = this.zzi.zzc("google_analytics_default_allow_ad_user_data", true);
            if (zzc4 != zzim.UNINITIALIZED && zzin.zza(-10, zza4)) {
                zzp().zza(zzav.zza(zzc4, -10), this.zzi.zza(zzbf.zzct));
            }
            if (TextUtils.isEmpty(zzh().zzae())) {
            }
            if (TextUtils.isEmpty(zzh().zzae())) {
                zza2 = zzav.zza(zzdoVar.zzg, 30);
                if (zza2.zzg()) {
                }
            }
            if (TextUtils.isEmpty(zzh().zzae())) {
                zzp().zza(zzdoVar.zze, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, (Object) zza.toString(), false);
            }
        } else {
            Boolean zze3 = this.zzi.zze("google_analytics_default_allow_ad_user_data");
            if (zze3 != null && zzin.zza(-10, zza4)) {
                zzp().zza(new zzav(zze3, -10), this.zzi.zza(zzbf.zzct));
            }
            if (TextUtils.isEmpty(zzh().zzae()) && (zza4 == 0 || zza4 == 30)) {
                zzp().zza(new zzav(null, -10), this.zzi.zza(zzbf.zzct));
            } else {
                if (TextUtils.isEmpty(zzh().zzae()) && zzdoVar != null && zzdoVar.zzg != null && zzin.zza(30, zza4)) {
                    zza2 = zzav.zza(zzdoVar.zzg, 30);
                    if (zza2.zzg()) {
                        zzp().zza(zza2, this.zzi.zza(zzbf.zzct));
                    }
                }
                if (TextUtils.isEmpty(zzh().zzae()) && zzdoVar != null && zzdoVar.zzg != null && zzn().zzh.zza() == null && (zza = zzav.zza(zzdoVar.zzg)) != null) {
                    zzp().zza(zzdoVar.zze, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, (Object) zza.toString(), false);
                }
            }
        }
        Boolean zze4 = this.zzi.zze("google_analytics_tcf_data_enabled");
        if (zze4 == null ? true : zze4.booleanValue()) {
            zzj().zzc().zza("TCF client enabled.");
            zzp().zzas();
            zzp().zzaq();
        }
        if (zzn().zzc.zza() == 0) {
            zzj().zzp().zza("Persisting first open", Long.valueOf(this.zza));
            zzn().zzc.zza(this.zza);
        }
        zzp().zza.zzb();
        if (!zzaf()) {
            if (zzac()) {
                if (!zzt().zze("android.permission.INTERNET")) {
                    zzj().zzg().zza("App is missing INTERNET permission");
                }
                if (!zzt().zze("android.permission.ACCESS_NETWORK_STATE")) {
                    zzj().zzg().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zzc).isCallerInstantApp() && !this.zzi.zzx()) {
                    if (!zznp.zza(this.zzc)) {
                        zzj().zzg().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zznp.zza(this.zzc, false)) {
                        zzj().zzg().zza("AppMeasurementService not registered/enabled");
                    }
                }
                zzj().zzg().zza("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzh().zzae()) || !TextUtils.isEmpty(zzh().zzac())) {
                zzt();
                if (zznp.zza(zzh().zzae(), zzn().zzy(), zzh().zzac(), zzn().zzx())) {
                    zzj().zzn().zza("Rechecking which service to use due to a GMP App Id change");
                    zzn().zzz();
                    zzi().zzaa();
                    this.zzw.zzae();
                    this.zzw.zzad();
                    zzn().zzc.zza(this.zza);
                    zzn().zze.zza(null);
                }
                zzn().zzc(zzh().zzae());
                zzn().zzb(zzh().zzac());
            }
            if (!zzn().zzn().zza(zzin.zza.ANALYTICS_STORAGE)) {
                zzn().zze.zza(null);
            }
            zzp().zzc(zzn().zze.zza());
            if (!zzt().zzx() && !TextUtils.isEmpty(zzn().zzq.zza())) {
                zzj().zzu().zza("Remote config removed with active feature rollouts");
                zzn().zzq.zza(null);
            }
            if (!TextUtils.isEmpty(zzh().zzae()) || !TextUtils.isEmpty(zzh().zzac())) {
                boolean zzac = zzac();
                if (!zzn().zzab() && !this.zzi.zzw()) {
                    zzn().zzb(!zzac);
                }
                if (zzac) {
                    zzp().zzam();
                }
                zzs().zza.zza();
                zzr().zza(new AtomicReference<>());
                zzr().zza(zzn().zzt.zza());
            }
        }
        if (zzpg.zza() && this.zzi.zza(zzbf.zzca) && zzt().zzw()) {
            final zziv zzp = zzp();
            Objects.requireNonNull(zzp);
            new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhi
                @Override // java.lang.Runnable
                public final void run() {
                    zziv.this.zzao();
                }
            }).start();
        }
        zzn().zzj.zza(true);
    }

    public final boolean zzab() {
        return this.zzac != null && this.zzac.booleanValue();
    }

    public final boolean zzac() {
        return zzc() == 0;
    }

    public final boolean zzad() {
        zzl().zzt();
        return this.zzaf;
    }

    @Pure
    public final boolean zzae() {
        return TextUtils.isEmpty(this.zzd);
    }

    protected final boolean zzaf() {
        if (!this.zzz) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzl().zzt();
        Boolean bool = this.zzaa;
        if (bool == null || this.zzab == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000)) {
            this.zzab = this.zzp.elapsedRealtime();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(zzt().zze("android.permission.INTERNET") && zzt().zze("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzx() || (zznp.zza(this.zzc) && zznp.zza(this.zzc, false))));
            this.zzaa = valueOf;
            if (valueOf.booleanValue()) {
                if (!zzt().zza(zzh().zzae(), zzh().zzac()) && TextUtils.isEmpty(zzh().zzac())) {
                    z = false;
                }
                this.zzaa = Boolean.valueOf(z);
            }
        }
        return this.zzaa.booleanValue();
    }

    @Pure
    public final boolean zzag() {
        return this.zzg;
    }

    public final boolean zzah() {
        zzl().zzt();
        zza((zzii) zzai());
        String zzad = zzh().zzad();
        Pair<String, Boolean> zza = zzn().zza(zzad);
        if (!this.zzi.zzu() || ((Boolean) zza.second).booleanValue() || TextUtils.isEmpty((CharSequence) zza.first)) {
            zzj().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!zzai().zzc()) {
            zzj().zzu().zza("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        zzkx zzr = zzr();
        zzr.zzt();
        zzr.zzu();
        if (!zzr.zzao() || zzr.zzq().zzg() >= 234200) {
            zzaj zzab = zzp().zzab();
            Bundle bundle = zzab != null ? zzab.zza : null;
            if (bundle == null) {
                int i = this.zzah;
                this.zzah = i + 1;
                boolean z = i < 10;
                zzj().zzc().zza("Failed to retrieve DMA consent from the service, " + (z ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.zzah));
                return z;
            }
            sb.append("&gcs=").append(zzin.zza(bundle, 100).zzg());
            zzav zza2 = zzav.zza(bundle, 100);
            sb.append("&dma=").append(zza2.zzd() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(zza2.zze())) {
                sb.append("&dma_cps=").append(zza2.zze());
            }
            sb.append("&npa=").append(zzav.zza(bundle) == Boolean.TRUE ? 0 : 1);
            zzj().zzp().zza("Consent query parameters to Bow", sb);
        }
        zznp zzt = zzt();
        zzh();
        URL zza3 = zzt.zza(97001L, zzad, (String) zza.first, zzn().zzp.zza() - 1, sb.toString());
        if (zza3 != null) {
            zzkj zzai = zzai();
            zzkm zzkmVar = new zzkm() { // from class: com.google.android.gms.measurement.internal.zzhl
                @Override // com.google.android.gms.measurement.internal.zzkm
                public final void zza(String str, int i2, Throwable th, byte[] bArr, Map map) {
                    zzhj.this.zza(str, i2, th, bArr, map);
                }
            };
            zzai.zzt();
            zzai.zzac();
            Preconditions.checkNotNull(zza3);
            Preconditions.checkNotNull(zzkmVar);
            zzai.zzl().zza(new zzkl(zzai, zzad, zza3, null, null, zzkmVar));
        }
        return false;
    }
}
