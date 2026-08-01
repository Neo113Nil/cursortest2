package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes2.dex */
public abstract class zzib {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private static volatile zzhz zze = null;
    private static volatile boolean zzf = false;
    final zzhy zza;
    final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;
    private static final Object zzd = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzid zzh = new zzid(new Object() { // from class: com.google.android.gms.internal.measurement.zzht
    }, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    /* synthetic */ zzib(zzhy zzhyVar, String str, Object obj, boolean z, zzia zziaVar) {
        if (zzhyVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzhyVar;
        this.zzb = str;
        this.zzj = obj;
        this.zzm = true;
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            Object obj = zzd;
            synchronized (obj) {
                if (zze == null) {
                    synchronized (obj) {
                        zzhz zzhzVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzhzVar == null || zzhzVar.zza() != context) {
                            zzhf.zze();
                            zzic.zzc();
                            zzhn.zze();
                            zze = new zzhc(context, zzim.zza(new zzii() { // from class: com.google.android.gms.internal.measurement.zzhs
                                @Override // com.google.android.gms.internal.measurement.zzii
                                public final Object zza() {
                                    Context context2 = context;
                                    int i = zzib.zzc;
                                    return zzho.zza(context2);
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3 A[Catch: all -> 0x00df, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:22:0x0066, B:24:0x0070, B:27:0x00a5, B:29:0x00b5, B:31:0x00cb, B:32:0x00ce, B:33:0x00d2, B:34:0x0079, B:36:0x007f, B:39:0x0095, B:41:0x009b, B:43:0x00a3, B:44:0x0091, B:48:0x0056, B:49:0x00d7, B:50:0x00dc, B:51:0x00dd), top: B:11:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        zzhk zza;
        String str;
        Object zzb;
        if (!this.zzm && this.zzb == null) {
            throw new NullPointerException("flagName must not be null");
        }
        int i = zzi.get();
        if (this.zzk < i) {
            synchronized (this) {
                if (this.zzk < i) {
                    zzhz zzhzVar = zze;
                    if (zzhzVar == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    zzhy zzhyVar = this.zza;
                    boolean z = zzhyVar.zzf;
                    if (zzhyVar.zzb == null) {
                        Context zza2 = zzhzVar.zza();
                        String str2 = this.zza.zza;
                        zza = zzic.zza(zza2, null, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhr
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzib.zzd();
                            }
                        });
                    } else if (zzhp.zza(zzhzVar.zza(), this.zza.zzb)) {
                        boolean z2 = this.zza.zzh;
                        zza = zzhf.zza(zzhzVar.zza().getContentResolver(), this.zza.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhr
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzib.zzd();
                            }
                        });
                    } else {
                        zza = null;
                    }
                    Object zza3 = (zza == null || (zzb = zza.zzb(zzc())) == null) ? null : zza(zzb);
                    if (zza3 == null) {
                        zzhy zzhyVar2 = this.zza;
                        if (!zzhyVar2.zze) {
                            zzif zzifVar = zzhyVar2.zzi;
                            zzhn zza4 = zzhn.zza(zzhzVar.zza());
                            zzhy zzhyVar3 = this.zza;
                            if (zzhyVar3.zze) {
                                str = null;
                            } else {
                                String str3 = zzhyVar3.zzc;
                                str = this.zzb;
                            }
                            String zzb2 = zza4.zzb(str);
                            if (zzb2 != null) {
                                zza3 = zza(zzb2);
                                if (zza3 == null) {
                                    zza3 = this.zzj;
                                }
                            }
                        }
                        zza3 = null;
                        if (zza3 == null) {
                        }
                    }
                    zzig zzigVar = (zzig) zzhzVar.zzb().zza();
                    if (zzigVar.zzb()) {
                        zzhh zzhhVar = (zzhh) zzigVar.zza();
                        zzhy zzhyVar4 = this.zza;
                        Uri uri = zzhyVar4.zzb;
                        String str4 = zzhyVar4.zza;
                        String zza5 = zzhhVar.zza(uri, null, zzhyVar4.zzd, this.zzb);
                        zza3 = zza5 == null ? this.zzj : zza(zza5);
                    }
                    this.zzl = zza3;
                    this.zzk = i;
                }
            }
        }
        return this.zzl;
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}
