package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zziy extends zzf {

    @VisibleForTesting
    protected zziq zza;
    private volatile zziq zzb;
    private volatile zziq zzc;
    private final Map zzd;

    @GuardedBy("activityLock")
    private Activity zze;

    @GuardedBy("activityLock")
    private volatile boolean zzf;
    private volatile zziq zzg;
    private zziq zzh;

    @GuardedBy("activityLock")
    private boolean zzi;
    private final Object zzj;

    public zziy(zzge zzgeVar) {
        super(zzgeVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzA(zziq zziqVar, zziq zziqVar2, long j8, boolean z7, Bundle bundle) {
        long j9;
        long j10;
        zzg();
        boolean z8 = false;
        boolean z9 = (zziqVar2 != null && zziqVar2.zzc == zziqVar.zzc && zzir.zza(zziqVar2.zzb, zziqVar.zzb) && zzir.zza(zziqVar2.zza, zziqVar.zza)) ? false : true;
        if (z7 && this.zza != null) {
            z8 = true;
        }
        if (z9) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzlo.zzK(zziqVar, bundle2, true);
            if (zziqVar2 != null) {
                String str = zziqVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zziqVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zziqVar2.zzc);
            }
            if (z8) {
                zzkm zzkmVar = this.zzt.zzu().zzb;
                long j11 = j8 - zzkmVar.zzb;
                zzkmVar.zzb = j8;
                if (j11 > 0) {
                    this.zzt.zzv().zzI(bundle2, j11);
                }
            }
            if (!this.zzt.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zziqVar.zze ? TtmlNode.TEXT_EMPHASIS_AUTO : "app";
            long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
            if (zziqVar.zze) {
                j9 = currentTimeMillis;
                long j12 = zziqVar.zzf;
                if (j12 != 0) {
                    j10 = j12;
                    this.zzt.zzq().zzH(str3, "_vs", j10, bundle2);
                }
            } else {
                j9 = currentTimeMillis;
            }
            j10 = j9;
            this.zzt.zzq().zzH(str3, "_vs", j10, bundle2);
        }
        if (z8) {
            zzB(this.zza, true, j8);
        }
        this.zza = zziqVar;
        if (zziqVar.zze) {
            this.zzh = zziqVar;
        }
        this.zzt.zzt().zzG(zziqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzB(zziq zziqVar, boolean z7, long j8) {
        this.zzt.zzd().zzf(this.zzt.zzax().elapsedRealtime());
        if (!this.zzt.zzu().zzb.zzd(zziqVar != null && zziqVar.zzd, z7, j8) || zziqVar == null) {
            return;
        }
        zziqVar.zzd = false;
    }

    static /* bridge */ /* synthetic */ void zzp(zziy zziyVar, Bundle bundle, zziq zziqVar, zziq zziqVar2, long j8) {
        bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zziyVar.zzA(zziqVar, zziqVar2, j8, true, zziyVar.zzt.zzv().zzu(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    @MainThread
    private final zziq zzy(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zziq zziqVar = (zziq) this.zzd.get(activity);
        if (zziqVar == null) {
            zziq zziqVar2 = new zziq(null, zzl(activity.getClass(), "Activity"), this.zzt.zzv().zzq());
            this.zzd.put(activity, zziqVar2);
            zziqVar = zziqVar2;
        }
        return this.zzg != null ? this.zzg : zziqVar;
    }

    @MainThread
    private final void zzz(Activity activity, zziq zziqVar, boolean z7) {
        zziq zziqVar2;
        zziq zziqVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zziqVar.zzb == null) {
            zziqVar2 = new zziq(zziqVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zziqVar.zzc, zziqVar.zze, zziqVar.zzf);
        } else {
            zziqVar2 = zziqVar;
        }
        this.zzc = this.zzb;
        this.zzb = zziqVar2;
        this.zzt.zzaB().zzp(new zzit(this, zziqVar2, zziqVar3, this.zzt.zzax().elapsedRealtime(), z7));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final zziq zzi() {
        return this.zzb;
    }

    @WorkerThread
    public final zziq zzj(boolean z7) {
        zza();
        zzg();
        if (!z7) {
            return this.zza;
        }
        zziq zziqVar = this.zza;
        return zziqVar != null ? zziqVar : this.zzh;
    }

    @VisibleForTesting
    final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.zzt.zzf();
        if (length2 <= 100) {
            return str2;
        }
        this.zzt.zzf();
        return str2.substring(0, 100);
    }

    @MainThread
    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzt.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zziq(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zzt.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    @MainThread
    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        if (!this.zzt.zzf().zzu()) {
            this.zzb = null;
            this.zzt.zzaB().zzp(new zziv(this, elapsedRealtime));
        } else {
            zziq zzy = zzy(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            this.zzt.zzaB().zzp(new zziw(this, zzy, elapsedRealtime));
        }
    }

    @MainThread
    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzt.zzf().zzu()) {
                    this.zzg = null;
                    this.zzt.zzaB().zzp(new zzix(this));
                }
            }
        }
        if (!this.zzt.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzt.zzaB().zzp(new zziu(this));
        } else {
            zzz(activity, zzy(activity), false);
            zzd zzd = this.zzt.zzd();
            zzd.zzt.zzaB().zzp(new zzc(zzd, zzd.zzt.zzax().elapsedRealtime()));
        }
    }

    @MainThread
    public final void zzv(Activity activity, Bundle bundle) {
        zziq zziqVar;
        if (!this.zzt.zzf().zzu() || bundle == null || (zziqVar = (zziq) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zziqVar.zzc);
        bundle2.putString("name", zziqVar.zza);
        bundle2.putString("referrer_name", zziqVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r1 <= 100) goto L39;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzw(@NonNull Activity activity, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) {
        if (!this.zzt.zzf().zzu()) {
            this.zzt.zzaA().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zziq zziqVar = this.zzb;
        if (zziqVar == null) {
            this.zzt.zzaA().zzl().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzd.get(activity) == null) {
            this.zzt.zzaA().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzl(activity.getClass(), "Activity");
        }
        boolean zza = zzir.zza(zziqVar.zzb, str2);
        boolean zza2 = zzir.zza(zziqVar.zza, str);
        if (zza && zza2) {
            this.zzt.zzaA().zzl().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                this.zzt.zzf();
            }
            this.zzt.zzaA().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                int length2 = str2.length();
                this.zzt.zzf();
            }
            this.zzt.zzaA().zzl().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        this.zzt.zzaA().zzj().zzc("Setting current screen to name, class", str == null ? "null" : str, str2);
        zziq zziqVar2 = new zziq(str, str2, this.zzt.zzv().zzq());
        this.zzd.put(activity, zziqVar2);
        zzz(activity, zziqVar2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzx(Bundle bundle, long j8) {
        String str;
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    this.zzt.zzaA().zzl().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        this.zzt.zzf();
                    }
                    this.zzt.zzaA().zzl().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        this.zzt.zzf();
                    }
                    this.zzt.zzaA().zzl().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    Activity activity = this.zze;
                    str = activity != null ? zzl(activity.getClass(), "Activity") : "Activity";
                } else {
                    str = string2;
                }
                zziq zziqVar = this.zzb;
                if (this.zzf && zziqVar != null) {
                    this.zzf = false;
                    boolean zza = zzir.zza(zziqVar.zzb, str);
                    boolean zza2 = zzir.zza(zziqVar.zza, string);
                    if (zza && zza2) {
                        this.zzt.zzaA().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                this.zzt.zzaA().zzj().zzc("Logging screen view with name, class", string == null ? "null" : string, str == null ? "null" : str);
                zziq zziqVar2 = this.zzb == null ? this.zzc : this.zzb;
                zziq zziqVar3 = new zziq(string, str, this.zzt.zzv().zzq(), true, j8);
                this.zzb = zziqVar3;
                this.zzc = zziqVar2;
                this.zzg = zziqVar3;
                this.zzt.zzaB().zzp(new zzis(this, bundle, zziqVar3, zziqVar2, this.zzt.zzax().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
