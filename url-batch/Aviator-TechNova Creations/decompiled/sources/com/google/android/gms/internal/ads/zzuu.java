package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzuu extends zzij {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzuq zzC;
    private zzun zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private int zzO;
    private ByteBuffer zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    protected zzin zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzut zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzui zzc;
    private final zzuw zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zzub zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zztb zzl;
    private final AtomicInteger zzm;
    private zzv zzn;
    private zzv zzo;
    private zzth zzp;
    private zzth zzq;
    private zzmk zzr;
    private MediaCrypto zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzuk zzw;
    private zzv zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzuu(int i, zzui zzuiVar, zzuw zzuwVar, boolean z, float f) {
        super(i);
        this.zzc = zzuiVar;
        zzuwVar.getClass();
        this.zzd = zzuwVar;
        this.zze = f;
        this.zzm = new AtomicInteger();
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zzub zzubVar = new zzub();
        this.zzi = zzubVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzut.zza;
        zzubVar.zzj(0);
        zzubVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zztb();
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzW = 0;
        this.zzN = -1;
        this.zzO = -1;
        this.zzM = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzin();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzao() {
        this.zzS = false;
        zzat();
    }

    private final void zzat() {
        zzaw();
        this.zzU = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzT = false;
        this.zzl.zzb();
    }

    private final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        if (zzaK()) {
            zzaI();
            return true;
        }
        if (zzaL()) {
            zzav();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzav() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar == null) {
                throw null;
            }
            zzuk zzukVar2 = zzukVar;
            zzukVar.zzk();
        } finally {
            zzaN();
        }
    }

    private final void zzaw() {
        this.zzac = -9223372036854775807L;
        zzbo().zzf = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }

    private final boolean zzax(int i) throws zziw {
        zzlh zzH = zzH();
        zzih zzihVar = this.zzf;
        zzihVar.zza();
        int zzO = zzO(zzH, zzihVar, i | 4);
        if (zzO == -5) {
            zzam(zzH);
            return true;
        }
        if (zzO != -4 || !zzihVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbm();
        return false;
    }

    private final boolean zzay(long j) {
        return this.zzt == -9223372036854775807L || zzL().zzb() - j < this.zzt;
    }

    protected static boolean zzbd(zzv zzvVar) {
        return zzvVar.zzN == 0;
    }

    private final boolean zzbg() {
        return this.zzO >= 0;
    }

    private final void zzbh() {
        this.zzN = -1;
        this.zzg.zzc = null;
    }

    private final void zzbi() {
        this.zzO = -1;
        this.zzP = null;
    }

    private final boolean zzbj(zzv zzvVar) throws zziw {
        if (this.zzw != null && this.zzY != 3 && zze() != 0) {
            float f = this.zzv;
            zzvVar.getClass();
            float zzai = zzai(f, zzvVar, zzI());
            float f2 = this.zzA;
            if (f2 != zzai) {
                if (zzai == -1.0f) {
                    zzbl();
                    return false;
                }
                if (f2 != -1.0f || zzai > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzai);
                    zzuk zzukVar = this.zzw;
                    zzukVar.getClass();
                    zzukVar.zzp(bundle);
                    this.zzA = zzai;
                }
            }
        }
        return true;
    }

    private final boolean zzbk() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            if (this.zzG) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbp();
        }
        return true;
    }

    private final void zzbl() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbn(zzut zzutVar) {
        this.zzag = zzutVar;
        if (zzutVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final zzut zzbo() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zzut) arrayDeque.getLast() : this.zzag;
    }

    private final boolean zzbq(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzv zzvVar = this.zzo;
        return (zzvVar != null && Objects.equals(zzvVar.zzo, "audio/opus") && zzafu.zzf(j, j2)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzA(long j, boolean z, boolean z2) throws zziw {
        ArrayDeque arrayDeque = this.zzk;
        if (!arrayDeque.isEmpty()) {
            this.zzag = (zzut) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.zzad = false;
            this.zzae = false;
            if (this.zzS) {
                zzat();
            } else {
                zzaJ();
            }
            zzff zzffVar = this.zzag.zze;
            if (zzffVar.zzc() > 0) {
                this.zzaf = true;
            }
            zzffVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzD() {
        this.zzn = null;
        zzbn(zzut.zza);
        this.zzk.clear();
        if (this.zzS) {
            zzao();
        } else {
            zzau();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzE() {
        try {
            zzao();
            zzaI();
        } finally {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final long zzT(long j, long j2) {
        return zzah(j, j2, this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public void zzV(float f, float f2) throws zziw {
        this.zzu = f;
        this.zzv = f2;
        zzbj(this.zzx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03ec, code lost:
    
        if (r5 == null) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03ee, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03f7, code lost:
    
        if (r0 >= r5.zzr.size()) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03f9, code lost:
    
        r5 = (byte[]) r21.zzx.zzr.get(r0);
        r6 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0407, code lost:
    
        if (r6 == null) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0409, code lost:
    
        r7 = r6;
        r6.put(r5);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0412, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0413, code lost:
    
        r21.zzW = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0416, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0417, code lost:
    
        r0 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x041b, code lost:
    
        if (r0 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x041d, code lost:
    
        r5 = r0;
        r0 = r0.position();
        r5 = zzH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0428, code lost:
    
        r4.zzi(new com.google.android.gms.internal.ads.zzur(r21, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0430, code lost:
    
        r6 = r21.zzm.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0437, code lost:
    
        if (r6 != (-3)) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x044a, code lost:
    
        if (r6 != (-5)) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x044e, code lost:
    
        if (r21.zzW != 2) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0450, code lost:
    
        r21.zzg.zza();
        r21.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0457, code lost:
    
        zzam(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x045c, code lost:
    
        r5 = r21.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0462, code lost:
    
        if (r5.zzb() == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0498, code lost:
    
        if (r21.zzZ != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x049e, code lost:
    
        if (r5.zzc() != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04a0, code lost:
    
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04a5, code lost:
    
        if (r21.zzW != 2) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x04a7, code lost:
    
        r21.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04ab, code lost:
    
        r6 = r5.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04b1, code lost:
    
        if (zzaT(r5) != false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04b3, code lost:
    
        r8 = r5.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04b7, code lost:
    
        if (r8 == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04b9, code lost:
    
        r5.zzb.zzc(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04c0, code lost:
    
        if (r21.zzaf == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04c2, code lost:
    
        r0 = zzbo().zze;
        r9 = r21.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04ca, code lost:
    
        if (r9 == null) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x04cc, code lost:
    
        r10 = r9;
        r0.zza(r6, r9);
        r21.zzaf = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04d5, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x04d6, code lost:
    
        r21.zzac = java.lang.Math.max(r21.zzac, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04e2, code lost:
    
        if (zzcW() != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04e8, code lost:
    
        if (r5.zzd() == false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04f2, code lost:
    
        r5.zzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04f9, code lost:
    
        if (r5.zze() == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04fb, code lost:
    
        zzas(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0500, code lost:
    
        if (r21.zzak == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0502, code lost:
    
        r9 = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0506, code lost:
    
        if (r6 > r9) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0508, code lost:
    
        r21.zzal += (r9 - r6) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0512, code lost:
    
        r21.zzac = r6;
        r21.zzak = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0516, code lost:
    
        zzaR(r5);
        r10 = zzaS(r5);
        r6 = r6 + r21.zzal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0520, code lost:
    
        if (r8 == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0522, code lost:
    
        r0 = r4;
        r4.zzb(r21.zzN, 0, r5.zzb, r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0546, code lost:
    
        zzbh();
        r21.zzZ = true;
        r21.zzW = 0;
        r21.zza.zzc++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0530, code lost:
    
        r0 = r4;
        r0 = r21.zzN;
        r5 = r5.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0538, code lost:
    
        if (r5 == null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x053a, code lost:
    
        r6 = r5;
        r4.zza(r0, 0, r5.limit(), r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0555, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04ea, code lost:
    
        zzbo().zzf = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0464, code lost:
    
        zzbo().zzf = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x046e, code lost:
    
        if (r21.zzW != 2) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0470, code lost:
    
        r5.zza();
        r21.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0475, code lost:
    
        r21.zzad = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0479, code lost:
    
        if (r21.zzZ != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x047b, code lost:
    
        zzbm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0482, code lost:
    
        if (r21.zzJ != false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0484, code lost:
    
        r21.zzaa = true;
        r4.zza(r21.zzN, 0, 0, 0, 4);
        zzbh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x043d, code lost:
    
        if (zzcW() == false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x043f, code lost:
    
        zzbo().zzf = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0556, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0557, code lost:
    
        zzal(r0);
        zzax(0);
        zzav();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0568, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0569, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05a6, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03a5, code lost:
    
        if (r21.zzJ != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03a7, code lost:
    
        r21.zzaa = true;
        r4.zza(r21.zzN, 0, 0, 0, 4);
        zzbh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03b7, code lost:
    
        r21.zzX = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0373, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0264, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x02ce, code lost:
    
        if (r21.zzo != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0375, code lost:
    
        r4 = r21.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0377, code lost:
    
        if (r4 == null) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x037c, code lost:
    
        if (r21.zzX == 2) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0380, code lost:
    
        if (r21.zzad == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0384, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0389, code lost:
    
        if (r21.zzN >= 0) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x038b, code lost:
    
        r0 = r4.zze();
        r21.zzN = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0391, code lost:
    
        if (r0 < 0) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0393, code lost:
    
        r5 = r21.zzg;
        r5.zzc = r4.zzh(r0);
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03a0, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03a1, code lost:
    
        if (r21.zzX != 1) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03be, code lost:
    
        if (r21.zzH == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03c1, code lost:
    
        r21.zzH = false;
        r0 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03c7, code lost:
    
        if (r0 == null) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03c9, code lost:
    
        r5 = r0;
        r0.put(com.google.android.gms.internal.ads.zzuu.zzb);
        r4.zza(r21.zzN, 0, 38, 0, 0);
        zzbh();
        r21.zzZ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03e3, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03e4, code lost:
    
        r12 = false;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03e7, code lost:
    
        if (r21.zzW != 1) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03e9, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03ea, code lost:
    
        r5 = r21.zzx;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0571 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0326 A[Catch: IllegalStateException -> 0x0575, CryptoException -> 0x05a1, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x0575, blocks: (B:40:0x0322, B:42:0x0326), top: B:39:0x0322 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x036a A[LOOP:0: B:20:0x01f0->B:60:0x036a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.google.android.gms.internal.ads.zzml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzX(long j, long j2) throws zziw {
        boolean z;
        boolean z2;
        ?? r12;
        boolean z3;
        boolean z4;
        ?? r2;
        boolean z5;
        Throwable th;
        long j3;
        boolean z6;
        zzv zzvVar;
        boolean z7 = true;
        try {
            try {
                if (this.zzae) {
                    zzar();
                    return;
                }
                int i = 2;
                if (this.zzn == null && !zzax(2)) {
                    return;
                }
                zzaA();
                ?? r5 = 65531;
                Throwable th2 = null;
                try {
                    try {
                        try {
                            try {
                                if (this.zzS) {
                                    try {
                                        try {
                                            Trace.beginSection("bypassRender");
                                            while (true) {
                                                zzgrc.zzi(this.zzae ^ z7);
                                                zzub zzubVar = this.zzi;
                                                if (zzubVar.zzp()) {
                                                    ByteBuffer byteBuffer = zzubVar.zzc;
                                                    int i2 = this.zzO;
                                                    int zzo = zzubVar.zzo();
                                                    long j4 = zzubVar.zze;
                                                    boolean zzbq = zzbq(zzG(), zzubVar.zzn());
                                                    boolean zzb2 = zzubVar.zzb();
                                                    zzv zzvVar2 = this.zzo;
                                                    if (zzvVar2 == null) {
                                                        throw th2;
                                                    }
                                                    zzv zzvVar3 = zzvVar2;
                                                    if (!zzaq(j, j2, null, byteBuffer, i2, 0, zzo, j4, zzbq, zzb2, zzvVar2)) {
                                                        z7 = true;
                                                        break;
                                                    } else {
                                                        zzaV(zzubVar.zzn());
                                                        zzubVar.zza();
                                                        r2 = 0;
                                                    }
                                                } else {
                                                    r2 = th2;
                                                }
                                                try {
                                                    if (this.zzad) {
                                                        z7 = true;
                                                        this.zzae = true;
                                                        break;
                                                    }
                                                    z7 = true;
                                                    if (this.zzT) {
                                                        zzgrc.zzi(zzubVar.zzq(this.zzh));
                                                        z5 = false;
                                                        this.zzT = false;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (this.zzU) {
                                                        if (!zzubVar.zzp()) {
                                                            zzao();
                                                            this.zzU = z5;
                                                            zzaA();
                                                            if (!this.zzS) {
                                                                break;
                                                            }
                                                        } else {
                                                            th2 = r2;
                                                        }
                                                    }
                                                    zzgrc.zzi(!this.zzad);
                                                    zzlh zzH = zzH();
                                                    zzih zzihVar = this.zzh;
                                                    zzihVar.zza();
                                                    do {
                                                        zzihVar.zza();
                                                        int zzO = zzO(zzH, zzihVar, z5 ? 1 : 0);
                                                        if (zzO == -5) {
                                                            zzam(zzH);
                                                            break;
                                                        }
                                                        if (zzO == -4) {
                                                            if (!zzihVar.zzb()) {
                                                                this.zzac = Math.max(this.zzac, zzihVar.zze);
                                                                if (zzcW() || this.zzg.zzd()) {
                                                                    zzbo().zzf = this.zzac;
                                                                }
                                                                if (this.zzaf) {
                                                                    zzv zzvVar4 = this.zzn;
                                                                    if (zzvVar4 == null) {
                                                                        throw r2;
                                                                    }
                                                                    zzv zzvVar5 = zzvVar4;
                                                                    this.zzo = zzvVar4;
                                                                    if (Objects.equals(zzvVar4.zzo, "audio/opus") && !this.zzo.zzr.isEmpty()) {
                                                                        int zze = zzafu.zze((byte[]) this.zzo.zzr.get(z5 ? 1 : 0));
                                                                        zzt zza = this.zzo.zza();
                                                                        zza.zzH(zze);
                                                                        this.zzo = zza.zzM();
                                                                    }
                                                                    zzan(this.zzo, r2);
                                                                    this.zzaf = z5;
                                                                }
                                                                zzihVar.zzl();
                                                                zzv zzvVar6 = this.zzo;
                                                                if (zzvVar6 != null && Objects.equals(zzvVar6.zzo, "audio/opus")) {
                                                                    if (zzihVar.zze()) {
                                                                        zzihVar.zza = this.zzo;
                                                                        zzas(zzihVar);
                                                                    }
                                                                    if (zzafu.zzf(zzG(), zzihVar.zze)) {
                                                                        this.zzl.zza(zzihVar, this.zzo.zzr);
                                                                    }
                                                                }
                                                                if (zzubVar.zzp()) {
                                                                    long zzG = zzG();
                                                                    if (zzbq(zzG, zzubVar.zzn()) != zzbq(zzG, zzihVar.zze)) {
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                this.zzad = true;
                                                                zzbo().zzf = this.zzac;
                                                                break;
                                                            }
                                                        } else if (zzcW()) {
                                                            zzbo().zzf = this.zzac;
                                                        }
                                                    } while (zzubVar.zzq(zzihVar));
                                                    this.zzT = true;
                                                    if (zzubVar.zzp()) {
                                                        zzubVar.zzl();
                                                    }
                                                    if (!zzubVar.zzp() && !this.zzad && !this.zzU) {
                                                        break;
                                                    }
                                                    th2 = r2;
                                                } catch (IllegalStateException e) {
                                                    e = e;
                                                    z7 = true;
                                                    r5 = 0;
                                                    z = z7;
                                                    r12 = r5;
                                                    z3 = e instanceof MediaCodec.CodecException;
                                                    if (!z3) {
                                                        StackTraceElement[] stackTrace = e.getStackTrace();
                                                        if (stackTrace.length <= 0 || !stackTrace[r12].getClassName().equals("android.media.MediaCodec")) {
                                                            throw e;
                                                        }
                                                    }
                                                    zzal(e);
                                                    z4 = (z3 || !((MediaCodec.CodecException) e).isRecoverable()) ? r12 : z;
                                                    if (z4) {
                                                        zzaI();
                                                    }
                                                    zzum zzaP = zzaP(e, this.zzD);
                                                    throw zzN(zzaP, this.zzn, z4, zzaP.zza == 1101 ? 4006 : 4003);
                                                }
                                            }
                                            z5 = false;
                                            Trace.endSection();
                                        } catch (IllegalStateException e2) {
                                            e = e2;
                                        }
                                    } catch (MediaCodec.CryptoException e3) {
                                        e = e3;
                                        r5 = 0;
                                        z2 = r5;
                                        throw zzN(e, this.zzn, z2, zzfj.zzE(e.getErrorCode()));
                                    }
                                } else {
                                    char c = 65531;
                                    Throwable th3 = null;
                                    boolean z8 = false;
                                    if (this.zzw != null) {
                                        long zzb3 = zzL().zzb();
                                        Trace.beginSection("drainAndFeed");
                                        long j5 = zzb3;
                                        while (true) {
                                            zzuk zzukVar = this.zzw;
                                            if (zzukVar == null) {
                                                throw th3;
                                            }
                                            zzuk zzukVar2 = zzukVar;
                                            try {
                                                if (zzbg()) {
                                                    th = th3;
                                                } else {
                                                    try {
                                                        MediaCodec.BufferInfo bufferInfo = this.zzj;
                                                        int zzf = zzukVar.zzf(bufferInfo);
                                                        if (zzf >= 0) {
                                                            th = th3;
                                                            bufferInfo.presentationTimeUs -= this.zzal;
                                                            if (!this.zzI) {
                                                                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                                    zzbm();
                                                                    break;
                                                                }
                                                                this.zzO = zzf;
                                                                ByteBuffer zzj = zzukVar.zzj(zzf);
                                                                this.zzP = zzj;
                                                                if (zzj != null) {
                                                                    zzj.position(bufferInfo.offset);
                                                                    this.zzP.limit(bufferInfo.offset + bufferInfo.size);
                                                                }
                                                                zzv zzvVar7 = (zzv) this.zzag.zze.zze(bufferInfo.presentationTimeUs);
                                                                if (zzvVar7 == null && this.zzai && this.zzy != null) {
                                                                    zzvVar7 = (zzv) this.zzag.zze.zzd();
                                                                }
                                                                if (zzvVar7 != null) {
                                                                    this.zzo = zzvVar7;
                                                                } else if (this.zzz) {
                                                                }
                                                                zzv zzvVar8 = this.zzo;
                                                                if (zzvVar8 == null) {
                                                                    throw th;
                                                                }
                                                                zzv zzvVar9 = zzvVar8;
                                                                zzan(zzvVar8, this.zzy);
                                                                this.zzz = z8;
                                                                this.zzai = z8;
                                                            } else {
                                                                this.zzI = z8;
                                                                zzukVar.zzc(zzf, z8);
                                                                j3 = j5;
                                                                if (!zzay(j3)) {
                                                                }
                                                            }
                                                        } else if (zzf == -2) {
                                                            this.zzab = z7;
                                                            zzuk zzukVar3 = this.zzw;
                                                            if (zzukVar3 == null) {
                                                                throw th3;
                                                            }
                                                            zzuk zzukVar4 = zzukVar3;
                                                            MediaFormat zzg = zzukVar3.zzg();
                                                            if (this.zzE != 0 && zzg.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 32 && zzg.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 32) {
                                                                this.zzI = z7;
                                                            } else {
                                                                this.zzy = zzg;
                                                                this.zzz = z7;
                                                            }
                                                            th = th3;
                                                            j3 = j5;
                                                            if (!zzay(j3)) {
                                                                break;
                                                            }
                                                            j5 = j3;
                                                            th3 = th;
                                                            z7 = true;
                                                            i = 2;
                                                            z8 = false;
                                                            c = 65531;
                                                        } else {
                                                            if (this.zzJ && (this.zzad || this.zzX == i)) {
                                                                zzbm();
                                                            }
                                                            long j6 = this.zzK;
                                                            if (j6 != -9223372036854775807L && j6 + 100 < zzL().zza()) {
                                                                zzbm();
                                                            }
                                                            th = th3;
                                                        }
                                                    } catch (IllegalStateException e4) {
                                                        e = e4;
                                                        r12 = z8;
                                                        z = true;
                                                        z3 = e instanceof MediaCodec.CodecException;
                                                        if (!z3) {
                                                        }
                                                        zzal(e);
                                                        if (z3) {
                                                        }
                                                        if (z4) {
                                                        }
                                                        zzum zzaP2 = zzaP(e, this.zzD);
                                                        throw zzN(zzaP2, this.zzn, z4, zzaP2.zza == 1101 ? 4006 : 4003);
                                                    }
                                                }
                                                if (!this.zzak && this.zzj.presentationTimeUs >= zzG()) {
                                                    z6 = z8;
                                                    this.zzQ = z6;
                                                    long j7 = this.zzag.zzf;
                                                    this.zzR = (j7 != -9223372036854775807L || j7 > this.zzj.presentationTimeUs) ? z8 : true;
                                                    ByteBuffer byteBuffer2 = this.zzP;
                                                    int i3 = this.zzO;
                                                    MediaCodec.BufferInfo bufferInfo2 = this.zzj;
                                                    long j8 = j5;
                                                    int i4 = bufferInfo2.flags;
                                                    long j9 = bufferInfo2.presentationTimeUs;
                                                    boolean z9 = this.zzQ;
                                                    boolean z10 = this.zzR;
                                                    zzvVar = this.zzo;
                                                    if (zzvVar != null) {
                                                        throw th;
                                                    }
                                                    zzv zzvVar10 = zzvVar;
                                                    if (!zzaq(j, j2, zzukVar, byteBuffer2, i3, i4, 1, j9, z9, z10, zzvVar)) {
                                                        break;
                                                    }
                                                    zzaV(bufferInfo2.presentationTimeUs);
                                                    boolean z11 = (bufferInfo2.flags & 4) != 0;
                                                    if (!z11 && this.zzaa && this.zzR) {
                                                        this.zzK = zzL().zza();
                                                    }
                                                    zzbi();
                                                    if (z11) {
                                                        zzbm();
                                                        break;
                                                    } else {
                                                        j3 = j8;
                                                        if (!zzay(j3)) {
                                                        }
                                                    }
                                                }
                                                zzvVar = this.zzo;
                                                if (zzvVar != null) {
                                                }
                                            } catch (IllegalStateException e5) {
                                                e = e5;
                                                r12 = z8;
                                                z = true;
                                                z3 = e instanceof MediaCodec.CodecException;
                                                if (!z3) {
                                                }
                                                zzal(e);
                                                if (z3) {
                                                }
                                                if (z4) {
                                                }
                                                zzum zzaP22 = zzaP(e, this.zzD);
                                                throw zzN(zzaP22, this.zzn, z4, zzaP22.zza == 1101 ? 4006 : 4003);
                                            }
                                            z6 = true;
                                            this.zzQ = z6;
                                            long j72 = this.zzag.zzf;
                                            this.zzR = (j72 != -9223372036854775807L || j72 > this.zzj.presentationTimeUs) ? z8 : true;
                                            ByteBuffer byteBuffer22 = this.zzP;
                                            int i32 = this.zzO;
                                            MediaCodec.BufferInfo bufferInfo22 = this.zzj;
                                            long j82 = j5;
                                            int i42 = bufferInfo22.flags;
                                            long j92 = bufferInfo22.presentationTimeUs;
                                            boolean z92 = this.zzQ;
                                            boolean z102 = this.zzR;
                                        }
                                    } else {
                                        this.zza.zzd += zzP(j);
                                        zzax(1);
                                    }
                                }
                                this.zza.zza();
                            } catch (IllegalStateException e6) {
                                e = e6;
                                r12 = 0;
                            }
                        } catch (IllegalStateException e7) {
                            e = e7;
                        }
                    } catch (MediaCodec.CryptoException e8) {
                        e = e8;
                    }
                } catch (MediaCodec.CryptoException e9) {
                    e = e9;
                    throw zzN(e, this.zzn, z2, zzfj.zzE(e.getErrorCode()));
                } catch (IllegalStateException e10) {
                    e = e10;
                    z3 = e instanceof MediaCodec.CodecException;
                    if (!z3) {
                    }
                    zzal(e);
                    if (z3) {
                    }
                    if (z4) {
                    }
                    zzum zzaP222 = zzaP(e, this.zzD);
                    throw zzN(zzaP222, this.zzn, z4, zzaP222.zza == 1101 ? 4006 : 4003);
                }
                if (!zzay(j3)) {
                    Trace.endSection();
                    this.zza.zza();
                }
            } catch (MediaCodec.CryptoException e11) {
                e = e11;
                z2 = false;
            }
        } catch (IllegalStateException e12) {
            e = e12;
            z = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzZ() {
        return this.zzae;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0284 A[Catch: zzuq -> 0x02af, TryCatch #3 {zzuq -> 0x02af, blocks: (B:25:0x0055, B:27:0x005c, B:171:0x0063, B:173:0x0079, B:174:0x0084, B:29:0x0091, B:31:0x0099, B:33:0x009d, B:34:0x00a0, B:36:0x00a4, B:38:0x00ad, B:97:0x0268, B:99:0x0281, B:100:0x028a, B:103:0x0296, B:104:0x0298, B:106:0x0284, B:162:0x029a, B:164:0x029b, B:167:0x02a0, B:168:0x02a1, B:169:0x02ab, B:177:0x0088, B:178:0x0090, B:180:0x02ae), top: B:24:0x0055, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149 A[Catch: Exception -> 0x025a, TryCatch #4 {Exception -> 0x025a, blocks: (B:49:0x00e2, B:51:0x00ec, B:53:0x00fc, B:56:0x0138, B:58:0x0149, B:59:0x015e, B:61:0x0169, B:63:0x0171, B:65:0x017b, B:67:0x0185, B:69:0x018f, B:72:0x019c, B:74:0x01a4, B:77:0x01b0, B:79:0x01bb, B:83:0x0215, B:85:0x021b, B:118:0x01c7, B:120:0x01cb, B:122:0x01d3, B:124:0x01db, B:126:0x01e3, B:128:0x01eb, B:130:0x01f3, B:132:0x01fb, B:134:0x0205, B:136:0x020f), top: B:48:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bb A[Catch: Exception -> 0x025a, TryCatch #4 {Exception -> 0x025a, blocks: (B:49:0x00e2, B:51:0x00ec, B:53:0x00fc, B:56:0x0138, B:58:0x0149, B:59:0x015e, B:61:0x0169, B:63:0x0171, B:65:0x017b, B:67:0x0185, B:69:0x018f, B:72:0x019c, B:74:0x01a4, B:77:0x01b0, B:79:0x01bb, B:83:0x0215, B:85:0x021b, B:118:0x01c7, B:120:0x01cb, B:122:0x01d3, B:124:0x01db, B:126:0x01e3, B:128:0x01eb, B:130:0x01f3, B:132:0x01fb, B:134:0x0205, B:136:0x020f), top: B:48:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021b A[Catch: Exception -> 0x025a, TRY_LEAVE, TryCatch #4 {Exception -> 0x025a, blocks: (B:49:0x00e2, B:51:0x00ec, B:53:0x00fc, B:56:0x0138, B:58:0x0149, B:59:0x015e, B:61:0x0169, B:63:0x0171, B:65:0x017b, B:67:0x0185, B:69:0x018f, B:72:0x019c, B:74:0x01a4, B:77:0x01b0, B:79:0x01bb, B:83:0x0215, B:85:0x021b, B:118:0x01c7, B:120:0x01cb, B:122:0x01d3, B:124:0x01db, B:126:0x01e3, B:128:0x01eb, B:130:0x01f3, B:132:0x01fb, B:134:0x0205, B:136:0x020f), top: B:48:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0281 A[Catch: zzuq -> 0x02af, TryCatch #3 {zzuq -> 0x02af, blocks: (B:25:0x0055, B:27:0x005c, B:171:0x0063, B:173:0x0079, B:174:0x0084, B:29:0x0091, B:31:0x0099, B:33:0x009d, B:34:0x00a0, B:36:0x00a4, B:38:0x00ad, B:97:0x0268, B:99:0x0281, B:100:0x028a, B:103:0x0296, B:104:0x0298, B:106:0x0284, B:162:0x029a, B:164:0x029b, B:167:0x02a0, B:168:0x02a1, B:169:0x02ab, B:177:0x0088, B:178:0x0090, B:180:0x02ae), top: B:24:0x0055, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.google.android.gms.internal.ads.zzui] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzun] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzuh] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzaA() throws zziw {
        zzv zzvVar;
        boolean z;
        ?? r10;
        zzuq zzuqVar;
        zzv zzvVar2;
        long j;
        boolean z2;
        zzuk zzukVar;
        zzun zzunVar;
        if (this.zzw != null || this.zzS || (zzvVar = this.zzn) == null) {
            return;
        }
        boolean z3 = true;
        if (zzaB(zzvVar)) {
            zzao();
            String str = zzvVar.zzo;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzm(32);
            } else {
                this.zzi.zzm(1);
            }
            this.zzS = true;
            return;
        }
        zzth zzthVar = this.zzq;
        this.zzp = zzthVar;
        if (zzthVar != null) {
            zzgrc.zzi(true);
            this.zzp.zza();
        }
        try {
            zzv zzvVar3 = this.zzn;
            MediaCrypto mediaCrypto = null;
            if (zzvVar3 == null) {
                throw null;
            }
            zzv zzvVar4 = zzvVar3;
            if (this.zzB == null) {
                try {
                    List zzad = zzad(this.zzd, zzvVar3, false);
                    zzad.isEmpty();
                    this.zzB = new ArrayDeque();
                    if (!zzad.isEmpty()) {
                        this.zzB.add((zzun) zzad.get(0));
                    }
                    this.zzC = null;
                } catch (zzuy e) {
                    throw new zzuq(zzvVar3, (Throwable) e, false, -49998);
                }
            }
            if (this.zzB.isEmpty()) {
                throw new zzuq(zzvVar3, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzB;
            if (arrayDeque == null) {
                throw null;
            }
            ArrayDeque arrayDeque2 = arrayDeque;
            while (this.zzw == null) {
                zzun zzunVar2 = (zzun) arrayDeque.peekFirst();
                if (zzunVar2 == null) {
                    throw mediaCrypto;
                }
                zzun zzunVar3 = zzunVar2;
                zzaQ(zzvVar3);
                if (!zzaC(zzunVar2)) {
                    return;
                }
                try {
                    this.zzD = zzunVar2;
                    zzvVar2 = this.zzn;
                } catch (Exception e2) {
                    e = e2;
                    z = z3;
                }
                if (zzvVar2 == null) {
                    throw mediaCrypto;
                }
                zzv zzvVar5 = zzvVar2;
                String str2 = zzunVar2.zza;
                float zzai = zzai(this.zzv, zzvVar2, zzI());
                if (zzai <= this.zze) {
                    zzai = -1.0f;
                }
                long zzb2 = zzL().zzb();
                z = z3;
                try {
                    r10 = zzaf(zzunVar2, zzvVar2, mediaCrypto, zzai);
                } catch (Exception e3) {
                    e = e3;
                    r10 = zzunVar2;
                    zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                    arrayDeque.removeFirst();
                    zzuq zzuqVar2 = new zzuq(zzvVar3, (Throwable) e, false, (zzun) r10);
                    zzal(zzuqVar2);
                    zzuqVar = this.zzC;
                    if (zzuqVar == null) {
                    }
                    if (arrayDeque.isEmpty()) {
                    }
                }
                try {
                    if (Build.VERSION.SDK_INT >= 31) {
                        LogSessionId zza = zzK().zza();
                        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                            j = zzb2;
                            r10.zzb.setString("log-session-id", zza.getStringId());
                            StringBuilder sb = new StringBuilder(str2.length() + 12);
                            sb.append("createCodec:");
                            sb.append(str2);
                            Trace.beginSection(sb.toString());
                            zzuk zzb3 = this.zzc.zzb(r10);
                            this.zzw = zzb3;
                            this.zzL = zzb3.zzm(new zzus(this, null));
                            Trace.endSection();
                            long zzb4 = zzL().zzb();
                            if (!zzunVar2.zzc(zzvVar2)) {
                                Object[] objArr = {zzv.zze(zzvVar2), str2};
                                String str3 = zzfj.zza;
                                zzee.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                            }
                            this.zzA = zzai;
                            this.zzx = zzvVar2;
                            this.zzE = (Build.VERSION.SDK_INT > 25 && "OMX.Exynos.avc.dec.secure".equals(str2) && (Build.MODEL.startsWith("SM-T585") || Build.MODEL.startsWith("SM-A510") || Build.MODEL.startsWith("SM-A520") || Build.MODEL.startsWith("SM-J700"))) ? 2 : 0;
                            this.zzF = (Build.VERSION.SDK_INT == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z;
                            this.zzG = false;
                            String str4 = zzunVar2.zza;
                            if (Build.VERSION.SDK_INT <= 25) {
                                if ("OMX.rk.video_decoder.avc".equals(str4)) {
                                }
                                z2 = z;
                                this.zzJ = z2;
                                zzukVar = this.zzw;
                                if (zzukVar != null) {
                                    throw null;
                                }
                                zzuk zzukVar2 = zzukVar;
                                if (zze() == 2) {
                                    try {
                                        zzunVar = zzunVar2;
                                        try {
                                            this.zzM = zzL().zzb() + 1000;
                                        } catch (Exception e4) {
                                            e = e4;
                                            r10 = zzunVar;
                                            zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                            arrayDeque.removeFirst();
                                            zzuq zzuqVar22 = new zzuq(zzvVar3, (Throwable) e, false, (zzun) r10);
                                            zzal(zzuqVar22);
                                            zzuqVar = this.zzC;
                                            if (zzuqVar == null) {
                                                this.zzC = zzuqVar22;
                                            } else {
                                                this.zzC = zzuqVar.zza(zzuqVar22);
                                            }
                                            if (arrayDeque.isEmpty()) {
                                                throw this.zzC;
                                            }
                                            z3 = z;
                                            mediaCrypto = null;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        zzunVar = zzunVar2;
                                        r10 = zzunVar;
                                        zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                        arrayDeque.removeFirst();
                                        zzuq zzuqVar222 = new zzuq(zzvVar3, (Throwable) e, false, (zzun) r10);
                                        zzal(zzuqVar222);
                                        zzuqVar = this.zzC;
                                        if (zzuqVar == null) {
                                        }
                                        if (arrayDeque.isEmpty()) {
                                        }
                                    }
                                } else {
                                    zzunVar = zzunVar2;
                                }
                                this.zza.zza++;
                                r10 = zzunVar;
                                try {
                                    zzaj(str2, r10, zzb4, zzb4 - j);
                                } catch (Exception e6) {
                                    e = e6;
                                }
                                z3 = z;
                                mediaCrypto = null;
                            }
                            if ((Build.VERSION.SDK_INT <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str4) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str4) && !"OMX.bcm.vdec.avc.tunnel".equals(str4) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str4) && !"OMX.bcm.vdec.hevc.tunnel".equals(str4) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) && (!"Amazon".equals(Build.MANUFACTURER) || !"AFTS".equals(Build.MODEL) || !zzunVar2.zzf)) {
                                z2 = false;
                                this.zzJ = z2;
                                zzukVar = this.zzw;
                                if (zzukVar != null) {
                                }
                            }
                            z2 = z;
                            this.zzJ = z2;
                            zzukVar = this.zzw;
                            if (zzukVar != null) {
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(str2.length() + 12);
                    sb2.append("createCodec:");
                    sb2.append(str2);
                    Trace.beginSection(sb2.toString());
                    zzuk zzb32 = this.zzc.zzb(r10);
                    this.zzw = zzb32;
                    this.zzL = zzb32.zzm(new zzus(this, null));
                    Trace.endSection();
                    long zzb42 = zzL().zzb();
                    if (!zzunVar2.zzc(zzvVar2)) {
                    }
                    this.zzA = zzai;
                    this.zzx = zzvVar2;
                    this.zzE = (Build.VERSION.SDK_INT > 25 && "OMX.Exynos.avc.dec.secure".equals(str2) && (Build.MODEL.startsWith("SM-T585") || Build.MODEL.startsWith("SM-A510") || Build.MODEL.startsWith("SM-A520") || Build.MODEL.startsWith("SM-J700"))) ? 2 : 0;
                    this.zzF = (Build.VERSION.SDK_INT == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z;
                    this.zzG = false;
                    String str42 = zzunVar2.zza;
                    if (Build.VERSION.SDK_INT <= 25) {
                    }
                    if (Build.VERSION.SDK_INT <= 29) {
                    }
                    z2 = false;
                    this.zzJ = z2;
                    zzukVar = this.zzw;
                    if (zzukVar != null) {
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
                j = zzb2;
            }
            this.zzB = mediaCrypto;
        } catch (zzuq e7) {
            throw zzN(e7, zzvVar, false, 4001);
        }
    }

    protected final boolean zzaB(zzv zzvVar) {
        return this.zzq == null && zzae(zzvVar);
    }

    protected boolean zzaC(zzun zzunVar) {
        return true;
    }

    protected final boolean zzaD() {
        return this.zzS;
    }

    protected final zzuk zzaE() {
        return this.zzw;
    }

    protected final zzv zzaF() {
        return this.zzx;
    }

    protected final MediaFormat zzaG() {
        return this.zzy;
    }

    protected final zzun zzaH() {
        return this.zzD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzaI() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar != null) {
                zzukVar.zzl();
                this.zza.zzb++;
                zzun zzunVar = this.zzD;
                if (zzunVar == null) {
                    throw null;
                }
                zzun zzunVar2 = zzunVar;
                zzak(zzunVar.zza);
            }
        } finally {
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
        }
    }

    protected final boolean zzaJ() throws zziw {
        boolean zzau = zzau();
        if (zzau) {
            zzaA();
        }
        return zzau;
    }

    protected boolean zzaK() {
        int i = this.zzY;
        if (i == 3 || ((this.zzF && !this.zzab) || (this.zzG && this.zzaa))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbp();
            return false;
        } catch (zziw e) {
            zzee.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    protected boolean zzaL() {
        return true;
    }

    protected final long zzaM() {
        return this.zzal;
    }

    protected void zzaN() {
        zzbh();
        zzbi();
        zzaw();
        this.zzM = -9223372036854775807L;
        this.zzaa = false;
        this.zzK = -9223372036854775807L;
        this.zzZ = false;
        this.zzH = false;
        this.zzI = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    protected final void zzaO() {
        zzaN();
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzab = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzJ = false;
        this.zzL = false;
        this.zzV = false;
        this.zzW = 0;
    }

    protected zzum zzaP(Throwable th, zzun zzunVar) {
        return new zzum(th, zzunVar);
    }

    protected boolean zzaQ(zzv zzvVar) throws zziw {
        return true;
    }

    protected void zzaR(zzih zzihVar) throws zziw {
    }

    protected int zzaS(zzih zzihVar) {
        return 0;
    }

    protected boolean zzaT(zzih zzihVar) {
        return false;
    }

    protected final long zzaU() {
        return this.zzah;
    }

    protected void zzaV(long j) {
        this.zzah = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j < ((zzut) arrayDeque.peek()).zzb) {
                return;
            }
            zzut zzutVar = (zzut) arrayDeque.poll();
            zzutVar.getClass();
            zzbn(zzutVar);
            zzap();
        }
    }

    protected final boolean zzaW() {
        if (this.zzn == null) {
            return false;
        }
        if (zzQ() || zzbg()) {
            return true;
        }
        return this.zzM != -9223372036854775807L && zzL().zzb() < this.zzM;
    }

    protected final float zzaX() {
        return this.zzu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzmk zzaY() {
        return this.zzr;
    }

    protected final boolean zzaZ() throws zziw {
        return zzbj(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final int zzab(zzv zzvVar) throws zziw {
        try {
            return zzac(this.zzd, zzvVar);
        } catch (zzuy e) {
            throw zzN(e, zzvVar, false, 4002);
        }
    }

    protected abstract int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy;

    protected abstract List zzad(zzuw zzuwVar, zzv zzvVar, boolean z) throws zzuy;

    protected boolean zzae(zzv zzvVar) {
        return false;
    }

    protected abstract zzuh zzaf(zzun zzunVar, zzv zzvVar, MediaCrypto mediaCrypto, float f);

    protected zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    protected long zzah(long j, long j2, boolean z) {
        return super.zzT(j, j2);
    }

    protected float zzai(float f, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    protected void zzaj(String str, zzuh zzuhVar, long j, long j2) {
        throw null;
    }

    protected void zzak(String str) {
        throw null;
    }

    protected void zzal(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (zzbk() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ad, code lost:
    
        if (zzbk() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
    
        if (zzbk() == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzio zzam(zzlh zzlhVar) throws zziw {
        int i;
        boolean z = true;
        this.zzaf = true;
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        String str = zzvVar.zzo;
        if (str == null) {
            throw zzN(new IllegalArgumentException("Sample MIME type is null."), zzvVar, false, 4005);
        }
        if ((Objects.equals(str, "video/av01") || Objects.equals(str, "video/x-vnd.on2.vp9")) && !zzvVar.zzr.isEmpty()) {
            zzt zza = zzvVar.zza();
            zza.zzp(null);
            zzvVar = zza.zzM();
        }
        zzv zzvVar2 = zzvVar;
        this.zzq = zzlhVar.zza;
        this.zzn = zzvVar2;
        if (this.zzS) {
            this.zzU = true;
            return null;
        }
        zzuk zzukVar = this.zzw;
        if (zzukVar == null) {
            this.zzB = null;
            zzaA();
            return null;
        }
        zzun zzunVar = this.zzD;
        zzunVar.getClass();
        zzv zzvVar3 = this.zzx;
        zzvVar3.getClass();
        zzth zzthVar = this.zzp;
        zzth zzthVar2 = this.zzq;
        if (zzthVar != zzthVar2) {
            zzbl();
            return new zzio(zzunVar.zza, zzvVar3, zzvVar2, 0, 128);
        }
        zzio zzag = zzag(zzunVar, zzvVar3, zzvVar2);
        int i2 = zzag.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 == 1) {
                if (zzbj(zzvVar2)) {
                    this.zzx = zzvVar2;
                    if (zzthVar2 == zzthVar) {
                        if (this.zzZ) {
                            this.zzX = 1;
                            if (this.zzG) {
                                this.zzY = 3;
                            } else {
                                this.zzY = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 != 2) {
                if (zzbj(zzvVar2)) {
                    this.zzx = zzvVar2;
                    if (zzthVar2 != zzthVar) {
                    }
                }
                i = 16;
            } else {
                if (zzbj(zzvVar2)) {
                    this.zzV = true;
                    this.zzW = 1;
                    int i3 = this.zzE;
                    if (i3 != 2 && (i3 != 1 || zzvVar2.zzv != zzvVar3.zzv || zzvVar2.zzw != zzvVar3.zzw)) {
                        z = false;
                    }
                    this.zzH = z;
                    this.zzx = zzvVar2;
                    if (zzthVar2 != zzthVar) {
                    }
                }
                i = 16;
            }
            return (i2 != 0 || (this.zzw == zzukVar && this.zzY != 3)) ? zzag : new zzio(zzunVar.zza, zzvVar3, zzvVar2, 0, i);
        }
        zzbl();
        i = 0;
        if (i2 != 0) {
        }
    }

    protected void zzan(zzv zzvVar, MediaFormat mediaFormat) throws zziw {
        throw null;
    }

    protected void zzap() {
    }

    protected abstract boolean zzaq(long j, long j2, zzuk zzukVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zziw;

    protected void zzar() throws zziw {
        throw null;
    }

    protected void zzas(zzih zzihVar) throws zziw {
        throw null;
    }

    public final void zzaz() {
        this.zzaj = true;
    }

    protected final long zzba() {
        return this.zzag.zzf;
    }

    protected final long zzbb() {
        return this.zzag.zzd;
    }

    protected final long zzbc() {
        return this.zzag.zzc;
    }

    final /* synthetic */ void zzbe(zzlh zzlhVar) {
        this.zzm.set(zzO(zzlhVar, this.zzg, 0));
    }

    final /* synthetic */ zzmk zzbf() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmn
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public void zzx(int i, Object obj) throws zziw {
        if (i == 11) {
            zzmk zzmkVar = (zzmk) obj;
            zzmkVar.getClass();
            this.zzr = zzmkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzy(boolean z, boolean z2) throws zziw {
        this.zza = new zzin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zzz(zzv[] zzvVarArr, long j, long j2, zzwk zzwkVar) throws zziw {
        if (this.zzag.zzd == -9223372036854775807L) {
            zzbn(new zzut(-9223372036854775807L, j, j2));
            if (this.zzaj) {
                zzap();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.zzk;
        if (arrayDeque.isEmpty()) {
            long j3 = this.zzac;
            if (j3 != -9223372036854775807L) {
                long j4 = this.zzah;
                if (j4 != -9223372036854775807L) {
                }
            }
            zzbn(new zzut(-9223372036854775807L, j, j2));
            if (this.zzag.zzd != -9223372036854775807L) {
                zzap();
                return;
            }
            return;
        }
        arrayDeque.add(new zzut(this.zzac, j, j2));
    }

    private final void zzbp() throws zziw {
        zzth zzthVar = this.zzq;
        zzthVar.getClass();
        this.zzp = zzthVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final void zzbm() throws zziw {
        int i = this.zzY;
        if (i == 1) {
            zzav();
            return;
        }
        if (i == 2) {
            zzav();
            zzbp();
        } else if (i != 3) {
            this.zzae = true;
            zzar();
        } else {
            zzaI();
            zzaA();
        }
    }
}
