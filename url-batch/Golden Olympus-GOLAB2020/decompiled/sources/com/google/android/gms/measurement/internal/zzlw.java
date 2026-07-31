package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import f0.AbstractC2416a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class zzlw extends zzg {
    protected zzlv zza;
    final zzx zzb;
    protected boolean zzc;
    private zzkb zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private boolean zzi;
    private int zzj;
    private zzaz zzk;
    private zzaz zzl;
    private PriorityQueue zzm;
    private boolean zzn;
    private zzjx zzo;
    private final AtomicLong zzp;
    private long zzq;
    private zzaz zzr;
    private SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private zzaz zzt;
    private final zzqe zzv;

    protected zzlw(zzio zzioVar) {
        super(zzioVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzv = new zzlk(this);
        this.zzg = new AtomicReference();
        this.zzo = zzjx.zza;
        this.zzq = -1L;
        this.zzp = new AtomicLong(0L);
        this.zzb = new zzx(zzioVar);
    }

    public static /* synthetic */ void zzA(zzlw zzlwVar, SharedPreferences sharedPreferences, String str) {
        zzio zzioVar = zzlwVar.zzu;
        if (!zzioVar.zzf().zzx(null, zzgi.zzbj)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                zzioVar.zzaW().zzj().zza("IABTCF_TCString change picked up in listener.");
                ((zzaz) Preconditions.checkNotNull(zzlwVar.zzt)).zzd(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            zzioVar.zzaW().zzj().zza("IABTCF_TCString change picked up in listener.");
            ((zzaz) Preconditions.checkNotNull(zzlwVar.zzt)).zzd(500L);
        }
    }

    static /* synthetic */ void zzD(zzlw zzlwVar, zzjx zzjxVar, long j4, boolean z4, boolean z5) {
        zzlwVar.zzg();
        zzlwVar.zza();
        zzio zzioVar = zzlwVar.zzu;
        zzjx zzh = zzioVar.zzm().zzh();
        if (j4 <= zzlwVar.zzq && zzjx.zzs(zzh.zzb(), zzjxVar.zzb())) {
            zzioVar.zzaW().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjxVar);
            return;
        }
        zzht zzm = zzioVar.zzm();
        zzio zzioVar2 = zzm.zzu;
        zzm.zzg();
        int zzb = zzjxVar.zzb();
        if (!zzm.zzq(zzb)) {
            zzioVar.zzaW().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjxVar.zzb()));
            return;
        }
        zzio zzioVar3 = zzlwVar.zzu;
        SharedPreferences.Editor edit = zzm.zzb().edit();
        edit.putString("consent_settings", zzjxVar.zzq());
        edit.putInt("consent_source", zzb);
        edit.apply();
        zzioVar.zzaW().zzj().zzb("Setting storage consent(FE)", zzjxVar);
        zzlwVar.zzq = j4;
        if (zzioVar3.zzu().zzac()) {
            zzioVar3.zzu().zzX(z4);
        } else {
            zzioVar3.zzu().zzR(z4);
        }
        if (z5) {
            zzioVar3.zzu().zzE(new AtomicReference());
        }
    }

    static /* bridge */ /* synthetic */ void zzF(zzlw zzlwVar, int i4) {
        if (zzlwVar.zzk == null) {
            zzlwVar.zzk = new zzku(zzlwVar, zzlwVar.zzu);
        }
        zzlwVar.zzk.zzd(i4 * 1000);
    }

    static /* bridge */ /* synthetic */ int zzaq(zzlw zzlwVar, Throwable th) {
        String message = th.getMessage();
        zzlwVar.zzn = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        zzlwVar.zzn = true;
        return 1;
    }

    private final zzme zzar(final zzpa zzpaVar) {
        try {
            URL url = new URI(zzpaVar.zzc).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String zzn = this.zzu.zzh().zzn();
            zzio zzioVar = this.zzu;
            zzhc zzj = zzioVar.zzaW().zzj();
            Long valueOf = Long.valueOf(zzpaVar.zza);
            zzj.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, zzpaVar.zzc, Integer.valueOf(zzpaVar.zzb.length));
            if (!TextUtils.isEmpty(zzpaVar.zzg)) {
                zzioVar.zzaW().zzj().zzc("[sgtm] Uploading data from app. row_id", valueOf, zzpaVar.zzg);
            }
            HashMap hashMap = new HashMap();
            Bundle bundle = zzpaVar.zzd;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
            zzmb zzr = zzioVar.zzr();
            byte[] bArr = zzpaVar.zzb;
            zzly zzlyVar = new zzly() { // from class: com.google.android.gms.measurement.internal.zzkn
                /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzly
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zza(String str2, int i4, Throwable th, byte[] bArr2, Map map) {
                    zzme zzmeVar;
                    AtomicReference atomicReference2;
                    zzlw zzlwVar = zzlw.this;
                    zzlwVar.zzg();
                    zzpa zzpaVar2 = zzpaVar;
                    if (i4 != 200 && i4 != 204) {
                        if (i4 == 304) {
                            i4 = 304;
                        }
                        zzlwVar.zzu.zzaW().zzk().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzpaVar2.zza), Integer.valueOf(i4), th);
                        zzmeVar = !Arrays.asList(((String) zzgi.zzt.zza(null)).split(StringUtils.COMMA)).contains(String.valueOf(i4)) ? zzme.BACKOFF : zzme.FAILURE;
                        atomicReference2 = atomicReference;
                        zzny zzu = zzlwVar.zzu.zzu();
                        long j4 = zzpaVar2.zza;
                        zzu.zzZ(new zzag(j4, zzmeVar.zza(), zzpaVar2.zzf));
                        zzlwVar.zzu.zzaW().zzj().zzc("[sgtm] Updated status for row_id", Long.valueOf(j4), zzmeVar);
                        synchronized (atomicReference2) {
                            atomicReference2.set(zzmeVar);
                            atomicReference2.notifyAll();
                        }
                        return;
                    }
                    if (th == null) {
                        zzlwVar.zzu.zzaW().zzj().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzpaVar2.zza));
                        zzmeVar = zzme.SUCCESS;
                        atomicReference2 = atomicReference;
                        zzny zzu2 = zzlwVar.zzu.zzu();
                        long j42 = zzpaVar2.zza;
                        zzu2.zzZ(new zzag(j42, zzmeVar.zza(), zzpaVar2.zzf));
                        zzlwVar.zzu.zzaW().zzj().zzc("[sgtm] Updated status for row_id", Long.valueOf(j42), zzmeVar);
                        synchronized (atomicReference2) {
                        }
                    }
                    zzlwVar.zzu.zzaW().zzk().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzpaVar2.zza), Integer.valueOf(i4), th);
                    if (!Arrays.asList(((String) zzgi.zzt.zza(null)).split(StringUtils.COMMA)).contains(String.valueOf(i4))) {
                    }
                    atomicReference2 = atomicReference;
                    zzny zzu22 = zzlwVar.zzu.zzu();
                    long j422 = zzpaVar2.zza;
                    zzu22.zzZ(new zzag(j422, zzmeVar.zza(), zzpaVar2.zzf));
                    zzlwVar.zzu.zzaW().zzj().zzc("[sgtm] Updated status for row_id", Long.valueOf(j422), zzmeVar);
                    synchronized (atomicReference2) {
                    }
                }
            };
            zzr.zzv();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(bArr);
            Preconditions.checkNotNull(zzlyVar);
            zzr.zzu.zzaX().zzp(new zzma(zzr, zzn, url, bArr, hashMap, zzlyVar));
            try {
                zzio zzioVar2 = zzioVar.zzw().zzu;
                long currentTimeMillis = zzioVar2.zzaU().currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long j4 = 60000; atomicReference.get() == null && j4 > 0; j4 = currentTimeMillis - zzioVar2.zzaU().currentTimeMillis()) {
                        try {
                            atomicReference.wait(j4);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.zzu.zzaW().zzk().zza("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? zzme.UNKNOWN : (zzme) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e4) {
            this.zzu.zzaW().zze().zzd("[sgtm] Bad upload url for row_id", zzpaVar.zzc, Long.valueOf(zzpaVar.zza), e4);
            return zzme.FAILURE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzas(Boolean bool, boolean z4) {
        zzg();
        zza();
        zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzd().zzb("Setting app measurement enabled (FE)", bool);
        zzioVar.zzm().zzm(bool);
        if (z4) {
            zzht zzm = zzioVar.zzm();
            zzio zzioVar2 = zzm.zzu;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zzb().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzu.zzK() || !(bool == null || bool.booleanValue())) {
            zzat();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzat() {
        zzlw zzlwVar;
        zzg();
        zzio zzioVar = this.zzu;
        String zza = zzioVar.zzm().zzh.zza();
        if (zza == null) {
            zzlwVar = this;
        } else if ("unset".equals(zza)) {
            zzlwVar = this;
            zzlwVar.zzan("app", "_npa", null, zzioVar.zzaU().currentTimeMillis());
        } else {
            zzan("app", "_npa", Long.valueOf(true != com.ironsource.mediationsdk.metadata.a.f17681g.equals(zza) ? 0L : 1L), zzioVar.zzaU().currentTimeMillis());
            zzlwVar = this;
        }
        if (!zzlwVar.zzu.zzJ() || !zzlwVar.zzc) {
            zzioVar.zzaW().zzd().zza("Updating Scion state (FE)");
            zzlwVar.zzu.zzu().zzV();
        } else {
            zzioVar.zzaW().zzd().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzH();
            zzlwVar.zzu.zzv().zza.zza();
            zzioVar.zzaX().zzq(new zzkw(this));
        }
    }

    public static /* synthetic */ void zzz(zzlw zzlwVar, Bundle bundle) {
        Bundle bundle2;
        int i4;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            zzio zzioVar = zzlwVar.zzu;
            bundle2 = new Bundle(zzioVar.zzm().zzt.zza());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i4 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (zzioVar.zzw().zzal(obj)) {
                        zzioVar.zzw().zzR(zzlwVar.zzv, null, 27, null, null, 0);
                    }
                    zzioVar.zzaW().zzl().zzc("Invalid default event parameter type. Name, value", next, obj);
                } else if (zzqf.zzap(next)) {
                    zzioVar.zzaW().zzl().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzioVar.zzw().zzaf("param", next, zzioVar.zzf().zzc(null, false), obj)) {
                    zzioVar.zzw().zzS(bundle2, next, obj);
                }
            }
            zzioVar.zzw();
            int zze = zzioVar.zzf().zze();
            if (bundle2.size() > zze) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i4++;
                    if (i4 > zze) {
                        bundle2.remove(str);
                    }
                }
                zzioVar.zzw().zzR(zzlwVar.zzv, null, 26, null, null, 0);
                zzioVar.zzaW().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        zzio zzioVar2 = zzlwVar.zzu;
        zzioVar2.zzm().zzt.zzb(bundle2);
        if (!bundle.isEmpty() || zzioVar2.zzf().zzx(null, zzgi.zzbd)) {
            zzlwVar.zzu.zzu().zzT(bundle2);
        }
    }

    public final void zzH() {
        zzg();
        zza();
        if (this.zzu.zzM()) {
            zzio zzioVar = this.zzu;
            zzam zzf = zzioVar.zzf();
            zzf.zzu.zzaV();
            Boolean zzn = zzf.zzn("google_analytics_deferred_deep_link_enabled");
            if (zzn != null && zzn.booleanValue()) {
                zzioVar.zzaW().zzd().zza("Deferred Deep Link feature enabled.");
                zzioVar.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzko
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzlw.this.zzM();
                    }
                });
            }
            this.zzu.zzu().zzA();
            this.zzc = false;
            zzht zzm = zzioVar.zzm();
            zzm.zzg();
            String string = zzm.zzb().getString("previous_os_version", null);
            zzm.zzu.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zzb().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzioVar.zzg().zzv();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzR("auto", "_ou", bundle);
        }
    }

    final void zzI() {
        zzg();
        zzaz zzazVar = this.zzl;
        if (zzazVar != null) {
            zzazVar.zzb();
        }
    }

    public final void zzJ(String str, String str2, Bundle bundle) {
        zzio zzioVar = this.zzu;
        long currentTimeMillis = zzioVar.zzaU().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzioVar.zzaX().zzq(new zzlg(this, bundle2));
    }

    public final void zzK() {
        zzio zzioVar = this.zzu;
        if (!(zzioVar.zzaT().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zzioVar.zzaT().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    final void zzL() {
        zzqr.zzb();
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, zzgi.zzaW)) {
            if (zzioVar.zzaX().zzu()) {
                zzioVar.zzaW().zze().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzioVar.zzaV();
            if (zzaf.zza()) {
                zzioVar.zzaW().zze().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zza();
            zzioVar.zzaW().zzj().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzioVar.zzaX().zze(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzki
                @Override // java.lang.Runnable
                public final void run() {
                    zzlw zzlwVar = zzlw.this;
                    zzlwVar.zzu.zzu().zzH(atomicReference, zzlwVar.zzu.zzm().zzi.zza());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzioVar.zzaW().zze().zza("Timed out waiting for get trigger URIs");
            } else {
                zzioVar.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkj
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean contains;
                        zzlw zzlwVar = zzlw.this;
                        zzlwVar.zzg();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzov> list2 = list;
                        SparseArray zze = zzlwVar.zzu.zzm().zze();
                        for (zzov zzovVar : list2) {
                            int i4 = zzovVar.zzc;
                            contains = zze.contains(i4);
                            if (!contains || ((Long) zze.get(i4)).longValue() < zzovVar.zzb) {
                                zzlwVar.zzy().add(zzovVar);
                            }
                        }
                        zzlwVar.zzU();
                    }
                });
            }
        }
    }

    public final void zzM() {
        zzg();
        zzio zzioVar = this.zzu;
        if (zzioVar.zzm().zzo.zzb()) {
            zzioVar.zzaW().zzd().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long zza = zzioVar.zzm().zzp.zza();
        zzioVar.zzm().zzp.zzb(1 + zza);
        zzioVar.zzf();
        if (zza >= 5) {
            zzioVar.zzaW().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzioVar.zzm().zzo.zza(true);
        } else {
            if (this.zzr == null) {
                this.zzr = new zzld(this, this.zzu);
            }
            this.zzr.zzd(0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzN() {
        zzoq zzoqVar;
        zzoq zzoqVar2;
        com.google.android.gms.internal.measurement.zzkm zzkmVar;
        zzg();
        zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzd().zza("Handle tcf update.");
        SharedPreferences zza = zzioVar.zzm().zza();
        HashMap hashMap = new HashMap();
        zzgg zzggVar = zzgi.zzbj;
        int i4 = 2;
        if (((Boolean) zzggVar.zza(null)).booleanValue()) {
            int i5 = zzot.zzb;
            com.google.android.gms.internal.measurement.zzkl zzklVar = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            zzos zzosVar = zzos.CONSENT;
            Map.Entry zza2 = zzor.zza(zzklVar, zzosVar);
            int i6 = 1;
            com.google.android.gms.internal.measurement.zzkl zzklVar2 = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            zzos zzosVar2 = zzos.FLEXIBLE_LEGITIMATE_INTEREST;
            ImmutableMap ofEntries = ImmutableMap.ofEntries(zza2, zzor.zza(zzklVar2, zzosVar2), zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, zzosVar), zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, zzosVar), zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, zzosVar2), zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, zzosVar2), zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, zzosVar2));
            ImmutableSet of = ImmutableSet.of("CH");
            char[] cArr = new char[5];
            int zza3 = zzot.zza(zza, "IABTCF_CmpSdkID");
            int zza4 = zzot.zza(zza, "IABTCF_PolicyVersion");
            int zza5 = zzot.zza(zza, "IABTCF_gdprApplies");
            int zza6 = zzot.zza(zza, "IABTCF_PurposeOneTreatment");
            int zza7 = zzot.zza(zza, "IABTCF_EnableAdvertiserConsentMode");
            String zzb = zzot.zzb(zza, "IABTCF_PublisherCC");
            ImmutableMap.Builder builder = ImmutableMap.builder();
            UnmodifiableIterator it = ofEntries.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzkl zzklVar3 = (com.google.android.gms.internal.measurement.zzkl) it.next();
                String zzb2 = zzot.zzb(zza, "IABTCF_PublisherRestrictions" + zzklVar3.zza());
                if (TextUtils.isEmpty(zzb2) || zzb2.length() < 755) {
                    zzkmVar = com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int digit = Character.digit(zzb2.charAt(754), 10);
                    zzkmVar = (digit < 0 || digit > com.google.android.gms.internal.measurement.zzkm.values().length || digit == 0) ? com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_NOT_ALLOWED : digit != i6 ? digit != i4 ? com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                builder.put(zzklVar3, zzkmVar);
                i4 = 2;
                i6 = 1;
            }
            ImmutableMap buildOrThrow = builder.buildOrThrow();
            String zzb3 = zzot.zzb(zza, "IABTCF_PurposeConsents");
            String zzb4 = zzot.zzb(zza, "IABTCF_VendorConsents");
            boolean z4 = !TextUtils.isEmpty(zzb4) && zzb4.length() >= 755 && zzb4.charAt(754) == '1';
            String zzb5 = zzot.zzb(zza, "IABTCF_PurposeLegitimateInterests");
            String zzb6 = zzot.zzb(zza, "IABTCF_VendorLegitimateInterests");
            boolean z5 = !TextUtils.isEmpty(zzb6) && zzb6.length() >= 755 && zzb6.charAt(754) == '1';
            cArr[0] = '2';
            zzoqVar = new zzoq(zzot.zzc(ofEntries, buildOrThrow, of, cArr, zza3, zza7, zza5, zza4, zza6, zzb, zzb3, zzb5, z4, z5));
        } else {
            String zzb7 = zzot.zzb(zza, "IABTCF_VendorConsents");
            if (!"".equals(zzb7) && zzb7.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(zzb7.charAt(754)));
            }
            int zza8 = zzot.zza(zza, "IABTCF_gdprApplies");
            if (zza8 != -1) {
                hashMap.put("gdprApplies", String.valueOf(zza8));
            }
            int zza9 = zzot.zza(zza, "IABTCF_EnableAdvertiserConsentMode");
            if (zza9 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(zza9));
            }
            int zza10 = zzot.zza(zza, "IABTCF_PolicyVersion");
            if (zza10 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(zza10));
            }
            String zzb8 = zzot.zzb(zza, "IABTCF_PurposeConsents");
            if (!"".equals(zzb8)) {
                hashMap.put("PurposeConsents", zzb8);
            }
            int zza11 = zzot.zza(zza, "IABTCF_CmpSdkID");
            if (zza11 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(zza11));
            }
            zzoqVar = new zzoq(hashMap);
        }
        zzioVar.zzaW().zzj().zzb("Tcf preferences read", zzoqVar);
        if (!zzioVar.zzf().zzx(null, zzggVar)) {
            if (zzioVar.zzm().zzr(zzoqVar)) {
                Bundle zza12 = zzoqVar.zza();
                zzioVar.zzaW().zzj().zzb("Consent generated from Tcf", zza12);
                if (zza12 != Bundle.EMPTY) {
                    zzaf(zza12, -30, zzioVar.zzaU().currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", zzoqVar.zzd());
                zzR("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        zzht zzm = zzioVar.zzm();
        zzm.zzg();
        String string = zzm.zzb().getString("stored_tcf_param", "");
        HashMap hashMap2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            zzoqVar2 = new zzoq(hashMap2);
        } else {
            for (String str : string.split(";")) {
                String[] split = str.split("=");
                if (split.length >= 2 && zzot.zza.contains(split[0])) {
                    hashMap2.put(split[0], split[1]);
                }
            }
            zzoqVar2 = new zzoq(hashMap2);
        }
        if (zzioVar.zzm().zzr(zzoqVar)) {
            Bundle zza13 = zzoqVar.zza();
            zzioVar.zzaW().zzj().zzb("Consent generated from Tcf", zza13);
            if (zza13 != Bundle.EMPTY) {
                zzaf(zza13, -30, zzioVar.zzaU().currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", zzoqVar.zzc(zzoqVar2));
            bundle2.putString("_tcfd2", zzoqVar.zzb());
            bundle2.putString("_tcfd", zzoqVar.zzd());
            zzR("auto", "_tcf", bundle2);
        }
    }

    public final void zzO(String str, String str2, Bundle bundle) {
        zzP(str, str2, bundle, true, true, this.zzu.zzaU().currentTimeMillis());
    }

    public final void zzP(String str, String str2, Bundle bundle, boolean z4, boolean z5, long j4) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            this.zzu.zzt().zzy(bundle2, j4);
            return;
        }
        boolean z6 = true;
        if (z5 && this.zzd != null && !zzqf.zzap(str2)) {
            z6 = false;
        }
        boolean z7 = z6;
        if (str == null) {
            str = "app";
        }
        zzZ(str, str2, j4, bundle2, z5, z7, z4, null);
    }

    public final void zzQ(String str, String str2, Bundle bundle, String str3) {
        zzio.zzP();
        zzZ("auto", str2, this.zzu.zzaU().currentTimeMillis(), bundle, false, true, true, str3);
    }

    final void zzR(String str, String str2, Bundle bundle) {
        zzg();
        zzS(str, str2, this.zzu.zzaU().currentTimeMillis(), bundle);
    }

    final void zzS(String str, String str2, long j4, Bundle bundle) {
        zzg();
        boolean z4 = true;
        if (this.zzd != null && !zzqf.zzap(str2)) {
            z4 = false;
        }
        zzT(str, str2, j4, bundle, true, z4, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    protected final void zzT(String str, String str2, long j4, Bundle bundle, boolean z4, boolean z5, boolean z6, String str3) {
        boolean z7;
        boolean z8;
        zzio zzioVar;
        long j5;
        long j6;
        String str4;
        zzio zzioVar2;
        long j7;
        Bundle[] bundleArr;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        zzio zzioVar3 = this.zzu;
        if (!zzioVar3.zzJ()) {
            this.zzu.zzaW().zzd().zza("Event not sent since app measurement is disabled");
            return;
        }
        List zzp = this.zzu.zzh().zzp();
        if (zzp != null && !zzp.contains(str2)) {
            this.zzu.zzaW().zzd().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzioVar3.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaT().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzu.zzaT());
                } catch (Exception e4) {
                    this.zzu.zzaW().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e4);
                }
            } catch (ClassNotFoundException unused) {
                this.zzu.zzaW().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            zzio zzioVar4 = this.zzu;
            zzioVar4.zzaV();
            zzan("auto", "_lgclid", bundle.getString("gclid"), zzioVar4.zzaU().currentTimeMillis());
        }
        zzlw zzlwVar = this;
        zzio zzioVar5 = zzlwVar.zzu;
        zzioVar5.zzaV();
        if (z4 && zzqf.zzau(str2)) {
            zzioVar5.zzw().zzO(bundle, zzioVar5.zzm().zzt.zza());
        }
        if (!z6) {
            zzioVar5.zzaV();
            if (!"_iap".equals(str2)) {
                zzio zzioVar6 = zzlwVar.zzu;
                zzqf zzw = zzioVar6.zzw();
                int i4 = 2;
                if (zzw.zzah("event", str2)) {
                    if (zzw.zzae("event", zzjy.zza, zzjy.zzb, str2)) {
                        zzw.zzu.zzf();
                        if (zzw.zzad("event", 40, str2)) {
                            i4 = 0;
                        }
                    } else {
                        i4 = 13;
                    }
                }
                if (i4 != 0) {
                    zzioVar5.zzaW().zzf().zzb("Invalid public event name. Event will not be logged (FE)", zzioVar5.zzj().zzd(str2));
                    zzqf zzw2 = zzioVar6.zzw();
                    zzioVar6.zzf();
                    zzioVar6.zzw().zzR(zzlwVar.zzv, null, i4, "_ev", zzw2.zzG(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzioVar5.zzaV();
        zzio zzioVar7 = zzlwVar.zzu;
        zzmh zzj = zzioVar7.zzt().zzj(false);
        if (zzj != null && !bundle.containsKey("_sc")) {
            zzj.zzd = true;
        }
        zzqf.zzN(zzj, bundle, z4 && !z6);
        boolean equals = "am".equals(str5);
        boolean zzap = zzqf.zzap(str2);
        if (!z4 || zzlwVar.zzd == null || zzap) {
            z7 = equals;
        } else {
            if (!equals) {
                zzioVar5.zzaW().zzd().zzc("Passing event to registered event handler (FE)", zzioVar5.zzj().zzd(str2), zzioVar5.zzj().zzb(bundle));
                Preconditions.checkNotNull(zzlwVar.zzd);
                zzlwVar.zzd.interceptEvent(str5, str2, bundle, j4);
                return;
            }
            z7 = true;
        }
        zzio zzioVar8 = zzlwVar.zzu;
        if (zzioVar8.zzM()) {
            int zzf = zzioVar5.zzw().zzf(str2);
            if (zzf != 0) {
                zzioVar5.zzaW().zzf().zzb("Invalid event name. Event will not be logged (FE)", zzioVar5.zzj().zzd(str2));
                zzqf zzw3 = zzioVar5.zzw();
                zzioVar5.zzf();
                zzioVar8.zzw().zzR(zzlwVar.zzv, str3, zzf, "_ev", zzw3.zzG(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle zzA = zzioVar5.zzw().zzA(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z6);
            Preconditions.checkNotNull(zzA);
            zzioVar5.zzaV();
            if (zzioVar7.zzt().zzj(false) == null || !"_ae".equals(str2)) {
                z8 = 0;
                zzioVar = zzioVar7;
                j5 = 0;
            } else {
                zzon zzonVar = zzioVar7.zzv().zzb;
                j5 = 0;
                long elapsedRealtime = zzonVar.zzc.zzu.zzaU().elapsedRealtime();
                boolean z9 = false;
                zzioVar = zzioVar7;
                long j8 = elapsedRealtime - zzonVar.zzb;
                zzonVar.zzb = elapsedRealtime;
                z8 = z9;
                if (j8 > 0) {
                    zzioVar5.zzw().zzL(zzA, j8);
                    z8 = z9;
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                zzqf zzw4 = zzioVar5.zzw();
                String string = zzA.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                zzio zzioVar9 = zzw4.zzu;
                if (Objects.equals(string, zzioVar9.zzm().zzq.zza())) {
                    zzioVar9.zzaW().zzd().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzioVar9.zzm().zzq.zzb(string);
            } else if ("_ae".equals(str2)) {
                String zza = zzioVar5.zzw().zzu.zzm().zzq.zza();
                if (!TextUtils.isEmpty(zza)) {
                    zzA.putString("_ffr", zza);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzA);
            boolean zzp2 = zzioVar5.zzf().zzx(null, zzgi.zzba) ? zzioVar.zzv().zzp() : zzioVar5.zzm().zzn.zzb();
            if (zzioVar5.zzm().zzk.zza() > j5) {
                zzioVar2 = zzioVar5;
                if (zzioVar5.zzm().zzp(j4) && zzp2) {
                    zzioVar2.zzaW().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                    j6 = j5;
                    str4 = "_ae";
                    zzan("auto", "_sid", null, zzioVar2.zzaU().currentTimeMillis());
                    zzan("auto", "_sno", null, zzioVar2.zzaU().currentTimeMillis());
                    zzan("auto", "_se", null, zzioVar2.zzaU().currentTimeMillis());
                    zzlwVar = this;
                    zzioVar2.zzm().zzl.zzb(j6);
                } else {
                    j6 = j5;
                    str4 = "_ae";
                }
            } else {
                j6 = j5;
                str4 = "_ae";
                zzioVar2 = zzioVar5;
            }
            if (zzA.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j6) == 1) {
                zzioVar2.zzaW().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j7 = j4;
                zzioVar8.zzv().zza.zzb(j7, true);
            } else {
                j7 = j4;
            }
            ArrayList arrayList2 = new ArrayList(zzA.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i5 = z8; i5 < size; i5++) {
                String str6 = (String) arrayList2.get(i5);
                if (str6 != null) {
                    zzioVar2.zzw();
                    Object obj = zzA.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[z8] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        zzA.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i6 = z8;
            while (i6 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i6);
                String str7 = i6 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str5);
                if (z5) {
                    bundle2 = zzioVar2.zzw().zzz(bundle2, null);
                }
                Bundle bundle3 = bundle2;
                zzioVar.zzu().zzM(new zzbh(str7, new zzbf(bundle3), str5, j7), str3);
                if (!z7) {
                    Iterator it = zzlwVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzkc) it.next()).onEvent(str, str2, new Bundle(bundle3), j4);
                    }
                }
                i6++;
                str5 = str;
                j7 = j4;
            }
            zzioVar2.zzaV();
            if (zzioVar.zzt().zzj(z8) == null || !str4.equals(str2)) {
                return;
            }
            zzioVar.zzv().zzb.zzd(true, true, zzioVar2.zzaU().elapsedRealtime());
        }
    }

    final void zzU() {
        zzov zzovVar;
        zzg();
        this.zzn = false;
        if (zzy().isEmpty() || this.zzi || (zzovVar = (zzov) zzy().poll()) == null) {
            return;
        }
        zzio zzioVar = this.zzu;
        AbstractC2416a zzB = zzioVar.zzw().zzB();
        if (zzB != null) {
            this.zzi = true;
            zzhc zzj = zzioVar.zzaW().zzj();
            String str = zzovVar.zza;
            zzj.zzb("Registering trigger URI", str);
            ListenableFuture c4 = zzB.c(Uri.parse(str));
            if (c4 != null) {
                Futures.addCallback(c4, new zzkt(this, zzovVar), new zzks(this));
            } else {
                this.zzi = false;
                zzy().add(zzovVar);
            }
        }
    }

    public final void zzV(zzkc zzkcVar) {
        zza();
        Preconditions.checkNotNull(zzkcVar);
        if (this.zze.add(zzkcVar)) {
            return;
        }
        this.zzu.zzaW().zzk().zza("OnEventListener already registered");
    }

    public final void zzW() {
        zzg();
        zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzd().zza("Register tcfPrefChangeListener.");
        if (this.zzs == null) {
            this.zzt = new zzky(this, this.zzu);
            this.zzs = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzkp
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    zzlw.zzA(zzlw.this, sharedPreferences, str);
                }
            };
        }
        zzioVar.zzm().zza().registerOnSharedPreferenceChangeListener(this.zzs);
    }

    public final void zzX(long j4) {
        this.zzg.set(null);
        this.zzu.zzaX().zzq(new zzle(this, j4));
    }

    final void zzY(Runnable runnable) {
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, zzgi.zzaR)) {
            zza();
            if (zzioVar.zzaX().zzu()) {
                zzioVar.zzaW().zze().zza("Cannot retrieve and upload batches from analytics worker thread");
                return;
            }
            if (zzioVar.zzaX().zzt()) {
                zzioVar.zzaW().zze().zza("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            zzioVar.zzaV();
            if (zzaf.zza()) {
                zzioVar.zzaW().zze().zza("Cannot retrieve and upload batches from main thread");
                return;
            }
            zzioVar.zzaW().zzj().zza("[sgtm] Started client-side batch upload work.");
            boolean z4 = false;
            int i4 = 0;
            int i5 = 0;
            while (!z4) {
                zzioVar.zzaW().zzj().zza("[sgtm] Getting upload batches from service (FE)");
                final AtomicReference atomicReference = new AtomicReference();
                zzioVar.zzaX().zze(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzlw.this.zzu.zzu().zzI(atomicReference, zzpc.zza(zzmf.SGTM_CLIENT));
                    }
                });
                zzpe zzpeVar = (zzpe) atomicReference.get();
                if (zzpeVar == null) {
                    break;
                }
                List list = zzpeVar.zza;
                if (!list.isEmpty()) {
                    zzioVar.zzaW().zzj().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                    i4 += list.size();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z4 = false;
                            break;
                        }
                        zzme zzar = zzar((zzpa) it.next());
                        if (zzar == zzme.SUCCESS) {
                            i5++;
                        } else if (zzar == zzme.BACKOFF) {
                            z4 = true;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            zzioVar.zzaW().zzj().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i4), Integer.valueOf(i5));
            runnable.run();
        }
    }

    protected final void zzZ(String str, String str2, long j4, Bundle bundle, boolean z4, boolean z5, boolean z6, String str3) {
        int i4 = zzqf.zza;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i5 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i5 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i5];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i5] = new Bundle((Bundle) parcelable);
                        }
                        i5++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i5 < list.size()) {
                        Object obj2 = list.get(i5);
                        if (obj2 instanceof Bundle) {
                            list.set(i5, new Bundle((Bundle) obj2));
                        }
                        i5++;
                    }
                }
            }
        }
        this.zzu.zzaX().zzq(new zzkz(this, str, str2, j4, bundle2, z4, z5, z6, str3));
    }

    final void zzaa(String str, String str2, long j4, Object obj) {
        this.zzu.zzaX().zzq(new zzla(this, str, str2, obj, j4));
    }

    final void zzab(long j4) {
        zzg();
        if (this.zzl == null) {
            this.zzl = new zzkr(this, this.zzu);
        }
        this.zzl.zzd(j4);
    }

    final void zzac(String str) {
        this.zzg.set(str);
    }

    public final void zzad(Bundle bundle) {
        zzae(bundle, this.zzu.zzaU().currentTimeMillis());
    }

    public final void zzae(Bundle bundle, long j4) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzu.zzaW().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzjt.zza(bundle2, "app_id", String.class, null);
        zzjt.zza(bundle2, "origin", String.class, null);
        zzjt.zza(bundle2, "name", String.class, null);
        zzjt.zza(bundle2, "value", Object.class, null);
        zzjt.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzjt.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzjt.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzjt.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzjt.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzjt.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzjt.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzjt.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzjt.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j4);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zzio zzioVar = this.zzu;
        if (zzioVar.zzw().zzj(string) != 0) {
            zzioVar.zzaW().zze().zzb("Invalid conditional user property name", zzioVar.zzj().zzf(string));
            return;
        }
        if (zzioVar.zzw().zzd(string, obj) != 0) {
            zzioVar.zzaW().zze().zzc("Invalid conditional user property value", zzioVar.zzj().zzf(string), obj);
            return;
        }
        Object zzE = zzioVar.zzw().zzE(string, obj);
        if (zzE == null) {
            zzioVar.zzaW().zze().zzc("Unable to normalize conditional user property value", zzioVar.zzj().zzf(string), obj);
            return;
        }
        zzjt.zzb(bundle2, zzE);
        long j5 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            zzioVar.zzf();
            if (j5 > 15552000000L || j5 < 1) {
                zzioVar.zzaW().zze().zzc("Invalid conditional user property timeout", zzioVar.zzj().zzf(string), Long.valueOf(j5));
                return;
            }
        }
        long j6 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        zzioVar.zzf();
        if (j6 > 15552000000L || j6 < 1) {
            zzioVar.zzaW().zze().zzc("Invalid conditional user property time to live", zzioVar.zzj().zzf(string), Long.valueOf(j6));
        } else {
            zzioVar.zzaX().zzq(new zzlf(this, bundle2));
        }
    }

    final void zzaf(Bundle bundle, int i4, long j4) {
        zzjw[] zzjwVarArr;
        Object obj;
        String string;
        zza();
        zzjx zzjxVar = zzjx.zza;
        zzjwVarArr = zzjv.STORAGE.zzd;
        int length = zzjwVarArr.length;
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= length) {
                break;
            }
            String str = zzjwVarArr[i5].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i5++;
        }
        if (obj != null) {
            zzio zzioVar = this.zzu;
            zzioVar.zzaW().zzl().zzb("Ignoring invalid consent setting", obj);
            zzioVar.zzaW().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zzu = this.zzu.zzaX().zzu();
        zzjx zzi = zzjx.zzi(bundle, i4);
        if (zzi.zzt()) {
            zzak(zzi, zzu);
        }
        zzba zzc = zzba.zzc(bundle, i4);
        if (zzc.zzk()) {
            zzag(zzc, zzu);
        }
        Boolean zzg = zzba.zzg(bundle);
        if (zzg != null) {
            String str2 = i4 == -30 ? "tcf" : "app";
            if (zzu) {
                zzan(str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, zzg.toString(), j4);
            } else {
                zzam(str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, zzg.toString(), false, j4);
            }
        }
    }

    final void zzag(zzba zzbaVar, boolean z4) {
        zzlq zzlqVar = new zzlq(this, zzbaVar);
        if (!z4) {
            this.zzu.zzaX().zzq(zzlqVar);
        } else {
            zzg();
            zzlqVar.run();
        }
    }

    public final void zzah(zzkb zzkbVar) {
        zzkb zzkbVar2;
        zzg();
        zza();
        if (zzkbVar != null && zzkbVar != (zzkbVar2 = this.zzd)) {
            Preconditions.checkState(zzkbVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzkbVar;
    }

    public final void zzai(Boolean bool) {
        zza();
        this.zzu.zzaX().zzq(new zzlp(this, bool));
    }

    final void zzaj(zzjx zzjxVar) {
        zzg();
        boolean z4 = (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE) && zzjxVar.zzr(zzjw.AD_STORAGE)) || this.zzu.zzu().zzab();
        zzio zzioVar = this.zzu;
        if (z4 != zzioVar.zzK()) {
            zzioVar.zzG(z4);
            zzht zzm = this.zzu.zzm();
            zzio zzioVar2 = zzm.zzu;
            zzm.zzg();
            Boolean valueOf = zzm.zzb().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zzb().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z4 || valueOf == null || valueOf.booleanValue()) {
                zzas(Boolean.valueOf(z4), false);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void zzak(com.google.android.gms.measurement.internal.zzjx r10, boolean r11) {
        /*
            r9 = this;
            r9.zza()
            int r0 = r10.zzb()
            r1 = -10
            if (r0 == r1) goto L2a
            com.google.android.gms.measurement.internal.zzju r2 = r10.zze()
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzju.UNINITIALIZED
            if (r2 != r3) goto L2a
            com.google.android.gms.measurement.internal.zzju r2 = r10.zzf()
            if (r2 == r3) goto L1a
            goto L2a
        L1a:
            com.google.android.gms.measurement.internal.zzio r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzl()
            java.lang.String r11 = "Ignoring empty consent settings"
            r10.zza(r11)
            return
        L2a:
            java.lang.Object r2 = r9.zzh
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.zzjx r3 = r9.zzo     // Catch: java.lang.Throwable -> Lcb
            int r3 = r3.zzb()     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.measurement.internal.zzjx.zzs(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            r4 = 0
            if (r3 == 0) goto L64
            com.google.android.gms.measurement.internal.zzjx r3 = r9.zzo     // Catch: java.lang.Throwable -> L53
            boolean r3 = r10.zzu(r3)     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzjw r5 = com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L53
            boolean r6 = r10.zzr(r5)     // Catch: java.lang.Throwable -> L53
            r7 = 1
            if (r6 == 0) goto L58
            com.google.android.gms.measurement.internal.zzjx r6 = r9.zzo     // Catch: java.lang.Throwable -> L53
            boolean r5 = r6.zzr(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L58
            r4 = r7
            goto L58
        L53:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto Lce
        L58:
            com.google.android.gms.measurement.internal.zzjx r5 = r9.zzo     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzjx r10 = r10.zzm(r5)     // Catch: java.lang.Throwable -> L53
            r9.zzo = r10     // Catch: java.lang.Throwable -> L53
            r8 = r4
            r4 = r7
        L62:
            r5 = r10
            goto L67
        L64:
            r3 = r4
            r8 = r3
            goto L62
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcb
            if (r4 != 0) goto L7a
            com.google.android.gms.measurement.internal.zzio r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzi()
            java.lang.String r11 = "Ignoring lower-priority consent settings, proposed settings"
            r10.zzb(r11, r5)
            return
        L7a:
            java.util.concurrent.atomic.AtomicLong r10 = r9.zzp
            long r6 = r10.getAndIncrement()
            if (r3 == 0) goto La1
            java.util.concurrent.atomic.AtomicReference r10 = r9.zzg
            r0 = 0
            r10.set(r0)
            com.google.android.gms.measurement.internal.zzlr r3 = new com.google.android.gms.measurement.internal.zzlr
            r4 = r9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto L97
            r9.zzg()
            r3.run()
            return
        L97:
            com.google.android.gms.measurement.internal.zzio r10 = r4.zzu
            com.google.android.gms.measurement.internal.zzil r10 = r10.zzaX()
            r10.zzr(r3)
            return
        La1:
            r4 = r9
            com.google.android.gms.measurement.internal.zzls r3 = new com.google.android.gms.measurement.internal.zzls
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto Lb0
            r9.zzg()
            r3.run()
            return
        Lb0:
            r10 = 30
            if (r0 == r10) goto Lc1
            if (r0 != r1) goto Lb7
            goto Lc1
        Lb7:
            com.google.android.gms.measurement.internal.zzio r10 = r4.zzu
            com.google.android.gms.measurement.internal.zzil r10 = r10.zzaX()
            r10.zzq(r3)
            return
        Lc1:
            com.google.android.gms.measurement.internal.zzio r10 = r4.zzu
            com.google.android.gms.measurement.internal.zzil r10 = r10.zzaX()
            r10.zzr(r3)
            return
        Lcb:
            r0 = move-exception
            r4 = r9
        Lcd:
            r10 = r0
        Lce:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            throw r10
        Ld0:
            r0 = move-exception
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlw.zzak(com.google.android.gms.measurement.internal.zzjx, boolean):void");
    }

    public final void zzal(String str, String str2, Object obj, boolean z4) {
        zzam(str, str2, obj, z4, this.zzu.zzaU().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzam(String str, String str2, Object obj, boolean z4, long j4) {
        int i4;
        int i5;
        if (z4) {
            i5 = this.zzu.zzw().zzj(str2);
        } else {
            zzqf zzw = this.zzu.zzw();
            if (zzw.zzah("user property", str2)) {
                if (zzw.zzae("user property", zzka.zza, null, str2)) {
                    zzw.zzu.zzf();
                    if (zzw.zzad("user property", 24, str2)) {
                        i4 = 0;
                        if (i4 != 0) {
                            zzio zzioVar = this.zzu;
                            zzqf zzw2 = zzioVar.zzw();
                            zzioVar.zzf();
                            this.zzu.zzw().zzR(this.zzv, null, i4, "_ev", zzw2.zzG(str2, 24, true), str2 != null ? str2.length() : 0);
                            return;
                        }
                        String str3 = str == null ? "app" : str;
                        if (obj == null) {
                            zzaa(str3, str2, j4, null);
                            return;
                        }
                        zzio zzioVar2 = this.zzu;
                        int zzd = zzioVar2.zzw().zzd(str2, obj);
                        if (zzd == 0) {
                            Object zzE = zzioVar2.zzw().zzE(str2, obj);
                            if (zzE != null) {
                                zzaa(str3, str2, j4, zzE);
                                return;
                            }
                            return;
                        }
                        zzqf zzw3 = zzioVar2.zzw();
                        zzioVar2.zzf();
                        this.zzu.zzw().zzR(this.zzv, null, zzd, "_ev", zzw3.zzG(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                        return;
                    }
                } else {
                    i5 = 15;
                }
            }
            i4 = 6;
            if (i4 != 0) {
            }
        }
        i4 = i5;
        if (i4 != 0) {
        }
    }

    final void zzan(String str, String str2, Object obj, long j4) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        Object obj2 = obj;
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j5 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    zzio zzioVar = this.zzu;
                    Long valueOf = Long.valueOf(j5);
                    zzioVar.zzm().zzh.zzb(valueOf.longValue() == 1 ? com.ironsource.mediationsdk.metadata.a.f17681g : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    this.zzu.zzaW().zzj().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                    obj2 = obj;
                }
            }
            if (obj == null) {
                this.zzu.zzm().zzh.zzb("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.zzu.zzaW().zzj().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        zzio zzioVar2 = this.zzu;
        if (!zzioVar2.zzJ()) {
            this.zzu.zzaW().zzj().zza("User property not set since app measurement is disabled");
        } else if (zzioVar2.zzM()) {
            this.zzu.zzu().zzY(new zzqb(str4, j4, obj3, str));
        }
    }

    public final void zzao(zzkc zzkcVar) {
        zza();
        Preconditions.checkNotNull(zzkcVar);
        if (this.zze.remove(zzkcVar)) {
            return;
        }
        this.zzu.zzaW().zzk().zza("OnEventListener had not been registered");
    }

    final boolean zzap() {
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return false;
    }

    public final int zzi(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzu.zzf();
        return 25;
    }

    public final Boolean zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzu.zzaX().zze(atomicReference, 15000L, "boolean test flag value", new zzlb(this, atomicReference));
    }

    public final Double zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzu.zzaX().zze(atomicReference, 15000L, "double test flag value", new zzlo(this, atomicReference));
    }

    public final Integer zzp() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzu.zzaX().zze(atomicReference, 15000L, "int test flag value", new zzln(this, atomicReference));
    }

    public final Long zzq() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzu.zzaX().zze(atomicReference, 15000L, "long test flag value", new zzlm(this, atomicReference));
    }

    public final String zzr() {
        return (String) this.zzg.get();
    }

    public final String zzs() {
        zzmh zzi = this.zzu.zzt().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzt() {
        zzmh zzi = this.zzu.zzt().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzu() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzu.zzaX().zze(atomicReference, 15000L, "String test flag value", new zzll(this, atomicReference));
    }

    public final ArrayList zzv(String str, String str2) {
        zzio zzioVar = this.zzu;
        if (zzioVar.zzaX().zzu()) {
            zzioVar.zzaW().zze().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        zzioVar.zzaV();
        if (zzaf.zza()) {
            zzioVar.zzaW().zze().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zze(atomicReference, 5000L, "get conditional user properties", new zzlh(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzqf.zzK(list);
        }
        zzioVar.zzaW().zze().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzw(boolean z4) {
        zza();
        zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzj().zza("Getting user properties (FE)");
        if (zzioVar.zzaX().zzu()) {
            zzioVar.zzaW().zze().zza("Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        zzioVar.zzaV();
        if (zzaf.zza()) {
            zzioVar.zzaW().zze().zza("Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zze(atomicReference, 5000L, "get user properties", new zzlc(this, atomicReference, z4));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzioVar.zzaW().zze().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z4));
        return Collections.EMPTY_LIST;
    }

    public final Map zzx(String str, String str2, boolean z4) {
        zzio zzioVar = this.zzu;
        if (zzioVar.zzaX().zzu()) {
            zzioVar.zzaW().zze().zza("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        zzioVar.zzaV();
        if (zzaf.zza()) {
            zzioVar.zzaW().zze().zza("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zze(atomicReference, 5000L, "get user properties", new zzli(this, atomicReference, null, str, str2, z4));
        List<zzqb> list = (List) atomicReference.get();
        if (list == null) {
            zzioVar.zzaW().zze().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z4));
            return Collections.EMPTY_MAP;
        }
        androidx.collection.a aVar = new androidx.collection.a(list.size());
        for (zzqb zzqbVar : list) {
            Object zza = zzqbVar.zza();
            if (zza != null) {
                aVar.put(zzqbVar.zzb, zza);
            }
        }
        return aVar;
    }

    final PriorityQueue zzy() {
        if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.zzkf
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((zzov) obj).zzb);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzkh
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.zzm;
    }
}
