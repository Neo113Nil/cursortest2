package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzrg;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class zzel extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    zzel(zzge zzgeVar, long j8) {
        super(zzgeVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j8;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(1:3)(6:67|68|(1:70)(2:85|(1:87))|71|72|(20:74|(1:76)(1:83)|78|79|5|(1:66)(1:9)|10|11|13|(1:15)|16|17|(1:19)(1:54)|20|(3:22|(1:24)(1:26)|25)|(3:28|(1:30)(1:33)|31)|34|(3:36|(1:38)(3:45|(3:48|(1:50)(1:51)|46)|52)|(2:40|41)(2:43|44))|53|(0)(0)))|4|5|(1:7)|66|10|11|13|(0)|16|17|(0)(0)|20|(0)|(0)|34|(0)|53|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bb, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01de, code lost:
    
        r11.zzt.zzaA().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzeu.zzn(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0194 A[Catch: IllegalStateException -> 0x01bb, TryCatch #3 {IllegalStateException -> 0x01bb, blocks: (B:17:0x0172, B:20:0x018c, B:22:0x0194, B:25:0x01b2, B:26:0x01ae, B:28:0x01bf, B:30:0x01d5, B:31:0x01da, B:33:0x01d8), top: B:16:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bf A[Catch: IllegalStateException -> 0x01bb, TryCatch #3 {IllegalStateException -> 0x01bb, blocks: (B:17:0x0172, B:20:0x018c, B:22:0x0194, B:25:0x01b2, B:26:0x01ae, B:28:0x01bf, B:30:0x01d5, B:31:0x01da, B:33:0x01d8), top: B:16:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b5  */
    @Override // com.google.android.gms.measurement.internal.zzf
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzd() {
        String str;
        String str2;
        PackageInfo packageInfo;
        boolean z7;
        int zza;
        List zzp;
        String zzc;
        String packageName = this.zzt.zzaw().getPackageName();
        PackageManager packageManager = this.zzt.zzaw().getPackageManager();
        int i8 = Integer.MIN_VALUE;
        String str3 = "";
        String str4 = "Unknown";
        String str5 = "unknown";
        if (packageManager == null) {
            this.zzt.zzaA().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzeu.zzn(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.zzt.zzaA().zzd().zzb("Error retrieving app installer package name. appId", zzeu.zzn(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.zzt.zzaw().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                try {
                    str4 = packageInfo.versionName;
                    i8 = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.zzt.zzaA().zzd().zzc("Error retrieving package info. appId, appName", zzeu.zzn(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.zza = packageName;
                    this.zzd = str5;
                    this.zzb = str4;
                    this.zzc = i8;
                    this.zze = str2;
                    this.zzf = 0L;
                    if (TextUtils.isEmpty(this.zzt.zzw())) {
                    }
                    zza = this.zzt.zza();
                    switch (zza) {
                    }
                    this.zzk = "";
                    this.zzl = "";
                    this.zzt.zzay();
                    if (z7) {
                    }
                    zzc = zzip.zzc(this.zzt.zzaw(), "google_app_id", this.zzt.zzz());
                    if (!TextUtils.isEmpty(zzc)) {
                    }
                    this.zzk = str3;
                    if (!TextUtils.isEmpty(zzc)) {
                    }
                    if (zza == 0) {
                    }
                    this.zzh = null;
                    this.zzt.zzay();
                    zzp = this.zzt.zzf().zzp("analytics.safelisted_events");
                    if (zzp != null) {
                    }
                    this.zzh = zzp;
                    if (packageManager == null) {
                    }
                }
                this.zza = packageName;
                this.zzd = str5;
                this.zzb = str4;
                this.zzc = i8;
                this.zze = str2;
                this.zzf = 0L;
                z7 = TextUtils.isEmpty(this.zzt.zzw()) && "am".equals(this.zzt.zzx());
                zza = this.zzt.zza();
                switch (zza) {
                    case 0:
                        this.zzt.zzaA().zzj().zza("App measurement collection enabled");
                        break;
                    case 1:
                        this.zzt.zzaA().zzi().zza("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        this.zzt.zzaA().zzj().zza("App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        this.zzt.zzaA().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        this.zzt.zzaA().zzi().zza("App measurement disabled via the manifest");
                        break;
                    case 5:
                        this.zzt.zzaA().zzj().zza("App measurement disabled via the init parameters");
                        break;
                    case 6:
                        this.zzt.zzaA().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        this.zzt.zzaA().zzi().zza("App measurement disabled via the global data collection setting");
                        break;
                    default:
                        this.zzt.zzaA().zzi().zza("App measurement disabled due to denied storage consent");
                        break;
                }
                this.zzk = "";
                this.zzl = "";
                this.zzt.zzay();
                if (z7) {
                    this.zzl = this.zzt.zzw();
                }
                zzc = zzip.zzc(this.zzt.zzaw(), "google_app_id", this.zzt.zzz());
                if (!TextUtils.isEmpty(zzc)) {
                    str3 = zzc;
                }
                this.zzk = str3;
                if (!TextUtils.isEmpty(zzc)) {
                    Context zzaw = this.zzt.zzaw();
                    String zzz = this.zzt.zzz();
                    Preconditions.checkNotNull(zzaw);
                    Resources resources = zzaw.getResources();
                    if (TextUtils.isEmpty(zzz)) {
                        zzz = zzfw.zza(zzaw);
                    }
                    this.zzl = zzfw.zzb("admob_app_id", resources, zzz);
                }
                if (zza == 0) {
                    this.zzt.zzaA().zzj().zzc("App measurement enabled for app package, google app id", this.zza, TextUtils.isEmpty(this.zzk) ? this.zzl : this.zzk);
                }
                this.zzh = null;
                this.zzt.zzay();
                zzp = this.zzt.zzf().zzp("analytics.safelisted_events");
                if (zzp != null) {
                    if (zzp.isEmpty()) {
                        this.zzt.zzaA().zzl().zza("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator it = zzp.iterator();
                        while (it.hasNext()) {
                            if (!this.zzt.zzv().zzac("safelisted event", (String) it.next())) {
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.zzj = InstantApps.isInstantApp(this.zzt.zzaw()) ? 1 : 0;
                        return;
                    } else {
                        this.zzj = 0;
                        return;
                    }
                }
                this.zzh = zzp;
                if (packageManager == null) {
                }
            }
        }
        str2 = "Unknown";
        this.zza = packageName;
        this.zzd = str5;
        this.zzb = str4;
        this.zzc = i8;
        this.zze = str2;
        this.zzf = 0L;
        if (TextUtils.isEmpty(this.zzt.zzw())) {
        }
        zza = this.zzt.zza();
        switch (zza) {
        }
        this.zzk = "";
        this.zzl = "";
        this.zzt.zzay();
        if (z7) {
        }
        zzc = zzip.zzc(this.zzt.zzaw(), "google_app_id", this.zzt.zzz());
        if (!TextUtils.isEmpty(zzc)) {
        }
        this.zzk = str3;
        if (!TextUtils.isEmpty(zzc)) {
        }
        if (zza == 0) {
        }
        this.zzh = null;
        this.zzt.zzay();
        zzp = this.zzt.zzf().zzp("analytics.safelisted_events");
        if (zzp != null) {
        }
        this.zzh = zzp;
        if (packageManager == null) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return true;
    }

    @WorkerThread
    final int zzh() {
        zza();
        return this.zzj;
    }

    @WorkerThread
    final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzq zzj(String str) {
        String str2;
        Class<?> loadClass;
        Object invoke;
        long zza;
        String str3;
        long min;
        String str4;
        long j8;
        int i8;
        long j9;
        ApplicationInfo applicationInfo;
        zzg();
        String zzl = zzl();
        String zzm = zzm();
        zza();
        String str5 = this.zzb;
        zza();
        long j10 = this.zzc;
        zza();
        Preconditions.checkNotNull(this.zzd);
        String str6 = this.zzd;
        this.zzt.zzf().zzh();
        zza();
        zzg();
        long j11 = this.zzf;
        if (j11 == 0) {
            zzlo zzv = this.zzt.zzv();
            Context zzaw = this.zzt.zzaw();
            String packageName = this.zzt.zzaw().getPackageName();
            zzv.zzg();
            Preconditions.checkNotNull(zzaw);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = zzaw.getPackageManager();
            MessageDigest zzF = zzlo.zzF();
            long j12 = -1;
            if (zzF == null) {
                zzv.zzt.zzaA().zzd().zza("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (zzv.zzah(zzaw, packageName)) {
                            j12 = 0;
                        } else {
                            Signature[] signatureArr = Wrappers.packageManager(zzaw).getPackageInfo(zzv.zzt.zzaw().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                zzv.zzt.zzaA().zzk().zza("Could not get signatures");
                            } else {
                                j12 = zzlo.zzp(zzF.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e8) {
                        zzv.zzt.zzaA().zzd().zzb("Package name not found", e8);
                    }
                }
                j11 = 0;
                this.zzf = j11;
            }
            j11 = j12;
            this.zzf = j11;
        }
        long j13 = j11;
        boolean zzJ = this.zzt.zzJ();
        boolean z7 = !this.zzt.zzm().zzl;
        zzg();
        if (this.zzt.zzJ()) {
            zzrg.zzc();
            if (this.zzt.zzf().zzs(null, zzeh.zzac)) {
                this.zzt.zzaA().zzj().zza("Disabled IID for tests.");
            } else {
                try {
                    loadClass = this.zzt.zzaw().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    try {
                        invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzt.zzaw());
                    } catch (Exception unused2) {
                        this.zzt.zzaA().zzm().zza("Failed to obtain Firebase Analytics instance");
                    }
                    if (invoke != null) {
                        try {
                            str2 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                        } catch (Exception unused3) {
                            this.zzt.zzaA().zzl().zza("Failed to retrieve Firebase Instance Id");
                        }
                        zzge zzgeVar = this.zzt;
                        zza = zzgeVar.zzm().zzc.zza();
                        if (zza == 0) {
                            str3 = zzl;
                            min = zzgeVar.zzc;
                        } else {
                            str3 = zzl;
                            min = Math.min(zzgeVar.zzc, zza);
                        }
                        zza();
                        int i9 = this.zzj;
                        boolean zzr = this.zzt.zzf().zzr();
                        zzfj zzm2 = this.zzt.zzm();
                        zzm2.zzg();
                        boolean z8 = zzm2.zza().getBoolean("deferred_analytics_collection", false);
                        zza();
                        String str7 = this.zzl;
                        Boolean valueOf = this.zzt.zzf().zzk("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r2.booleanValue());
                        long j14 = this.zzg;
                        List list = this.zzh;
                        String zzh = this.zzt.zzm().zzc().zzh();
                        if (this.zzi == null) {
                            this.zzi = this.zzt.zzv().zzC();
                        }
                        String str8 = this.zzi;
                        zzqr.zzc();
                        if (this.zzt.zzf().zzs(null, zzeh.zzan)) {
                            zzg();
                            if (this.zzn != 0) {
                                long currentTimeMillis = this.zzt.zzax().currentTimeMillis() - this.zzn;
                                if (this.zzm != null && currentTimeMillis > 86400000 && this.zzo == null) {
                                    zzo();
                                }
                            }
                            if (this.zzm == null) {
                                zzo();
                            }
                            str4 = this.zzm;
                        } else {
                            str4 = null;
                        }
                        zzag zzf = this.zzt.zzf();
                        zzge zzgeVar2 = zzf.zzt;
                        Boolean zzk = zzf.zzk("google_analytics_sgtm_upload_enabled");
                        boolean booleanValue = zzk == null ? false : zzk.booleanValue();
                        zzpw.zzc();
                        if (this.zzt.zzf().zzs(null, zzeh.zzaD)) {
                            zzlo zzv2 = this.zzt.zzv();
                            String zzl2 = zzl();
                            if (zzv2.zzt.zzaw().getPackageManager() == null) {
                                j9 = 0;
                            } else {
                                try {
                                    try {
                                        applicationInfo = Wrappers.packageManager(zzv2.zzt.zzaw()).getApplicationInfo(zzl2, 0);
                                    } catch (PackageManager.NameNotFoundException unused4) {
                                        zzv2.zzt.zzay();
                                        zzv2.zzt.zzaA().zzi().zzb("PackageManager failed to find running app: app_id", zzl2);
                                        i8 = 0;
                                        j9 = i8;
                                        j8 = j9;
                                        return new zzq(str3, zzm, str5, j10, str6, 77000L, j13, str, zzJ, z7, str2, 0L, min, i9, zzr, z8, str7, valueOf, j14, list, (String) null, zzh, str8, str4, booleanValue, j8);
                                    }
                                } catch (PackageManager.NameNotFoundException unused5) {
                                }
                                if (applicationInfo != null) {
                                    i8 = applicationInfo.targetSdkVersion;
                                    j9 = i8;
                                }
                                i8 = 0;
                                j9 = i8;
                            }
                            j8 = j9;
                        } else {
                            j8 = 0;
                        }
                        return new zzq(str3, zzm, str5, j10, str6, 77000L, j13, str, zzJ, z7, str2, 0L, min, i9, zzr, z8, str7, valueOf, j14, list, (String) null, zzh, str8, str4, booleanValue, j8);
                    }
                    str2 = null;
                    zzge zzgeVar3 = this.zzt;
                    zza = zzgeVar3.zzm().zzc.zza();
                    if (zza == 0) {
                    }
                    zza();
                    int i92 = this.zzj;
                    boolean zzr2 = this.zzt.zzf().zzr();
                    zzfj zzm22 = this.zzt.zzm();
                    zzm22.zzg();
                    boolean z82 = zzm22.zza().getBoolean("deferred_analytics_collection", false);
                    zza();
                    String str72 = this.zzl;
                    if (this.zzt.zzf().zzk("google_analytics_default_allow_ad_personalization_signals") == null) {
                    }
                    long j142 = this.zzg;
                    List list2 = this.zzh;
                    String zzh2 = this.zzt.zzm().zzc().zzh();
                    if (this.zzi == null) {
                    }
                    String str82 = this.zzi;
                    zzqr.zzc();
                    if (this.zzt.zzf().zzs(null, zzeh.zzan)) {
                    }
                    zzag zzf2 = this.zzt.zzf();
                    zzge zzgeVar22 = zzf2.zzt;
                    Boolean zzk2 = zzf2.zzk("google_analytics_sgtm_upload_enabled");
                    if (zzk2 == null) {
                    }
                    zzpw.zzc();
                    if (this.zzt.zzf().zzs(null, zzeh.zzaD)) {
                    }
                    return new zzq(str3, zzm, str5, j10, str6, 77000L, j13, str, zzJ, z7, str2, 0L, min, i92, zzr2, z82, str72, valueOf, j142, list2, (String) null, zzh2, str82, str4, booleanValue, j8);
                }
            }
        }
        str2 = null;
        zzge zzgeVar32 = this.zzt;
        zza = zzgeVar32.zzm().zzc.zza();
        if (zza == 0) {
        }
        zza();
        int i922 = this.zzj;
        boolean zzr22 = this.zzt.zzf().zzr();
        zzfj zzm222 = this.zzt.zzm();
        zzm222.zzg();
        boolean z822 = zzm222.zza().getBoolean("deferred_analytics_collection", false);
        zza();
        String str722 = this.zzl;
        if (this.zzt.zzf().zzk("google_analytics_default_allow_ad_personalization_signals") == null) {
        }
        long j1422 = this.zzg;
        List list22 = this.zzh;
        String zzh22 = this.zzt.zzm().zzc().zzh();
        if (this.zzi == null) {
        }
        String str822 = this.zzi;
        zzqr.zzc();
        if (this.zzt.zzf().zzs(null, zzeh.zzan)) {
        }
        zzag zzf22 = this.zzt.zzf();
        zzge zzgeVar222 = zzf22.zzt;
        Boolean zzk22 = zzf22.zzk("google_analytics_sgtm_upload_enabled");
        if (zzk22 == null) {
        }
        zzpw.zzc();
        if (this.zzt.zzf().zzs(null, zzeh.zzaD)) {
        }
        return new zzq(str3, zzm, str5, j10, str6, 77000L, j13, str, zzJ, z7, str2, 0L, min, i922, zzr22, z822, str722, valueOf, j1422, list22, (String) null, zzh22, str822, str4, booleanValue, j8);
    }

    @WorkerThread
    final String zzk() {
        zza();
        return this.zzl;
    }

    @WorkerThread
    final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @WorkerThread
    final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    @WorkerThread
    final List zzn() {
        return this.zzh;
    }

    @WorkerThread
    final void zzo() {
        String format;
        zzg();
        if (this.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzt.zzv().zzG().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzt.zzaA().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        }
        zzes zzc = this.zzt.zzaA().zzc();
        Object[] objArr = new Object[1];
        objArr[0] = format == null ? "null" : "not null";
        zzc.zza(String.format("Resetting session stitching token to %s", objArr));
        this.zzm = format;
        this.zzn = this.zzt.zzax().currentTimeMillis();
    }

    final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z7 = false;
        if (str2 != null && !str2.equals(str)) {
            z7 = true;
        }
        this.zzo = str;
        return z7;
    }
}
