package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzhq implements zzll, zzln {
    private final int zzb;
    private zzlo zzd;
    private int zze;
    private zzox zzf;
    private zzdb zzg;
    private int zzh;
    private zzwf zzi;
    private zzu[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzup zzq;
    private zzlm zzr;
    private final Object zza = new Object();
    private final zzkh zzc = new zzkh();
    private long zzm = Long.MIN_VALUE;
    private zzbe zzp = zzbe.zza;

    public zzhq(int i) {
        this.zzb = i;
    }

    private final void zzab(long j, boolean z) throws zzhz {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzA(j, z);
    }

    protected void zzA(long j, boolean z) throws zzhz {
        throw null;
    }

    protected void zzB() throws zzhz {
    }

    protected void zzC() {
    }

    protected void zzD() {
        throw null;
    }

    protected void zzE() {
    }

    protected void zzF() {
    }

    protected final long zzG() {
        return this.zzl;
    }

    protected final zzkh zzH() {
        zzkh zzkhVar = this.zzc;
        zzkhVar.zza = null;
        zzkhVar.zzb = null;
        return zzkhVar;
    }

    protected final zzbe zzM() {
        return this.zzp;
    }

    protected final zzhz zzN(Throwable th, zzu zzuVar, boolean z, int i) {
        int i2 = 4;
        if (zzuVar != null && !this.zzo) {
            this.zzo = true;
            try {
                i2 = zzaa(zzuVar) & 7;
            } catch (zzhz unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzhz.zzb(th, zzS(), this.zze, zzuVar, i2, this.zzq, z, i);
    }

    protected final int zzO(zzkh zzkhVar, zzhg zzhgVar, int i) {
        zzwf zzwfVar = this.zzi;
        zzwfVar.getClass();
        int zzd = zzwfVar.zzd(zzkhVar, zzhgVar, i);
        if (zzd == -4) {
            if (zzhgVar.zzb()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzhgVar.zze + this.zzk;
            zzhgVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
            return zzd;
        }
        if (zzd == -5) {
            zzu zzuVar = zzkhVar.zzb;
            zzuVar.getClass();
            long j2 = zzuVar.zzt;
            if (j2 != Long.MAX_VALUE) {
                zzs zza = zzuVar.zza();
                zza.zzr(j2 + this.zzk);
                zzkhVar.zzb = zza.zzM();
                return -5;
            }
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzR() {
        zzlm zzlmVar;
        synchronized (this.zza) {
            zzlmVar = this.zzr;
        }
        if (zzlmVar != null) {
            zzlmVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll, com.google.android.gms.internal.ads.zzln
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final zzln zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzc(int i, zzox zzoxVar, zzdb zzdbVar) {
        this.zze = i;
        this.zzf = zzoxVar;
        this.zzg = zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzcY() throws zzhz {
        zzghc.zzh(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzcZ(zzu[] zzuVarArr, zzwf zzwfVar, long j, long j2, zzup zzupVar) throws zzhz {
        zzghc.zzh(!this.zzn);
        this.zzi = zzwfVar;
        this.zzq = zzupVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzuVarArr;
        this.zzk = j2;
        zzz(zzuVarArr, j, j2, zzupVar);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public zzkm zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final zzwf zzda() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final boolean zzdb() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzf(zzlo zzloVar, zzu[] zzuVarArr, zzwf zzwfVar, long j, boolean z, boolean z2, long j2, long j3, zzup zzupVar) throws zzhz {
        zzghc.zzh(this.zzh == 0);
        this.zzd = zzloVar;
        this.zzq = zzupVar;
        this.zzh = 1;
        zzy(z, z2);
        zzcZ(zzuVarArr, zzwfVar, j2, j3, zzupVar);
        zzab(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzo(zzbe zzbeVar) {
        if (Objects.equals(this.zzp, zzbeVar)) {
            return;
        }
        this.zzp = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzp(long j) throws zzhz {
        zzab(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzq() {
        zzghc.zzh(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzr() {
        zzghc.zzh(this.zzh == 1);
        zzkh zzkhVar = this.zzc;
        zzkhVar.zza = null;
        zzkhVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzs() {
        zzghc.zzh(this.zzh == 0);
        zzkh zzkhVar = this.zzc;
        zzkhVar.zza = null;
        zzkhVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzt() {
        zzghc.zzh(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public int zzu() throws zzhz {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzv(zzlm zzlmVar) {
        synchronized (this.zza) {
            this.zzr = zzlmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzw() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public void zzx(int i, Object obj) throws zzhz {
    }

    protected void zzy(boolean z, boolean z2) throws zzhz {
    }

    protected void zzz(zzu[] zzuVarArr, long j, long j2, zzup zzupVar) throws zzhz {
    }

    protected final zzu[] zzI() {
        zzu[] zzuVarArr = this.zzj;
        zzuVarArr.getClass();
        return zzuVarArr;
    }

    protected final zzlo zzJ() {
        zzlo zzloVar = this.zzd;
        zzloVar.getClass();
        return zzloVar;
    }

    protected final zzox zzK() {
        zzox zzoxVar = this.zzf;
        zzoxVar.getClass();
        return zzoxVar;
    }

    protected final zzdb zzL() {
        zzdb zzdbVar = this.zzg;
        zzdbVar.getClass();
        return zzdbVar;
    }

    protected final int zzP(long j) {
        zzwf zzwfVar = this.zzi;
        zzwfVar.getClass();
        return zzwfVar.zze(j - this.zzk);
    }

    protected final boolean zzQ() {
        if (zzdb()) {
            return this.zzn;
        }
        zzwf zzwfVar = this.zzi;
        zzwfVar.getClass();
        return zzwfVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzn() throws IOException {
        zzwf zzwfVar = this.zzi;
        zzwfVar.getClass();
        zzwfVar.zzc();
    }
}
