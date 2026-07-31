package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import coil3.disk.DiskLruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzin;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.Unit;
import kotlinx.coroutines.DebugKt;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
public final class zziv extends zze {
    final zzr zza;
    private zzki zzb;
    private zzir zzc;
    private final Set<zziu> zzd;
    private boolean zze;
    private final AtomicReference<String> zzf;
    private final Object zzg;
    private boolean zzh;
    private int zzi;
    private zzat zzj;
    private PriorityQueue<zzmu> zzk;
    private zzin zzl;
    private final AtomicLong zzm;
    private long zzn;
    private boolean zzo;
    private zzat zzp;
    private SharedPreferences.OnSharedPreferenceChangeListener zzq;
    private zzat zzr;
    private final zznr zzs;

    public static int zza(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    public final Application.ActivityLifecycleCallbacks zzaa() {
        return this.zzb;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
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

    public final zzaj zzab() {
        zzt();
        return zzo().zzaa();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfq zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfp zzh() {
        return super.zzh();
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

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziv zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzks zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzmh zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    public final Boolean zzac() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().zza(atomicReference, 15000L, "boolean test flag value", new zzjf(this, atomicReference));
    }

    public final Double zzad() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().zza(atomicReference, 15000L, "double test flag value", new zzkb(this, atomicReference));
    }

    public final Integer zzae() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().zza(atomicReference, 15000L, "int test flag value", new zzkc(this, atomicReference));
    }

    public final Long zzaf() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().zza(atomicReference, 15000L, "long test flag value", new zzjz(this, atomicReference));
    }

    public final String zzag() {
        return this.zzf.get();
    }

    public final String zzah() {
        zzkp zzaa = this.zzu.zzq().zzaa();
        if (zzaa != null) {
            return zzaa.zzb;
        }
        return null;
    }

    public final String zzai() {
        zzkp zzaa = this.zzu.zzq().zzaa();
        if (zzaa != null) {
            return zzaa.zza;
        }
        return null;
    }

    public final String zzaj() {
        if (this.zzu.zzu() != null) {
            return this.zzu.zzu();
        }
        try {
            return new zzhd(zza(), this.zzu.zzx()).zza("google_app_id");
        } catch (IllegalStateException e) {
            this.zzu.zzj().zzg().zza("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final String zzak() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().zza(atomicReference, 15000L, "String test flag value", new zzjs(this, atomicReference));
    }

    public final ArrayList<Bundle> zza(String str, String str2) {
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (zzab.zza()) {
            zzj().zzg().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, CoroutineLiveDataKt.DEFAULT_TIMEOUT, "get conditional user properties", new zzjv(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            zzj().zzg().zza("Timed out waiting for get conditional user properties", null);
            return new ArrayList<>();
        }
        return zznp.zzb((List<zzae>) list);
    }

    public final List<zzno> zza(boolean z) {
        zzu();
        zzj().zzp().zza("Getting user properties (FE)");
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        if (zzab.zza()) {
            zzj().zzg().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, CoroutineLiveDataKt.DEFAULT_TIMEOUT, "get user properties", new zzjp(this, atomicReference, z));
        List<zzno> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzj().zzg().zza("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        return Collections.emptyList();
    }

    public final Map<String, Object> zza(String str, String str2, boolean z) {
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (zzab.zza()) {
            zzj().zzg().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, CoroutineLiveDataKt.DEFAULT_TIMEOUT, "get user properties", new zzjy(this, atomicReference, null, str, str2, z));
        List<zzno> list = (List) atomicReference.get();
        if (list == null) {
            zzj().zzg().zza("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzno zznoVar : list) {
            Object zza = zznoVar.zza();
            if (zza != null) {
                arrayMap.put(zznoVar.zza, zza);
            }
        }
        return arrayMap;
    }

    final PriorityQueue<zzmu> zzal() {
        if (this.zzk == null) {
            this.zzk = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.zziy
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Long valueOf;
                    valueOf = Long.valueOf(((zzmu) obj).zzb);
                    return valueOf;
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzix
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                    return compare;
                }
            }));
        }
        return this.zzk;
    }

    static /* synthetic */ void zza(zziv zzivVar, Bundle bundle) {
        zzivVar.zzt();
        zzivVar.zzu();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzivVar.zzu.zzac()) {
            zzivVar.zzj().zzp().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzivVar.zzo().zza(new zzae(bundle.getString("app_id"), "", new zzno(checkNotEmpty, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzivVar.zzq().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void zza(zziv zzivVar, zzin zzinVar, zzin zzinVar2) {
        if (com.google.android.gms.internal.measurement.zznk.zza() && zzivVar.zze().zza(zzbf.zzcu)) {
            return;
        }
        boolean zza = zzinVar.zza(zzinVar2, zzin.zza.ANALYTICS_STORAGE, zzin.zza.AD_STORAGE);
        boolean zzb = zzinVar.zzb(zzinVar2, zzin.zza.ANALYTICS_STORAGE, zzin.zza.AD_STORAGE);
        if (zza || zzb) {
            zzivVar.zzg().zzag();
        }
    }

    static /* synthetic */ void zzb(zziv zzivVar, Bundle bundle) {
        zzivVar.zzt();
        zzivVar.zzu();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!zzivVar.zzu.zzac()) {
            zzivVar.zzj().zzp().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zzno zznoVar = new zzno(string, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get("value"), string2);
        try {
            zzbd zza = zzivVar.zzq().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), string2, 0L, true, true);
            zzivVar.zzo().zza(new zzae(bundle.getString("app_id"), string2, zznoVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzivVar.zzq().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), string2, 0L, true, true), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zza, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzivVar.zzq().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void zza(zziv zzivVar, zzin zzinVar, long j, boolean z, boolean z2) {
        zzivVar.zzt();
        zzivVar.zzu();
        zzin zzn = zzivVar.zzk().zzn();
        if (j <= zzivVar.zzn && zzin.zza(zzn.zza(), zzinVar.zza())) {
            zzivVar.zzj().zzn().zza("Dropped out-of-date consent setting, proposed settings", zzinVar);
            return;
        }
        if (zzivVar.zzk().zza(zzinVar)) {
            zzivVar.zzj().zzp().zza("Setting storage consent(FE)", zzinVar);
            zzivVar.zzn = j;
            if (zzivVar.zzo().zzan()) {
                zzivVar.zzo().zzb(z);
            } else {
                zzivVar.zzo().zza(z);
            }
            if (z2) {
                zzivVar.zzo().zza(new AtomicReference<>());
                return;
            }
            return;
        }
        zzivVar.zzj().zzn().zza("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzinVar.zza()));
    }

    static /* synthetic */ void zzb(zziv zzivVar, int i) {
        if (zzivVar.zzj == null) {
            zzivVar.zzj = new zzjk(zzivVar, zzivVar.zzu);
        }
        zzivVar.zzj.zza(i * 1000);
    }

    protected zziv(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzd = new CopyOnWriteArraySet();
        this.zzg = new Object();
        this.zzh = false;
        this.zzi = 1;
        this.zzo = true;
        this.zzs = new zzka(this);
        this.zzf = new AtomicReference<>();
        this.zzl = zzin.zza;
        this.zzn = -1L;
        this.zzm = new AtomicLong(0L);
        this.zza = new zzr(zzhjVar);
    }

    public final void zzam() {
        zzt();
        zzu();
        if (this.zzu.zzaf()) {
            Boolean zze = zze().zze("google_analytics_deferred_deep_link_enabled");
            if (zze != null && zze.booleanValue()) {
                zzj().zzc().zza("Deferred Deep Link feature enabled.");
                zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzje
                    @Override // java.lang.Runnable
                    public final void run() {
                        zziv.this.zzap();
                    }
                });
            }
            zzo().zzac();
            this.zzo = false;
            String zzw = zzk().zzw();
            if (TextUtils.isEmpty(zzw)) {
                return;
            }
            zzf().zzac();
            if (zzw.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", zzw);
            zzc(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final void zza(String str, String str2, Bundle bundle) {
        long currentTimeMillis = zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzl().zzb(new zzjw(this, bundle2));
    }

    public final void zzan() {
        if (!(zza().getApplicationContext() instanceof Application) || this.zzb == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zzb);
    }

    final void zzao() {
        if (zzpg.zza() && zze().zza(zzbf.zzca)) {
            if (zzl().zzg()) {
                zzj().zzg().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (zzab.zza()) {
                zzj().zzg().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zzu();
            zzj().zzp().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzl().zza(atomicReference, CoroutineLiveDataKt.DEFAULT_TIMEOUT, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzja
                @Override // java.lang.Runnable
                public final void run() {
                    zziv.this.zza(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzj().zzg().zza("Timed out waiting for get trigger URIs");
            } else {
                zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zziv.this.zza(list);
                    }
                });
            }
        }
    }

    public final void zzap() {
        zzt();
        if (zzk().zzo.zza()) {
            zzj().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long zza = zzk().zzp.zza();
        zzk().zzp.zza(1 + zza);
        if (zza >= 5) {
            zzj().zzu().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzk().zzo.zza(true);
        } else {
            if (this.zzp == null) {
                this.zzp = new zzjr(this, this.zzu);
            }
            this.zzp.zza(0L);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zzl().zzb(new zzjx(this, zzdgVar));
    }

    public final void zzaq() {
        zzt();
        zzj().zzc().zza("Handle tcf update.");
        zzms zza = zzms.zza(zzk().zzc());
        zzj().zzp().zza("Tcf preferences read", zza);
        if (zzk().zza(zza)) {
            Bundle zza2 = zza.zza();
            zzj().zzp().zza("Consent generated from Tcf", zza2);
            if (zza2 != Bundle.EMPTY) {
                zza(zza2, -30, zzb().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", zza.zzb());
            zzc(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_tcf", bundle);
        }
    }

    final /* synthetic */ void zza(AtomicReference atomicReference) {
        Bundle zza = zzk().zzi.zza();
        zzkx zzo = zzo();
        if (zza == null) {
            zza = new Bundle();
        }
        zzo.zza((AtomicReference<List<zzmu>>) atomicReference, zza);
    }

    final /* synthetic */ void zza(List list) {
        zzt();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> zzh = zzk().zzh();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzmu zzmuVar = (zzmu) it.next();
                if (!zzh.contains(zzmuVar.zzc) || zzh.get(zzmuVar.zzc).longValue() < zzmuVar.zzb) {
                    zzal().add(zzmuVar);
                }
            }
            zzar();
        }
    }

    final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            zzj().zzp().zza("IABTCF_TCString change picked up in listener.");
            ((zzat) Preconditions.checkNotNull(this.zzr)).zza(500L);
        }
    }

    final /* synthetic */ void zza(Bundle bundle, long j) {
        if (TextUtils.isEmpty(zzg().zzae())) {
            zza(bundle, 0, j);
        } else {
            zzj().zzv().zza("Using developer consent only; google app id found");
        }
    }

    final /* synthetic */ void zza(Bundle bundle) {
        if (bundle == null) {
            zzk().zzt.zza(new Bundle());
            return;
        }
        Bundle zza = zzk().zzt.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                zzq();
                if (zznp.zza(obj)) {
                    zzq();
                    zznp.zza(this.zzs, 27, (String) null, (String) null, 0);
                }
                zzj().zzv().zza("Invalid default event parameter type. Name, value", str, obj);
            } else if (zznp.zzg(str)) {
                zzj().zzv().zza("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else if (zzq().zza("param", str, zze().zza((String) null, false), obj)) {
                zzq().zza(zza, str, obj);
            }
        }
        zzq();
        if (zznp.zza(zza, zze().zzg())) {
            zzq();
            zznp.zza(this.zzs, 26, (String) null, (String) null, 0);
            zzj().zzv().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        zzk().zzt.zza(zza);
        zzo().zza(zza);
    }

    final /* synthetic */ void zzb(String str) {
        if (zzg().zzb(str)) {
            zzg().zzag();
        }
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, zzb().currentTimeMillis());
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            zzn().zza(bundle2, j);
        } else {
            zzb(str3, str2, j, bundle2, z2, !z2 || this.zzc == null || zznp.zzg(str2), z, null);
        }
    }

    public final void zza(String str, String str2, Bundle bundle, String str3) {
        zzs();
        zzb(str, str2, zzb().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zza(String str, String str2, Bundle bundle, long j) {
        zza(str, str2, bundle, true, false, j);
    }

    final void zzc(String str, String str2, Bundle bundle) {
        zzt();
        zza(str, str2, zzb().currentTimeMillis(), bundle);
    }

    final void zza(String str, String str2, long j, Bundle bundle) {
        zzt();
        zza(str, str2, j, bundle, true, this.zzc == null || zznp.zzg(str2), true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zza(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        long j2;
        boolean zza;
        String str4;
        boolean z4;
        long j3;
        int length;
        int i;
        Class<?> cls;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        zzt();
        zzu();
        if (!this.zzu.zzac()) {
            zzj().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List<String> zzaf = zzg().zzaf();
        if (zzaf != null && !zzaf.contains(str2)) {
            zzj().zzc().zza("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.zze) {
            this.zze = true;
            try {
                if (!this.zzu.zzag()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e) {
                    zzj().zzu().zza("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                zzj().zzn().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", bundle.getString("gclid"), zzb().currentTimeMillis());
        }
        zziv zzivVar = this;
        if (z && zznp.zzj(str2)) {
            zzivVar.zzq().zza(bundle, zzivVar.zzk().zzt.zza());
        }
        if (!z3 && !"_iap".equals(str2)) {
            zznp zzt = zzivVar.zzu.zzt();
            if (zzt.zzc(NotificationCompat.CATEGORY_EVENT, str2)) {
                if (!zzt.zza(NotificationCompat.CATEGORY_EVENT, zziq.zza, zziq.zzb, str2)) {
                    i = 13;
                } else if (zzt.zza(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                    i = 0;
                }
                if (i != 0) {
                    zzivVar.zzj().zzh().zza("Invalid public event name. Event will not be logged (FE)", zzivVar.zzi().zza(str2));
                    zzivVar.zzu.zzt();
                    String zza2 = zznp.zza(str2, 40, true);
                    length = str2 != null ? str2.length() : 0;
                    zzivVar.zzu.zzt();
                    zznp.zza(zzivVar.zzs, i, "_ev", zza2, length);
                    return;
                }
            }
            i = 2;
            if (i != 0) {
            }
        }
        zzkp zza3 = zzivVar.zzn().zza(false);
        if (zza3 != null && !bundle.containsKey("_sc")) {
            zza3.zzd = true;
        }
        zznp.zza(zza3, bundle, z && !z3);
        boolean equals = "am".equals(str5);
        boolean zzg = zznp.zzg(str2);
        if (z && zzivVar.zzc != null && !zzg && !equals) {
            zzivVar.zzj().zzc().zza("Passing event to registered event handler (FE)", zzivVar.zzi().zza(str2), zzivVar.zzi().zza(bundle));
            Preconditions.checkNotNull(zzivVar.zzc);
            zzivVar.zzc.interceptEvent(str5, str2, bundle, j);
            return;
        }
        long j4 = j;
        if (zzivVar.zzu.zzaf()) {
            int zza4 = zzivVar.zzq().zza(str2);
            if (zza4 != 0) {
                zzivVar.zzj().zzh().zza("Invalid event name. Event will not be logged (FE)", zzivVar.zzi().zza(str2));
                zzivVar.zzq();
                String zza5 = zznp.zza(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                zzivVar.zzu.zzt();
                zznp.zza(zzivVar.zzs, str3, zza4, "_ev", zza5, length);
                return;
            }
            Bundle zza6 = zzivVar.zzq().zza(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            String str6 = str2;
            Preconditions.checkNotNull(zza6);
            if (zzivVar.zzn().zza(false) == null || !"_ae".equals(str6)) {
                j2 = 0;
            } else {
                zzmn zzmnVar = zzivVar.zzp().zzb;
                j2 = 0;
                long elapsedRealtime = zzmnVar.zzb.zzb().elapsedRealtime();
                long j5 = elapsedRealtime - zzmnVar.zza;
                zzmnVar.zza = elapsedRealtime;
                if (j5 > 0) {
                    zzivVar.zzq().zza(zza6, j5);
                }
            }
            if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str5) && "_ssr".equals(str6)) {
                zznp zzq = zzivVar.zzq();
                String string = zza6.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, zzq.zzk().zzq.zza())) {
                    zzq.zzj().zzc().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzq.zzk().zzq.zza(string);
            } else if ("_ae".equals(str6)) {
                String zza7 = zzivVar.zzq().zzk().zzq.zza();
                if (!TextUtils.isEmpty(zza7)) {
                    zza6.putString("_ffr", zza7);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(zza6);
            if (zzivVar.zze().zza(zzbf.zzcg)) {
                zza = zzivVar.zzp().zzaa();
            } else {
                zza = zzivVar.zzk().zzn.zza();
            }
            if (zzivVar.zzk().zzk.zza() <= j2 || !zzivVar.zzk().zza(j4) || !zza) {
                str4 = "_ae";
                z4 = equals;
                j3 = j2;
            } else {
                zzivVar.zzj().zzp().zza("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                z4 = equals;
                j3 = j2;
                zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", (Object) null, zzivVar.zzb().currentTimeMillis());
                zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sno", (Object) null, zzb().currentTimeMillis());
                zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_se", (Object) null, zzb().currentTimeMillis());
                zzivVar = this;
                zzivVar.zzk().zzl.zza(j3);
            }
            if (zza6.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j3) == 1) {
                zzivVar.zzj().zzp().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzivVar.zzu.zzs().zza.zza(j4, true);
            }
            ArrayList arrayList2 = new ArrayList(zza6.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                String str7 = (String) obj;
                if (str7 != null) {
                    zzivVar.zzq();
                    Bundle[] zzb = zznp.zzb(zza6.get(str7));
                    if (zzb != null) {
                        zza6.putParcelableArray(str7, zzb);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i3);
                String str8 = i3 != 0 ? "_ep" : str6;
                bundle2.putString("_o", str5);
                if (z2) {
                    bundle2 = zzivVar.zzq().zza(bundle2, (String) null);
                }
                String str9 = str5;
                Bundle bundle3 = bundle2;
                zzivVar.zzo().zza(new zzbd(str8, new zzbc(bundle2), str9, j4), str3);
                if (!z4) {
                    Iterator<zziu> it = zzivVar.zzd.iterator();
                    while (it.hasNext()) {
                        it.next().onEvent(str, str6, new Bundle(bundle3), j);
                    }
                }
                i3++;
                str5 = str;
                j4 = j;
                str6 = str6;
            }
            String str10 = str6;
            if (zzivVar.zzn().zza(false) == null || !str4.equals(str10)) {
                return;
            }
            zzivVar.zzp().zza(true, true, zzivVar.zzb().elapsedRealtime());
        }
    }

    final void zzar() {
        zzmu poll;
        MeasurementManagerFutures zzn;
        zzt();
        if (zzal().isEmpty() || this.zzh || (poll = zzal().poll()) == null || (zzn = zzq().zzn()) == null) {
            return;
        }
        this.zzh = true;
        zzj().zzp().zza("Registering trigger URI", poll.zza);
        ListenableFuture<Unit> registerTriggerAsync = zzn.registerTriggerAsync(Uri.parse(poll.zza));
        if (registerTriggerAsync == null) {
            this.zzh = false;
            zzal().add(poll);
            return;
        }
        if (!zze().zza(zzbf.zzcf)) {
            SparseArray<Long> zzh = zzk().zzh();
            zzh.put(poll.zzc, Long.valueOf(poll.zzb));
            zzk().zza(zzh);
        }
        Futures.addCallback(registerTriggerAsync, new zzjh(this, poll), new zzji(this));
    }

    public final void zza(zziu zziuVar) {
        zzu();
        Preconditions.checkNotNull(zziuVar);
        if (this.zzd.add(zziuVar)) {
            return;
        }
        zzj().zzu().zza("OnEventListener already registered");
    }

    public final void zzas() {
        zzt();
        zzj().zzc().zza("Register tcfPrefChangeListener.");
        if (this.zzq == null) {
            this.zzr = new zzjo(this, this.zzu);
            this.zzq = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzjd
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    zziv.this.zza(sharedPreferences, str);
                }
            };
        }
        zzk().zzc().registerOnSharedPreferenceChangeListener(this.zzq);
    }

    public final void zza(long j) {
        zzc((String) null);
        zzl().zzb(new zzju(this, j));
    }

    final void zzb(long j) {
        zza(j, true);
    }

    final void zza(long j, boolean z) {
        zzt();
        zzu();
        zzj().zzc().zza("Resetting analytics data (FE)");
        zzmh zzp = zzp();
        zzp.zzt();
        zzp.zzb.zza();
        zzg().zzag();
        boolean zzac = this.zzu.zzac();
        zzgh zzk = zzk();
        zzk.zzc.zza(j);
        if (!TextUtils.isEmpty(zzk.zzk().zzq.zza())) {
            zzk.zzq.zza(null);
        }
        zzk.zzk.zza(0L);
        zzk.zzl.zza(0L);
        if (!zzk.zze().zzw()) {
            zzk.zzb(!zzac);
        }
        zzk.zzr.zza(null);
        zzk.zzs.zza(0L);
        zzk.zzt.zza(null);
        if (z) {
            zzo().zzah();
        }
        zzp().zza.zza();
        this.zzo = !zzac;
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzl().zzb(new zzjn(this, str, str2, j, zznp.zza(bundle), z, z2, z3, str3));
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzl().zzb(new zzjq(this, str, str2, obj, j));
    }

    public final void zzb(boolean z) {
        if (zza().getApplicationContext() instanceof Application) {
            Application application = (Application) zza().getApplicationContext();
            if (this.zzb == null) {
                this.zzb = new zzki(this);
            }
            if (z) {
                application.unregisterActivityLifecycleCallbacks(this.zzb);
                application.registerActivityLifecycleCallbacks(this.zzb);
                zzj().zzp().zza("Registered activity lifecycle callback");
            }
        }
    }

    final void zzc(String str) {
        this.zzf.set(str);
    }

    public final void zzb(Bundle bundle) {
        zzb(bundle, zzb().currentTimeMillis());
    }

    public final void zzb(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().zzu().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzik.zza(bundle2, "app_id", String.class, null);
        zzik.zza(bundle2, "origin", String.class, null);
        zzik.zza(bundle2, "name", String.class, null);
        zzik.zza(bundle2, "value", Object.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzik.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (zzq().zzb(string) != 0) {
            zzj().zzg().zza("Invalid conditional user property name", zzi().zzc(string));
            return;
        }
        if (zzq().zza(string, obj) != 0) {
            zzj().zzg().zza("Invalid conditional user property value", zzi().zzc(string), obj);
            return;
        }
        Object zzc = zzq().zzc(string, obj);
        if (zzc == null) {
            zzj().zzg().zza("Unable to normalize conditional user property value", zzi().zzc(string), obj);
            return;
        }
        zzik.zza(bundle2, zzc);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) && (j2 > 15552000000L || j2 < 1)) {
            zzj().zzg().zza("Invalid conditional user property timeout", zzi().zzc(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        if (j3 > 15552000000L || j3 < 1) {
            zzj().zzg().zza("Invalid conditional user property time to live", zzi().zzc(string), Long.valueOf(j3));
        } else {
            zzl().zzb(new zzjt(this, bundle2));
        }
    }

    public final void zzc(final Bundle bundle, final long j) {
        zzl().zzc(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjb
            @Override // java.lang.Runnable
            public final void run() {
                zziv.this.zza(bundle, j);
            }
        });
    }

    private final void zza(Bundle bundle, int i, long j) {
        String str;
        zzu();
        String zza = zzin.zza(bundle);
        if (zza != null) {
            zzj().zzv().zza("Ignoring invalid consent setting", zza);
            zzj().zzv().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zzg = zzl().zzg();
        zzin zza2 = zzin.zza(bundle, i);
        if (zza2.zzk()) {
            zza(zza2, j, zzg);
        }
        zzav zza3 = zzav.zza(bundle, i);
        if (zza3.zzg()) {
            zza(zza3, zzg);
        }
        Boolean zza4 = zzav.zza(bundle);
        if (zza4 != null) {
            if (i == -30) {
                str = "tcf";
            } else {
                str = "app";
            }
            zza(str, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, (Object) zza4.toString(), false);
        }
    }

    public final void zzd(Bundle bundle, long j) {
        zza(bundle, -20, j);
    }

    public final void zzc(boolean z) {
        zzu();
        zzl().zzb(new zzjj(this, z));
    }

    public final void zzc(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjc
            @Override // java.lang.Runnable
            public final void run() {
                zziv.this.zza(bundle2);
            }
        });
    }

    final void zza(zzav zzavVar, boolean z) {
        zzkd zzkdVar = new zzkd(this, zzavVar);
        if (z) {
            zzt();
            zzkdVar.run();
        } else {
            zzl().zzb(zzkdVar);
        }
    }

    public final void zza(zzir zzirVar) {
        zzir zzirVar2;
        zzt();
        zzu();
        if (zzirVar != null && zzirVar != (zzirVar2 = this.zzc)) {
            Preconditions.checkState(zzirVar2 == null, "EventInterceptor already set.");
        }
        this.zzc = zzirVar;
    }

    public final void zza(Boolean bool) {
        zzu();
        zzl().zzb(new zzke(this, bool));
    }

    final void zza(zzin zzinVar) {
        zzt();
        boolean z = (zzinVar.zzj() && zzinVar.zzi()) || zzo().zzam();
        if (z != this.zzu.zzad()) {
            this.zzu.zzb(z);
            Boolean zzu = zzk().zzu();
            if (!z || zzu == null || zzu.booleanValue()) {
                zza(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Boolean bool, boolean z) {
        zzt();
        zzu();
        zzj().zzc().zza("Setting app measurement enabled (FE)", bool);
        zzk().zza(bool);
        if (z) {
            zzk().zzb(bool);
        }
        if (this.zzu.zzad() || !(bool == null || bool.booleanValue())) {
            zzat();
        }
    }

    public final void zzc(long j) {
        zzl().zzb(new zzjl(this, j));
    }

    public final void zza(Intent intent) {
        if (zzpn.zza() && zze().zza(zzbf.zzbt)) {
            Uri data = intent.getData();
            if (data == null) {
                zzj().zzn().zza("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals(DiskLruCache.VERSION)) {
                zzj().zzn().zza("Preview Mode was not enabled.");
                zze().zzh(null);
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            zzj().zzn().zza("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            zze().zzh(queryParameter2);
        }
    }

    public final void zza(zzin zzinVar, long j, boolean z) {
        zzin zzinVar2;
        boolean z2;
        zzin zzinVar3;
        boolean z3;
        boolean z4;
        zzu();
        int zza = zzinVar.zza();
        if (com.google.android.gms.internal.measurement.zzne.zza() && zze().zza(zzbf.zzcq)) {
            if (zza != -10 && zzinVar.zzc() == zzim.UNINITIALIZED && zzinVar.zzd() == zzim.UNINITIALIZED) {
                zzj().zzv().zza("Ignoring empty consent settings");
                return;
            }
        } else if (zza != -10 && zzinVar.zze() == null && zzinVar.zzf() == null) {
            zzj().zzv().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzg) {
            zzinVar2 = this.zzl;
            z2 = false;
            if (zzin.zza(zza, zzinVar2.zza())) {
                z3 = zzinVar.zzc(this.zzl);
                if (zzinVar.zzj() && !this.zzl.zzj()) {
                    z2 = true;
                }
                zzinVar3 = zzinVar.zzb(this.zzl);
                this.zzl = zzinVar3;
                z4 = z2;
                z2 = true;
            } else {
                zzinVar3 = zzinVar;
                z3 = false;
                z4 = false;
            }
        }
        if (!z2) {
            zzj().zzn().zza("Ignoring lower-priority consent settings, proposed settings", zzinVar3);
            return;
        }
        long andIncrement = this.zzm.getAndIncrement();
        if (z3) {
            zzc((String) null);
            zzkg zzkgVar = new zzkg(this, zzinVar3, j, andIncrement, z4, zzinVar2);
            if (z) {
                zzt();
                zzkgVar.run();
                return;
            } else {
                zzl().zzc(zzkgVar);
                return;
            }
        }
        zzkf zzkfVar = new zzkf(this, zzinVar3, andIncrement, z4, zzinVar2);
        if (z) {
            zzt();
            zzkfVar.run();
        } else if (zza == 30 || zza == -10) {
            zzl().zzc(zzkfVar);
        } else {
            zzl().zzb(zzkfVar);
        }
    }

    public final void zza(final String str, long j) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.zzu.zzj().zzu().zza("User ID must be non-empty or null");
        } else {
            zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjg
                @Override // java.lang.Runnable
                public final void run() {
                    zziv.this.zzb(str);
                }
            });
            zza((String) null, "_id", (Object) str, true, j);
        }
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, z, zzb().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z) {
            i = zzq().zzb(str2);
        } else {
            zznp zzq = zzq();
            if (zzq.zzc("user property", str2)) {
                if (!zzq.zza("user property", zzis.zza, str2)) {
                    i = 15;
                } else if (zzq.zza("user property", 24, str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        if (i != 0) {
            zzq();
            String zza = zznp.zza(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.zzu.zzt();
            zznp.zza(this.zzs, i, "_ev", zza, length);
            return;
        }
        if (obj != null) {
            int zza2 = zzq().zza(str2, obj);
            if (zza2 != 0) {
                zzq();
                String zza3 = zznp.zza(str2, 24, true);
                length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
                this.zzu.zzt();
                zznp.zza(this.zzs, zza2, "_ev", zza3, length);
                return;
            }
            Object zzc = zzq().zzc(str2, obj);
            if (zzc != null) {
                zza(str3, str2, j, zzc);
                return;
            }
            return;
        }
        zza(str3, str2, j, (Object) null);
    }

    final void zza(String str, String str2, Object obj, long j) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzu();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long valueOf = Long.valueOf("false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    zzk().zzh.zza(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    zzj().zzp().zza("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                zzk().zzh.zza("unset");
                str2 = "_npa";
            }
            zzj().zzp().zza("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.zzu.zzac()) {
            zzj().zzp().zza("User property not set since app measurement is disabled");
        } else if (this.zzu.zzaf()) {
            zzo().zza(new zzno(str4, j, obj2, str));
        }
    }

    public final void zzb(zziu zziuVar) {
        zzu();
        Preconditions.checkNotNull(zziuVar);
        if (this.zzd.remove(zziuVar)) {
            return;
        }
        zzj().zzu().zza("OnEventListener had not been registered");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzat() {
        zziv zzivVar;
        zzt();
        String zza = zzk().zzh.zza();
        if (zza == null) {
            zzivVar = this;
        } else if ("unset".equals(zza)) {
            zzivVar = this;
            zzivVar.zza("app", "_npa", (Object) null, zzb().currentTimeMillis());
        } else {
            zzivVar = this;
            zzivVar.zza("app", "_npa", Long.valueOf("true".equals(zza) ? 1L : 0L), zzivVar.zzb().currentTimeMillis());
        }
        if (zzivVar.zzu.zzac() && zzivVar.zzo) {
            zzivVar.zzj().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzivVar.zzam();
            zzivVar.zzp().zza.zza();
            zzivVar.zzl().zzb(new zzjm(zzivVar));
            return;
        }
        zzivVar.zzj().zzc().zza("Updating Scion state (FE)");
        zzivVar.zzo().zzaj();
    }
}
