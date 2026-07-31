package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzgv;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
public abstract class zzgz<T> {
    private static final Object zza = new Object();

    @Nullable
    private static volatile zzhg zzb = null;
    private static volatile boolean zzc = false;
    private static zzhk zzd;
    private static final AtomicInteger zze;
    private final zzhh zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile T zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static /* synthetic */ boolean zzd() {
        return true;
    }

    abstract T zza(Object obj);

    static /* synthetic */ zzgz zza(zzhh zzhhVar, String str, Boolean bool, boolean z) {
        return new zzhc(zzhhVar, str, bool, true);
    }

    static /* synthetic */ zzgz zza(zzhh zzhhVar, String str, Double d, boolean z) {
        return new zzhf(zzhhVar, str, d, true);
    }

    static /* synthetic */ zzgz zza(zzhh zzhhVar, String str, Long l, boolean z) {
        return new zzhd(zzhhVar, str, l, true);
    }

    static /* synthetic */ zzgz zza(zzhh zzhhVar, String str, String str2, boolean z) {
        return new zzhe(zzhhVar, str, str2, true);
    }

    public final T zza() {
        T zzb2;
        if (!this.zzk) {
            Preconditions.checkState(zzd.zza(this.zzg), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = zze.get();
        if (this.zzi < i) {
            synchronized (this) {
                if (this.zzi < i) {
                    zzhg zzhgVar = zzb;
                    Optional<zzgt> absent = Optional.absent();
                    String str = null;
                    if (zzhgVar != null) {
                        absent = zzhgVar.zzb().get();
                        if (absent.isPresent()) {
                            str = absent.get().zza(this.zzf.zzb, this.zzf.zza, this.zzf.zzd, this.zzg);
                        }
                    }
                    Preconditions.checkState(zzhgVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    if (!this.zzf.zzf ? (zzb2 = zzb(zzhgVar)) == null && (zzb2 = zza(zzhgVar)) == null : (zzb2 = zza(zzhgVar)) == null && (zzb2 = zzb(zzhgVar)) == null) {
                        zzb2 = zze();
                    }
                    if (absent.isPresent()) {
                        zzb2 = str == null ? zze() : zza((Object) str);
                    }
                    this.zzj = zzb2;
                    this.zzi = i;
                }
            }
        }
        return this.zzj;
    }

    private final T zze() {
        return (T) this.zzh;
    }

    @Nullable
    private final T zza(zzhg zzhgVar) {
        if (!this.zzf.zze && (this.zzf.zzh == null || this.zzf.zzh.apply(zzhgVar.zza()).booleanValue())) {
            Object zza2 = zzgs.zza(zzhgVar.zza()).zza(this.zzf.zze ? null : zza(this.zzf.zzc));
            if (zza2 != null) {
                return zza(zza2);
            }
        }
        return null;
    }

    @Nullable
    private final T zzb(zzhg zzhgVar) {
        zzgn zza2;
        Object zza3;
        if (this.zzf.zzb != null) {
            if (!zzgx.zza(zzhgVar.zza(), this.zzf.zzb)) {
                zza2 = null;
            } else if (this.zzf.zzg) {
                zza2 = zzgk.zza(zzhgVar.zza().getContentResolver(), zzgw.zza(zzgw.zza(zzhgVar.zza(), this.zzf.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgy
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgz.zzc();
                    }
                });
            } else {
                zza2 = zzgk.zza(zzhgVar.zza().getContentResolver(), this.zzf.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgy
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgz.zzc();
                    }
                });
            }
        } else {
            zza2 = zzhi.zza(zzhgVar.zza(), this.zzf.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgy
                @Override // java.lang.Runnable
                public final void run() {
                    zzgz.zzc();
                }
            });
        }
        if (zza2 == null || (zza3 = zza2.zza(zzb())) == null) {
            return null;
        }
        return zza(zza3);
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzg;
        }
        return str + this.zzg;
    }

    static {
        new AtomicReference();
        zzd = new zzhk(new zzhn() { // from class: com.google.android.gms.internal.measurement.zzha
            @Override // com.google.android.gms.internal.measurement.zzhn
            public final boolean zza() {
                return zzgz.zzd();
            }
        });
        zze = new AtomicInteger();
    }

    private zzgz(zzhh zzhhVar, String str, T t, boolean z) {
        this.zzi = -1;
        if (zzhhVar.zza == null && zzhhVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (zzhhVar.zza != null && zzhhVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzhhVar;
        this.zzg = str;
        this.zzh = t;
        this.zzk = z;
        this.zzl = false;
    }

    public static void zzc() {
        zze.incrementAndGet();
    }

    public static void zzb(final Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null && context != null) {
                synchronized (obj) {
                    zzhg zzhgVar = zzb;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzhgVar == null || zzhgVar.zza() != context) {
                        if (zzhgVar != null) {
                            zzgk.zzc();
                            zzhi.zza();
                            zzgs.zza();
                        }
                        zzb = new zzgh(context, Suppliers.memoize(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzhb
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                Optional zza2;
                                zza2 = zzgv.zza.zza(context);
                                return zza2;
                            }
                        }));
                        zze.incrementAndGet();
                    }
                }
            }
        }
    }
}
