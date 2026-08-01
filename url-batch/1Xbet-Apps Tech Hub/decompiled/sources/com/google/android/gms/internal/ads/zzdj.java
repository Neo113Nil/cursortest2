package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzdj {
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzJ;
    private static final String zzK;
    private static final String zzL;
    private static final String zzM;
    private static final String zzN;
    private static final String zzO;
    private static final String zzP;
    private static final String zzQ;
    private static final String zzR;
    private static final String zzS;
    private static final String zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    public static final zzdj zza;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;

    @Deprecated
    public static final zzdj zzb;

    @Deprecated
    public static final zzn zzc;
    public final boolean zzA;
    public final boolean zzB;
    public final zzfwx zzC;
    public final zzfwz zzD;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfwu zzo;
    public final int zzp;
    public final zzfwu zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzfwu zzu;
    public final zzdh zzv;
    public final zzfwu zzw;
    public final int zzx;
    public final int zzy;
    public final boolean zzz;

    static {
        zzdj zzdjVar = new zzdj(new zzdi());
        zza = zzdjVar;
        zzb = zzdjVar;
        zzE = Integer.toString(1, 36);
        zzF = Integer.toString(2, 36);
        zzG = Integer.toString(3, 36);
        zzH = Integer.toString(4, 36);
        zzI = Integer.toString(5, 36);
        zzJ = Integer.toString(6, 36);
        zzK = Integer.toString(7, 36);
        zzL = Integer.toString(8, 36);
        zzM = Integer.toString(9, 36);
        zzN = Integer.toString(10, 36);
        zzO = Integer.toString(11, 36);
        zzP = Integer.toString(12, 36);
        zzQ = Integer.toString(13, 36);
        zzR = Integer.toString(14, 36);
        zzS = Integer.toString(15, 36);
        zzT = Integer.toString(16, 36);
        zzU = Integer.toString(17, 36);
        zzV = Integer.toString(18, 36);
        zzW = Integer.toString(19, 36);
        zzX = Integer.toString(20, 36);
        zzY = Integer.toString(21, 36);
        zzZ = Integer.toString(22, 36);
        zzaa = Integer.toString(23, 36);
        zzab = Integer.toString(24, 36);
        zzac = Integer.toString(25, 36);
        zzad = Integer.toString(26, 36);
        zzae = Integer.toString(27, 36);
        zzaf = Integer.toString(28, 36);
        zzag = Integer.toString(29, 36);
        zzah = Integer.toString(30, 36);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzdf
        };
    }

    protected zzdj(zzdi zzdiVar) {
        int i;
        int i2;
        boolean z;
        zzfwu zzfwuVar;
        zzfwu zzfwuVar2;
        zzfwu zzfwuVar3;
        zzdh zzdhVar;
        zzfwu zzfwuVar4;
        int i3;
        HashMap hashMap;
        HashSet hashSet;
        i = zzdiVar.zze;
        this.zzl = i;
        i2 = zzdiVar.zzf;
        this.zzm = i2;
        z = zzdiVar.zzg;
        this.zzn = z;
        zzfwuVar = zzdiVar.zzh;
        this.zzo = zzfwuVar;
        this.zzp = 0;
        zzfwuVar2 = zzdiVar.zzi;
        this.zzq = zzfwuVar2;
        this.zzr = 0;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        zzfwuVar3 = zzdiVar.zzl;
        this.zzu = zzfwuVar3;
        zzdhVar = zzdiVar.zzm;
        this.zzv = zzdhVar;
        zzfwuVar4 = zzdiVar.zzn;
        this.zzw = zzfwuVar4;
        i3 = zzdiVar.zzo;
        this.zzx = i3;
        this.zzy = 0;
        this.zzz = false;
        this.zzA = false;
        this.zzB = false;
        hashMap = zzdiVar.zzp;
        this.zzC = zzfwx.zzc(hashMap);
        hashSet = zzdiVar.zzq;
        this.zzD = zzfwz.zzl(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzdj zzdjVar = (zzdj) obj;
            if (this.zzn == zzdjVar.zzn && this.zzl == zzdjVar.zzl && this.zzm == zzdjVar.zzm && this.zzo.equals(zzdjVar.zzo) && this.zzq.equals(zzdjVar.zzq) && this.zzu.equals(zzdjVar.zzu) && this.zzv.equals(zzdjVar.zzv) && this.zzw.equals(zzdjVar.zzw) && this.zzx == zzdjVar.zzx && this.zzC.equals(zzdjVar.zzC) && this.zzD.equals(zzdjVar.zzD)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.zzn ? 1 : 0) - 1048002209) * 31) + this.zzl) * 31) + this.zzm) * 31) + this.zzo.hashCode()) * 961) + this.zzq.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.zzu.hashCode()) * 31) + 29791) * 31) + this.zzw.hashCode()) * 31) + this.zzx) * 28629151) + this.zzC.hashCode()) * 31) + this.zzD.hashCode();
    }
}
