package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzss extends zzik {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private zzsn zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
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
    protected zzil zza;
    private boolean zzaa;
    private long zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzsr zzag;
    private long zzah;
    private boolean zzai;
    private zzrs zzaj;
    private zzrs zzak;
    private final zzsj zzc;
    private final zzsu zzd;
    private final float zze;
    private final zzib zzf;
    private final zzib zzg;
    private final zzib zzh;
    private final zzsg zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrd zzl;
    private zzam zzm;
    private zzam zzn;
    private MediaCrypto zzo;
    private boolean zzp;
    private long zzq;
    private float zzr;
    private float zzs;
    private zzsk zzt;
    private zzam zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private float zzx;
    private ArrayDeque zzy;
    private zzsq zzz;

    public zzss(int i, zzsj zzsjVar, zzsu zzsuVar, boolean z, float f) {
        super(i);
        this.zzc = zzsjVar;
        zzsuVar.getClass();
        this.zzd = zzsuVar;
        this.zze = f;
        this.zzf = new zzib(0, 0);
        this.zzg = new zzib(0, 0);
        this.zzh = new zzib(2, 0);
        zzsg zzsgVar = new zzsg();
        this.zzi = zzsgVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzs = 1.0f;
        this.zzq = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzsr.zza;
        zzsgVar.zzi(0);
        zzsgVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrd();
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzV = 0;
        this.zzM = -1;
        this.zzN = -1;
        this.zzL = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
        this.zza = new zzil();
    }

    protected static boolean zzaH(zzam zzamVar) {
        return zzamVar.zzH == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzaI(zzsn zzsnVar, MediaCrypto mediaCrypto) throws Exception {
        MediaCodec createByCodecName;
        zzsk zztjVar;
        long j;
        zzsi zzsiVar;
        int i;
        long j2;
        zzam zzamVar = this.zzm;
        zzamVar.getClass();
        String str = zzsnVar.zza;
        float zzX = zzfs.zza < 23 ? -1.0f : zzX(this.zzs, zzamVar, zzR());
        if (zzX <= this.zze) {
            zzX = -1.0f;
        }
        zzay(zzamVar);
        zzh();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        zzsi zzad = zzad(zzsnVar, zzamVar, null, zzX);
        if (zzfs.zza >= 31) {
            zzsp.zza(zzad, zzn());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            if (zzfs.zza < 23 || zzfs.zza < 31) {
                try {
                    String str2 = zzad.zza.zza;
                    Trace.beginSection("createCodec:".concat(str2));
                    createByCodecName = MediaCodec.createByCodecName(str2);
                    Trace.endSection();
                } catch (IOException e) {
                    e = e;
                } catch (RuntimeException e2) {
                    e = e2;
                }
                try {
                    Trace.beginSection("configureCodec");
                    createByCodecName.configure(zzad.zzb, zzad.zzd, (MediaCrypto) null, 0);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    createByCodecName.start();
                    Trace.endSection();
                    zztjVar = new zztj(createByCodecName, null);
                } catch (IOException | RuntimeException e3) {
                    e = e3;
                    mediaCodec = createByCodecName;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } else {
                int zzb2 = zzce.zzb(zzad.zzc.zzm);
                zzez.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfs.zzB(zzb2)));
                zztjVar = new zzrx(zzb2, false).zzc(zzad);
            }
            this.zzt = zztjVar;
            Trace.endSection();
            zzh();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (zzsnVar.zze(zzamVar)) {
                j = elapsedRealtime;
                zzsiVar = zzad;
                i = 0;
            } else {
                Object[] objArr = new Object[2];
                StringBuilder sb = new StringBuilder();
                sb.append("id=");
                sb.append(zzamVar.zzb);
                sb.append(", mimeType=");
                sb.append(zzamVar.zzm);
                if (zzamVar.zzi != -1) {
                    sb.append(", bitrate=");
                    sb.append(zzamVar.zzi);
                }
                if (zzamVar.zzj != null) {
                    sb.append(", codecs=");
                    sb.append(zzamVar.zzj);
                }
                if (zzamVar.zzp != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int i2 = 0;
                    while (true) {
                        zzad zzadVar = zzamVar.zzp;
                        zzsiVar = zzad;
                        if (i2 >= zzadVar.zzb) {
                            break;
                        }
                        UUID uuid = zzadVar.zza(i2).zza;
                        if (uuid.equals(zzo.zzb)) {
                            linkedHashSet.add("cenc");
                        } else if (uuid.equals(zzo.zzc)) {
                            linkedHashSet.add("clearkey");
                        } else if (uuid.equals(zzo.zze)) {
                            linkedHashSet.add("playready");
                        } else if (uuid.equals(zzo.zzd)) {
                            linkedHashSet.add("widevine");
                        } else if (uuid.equals(zzo.zza)) {
                            linkedHashSet.add("universal");
                        } else {
                            j2 = elapsedRealtime;
                            linkedHashSet.add("unknown (" + uuid.toString() + ")");
                            i2++;
                            zzad = zzsiVar;
                            elapsedRealtime = j2;
                        }
                        j2 = elapsedRealtime;
                        i2++;
                        zzad = zzsiVar;
                        elapsedRealtime = j2;
                    }
                    j = elapsedRealtime;
                    sb.append(", drm=[");
                    zzfto.zzb(sb, linkedHashSet, ",");
                    sb.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    j = elapsedRealtime;
                    zzsiVar = zzad;
                }
                if (zzamVar.zzr != -1 && zzamVar.zzs != -1) {
                    sb.append(", res=");
                    sb.append(zzamVar.zzr);
                    sb.append("x");
                    sb.append(zzamVar.zzs);
                }
                zzs zzsVar = zzamVar.zzy;
                if (zzsVar != null && (zzsVar.zze() || zzsVar.zzf())) {
                    sb.append(", color=");
                    sb.append(zzamVar.zzy.zzd());
                }
                if (zzamVar.zzt != -1.0f) {
                    sb.append(", fps=");
                    sb.append(zzamVar.zzt);
                }
                if (zzamVar.zzz != -1) {
                    sb.append(", channels=");
                    sb.append(zzamVar.zzz);
                }
                if (zzamVar.zzA != -1) {
                    sb.append(", sample_rate=");
                    sb.append(zzamVar.zzA);
                }
                if (zzamVar.zzd != null) {
                    sb.append(", language=");
                    sb.append(zzamVar.zzd);
                }
                if (zzamVar.zzc != null) {
                    sb.append(", label=");
                    sb.append(zzamVar.zzc);
                }
                if (zzamVar.zze != 0) {
                    ArrayList arrayList = new ArrayList();
                    if ((zzamVar.zze & 1) != 0) {
                        arrayList.add("default");
                    }
                    if ((zzamVar.zze & 2) != 0) {
                        arrayList.add("forced");
                    }
                    sb.append(", selectionFlags=[");
                    zzfto.zzb(sb, arrayList, ",");
                    sb.append("]");
                }
                i = 0;
                objArr[0] = sb.toString();
                objArr[1] = str;
                zzez.zzf("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
            }
            this.zzA = zzsnVar;
            this.zzx = zzX;
            this.zzu = zzamVar;
            this.zzB = (zzfs.zza <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (zzfs.zzd.startsWith("SM-T585") || zzfs.zzd.startsWith("SM-A510") || zzfs.zzd.startsWith("SM-A520") || zzfs.zzd.startsWith("SM-J700"))) ? 2 : (zzfs.zza >= 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzfs.zzb) || "flounder_lte".equals(zzfs.zzb) || "grouper".equals(zzfs.zzb) || "tilapia".equals(zzfs.zzb)))) ? i : 1;
            zzam zzamVar2 = this.zzu;
            zzamVar2.getClass();
            this.zzC = (zzfs.zza < 21 && zzamVar2.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) ? 1 : i;
            this.zzD = (zzfs.zza == 19 && zzfs.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str))) ? 1 : i;
            this.zzE = (zzfs.zza == 29 && "c2.android.aac.decoder".equals(str)) ? 1 : i;
            this.zzF = ((zzfs.zza > 23 || !"OMX.google.vorbis.decoder".equals(str)) && (zzfs.zza > 19 || !(("hb2000".equals(zzfs.zzb) || "stvm8".equals(zzfs.zzb)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))))) ? i : 1;
            this.zzG = (zzfs.zza == 21 && "OMX.google.aac.decoder".equals(str)) ? 1 : i;
            this.zzH = (zzfs.zza < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(zzfs.zzc) && (zzfs.zzb.startsWith("baffin") || zzfs.zzb.startsWith("grand") || zzfs.zzb.startsWith("fortuna") || zzfs.zzb.startsWith("gprimelte") || zzfs.zzb.startsWith("j2y18lte") || zzfs.zzb.startsWith("ms01"))) ? 1 : i;
            this.zzu.getClass();
            String str3 = zzsnVar.zza;
            this.zzK = ((zzfs.zza > 25 || !"OMX.rk.video_decoder.avc".equals(str3)) && (zzfs.zza > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) && !("Amazon".equals(zzfs.zzc) && "AFTS".equals(zzfs.zzd) && zzsnVar.zzf)) ? i : 1;
            this.zzt.getClass();
            if (zzbd() == 2) {
                zzh();
                this.zzL = SystemClock.elapsedRealtime() + 1000;
            }
            this.zza.zza++;
            zzah(str, zzsiVar, elapsedRealtime2, elapsedRealtime2 - j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final void zzaK() {
        this.zzM = -1;
        this.zzg.zzc = null;
    }

    private final void zzaL() {
        this.zzN = -1;
        this.zzO = null;
    }

    private final void zzaM(zzsr zzsrVar) {
        this.zzag = zzsrVar;
        if (zzsrVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final void zzaN() throws zzit {
        zzrs zzrsVar = this.zzak;
        zzrsVar.getClass();
        this.zzaj = zzrsVar;
        this.zzW = 0;
        this.zzX = 0;
    }

    private final boolean zzaO() throws zzit {
        if (this.zzY) {
            this.zzW = 1;
            if (this.zzD || this.zzF) {
                this.zzX = 3;
                return false;
            }
            this.zzX = 2;
        } else {
            zzaN();
        }
        return true;
    }

    private final boolean zzaP() throws zzit {
        zzsk zzskVar = this.zzt;
        if (zzskVar == null || this.zzW == 2 || this.zzad) {
            return false;
        }
        if (this.zzM < 0) {
            int zza = zzskVar.zza();
            this.zzM = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzc = zzskVar.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzW == 1) {
            if (!this.zzK) {
                this.zzZ = true;
                zzskVar.zzj(this.zzM, 0, 0, 0L, 4);
                zzaK();
            }
            this.zzW = 2;
            return false;
        }
        if (this.zzI) {
            this.zzI = false;
            ByteBuffer byteBuffer = this.zzg.zzc;
            byteBuffer.getClass();
            byteBuffer.put(zzb);
            zzskVar.zzj(this.zzM, 0, 38, 0L, 0);
            zzaK();
            this.zzY = true;
            return true;
        }
        if (this.zzV == 1) {
            int i = 0;
            while (true) {
                zzam zzamVar = this.zzu;
                zzamVar.getClass();
                if (i >= zzamVar.zzo.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.zzu.zzo.get(i);
                ByteBuffer byteBuffer2 = this.zzg.zzc;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i++;
            }
            this.zzV = 2;
        }
        ByteBuffer byteBuffer3 = this.zzg.zzc;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        zzkv zzj = zzj();
        try {
            int zzbe = zzbe(zzj, this.zzg, 0);
            if (zzbe == -3) {
                if (zzO()) {
                    this.zzac = this.zzab;
                }
                return false;
            }
            if (zzbe == -5) {
                if (this.zzV == 2) {
                    this.zzg.zzb();
                    this.zzV = 1;
                }
                zzaa(zzj);
                return true;
            }
            zzib zzibVar = this.zzg;
            if (zzibVar.zzf()) {
                this.zzac = this.zzab;
                if (this.zzV == 2) {
                    zzibVar.zzb();
                    this.zzV = 1;
                }
                this.zzad = true;
                if (!this.zzY) {
                    zzaJ();
                    return false;
                }
                try {
                    if (!this.zzK) {
                        this.zzZ = true;
                        zzskVar.zzj(this.zzM, 0, 0, 0L, 4);
                        zzaK();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzi(e, this.zzm, false, zzfs.zzi(e.getErrorCode()));
                }
            }
            if (!this.zzY && !zzibVar.zzg()) {
                zzibVar.zzb();
                if (this.zzV == 2) {
                    this.zzV = 1;
                }
                return true;
            }
            boolean zzk = zzibVar.zzk();
            if (zzk) {
                zzibVar.zzb.zzb(position);
            }
            if (this.zzC && !zzk) {
                ByteBuffer byteBuffer4 = this.zzg.zzc;
                byteBuffer4.getClass();
                byte[] bArr2 = zzgg.zza;
                int position2 = byteBuffer4.position();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i2 + 1;
                    if (i4 >= position2) {
                        byteBuffer4.clear();
                        break;
                    }
                    int i5 = byteBuffer4.get(i2) & 255;
                    if (i3 == 3) {
                        if (i5 == 1) {
                            if ((byteBuffer4.get(i4) & Ascii.US) == 7) {
                                ByteBuffer duplicate = byteBuffer4.duplicate();
                                duplicate.position(i2 - 3);
                                duplicate.limit(position2);
                                byteBuffer4.position(0);
                                byteBuffer4.put(duplicate);
                                break;
                            }
                            i5 = 1;
                        }
                    } else if (i5 == 0) {
                        i3++;
                    }
                    if (i5 != 0) {
                        i3 = 0;
                    }
                    i2 = i4;
                }
                ByteBuffer byteBuffer5 = this.zzg.zzc;
                byteBuffer5.getClass();
                if (byteBuffer5.position() == 0) {
                    return true;
                }
                this.zzC = false;
            }
            long j = this.zzg.zze;
            if (this.zzaf) {
                if (this.zzk.isEmpty()) {
                    zzfp zzfpVar = this.zzag.zze;
                    zzam zzamVar2 = this.zzm;
                    zzamVar2.getClass();
                    zzfpVar.zzd(j, zzamVar2);
                } else {
                    zzfp zzfpVar2 = ((zzsr) this.zzk.peekLast()).zze;
                    zzam zzamVar3 = this.zzm;
                    zzamVar3.getClass();
                    zzfpVar2.zzd(j, zzamVar3);
                }
                this.zzaf = false;
            }
            long max = Math.max(this.zzab, j);
            this.zzab = max;
            if (zzO() || this.zzg.zzh()) {
                this.zzac = max;
            }
            this.zzg.zzj();
            zzib zzibVar2 = this.zzg;
            if (zzibVar2.zze()) {
                zzaf(zzibVar2);
            }
            zzax(this.zzg);
            try {
                if (zzk) {
                    zzskVar.zzk(this.zzM, 0, this.zzg.zzb, j, 0);
                } else {
                    int i6 = this.zzM;
                    ByteBuffer byteBuffer6 = this.zzg.zzc;
                    byteBuffer6.getClass();
                    zzskVar.zzj(i6, 0, byteBuffer6.limit(), j, 0);
                }
                zzaK();
                this.zzY = true;
                this.zzV = 0;
                this.zza.zzc++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw zzi(e2, this.zzm, false, zzfs.zzi(e2.getErrorCode()));
            }
        } catch (zzia e3) {
            zzag(e3);
            zzaR(0);
            zzak();
            return true;
        }
    }

    private final boolean zzaQ() {
        return this.zzN >= 0;
    }

    private final boolean zzaR(int i) throws zzit {
        zzib zzibVar = this.zzf;
        zzkv zzj = zzj();
        zzibVar.zzb();
        int zzbe = zzbe(zzj, this.zzf, i | 4);
        if (zzbe == -5) {
            zzaa(zzj);
            return true;
        }
        if (zzbe != -4 || !this.zzf.zzf()) {
            return false;
        }
        this.zzad = true;
        zzaJ();
        return false;
    }

    private final boolean zzaS(long j) {
        if (this.zzq == -9223372036854775807L) {
            return true;
        }
        zzh();
        return SystemClock.elapsedRealtime() - j < this.zzq;
    }

    private final boolean zzaT(zzam zzamVar) throws zzit {
        if (zzfs.zza >= 23 && this.zzt != null && this.zzX != 3 && zzbd() != 0) {
            float f = this.zzs;
            zzamVar.getClass();
            float zzX = zzX(f, zzamVar, zzR());
            float f2 = this.zzx;
            if (f2 != zzX) {
                if (zzX == -1.0f) {
                    zzac();
                    return false;
                }
                if (f2 != -1.0f || zzX > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzX);
                    zzsk zzskVar = this.zzt;
                    zzskVar.getClass();
                    zzskVar.zzp(bundle);
                    this.zzx = zzX;
                }
            }
        }
        return true;
    }

    private final void zzab() {
        this.zzT = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzS = false;
        this.zzR = false;
        this.zzl.zzb();
    }

    private final void zzac() throws zzit {
        if (this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
        } else {
            zzaz();
            zzav();
        }
    }

    private final void zzak() {
        try {
            zzsk zzskVar = this.zzt;
            zzef.zzb(zzskVar);
            zzskVar.zzi();
        } finally {
            zzaA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzik
    protected void zzA() {
        try {
            zzab();
            zzaz();
        } finally {
            this.zzak = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzD(zzam[] zzamVarArr, long j, long j2, zzuk zzukVar) throws zzit {
        if (this.zzag.zzd == -9223372036854775807L) {
            zzaM(new zzsr(-9223372036854775807L, j, j2));
            return;
        }
        if (this.zzk.isEmpty()) {
            long j3 = this.zzab;
            if (j3 != -9223372036854775807L) {
                long j4 = this.zzah;
                if (j4 != -9223372036854775807L) {
                }
            }
            zzaM(new zzsr(-9223372036854775807L, j, j2));
            if (this.zzag.zzd != -9223372036854775807L) {
                zzal();
                return;
            }
            return;
        }
        this.zzk.add(new zzsr(this.zzab, j, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzik, com.google.android.gms.internal.ads.zzlz
    public void zzK(float f, float f2) throws zzit {
        this.zzr = f;
        this.zzs = f2;
        zzaT(this.zzu);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzlz
    public void zzT(long r24, long r26) throws com.google.android.gms.internal.ads.zzit {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzss.zzT(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public boolean zzU() {
        return this.zzae;
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public boolean zzV() {
        if (this.zzm == null) {
            return false;
        }
        if (zzQ() || zzaQ()) {
            return true;
        }
        if (this.zzL == -9223372036854775807L) {
            return false;
        }
        zzh();
        return SystemClock.elapsedRealtime() < this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final int zzW(zzam zzamVar) throws zzit {
        try {
            return zzY(this.zzd, zzamVar);
        } catch (zztb e) {
            throw zzi(e, zzamVar, false, 4002);
        }
    }

    protected float zzX(float f, zzam zzamVar, zzam[] zzamVarArr) {
        throw null;
    }

    protected abstract int zzY(zzsu zzsuVar, zzam zzamVar) throws zztb;

    protected zzim zzZ(zzsn zzsnVar, zzam zzamVar, zzam zzamVar2) {
        throw null;
    }

    protected void zzaA() {
        zzaK();
        zzaL();
        this.zzL = -9223372036854775807L;
        this.zzZ = false;
        this.zzY = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU ? 1 : 0;
    }

    protected final void zzaB() {
        zzaA();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzaa = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzU = false;
        this.zzV = 0;
        this.zzp = false;
    }

    protected final boolean zzaC() throws zzit {
        boolean zzaD = zzaD();
        if (zzaD) {
            zzav();
        }
        return zzaD;
    }

    protected final boolean zzaD() {
        if (this.zzt == null) {
            return false;
        }
        int i = this.zzX;
        if (i == 3 || this.zzD || ((this.zzE && !this.zzaa) || (this.zzF && this.zzZ))) {
            zzaz();
            return true;
        }
        if (i == 2) {
            zzef.zzf(zzfs.zza >= 23);
            if (zzfs.zza >= 23) {
                try {
                    zzaN();
                } catch (zzit e) {
                    zzez.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzaz();
                    return true;
                }
            }
        }
        zzak();
        return false;
    }

    protected final boolean zzaE() {
        return this.zzR;
    }

    protected final boolean zzaF(zzam zzamVar) {
        return this.zzak == null && zzao(zzamVar);
    }

    protected boolean zzaG(zzsn zzsnVar) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (zzaO() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        if (zzaO() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
    
        if (zzaO() == false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzim zzaa(zzkv zzkvVar) throws zzit {
        int i;
        boolean z = true;
        this.zzaf = true;
        zzam zzamVar = zzkvVar.zza;
        zzamVar.getClass();
        if (zzamVar.zzm == null) {
            throw zzi(new IllegalArgumentException(), zzamVar, false, 4005);
        }
        zzrs zzrsVar = zzkvVar.zzb;
        this.zzak = zzrsVar;
        this.zzm = zzamVar;
        if (this.zzR) {
            this.zzT = true;
            return null;
        }
        zzsk zzskVar = this.zzt;
        if (zzskVar == null) {
            this.zzy = null;
            zzav();
            return null;
        }
        zzsn zzsnVar = this.zzA;
        zzsnVar.getClass();
        zzam zzamVar2 = this.zzu;
        zzamVar2.getClass();
        zzrs zzrsVar2 = this.zzaj;
        if (zzrsVar2 != zzrsVar) {
            zzac();
            return new zzim(zzsnVar.zza, zzamVar2, zzamVar, 0, 128);
        }
        boolean z2 = zzrsVar != zzrsVar2;
        zzef.zzf(!z2 || zzfs.zza >= 23);
        zzim zzZ = zzZ(zzsnVar, zzamVar2, zzamVar);
        int i2 = zzZ.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 == 1) {
                if (zzaT(zzamVar)) {
                    this.zzu = zzamVar;
                    if (!z2) {
                        if (this.zzY) {
                            this.zzW = 1;
                            if (this.zzD || this.zzF) {
                                this.zzX = 3;
                            } else {
                                this.zzX = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 != 2) {
                if (zzaT(zzamVar)) {
                    this.zzu = zzamVar;
                    if (z2) {
                    }
                }
                i = 16;
            } else {
                if (zzaT(zzamVar)) {
                    this.zzU = true;
                    this.zzV = 1;
                    int i3 = this.zzB;
                    if (i3 != 2 && (i3 != 1 || zzamVar.zzr != zzamVar2.zzr || zzamVar.zzs != zzamVar2.zzs)) {
                        z = false;
                    }
                    this.zzI = z;
                    this.zzu = zzamVar;
                    if (z2) {
                    }
                }
                i = 16;
            }
            return (zzZ.zzd != 0 || (this.zzt == zzskVar && this.zzX != 3)) ? zzZ : new zzim(zzsnVar.zza, zzamVar2, zzamVar, 0, i);
        }
        zzac();
        i = 0;
        if (zzZ.zzd != 0) {
        }
    }

    protected abstract zzsi zzad(zzsn zzsnVar, zzam zzamVar, MediaCrypto mediaCrypto, float f);

    protected abstract List zzae(zzsu zzsuVar, zzam zzamVar, boolean z) throws zztb;

    protected void zzaf(zzib zzibVar) throws zzit {
        throw null;
    }

    protected void zzag(Exception exc) {
        throw null;
    }

    protected void zzah(String str, zzsi zzsiVar, long j, long j2) {
        throw null;
    }

    protected void zzai(String str) {
        throw null;
    }

    protected void zzaj(zzam zzamVar, MediaFormat mediaFormat) throws zzit {
        throw null;
    }

    protected void zzal() {
    }

    protected void zzam() throws zzit {
    }

    protected abstract boolean zzan(long j, long j2, zzsk zzskVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zzit;

    protected boolean zzao(zzam zzamVar) {
        return false;
    }

    protected final float zzap() {
        return this.zzr;
    }

    protected final long zzaq() {
        return this.zzag.zzd;
    }

    protected final long zzar() {
        return this.zzag.zzc;
    }

    protected final zzsk zzas() {
        return this.zzt;
    }

    protected zzsl zzat(Throwable th, zzsn zzsnVar) {
        return new zzsl(th, zzsnVar);
    }

    protected final zzsn zzau() {
        return this.zzA;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3 A[Catch: zzsq -> 0x0102, TryCatch #0 {zzsq -> 0x0102, blocks: (B:25:0x0052, B:27:0x0057, B:76:0x005c, B:78:0x0072, B:79:0x007d, B:30:0x008a, B:32:0x0092, B:34:0x0097, B:35:0x009d, B:37:0x00a1, B:39:0x00aa, B:53:0x00c9, B:55:0x00e3, B:56:0x00ec, B:61:0x00f3, B:62:0x00f5, B:63:0x00e6, B:71:0x00f6, B:73:0x00f9, B:74:0x0101, B:82:0x0081, B:83:0x0089, B:50:0x00b9, B:65:0x00c7, B:42:0x00b0), top: B:24:0x0052, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e6 A[Catch: zzsq -> 0x0102, TryCatch #0 {zzsq -> 0x0102, blocks: (B:25:0x0052, B:27:0x0057, B:76:0x005c, B:78:0x0072, B:79:0x007d, B:30:0x008a, B:32:0x0092, B:34:0x0097, B:35:0x009d, B:37:0x00a1, B:39:0x00aa, B:53:0x00c9, B:55:0x00e3, B:56:0x00ec, B:61:0x00f3, B:62:0x00f5, B:63:0x00e6, B:71:0x00f6, B:73:0x00f9, B:74:0x0101, B:82:0x0081, B:83:0x0089, B:50:0x00b9, B:65:0x00c7, B:42:0x00b0), top: B:24:0x0052, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzav() throws zzit {
        zzam zzamVar;
        zzsq zzsqVar;
        if (this.zzt != null || this.zzR || (zzamVar = this.zzm) == null) {
            return;
        }
        if (zzaF(zzamVar)) {
            zzam zzamVar2 = this.zzm;
            zzab();
            String str = zzamVar2.zzm;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzn(32);
            } else {
                this.zzi.zzn(1);
            }
            this.zzR = true;
            return;
        }
        zzrs zzrsVar = this.zzak;
        this.zzaj = zzrsVar;
        this.zzm.getClass();
        if (zzrsVar != null) {
            boolean z = zzrt.zza;
        }
        try {
            zzam zzamVar3 = this.zzm;
            zzamVar3.getClass();
            if (this.zzy == null) {
                try {
                    List zzae = zzae(this.zzd, zzamVar3, false);
                    zzae.isEmpty();
                    this.zzy = new ArrayDeque();
                    if (!zzae.isEmpty()) {
                        this.zzy.add((zzsn) zzae.get(0));
                    }
                    this.zzz = null;
                } catch (zztb e) {
                    throw new zzsq(zzamVar3, (Throwable) e, false, -49998);
                }
            }
            if (this.zzy.isEmpty()) {
                throw new zzsq(zzamVar3, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzy;
            arrayDeque.getClass();
            zzsn zzsnVar = (zzsn) arrayDeque.peekFirst();
            while (this.zzt == null) {
                zzsn zzsnVar2 = (zzsn) arrayDeque.peekFirst();
                zzsnVar2.getClass();
                if (!zzaG(zzsnVar2)) {
                    return;
                }
                try {
                    zzaI(zzsnVar2, null);
                } catch (Exception e2) {
                    if (zzsnVar2 != zzsnVar) {
                        throw e2;
                    }
                    try {
                        zzez.zzf("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        zzaI(zzsnVar2, null);
                    } catch (Exception e3) {
                        zzez.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsnVar2.zza), e3);
                        arrayDeque.removeFirst();
                        zzsq zzsqVar2 = new zzsq(zzamVar3, (Throwable) e3, false, zzsnVar2);
                        zzag(zzsqVar2);
                        zzsqVar = this.zzz;
                        if (zzsqVar != null) {
                            this.zzz = zzsqVar2;
                        } else {
                            this.zzz = zzsq.zza(zzsqVar, zzsqVar2);
                        }
                        if (!arrayDeque.isEmpty()) {
                            throw this.zzz;
                        }
                    }
                    zzez.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsnVar2.zza), e3);
                    arrayDeque.removeFirst();
                    zzsq zzsqVar22 = new zzsq(zzamVar3, (Throwable) e3, false, zzsnVar2);
                    zzag(zzsqVar22);
                    zzsqVar = this.zzz;
                    if (zzsqVar != null) {
                    }
                    if (!arrayDeque.isEmpty()) {
                    }
                }
            }
            this.zzy = null;
        } catch (zzsq e4) {
            throw zzi(e4, this.zzm, false, 4001);
        }
    }

    protected void zzaw(long j) {
        this.zzah = j;
        while (!this.zzk.isEmpty() && j >= ((zzsr) this.zzk.peek()).zzb) {
            zzsr zzsrVar = (zzsr) this.zzk.poll();
            zzsrVar.getClass();
            zzaM(zzsrVar);
            zzal();
        }
    }

    protected void zzax(zzib zzibVar) throws zzit {
    }

    protected void zzay(zzam zzamVar) throws zzit {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzaz() {
        try {
            zzsk zzskVar = this.zzt;
            if (zzskVar != null) {
                zzskVar.zzl();
                this.zza.zzb++;
                zzsn zzsnVar = this.zzA;
                zzsnVar.getClass();
                zzai(zzsnVar.zza);
            }
        } finally {
            this.zzt = null;
            this.zzo = null;
            this.zzaj = null;
            zzaB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzik, com.google.android.gms.internal.ads.zzmb
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzik
    protected void zzw() {
        this.zzm = null;
        zzaM(zzsr.zza);
        this.zzk.clear();
        zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzik
    protected void zzx(boolean z, boolean z2) throws zzit {
        this.zza = new zzil();
    }

    @Override // com.google.android.gms.internal.ads.zzik
    protected void zzy(long j, boolean z) throws zzit {
        this.zzad = false;
        this.zzae = false;
        if (this.zzR) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzS = false;
            this.zzl.zzb();
        } else {
            zzaC();
        }
        zzfp zzfpVar = this.zzag.zze;
        if (zzfpVar.zza() > 0) {
            this.zzaf = true;
        }
        zzfpVar.zze();
        this.zzk.clear();
    }

    private final void zzaJ() throws zzit {
        int i = this.zzX;
        if (i == 1) {
            zzak();
            return;
        }
        if (i == 2) {
            zzak();
            zzaN();
        } else if (i != 3) {
            this.zzae = true;
            zzam();
        } else {
            zzaz();
            zzav();
        }
    }
}
