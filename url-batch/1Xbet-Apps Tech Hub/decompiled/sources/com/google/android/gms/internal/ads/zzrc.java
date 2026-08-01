package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzrc extends zzss implements zzlb {
    private final Context zzb;
    private final zzpn zzc;
    private final zzpv zzd;
    private int zze;
    private boolean zzf;
    private zzam zzg;
    private zzam zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private zzly zzl;

    public zzrc(Context context, zzsj zzsjVar, zzsu zzsuVar, boolean z, Handler handler, zzpo zzpoVar, zzpv zzpvVar) {
        super(1, zzsjVar, zzsuVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzpvVar;
        this.zzc = new zzpn(handler, zzpoVar);
        zzpvVar.zzp(new zzrb(this, null));
    }

    private final int zzaI(zzsn zzsnVar, zzam zzamVar) {
        if (!"OMX.google.raw.decoder".equals(zzsnVar.zza) || zzfs.zza >= 24 || (zzfs.zza == 23 && zzfs.zzI(this.zzb))) {
            return zzamVar.zzn;
        }
        return -1;
    }

    private static List zzaJ(zzsu zzsuVar, zzam zzamVar, boolean z, zzpv zzpvVar) throws zztb {
        zzsn zzd;
        return zzamVar.zzm == null ? zzfwu.zzl() : (!zzpvVar.zzz(zzamVar) || (zzd = zzth.zzd()) == null) ? zzth.zzh(zzsuVar, zzamVar, false, false) : zzfwu.zzm(zzd);
    }

    private final void zzaK() {
        long zzb = this.zzd.zzb(zzU());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb = Math.max(this.zzi, zzb);
            }
            this.zzi = zzb;
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzik
    protected final void zzA() {
        try {
            super.zzA();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzk();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzk();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzik
    protected final void zzB() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzik
    protected final void zzC() {
        zzaK();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzlz, com.google.android.gms.internal.ads.zzmb
    public final String zzS() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzlz
    public final boolean zzU() {
        return super.zzU() && this.zzd.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzlz
    public final boolean zzV() {
        return this.zzd.zzx() || super.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final float zzX(float f, zzam zzamVar, zzam[] zzamVarArr) {
        int i = -1;
        for (zzam zzamVar2 : zzamVarArr) {
            int i2 = zzamVar2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final int zzY(zzsu zzsuVar, zzam zzamVar) throws zztb {
        int i;
        boolean z;
        int i2;
        if (!zzce.zzf(zzamVar.zzm)) {
            return 128;
        }
        int i3 = zzfs.zza >= 21 ? 32 : 0;
        int i4 = zzamVar.zzH;
        boolean zzaH = zzaH(zzamVar);
        int i5 = 1;
        if (!zzaH || (i4 != 0 && zzth.zzd() == null)) {
            i = 0;
        } else {
            zzpa zzd = this.zzd.zzd(zzamVar);
            if (zzd.zzb) {
                i = true != zzd.zzc ? 512 : 1536;
                if (zzd.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (this.zzd.zzz(zzamVar)) {
                i2 = i3 | Opcodes.F2L;
                return i2 | i;
            }
        }
        if ((!"audio/raw".equals(zzamVar.zzm) || this.zzd.zzz(zzamVar)) && this.zzd.zzz(zzfs.zzy(2, zzamVar.zzz, zzamVar.zzA))) {
            List zzaJ = zzaJ(zzsuVar, zzamVar, false, this.zzd);
            if (!zzaJ.isEmpty()) {
                if (zzaH) {
                    zzsn zzsnVar = (zzsn) zzaJ.get(0);
                    boolean zze = zzsnVar.zze(zzamVar);
                    if (!zze) {
                        for (int i6 = 1; i6 < zzaJ.size(); i6++) {
                            zzsn zzsnVar2 = (zzsn) zzaJ.get(i6);
                            if (zzsnVar2.zze(zzamVar)) {
                                z = false;
                                zze = true;
                                zzsnVar = zzsnVar2;
                                break;
                            }
                        }
                    }
                    z = true;
                    int i7 = true != zze ? 3 : 4;
                    int i8 = 8;
                    if (zze && zzsnVar.zzf(zzamVar)) {
                        i8 = 16;
                    }
                    i2 = i7 | i8 | i3 | (true != zzsnVar.zzg ? 0 : 64) | (true != z ? 0 : 128);
                    return i2 | i;
                }
                i5 = 2;
            }
        }
        return i5 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final zzim zzZ(zzsn zzsnVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzim zzb = zzsnVar.zzb(zzamVar, zzamVar2);
        int i3 = zzb.zze;
        if (zzaF(zzamVar2)) {
            i3 |= 32768;
        }
        if (zzaI(zzsnVar, zzamVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzsnVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb.zzd;
            i2 = 0;
        }
        return new zzim(str, zzamVar, zzamVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final long zza() {
        if (zzbd() == 2) {
            zzaK();
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final zzsi zzad(zzsn zzsnVar, zzam zzamVar, MediaCrypto mediaCrypto, float f) {
        zzam[] zzR = zzR();
        int length = zzR.length;
        int zzaI = zzaI(zzsnVar, zzamVar);
        if (length != 1) {
            for (zzam zzamVar2 : zzR) {
                if (zzsnVar.zzb(zzamVar, zzamVar2).zzd != 0) {
                    zzaI = Math.max(zzaI, zzaI(zzsnVar, zzamVar2));
                }
            }
        }
        this.zze = zzaI;
        this.zzf = zzfs.zza < 24 && "OMX.SEC.aac.dec".equals(zzsnVar.zza) && "samsung".equals(zzfs.zzc) && (zzfs.zzb.startsWith("zeroflte") || zzfs.zzb.startsWith("herolte") || zzfs.zzb.startsWith("heroqlte"));
        String str = zzsnVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", zzamVar.zzz);
        mediaFormat.setInteger("sample-rate", zzamVar.zzA);
        zzfc.zzb(mediaFormat, zzamVar.zzo);
        zzfc.zza(mediaFormat, "max-input-size", i);
        if (zzfs.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzfs.zza != 23 || (!"ZTE B2017G".equals(zzfs.zzd) && !"AXON 7 mini".equals(zzfs.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzfs.zza <= 28 && "audio/ac4".equals(zzamVar.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzfs.zza >= 24 && this.zzd.zza(zzfs.zzy(4, zzamVar.zzz, zzamVar.zzA)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzfs.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzh = (!"audio/raw".equals(zzsnVar.zzb) || "audio/raw".equals(zzamVar.zzm)) ? null : zzamVar;
        return zzsi.zza(zzsnVar, mediaFormat, zzamVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final List zzae(zzsu zzsuVar, zzam zzamVar, boolean z) throws zztb {
        return zzth.zzi(zzaJ(zzsuVar, zzamVar, false, this.zzd), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzaf(zzib zzibVar) {
        zzam zzamVar;
        if (zzfs.zza < 29 || (zzamVar = zzibVar.zza) == null) {
            return;
        }
        String str = zzamVar.zzm;
        if ((str == "audio/opus" || (str != null && str.equals("audio/opus"))) && zzaE()) {
            ByteBuffer byteBuffer = zzibVar.zzf;
            byteBuffer.getClass();
            zzam zzamVar2 = zzibVar.zza;
            zzamVar2.getClass();
            if (byteBuffer.remaining() == 8) {
                this.zzd.zzq(zzamVar2.zzC, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzag(Exception exc) {
        zzez.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzah(String str, zzsi zzsiVar, long j, long j2) {
        this.zzc.zze(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzai(String str) {
        this.zzc.zzf(str);
    }

    protected final void zzak() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzal() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzam() throws zzit {
        try {
            this.zzd.zzj();
        } catch (zzpu e) {
            throw zzi(e, e.zzc, e.zzb, true != zzaE() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final boolean zzao(zzam zzamVar) {
        zzm();
        return this.zzd.zzz(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final zzcj zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzg(zzcj zzcjVar) {
        this.zzd.zzr(zzcjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzik, com.google.android.gms.internal.ads.zzlz
    public final zzlb zzk() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzik, com.google.android.gms.internal.ads.zzlu
    public final void zzt(int i, Object obj) throws zzit {
        if (i == 2) {
            zzpv zzpvVar = this.zzd;
            obj.getClass();
            zzpvVar.zzv(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzk zzkVar = (zzk) obj;
            zzpv zzpvVar2 = this.zzd;
            zzkVar.getClass();
            zzpvVar2.zzl(zzkVar);
            return;
        }
        if (i == 6) {
            zzl zzlVar = (zzl) obj;
            zzpv zzpvVar3 = this.zzd;
            zzlVar.getClass();
            zzpvVar3.zzn(zzlVar);
            return;
        }
        switch (i) {
            case 9:
                zzpv zzpvVar4 = this.zzd;
                obj.getClass();
                zzpvVar4.zzu(((Boolean) obj).booleanValue());
                break;
            case 10:
                zzpv zzpvVar5 = this.zzd;
                obj.getClass();
                zzpvVar5.zzm(((Integer) obj).intValue());
                break;
            case 11:
                this.zzl = (zzly) obj;
                break;
            case 12:
                if (zzfs.zza >= 23) {
                    zzqz.zza(this.zzd, obj);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzik
    protected final void zzw() {
        this.zzk = true;
        this.zzg = null;
        try {
            this.zzd.zzf();
            super.zzw();
        } catch (Throwable th) {
            super.zzw();
            throw th;
        } finally {
            this.zzc.zzg(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzik
    protected final void zzx(boolean z, boolean z2) throws zzit {
        super.zzx(z, z2);
        this.zzc.zzh(this.zza);
        zzm();
        this.zzd.zzs(zzn());
        this.zzd.zzo(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzik
    protected final void zzy(long j, boolean z) throws zzit {
        super.zzy(j, z);
        this.zzd.zzf();
        this.zzi = j;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzik
    protected final void zzz() {
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final zzim zzaa(zzkv zzkvVar) throws zzit {
        zzam zzamVar = zzkvVar.zza;
        zzamVar.getClass();
        this.zzg = zzamVar;
        zzim zzaa = super.zzaa(zzkvVar);
        this.zzc.zzi(zzamVar, zzaa);
        return zzaa;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final boolean zzan(long j, long j2, zzsk zzskVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zzit {
        byteBuffer.getClass();
        if (this.zzh != null && (i2 & 2) != 0) {
            zzskVar.getClass();
            zzskVar.zzn(i, false);
            return true;
        }
        if (z) {
            if (zzskVar != null) {
                zzskVar.zzn(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzw(byteBuffer, j3, i3)) {
                return false;
            }
            if (zzskVar != null) {
                zzskVar.zzn(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zzpr e) {
            throw zzi(e, this.zzg, e.zzb, 5001);
        } catch (zzpu e2) {
            if (zzaE()) {
                zzm();
            }
            throw zzi(e2, zzamVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzaj(zzam zzamVar, MediaFormat mediaFormat) throws zzit {
        int i;
        zzam zzamVar2 = this.zzh;
        int[] iArr = null;
        if (zzamVar2 != null) {
            zzamVar = zzamVar2;
        } else if (zzas() != null) {
            mediaFormat.getClass();
            int zzk = "audio/raw".equals(zzamVar.zzm) ? zzamVar.zzB : (zzfs.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzfs.zzk(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzak zzakVar = new zzak();
            zzakVar.zzU("audio/raw");
            zzakVar.zzP(zzk);
            zzakVar.zzE(zzamVar.zzC);
            zzakVar.zzF(zzamVar.zzD);
            zzakVar.zzO(zzamVar.zzk);
            zzakVar.zzJ(zzamVar.zzb);
            zzakVar.zzL(zzamVar.zzc);
            zzakVar.zzM(zzamVar.zzd);
            zzakVar.zzW(zzamVar.zze);
            int i2 = zzamVar.zzf;
            zzakVar.zzy(mediaFormat.getInteger("channel-count"));
            zzakVar.zzV(mediaFormat.getInteger("sample-rate"));
            zzam zzac = zzakVar.zzac();
            if (this.zzf && zzac.zzz == 6 && (i = zzamVar.zzz) < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < zzamVar.zzz; i3++) {
                    iArr[i3] = i3;
                }
            }
            zzamVar = zzac;
        }
        try {
            if (zzfs.zza >= 29) {
                if (zzaE()) {
                    zzm();
                }
                zzef.zzf(zzfs.zza >= 29);
            }
            this.zzd.zze(zzamVar, 0, iArr);
        } catch (zzpq e) {
            throw zzi(e, e.zza, false, 5001);
        }
    }
}
