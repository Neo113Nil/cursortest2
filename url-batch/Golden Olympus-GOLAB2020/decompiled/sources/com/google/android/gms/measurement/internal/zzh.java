package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzh {
    private Long zzA;
    private Long zzB;
    private long zzC;
    private String zzD;
    private int zzE;
    private int zzF;
    private long zzG;
    private String zzH;
    private byte[] zzI;
    private int zzJ;
    private long zzK;
    private long zzL;
    private long zzM;
    private long zzN;
    private long zzO;
    private long zzP;
    private String zzQ;
    private boolean zzR;
    private long zzS;
    private long zzT;
    private final zzio zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private String zzq;
    private Boolean zzr;
    private long zzs;
    private List zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private int zzy;
    private boolean zzz;

    zzh(zzio zzioVar, String str) {
        Preconditions.checkNotNull(zzioVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzioVar;
        this.zzb = str;
        zzioVar.zzaX().zzg();
    }

    public final String zzA() {
        this.zza.zzaX().zzg();
        return this.zzq;
    }

    public final String zzB() {
        this.zza.zzaX().zzg();
        String str = this.zzQ;
        zzaq(null);
        return str;
    }

    public final String zzC() {
        this.zza.zzaX().zzg();
        return this.zzb;
    }

    public final String zzD() {
        this.zza.zzaX().zzg();
        return this.zzc;
    }

    public final String zzE() {
        this.zza.zzaX().zzg();
        return this.zzl;
    }

    public final String zzF() {
        this.zza.zzaX().zzg();
        return this.zzj;
    }

    public final String zzG() {
        this.zza.zzaX().zzg();
        return this.zzf;
    }

    public final String zzH() {
        this.zza.zzaX().zzg();
        return this.zzd;
    }

    public final String zzI() {
        this.zza.zzaX().zzg();
        return this.zzQ;
    }

    public final String zzJ() {
        this.zza.zzaX().zzg();
        return this.zze;
    }

    public final String zzK() {
        this.zza.zzaX().zzg();
        return this.zzH;
    }

    public final String zzL() {
        this.zza.zzaX().zzg();
        return this.zzu;
    }

    public final String zzM() {
        this.zza.zzaX().zzg();
        return this.zzD;
    }

    public final List zzN() {
        this.zza.zzaX().zzg();
        return this.zzt;
    }

    public final void zzO() {
        this.zza.zzaX().zzg();
        this.zzR = false;
    }

    public final void zzP() {
        zzio zzioVar = this.zza;
        zzioVar.zzaX().zzg();
        long j4 = this.zzg + 1;
        if (j4 > 2147483647L) {
            zzioVar.zzaW().zzk().zzb("Bundle index overflow. appId", zzhe.zzn(this.zzb));
            j4 = 0;
        }
        this.zzR = true;
        this.zzg = j4;
    }

    public final void zzQ(long j4) {
        zzio zzioVar = this.zza;
        zzioVar.zzaX().zzg();
        long j5 = this.zzg + j4;
        if (j5 > 2147483647L) {
            zzioVar.zzaW().zzk().zzb("Bundle index overflow. appId", zzhe.zzn(this.zzb));
            j5 = (-1) + j4;
        }
        long j6 = this.zzG + 1;
        if (j6 > 2147483647L) {
            zzioVar.zzaW().zzk().zzb("Delivery index overflow. appId", zzhe.zzn(this.zzb));
            j6 = 0;
        }
        this.zzR = true;
        this.zzg = j5;
        this.zzG = j6;
    }

    public final void zzR(byte[] bArr) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzI != bArr;
        this.zzI = bArr;
    }

    public final void zzS(String str) {
        this.zza.zzaX().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzR |= true ^ Objects.equals(this.zzq, str);
        this.zzq = str;
    }

    public final void zzT(int i4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzy != i4;
        this.zzy = i4;
    }

    public final void zzU(boolean z4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzp != z4;
        this.zzp = z4;
    }

    public final void zzV(String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzc, str);
        this.zzc = str;
    }

    public final void zzW(String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzl, str);
        this.zzl = str;
    }

    public final void zzX(String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzj, str);
        this.zzj = str;
    }

    public final void zzY(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzk != j4;
        this.zzk = j4;
    }

    public final void zzZ(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzC != j4;
        this.zzC = j4;
    }

    public final int zza() {
        this.zza.zzaX().zzg();
        return this.zzy;
    }

    public final void zzaA(String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzu, str);
        this.zzu = str;
    }

    public final void zzaB(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzx != j4;
        this.zzx = j4;
    }

    public final void zzaC(String str) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzD != str;
        this.zzD = str;
    }

    public final void zzaD(boolean z4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzv != z4;
        this.zzv = z4;
    }

    public final void zzaE(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzw != j4;
        this.zzw = j4;
    }

    public final void zzaF(boolean z4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzz != z4;
        this.zzz = z4;
    }

    public final void zzaG(Long l4) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzA, l4);
        this.zzA = l4;
    }

    public final void zzaH(Long l4) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzB, l4);
        this.zzB = l4;
    }

    public final boolean zzaI() {
        this.zza.zzaX().zzg();
        return this.zzp;
    }

    public final boolean zzaJ() {
        this.zza.zzaX().zzg();
        return this.zzo;
    }

    public final boolean zzaK() {
        this.zza.zzaX().zzg();
        return this.zzR;
    }

    public final boolean zzaL() {
        this.zza.zzaX().zzg();
        return this.zzv;
    }

    public final boolean zzaM() {
        this.zza.zzaX().zzg();
        return this.zzz;
    }

    public final byte[] zzaN() {
        this.zza.zzaX().zzg();
        return this.zzI;
    }

    public final void zzaa(int i4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzJ != i4;
        this.zzJ = i4;
    }

    public final void zzab(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzS != j4;
        this.zzS = j4;
    }

    public final void zzac(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzN != j4;
        this.zzN = j4;
    }

    public final void zzad(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzO != j4;
        this.zzO = j4;
    }

    public final void zzae(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzM != j4;
        this.zzM = j4;
    }

    public final void zzaf(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzL != j4;
        this.zzL = j4;
    }

    public final void zzag(int i4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzF != i4;
        this.zzF = i4;
    }

    public final void zzah(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzP != j4;
        this.zzP = j4;
    }

    public final void zzai(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzK != j4;
        this.zzK = j4;
    }

    public final void zzaj(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzn != j4;
        this.zzn = j4;
    }

    public final void zzak(int i4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzE != i4;
        this.zzE = i4;
    }

    public final void zzal(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzs != j4;
        this.zzs = j4;
    }

    public final void zzam(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzT != j4;
        this.zzT = j4;
    }

    public final void zzan(String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzf, str);
        this.zzf = str;
    }

    public final void zzao(String str) {
        this.zza.zzaX().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzR |= true ^ Objects.equals(this.zzd, str);
        this.zzd = str;
    }

    public final void zzap(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzm != j4;
        this.zzm = j4;
    }

    public final void zzaq(String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzQ, str);
        this.zzQ = str;
    }

    public final void zzar(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzG != j4;
        this.zzG = j4;
    }

    public final void zzas(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzi != j4;
        this.zzi = j4;
    }

    public final void zzat(long j4) {
        Preconditions.checkArgument(j4 >= 0);
        this.zza.zzaX().zzg();
        this.zzR |= this.zzg != j4;
        this.zzg = j4;
    }

    public final void zzau(long j4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzh != j4;
        this.zzh = j4;
    }

    public final void zzav(boolean z4) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzo != z4;
        this.zzo = z4;
    }

    public final void zzaw(Boolean bool) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzr, bool);
        this.zzr = bool;
    }

    public final void zzax(String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zze, str);
        this.zze = str;
    }

    public final void zzay(List list) {
        this.zza.zzaX().zzg();
        if (Objects.equals(this.zzt, list)) {
            return;
        }
        this.zzR = true;
        this.zzt = list != null ? new ArrayList(list) : null;
    }

    public final void zzaz(String str) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzH != str;
        this.zzH = str;
    }

    public final int zzb() {
        this.zza.zzaX().zzg();
        return this.zzJ;
    }

    public final int zzc() {
        this.zza.zzaX().zzg();
        return this.zzF;
    }

    public final int zzd() {
        this.zza.zzaX().zzg();
        return this.zzE;
    }

    public final long zze() {
        this.zza.zzaX().zzg();
        return this.zzk;
    }

    public final long zzf() {
        this.zza.zzaX().zzg();
        return this.zzC;
    }

    public final long zzg() {
        this.zza.zzaX().zzg();
        return this.zzS;
    }

    public final long zzh() {
        this.zza.zzaX().zzg();
        return this.zzN;
    }

    public final long zzi() {
        this.zza.zzaX().zzg();
        return this.zzO;
    }

    public final long zzj() {
        this.zza.zzaX().zzg();
        return this.zzM;
    }

    public final long zzk() {
        this.zza.zzaX().zzg();
        return this.zzL;
    }

    public final long zzl() {
        this.zza.zzaX().zzg();
        return this.zzP;
    }

    public final long zzm() {
        this.zza.zzaX().zzg();
        return this.zzK;
    }

    public final long zzn() {
        this.zza.zzaX().zzg();
        return this.zzn;
    }

    public final long zzo() {
        this.zza.zzaX().zzg();
        return this.zzs;
    }

    public final long zzp() {
        this.zza.zzaX().zzg();
        return this.zzT;
    }

    public final long zzq() {
        this.zza.zzaX().zzg();
        return this.zzm;
    }

    public final long zzr() {
        this.zza.zzaX().zzg();
        return this.zzG;
    }

    public final long zzs() {
        this.zza.zzaX().zzg();
        return this.zzi;
    }

    public final long zzt() {
        this.zza.zzaX().zzg();
        return this.zzg;
    }

    public final long zzu() {
        this.zza.zzaX().zzg();
        return this.zzh;
    }

    public final long zzv() {
        this.zza.zzaX().zzg();
        return this.zzx;
    }

    public final long zzw() {
        this.zza.zzaX().zzg();
        return this.zzw;
    }

    public final Boolean zzx() {
        this.zza.zzaX().zzg();
        return this.zzr;
    }

    public final Long zzy() {
        this.zza.zzaX().zzg();
        return this.zzA;
    }

    public final Long zzz() {
        this.zza.zzaX().zzg();
        return this.zzB;
    }
}
