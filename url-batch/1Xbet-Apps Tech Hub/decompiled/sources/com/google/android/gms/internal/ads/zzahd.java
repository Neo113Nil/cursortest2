package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzahd implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzagz
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzahd.zza;
            return new zzace[]{new zzahd(0)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private zzahc zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzfa zzJ;
    private zzfa zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzach zzai;
    private final zzagy zzh;
    private final zzahf zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzfj zzl;
    private final zzfj zzm;
    private final zzfj zzn;
    private final zzfj zzo;
    private final zzfj zzp;
    private final zzfj zzq;
    private final zzfj zzr;
    private final zzfj zzs;
    private final zzfj zzt;
    private final zzfj zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzfs.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzftl.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", Integer.valueOf(Opcodes.GETFIELD));
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzahd() {
        this(0);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzn(zzacf zzacfVar, zzahc zzahcVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzahcVar.zzb)) {
            zzv(zzacfVar, zzb, i);
            int i3 = this.zzaa;
            zzu();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzahcVar.zzb)) {
            zzv(zzacfVar, zzd, i);
            int i4 = this.zzaa;
            zzu();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzahcVar.zzb)) {
            zzv(zzacfVar, zze, i);
            int i5 = this.zzaa;
            zzu();
            return i5;
        }
        zzadk zzadkVar = zzahcVar.zzW;
        if (!this.zzac) {
            if (zzahcVar.zzg) {
                this.zzV &= -1073741825;
                if (!this.zzad) {
                    ((zzabu) zzacfVar).zzn(this.zzn.zzI(), 0, 1, false);
                    this.zzZ++;
                    if ((this.zzn.zzI()[0] & 128) == 128) {
                        throw zzcf.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzag = this.zzn.zzI()[0];
                    this.zzad = true;
                }
                byte b = this.zzag;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.zzV |= 1073741824;
                    if (!this.zzah) {
                        ((zzabu) zzacfVar).zzn(this.zzs.zzI(), 0, 8, false);
                        this.zzZ += 8;
                        this.zzah = true;
                        this.zzn.zzI()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.zzn.zzG(0);
                        zzadkVar.zzs(this.zzn, 1, 1);
                        this.zzaa++;
                        this.zzs.zzG(0);
                        zzadkVar.zzs(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if (i6 == 2) {
                        if (!this.zzae) {
                            ((zzabu) zzacfVar).zzn(this.zzn.zzI(), 0, 1, false);
                            this.zzZ++;
                            this.zzn.zzG(0);
                            this.zzaf = this.zzn.zzl();
                            this.zzae = true;
                        }
                        int i7 = this.zzaf * 4;
                        this.zzn.zzD(i7);
                        ((zzabu) zzacfVar).zzn(this.zzn.zzI(), 0, i7, false);
                        this.zzZ += i7;
                        int i8 = (this.zzaf >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.zzv = ByteBuffer.allocate(i9);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.zzaf;
                            if (i10 >= i2) {
                                break;
                            }
                            int zzo = this.zzn.zzo();
                            int i12 = zzo - i11;
                            if (i10 % 2 == 0) {
                                this.zzv.putShort((short) i12);
                            } else {
                                this.zzv.putInt(i12);
                            }
                            i10++;
                            i11 = zzo;
                        }
                        int i13 = (i - this.zzZ) - i11;
                        if ((i2 & 1) == 1) {
                            this.zzv.putInt(i13);
                        } else {
                            this.zzv.putShort((short) i13);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzE(this.zzv.array(), i9);
                        zzadkVar.zzs(this.zzt, i9, 1);
                        this.zzaa += i9;
                    }
                }
            } else {
                byte[] bArr = zzahcVar.zzh;
                if (bArr != null) {
                    this.zzq.zzE(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzahcVar.zzb) ? zzahcVar.zzf > 0 : z) {
                this.zzV |= 268435456;
                this.zzu.zzD(0);
                int zzd2 = (this.zzq.zzd() + i) - this.zzZ;
                this.zzn.zzD(4);
                this.zzn.zzI()[0] = (byte) ((zzd2 >> 24) & 255);
                this.zzn.zzI()[1] = (byte) ((zzd2 >> 16) & 255);
                this.zzn.zzI()[2] = (byte) ((zzd2 >> 8) & 255);
                this.zzn.zzI()[3] = (byte) (zzd2 & 255);
                zzadkVar.zzs(this.zzn, 4, 2);
                this.zzaa += 4;
            }
            this.zzac = true;
        }
        int zzd3 = i + this.zzq.zzd();
        if (!"V_MPEG4/ISO/AVC".equals(zzahcVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahcVar.zzb)) {
            if (zzahcVar.zzT != null) {
                zzef.zzf(this.zzq.zzd() == 0);
                zzahcVar.zzT.zzd(zzacfVar);
            }
            while (true) {
                int i14 = this.zzZ;
                if (i14 >= zzd3) {
                    break;
                }
                int zzo2 = zzo(zzacfVar, zzadkVar, zzd3 - i14);
                this.zzZ += zzo2;
                this.zzaa += zzo2;
            }
        } else {
            byte[] zzI = this.zzm.zzI();
            zzI[0] = 0;
            zzI[1] = 0;
            zzI[2] = 0;
            int i15 = zzahcVar.zzX;
            int i16 = 4 - i15;
            while (this.zzZ < zzd3) {
                int i17 = this.zzab;
                if (i17 == 0) {
                    int min = Math.min(i15, this.zzq.zza());
                    ((zzabu) zzacfVar).zzn(zzI, i16 + min, i15 - min, false);
                    if (min > 0) {
                        this.zzq.zzC(zzI, i16, min);
                    }
                    this.zzZ += i15;
                    this.zzm.zzG(0);
                    this.zzab = this.zzm.zzo();
                    this.zzl.zzG(0);
                    zzadi.zzb(zzadkVar, this.zzl, 4);
                    this.zzaa += 4;
                } else {
                    int zzo3 = zzo(zzacfVar, zzadkVar, i17);
                    this.zzZ += zzo3;
                    this.zzaa += zzo3;
                    this.zzab -= zzo3;
                }
            }
        }
        if ("A_VORBIS".equals(zzahcVar.zzb)) {
            this.zzo.zzG(0);
            zzadi.zzb(zzadkVar, this.zzo, 4);
            this.zzaa += 4;
        }
        int i18 = this.zzaa;
        zzu();
        return i18;
    }

    private final int zzo(zzacf zzacfVar, zzadk zzadkVar, int i) throws IOException {
        int zza2 = this.zzq.zza();
        if (zza2 <= 0) {
            return zzadi.zza(zzadkVar, zzacfVar, i, false);
        }
        int min = Math.min(i, zza2);
        zzadi.zzb(zzadkVar, this.zzq, min);
        return min;
    }

    private final long zzp(long j) throws zzcf {
        long j2 = this.zzy;
        if (j2 != -9223372036854775807L) {
            return zzfs.zzs(j, j2, 1000L, RoundingMode.FLOOR);
        }
        throw zzcf.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzq(int i) throws zzcf {
        if (this.zzJ == null || this.zzK == null) {
            throw zzcf.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzr(int i) throws zzcf {
        if (this.zzB != null) {
            return;
        }
        throw zzcf.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[EDGE_INSN: B:50:0x00e0->B:49:0x00e0 BREAK  A[LOOP:0: B:42:0x00c5->B:46:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzs(zzahc zzahcVar, long j, int i, int i2, int i3) {
        char c;
        byte[] zzw;
        int i4;
        int zzc2;
        int zzd2;
        zzadl zzadlVar = zzahcVar.zzT;
        if (zzadlVar != null) {
            zzadlVar.zzc(zzahcVar.zzW, j, i, i2, i3, zzahcVar.zzi);
        } else {
            if ("S_TEXT/UTF8".equals(zzahcVar.zzb) || "S_TEXT/ASS".equals(zzahcVar.zzb) || "S_TEXT/WEBVTT".equals(zzahcVar.zzb)) {
                if (this.zzR > 1) {
                    zzez.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzP;
                    if (j2 == -9223372036854775807L) {
                        zzez.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzahcVar.zzb;
                        byte[] zzI = this.zzr.zzI();
                        int hashCode = str.hashCode();
                        if (hashCode == 738597099) {
                            if (str.equals("S_TEXT/ASS")) {
                                c = 1;
                                if (c != 0) {
                                }
                                System.arraycopy(zzw, 0, zzI, i4, zzw.length);
                                zzc2 = this.zzr.zzc();
                                while (true) {
                                    if (zzc2 >= this.zzr.zzd()) {
                                    }
                                    zzc2++;
                                }
                                zzadk zzadkVar = zzahcVar.zzW;
                                zzfj zzfjVar = this.zzr;
                                zzadi.zzb(zzadkVar, zzfjVar, zzfjVar.zzd());
                                zzd2 = i2 + this.zzr.zzd();
                                if ((i & 268435456) != 0) {
                                }
                                zzahcVar.zzW.zzt(j, i, zzd2, i3, zzahcVar.zzi);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(zzw, 0, zzI, i4, zzw.length);
                            zzc2 = this.zzr.zzc();
                            while (true) {
                                if (zzc2 >= this.zzr.zzd()) {
                                }
                                zzc2++;
                            }
                            zzadk zzadkVar2 = zzahcVar.zzW;
                            zzfj zzfjVar2 = this.zzr;
                            zzadi.zzb(zzadkVar2, zzfjVar2, zzfjVar2.zzd());
                            zzd2 = i2 + this.zzr.zzd();
                            if ((i & 268435456) != 0) {
                            }
                            zzahcVar.zzW.zzt(j, i, zzd2, i3, zzahcVar.zzi);
                        } else if (hashCode != 1045209816) {
                            if (hashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                c = 0;
                                if (c != 0) {
                                    zzw = zzw(j2, "%02d:%02d:%02d,%03d", 1000L);
                                    i4 = 19;
                                } else if (c == 1) {
                                    zzw = zzw(j2, "%01d:%02d:%02d:%02d", WorkRequest.MIN_BACKOFF_MILLIS);
                                    i4 = 21;
                                } else {
                                    if (c != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    zzw = zzw(j2, "%02d:%02d:%02d.%03d", 1000L);
                                    i4 = 25;
                                }
                                System.arraycopy(zzw, 0, zzI, i4, zzw.length);
                                zzc2 = this.zzr.zzc();
                                while (true) {
                                    if (zzc2 >= this.zzr.zzd()) {
                                        break;
                                    }
                                    if (this.zzr.zzI()[zzc2] == 0) {
                                        this.zzr.zzF(zzc2);
                                        break;
                                    }
                                    zzc2++;
                                }
                                zzadk zzadkVar22 = zzahcVar.zzW;
                                zzfj zzfjVar22 = this.zzr;
                                zzadi.zzb(zzadkVar22, zzfjVar22, zzfjVar22.zzd());
                                zzd2 = i2 + this.zzr.zzd();
                                if ((i & 268435456) != 0) {
                                    if (this.zzR > 1) {
                                        this.zzu.zzD(0);
                                    } else {
                                        int zzd3 = this.zzu.zzd();
                                        zzahcVar.zzW.zzs(this.zzu, zzd3, 2);
                                        zzd2 += zzd3;
                                    }
                                }
                                zzahcVar.zzW.zzt(j, i, zzd2, i3, zzahcVar.zzi);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(zzw, 0, zzI, i4, zzw.length);
                            zzc2 = this.zzr.zzc();
                            while (true) {
                                if (zzc2 >= this.zzr.zzd()) {
                                }
                                zzc2++;
                            }
                            zzadk zzadkVar222 = zzahcVar.zzW;
                            zzfj zzfjVar222 = this.zzr;
                            zzadi.zzb(zzadkVar222, zzfjVar222, zzfjVar222.zzd());
                            zzd2 = i2 + this.zzr.zzd();
                            if ((i & 268435456) != 0) {
                            }
                            zzahcVar.zzW.zzt(j, i, zzd2, i3, zzahcVar.zzi);
                        } else {
                            if (str.equals("S_TEXT/WEBVTT")) {
                                c = 2;
                                if (c != 0) {
                                }
                                System.arraycopy(zzw, 0, zzI, i4, zzw.length);
                                zzc2 = this.zzr.zzc();
                                while (true) {
                                    if (zzc2 >= this.zzr.zzd()) {
                                    }
                                    zzc2++;
                                }
                                zzadk zzadkVar2222 = zzahcVar.zzW;
                                zzfj zzfjVar2222 = this.zzr;
                                zzadi.zzb(zzadkVar2222, zzfjVar2222, zzfjVar2222.zzd());
                                zzd2 = i2 + this.zzr.zzd();
                                if ((i & 268435456) != 0) {
                                }
                                zzahcVar.zzW.zzt(j, i, zzd2, i3, zzahcVar.zzi);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(zzw, 0, zzI, i4, zzw.length);
                            zzc2 = this.zzr.zzc();
                            while (true) {
                                if (zzc2 >= this.zzr.zzd()) {
                                }
                                zzc2++;
                            }
                            zzadk zzadkVar22222 = zzahcVar.zzW;
                            zzfj zzfjVar22222 = this.zzr;
                            zzadi.zzb(zzadkVar22222, zzfjVar22222, zzfjVar22222.zzd());
                            zzd2 = i2 + this.zzr.zzd();
                            if ((i & 268435456) != 0) {
                            }
                            zzahcVar.zzW.zzt(j, i, zzd2, i3, zzahcVar.zzi);
                        }
                    }
                }
            }
            zzd2 = i2;
            if ((i & 268435456) != 0) {
            }
            zzahcVar.zzW.zzt(j, i, zzd2, i3, zzahcVar.zzi);
        }
        this.zzM = true;
    }

    private final void zzt(zzacf zzacfVar, int i) throws IOException {
        if (this.zzn.zzd() >= i) {
            return;
        }
        if (this.zzn.zzb() < i) {
            zzfj zzfjVar = this.zzn;
            int zzb2 = zzfjVar.zzb();
            zzfjVar.zzA(Math.max(zzb2 + zzb2, i));
        }
        zzfj zzfjVar2 = this.zzn;
        ((zzabu) zzacfVar).zzn(zzfjVar2.zzI(), zzfjVar2.zzd(), i - zzfjVar2.zzd(), false);
        this.zzn.zzF(i);
    }

    private final void zzu() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzD(0);
    }

    private final void zzv(zzacf zzacfVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzb() < i2) {
            zzfj zzfjVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzfjVar.zzE(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzI(), 0, length);
        }
        ((zzabu) zzacfVar).zzn(this.zzr.zzI(), length, i, false);
        this.zzr.zzG(0);
        this.zzr.zzF(i2);
    }

    private static byte[] zzw(long j, String str, long j2) {
        zzef.zzd(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = zzfs.zza;
        return format.getBytes(zzftl.zzc);
    }

    private static int[] zzx(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzacfVar)) {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzahc zzahcVar = (zzahc) this.zzj.valueAt(i);
                    zzahcVar.zzW.getClass();
                    zzadl zzadlVar = zzahcVar.zzT;
                    if (zzadlVar != null) {
                        zzadlVar.zza(zzahcVar.zzW, zzahcVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzacfVar.zzf();
            if (this.zzF) {
                this.zzH = zzf2;
                zzadbVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if (this.zzC) {
                long j = this.zzH;
                if (j != -1) {
                    zzadbVar.zza = j;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzai = zzachVar;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzu();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzadl zzadlVar = ((zzahc) this.zzj.valueAt(i)).zzT;
            if (zzadlVar != null) {
                zzadlVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        return new zzahe().zza(zzacfVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e6, code lost:
    
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L188;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzh(int i) throws zzcf {
        int i2;
        int i3;
        zzade zzaddVar;
        int i4;
        zzef.zzb(this.zzai);
        char c = '\b';
        if (i == 160) {
            if (this.zzN == 2) {
                zzahc zzahcVar = (zzahc) this.zzj.get(this.zzT);
                zzahcVar.zzW.getClass();
                if (this.zzY > 0 && "A_OPUS".equals(zzahcVar.zzb)) {
                    zzfj zzfjVar = this.zzu;
                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
                    zzfjVar.zzE(array, array.length);
                }
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzR; i6++) {
                    i5 += this.zzS[i6];
                }
                int i7 = 0;
                while (i7 < this.zzR) {
                    long j = this.zzO + ((zzahcVar.zze * i7) / 1000);
                    int i8 = this.zzV;
                    if (i7 == 0) {
                        if (!this.zzX) {
                            i8 |= 1;
                        }
                        i3 = i8;
                        i2 = 0;
                    } else {
                        i2 = i7;
                        i3 = i8;
                    }
                    int i9 = this.zzS[i2];
                    int i10 = i5 - i9;
                    zzs(zzahcVar, j, i3, i9, i10);
                    i7 = i2 + 1;
                    i5 = i10;
                }
                this.zzN = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i11 = this.zzD;
                if (i11 != -1) {
                    long j2 = this.zzE;
                    if (j2 != -1) {
                        if (i11 == 475249515) {
                            this.zzG = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzcf.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzr(i);
                zzahc zzahcVar2 = this.zzB;
                if (zzahcVar2.zzg) {
                    if (zzahcVar2.zzi == null) {
                        throw zzcf.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzahcVar2.zzk = new zzad(null, new zzac(zzo.zza, null, "video/webm", this.zzB.zzi.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzr(i);
                zzahc zzahcVar3 = this.zzB;
                if (zzahcVar3.zzg && zzahcVar3.zzh != null) {
                    throw zzcf.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = 1000000L;
                }
                long j3 = this.zzz;
                if (j3 != -9223372036854775807L) {
                    this.zzA = zzp(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzj.size() == 0) {
                    throw zzcf.zza("No valid tracks were found", null);
                }
                this.zzai.zzD();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzC) {
                zzach zzachVar = this.zzai;
                zzfa zzfaVar = this.zzJ;
                zzfa zzfaVar2 = this.zzK;
                if (this.zzx == -1 || this.zzA == -9223372036854775807L || zzfaVar == null || zzfaVar.zza() == 0 || zzfaVar2 == null || zzfaVar2.zza() != zzfaVar.zza()) {
                    zzaddVar = new zzadd(this.zzA, 0L);
                } else {
                    int zza2 = zzfaVar.zza();
                    int[] iArr = new int[zza2];
                    long[] jArr = new long[zza2];
                    long[] jArr2 = new long[zza2];
                    long[] jArr3 = new long[zza2];
                    for (int i12 = 0; i12 < zza2; i12++) {
                        jArr3[i12] = zzfaVar.zzb(i12);
                        jArr[i12] = this.zzx + zzfaVar2.zzb(i12);
                    }
                    int i13 = 0;
                    while (true) {
                        i4 = zza2 - 1;
                        if (i13 >= i4) {
                            break;
                        }
                        int i14 = i13 + 1;
                        iArr[i13] = (int) (jArr[i14] - jArr[i13]);
                        jArr2[i13] = jArr3[i14] - jArr3[i13];
                        i13 = i14;
                    }
                    iArr[i4] = (int) ((this.zzx + this.zzw) - jArr[i4]);
                    long j4 = this.zzA - jArr3[i4];
                    jArr2[i4] = j4;
                    if (j4 <= 0) {
                        zzez.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArr = Arrays.copyOf(iArr, i4);
                        jArr = Arrays.copyOf(jArr, i4);
                        jArr2 = Arrays.copyOf(jArr2, i4);
                        jArr3 = Arrays.copyOf(jArr3, i4);
                    }
                    zzaddVar = new zzabs(iArr, jArr, jArr2, jArr3);
                }
                zzachVar.zzO(zzaddVar);
                this.zzC = true;
            }
            this.zzJ = null;
            this.zzK = null;
            return;
        }
        zzahc zzahcVar4 = this.zzB;
        zzef.zzb(zzahcVar4);
        String str = zzahcVar4.zzb;
        if (str == null) {
            throw zzcf.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                zzahcVar4.zze(this.zzai, zzahcVar4.zzc);
                this.zzj.put(zzahcVar4.zzc, zzahcVar4);
                break;
        }
        this.zzB = null;
    }

    protected final void zzk(int i, long j, long j2) throws zzcf {
        zzef.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0L;
            return;
        }
        if (i == 174) {
            this.zzB = new zzahc();
            return;
        }
        if (i == 187) {
            this.zzL = false;
            return;
        }
        if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
            return;
        }
        if (i == 20533) {
            zzr(i);
            this.zzB.zzg = true;
            return;
        }
        if (i == 21968) {
            zzr(i);
            this.zzB.zzx = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 != -1 && j3 != j) {
                throw zzcf.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j2;
            return;
        }
        if (i == 475249515) {
            this.zzJ = new zzfa(32);
            this.zzK = new zzfa(32);
        } else if (i == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
            } else {
                this.zzai.zzO(new zzadd(this.zzA, 0L));
                this.zzC = true;
            }
        }
    }

    public zzahd(int i) {
        zzagw zzagwVar = new zzagw();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzagwVar;
        zzagwVar.zza(new zzahb(this, null));
        this.zzk = true;
        this.zzi = new zzahf();
        this.zzj = new SparseArray();
        this.zzn = new zzfj(4);
        this.zzo = new zzfj(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzfj(4);
        this.zzl = new zzfj(zzgg.zza);
        this.zzm = new zzfj(4);
        this.zzq = new zzfj();
        this.zzr = new zzfj();
        this.zzs = new zzfj(8);
        this.zzt = new zzfj();
        this.zzu = new zzfj();
        this.zzS = new int[1];
    }

    protected final void zzl(int i, String str) throws zzcf {
        if (i == 134) {
            zzr(i);
            this.zzB.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzcf.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            zzr(i);
            this.zzB.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzr(i);
            this.zzB.zzZ = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0284, code lost:
    
        throw com.google.android.gms.internal.ads.zzcf.zza("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzg(int i, int i2, zzacf zzacfVar) throws IOException {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = 1;
        int i12 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.zzN != 2) {
                    return;
                }
                zzahc zzahcVar = (zzahc) this.zzj.get(this.zzT);
                if (this.zzW != 4 || !"V_VP9".equals(zzahcVar.zzb)) {
                    ((zzabu) zzacfVar).zzo(i2, false);
                    return;
                }
                this.zzu.zzD(i2);
                ((zzabu) zzacfVar).zzn(this.zzu.zzI(), 0, i2, false);
                return;
            }
            if (i10 == 16877) {
                zzr(i);
                zzahc zzahcVar2 = this.zzB;
                i8 = zzahcVar2.zzY;
                if (i8 != 1685485123) {
                    i9 = zzahcVar2.zzY;
                    if (i9 != 1685480259) {
                        ((zzabu) zzacfVar).zzo(i2, false);
                        return;
                    }
                }
                zzahcVar2.zzN = new byte[i2];
                ((zzabu) zzacfVar).zzn(zzahcVar2.zzN, 0, i2, false);
                return;
            }
            if (i10 == 16981) {
                zzr(i);
                zzahc zzahcVar3 = this.zzB;
                zzahcVar3.zzh = new byte[i2];
                ((zzabu) zzacfVar).zzn(zzahcVar3.zzh, 0, i2, false);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr = new byte[i2];
                ((zzabu) zzacfVar).zzn(bArr, 0, i2, false);
                zzr(i);
                this.zzB.zzi = new zzadj(1, bArr, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.zzp.zzI(), (byte) 0);
                ((zzabu) zzacfVar).zzn(this.zzp.zzI(), 4 - i2, i2, false);
                this.zzp.zzG(0);
                this.zzD = (int) this.zzp.zzt();
                return;
            }
            if (i10 == 25506) {
                zzr(i);
                zzahc zzahcVar4 = this.zzB;
                zzahcVar4.zzj = new byte[i2];
                ((zzabu) zzacfVar).zzn(zzahcVar4.zzj, 0, i2, false);
                return;
            }
            if (i10 != 30322) {
                throw zzcf.zza("Unexpected id: " + i10, null);
            }
            zzr(i);
            zzahc zzahcVar5 = this.zzB;
            zzahcVar5.zzv = new byte[i2];
            ((zzabu) zzacfVar).zzn(zzahcVar5.zzv, 0, i2, false);
            return;
        }
        int i13 = 8;
        if (this.zzN == 0) {
            this.zzT = (int) this.zzi.zzd(zzacfVar, false, true, 8);
            this.zzU = this.zzi.zza();
            this.zzP = -9223372036854775807L;
            this.zzN = 1;
            this.zzn.zzD(0);
        }
        zzahc zzahcVar6 = (zzahc) this.zzj.get(this.zzT);
        if (zzahcVar6 == null) {
            ((zzabu) zzacfVar).zzo(i2 - this.zzU, false);
            this.zzN = 0;
            return;
        }
        zzahcVar6.zzW.getClass();
        if (this.zzN == 1) {
            zzt(zzacfVar, 3);
            int i14 = (this.zzn.zzI()[2] & 6) >> 1;
            if (i14 == 0) {
                this.zzR = 1;
                int[] zzx = zzx(this.zzS, 1);
                this.zzS = zzx;
                zzx[0] = (i2 - this.zzU) - 3;
            } else {
                zzt(zzacfVar, 4);
                int i15 = (this.zzn.zzI()[3] & 255) + 1;
                this.zzR = i15;
                int[] zzx2 = zzx(this.zzS, i15);
                this.zzS = zzx2;
                if (i14 == 2) {
                    int i16 = (i2 - this.zzU) - 4;
                    int i17 = this.zzR;
                    Arrays.fill(zzx2, 0, i17, i16 / i17);
                } else if (i14 == 1) {
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 4;
                    while (true) {
                        i4 = this.zzR - 1;
                        if (i18 >= i4) {
                            break;
                        }
                        this.zzS[i18] = 0;
                        do {
                            i20++;
                            zzt(zzacfVar, i20);
                            i5 = this.zzn.zzI()[i20 - 1] & 255;
                            int[] iArr = this.zzS;
                            i6 = iArr[i18] + i5;
                            iArr[i18] = i6;
                        } while (i5 == 255);
                        i19 += i6;
                        i18++;
                    }
                    this.zzS[i4] = ((i2 - this.zzU) - i20) - i19;
                } else {
                    if (i14 != 3) {
                        throw zzcf.zza("Unexpected lacing value: 2", null);
                    }
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 4;
                    while (true) {
                        int i24 = this.zzR - 1;
                        if (i21 >= i24) {
                            this.zzS[i24] = ((i2 - this.zzU) - i23) - i22;
                            break;
                        }
                        this.zzS[i21] = i12;
                        i23++;
                        zzt(zzacfVar, i23);
                        int i25 = i23 - 1;
                        if (this.zzn.zzI()[i25] == 0) {
                            throw zzcf.zza("No valid varint length mask found", null);
                        }
                        int i26 = i12;
                        while (true) {
                            if (i26 >= i13) {
                                j = 0;
                                break;
                            }
                            int i27 = i11 << (7 - i26);
                            if ((this.zzn.zzI()[i25] & i27) != 0) {
                                i23 += i26;
                                zzt(zzacfVar, i23);
                                j = (~i27) & this.zzn.zzI()[i25] & 255;
                                int i28 = i25 + 1;
                                while (i28 < i23) {
                                    j = (j << i13) | (this.zzn.zzI()[i28] & 255);
                                    i28++;
                                    i13 = 8;
                                }
                                if (i21 > 0) {
                                    j -= (1 << ((i26 * 7) + 6)) - 1;
                                }
                            } else {
                                i26++;
                                i11 = 1;
                                i13 = 8;
                            }
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int[] iArr2 = this.zzS;
                        int i29 = (int) j;
                        if (i21 != 0) {
                            i29 += iArr2[i21 - 1];
                        }
                        iArr2[i21] = i29;
                        i22 += i29;
                        i21++;
                        i11 = 1;
                        i12 = 0;
                        i13 = 8;
                    }
                }
            }
            this.zzO = this.zzI + zzp((this.zzn.zzI()[0] << 8) | (this.zzn.zzI()[1] & 255));
            if (zzahcVar6.zzd != 2) {
                if (i10 == 163) {
                    if ((this.zzn.zzI()[2] & 128) == 128) {
                        i10 = Opcodes.IF_ICMPGT;
                    } else {
                        i10 = Opcodes.IF_ICMPGT;
                    }
                }
                i7 = 0;
                this.zzV = i7;
                this.zzN = 2;
                this.zzQ = 0;
                i3 = Opcodes.IF_ICMPGT;
            }
            i7 = 1;
            this.zzV = i7;
            this.zzN = 2;
            this.zzQ = 0;
            i3 = Opcodes.IF_ICMPGT;
        } else {
            i3 = 163;
        }
        if (i10 == i3) {
            while (true) {
                int i30 = this.zzQ;
                if (i30 >= this.zzR) {
                    this.zzN = 0;
                    return;
                }
                zzs(zzahcVar6, ((this.zzQ * zzahcVar6.zze) / 1000) + this.zzO, this.zzV, zzn(zzacfVar, zzahcVar6, this.zzS[i30], false), 0);
                this.zzQ++;
            }
        } else {
            while (true) {
                int i31 = this.zzQ;
                if (i31 >= this.zzR) {
                    return;
                }
                int[] iArr3 = this.zzS;
                iArr3[i31] = zzn(zzacfVar, zzahcVar6, iArr3[i31], true);
                this.zzQ++;
            }
        }
    }

    protected final void zzj(int i, long j) throws zzcf {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzcf.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzcf.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case Opcodes.LXOR /* 131 */:
                zzr(i);
                this.zzB.zzd = (int) j;
                return;
            case Opcodes.L2I /* 136 */:
                z = j == 1;
                zzr(i);
                this.zzB.zzV = z;
                return;
            case 155:
                this.zzP = zzp(j);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                zzr(i);
                this.zzB.zzO = (int) j;
                return;
            case Opcodes.ARETURN /* 176 */:
                zzr(i);
                this.zzB.zzl = (int) j;
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                zzq(i);
                this.zzJ.zzc(zzp(j));
                return;
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                zzr(i);
                this.zzB.zzm = (int) j;
                return;
            case 215:
                zzr(i);
                this.zzB.zzc = (int) j;
                return;
            case 231:
                this.zzI = zzp(j);
                return;
            case 238:
                this.zzW = (int) j;
                return;
            case 241:
                if (this.zzL) {
                    return;
                }
                zzq(i);
                this.zzK.zzc(j);
                this.zzL = true;
                return;
            case 251:
                this.zzX = true;
                return;
            case 16871:
                zzr(i);
                this.zzB.zzY = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzcf.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzcf.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzcf.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzcf.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzcf.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.zzE = j + this.zzx;
                return;
            case 21432:
                int i2 = (int) j;
                zzr(i);
                if (i2 == 0) {
                    this.zzB.zzw = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzB.zzw = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzB.zzw = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzB.zzw = 3;
                    return;
                }
            case 21680:
                zzr(i);
                this.zzB.zzo = (int) j;
                return;
            case 21682:
                zzr(i);
                this.zzB.zzq = (int) j;
                return;
            case 21690:
                zzr(i);
                this.zzB.zzp = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzr(i);
                this.zzB.zzU = z;
                return;
            case 21938:
                zzr(i);
                zzahc zzahcVar = this.zzB;
                zzahcVar.zzx = true;
                zzahcVar.zzn = (int) j;
                return;
            case 21998:
                zzr(i);
                this.zzB.zzf = (int) j;
                return;
            case 22186:
                zzr(i);
                this.zzB.zzR = j;
                return;
            case 22203:
                zzr(i);
                this.zzB.zzS = j;
                return;
            case 25188:
                zzr(i);
                this.zzB.zzP = (int) j;
                return;
            case 30114:
                this.zzY = j;
                return;
            case 30321:
                int i3 = (int) j;
                zzr(i);
                if (i3 == 0) {
                    this.zzB.zzr = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzB.zzr = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzB.zzr = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzB.zzr = 3;
                    return;
                }
            case 2352003:
                zzr(i);
                this.zzB.zze = (int) j;
                return;
            case 2807729:
                this.zzy = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        zzr(i);
                        if (i4 == 1) {
                            this.zzB.zzA = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzB.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzr(i);
                        int zzb2 = zzs.zzb((int) j);
                        if (zzb2 != -1) {
                            this.zzB.zzz = zzb2;
                            return;
                        }
                        return;
                    case 21947:
                        zzr(i);
                        this.zzB.zzx = true;
                        int zza2 = zzs.zza((int) j);
                        if (zza2 != -1) {
                            this.zzB.zzy = zza2;
                            return;
                        }
                        return;
                    case 21948:
                        zzr(i);
                        this.zzB.zzB = (int) j;
                        return;
                    case 21949:
                        zzr(i);
                        this.zzB.zzC = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void zzi(int i, double d) throws zzcf {
        if (i == 181) {
            zzr(i);
            this.zzB.zzQ = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzz = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzr(i);
                this.zzB.zzD = (float) d;
                break;
            case 21970:
                zzr(i);
                this.zzB.zzE = (float) d;
                break;
            case 21971:
                zzr(i);
                this.zzB.zzF = (float) d;
                break;
            case 21972:
                zzr(i);
                this.zzB.zzG = (float) d;
                break;
            case 21973:
                zzr(i);
                this.zzB.zzH = (float) d;
                break;
            case 21974:
                zzr(i);
                this.zzB.zzI = (float) d;
                break;
            case 21975:
                zzr(i);
                this.zzB.zzJ = (float) d;
                break;
            case 21976:
                zzr(i);
                this.zzB.zzK = (float) d;
                break;
            case 21977:
                zzr(i);
                this.zzB.zzL = (float) d;
                break;
            case 21978:
                zzr(i);
                this.zzB.zzM = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzr(i);
                        this.zzB.zzs = (float) d;
                        break;
                    case 30324:
                        zzr(i);
                        this.zzB.zzt = (float) d;
                        break;
                    case 30325:
                        zzr(i);
                        this.zzB.zzu = (float) d;
                        break;
                }
        }
    }
}
