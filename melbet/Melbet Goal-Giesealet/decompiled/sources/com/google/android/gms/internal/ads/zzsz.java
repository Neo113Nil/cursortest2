package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzsz extends zzhq {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private ArrayDeque zzA;
    private zzsw zzB;
    private zzst zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzK;
    private long zzL;
    private int zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzhr zza;
    private boolean zzaa;
    private long zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzsy zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzso zzc;
    private final zztb zzd;
    private final float zze;
    private final zzhg zzf;
    private final zzhg zzg;
    private final zzhg zzh;
    private final zzsh zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrh zzl;
    private zzu zzm;
    private zzu zzn;
    private zzrn zzo;
    private zzrn zzp;
    private zzlk zzq;
    private MediaCrypto zzr;
    private long zzs;
    private float zzt;
    private float zzu;
    private zzsq zzv;
    private zzu zzw;
    private MediaFormat zzx;
    private boolean zzy;
    private float zzz;

    public zzsz(int i, zzso zzsoVar, zztb zztbVar, boolean z, float f) {
        super(i);
        this.zzc = zzsoVar;
        zztbVar.getClass();
        this.zzd = zztbVar;
        this.zze = f;
        this.zzf = new zzhg(0, 0);
        this.zzg = new zzhg(0, 0);
        this.zzh = new zzhg(2, 0);
        zzsh zzshVar = new zzsh();
        this.zzi = zzshVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzt = 1.0f;
        this.zzu = 1.0f;
        this.zzs = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzsy.zza;
        zzshVar.zzj(0);
        zzshVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrh();
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzV = 0;
        this.zzM = -1;
        this.zzN = -1;
        this.zzL = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzJ = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
        this.zza = new zzhr();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzan() {
        this.zzR = false;
        zzas();
    }

    private final void zzas() {
        zzav();
        this.zzT = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzS = false;
        this.zzl.zzb();
    }

    private final boolean zzat() {
        if (this.zzv == null) {
            return false;
        }
        if (zzaJ()) {
            zzaH();
            return true;
        }
        if (zzaK()) {
            zzau();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzau() {
        try {
            zzsq zzsqVar = this.zzv;
            if (zzsqVar == null) {
                throw null;
            }
            zzsq zzsqVar2 = zzsqVar;
            zzsqVar.zzj();
        } finally {
            zzaM();
        }
    }

    private final void zzav() {
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }

    private final boolean zzaw(int i) throws zzhz {
        zzkh zzH = zzH();
        zzhg zzhgVar = this.zzf;
        zzhgVar.zza();
        int zzO = zzO(zzH, zzhgVar, i | 4);
        if (zzO == -5) {
            zzal(zzH);
            return true;
        }
        if (zzO != -4 || !zzhgVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbj();
        return false;
    }

    private final boolean zzax(long j) {
        return this.zzs == -9223372036854775807L || zzL().zzb() - j < this.zzs;
    }

    protected static boolean zzbb(zzu zzuVar) {
        return zzuVar.zzN == 0;
    }

    private final boolean zzbd() {
        return this.zzN >= 0;
    }

    private final void zzbe() {
        this.zzM = -1;
        this.zzg.zzc = null;
    }

    private final void zzbf() {
        this.zzN = -1;
        this.zzO = null;
    }

    private final boolean zzbg(zzu zzuVar) throws zzhz {
        if (this.zzv != null && this.zzX != 3 && zze() != 0) {
            float f = this.zzu;
            zzuVar.getClass();
            float zzah = zzah(f, zzuVar, zzI());
            float f2 = this.zzz;
            if (f2 != zzah) {
                if (zzah == -1.0f) {
                    zzbi();
                    return false;
                }
                if (f2 != -1.0f || zzah > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzah);
                    zzsq zzsqVar = this.zzv;
                    zzsqVar.getClass();
                    zzsqVar.zzo(bundle);
                    this.zzz = zzah;
                }
            }
        }
        return true;
    }

    private final boolean zzbh() throws zzhz {
        if (this.zzY) {
            this.zzW = 1;
            if (this.zzF) {
                this.zzX = 3;
                return false;
            }
            this.zzX = 2;
        } else {
            zzbl();
        }
        return true;
    }

    private final void zzbi() throws zzhz {
        if (this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
        } else {
            zzaH();
            zzaz();
        }
    }

    private final void zzbk(zzsy zzsyVar) {
        this.zzag = zzsyVar;
        if (zzsyVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final boolean zzbm(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzu zzuVar = this.zzn;
        return (zzuVar != null && Objects.equals(zzuVar.zzo, "audio/opus") && zzadr.zzf(j, j2)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected void zzA(long j, boolean z) throws zzhz {
        this.zzad = false;
        this.zzae = false;
        if (this.zzR) {
            zzas();
        } else {
            zzaI();
        }
        zzek zzekVar = this.zzag.zze;
        if (zzekVar.zzc() > 0) {
            this.zzaf = true;
        }
        zzekVar.zzb();
        this.zzk.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected void zzD() {
        this.zzm = null;
        zzbk(zzsy.zza);
        this.zzk.clear();
        if (this.zzR) {
            zzan();
        } else {
            zzat();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected void zzE() {
        try {
            zzan();
            zzaH();
        } finally {
            this.zzp = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final long zzT(long j, long j2) {
        return zzag(j, j2, this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public void zzU(float f, float f2) throws zzhz {
        this.zzt = f;
        this.zzu = f2;
        zzbg(this.zzw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0395, code lost:
    
        if (r21.zzI != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0397, code lost:
    
        r21.zzZ = true;
        r4.zza(r21.zzM, 0, 0, 0, 4);
        zzbe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03a7, code lost:
    
        r21.zzW = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0363, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x02c0, code lost:
    
        if (r21.zzn != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x055c, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0560 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0316 A[Catch: IllegalStateException -> 0x0564, CryptoException -> 0x0590, TRY_LEAVE, TryCatch #0 {CryptoException -> 0x0590, blocks: (B:392:0x01b7, B:331:0x0091, B:332:0x0095, B:334:0x0099, B:337:0x009f, B:340:0x00b0, B:341:0x00bf, B:404:0x00cc, B:406:0x00d2, B:381:0x019f, B:383:0x01a5, B:384:0x01a8, B:386:0x01ae, B:388:0x01b2, B:345:0x00d8, B:402:0x00de, B:347:0x00e6, B:349:0x00f6, B:351:0x0100, B:354:0x0106, B:356:0x010a, B:358:0x0117, B:360:0x0121, B:361:0x013e, B:363:0x0146, B:364:0x0147, B:366:0x014e, B:368:0x0156, B:370:0x015c, B:371:0x0163, B:373:0x016f, B:374:0x0178, B:377:0x0193, B:380:0x0199, B:397:0x017f, B:400:0x00fe, B:408:0x019c, B:17:0x01cd, B:19:0x01d4, B:20:0x01e2, B:22:0x01e6, B:244:0x01f4, B:248:0x01ff, B:250:0x0205, B:252:0x0210, B:254:0x021a, B:256:0x0222, B:259:0x0225, B:261:0x022c, B:263:0x022d, B:265:0x0231, B:267:0x0235, B:269:0x0239, B:270:0x023c, B:272:0x0242, B:274:0x0251, B:277:0x0259, B:279:0x0266, B:280:0x026e, B:282:0x0272, B:285:0x0278, B:286:0x027c, B:288:0x0286, B:289:0x0295, B:291:0x02a3, B:293:0x02a7, B:295:0x02ab, B:297:0x02b7, B:298:0x02c2, B:300:0x02c6, B:26:0x02d6, B:28:0x02da, B:32:0x02ea, B:34:0x02f2, B:37:0x02fd, B:40:0x0312, B:42:0x0316, B:302:0x02d3, B:303:0x02ba, B:305:0x02be), top: B:15:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x035a A[LOOP:0: B:20:0x01e2->B:60:0x035a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzsz] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v49 */
    @Override // com.google.android.gms.internal.ads.zzll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzW(long j, long j2) throws zzhz {
        boolean z;
        boolean z2;
        ?? r12;
        boolean z3;
        boolean z4;
        boolean z5;
        ?? r2;
        boolean z6;
        Throwable th;
        long j3;
        boolean z7;
        zzu zzuVar;
        boolean z8 = true;
        try {
            try {
                if (this.zzae) {
                    zzaq();
                    return;
                }
                int i = 2;
                if (this.zzm == null && !zzaw(2)) {
                    return;
                }
                zzaz();
                char c = 65531;
                ?? r5 = -5;
                Throwable th2 = null;
                try {
                    try {
                        try {
                            try {
                                if (this.zzR) {
                                    try {
                                        try {
                                            Trace.beginSection("bypassRender");
                                            while (true) {
                                                zzghc.zzh(this.zzae ^ z8);
                                                zzsh zzshVar = this.zzi;
                                                if (zzshVar.zzp()) {
                                                    ByteBuffer byteBuffer = zzshVar.zzc;
                                                    int i2 = this.zzN;
                                                    int zzo = zzshVar.zzo();
                                                    long j4 = zzshVar.zze;
                                                    boolean zzbm = zzbm(zzG(), zzshVar.zzn());
                                                    boolean zzb2 = zzshVar.zzb();
                                                    zzu zzuVar2 = this.zzn;
                                                    if (zzuVar2 == null) {
                                                        throw th2;
                                                    }
                                                    zzu zzuVar3 = zzuVar2;
                                                    if (!zzap(j, j2, null, byteBuffer, i2, 0, zzo, j4, zzbm, zzb2, zzuVar2)) {
                                                        z8 = true;
                                                        break;
                                                    } else {
                                                        zzaU(zzshVar.zzn());
                                                        zzshVar.zza();
                                                        r2 = 0;
                                                    }
                                                } else {
                                                    r2 = th2;
                                                }
                                                try {
                                                    if (this.zzad) {
                                                        z8 = true;
                                                        this.zzae = true;
                                                        break;
                                                    }
                                                    z8 = true;
                                                    if (this.zzS) {
                                                        zzghc.zzh(zzshVar.zzq(this.zzh));
                                                        z6 = false;
                                                        this.zzS = false;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (this.zzT) {
                                                        if (!zzshVar.zzp()) {
                                                            zzan();
                                                            this.zzT = z6;
                                                            zzaz();
                                                            if (!this.zzR) {
                                                                break;
                                                            }
                                                        } else {
                                                            th2 = r2;
                                                        }
                                                    }
                                                    zzghc.zzh(!this.zzad);
                                                    zzkh zzH = zzH();
                                                    zzhg zzhgVar = this.zzh;
                                                    zzhgVar.zza();
                                                    do {
                                                        zzhgVar.zza();
                                                        int zzO = zzO(zzH, zzhgVar, z6 ? 1 : 0);
                                                        if (zzO == -5) {
                                                            zzal(zzH);
                                                            break;
                                                        }
                                                        if (zzO == -4) {
                                                            if (!zzhgVar.zzb()) {
                                                                long max = Math.max(this.zzab, zzhgVar.zze);
                                                                this.zzab = max;
                                                                if (zzdb() || this.zzg.zzd()) {
                                                                    this.zzac = max;
                                                                }
                                                                if (this.zzaf) {
                                                                    zzu zzuVar4 = this.zzm;
                                                                    if (zzuVar4 == null) {
                                                                        throw r2;
                                                                    }
                                                                    zzu zzuVar5 = zzuVar4;
                                                                    this.zzn = zzuVar4;
                                                                    if (Objects.equals(zzuVar4.zzo, "audio/opus") && !this.zzn.zzr.isEmpty()) {
                                                                        int zze = zzadr.zze((byte[]) this.zzn.zzr.get(z6 ? 1 : 0));
                                                                        zzs zza = this.zzn.zza();
                                                                        zza.zzH(zze);
                                                                        this.zzn = zza.zzM();
                                                                    }
                                                                    zzam(this.zzn, r2);
                                                                    this.zzaf = z6;
                                                                }
                                                                zzhgVar.zzl();
                                                                zzu zzuVar6 = this.zzn;
                                                                if (zzuVar6 != null && Objects.equals(zzuVar6.zzo, "audio/opus")) {
                                                                    if (zzhgVar.zze()) {
                                                                        zzhgVar.zza = this.zzn;
                                                                        zzar(zzhgVar);
                                                                    }
                                                                    if (zzadr.zzf(zzG(), zzhgVar.zze)) {
                                                                        this.zzl.zza(zzhgVar, this.zzn.zzr);
                                                                    }
                                                                }
                                                                if (zzshVar.zzp()) {
                                                                    long zzG = zzG();
                                                                    if (zzbm(zzG, zzshVar.zzn()) != zzbm(zzG, zzhgVar.zze)) {
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                this.zzad = true;
                                                                this.zzac = this.zzab;
                                                                break;
                                                            }
                                                        } else if (zzdb()) {
                                                            this.zzac = this.zzab;
                                                        }
                                                    } while (zzshVar.zzq(zzhgVar));
                                                    this.zzS = true;
                                                    if (zzshVar.zzp()) {
                                                        zzshVar.zzl();
                                                    }
                                                    if (!zzshVar.zzp() && !this.zzad && !this.zzT) {
                                                        break;
                                                    }
                                                    th2 = r2;
                                                } catch (IllegalStateException e) {
                                                    e = e;
                                                    z8 = true;
                                                    c = 0;
                                                    z2 = z8;
                                                    r12 = c;
                                                    z3 = e instanceof MediaCodec.CodecException;
                                                    if (!z3) {
                                                    }
                                                    zzak(e);
                                                    if (z3) {
                                                    }
                                                    if (z4) {
                                                    }
                                                    zzss zzaO = zzaO(e, this.zzC);
                                                    throw zzN(zzaO, this.zzm, z4, zzaO.zza != 1101 ? 4006 : 4003);
                                                }
                                            }
                                            z6 = false;
                                            Trace.endSection();
                                        } catch (MediaCodec.CryptoException e2) {
                                            e = e2;
                                            r5 = 0;
                                            z = r5;
                                            throw zzN(e, this.zzm, z, zzeo.zzF(e.getErrorCode()));
                                        }
                                    } catch (IllegalStateException e3) {
                                        e = e3;
                                    }
                                } else {
                                    char c2 = 65531;
                                    Throwable th3 = null;
                                    boolean z9 = false;
                                    if (this.zzv != null) {
                                        long zzb3 = zzL().zzb();
                                        Trace.beginSection("drainAndFeed");
                                        long j5 = zzb3;
                                        while (true) {
                                            zzsq zzsqVar = this.zzv;
                                            if (zzsqVar == null) {
                                                throw th3;
                                            }
                                            zzsq zzsqVar2 = zzsqVar;
                                            try {
                                                if (zzbd()) {
                                                    th = th3;
                                                } else {
                                                    try {
                                                        MediaCodec.BufferInfo bufferInfo = this.zzj;
                                                        int zzf = zzsqVar.zzf(bufferInfo);
                                                        if (zzf >= 0) {
                                                            th = th3;
                                                            bufferInfo.presentationTimeUs -= this.zzal;
                                                            if (!this.zzH) {
                                                                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                                    zzbj();
                                                                    break;
                                                                }
                                                                this.zzN = zzf;
                                                                ByteBuffer zzi = zzsqVar.zzi(zzf);
                                                                this.zzO = zzi;
                                                                if (zzi != null) {
                                                                    zzi.position(bufferInfo.offset);
                                                                    this.zzO.limit(bufferInfo.offset + bufferInfo.size);
                                                                }
                                                                zzu zzuVar7 = (zzu) this.zzag.zze.zze(bufferInfo.presentationTimeUs);
                                                                if (zzuVar7 == null && this.zzai && this.zzx != null) {
                                                                    zzuVar7 = (zzu) this.zzag.zze.zzd();
                                                                }
                                                                if (zzuVar7 != null) {
                                                                    this.zzn = zzuVar7;
                                                                } else if (this.zzy) {
                                                                }
                                                                zzu zzuVar8 = this.zzn;
                                                                if (zzuVar8 == null) {
                                                                    throw th;
                                                                }
                                                                zzu zzuVar9 = zzuVar8;
                                                                zzam(zzuVar8, this.zzx);
                                                                this.zzy = z9;
                                                                this.zzai = z9;
                                                            } else {
                                                                this.zzH = z9;
                                                                zzsqVar.zzc(zzf, z9);
                                                                j3 = j5;
                                                                if (!zzax(j3)) {
                                                                }
                                                            }
                                                        } else if (zzf == -2) {
                                                            this.zzaa = z8;
                                                            zzsq zzsqVar3 = this.zzv;
                                                            if (zzsqVar3 == null) {
                                                                throw th3;
                                                            }
                                                            zzsq zzsqVar4 = zzsqVar3;
                                                            MediaFormat zzg = zzsqVar3.zzg();
                                                            if (this.zzD != 0 && zzg.getInteger(ViewProps.WIDTH) == 32 && zzg.getInteger(ViewProps.HEIGHT) == 32) {
                                                                this.zzH = z8;
                                                            } else {
                                                                this.zzx = zzg;
                                                                this.zzy = z8;
                                                            }
                                                            th = th3;
                                                            j3 = j5;
                                                            if (!zzax(j3)) {
                                                                break;
                                                            }
                                                            j5 = j3;
                                                            th3 = th;
                                                            z8 = true;
                                                            i = 2;
                                                            z9 = false;
                                                            c2 = 65531;
                                                        } else {
                                                            if (this.zzI && (this.zzad || this.zzW == i)) {
                                                                zzbj();
                                                            }
                                                            long j6 = this.zzJ;
                                                            if (j6 != -9223372036854775807L && j6 + 100 < zzL().zza()) {
                                                                zzbj();
                                                            }
                                                            th = th3;
                                                        }
                                                    } catch (IllegalStateException e4) {
                                                        e = e4;
                                                        z5 = z9;
                                                        z2 = true;
                                                        r12 = z5;
                                                        z3 = e instanceof MediaCodec.CodecException;
                                                        if (!z3) {
                                                        }
                                                        zzak(e);
                                                        if (z3) {
                                                        }
                                                        if (z4) {
                                                        }
                                                        zzss zzaO2 = zzaO(e, this.zzC);
                                                        throw zzN(zzaO2, this.zzm, z4, zzaO2.zza != 1101 ? 4006 : 4003);
                                                    }
                                                }
                                                if (!this.zzak && this.zzj.presentationTimeUs >= zzG()) {
                                                    z7 = z9;
                                                    this.zzP = z7;
                                                    long j7 = this.zzac;
                                                    this.zzQ = (j7 != -9223372036854775807L || j7 > this.zzj.presentationTimeUs) ? z9 : true;
                                                    ByteBuffer byteBuffer2 = this.zzO;
                                                    int i3 = this.zzN;
                                                    MediaCodec.BufferInfo bufferInfo2 = this.zzj;
                                                    long j8 = j5;
                                                    int i4 = bufferInfo2.flags;
                                                    long j9 = bufferInfo2.presentationTimeUs;
                                                    boolean z10 = this.zzP;
                                                    boolean z11 = this.zzQ;
                                                    zzuVar = this.zzn;
                                                    if (zzuVar != null) {
                                                        throw th;
                                                    }
                                                    zzu zzuVar10 = zzuVar;
                                                    if (!zzap(j, j2, zzsqVar, byteBuffer2, i3, i4, 1, j9, z10, z11, zzuVar)) {
                                                        break;
                                                    }
                                                    zzaU(bufferInfo2.presentationTimeUs);
                                                    boolean z12 = (bufferInfo2.flags & 4) != 0;
                                                    if (!z12 && this.zzZ && this.zzQ) {
                                                        this.zzJ = zzL().zza();
                                                    }
                                                    zzbf();
                                                    if (z12) {
                                                        zzbj();
                                                        break;
                                                    } else {
                                                        j3 = j8;
                                                        if (!zzax(j3)) {
                                                        }
                                                    }
                                                }
                                                zzuVar = this.zzn;
                                                if (zzuVar != null) {
                                                }
                                            } catch (IllegalStateException e5) {
                                                e = e5;
                                                r12 = z9;
                                                z2 = true;
                                                z3 = e instanceof MediaCodec.CodecException;
                                                if (!z3) {
                                                }
                                                zzak(e);
                                                if (z3) {
                                                }
                                                if (z4) {
                                                }
                                                zzss zzaO22 = zzaO(e, this.zzC);
                                                throw zzN(zzaO22, this.zzm, z4, zzaO22.zza != 1101 ? 4006 : 4003);
                                            }
                                            z7 = true;
                                            this.zzP = z7;
                                            long j72 = this.zzac;
                                            this.zzQ = (j72 != -9223372036854775807L || j72 > this.zzj.presentationTimeUs) ? z9 : true;
                                            ByteBuffer byteBuffer22 = this.zzO;
                                            int i32 = this.zzN;
                                            MediaCodec.BufferInfo bufferInfo22 = this.zzj;
                                            long j82 = j5;
                                            int i42 = bufferInfo22.flags;
                                            long j92 = bufferInfo22.presentationTimeUs;
                                            boolean z102 = this.zzP;
                                            boolean z112 = this.zzQ;
                                        }
                                        j3 = j5;
                                        while (true) {
                                            zzsq zzsqVar5 = this.zzv;
                                            if (zzsqVar5 == null || this.zzW == 2 || this.zzad) {
                                                break;
                                            }
                                            zzsq zzsqVar6 = zzsqVar5;
                                            if (this.zzM < 0) {
                                                int zze2 = zzsqVar5.zze();
                                                this.zzM = zze2;
                                                if (zze2 < 0) {
                                                    break;
                                                }
                                                zzhg zzhgVar2 = this.zzg;
                                                zzhgVar2.zzc = zzsqVar5.zzh(zze2);
                                                zzhgVar2.zza();
                                            }
                                            z2 = true;
                                            if (this.zzW == 1) {
                                                break;
                                            }
                                            try {
                                                if (this.zzG) {
                                                    this.zzG = false;
                                                    ByteBuffer byteBuffer3 = this.zzg.zzc;
                                                    if (byteBuffer3 == null) {
                                                        throw th;
                                                    }
                                                    ByteBuffer byteBuffer4 = byteBuffer3;
                                                    byteBuffer3.put(zzb);
                                                    zzsqVar5.zza(this.zzM, 0, 38, 0L, 0);
                                                    zzbe();
                                                    this.zzY = true;
                                                } else {
                                                    if (this.zzV == 1) {
                                                        int i5 = 0;
                                                        while (true) {
                                                            zzu zzuVar11 = this.zzw;
                                                            if (zzuVar11 == null) {
                                                                throw th;
                                                            }
                                                            zzu zzuVar12 = zzuVar11;
                                                            if (i5 >= zzuVar11.zzr.size()) {
                                                                this.zzV = 2;
                                                                break;
                                                            }
                                                            byte[] bArr = (byte[]) this.zzw.zzr.get(i5);
                                                            ByteBuffer byteBuffer5 = this.zzg.zzc;
                                                            if (byteBuffer5 == null) {
                                                                throw th;
                                                            }
                                                            ByteBuffer byteBuffer6 = byteBuffer5;
                                                            byteBuffer5.put(bArr);
                                                            i5++;
                                                        }
                                                    }
                                                    zzhg zzhgVar3 = this.zzg;
                                                    ByteBuffer byteBuffer7 = zzhgVar3.zzc;
                                                    if (byteBuffer7 == null) {
                                                        throw th;
                                                    }
                                                    ByteBuffer byteBuffer8 = byteBuffer7;
                                                    int position = byteBuffer7.position();
                                                    zzkh zzH2 = zzH();
                                                    try {
                                                        int zzO2 = zzO(zzH2, zzhgVar3, 0);
                                                        if (zzO2 == -3) {
                                                            if (zzdb()) {
                                                                this.zzac = this.zzab;
                                                            }
                                                        } else if (zzO2 == -5) {
                                                            if (this.zzV == 2) {
                                                                this.zzg.zza();
                                                                this.zzV = 1;
                                                            }
                                                            zzal(zzH2);
                                                        } else {
                                                            zzhg zzhgVar4 = this.zzg;
                                                            if (zzhgVar4.zzb()) {
                                                                this.zzac = this.zzab;
                                                                if (this.zzV == 2) {
                                                                    zzhgVar4.zza();
                                                                    this.zzV = 1;
                                                                }
                                                                this.zzad = true;
                                                                if (!this.zzY) {
                                                                    zzbj();
                                                                } else if (!this.zzI) {
                                                                    this.zzZ = true;
                                                                    zzsqVar5.zza(this.zzM, 0, 0, 0L, 4);
                                                                    zzbe();
                                                                }
                                                            } else if (!this.zzY && !zzhgVar4.zzc()) {
                                                                zzhgVar4.zza();
                                                                if (this.zzV == 2) {
                                                                    this.zzV = 1;
                                                                }
                                                            } else if (!zzaS(zzhgVar4)) {
                                                                boolean zzk = zzhgVar4.zzk();
                                                                if (zzk) {
                                                                    zzhgVar4.zzb.zzc(position);
                                                                }
                                                                long j10 = zzhgVar4.zze;
                                                                if (this.zzaf) {
                                                                    ArrayDeque arrayDeque = this.zzk;
                                                                    if (arrayDeque.isEmpty()) {
                                                                        zzek zzekVar = this.zzag.zze;
                                                                        zzu zzuVar13 = this.zzm;
                                                                        if (zzuVar13 == null) {
                                                                            throw th;
                                                                        }
                                                                        zzu zzuVar14 = zzuVar13;
                                                                        zzekVar.zza(j10, zzuVar13);
                                                                    } else {
                                                                        zzek zzekVar2 = ((zzsy) arrayDeque.peekLast()).zze;
                                                                        zzu zzuVar15 = this.zzm;
                                                                        if (zzuVar15 == null) {
                                                                            throw th;
                                                                        }
                                                                        zzu zzuVar16 = zzuVar15;
                                                                        zzekVar2.zza(j10, zzuVar15);
                                                                    }
                                                                    this.zzaf = false;
                                                                }
                                                                long max2 = Math.max(this.zzab, j10);
                                                                this.zzab = max2;
                                                                if (zzdb() || zzhgVar4.zzd()) {
                                                                    this.zzac = max2;
                                                                }
                                                                zzhgVar4.zzl();
                                                                if (zzhgVar4.zze()) {
                                                                    zzar(zzhgVar4);
                                                                }
                                                                if (this.zzak) {
                                                                    long j11 = this.zzab;
                                                                    if (j10 <= j11) {
                                                                        this.zzal += (j11 - j10) + 1;
                                                                    }
                                                                    this.zzab = j10;
                                                                    this.zzak = false;
                                                                }
                                                                zzaQ(zzhgVar4);
                                                                int zzaR = zzaR(zzhgVar4);
                                                                long j12 = j10 + this.zzal;
                                                                if (zzk) {
                                                                    zzsq zzsqVar7 = zzsqVar5;
                                                                    zzsqVar5.zzb(this.zzM, 0, zzhgVar4.zzb, j12, zzaR);
                                                                } else {
                                                                    zzsq zzsqVar8 = zzsqVar5;
                                                                    int i6 = this.zzM;
                                                                    ByteBuffer byteBuffer9 = zzhgVar4.zzc;
                                                                    if (byteBuffer9 == null) {
                                                                        throw th;
                                                                    }
                                                                    ByteBuffer byteBuffer10 = byteBuffer9;
                                                                    zzsqVar5.zza(i6, 0, byteBuffer9.limit(), j12, zzaR);
                                                                }
                                                                zzbe();
                                                                this.zzY = true;
                                                                this.zzV = 0;
                                                                this.zza.zzc++;
                                                            }
                                                        }
                                                    } catch (zzhf e6) {
                                                        zzak(e6);
                                                        zzaw(0);
                                                        zzau();
                                                    }
                                                }
                                                if (!zzax(j3)) {
                                                    break;
                                                }
                                            } catch (IllegalStateException e7) {
                                                e = e7;
                                                r12 = 0;
                                                z3 = e instanceof MediaCodec.CodecException;
                                                if (!z3) {
                                                    StackTraceElement[] stackTrace = e.getStackTrace();
                                                    if (stackTrace.length <= 0 || !stackTrace[r12].getClassName().equals("android.media.MediaCodec")) {
                                                        throw e;
                                                    }
                                                }
                                                zzak(e);
                                                z4 = (z3 || !((MediaCodec.CodecException) e).isRecoverable()) ? r12 : z2;
                                                if (z4) {
                                                    zzaH();
                                                }
                                                zzss zzaO222 = zzaO(e, this.zzC);
                                                throw zzN(zzaO222, this.zzm, z4, zzaO222.zza != 1101 ? 4006 : 4003);
                                            }
                                        }
                                    } else {
                                        this.zza.zzd += zzP(j);
                                        zzaw(1);
                                    }
                                }
                                this.zza.zza();
                            } catch (MediaCodec.CryptoException e8) {
                                e = e8;
                            }
                        } catch (IllegalStateException e9) {
                            e = e9;
                            z5 = false;
                        }
                    } catch (IllegalStateException e10) {
                        e = e10;
                    }
                } catch (MediaCodec.CryptoException e11) {
                    e = e11;
                    throw zzN(e, this.zzm, z, zzeo.zzF(e.getErrorCode()));
                } catch (IllegalStateException e12) {
                    e = e12;
                }
            } catch (IllegalStateException e13) {
                e = e13;
                z2 = true;
            }
        } catch (MediaCodec.CryptoException e14) {
            e = e14;
            z = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public boolean zzX() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public boolean zzY() {
        return this.zzae;
    }

    protected final boolean zzaA(zzu zzuVar) {
        return this.zzp == null && zzad(zzuVar);
    }

    protected boolean zzaB(zzst zzstVar) {
        return true;
    }

    protected final boolean zzaC() {
        return this.zzR;
    }

    protected final zzsq zzaD() {
        return this.zzv;
    }

    protected final zzu zzaE() {
        return this.zzw;
    }

    protected final MediaFormat zzaF() {
        return this.zzx;
    }

    protected final zzst zzaG() {
        return this.zzC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzaH() {
        try {
            zzsq zzsqVar = this.zzv;
            if (zzsqVar != null) {
                zzsqVar.zzk();
                this.zza.zzb++;
                zzst zzstVar = this.zzC;
                if (zzstVar == null) {
                    throw null;
                }
                zzst zzstVar2 = zzstVar;
                zzaj(zzstVar.zza);
            }
        } finally {
            this.zzv = null;
            this.zzr = null;
            this.zzo = null;
            zzaN();
        }
    }

    protected final boolean zzaI() throws zzhz {
        boolean zzat = zzat();
        if (zzat) {
            zzaz();
        }
        return zzat;
    }

    protected boolean zzaJ() {
        int i = this.zzX;
        if (i == 3 || ((this.zzE && !this.zzaa) || (this.zzF && this.zzZ))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbl();
            return false;
        } catch (zzhz e) {
            zzds.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    protected boolean zzaK() {
        return true;
    }

    protected final long zzaL() {
        return this.zzal;
    }

    protected void zzaM() {
        zzbe();
        zzbf();
        zzav();
        this.zzL = -9223372036854775807L;
        this.zzZ = false;
        this.zzJ = -9223372036854775807L;
        this.zzY = false;
        this.zzG = false;
        this.zzH = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    protected final void zzaN() {
        zzaM();
        this.zzA = null;
        this.zzC = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = false;
        this.zzaa = false;
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = false;
        this.zzI = false;
        this.zzK = false;
        this.zzU = false;
        this.zzV = 0;
    }

    protected zzss zzaO(Throwable th, zzst zzstVar) {
        return new zzss(th, zzstVar);
    }

    protected boolean zzaP(zzu zzuVar) throws zzhz {
        return true;
    }

    protected void zzaQ(zzhg zzhgVar) throws zzhz {
    }

    protected int zzaR(zzhg zzhgVar) {
        return 0;
    }

    protected boolean zzaS(zzhg zzhgVar) {
        return false;
    }

    protected final long zzaT() {
        return this.zzac;
    }

    protected void zzaU(long j) {
        this.zzah = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j < ((zzsy) arrayDeque.peek()).zzb) {
                return;
            }
            zzsy zzsyVar = (zzsy) arrayDeque.poll();
            zzsyVar.getClass();
            zzbk(zzsyVar);
            zzao();
        }
    }

    protected final boolean zzaV() {
        if (this.zzm == null) {
            return false;
        }
        if (zzQ() || zzbd()) {
            return true;
        }
        return this.zzL != -9223372036854775807L && zzL().zzb() < this.zzL;
    }

    protected final float zzaW() {
        return this.zzt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzlk zzaX() {
        return this.zzq;
    }

    protected final boolean zzaY() throws zzhz {
        return zzbg(this.zzw);
    }

    protected final long zzaZ() {
        return this.zzag.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final int zzaa(zzu zzuVar) throws zzhz {
        try {
            return zzab(this.zzd, zzuVar);
        } catch (zztd e) {
            throw zzN(e, zzuVar, false, 4002);
        }
    }

    protected abstract int zzab(zztb zztbVar, zzu zzuVar) throws zztd;

    protected abstract List zzac(zztb zztbVar, zzu zzuVar, boolean z) throws zztd;

    protected boolean zzad(zzu zzuVar) {
        return false;
    }

    protected abstract zzsn zzae(zzst zzstVar, zzu zzuVar, MediaCrypto mediaCrypto, float f);

    protected zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        throw null;
    }

    protected long zzag(long j, long j2, boolean z) {
        return super.zzT(j, j2);
    }

    protected float zzah(float f, zzu zzuVar, zzu[] zzuVarArr) {
        throw null;
    }

    protected void zzai(String str, zzsn zzsnVar, long j, long j2) {
        throw null;
    }

    protected void zzaj(String str) {
        throw null;
    }

    protected void zzak(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (zzbh() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ad, code lost:
    
        if (zzbh() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
    
        if (zzbh() == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzhs zzal(zzkh zzkhVar) throws zzhz {
        int i;
        boolean z = true;
        this.zzaf = true;
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        String str = zzuVar.zzo;
        if (str == null) {
            throw zzN(new IllegalArgumentException("Sample MIME type is null."), zzuVar, false, 4005);
        }
        if ((Objects.equals(str, "video/av01") || Objects.equals(str, "video/x-vnd.on2.vp9")) && !zzuVar.zzr.isEmpty()) {
            zzs zza = zzuVar.zza();
            zza.zzp(null);
            zzuVar = zza.zzM();
        }
        zzu zzuVar2 = zzuVar;
        this.zzp = zzkhVar.zza;
        this.zzm = zzuVar2;
        if (this.zzR) {
            this.zzT = true;
            return null;
        }
        zzsq zzsqVar = this.zzv;
        if (zzsqVar == null) {
            this.zzA = null;
            zzaz();
            return null;
        }
        zzst zzstVar = this.zzC;
        zzstVar.getClass();
        zzu zzuVar3 = this.zzw;
        zzuVar3.getClass();
        zzrn zzrnVar = this.zzo;
        zzrn zzrnVar2 = this.zzp;
        if (zzrnVar != zzrnVar2) {
            zzbi();
            return new zzhs(zzstVar.zza, zzuVar3, zzuVar2, 0, 128);
        }
        zzhs zzaf = zzaf(zzstVar, zzuVar3, zzuVar2);
        int i2 = zzaf.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 == 1) {
                if (zzbg(zzuVar2)) {
                    this.zzw = zzuVar2;
                    if (zzrnVar2 == zzrnVar) {
                        if (this.zzY) {
                            this.zzW = 1;
                            if (this.zzF) {
                                this.zzX = 3;
                            } else {
                                this.zzX = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 != 2) {
                if (zzbg(zzuVar2)) {
                    this.zzw = zzuVar2;
                    if (zzrnVar2 != zzrnVar) {
                    }
                }
                i = 16;
            } else {
                if (zzbg(zzuVar2)) {
                    this.zzU = true;
                    this.zzV = 1;
                    int i3 = this.zzD;
                    if (i3 != 2 && (i3 != 1 || zzuVar2.zzv != zzuVar3.zzv || zzuVar2.zzw != zzuVar3.zzw)) {
                        z = false;
                    }
                    this.zzG = z;
                    this.zzw = zzuVar2;
                    if (zzrnVar2 != zzrnVar) {
                    }
                }
                i = 16;
            }
            return (i2 != 0 || (this.zzv == zzsqVar && this.zzX != 3)) ? zzaf : new zzhs(zzstVar.zza, zzuVar3, zzuVar2, 0, i);
        }
        zzbi();
        i = 0;
        if (i2 != 0) {
        }
    }

    protected void zzam(zzu zzuVar, MediaFormat mediaFormat) throws zzhz {
        throw null;
    }

    protected void zzao() {
    }

    protected abstract boolean zzap(long j, long j2, zzsq zzsqVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzu zzuVar) throws zzhz;

    protected void zzaq() throws zzhz {
        throw null;
    }

    protected void zzar(zzhg zzhgVar) throws zzhz {
        throw null;
    }

    public final void zzay() {
        this.zzaj = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0286 A[Catch: zzsw -> 0x02b1, TryCatch #1 {zzsw -> 0x02b1, blocks: (B:25:0x0057, B:27:0x005e, B:171:0x0065, B:173:0x007b, B:174:0x0086, B:29:0x0093, B:31:0x009b, B:33:0x009f, B:34:0x00a2, B:36:0x00a6, B:38:0x00af, B:97:0x026a, B:99:0x0283, B:100:0x028c, B:103:0x0298, B:104:0x029a, B:106:0x0286, B:162:0x029c, B:164:0x029d, B:167:0x02a2, B:168:0x02a3, B:169:0x02ad, B:177:0x008a, B:178:0x0092, B:180:0x02b0), top: B:24:0x0057, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b A[Catch: Exception -> 0x025c, TryCatch #2 {Exception -> 0x025c, blocks: (B:49:0x00e4, B:51:0x00ee, B:53:0x00fe, B:56:0x013a, B:58:0x014b, B:59:0x0160, B:61:0x016b, B:63:0x0173, B:65:0x017d, B:67:0x0187, B:69:0x0191, B:72:0x019e, B:74:0x01a6, B:77:0x01b2, B:79:0x01bd, B:83:0x0217, B:85:0x021d, B:118:0x01c9, B:120:0x01cd, B:122:0x01d5, B:124:0x01dd, B:126:0x01e5, B:128:0x01ed, B:130:0x01f5, B:132:0x01fd, B:134:0x0207, B:136:0x0211), top: B:48:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bd A[Catch: Exception -> 0x025c, TryCatch #2 {Exception -> 0x025c, blocks: (B:49:0x00e4, B:51:0x00ee, B:53:0x00fe, B:56:0x013a, B:58:0x014b, B:59:0x0160, B:61:0x016b, B:63:0x0173, B:65:0x017d, B:67:0x0187, B:69:0x0191, B:72:0x019e, B:74:0x01a6, B:77:0x01b2, B:79:0x01bd, B:83:0x0217, B:85:0x021d, B:118:0x01c9, B:120:0x01cd, B:122:0x01d5, B:124:0x01dd, B:126:0x01e5, B:128:0x01ed, B:130:0x01f5, B:132:0x01fd, B:134:0x0207, B:136:0x0211), top: B:48:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021d A[Catch: Exception -> 0x025c, TRY_LEAVE, TryCatch #2 {Exception -> 0x025c, blocks: (B:49:0x00e4, B:51:0x00ee, B:53:0x00fe, B:56:0x013a, B:58:0x014b, B:59:0x0160, B:61:0x016b, B:63:0x0173, B:65:0x017d, B:67:0x0187, B:69:0x0191, B:72:0x019e, B:74:0x01a6, B:77:0x01b2, B:79:0x01bd, B:83:0x0217, B:85:0x021d, B:118:0x01c9, B:120:0x01cd, B:122:0x01d5, B:124:0x01dd, B:126:0x01e5, B:128:0x01ed, B:130:0x01f5, B:132:0x01fd, B:134:0x0207, B:136:0x0211), top: B:48:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0283 A[Catch: zzsw -> 0x02b1, TryCatch #1 {zzsw -> 0x02b1, blocks: (B:25:0x0057, B:27:0x005e, B:171:0x0065, B:173:0x007b, B:174:0x0086, B:29:0x0093, B:31:0x009b, B:33:0x009f, B:34:0x00a2, B:36:0x00a6, B:38:0x00af, B:97:0x026a, B:99:0x0283, B:100:0x028c, B:103:0x0298, B:104:0x029a, B:106:0x0286, B:162:0x029c, B:164:0x029d, B:167:0x02a2, B:168:0x02a3, B:169:0x02ad, B:177:0x008a, B:178:0x0092, B:180:0x02b0), top: B:24:0x0057, inners: #7 }] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.google.android.gms.internal.ads.zzso] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzst] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzsn] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzsz] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzaz() throws zzhz {
        zzu zzuVar;
        boolean z;
        ?? r10;
        zzsw zzswVar;
        zzu zzuVar2;
        long j;
        boolean z2;
        zzsq zzsqVar;
        zzst zzstVar;
        if (this.zzv != null || this.zzR || (zzuVar = this.zzm) == null) {
            return;
        }
        boolean z3 = true;
        if (zzaA(zzuVar)) {
            zzan();
            String str = zzuVar.zzo;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzm(32);
            } else {
                this.zzi.zzm(1);
            }
            this.zzR = true;
            return;
        }
        zzrn zzrnVar = this.zzp;
        this.zzo = zzrnVar;
        if (zzrnVar != null) {
            zzghc.zzh(true);
            zzrn zzrnVar2 = this.zzo;
            boolean z4 = zzrw.zza;
            zzrnVar2.zza();
        }
        try {
            zzu zzuVar3 = this.zzm;
            MediaCrypto mediaCrypto = null;
            if (zzuVar3 == null) {
                throw null;
            }
            zzu zzuVar4 = zzuVar3;
            if (this.zzA == null) {
                try {
                    List zzac = zzac(this.zzd, zzuVar3, false);
                    zzac.isEmpty();
                    this.zzA = new ArrayDeque();
                    if (!zzac.isEmpty()) {
                        this.zzA.add((zzst) zzac.get(0));
                    }
                    this.zzB = null;
                } catch (zztd e) {
                    throw new zzsw(zzuVar3, (Throwable) e, false, -49998);
                }
            }
            if (this.zzA.isEmpty()) {
                throw new zzsw(zzuVar3, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzA;
            if (arrayDeque == null) {
                throw null;
            }
            ArrayDeque arrayDeque2 = arrayDeque;
            while (this.zzv == null) {
                zzst zzstVar2 = (zzst) arrayDeque.peekFirst();
                if (zzstVar2 == null) {
                    throw mediaCrypto;
                }
                zzst zzstVar3 = zzstVar2;
                zzaP(zzuVar3);
                if (!zzaB(zzstVar2)) {
                    return;
                }
                try {
                    this.zzC = zzstVar2;
                    zzuVar2 = this.zzm;
                } catch (Exception e2) {
                    e = e2;
                    z = z3;
                }
                if (zzuVar2 == null) {
                    throw mediaCrypto;
                }
                zzu zzuVar5 = zzuVar2;
                String str2 = zzstVar2.zza;
                float zzah = zzah(this.zzu, zzuVar2, zzI());
                if (zzah <= this.zze) {
                    zzah = -1.0f;
                }
                long zzb2 = zzL().zzb();
                z = z3;
                try {
                    r10 = zzae(zzstVar2, zzuVar2, mediaCrypto, zzah);
                } catch (Exception e3) {
                    e = e3;
                    r10 = zzstVar2;
                    zzds.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                    arrayDeque.removeFirst();
                    zzsw zzswVar2 = new zzsw(zzuVar3, (Throwable) e, false, (zzst) r10);
                    zzak(zzswVar2);
                    zzswVar = this.zzB;
                    if (zzswVar == null) {
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
                            zzsq zzb3 = this.zzc.zzb(r10);
                            this.zzv = zzb3;
                            this.zzK = zzb3.zzl(new zzsx(this, null));
                            Trace.endSection();
                            long zzb4 = zzL().zzb();
                            if (!zzstVar2.zzc(zzuVar2)) {
                                Object[] objArr = {zzu.zze(zzuVar2), str2};
                                String str3 = zzeo.zza;
                                zzds.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                            }
                            this.zzz = zzah;
                            this.zzw = zzuVar2;
                            this.zzD = (Build.VERSION.SDK_INT > 25 && "OMX.Exynos.avc.dec.secure".equals(str2) && (Build.MODEL.startsWith("SM-T585") || Build.MODEL.startsWith("SM-A510") || Build.MODEL.startsWith("SM-A520") || Build.MODEL.startsWith("SM-J700"))) ? 2 : 0;
                            this.zzE = (Build.VERSION.SDK_INT == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z;
                            this.zzF = false;
                            String str4 = zzstVar2.zza;
                            if (Build.VERSION.SDK_INT <= 25) {
                                if ("OMX.rk.video_decoder.avc".equals(str4)) {
                                }
                                z2 = z;
                                this.zzI = z2;
                                zzsqVar = this.zzv;
                                if (zzsqVar != null) {
                                    throw null;
                                }
                                zzsq zzsqVar2 = zzsqVar;
                                if (zze() == 2) {
                                    try {
                                        zzstVar = zzstVar2;
                                        try {
                                            this.zzL = zzL().zzb() + 1000;
                                        } catch (Exception e4) {
                                            e = e4;
                                            r10 = zzstVar;
                                            zzds.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                            arrayDeque.removeFirst();
                                            zzsw zzswVar22 = new zzsw(zzuVar3, (Throwable) e, false, (zzst) r10);
                                            zzak(zzswVar22);
                                            zzswVar = this.zzB;
                                            if (zzswVar == null) {
                                                this.zzB = zzswVar22;
                                            } else {
                                                this.zzB = zzswVar.zza(zzswVar22);
                                            }
                                            if (arrayDeque.isEmpty()) {
                                                throw this.zzB;
                                            }
                                            z3 = z;
                                            mediaCrypto = null;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        zzstVar = zzstVar2;
                                        r10 = zzstVar;
                                        zzds.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                        arrayDeque.removeFirst();
                                        zzsw zzswVar222 = new zzsw(zzuVar3, (Throwable) e, false, (zzst) r10);
                                        zzak(zzswVar222);
                                        zzswVar = this.zzB;
                                        if (zzswVar == null) {
                                        }
                                        if (arrayDeque.isEmpty()) {
                                        }
                                    }
                                } else {
                                    zzstVar = zzstVar2;
                                }
                                this.zza.zza++;
                                r10 = zzstVar;
                                try {
                                    zzai(str2, r10, zzb4, zzb4 - j);
                                } catch (Exception e6) {
                                    e = e6;
                                }
                                z3 = z;
                                mediaCrypto = null;
                            }
                            if ((Build.VERSION.SDK_INT <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str4) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str4) && !"OMX.bcm.vdec.avc.tunnel".equals(str4) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str4) && !"OMX.bcm.vdec.hevc.tunnel".equals(str4) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) && (!"Amazon".equals(Build.MANUFACTURER) || !"AFTS".equals(Build.MODEL) || !zzstVar2.zzf)) {
                                z2 = false;
                                this.zzI = z2;
                                zzsqVar = this.zzv;
                                if (zzsqVar != null) {
                                }
                            }
                            z2 = z;
                            this.zzI = z2;
                            zzsqVar = this.zzv;
                            if (zzsqVar != null) {
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(str2.length() + 12);
                    sb2.append("createCodec:");
                    sb2.append(str2);
                    Trace.beginSection(sb2.toString());
                    zzsq zzb32 = this.zzc.zzb(r10);
                    this.zzv = zzb32;
                    this.zzK = zzb32.zzl(new zzsx(this, null));
                    Trace.endSection();
                    long zzb42 = zzL().zzb();
                    if (!zzstVar2.zzc(zzuVar2)) {
                    }
                    this.zzz = zzah;
                    this.zzw = zzuVar2;
                    this.zzD = (Build.VERSION.SDK_INT > 25 && "OMX.Exynos.avc.dec.secure".equals(str2) && (Build.MODEL.startsWith("SM-T585") || Build.MODEL.startsWith("SM-A510") || Build.MODEL.startsWith("SM-A520") || Build.MODEL.startsWith("SM-J700"))) ? 2 : 0;
                    this.zzE = (Build.VERSION.SDK_INT == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z;
                    this.zzF = false;
                    String str42 = zzstVar2.zza;
                    if (Build.VERSION.SDK_INT <= 25) {
                    }
                    if (Build.VERSION.SDK_INT <= 29) {
                    }
                    z2 = false;
                    this.zzI = z2;
                    zzsqVar = this.zzv;
                    if (zzsqVar != null) {
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
                j = zzb2;
            }
            this.zzA = mediaCrypto;
        } catch (zzsw e7) {
            throw zzN(e7, zzuVar, false, 4001);
        }
    }

    protected final long zzba() {
        return this.zzag.zzc;
    }

    final /* synthetic */ zzlk zzbc() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzln
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public void zzx(int i, Object obj) throws zzhz {
        if (i == 11) {
            zzlk zzlkVar = (zzlk) obj;
            zzlkVar.getClass();
            this.zzq = zzlkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected void zzy(boolean z, boolean z2) throws zzhz {
        this.zza = new zzhr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzhq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zzz(zzu[] zzuVarArr, long j, long j2, zzup zzupVar) throws zzhz {
        if (this.zzag.zzd == -9223372036854775807L) {
            zzbk(new zzsy(-9223372036854775807L, j, j2));
            if (this.zzaj) {
                zzao();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.zzk;
        if (arrayDeque.isEmpty()) {
            long j3 = this.zzab;
            if (j3 != -9223372036854775807L) {
                long j4 = this.zzah;
                if (j4 != -9223372036854775807L) {
                }
            }
            zzbk(new zzsy(-9223372036854775807L, j, j2));
            if (this.zzag.zzd != -9223372036854775807L) {
                zzao();
                return;
            }
            return;
        }
        arrayDeque.add(new zzsy(this.zzab, j, j2));
    }

    private final void zzbl() throws zzhz {
        zzrn zzrnVar = this.zzp;
        zzrnVar.getClass();
        this.zzo = zzrnVar;
        this.zzW = 0;
        this.zzX = 0;
    }

    private final void zzbj() throws zzhz {
        int i = this.zzX;
        if (i == 1) {
            zzau();
            return;
        }
        if (i == 2) {
            zzau();
            zzbl();
        } else if (i != 3) {
            this.zzae = true;
            zzaq();
        } else {
            zzaH();
            zzaz();
        }
    }
}
