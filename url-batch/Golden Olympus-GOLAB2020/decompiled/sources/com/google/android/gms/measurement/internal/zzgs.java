package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzgs extends zzg {
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
    private String zzn;
    private long zzo;
    private String zzp;

    zzgs(zzio zzioVar, long j4, long j5) {
        super(zzioVar);
        this.zzo = 0L;
        this.zzp = null;
        this.zzg = j4;
        this.zzh = j5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(1:3)(6:81|82|(1:84)(2:99|(1:101))|85|86|(21:88|(1:90)(1:97)|91|92|5|(2:7|(15:11|12|(1:(2:15|(2:17|(2:19|(2:21|(2:23|(1:25)(1:73))(1:74))(1:75))(1:76))(1:77))(1:78))(1:79)|26|(1:28)|29|30|(1:32)(1:69)|33|(3:37|(1:39)(1:41)|40)|(3:43|(1:45)(1:48)|46)|49|(3:51|(1:53)(3:60|(3:63|(1:65)(1:66)|61)|67)|(2:55|56)(2:58|59))|68|(0)(0)))|80|12|(0)(0)|26|(0)|29|30|(0)(0)|33|(4:35|37|(0)(0)|40)|(0)|49|(0)|68|(0)(0)))|4|5|(0)|80|12|(0)(0)|26|(0)|29|30|(0)(0)|33|(0)|(0)|49|(0)|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01da, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fb, code lost:
    
        r12.zzu.zzaW().zze().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r1), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b1 A[Catch: IllegalStateException -> 0x01da, TryCatch #2 {IllegalStateException -> 0x01da, blocks: (B:30:0x018f, B:33:0x01a5, B:35:0x01b1, B:37:0x01b7, B:40:0x01d1, B:41:0x01cd, B:43:0x01de, B:45:0x01f2, B:46:0x01f7, B:48:0x01f5), top: B:29:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cd A[Catch: IllegalStateException -> 0x01da, TryCatch #2 {IllegalStateException -> 0x01da, blocks: (B:30:0x018f, B:33:0x01a5, B:35:0x01b1, B:37:0x01b7, B:40:0x01d1, B:41:0x01cd, B:43:0x01de, B:45:0x01f2, B:46:0x01f7, B:48:0x01f5), top: B:29:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01de A[Catch: IllegalStateException -> 0x01da, TryCatch #2 {IllegalStateException -> 0x01da, blocks: (B:30:0x018f, B:33:0x01a5, B:35:0x01b1, B:37:0x01b7, B:40:0x01d1, B:41:0x01cd, B:43:0x01de, B:45:0x01f2, B:46:0x01f7, B:48:0x01f5), top: B:29:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cf  */
    @Override // com.google.android.gms.measurement.internal.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzd() {
        String str;
        String str2;
        PackageInfo packageInfo;
        zzio zzioVar;
        zzam zzf;
        zzgg zzggVar;
        Object[] objArr;
        zzio zzioVar2;
        int zza;
        List zzt;
        String zzc;
        String zzA;
        zzio zzioVar3 = this.zzu;
        zzioVar3.zzaW().zzj().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzioVar3.zzaT().getPackageName();
        PackageManager packageManager = zzioVar3.zzaT().getPackageManager();
        int i4 = Integer.MIN_VALUE;
        String str3 = "";
        String str4 = "Unknown";
        String str5 = "unknown";
        if (packageManager == null) {
            zzioVar3.zzaW().zze().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzhe.zzn(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.zzu.zzaW().zze().zzb("Error retrieving app installer package name. appId", zzhe.zzn(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.zzu.zzaT().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                try {
                    str4 = packageInfo.versionName;
                    i4 = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.zzu.zzaW().zze().zzc("Error retrieving package info. appId, appName", zzhe.zzn(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.zza = packageName;
                    this.zzd = str5;
                    this.zzb = str4;
                    this.zzc = i4;
                    this.zze = str2;
                    this.zzf = 0L;
                    zzioVar = this.zzu;
                    zzf = zzioVar.zzf();
                    zzggVar = zzgi.zzbp;
                    if (!zzf.zzx(null, zzggVar)) {
                    }
                    objArr = false;
                    zzioVar2 = this.zzu;
                    zza = zzioVar2.zza();
                    if (zza != 0) {
                    }
                    this.zzl = "";
                    this.zzm = "";
                    zzioVar.zzaV();
                    if (objArr != false) {
                    }
                    zzc = zzmg.zzc(zzioVar.zzaT(), "google_app_id", zzioVar2.zzA());
                    if (TextUtils.isEmpty(zzc)) {
                    }
                    this.zzl = str3;
                    if (!zzioVar.zzf().zzx(null, zzggVar)) {
                    }
                    if (zza == 0) {
                    }
                    this.zzi = null;
                    zzio zzioVar4 = this.zzu;
                    zzioVar4.zzaV();
                    zzt = zzioVar4.zzf().zzt("analytics.safelisted_events");
                    if (zzt != null) {
                    }
                    this.zzi = zzt;
                    if (packageManager != null) {
                    }
                }
                this.zza = packageName;
                this.zzd = str5;
                this.zzb = str4;
                this.zzc = i4;
                this.zze = str2;
                this.zzf = 0L;
                zzioVar = this.zzu;
                zzf = zzioVar.zzf();
                zzggVar = zzgi.zzbp;
                if (!zzf.zzx(null, zzggVar)) {
                    zzio zzioVar5 = this.zzu;
                    if (!TextUtils.isEmpty(zzioVar5.zzx()) && "am".equals(zzioVar5.zzy())) {
                        objArr = true;
                        zzioVar2 = this.zzu;
                        zza = zzioVar2.zza();
                        if (zza != 0) {
                            zzioVar.zzaW().zzj().zza("App measurement collection enabled");
                        } else if (zza == 1) {
                            zzioVar.zzaW().zzi().zza("App measurement deactivated via the manifest");
                        } else if (zza == 3) {
                            zzioVar.zzaW().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (zza == 4) {
                            zzioVar.zzaW().zzi().zza("App measurement disabled via the manifest");
                        } else if (zza == 6) {
                            zzioVar.zzaW().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (zza == 7) {
                            zzioVar.zzaW().zzi().zza("App measurement disabled via the global data collection setting");
                        } else if (zza != 8) {
                            zzioVar.zzaW().zzi().zza("App measurement disabled");
                            zzioVar.zzaW().zzh().zza("Invalid scion state in identity");
                        } else {
                            zzioVar.zzaW().zzi().zza("App measurement disabled due to denied storage consent");
                        }
                        this.zzl = "";
                        this.zzm = "";
                        zzioVar.zzaV();
                        if (objArr != false) {
                            this.zzm = zzioVar2.zzx();
                        }
                        zzc = zzmg.zzc(zzioVar.zzaT(), "google_app_id", zzioVar2.zzA());
                        if (TextUtils.isEmpty(zzc)) {
                            str3 = zzc;
                        }
                        this.zzl = str3;
                        if (!zzioVar.zzf().zzx(null, zzggVar) && !TextUtils.isEmpty(zzc)) {
                            Context zzaT = zzioVar.zzaT();
                            zzA = zzioVar2.zzA();
                            Preconditions.checkNotNull(zzaT);
                            Resources resources = zzaT.getResources();
                            if (!TextUtils.isEmpty(zzA)) {
                                zzA = zzig.zza(zzaT);
                            }
                            this.zzm = zzig.zzb("admob_app_id", resources, zzA);
                        }
                        if (zza == 0) {
                            zzioVar.zzaW().zzj().zzc("App measurement enabled for app package, google app id", this.zza, TextUtils.isEmpty(this.zzl) ? this.zzm : this.zzl);
                        }
                        this.zzi = null;
                        zzio zzioVar42 = this.zzu;
                        zzioVar42.zzaV();
                        zzt = zzioVar42.zzf().zzt("analytics.safelisted_events");
                        if (zzt != null) {
                            if (zzt.isEmpty()) {
                                zzioVar42.zzaW().zzl().zza("Safelisted event list is empty. Ignoring");
                            } else {
                                Iterator it = zzt.iterator();
                                while (it.hasNext()) {
                                    if (!zzioVar42.zzw().zzag("safelisted event", (String) it.next())) {
                                        break;
                                    }
                                }
                            }
                            if (packageManager != null) {
                                this.zzk = InstantApps.isInstantApp(zzioVar42.zzaT()) ? 1 : 0;
                                return;
                            } else {
                                this.zzk = 0;
                                return;
                            }
                        }
                        this.zzi = zzt;
                        if (packageManager != null) {
                        }
                    }
                }
                objArr = false;
                zzioVar2 = this.zzu;
                zza = zzioVar2.zza();
                if (zza != 0) {
                }
                this.zzl = "";
                this.zzm = "";
                zzioVar.zzaV();
                if (objArr != false) {
                }
                zzc = zzmg.zzc(zzioVar.zzaT(), "google_app_id", zzioVar2.zzA());
                if (TextUtils.isEmpty(zzc)) {
                }
                this.zzl = str3;
                if (!zzioVar.zzf().zzx(null, zzggVar)) {
                    Context zzaT2 = zzioVar.zzaT();
                    zzA = zzioVar2.zzA();
                    Preconditions.checkNotNull(zzaT2);
                    Resources resources2 = zzaT2.getResources();
                    if (!TextUtils.isEmpty(zzA)) {
                    }
                    this.zzm = zzig.zzb("admob_app_id", resources2, zzA);
                }
                if (zza == 0) {
                }
                this.zzi = null;
                zzio zzioVar422 = this.zzu;
                zzioVar422.zzaV();
                zzt = zzioVar422.zzf().zzt("analytics.safelisted_events");
                if (zzt != null) {
                }
                this.zzi = zzt;
                if (packageManager != null) {
                }
            }
        }
        str2 = "Unknown";
        this.zza = packageName;
        this.zzd = str5;
        this.zzb = str4;
        this.zzc = i4;
        this.zze = str2;
        this.zzf = 0L;
        zzioVar = this.zzu;
        zzf = zzioVar.zzf();
        zzggVar = zzgi.zzbp;
        if (!zzf.zzx(null, zzggVar)) {
        }
        objArr = false;
        zzioVar2 = this.zzu;
        zza = zzioVar2.zza();
        if (zza != 0) {
        }
        this.zzl = "";
        this.zzm = "";
        zzioVar.zzaV();
        if (objArr != false) {
        }
        zzc = zzmg.zzc(zzioVar.zzaT(), "google_app_id", zzioVar2.zzA());
        if (TextUtils.isEmpty(zzc)) {
        }
        this.zzl = str3;
        if (!zzioVar.zzf().zzx(null, zzggVar)) {
        }
        if (zza == 0) {
        }
        this.zzi = null;
        zzio zzioVar4222 = this.zzu;
        zzioVar4222.zzaV();
        zzt = zzioVar4222.zzf().zzt("analytics.safelisted_events");
        if (zzt != null) {
        }
        this.zzi = zzt;
        if (packageManager != null) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return true;
    }

    final int zzh() {
        zza();
        return this.zzk;
    }

    final int zzi() {
        zza();
        return this.zzc;
    }

    final long zzj() {
        return this.zzh;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    final com.google.android.gms.measurement.internal.zzr zzk(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r47v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    final String zzl() {
        zza();
        if (this.zzu.zzf().zzx(null, zzgi.zzbp)) {
            return null;
        }
        return this.zzm;
    }

    final String zzm() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzn() {
        zza();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    final String zzo() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    final List zzp() {
        return this.zzi;
    }

    final void zzq() {
        String format;
        zzg();
        zzio zzioVar = this.zzu;
        if (zzioVar.zzm().zzh().zzr(zzjw.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzioVar.zzw().zzJ().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzioVar.zzaW().zzd().zza("Analytics Storage consent is not granted");
            format = null;
        }
        zzioVar.zzaW().zzd().zza(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.zzn = format;
        this.zzo = zzioVar.zzaU().currentTimeMillis();
    }

    final boolean zzr(String str) {
        String str2 = this.zzp;
        boolean z4 = false;
        if (str2 != null && !str2.equals(str)) {
            z4 = true;
        }
        this.zzp = str;
        return z4;
    }
}
