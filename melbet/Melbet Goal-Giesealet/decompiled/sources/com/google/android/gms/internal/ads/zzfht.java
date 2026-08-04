package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfht implements zzfhr {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfig zzj = zzfig.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    zzfht(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    final /* synthetic */ long zzA() {
        return this.zzb;
    }

    final /* synthetic */ long zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ int zzD() {
        return this.zze;
    }

    final /* synthetic */ String zzE() {
        return this.zzf;
    }

    final /* synthetic */ String zzF() {
        return this.zzg;
    }

    final /* synthetic */ String zzG() {
        return this.zzh;
    }

    final /* synthetic */ String zzH() {
        return this.zzi;
    }

    final /* synthetic */ zzfig zzI() {
        return this.zzj;
    }

    final /* synthetic */ String zzJ() {
        return this.zzk;
    }

    final /* synthetic */ String zzK() {
        return this.zzl;
    }

    final /* synthetic */ String zzL() {
        return this.zzm;
    }

    public final synchronized zzfht zzM(int i) {
        this.zzq = i;
        return this;
    }

    final /* synthetic */ int zzN() {
        return this.zzp;
    }

    final /* synthetic */ int zzO() {
        return this.zzq;
    }

    final /* synthetic */ int zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zza() {
        zzq();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final synchronized boolean zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzc() {
        zzr();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzd(boolean z) {
        zzs(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zze(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzf(zzfig zzfigVar) {
        zzu(zzfigVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzg(zzfct zzfctVar) {
        zzv(zzfctVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzi(String str) {
        zzx(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzj(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzk(String str) {
        zzz(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final synchronized zzfhu zzm() {
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzq();
        }
        if (this.zzc < 0) {
            zzr();
        }
        return new zzfhu(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzp(int i) {
        zzM(i);
        return this;
    }

    public final synchronized zzfht zzq() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.zzz zzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        this.zze = zzf.zzm(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        this.zzo = true;
        return this;
    }

    public final synchronized zzfht zzr() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        return this;
    }

    public final synchronized zzfht zzs(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfht zzt(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfht zzu(zzfig zzfigVar) {
        this.zzj = zzfigVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r2.zzg = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfht zzv(zzfct zzfctVar) {
        String str = zzfctVar.zzb.zzb;
        if (!TextUtils.isEmpty(str)) {
            this.zzf = str;
        }
        Iterator it = zzfctVar.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = ((zzfcj) it.next()).zzab;
            if (!TextUtils.isEmpty(str2)) {
                break;
            }
        }
        return this;
    }

    public final synchronized zzfht zzw(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzcvl zzcvlVar = (zzcvl) iBinder;
            String zzk = zzcvlVar.zzk();
            if (!TextUtils.isEmpty(zzk)) {
                this.zzf = zzk;
            }
            String zzf = zzcvlVar.zzf();
            if (!TextUtils.isEmpty(zzf)) {
                this.zzg = zzf;
            }
        }
        return this;
    }

    public final synchronized zzfht zzx(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfht zzy(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjC)).booleanValue()) {
            this.zzl = zzbtt.zzf(th);
            this.zzk = (String) zzghq.zza(zzggo.zzc('\n')).zzd(zzbtt.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfht zzz(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjC)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }
}
