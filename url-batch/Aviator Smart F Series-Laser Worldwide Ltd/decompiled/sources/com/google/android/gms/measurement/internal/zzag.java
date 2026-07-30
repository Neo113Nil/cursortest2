package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class zzag extends zzgx {
    private Boolean zza;
    private zzaf zzb;
    private Boolean zzc;

    zzag(zzge zzgeVar) {
        super(zzgeVar);
        this.zzb = new zzaf() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // com.google.android.gms.measurement.internal.zzaf
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzeh.zzD.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e8) {
            this.zzt.zzaA().zzd().zzb("Could not find SystemProperties class", e8);
            return "";
        } catch (IllegalAccessException e9) {
            this.zzt.zzaA().zzd().zzb("Could not access SystemProperties.get()", e9);
            return "";
        } catch (NoSuchMethodException e10) {
            this.zzt.zzaA().zzd().zzb("Could not find SystemProperties.get() method", e10);
            return "";
        } catch (InvocationTargetException e11) {
            this.zzt.zzaA().zzd().zzb("SystemProperties.get() threw an exception", e11);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzeh.zzd.zza(null)).longValue();
    }

    @WorkerThread
    public final double zza(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Double) zzegVar.zza(null)).doubleValue();
        }
        String zza = this.zzb.zza(str, zzegVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Double) zzegVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzegVar.zza(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzegVar.zza(null)).doubleValue();
        }
    }

    final int zzb(@Size(min = 1) String str) {
        return zzf(str, zzeh.zzH, 500, 2000);
    }

    public final int zzc() {
        return this.zzt.zzv().zzai(201500000, true) ? 100 : 25;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzf(str, zzeh.zzI, 25, 100);
    }

    @WorkerThread
    public final int zze(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Integer) zzegVar.zza(null)).intValue();
        }
        String zza = this.zzb.zza(str, zzegVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Integer) zzegVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzegVar.zza(Integer.valueOf(Integer.parseInt(zza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzegVar.zza(null)).intValue();
        }
    }

    @WorkerThread
    public final int zzf(String str, zzeg zzegVar, int i8, int i9) {
        return Math.max(Math.min(zze(str, zzegVar), i9), i8);
    }

    public final long zzh() {
        this.zzt.zzay();
        return 77000L;
    }

    @WorkerThread
    public final long zzi(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Long) zzegVar.zza(null)).longValue();
        }
        String zza = this.zzb.zza(str, zzegVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Long) zzegVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzegVar.zza(Long.valueOf(Long.parseLong(zza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzegVar.zza(null)).longValue();
        }
    }

    @VisibleForTesting
    final Bundle zzj() {
        try {
            if (this.zzt.zzaw().getPackageManager() == null) {
                this.zzt.zzaA().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzt.zzaw()).getApplicationInfo(this.zzt.zzaw().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzt.zzaA().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            this.zzt.zzaA().zzd().zzb("Failed to load metadata: Package name not found", e8);
            return null;
        }
    }

    @VisibleForTesting
    final Boolean zzk(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            this.zzt.zzaA().zzd().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (zzj.containsKey(str)) {
            return Boolean.valueOf(zzj.getBoolean(str));
        }
        return null;
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    final String zzn() {
        this.zzt.zzay();
        return "FA";
    }

    @WorkerThread
    public final String zzo(String str, zzeg zzegVar) {
        return str == null ? (String) zzegVar.zza(null) : (String) zzegVar.zza(this.zzb.zza(str, zzegVar.zzb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List zzp(@Size(min = 1) String str) {
        Integer valueOf;
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle zzj = zzj();
        if (zzj == null) {
            this.zzt.zzaA().zzd().zza("Failed to load metadata: Metadata bundle is null");
        } else if (zzj.containsKey("analytics.safelisted_events")) {
            valueOf = Integer.valueOf(zzj.getInt("analytics.safelisted_events"));
            if (valueOf != null) {
                try {
                    String[] stringArray = this.zzt.zzaw().getResources().getStringArray(valueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e8) {
                    this.zzt.zzaA().zzd().zzb("Failed to load string array from metadata: resource not found", e8);
                }
            }
            return null;
        }
        valueOf = null;
        if (valueOf != null) {
        }
        return null;
    }

    final void zzq(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public final boolean zzr() {
        Boolean zzk = zzk("google_analytics_adid_collection_enabled");
        return zzk == null || zzk.booleanValue();
    }

    @WorkerThread
    public final boolean zzs(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Boolean) zzegVar.zza(null)).booleanValue();
        }
        String zza = this.zzb.zza(str, zzegVar.zzb());
        return TextUtils.isEmpty(zza) ? ((Boolean) zzegVar.zza(null)).booleanValue() : ((Boolean) zzegVar.zza(Boolean.valueOf("1".equals(zza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean zzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzt.zzay();
        Boolean zzk = zzk("firebase_analytics_collection_deactivated");
        return zzk != null && zzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk("app_measurement_lite");
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzt.zzN();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                try {
                    if (this.zzc == null) {
                        ApplicationInfo applicationInfo = this.zzt.zzaw().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z7 = false;
                            if (str != null && str.equals(myProcessName)) {
                                z7 = true;
                            }
                            this.zzc = Boolean.valueOf(z7);
                        }
                        if (this.zzc == null) {
                            this.zzc = Boolean.TRUE;
                            this.zzt.zzaA().zzd().zza("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
