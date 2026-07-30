package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrn;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@23.0.0 */
/* loaded from: classes.dex */
public final class zzgi extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    zzgi(zzic zzicVar, long j, long j2) {
        super(zzicVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
        this.zzh = j2;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(1:3)(6:59|60|(1:62)(2:77|(1:79))|63|64|(16:66|(1:68)(1:75)|69|70|5|(2:7|(2:9|(2:11|(2:13|(2:15|(2:17|(1:19)(1:52))(1:53))(1:54))(1:55))(1:56))(1:57))(1:58)|20|21|22|(1:24)(1:49)|25|(1:27)|29|(3:31|(1:33)(3:40|(3:43|(1:45)(1:46)|41)|47)|(2:35|36)(2:38|39))|48|(0)(0)))|4|5|(0)(0)|20|21|22|(0)(0)|25|(0)|29|(0)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019a, code lost:
    
        r11.zzu.zzaV().zzb().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:22:0x016d, B:25:0x0183, B:27:0x0187), top: B:21:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c7  */
    @Override // com.google.android.gms.measurement.internal.zzg
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzf() {
        String str;
        String str2;
        PackageInfo packageInfo;
        int zzC;
        List zzs;
        String zza;
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzicVar.zzaY().getPackageName();
        PackageManager packageManager = zzicVar.zzaY().getPackageManager();
        String str3 = "";
        int i = Integer.MIN_VALUE;
        String str4 = "Unknown";
        String str5 = EnvironmentCompat.MEDIA_UNKNOWN;
        if (packageManager == null) {
            zzicVar.zzaV().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzgu.zzl(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.zzu.zzaV().zzb().zzb("Error retrieving app installer package name. appId", zzgu.zzl(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.zzu.zzaY().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                try {
                    str4 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.zza = packageName;
                    this.zzd = str5;
                    this.zzb = str4;
                    this.zzc = i;
                    this.zze = str2;
                    this.zzf = 0L;
                    zzic zzicVar2 = this.zzu;
                    zzC = zzicVar2.zzC();
                    if (zzC == 0) {
                    }
                    this.zzl = "";
                    zzic zzicVar3 = this.zzu;
                    zzicVar3.zzaU();
                    zza = zzlt.zza(zzicVar3.zzaY(), "google_app_id", zzicVar2.zzq());
                    if (!TextUtils.isEmpty(zza)) {
                    }
                    this.zzl = str3;
                    if (zzC == 0) {
                    }
                    this.zzi = null;
                    zzic zzicVar4 = this.zzu;
                    zzicVar4.zzaU();
                    zzs = zzicVar4.zzc().zzs("analytics.safelisted_events");
                    if (zzs != null) {
                    }
                    this.zzi = zzs;
                    if (packageManager == null) {
                    }
                }
                this.zza = packageName;
                this.zzd = str5;
                this.zzb = str4;
                this.zzc = i;
                this.zze = str2;
                this.zzf = 0L;
                zzic zzicVar22 = this.zzu;
                zzC = zzicVar22.zzC();
                if (zzC == 0) {
                    this.zzu.zzaV().zzk().zza("App measurement collection enabled");
                } else if (zzC == 1) {
                    this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
                } else if (zzC == 3) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (zzC == 4) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                } else if (zzC == 6) {
                    this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (zzC == 7) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                } else if (zzC != 8) {
                    zzic zzicVar5 = this.zzu;
                    zzicVar5.zzaV().zzi().zza("App measurement disabled");
                    zzicVar5.zzaV().zzc().zza("Invalid scion state in identity");
                } else {
                    this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                }
                this.zzl = "";
                zzic zzicVar32 = this.zzu;
                zzicVar32.zzaU();
                zza = zzlt.zza(zzicVar32.zzaY(), "google_app_id", zzicVar22.zzq());
                if (!TextUtils.isEmpty(zza)) {
                    str3 = zza;
                }
                this.zzl = str3;
                if (zzC == 0) {
                    zzicVar32.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
                }
                this.zzi = null;
                zzic zzicVar42 = this.zzu;
                zzicVar42.zzaU();
                zzs = zzicVar42.zzc().zzs("analytics.safelisted_events");
                if (zzs != null) {
                    if (zzs.isEmpty()) {
                        zzicVar42.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator it = zzs.iterator();
                        while (it.hasNext()) {
                            if (!zzicVar42.zzk().zzk("safelisted event", (String) it.next())) {
                                break;
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.zzk = InstantApps.isInstantApp(zzicVar42.zzaY()) ? 1 : 0;
                        return;
                    } else {
                        this.zzk = 0;
                        return;
                    }
                }
                this.zzi = zzs;
                if (packageManager == null) {
                }
            }
        }
        str2 = "Unknown";
        this.zza = packageName;
        this.zzd = str5;
        this.zzb = str4;
        this.zzc = i;
        this.zze = str2;
        this.zzf = 0L;
        zzic zzicVar222 = this.zzu;
        zzC = zzicVar222.zzC();
        if (zzC == 0) {
        }
        this.zzl = "";
        zzic zzicVar322 = this.zzu;
        zzicVar322.zzaU();
        zza = zzlt.zza(zzicVar322.zzaY(), "google_app_id", zzicVar222.zzq());
        if (!TextUtils.isEmpty(zza)) {
        }
        this.zzl = str3;
        if (zzC == 0) {
        }
        this.zzi = null;
        zzic zzicVar422 = this.zzu;
        zzicVar422.zzaU();
        zzs = zzicVar422.zzc().zzs("analytics.safelisted_events");
        if (zzs != null) {
        }
        this.zzi = zzs;
        if (packageManager == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0283 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzr zzh(String str) {
        long j;
        zzic zzicVar;
        String str2;
        String str3;
        Class<?> loadClass;
        Object invoke;
        long zza;
        String str4;
        long j2;
        long min;
        zzic zzicVar2;
        long j3;
        String str5;
        zzic zzicVar3;
        boolean z;
        int i;
        int i2;
        long j4;
        ApplicationInfo applicationInfo;
        zzic zzicVar4;
        zzfx zzfxVar;
        zzg();
        String zzj = zzj();
        String zzk = zzk();
        zzb();
        String str6 = this.zzb;
        zzb();
        long j5 = this.zzc;
        zzb();
        Preconditions.checkNotNull(this.zzd);
        String str7 = this.zzd;
        zzic zzicVar5 = this.zzu;
        zzicVar5.zzc().zzi();
        zzb();
        zzg();
        long j6 = this.zzf;
        if (j6 == 0) {
            zzpp zzk2 = this.zzu.zzk();
            Context zzaY = zzicVar5.zzaY();
            String packageName = zzicVar5.zzaY().getPackageName();
            zzk2.zzg();
            Preconditions.checkNotNull(zzaY);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = zzaY.getPackageManager();
            MessageDigest zzO = zzpp.zzO();
            long j7 = -1;
            if (zzO == null) {
                zzk2.zzu.zzaV().zzb().zza("Could not get MD5 instance");
                j = 0;
            } else {
                if (packageManager != null) {
                    try {
                        if (zzk2.zzad(zzaY, packageName)) {
                            j = 0;
                            j7 = 0;
                        } else {
                            PackageManagerWrapper packageManager2 = Wrappers.packageManager(zzaY);
                            zzic zzicVar6 = zzk2.zzu;
                            j = 0;
                            try {
                                PackageInfo packageInfo = packageManager2.getPackageInfo(zzicVar6.zzaY().getPackageName(), 64);
                                if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                                    zzicVar6.zzaV().zze().zza("Could not get signatures");
                                } else {
                                    j7 = zzpp.zzP(zzO.digest(packageInfo.signatures[0].toByteArray()));
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                e = e;
                                zzk2.zzu.zzaV().zzb().zzb("Package name not found", e);
                                j6 = j;
                                this.zzf = j6;
                                long j8 = j6;
                                zzicVar = this.zzu;
                                zzic zzicVar7 = this.zzu;
                                boolean zzB = zzicVar.zzB();
                                boolean z2 = !zzicVar7.zzd().zzm;
                                zzg();
                                if (zzicVar.zzB()) {
                                }
                                str2 = zzj;
                                str3 = null;
                                zzic zzicVar8 = this.zzu;
                                zza = zzicVar8.zzd().zzc.zza();
                                if (zza != j) {
                                }
                                zzb();
                                int i3 = this.zzk;
                                zzicVar2 = this.zzu;
                                boolean zzu = zzicVar2.zzc().zzu();
                                zzhh zzd = zzicVar2.zzd();
                                zzd.zzg();
                                long j9 = min;
                                boolean z3 = zzd.zzd().getBoolean("deferred_analytics_collection", false);
                                if (zzicVar2.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) == zzji.GRANTED) {
                                }
                                long j10 = this.zzg;
                                Boolean valueOf = Boolean.valueOf(r2);
                                List list = this.zzi;
                                String zzl = zzicVar2.zzd().zzl().zzl();
                                if (this.zzj == null) {
                                }
                                String str8 = this.zzj;
                                if (zzicVar2.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                                }
                                boolean zzx = zzicVar2.zzc().zzx();
                                zzpp zzk3 = zzicVar2.zzk();
                                String zzj2 = zzj();
                                zzicVar3 = zzk3.zzu;
                                if (zzicVar3.zzaY().getPackageManager() != null) {
                                }
                                zzicVar4 = this.zzu;
                                int zzb = zzicVar4.zzd().zzl().zzb();
                                String zze = zzicVar4.zzd().zzj().zze();
                                zzqp.zza();
                                zzal zzc = zzicVar4.zzc();
                                String str9 = str5;
                                zzfxVar = zzfy.zzaQ;
                                long j11 = j4;
                                if (zzc.zzp(null, zzfxVar)) {
                                }
                                zzqp.zza();
                                if (zzicVar4.zzc().zzp(null, zzfxVar)) {
                                }
                                return new zzr(str2, zzk, str4, j2, str7, 133005L, j8, str, zzB, z2, str3, j9, i3, zzu, z3, valueOf, j3, list, zzl, str8, str9, z, j11, zzb, zze, r2, j, zzicVar4.zzc().zzz(), new zze(zzicVar4.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        e = e2;
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                j6 = j;
                this.zzf = j6;
            }
            j6 = j7;
            this.zzf = j6;
        } else {
            j = 0;
        }
        long j82 = j6;
        zzicVar = this.zzu;
        zzic zzicVar72 = this.zzu;
        boolean zzB2 = zzicVar.zzB();
        boolean z22 = !zzicVar72.zzd().zzm;
        zzg();
        if (zzicVar.zzB()) {
            zzrn.zza();
            if (zzicVar72.zzc().zzp(null, zzfy.zzaH)) {
                this.zzu.zzaV().zzk().zza("Disabled IID for tests.");
            } else {
                try {
                    loadClass = zzicVar72.zzaY().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    try {
                        invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzu.zzaY());
                    } catch (Exception unused2) {
                        str2 = zzj;
                        this.zzu.zzaV().zzf().zza("Failed to obtain Firebase Analytics instance");
                    }
                    if (invoke != null) {
                        str2 = zzj;
                        try {
                            str3 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                        } catch (Exception unused3) {
                            this.zzu.zzaV().zzh().zza("Failed to retrieve Firebase Instance Id");
                        }
                        zzic zzicVar82 = this.zzu;
                        zza = zzicVar82.zzd().zzc.zza();
                        if (zza != j) {
                            min = zzicVar82.zza;
                            str4 = str6;
                            j2 = j5;
                        } else {
                            str4 = str6;
                            j2 = j5;
                            min = Math.min(zzicVar82.zza, zza);
                        }
                        zzb();
                        int i32 = this.zzk;
                        zzicVar2 = this.zzu;
                        boolean zzu2 = zzicVar2.zzc().zzu();
                        zzhh zzd2 = zzicVar2.zzd();
                        zzd2.zzg();
                        long j92 = min;
                        boolean z32 = zzd2.zzd().getBoolean("deferred_analytics_collection", false);
                        boolean z4 = zzicVar2.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) == zzji.GRANTED;
                        long j102 = this.zzg;
                        Boolean valueOf2 = Boolean.valueOf(z4);
                        List list2 = this.zzi;
                        String zzl2 = zzicVar2.zzd().zzl().zzl();
                        if (this.zzj == null) {
                            this.zzj = zzicVar2.zzk().zzaw();
                        }
                        String str82 = this.zzj;
                        if (zzicVar2.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                            j3 = j102;
                            str5 = null;
                        } else {
                            zzg();
                            j3 = j102;
                            if (this.zzn != j) {
                                long currentTimeMillis = zzicVar2.zzaZ().currentTimeMillis() - this.zzn;
                                if (this.zzm != null && currentTimeMillis > 86400000 && this.zzo == null) {
                                    zzi();
                                }
                            }
                            if (this.zzm == null) {
                                zzi();
                            }
                            str5 = this.zzm;
                        }
                        boolean zzx2 = zzicVar2.zzc().zzx();
                        zzpp zzk32 = zzicVar2.zzk();
                        String zzj22 = zzj();
                        zzicVar3 = zzk32.zzu;
                        if (zzicVar3.zzaY().getPackageManager() != null) {
                            z = zzx2;
                            j4 = j;
                        } else {
                            try {
                                z = zzx2;
                                i = 0;
                                try {
                                    applicationInfo = Wrappers.packageManager(zzicVar3.zzaY()).getApplicationInfo(zzj22, 0);
                                } catch (PackageManager.NameNotFoundException unused4) {
                                    zzic zzicVar9 = zzk32.zzu;
                                    zzicVar9.zzaU();
                                    zzicVar9.zzaV().zzi().zzb("PackageManager failed to find running app: app_id", zzj22);
                                    i2 = i;
                                    j4 = i2;
                                    zzicVar4 = this.zzu;
                                    int zzb2 = zzicVar4.zzd().zzl().zzb();
                                    String zze2 = zzicVar4.zzd().zzj().zze();
                                    zzqp.zza();
                                    zzal zzc2 = zzicVar4.zzc();
                                    String str92 = str5;
                                    zzfxVar = zzfy.zzaQ;
                                    long j112 = j4;
                                    if (zzc2.zzp(null, zzfxVar)) {
                                    }
                                    zzqp.zza();
                                    if (zzicVar4.zzc().zzp(null, zzfxVar)) {
                                    }
                                    return new zzr(str2, zzk, str4, j2, str7, 133005L, j82, str, zzB2, z22, str3, j92, i32, zzu2, z32, valueOf2, j3, list2, zzl2, str82, str92, z, j112, zzb2, zze2, r2, j, zzicVar4.zzc().zzz(), new zze(zzicVar4.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
                                }
                            } catch (PackageManager.NameNotFoundException unused5) {
                                z = zzx2;
                                i = 0;
                            }
                            if (applicationInfo != null) {
                                i2 = applicationInfo.targetSdkVersion;
                                j4 = i2;
                            }
                            i2 = i;
                            j4 = i2;
                        }
                        zzicVar4 = this.zzu;
                        int zzb22 = zzicVar4.zzd().zzl().zzb();
                        String zze22 = zzicVar4.zzd().zzj().zze();
                        zzqp.zza();
                        zzal zzc22 = zzicVar4.zzc();
                        String str922 = str5;
                        zzfxVar = zzfy.zzaQ;
                        long j1122 = j4;
                        int zzU = zzc22.zzp(null, zzfxVar) ? zzicVar4.zzk().zzU() : 0;
                        zzqp.zza();
                        if (zzicVar4.zzc().zzp(null, zzfxVar)) {
                            j = zzicVar4.zzk().zzV();
                        }
                        return new zzr(str2, zzk, str4, j2, str7, 133005L, j82, str, zzB2, z22, str3, j92, i32, zzu2, z32, valueOf2, j3, list2, zzl2, str82, str922, z, j1122, zzb22, zze22, zzU, j, zzicVar4.zzc().zzz(), new zze(zzicVar4.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
                    }
                    str2 = zzj;
                    str3 = null;
                    zzic zzicVar822 = this.zzu;
                    zza = zzicVar822.zzd().zzc.zza();
                    if (zza != j) {
                    }
                    zzb();
                    int i322 = this.zzk;
                    zzicVar2 = this.zzu;
                    boolean zzu22 = zzicVar2.zzc().zzu();
                    zzhh zzd22 = zzicVar2.zzd();
                    zzd22.zzg();
                    long j922 = min;
                    boolean z322 = zzd22.zzd().getBoolean("deferred_analytics_collection", false);
                    if (zzicVar2.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) == zzji.GRANTED) {
                    }
                    long j1022 = this.zzg;
                    Boolean valueOf22 = Boolean.valueOf(z4);
                    List list22 = this.zzi;
                    String zzl22 = zzicVar2.zzd().zzl().zzl();
                    if (this.zzj == null) {
                    }
                    String str822 = this.zzj;
                    if (zzicVar2.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                    }
                    boolean zzx22 = zzicVar2.zzc().zzx();
                    zzpp zzk322 = zzicVar2.zzk();
                    String zzj222 = zzj();
                    zzicVar3 = zzk322.zzu;
                    if (zzicVar3.zzaY().getPackageManager() != null) {
                    }
                    zzicVar4 = this.zzu;
                    int zzb222 = zzicVar4.zzd().zzl().zzb();
                    String zze222 = zzicVar4.zzd().zzj().zze();
                    zzqp.zza();
                    zzal zzc222 = zzicVar4.zzc();
                    String str9222 = str5;
                    zzfxVar = zzfy.zzaQ;
                    long j11222 = j4;
                    if (zzc222.zzp(null, zzfxVar)) {
                    }
                    zzqp.zza();
                    if (zzicVar4.zzc().zzp(null, zzfxVar)) {
                    }
                    return new zzr(str2, zzk, str4, j2, str7, 133005L, j82, str, zzB2, z22, str3, j922, i322, zzu22, z322, valueOf22, j3, list22, zzl22, str822, str9222, z, j11222, zzb222, zze222, zzU, j, zzicVar4.zzc().zzz(), new zze(zzicVar4.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
                }
            }
        }
        str2 = zzj;
        str3 = null;
        zzic zzicVar8222 = this.zzu;
        zza = zzicVar8222.zzd().zzc.zza();
        if (zza != j) {
        }
        zzb();
        int i3222 = this.zzk;
        zzicVar2 = this.zzu;
        boolean zzu222 = zzicVar2.zzc().zzu();
        zzhh zzd222 = zzicVar2.zzd();
        zzd222.zzg();
        long j9222 = min;
        boolean z3222 = zzd222.zzd().getBoolean("deferred_analytics_collection", false);
        if (zzicVar2.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) == zzji.GRANTED) {
        }
        long j10222 = this.zzg;
        Boolean valueOf222 = Boolean.valueOf(z4);
        List list222 = this.zzi;
        String zzl222 = zzicVar2.zzd().zzl().zzl();
        if (this.zzj == null) {
        }
        String str8222 = this.zzj;
        if (zzicVar2.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
        }
        boolean zzx222 = zzicVar2.zzc().zzx();
        zzpp zzk3222 = zzicVar2.zzk();
        String zzj2222 = zzj();
        zzicVar3 = zzk3222.zzu;
        if (zzicVar3.zzaY().getPackageManager() != null) {
        }
        zzicVar4 = this.zzu;
        int zzb2222 = zzicVar4.zzd().zzl().zzb();
        String zze2222 = zzicVar4.zzd().zzj().zze();
        zzqp.zza();
        zzal zzc2222 = zzicVar4.zzc();
        String str92222 = str5;
        zzfxVar = zzfy.zzaQ;
        long j112222 = j4;
        if (zzc2222.zzp(null, zzfxVar)) {
        }
        zzqp.zza();
        if (zzicVar4.zzc().zzp(null, zzfxVar)) {
        }
        return new zzr(str2, zzk, str4, j2, str7, 133005L, j82, str, zzB2, z22, str3, j9222, i3222, zzu222, z3222, valueOf222, j3, list222, zzl222, str8222, str92222, z, j112222, zzb2222, zze2222, zzU, j, zzicVar4.zzc().zzz(), new zze(zzicVar4.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
    }

    final void zzi() {
        String format;
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzicVar.zzk().zzf().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzicVar.zzaV().zzj().zza("Analytics Storage consent is not granted");
            format = null;
        }
        zzicVar.zzaV().zzj().zza(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.zzm = format;
        this.zzn = zzicVar.zzaZ().currentTimeMillis();
    }

    final String zzj() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzk() {
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    final String zzl() {
        zzb();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    final int zzm() {
        zzb();
        return this.zzc;
    }

    final long zzn() {
        return this.zzh;
    }

    final int zzo() {
        zzb();
        return this.zzk;
    }

    final List zzp() {
        return this.zzi;
    }

    final boolean zzq(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
