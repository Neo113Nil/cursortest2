package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
public final class zzjy extends zzf {
    private final zzjx zza;
    private zzek zzb;
    private volatile Boolean zzc;
    private final zzap zzd;
    private final zzkp zze;
    private final List zzf;
    private final zzap zzg;

    protected zzjy(zzge zzgeVar) {
        super(zzgeVar);
        this.zzf = new ArrayList();
        this.zze = new zzkp(zzgeVar.zzax());
        this.zza = new zzjx(this);
        this.zzd = new zzji(this, zzgeVar);
        this.zzg = new zzjk(this, zzgeVar);
    }

    private final zzq zzO(boolean z) {
        Pair zza;
        this.zzt.zzay();
        zzel zzh = this.zzt.zzh();
        String str = null;
        if (z) {
            zzeu zzaA = this.zzt.zzaA();
            if (zzaA.zzt.zzm().zzb != null && (zza = zzaA.zzt.zzm().zzb.zza()) != null && zza != zzfj.zza) {
                str = String.valueOf(zza.second) + ":" + ((String) zza.first);
            }
        }
        return zzh.zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzt.zzaA().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                this.zzt.zzaA().zzd().zzb("Task exception while flushing queue", e);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzap zzapVar = this.zzd;
        this.zzt.zzf();
        zzapVar.zzd(((Long) zzeh.zzJ.zza(null)).longValue());
    }

    private final void zzR(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        long size = this.zzf.size();
        this.zzt.zzf();
        if (size >= 1000) {
            this.zzt.zzaA().zzd().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000L);
        zzr();
    }

    private final boolean zzS() {
        this.zzt.zzay();
        return true;
    }

    static /* bridge */ /* synthetic */ void zzo(zzjy zzjyVar, ComponentName componentName) {
        zzjyVar.zzg();
        if (zzjyVar.zzb != null) {
            zzjyVar.zzb = null;
            zzjyVar.zzt.zzaA().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjyVar.zzg();
            zzjyVar.zzr();
        }
    }

    protected final void zzA(zzaw zzawVar, String str) {
        Preconditions.checkNotNull(zzawVar);
        zzg();
        zza();
        zzS();
        zzR(new zzjn(this, true, zzO(true), this.zzt.zzi().zzo(zzawVar), zzawVar, str));
    }

    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzaw zzawVar, String str) {
        zzg();
        zza();
        if (this.zzt.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0) {
            zzR(new zzjj(this, zzawVar, str, zzcfVar));
        } else {
            this.zzt.zzaA().zzk().zza("Not bundling data. Service unavailable or out of date");
            this.zzt.zzv().zzT(zzcfVar, new byte[0]);
        }
    }

    protected final void zzC() {
        zzg();
        zza();
        zzq zzO = zzO(false);
        zzS();
        this.zzt.zzi().zzj();
        zzR(new zzjc(this, zzO));
    }

    final void zzD(zzek zzekVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i;
        zzg();
        zza();
        zzS();
        this.zzt.zzf();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzt.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i = zzi.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzekVar.zzk((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e) {
                        this.zzt.zzaA().zzd().zzb("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlj) {
                    try {
                        zzekVar.zzt((zzlj) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        this.zzt.zzaA().zzd().zzb("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzekVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        this.zzt.zzaA().zzd().zzb("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.zzt.zzaA().zzd().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    protected final void zzE(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zza();
        this.zzt.zzay();
        zzR(new zzjo(this, true, zzO(true), this.zzt.zzi().zzn(zzacVar), new zzac(zzacVar), zzacVar));
    }

    protected final void zzF(boolean z) {
        zzg();
        zza();
        if (z) {
            zzS();
            this.zzt.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzjm(this, zzO(false)));
        }
    }

    protected final void zzG(zziq zziqVar) {
        zzg();
        zza();
        zzR(new zzjg(this, zziqVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zzjh(this, zzO(false), bundle));
    }

    protected final void zzI() {
        zzg();
        zza();
        zzR(new zzjl(this, zzO(true)));
    }

    protected final void zzJ(zzek zzekVar) {
        zzg();
        Preconditions.checkNotNull(zzekVar);
        this.zzb = zzekVar;
        zzQ();
        zzP();
    }

    protected final void zzK(zzlj zzljVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzjb(this, zzO(true), this.zzt.zzi().zzp(zzljVar), zzljVar));
    }

    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzt.zzv().zzm() >= ((Integer) zzeh.zzah.zza(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zzN() {
        zzg();
        zza();
        if (this.zzc == null) {
            zzg();
            zza();
            zzfj zzm = this.zzt.zzm();
            zzm.zzg();
            boolean z = false;
            Boolean valueOf = !zzm.zza().contains("use_service") ? null : Boolean.valueOf(zzm.zza().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                this.zzt.zzay();
                if (this.zzt.zzh().zzh() != 1) {
                    this.zzt.zzaA().zzj().zza("Checking service availability");
                    int zzo = this.zzt.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (zzo != 0) {
                        if (zzo == 1) {
                            this.zzt.zzaA().zzj().zza("Service missing");
                        } else if (zzo != 2) {
                            if (zzo == 3) {
                                this.zzt.zzaA().zzk().zza("Service disabled");
                            } else if (zzo == 9) {
                                this.zzt.zzaA().zzk().zza("Service invalid");
                            } else if (zzo != 18) {
                                this.zzt.zzaA().zzk().zzb("Unexpected service status", Integer.valueOf(zzo));
                            } else {
                                this.zzt.zzaA().zzk().zza("Service updating");
                            }
                            r1 = false;
                        } else {
                            this.zzt.zzaA().zzc().zza("Service container out of date");
                            if (this.zzt.zzv().zzm() >= 17443) {
                                z = valueOf == null;
                                r1 = false;
                            }
                        }
                        if (z && this.zzt.zzf().zzx()) {
                            this.zzt.zzaA().zzd().zza("No way to upload. Consider using the full version of Analytics");
                        } else if (r1) {
                            zzfj zzm2 = this.zzt.zzm();
                            zzm2.zzg();
                            SharedPreferences.Editor edit = zzm2.zza().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        r1 = z;
                    } else {
                        this.zzt.zzaA().zzj().zza("Service available");
                    }
                }
                z = true;
                if (z) {
                }
                if (r1) {
                }
                r1 = z;
            }
            this.zzc = Boolean.valueOf(r1);
        }
        return this.zzc.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    final Boolean zzj() {
        return this.zzc;
    }

    protected final void zzq() {
        zzg();
        zza();
        zzq zzO = zzO(true);
        this.zzt.zzi().zzk();
        zzR(new zzjf(this, zzO));
    }

    final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (zzN()) {
            this.zza.zzc();
            return;
        }
        if (this.zzt.zzf().zzx()) {
            return;
        }
        this.zzt.zzay();
        List<ResolveInfo> queryIntentServices = this.zzt.zzaw().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzt.zzaw(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.zzt.zzaA().zzd().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzay();
        intent.setComponent(new ComponentName(zzaw, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zza.zzb(intent);
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzt.zzaw(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zzje(this, zzO(false), zzcfVar));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzjd(this, atomicReference, zzO(false)));
    }

    protected final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzjq(this, str, str2, zzO(false), zzcfVar));
    }

    protected final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjp(this, atomicReference, null, str2, str3, zzO(false)));
    }

    protected final void zzx(AtomicReference atomicReference, boolean z) {
        zzg();
        zza();
        zzR(new zzja(this, atomicReference, zzO(false), z));
    }

    protected final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z) {
        zzg();
        zza();
        zzR(new zziz(this, str, str2, zzO(false), z, zzcfVar));
    }

    protected final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        zzg();
        zza();
        zzR(new zzjr(this, atomicReference, null, str2, str3, zzO(false), z));
    }
}
