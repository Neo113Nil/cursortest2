package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.baidu.ar.constants.HttpConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzij extends zzf {

    @VisibleForTesting
    protected zzii zza;
    final zzs zzb;

    @VisibleForTesting
    protected boolean zzc;
    private zzhe zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;

    @GuardedBy("consentLock")
    private zzai zzi;

    @GuardedBy("consentLock")
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzln zzn;

    protected zzij(zzge zzgeVar) {
        super(zzgeVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzhy(this);
        this.zzg = new AtomicReference();
        this.zzi = new zzai(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzs(zzgeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzaa(Boolean bool, boolean z7) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzt.zzm().zzh(bool);
        if (z7) {
            zzfj zzm = this.zzt.zzm();
            zzge zzgeVar = zzm.zzt;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzt.zzK() || !(bool == null || bool.booleanValue())) {
            zzab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzab() {
        zzg();
        String zza = this.zzt.zzm().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zzY("app", "_npa", null, this.zzt.zzax().currentTimeMillis());
            } else {
                zzY("app", "_npa", Long.valueOf(true != "true".equals(zza) ? 0L : 1L), this.zzt.zzax().currentTimeMillis());
            }
        }
        if (!this.zzt.zzJ() || !this.zzc) {
            this.zzt.zzaA().zzc().zza("Updating Scion state (FE)");
            this.zzt.zzt().zzI();
            return;
        }
        this.zzt.zzaA().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzpe.zzc();
        if (this.zzt.zzf().zzs(null, zzeh.zzaf)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzt.zzaB().zzp(new zzhm(this));
    }

    static /* bridge */ /* synthetic */ void zzv(zzij zzijVar, zzai zzaiVar, zzai zzaiVar2) {
        boolean z7;
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i8 = 0;
        while (true) {
            if (i8 >= 2) {
                z7 = false;
                break;
            }
            zzah zzahVar = zzahVarArr[i8];
            if (!zzaiVar2.zzi(zzahVar) && zzaiVar.zzi(zzahVar)) {
                z7 = true;
                break;
            }
            i8++;
        }
        boolean zzl = zzaiVar.zzl(zzaiVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z7 || zzl) {
            zzijVar.zzt.zzh().zzo();
        }
    }

    static /* synthetic */ void zzw(zzij zzijVar, zzai zzaiVar, int i8, long j8, boolean z7, boolean z8) {
        zzijVar.zzg();
        zzijVar.zza();
        if (j8 <= zzijVar.zzl && zzai.zzj(zzijVar.zzm, i8)) {
            zzijVar.zzt.zzaA().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzaiVar);
            return;
        }
        zzfj zzm = zzijVar.zzt.zzm();
        zzge zzgeVar = zzm.zzt;
        zzm.zzg();
        if (!zzm.zzl(i8)) {
            zzijVar.zzt.zzaA().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i8));
            return;
        }
        SharedPreferences.Editor edit = zzm.zza().edit();
        edit.putString("consent_settings", zzaiVar.zzh());
        edit.putInt("consent_source", i8);
        edit.apply();
        zzijVar.zzl = j8;
        zzijVar.zzm = i8;
        zzijVar.zzt.zzt().zzF(z7);
        if (z8) {
            zzijVar.zzt.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzt.zzaB().zzp(new zzht(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzt.zzaw().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzt.zzaw().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzt.zzv().zzag(obj)) {
                    this.zzt.zzv().zzO(this.zzn, null, 27, null, null, 0);
                }
                this.zzt.zzaA().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlo.zzaj(str)) {
                this.zzt.zzaA().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzlo zzv = this.zzt.zzv();
                this.zzt.zzf();
                if (zzv.zzab("param", str, 100, obj)) {
                    this.zzt.zzv().zzP(zza, str, obj);
                }
            }
        }
        this.zzt.zzv();
        int zzc = this.zzt.zzf().zzc();
        if (zza.size() > zzc) {
            int i8 = 0;
            for (String str2 : new TreeSet(zza.keySet())) {
                i8++;
                if (i8 > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzt.zzv().zzO(this.zzn, null, 26, null, null, 0);
            this.zzt.zzaA().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzt.zzm().zzs.zzb(zza);
        this.zzt.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == FirebaseAnalytics.Event.SCREEN_VIEW || (str2 != null && str2.equals(FirebaseAnalytics.Event.SCREEN_VIEW))) {
            this.zzt.zzs().zzx(bundle2, j8);
        } else {
            zzM(str == null ? "app" : str, str2, j8, bundle2, z8, !z8 || this.zzd == null || zzlo.zzaj(str2), z7, null);
        }
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzge.zzO();
        zzM(TtmlNode.TEXT_EMPHASIS_AUTO, str2, this.zzt.zzax().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @WorkerThread
    final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzax().currentTimeMillis(), bundle);
    }

    @WorkerThread
    final void zzH(String str, String str2, long j8, Bundle bundle) {
        zzg();
        zzI(str, str2, j8, bundle, true, this.zzd == null || zzlo.zzaj(str2), true, null);
    }

    @WorkerThread
    protected final void zzI(String str, String str2, long j8, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        boolean z10;
        String str4;
        ArrayList arrayList;
        long j9;
        Bundle[] bundleArr;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzt.zzJ()) {
            this.zzt.zzaA().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List zzn = this.zzt.zzh().zzn();
        if (zzn != null && !zzn.contains(str2)) {
            this.zzt.zzaA().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzt.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzaw().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzt.zzaw());
                } catch (Exception e8) {
                    this.zzt.zzaA().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e8);
                }
            } catch (ClassNotFoundException unused) {
                this.zzt.zzaA().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.zzt.zzay();
            zzY(TtmlNode.TEXT_EMPHASIS_AUTO, "_lgclid", bundle.getString("gclid"), this.zzt.zzax().currentTimeMillis());
        }
        this.zzt.zzay();
        if (z7 && zzlo.zzan(str2)) {
            this.zzt.zzv().zzL(bundle, this.zzt.zzm().zzs.zza());
        }
        if (!z9) {
            this.zzt.zzay();
            if (!"_iap".equals(str2)) {
                zzlo zzv = this.zzt.zzv();
                int i8 = 2;
                if (zzv.zzad(NotificationCompat.CATEGORY_EVENT, str2)) {
                    if (zzv.zzaa(NotificationCompat.CATEGORY_EVENT, zzhb.zza, zzhb.zzb, str2)) {
                        zzv.zzt.zzf();
                        if (zzv.zzZ(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                            i8 = 0;
                        }
                    } else {
                        i8 = 13;
                    }
                }
                if (i8 != 0) {
                    this.zzt.zzaA().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                    zzlo zzv2 = this.zzt.zzv();
                    this.zzt.zzf();
                    this.zzt.zzv().zzO(this.zzn, null, i8, "_ev", zzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        this.zzt.zzay();
        zziq zzj = this.zzt.zzs().zzj(false);
        if (zzj != null && !bundle.containsKey("_sc")) {
            zzj.zzd = true;
        }
        zzlo.zzK(zzj, bundle, z7 && !z9);
        boolean equals = "am".equals(str);
        boolean zzaj = zzlo.zzaj(str2);
        if (!z7 || this.zzd == null || zzaj) {
            z10 = equals;
        } else {
            if (!equals) {
                this.zzt.zzaA().zzc().zzc("Passing event to registered event handler (FE)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j8);
                return;
            }
            z10 = true;
        }
        if (this.zzt.zzM()) {
            int zzh = this.zzt.zzv().zzh(str2);
            if (zzh != 0) {
                this.zzt.zzaA().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                zzlo zzv3 = this.zzt.zzv();
                this.zzt.zzf();
                this.zzt.zzv().zzO(this.zzn, str3, zzh, "_ev", zzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            String str5 = "_o";
            Bundle zzu = this.zzt.zzv().zzu(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z9);
            Preconditions.checkNotNull(zzu);
            this.zzt.zzay();
            if (this.zzt.zzs().zzj(false) != null && "_ae".equals(str2)) {
                zzkm zzkmVar = this.zzt.zzu().zzb;
                long elapsedRealtime = zzkmVar.zzc.zzt.zzax().elapsedRealtime();
                long j10 = elapsedRealtime - zzkmVar.zzb;
                zzkmVar.zzb = elapsedRealtime;
                if (j10 > 0) {
                    this.zzt.zzv().zzI(zzu, j10);
                }
            }
            zzos.zzc();
            if (this.zzt.zzf().zzs(null, zzeh.zzae)) {
                if (!TtmlNode.TEXT_EMPHASIS_AUTO.equals(str) && "_ssr".equals(str2)) {
                    zzlo zzv4 = this.zzt.zzv();
                    String string = zzu.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzlm.zza(string, zzv4.zzt.zzm().zzp.zza())) {
                        zzv4.zzt.zzaA().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzv4.zzt.zzm().zzp.zzb(string);
                } else if ("_ae".equals(str2)) {
                    String zza = this.zzt.zzv().zzt.zzm().zzp.zza();
                    if (!TextUtils.isEmpty(zza)) {
                        zzu.putString("_ffr", zza);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(zzu);
            if (this.zzt.zzm().zzj.zza() > 0 && this.zzt.zzm().zzk(j8) && this.zzt.zzm().zzm.zzb()) {
                this.zzt.zzaA().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                arrayList = arrayList2;
                j9 = 0;
                str4 = "_ae";
                zzY(TtmlNode.TEXT_EMPHASIS_AUTO, "_sid", null, this.zzt.zzax().currentTimeMillis());
                zzY(TtmlNode.TEXT_EMPHASIS_AUTO, "_sno", null, this.zzt.zzax().currentTimeMillis());
                zzY(TtmlNode.TEXT_EMPHASIS_AUTO, "_se", null, this.zzt.zzax().currentTimeMillis());
                this.zzt.zzm().zzk.zzb(0L);
            } else {
                str4 = "_ae";
                arrayList = arrayList2;
                j9 = 0;
            }
            if (zzu.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j9) == 1) {
                this.zzt.zzaA().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzt.zzu().zza.zzb(j8, true);
            }
            ArrayList arrayList3 = new ArrayList(zzu.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            for (int i9 = 0; i9 < size; i9++) {
                String str6 = (String) arrayList3.get(i9);
                if (str6 != null) {
                    this.zzt.zzv();
                    Object obj = zzu.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        zzu.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i10 = 0;
            while (i10 < arrayList.size()) {
                ArrayList arrayList5 = arrayList;
                Bundle bundle2 = (Bundle) arrayList5.get(i10);
                String str7 = i10 != 0 ? "_ep" : str2;
                bundle2.putString(str5, str);
                if (z8) {
                    bundle2 = this.zzt.zzv().zzt(bundle2);
                }
                Bundle bundle3 = bundle2;
                String str8 = str5;
                this.zzt.zzt().zzA(new zzaw(str7, new zzau(bundle3), str, j8), str3);
                if (!z10) {
                    Iterator it = this.zze.iterator();
                    while (it.hasNext()) {
                        ((zzhf) it.next()).onEvent(str, str2, new Bundle(bundle3), j8);
                    }
                }
                i10++;
                arrayList = arrayList5;
                str5 = str8;
            }
            this.zzt.zzay();
            if (this.zzt.zzs().zzj(false) == null || !str4.equals(str2)) {
                return;
            }
            this.zzt.zzu().zzb.zzd(true, true, this.zzt.zzax().elapsedRealtime());
        }
    }

    public final void zzJ(zzhf zzhfVar) {
        zza();
        Preconditions.checkNotNull(zzhfVar);
        if (this.zze.add(zzhfVar)) {
            return;
        }
        this.zzt.zzaA().zzk().zza("OnEventListener already registered");
    }

    public final void zzK(long j8) {
        this.zzg.set(null);
        this.zzt.zzaB().zzp(new zzhr(this, j8));
    }

    final void zzL(long j8, boolean z7) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zza("Resetting analytics data (FE)");
        zzko zzu = this.zzt.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        zzqr.zzc();
        if (this.zzt.zzf().zzs(null, zzeh.zzan)) {
            this.zzt.zzh().zzo();
        }
        boolean zzJ = this.zzt.zzJ();
        zzfj zzm = this.zzt.zzm();
        zzm.zzc.zzb(j8);
        if (!TextUtils.isEmpty(zzm.zzt.zzm().zzp.zza())) {
            zzm.zzp.zzb(null);
        }
        zzpe.zzc();
        zzag zzf = zzm.zzt.zzf();
        zzeg zzegVar = zzeh.zzaf;
        if (zzf.zzs(null, zzegVar)) {
            zzm.zzj.zzb(0L);
        }
        zzm.zzk.zzb(0L);
        if (!zzm.zzt.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzq.zzb(null);
        zzm.zzr.zzb(0L);
        zzm.zzs.zzb(null);
        if (z7) {
            this.zzt.zzt().zzC();
        }
        zzpe.zzc();
        if (this.zzt.zzf().zzs(null, zzegVar)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    protected final void zzM(String str, String str2, long j8, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i8 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i8 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i8];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i8] = new Bundle((Bundle) parcelable);
                        }
                        i8++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i8 < list.size()) {
                        Object obj2 = list.get(i8);
                        if (obj2 instanceof Bundle) {
                            list.set(i8, new Bundle((Bundle) obj2));
                        }
                        i8++;
                    }
                }
            }
        }
        this.zzt.zzaB().zzp(new zzho(this, str, str2, j8, bundle2, z7, z8, z9, str3));
    }

    final void zzN(String str, String str2, long j8, Object obj) {
        this.zzt.zzaB().zzp(new zzhp(this, str, str2, obj, j8));
    }

    final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j8) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(HttpConstants.HTTP_APP_ID))) {
            this.zzt.zzaA().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(HttpConstants.HTTP_APP_ID);
        Preconditions.checkNotNull(bundle2);
        zzha.zza(bundle2, HttpConstants.HTTP_APP_ID, String.class, null);
        zzha.zza(bundle2, "origin", String.class, null);
        zzha.zza(bundle2, "name", String.class, null);
        zzha.zza(bundle2, "value", Object.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j8);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzt.zzv().zzl(string) != 0) {
            this.zzt.zzaA().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(string));
            return;
        }
        if (this.zzt.zzv().zzd(string, obj) != 0) {
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        Object zzB = this.zzt.zzv().zzB(string, obj);
        if (zzB == null) {
            this.zzt.zzaA().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        zzha.zzb(bundle2, zzB);
        long j9 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.zzt.zzf();
            if (j9 > 15552000000L || j9 < 1) {
                this.zzt.zzaA().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(string), Long.valueOf(j9));
                return;
            }
        }
        long j10 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.zzt.zzf();
        if (j10 > 15552000000L || j10 < 1) {
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(string), Long.valueOf(j10));
        } else {
            this.zzt.zzaB().zzp(new zzhs(this, bundle2));
        }
    }

    public final void zzR(Bundle bundle, int i8, long j8) {
        zza();
        String zzg = zzai.zzg(bundle);
        if (zzg != null) {
            this.zzt.zzaA().zzl().zzb("Ignoring invalid consent setting", zzg);
            this.zzt.zzaA().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzai.zza(bundle), i8, j8);
    }

    public final void zzS(zzai zzaiVar, int i8, long j8) {
        zzai zzaiVar2;
        boolean z7;
        boolean z8;
        boolean z9;
        zzai zzaiVar3 = zzaiVar;
        zza();
        if (i8 != -10 && zzaiVar.zze() == null && zzaiVar.zzf() == null) {
            this.zzt.zzaA().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            try {
                zzaiVar2 = this.zzi;
                z7 = false;
                if (zzai.zzj(i8, this.zzj)) {
                    z8 = zzaiVar3.zzk(this.zzi);
                    zzah zzahVar = zzah.ANALYTICS_STORAGE;
                    if (zzaiVar3.zzi(zzahVar) && !this.zzi.zzi(zzahVar)) {
                        z7 = true;
                    }
                    zzaiVar3 = zzaiVar3.zzd(this.zzi);
                    this.zzi = zzaiVar3;
                    this.zzj = i8;
                    z9 = z7;
                    z7 = true;
                } else {
                    z8 = false;
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z7) {
            this.zzt.zzaA().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzaiVar3);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (z8) {
            this.zzg.set(null);
            this.zzt.zzaB().zzq(new zzie(this, zzaiVar3, j8, i8, andIncrement, z9, zzaiVar2));
            return;
        }
        zzif zzifVar = new zzif(this, zzaiVar3, i8, andIncrement, z9, zzaiVar2);
        if (i8 == 30 || i8 == -10) {
            this.zzt.zzaB().zzq(zzifVar);
        } else {
            this.zzt.zzaB().zzp(zzifVar);
        }
    }

    @WorkerThread
    public final void zzT(zzhe zzheVar) {
        zzhe zzheVar2;
        zzg();
        zza();
        if (zzheVar != null && zzheVar != (zzheVar2 = this.zzd)) {
            Preconditions.checkState(zzheVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzheVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaB().zzp(new zzid(this, bool));
    }

    @WorkerThread
    final void zzV(zzai zzaiVar) {
        zzg();
        boolean z7 = (zzaiVar.zzi(zzah.ANALYTICS_STORAGE) && zzaiVar.zzi(zzah.AD_STORAGE)) || this.zzt.zzt().zzM();
        if (z7 != this.zzt.zzK()) {
            this.zzt.zzG(z7);
            zzfj zzm = this.zzt.zzm();
            zzge zzgeVar = zzm.zzt;
            zzm.zzg();
            Boolean valueOf = zzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z7 || valueOf == null || valueOf.booleanValue()) {
                zzaa(Boolean.valueOf(z7), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z7) {
        zzX(TtmlNode.TEXT_EMPHASIS_AUTO, "_ldl", obj, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzX(String str, String str2, Object obj, boolean z7, long j8) {
        int i8;
        if (z7) {
            i8 = this.zzt.zzv().zzl(str2);
        } else {
            zzlo zzv = this.zzt.zzv();
            if (zzv.zzad("user property", str2)) {
                if (zzv.zzaa("user property", zzhd.zza, null, str2)) {
                    zzv.zzt.zzf();
                    if (zzv.zzZ("user property", 24, str2)) {
                        i8 = 0;
                    }
                } else {
                    i8 = 15;
                }
            }
            i8 = 6;
        }
        if (i8 != 0) {
            zzlo zzv2 = this.zzt.zzv();
            this.zzt.zzf();
            this.zzt.zzv().zzO(this.zzn, null, i8, "_ev", zzv2.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            zzN(str3, str2, j8, null);
            return;
        }
        int zzd = this.zzt.zzv().zzd(str2, obj);
        if (zzd != 0) {
            zzlo zzv3 = this.zzt.zzv();
            this.zzt.zzf();
            this.zzt.zzv().zzO(this.zzn, null, zzd, "_ev", zzv3.zzD(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        } else {
            Object zzB = this.zzt.zzv().zzB(str2, obj);
            if (zzB != null) {
                zzN(str3, str2, j8, zzB);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzY(String str, String str2, Object obj, long j8) {
        String str3;
        Object obj2;
        Object obj3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    Long valueOf = Long.valueOf(true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    this.zzt.zzm().zzh.zzb(valueOf.longValue() == 1 ? "true" : "false");
                    obj3 = valueOf;
                    obj2 = obj3;
                    str3 = "_npa";
                    if (!this.zzt.zzJ()) {
                        this.zzt.zzaA().zzj().zza("User property not set since app measurement is disabled");
                        return;
                    } else {
                        if (this.zzt.zzM()) {
                            this.zzt.zzt().zzK(new zzlj(str3, j8, obj2, str));
                            return;
                        }
                        return;
                    }
                }
            }
            if (obj == null) {
                this.zzt.zzm().zzh.zzb("unset");
                obj3 = obj;
                obj2 = obj3;
                str3 = "_npa";
                if (!this.zzt.zzJ()) {
                }
            }
        }
        str3 = str2;
        obj2 = obj;
        if (!this.zzt.zzJ()) {
        }
    }

    public final void zzZ(zzhf zzhfVar) {
        zza();
        Preconditions.checkNotNull(zzhfVar);
        if (this.zze.remove(zzhfVar)) {
            return;
        }
        this.zzt.zzaA().zzk().zza("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaB().zzd(atomicReference, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "boolean test flag value", new zzhv(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaB().zzd(atomicReference, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "double test flag value", new zzic(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaB().zzd(atomicReference, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "int test flag value", new zzib(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaB().zzd(atomicReference, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "long test flag value", new zzia(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zziq zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zziq zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaB().zzd(atomicReference, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "String test flag value", new zzhz(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get conditional user properties", new zzhu(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlo.zzH(list);
        }
        this.zzt.zzaA().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzt(boolean z7) {
        zza();
        this.zzt.zzaA().zzj().zza("Getting user properties (FE)");
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhq(this, atomicReference, z7));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.zzt.zzaA().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z7));
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z7) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhw(this, atomicReference, null, str, str2, z7));
        List<zzlj> list = (List) atomicReference.get();
        if (list == null) {
            this.zzt.zzaA().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z7));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzlj zzljVar : list) {
            Object zza = zzljVar.zza();
            if (zza != null) {
                arrayMap.put(zzljVar.zzb, zza);
            }
        }
        return arrayMap;
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzeh.zzZ)) {
                zzag zzf = this.zzt.zzf();
                zzf.zzt.zzay();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzt.zzaA().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhl
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzij zzijVar = zzij.this;
                            zzijVar.zzg();
                            if (zzijVar.zzt.zzm().zzn.zzb()) {
                                zzijVar.zzt.zzaA().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long zza = zzijVar.zzt.zzm().zzo.zza();
                            zzijVar.zzt.zzm().zzo.zzb(1 + zza);
                            zzijVar.zzt.zzf();
                            if (zza < 5) {
                                zzijVar.zzt.zzE();
                            } else {
                                zzijVar.zzt.zzaA().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzijVar.zzt.zzm().zzn.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzfj zzm = this.zzt.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzt.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzt.zzg().zzv();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG(TtmlNode.TEXT_EMPHASIS_AUTO, "_ou", bundle);
        }
    }
}
