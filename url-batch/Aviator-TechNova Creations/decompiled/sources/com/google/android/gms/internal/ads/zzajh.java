package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.WorkRequest;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzajh implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private zzajg zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private zzaex zzap;
    private final zzaja zzaq;
    private final zzajj zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzamd zzl;
    private final zzer zzm;
    private final zzer zzn;
    private final zzer zzo;
    private final zzer zzp;
    private final zzer zzq;
    private final zzer zzr;
    private final zzer zzs;
    private final zzer zzt;
    private final zzer zzu;
    private final zzer zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzajd.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = zzfj.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
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

    @Deprecated
    public zzajh() {
        this(new zzaja(), 2, zzamd.zza);
    }

    private static int[] zzA(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                zzaex zzaexVar = this.zzap;
                zzaexVar.getClass();
                zzaexVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzajg) sparseArray.valueAt(i)).zzV) {
                return;
            } else {
                i++;
            }
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzq(int i) throws zzat {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw zzat.zzb(sb.toString(), null);
    }

    private final void zzr(int i) throws zzat {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzs(zzajg zzajgVar, long j, int i, int i2, int i3) {
        char c;
        byte[] zzx;
        int i4;
        int zze2;
        zzagi zzagiVar = zzajgVar.zzU;
        if (zzagiVar != null) {
            zzagiVar.zzc(zzajgVar.zzY, j, i, i2, i3, zzajgVar.zzj);
        } else {
            String str = zzajgVar.zzc;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.zzY > 1) {
                    zzee.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzW;
                    if (j2 == -9223372036854775807L) {
                        zzee.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        zzer zzerVar = this.zzs;
                        byte[] zzi = zzerVar.zzi();
                        switch (str.hashCode()) {
                            case 738597099:
                                if (str.equals("S_TEXT/ASS")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 738614379:
                                if (str.equals("S_TEXT/SSA")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1045209816:
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1422270023:
                                if (str.equals("S_TEXT/UTF8")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            zzx = zzx(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        } else if (c == 1 || c == 2) {
                            zzx = zzx(j2, "%01d:%02d:%02d:%02d", WorkRequest.MIN_BACKOFF_MILLIS);
                            i4 = 21;
                        } else {
                            if (c != 3) {
                                throw new IllegalArgumentException();
                            }
                            zzx = zzx(j2, "%02d:%02d:%02d.%03d", 1000L);
                            i4 = 25;
                        }
                        System.arraycopy(zzx, 0, zzi, i4, zzx.length);
                        int zzg2 = zzerVar.zzg();
                        while (true) {
                            if (zzg2 < zzerVar.zze()) {
                                if (zzerVar.zzi()[zzg2] == 0) {
                                    zzerVar.zzf(zzg2);
                                } else {
                                    zzg2++;
                                }
                            }
                        }
                        zzajgVar.zzY.zzc(zzerVar, zzerVar.zze());
                        zze2 = i2 + zzerVar.zze();
                        if ((i & 268435456) != 0) {
                            if (this.zzY > 1) {
                                this.zzv.zza(0);
                            } else {
                                zzer zzerVar2 = this.zzv;
                                int zze3 = zzerVar2.zze();
                                zzajgVar.zzY.zzd(zzerVar2, zze3, 2);
                                zze2 += zze3;
                            }
                        }
                        zzajgVar.zzY.zze(j, i, zze2, i3, zzajgVar.zzj);
                    }
                }
            }
            zze2 = i2;
            if ((i & 268435456) != 0) {
            }
            zzajgVar.zzY.zze(j, i, zze2, i3, zzajgVar.zzj);
        }
        this.zzT = true;
    }

    private final void zzt(zzaev zzaevVar, int i) throws IOException {
        zzer zzerVar = this.zzo;
        if (zzerVar.zze() >= i) {
            return;
        }
        if (zzerVar.zzj() < i) {
            int zzj = zzerVar.zzj();
            zzerVar.zzc(Math.max(zzj + zzj, i));
        }
        zzaevVar.zzc(zzerVar.zzi(), zzerVar.zze(), i - zzerVar.zze());
        zzerVar.zzf(i);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzu(zzaev zzaevVar, zzajg zzajgVar, int i, boolean z) throws IOException {
        int i2;
        String str = zzajgVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzaevVar, zzb, i);
            int i3 = this.zzah;
            zzv();
            return i3;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzaevVar, zzd, i);
            int i4 = this.zzah;
            zzv();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzaevVar, zze, i);
            int i5 = this.zzah;
            zzv();
            return i5;
        }
        if (zzajgVar.zzV) {
            zzajgVar.zzZ.getClass();
            int i6 = zzaet.zza;
            zzer zzerVar = new zzer(i);
            if (zzaevVar.zzh(zzerVar.zzi(), 0, i, true)) {
                zzaevVar.zzl();
                if (zzaet.zza(zzerVar.zzr()) == 1 && zzerVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzerVar.zzm(bArr, 0, 10);
                    zzerVar.zzh(0);
                    int zzc2 = zzaet.zzc(bArr);
                    if (zzerVar.zzd() >= zzc2 + 4) {
                        zzerVar.zzk(zzc2);
                        if (zzaet.zza(zzerVar.zzB()) == 2) {
                            zzt zza2 = zzajgVar.zzZ.zza();
                            zza2.zzm("audio/vnd.dts.hd");
                            zzajgVar.zzZ = zza2.zzM();
                        }
                    }
                }
            }
            zzajgVar.zzY.zzz(zzajgVar.zzZ);
            zzajgVar.zzV = false;
            zzB();
        }
        zzagh zzaghVar = zzajgVar.zzY;
        if (!this.zzaj) {
            if (zzajgVar.zzh) {
                this.zzac &= -1073741825;
                if (!this.zzak) {
                    zzer zzerVar2 = this.zzo;
                    zzaevVar.zzc(zzerVar2.zzi(), 0, 1);
                    this.zzag++;
                    if ((zzerVar2.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzan = zzerVar2.zzi()[0];
                    this.zzak = true;
                }
                byte b = this.zzan;
                if ((b & 1) == 1) {
                    int i7 = b & 2;
                    this.zzac |= 1073741824;
                    if (!this.zzao) {
                        zzer zzerVar3 = this.zzt;
                        zzaevVar.zzc(zzerVar3.zzi(), 0, 8);
                        this.zzag += 8;
                        this.zzao = true;
                        zzer zzerVar4 = this.zzo;
                        zzerVar4.zzi()[0] = (byte) ((i7 != 2 ? 0 : 128) | 8);
                        zzerVar4.zzh(0);
                        zzaghVar.zzd(zzerVar4, 1, 1);
                        this.zzah++;
                        zzerVar3.zzh(0);
                        zzaghVar.zzd(zzerVar3, 8, 1);
                        this.zzah += 8;
                    }
                    if (i7 == 2) {
                        if (!this.zzal) {
                            zzer zzerVar5 = this.zzo;
                            zzaevVar.zzc(zzerVar5.zzi(), 0, 1);
                            this.zzag++;
                            zzerVar5.zzh(0);
                            this.zzam = zzerVar5.zzs();
                            this.zzal = true;
                        }
                        int i8 = this.zzam * 4;
                        zzer zzerVar6 = this.zzo;
                        zzerVar6.zza(i8);
                        zzaevVar.zzc(zzerVar6.zzi(), 0, i8);
                        this.zzag += i8;
                        int i9 = (this.zzam >> 1) + 1;
                        int i10 = (i9 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.zzw = ByteBuffer.allocate(i10);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i9);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i2 = this.zzam;
                            if (i11 >= i2) {
                                break;
                            }
                            int zzH = zzerVar6.zzH();
                            int i13 = zzH - i12;
                            if (i11 % 2 == 0) {
                                this.zzw.putShort((short) i13);
                            } else {
                                this.zzw.putInt(i13);
                            }
                            i11++;
                            i12 = zzH;
                        }
                        int i14 = (i - this.zzag) - i12;
                        if ((i2 & 1) == 1) {
                            this.zzw.putInt(i14);
                        } else {
                            this.zzw.putShort((short) i14);
                            this.zzw.putInt(0);
                        }
                        zzer zzerVar7 = this.zzu;
                        zzerVar7.zzb(this.zzw.array(), i10);
                        zzaghVar.zzd(zzerVar7, i10, 1);
                        this.zzah += i10;
                    }
                }
            } else {
                byte[] bArr2 = zzajgVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzajgVar.zzc) ? zzajgVar.zzg > 0 : z) {
                this.zzac |= 268435456;
                this.zzv.zza(0);
                int zze2 = (this.zzr.zze() + i) - this.zzag;
                zzer zzerVar8 = this.zzo;
                zzerVar8.zza(4);
                zzerVar8.zzi()[0] = (byte) ((zze2 >> 24) & 255);
                zzerVar8.zzi()[1] = (byte) ((zze2 >> 16) & 255);
                zzerVar8.zzi()[2] = (byte) ((zze2 >> 8) & 255);
                zzerVar8.zzi()[3] = (byte) (zze2 & 255);
                zzaghVar.zzd(zzerVar8, 4, 2);
                this.zzah += 4;
            }
            this.zzaj = true;
        }
        zzer zzerVar9 = this.zzr;
        int zze3 = i + zzerVar9.zze();
        String str2 = zzajgVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzajgVar.zzU != null) {
                zzgrc.zzi(zzerVar9.zze() == 0);
                zzajgVar.zzU.zzb(zzaevVar);
            }
            while (true) {
                int i15 = this.zzag;
                if (i15 >= zze3) {
                    break;
                }
                int zzy = zzy(zzaevVar, zzaghVar, zze3 - i15);
                this.zzag += zzy;
                this.zzah += zzy;
            }
        } else {
            zzer zzerVar10 = this.zzn;
            byte[] zzi = zzerVar10.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i16 = zzajgVar.zzaa;
            int i17 = 4 - i16;
            while (this.zzag < zze3) {
                int i18 = this.zzai;
                if (i18 == 0) {
                    int min = Math.min(i16, zzerVar9.zzd());
                    zzaevVar.zzc(zzi, i17 + min, i16 - min);
                    if (min > 0) {
                        zzerVar9.zzm(zzi, i17, min);
                    }
                    this.zzag += i16;
                    zzerVar10.zzh(0);
                    this.zzai = zzerVar10.zzH();
                    zzer zzerVar11 = this.zzm;
                    zzerVar11.zzh(0);
                    zzaghVar.zzc(zzerVar11, 4);
                    this.zzah += 4;
                } else {
                    int zzy2 = zzy(zzaevVar, zzaghVar, i18);
                    this.zzag += zzy2;
                    this.zzah += zzy2;
                    this.zzai -= zzy2;
                }
            }
        }
        if ("A_VORBIS".equals(zzajgVar.zzc)) {
            zzer zzerVar12 = this.zzp;
            zzerVar12.zzh(0);
            zzaghVar.zzc(zzerVar12, 4);
            this.zzah += 4;
        }
        int i19 = this.zzah;
        zzv();
        return i19;
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(zzaev zzaevVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        zzer zzerVar = this.zzs;
        if (zzerVar.zzj() < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzerVar.zzb(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzerVar.zzi(), 0, length);
        }
        zzaevVar.zzc(zzerVar.zzi(), length, i);
        zzerVar.zzh(0);
        zzerVar.zzf(i2);
    }

    private static byte[] zzx(long j, String str, long j2) {
        zzgrc.zza(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = zzfj.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzy(zzaev zzaevVar, zzagh zzaghVar, int i) throws IOException {
        zzer zzerVar = this.zzr;
        int zzd2 = zzerVar.zzd();
        if (zzd2 <= 0) {
            return zzaghVar.zza(zzaevVar, i, false);
        }
        int min = Math.min(i, zzd2);
        zzaghVar.zzc(zzerVar, min);
        return min;
    }

    private final long zzz(long j) throws zzat {
        long j2 = this.zzz;
        if (j2 != -9223372036854775807L) {
            return zzfj.zzt(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return new zzaji().zza(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if (this.zzk) {
            zzaexVar = new zzamg(zzaexVar, this.zzl);
        }
        this.zzap = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i = 0;
        this.zzT = false;
        while (!this.zzT) {
            if (this.zzaq.zzc(zzaevVar)) {
                long zzn = zzaevVar.zzn();
                if (this.zzP) {
                    this.zzR = zzn;
                    zzafvVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j = this.zzR;
                    if (j != -1) {
                        zzafvVar.zza = j;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzajg zzajgVar = (zzajg) sparseArray.valueAt(i);
                    zzajgVar.zzb();
                    zzagi zzagiVar = zzajgVar.zzU;
                    if (zzagiVar != null) {
                        zzagiVar.zzd(zzajgVar.zzY, zzajgVar.zzj);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        this.zzS = -9223372036854775807L;
        int i = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                return;
            }
            zzagi zzagiVar = ((zzajg) sparseArray.valueAt(i)).zzU;
            if (zzagiVar != null) {
                zzagiVar.zza();
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    zzajh(zzaja zzajaVar, int i, zzamd zzamdVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = -9223372036854775807L;
        this.zzaq = zzajaVar;
        zzajaVar.zza(new zzajc(this, null));
        this.zzl = zzamdVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i & 1) ^ 1);
        this.zzk = (i & 2) == 0;
        this.zzh = new zzajj();
        this.zzi = new SparseArray();
        this.zzo = new zzer(4);
        this.zzp = new zzer(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzer(4);
        this.zzm = new zzer(zzgm.zza);
        this.zzn = new zzer(4);
        this.zzr = new zzer();
        this.zzs = new zzer();
        this.zzt = new zzer(8);
        this.zzu = new zzer();
        this.zzv = new zzer();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    protected final void zzh(int i, long j, long j2) throws zzat {
        zzaex zzaexVar = this.zzap;
        zzaexVar.getClass();
        if (i == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i == 174) {
            zzajg zzajgVar = new zzajg();
            this.zzE = zzajgVar;
            zzajgVar.zza = this.zzC;
            return;
        }
        if (i == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            this.zzK = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i == 20533) {
            zzq(i);
            this.zzE.zzh = true;
            return;
        }
        if (i == 21968) {
            zzq(i);
            this.zzE.zzy = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzy;
            if (j3 != -1 && j3 != j) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j2;
            return;
        }
        if (i == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzaexVar.zzw(new zzafx(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    protected final void zzl(int i, String str) throws zzat {
        if (i == 134) {
            zzq(i);
            this.zzE.zzc = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                zzq(i);
                this.zzE.zzb = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                zzq(i);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0279, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzm(int i, int i2, zzaev zzaevVar) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = i;
        zzaev zzaevVar2 = zzaevVar;
        int i14 = 2;
        int i15 = 0;
        if (i13 != 161 && i13 != 163) {
            if (i13 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                zzajg zzajgVar = (zzajg) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzajgVar.zzc)) {
                    zzaevVar2.zzf(i2);
                    return;
                }
                zzer zzerVar = this.zzv;
                zzerVar.zza(i2);
                zzaevVar2.zzc(zzerVar.zzi(), 0, i2);
                return;
            }
            if (i13 == 16877) {
                zzq(i);
                zzajg zzajgVar2 = this.zzE;
                if (zzajgVar2.zzc() != 1685485123 && zzajgVar2.zzc() != 1685480259) {
                    zzaevVar2.zzf(i2);
                    return;
                } else {
                    zzajgVar2.zzO = new byte[i2];
                    zzaevVar2.zzc(zzajgVar2.zzO, 0, i2);
                    return;
                }
            }
            if (i13 == 16981) {
                zzq(i);
                zzajg zzajgVar3 = this.zzE;
                zzajgVar3.zzi = new byte[i2];
                zzaevVar2.zzc(zzajgVar3.zzi, 0, i2);
                return;
            }
            if (i13 == 18402) {
                byte[] bArr = new byte[i2];
                zzaevVar2.zzc(bArr, 0, i2);
                zzq(i);
                this.zzE.zzj = new zzagg(1, bArr, 0, 0);
                return;
            }
            if (i13 == 21419) {
                zzer zzerVar2 = this.zzq;
                Arrays.fill(zzerVar2.zzi(), (byte) 0);
                zzaevVar2.zzc(zzerVar2.zzi(), 4 - i2, i2);
                zzerVar2.zzh(0);
                this.zzG = (int) zzerVar2.zzz();
                return;
            }
            if (i13 == 25506) {
                zzq(i);
                zzajg zzajgVar4 = this.zzE;
                zzajgVar4.zzk = new byte[i2];
                zzaevVar2.zzc(zzajgVar4.zzk, 0, i2);
                return;
            }
            if (i13 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i13);
                throw zzat.zzb(sb.toString(), null);
            }
            zzq(i);
            zzajg zzajgVar5 = this.zzE;
            zzajgVar5.zzw = new byte[i2];
            zzaevVar2.zzc(zzajgVar5.zzw, 0, i2);
            return;
        }
        int i16 = 8;
        if (this.zzU == 0) {
            zzajj zzajjVar = this.zzh;
            this.zzaa = (int) zzajjVar.zzb(zzaevVar2, false, true, 8);
            this.zzab = zzajjVar.zzc();
            this.zzW = -9223372036854775807L;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        zzajg zzajgVar6 = (zzajg) this.zzi.get(this.zzaa);
        if (zzajgVar6 == null) {
            zzaevVar2.zzf(i2 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzajgVar6.zzb();
        if (this.zzU == 1) {
            zzt(zzaevVar2, 3);
            zzer zzerVar3 = this.zzo;
            int i17 = (zzerVar3.zzi()[2] & 6) >> 1;
            if (i17 == 0) {
                this.zzY = 1;
                int[] zzA = zzA(this.zzZ, 1);
                this.zzZ = zzA;
                zzA[0] = (i2 - this.zzab) - 3;
            } else {
                zzt(zzaevVar2, 4);
                int i18 = (zzerVar3.zzi()[3] & 255) + 1;
                this.zzY = i18;
                int[] zzA2 = zzA(this.zzZ, i18);
                this.zzZ = zzA2;
                if (i17 == 2) {
                    int i19 = (i2 - this.zzab) - 4;
                    int i20 = this.zzY;
                    Arrays.fill(zzA2, 0, i20, i19 / i20);
                } else if (i17 == 1) {
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 4;
                    while (true) {
                        i9 = this.zzY - 1;
                        if (i21 >= i9) {
                            break;
                        }
                        this.zzZ[i21] = 0;
                        while (true) {
                            i10 = i23 + 1;
                            zzt(zzaevVar2, i10);
                            int i24 = zzerVar3.zzi()[i23] & 255;
                            int[] iArr = this.zzZ;
                            i11 = iArr[i21] + i24;
                            iArr[i21] = i11;
                            if (i24 != 255) {
                                break;
                            } else {
                                i23 = i10;
                            }
                        }
                        i22 += i11;
                        i21++;
                        i23 = i10;
                    }
                    this.zzZ[i9] = ((i2 - this.zzab) - i23) - i22;
                } else {
                    if (i17 != 3) {
                        throw zzat.zzb("Unexpected lacing value: 2", null);
                    }
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 4;
                    while (true) {
                        int i28 = this.zzY - 1;
                        if (i25 >= i28) {
                            i4 = i14;
                            i5 = i15;
                            this.zzZ[i28] = ((i2 - this.zzab) - i27) - i26;
                            break;
                        }
                        this.zzZ[i25] = i15;
                        int i29 = i27 + 1;
                        zzt(zzaevVar2, i29);
                        if (zzerVar3.zzi()[i27] == 0) {
                            throw zzat.zzb("No valid varint length mask found", null);
                        }
                        int i30 = i15;
                        while (true) {
                            if (i15 >= i16) {
                                i6 = i14;
                                i7 = i16;
                                i8 = i26;
                                j = 0;
                                break;
                            }
                            i7 = i16;
                            int i31 = 1 << (7 - i15);
                            if ((zzerVar3.zzi()[i27] & i31) != 0) {
                                i29 += i15;
                                zzt(zzaevVar2, i29);
                                int i32 = i27 + 1;
                                int i33 = zzerVar3.zzi()[i27] & 255 & (~i31);
                                int i34 = i14;
                                j = i33;
                                while (true) {
                                    int i35 = i32;
                                    if (i35 >= i29) {
                                        break;
                                    }
                                    i32 = i35 + 1;
                                    j = (j << i7) | (zzerVar3.zzi()[i35] & 255);
                                    i26 = i26;
                                    i34 = i34;
                                }
                                i6 = i34;
                                i8 = i26;
                                if (i25 > 0) {
                                    j -= (1 << ((i15 * 7) + 6)) - 1;
                                }
                            } else {
                                i15++;
                                zzaevVar2 = zzaevVar;
                                i16 = i7;
                            }
                        }
                        i27 = i29;
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int[] iArr2 = this.zzZ;
                        int i36 = (int) j;
                        if (i25 != 0) {
                            i36 += iArr2[i25 - 1];
                        }
                        iArr2[i25] = i36;
                        i26 = i8 + i36;
                        i25++;
                        zzaevVar2 = zzaevVar;
                        i15 = i30;
                        i16 = i7;
                        i14 = i6;
                    }
                }
            }
            i4 = 2;
            i5 = 0;
            this.zzV = this.zzS + zzz((zzerVar3.zzi()[i5] << 8) | (zzerVar3.zzi()[1] & 255));
            if (zzajgVar6.zze == 1) {
                i12 = 1;
            } else if (i13 == 163) {
                i12 = (zzerVar3.zzi()[i4] & 128) == 128 ? 1 : i5;
                i13 = Opcodes.IF_ICMPGT;
            } else {
                i12 = i5;
            }
            this.zzac = i12;
            this.zzU = i4;
            this.zzX = i5;
            i3 = Opcodes.IF_ICMPGT;
        } else {
            i3 = 163;
        }
        if (i13 == i3) {
            while (true) {
                int i37 = this.zzX;
                if (i37 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                int zzu = zzu(zzaevVar, zzajgVar6, this.zzZ[i37], false);
                zzajg zzajgVar7 = zzajgVar6;
                zzs(zzajgVar7, this.zzV + ((this.zzX * zzajgVar6.zzf) / 1000), this.zzac, zzu, 0);
                this.zzX++;
                zzajgVar6 = zzajgVar7;
            }
        } else {
            while (true) {
                int i38 = this.zzX;
                if (i38 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i38] = zzu(zzaevVar, zzajgVar6, iArr3[i38], true);
                this.zzX++;
            }
        }
    }

    public zzajh(zzamd zzamdVar, int i) {
        this(new zzaja(), 0, zzamdVar);
    }

    protected final void zzk(int i, double d) throws zzat {
        if (i == 181) {
            zzq(i);
            this.zzE.zzR = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzA = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzq(i);
                this.zzE.zzE = (float) d;
                break;
            case 21970:
                zzq(i);
                this.zzE.zzF = (float) d;
                break;
            case 21971:
                zzq(i);
                this.zzE.zzG = (float) d;
                break;
            case 21972:
                zzq(i);
                this.zzE.zzH = (float) d;
                break;
            case 21973:
                zzq(i);
                this.zzE.zzI = (float) d;
                break;
            case 21974:
                zzq(i);
                this.zzE.zzJ = (float) d;
                break;
            case 21975:
                zzq(i);
                this.zzE.zzK = (float) d;
                break;
            case 21976:
                zzq(i);
                this.zzE.zzL = (float) d;
                break;
            case 21977:
                zzq(i);
                this.zzE.zzM = (float) d;
                break;
            case 21978:
                zzq(i);
                this.zzE.zzN = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzq(i);
                        this.zzE.zzt = (float) d;
                        break;
                    case 30324:
                        zzq(i);
                        this.zzE.zzu = (float) d;
                        break;
                    case 30325:
                        zzq(i);
                        this.zzE.zzv = (float) d;
                        break;
                }
        }
    }

    protected final void zzj(int i, long j) throws zzat {
        boolean z;
        if (i == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzN == -1) {
                this.zzN = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzM == -1) {
                this.zzM = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw zzat.zzb(sb.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        switch (i) {
            case Opcodes.LXOR /* 131 */:
                int i2 = (int) j;
                if (i2 == 1) {
                    zzq(i);
                    this.zzE.zze = 2;
                    return;
                }
                if (i2 == 2) {
                    zzq(i);
                    this.zzE.zze = 1;
                    return;
                } else if (i2 == 17) {
                    zzq(i);
                    this.zzE.zze = 3;
                    return;
                } else if (i2 != 33) {
                    zzq(i);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzq(i);
                    this.zzE.zze = 5;
                    return;
                }
            case Opcodes.L2I /* 136 */:
                z = j == 1;
                zzq(i);
                this.zzE.zzX = z;
                return;
            case 155:
                this.zzW = zzz(j);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                zzq(i);
                this.zzE.zzP = (int) j;
                return;
            case Opcodes.ARETURN /* 176 */:
                zzq(i);
                this.zzE.zzm = (int) j;
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                if (this.zzF) {
                    return;
                }
                zzr(i);
                this.zzK = zzz(j);
                return;
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                zzq(i);
                this.zzE.zzn = (int) j;
                return;
            case 215:
                zzq(i);
                this.zzE.zzd = (int) j;
                return;
            case 231:
                this.zzS = zzz(j);
                return;
            case 238:
                this.zzad = (int) j;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i);
                this.zzL = (int) j;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i);
                this.zzE.zzd((int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw zzat.zzb(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw zzat.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw zzat.zzb(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 21420:
                this.zzH = j + this.zzy;
                return;
            case 21432:
                int i3 = (int) j;
                zzq(i);
                if (i3 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i3 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i);
                this.zzE.zzp = (int) j;
                return;
            case 21682:
                zzq(i);
                this.zzE.zzr = (int) j;
                return;
            case 21690:
                zzq(i);
                this.zzE.zzq = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzq(i);
                this.zzE.zzW = z;
                return;
            case 21938:
                zzq(i);
                zzajg zzajgVar = this.zzE;
                zzajgVar.zzy = true;
                zzajgVar.zzo = (int) j;
                return;
            case 21998:
                zzq(i);
                this.zzE.zzg = (int) j;
                return;
            case 22186:
                zzq(i);
                this.zzE.zzS = j;
                return;
            case 22203:
                zzq(i);
                this.zzE.zzT = j;
                return;
            case 25188:
                zzq(i);
                this.zzE.zzQ = (int) j;
                return;
            case 30114:
                this.zzaf = j;
                return;
            case 30321:
                int i4 = (int) j;
                zzq(i);
                if (i4 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i4 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i4 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i);
                this.zzE.zzf = (int) j;
                return;
            case 2807729:
                this.zzz = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i5 = (int) j;
                        zzq(i);
                        if (i5 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzq(i);
                        int zzc2 = zzi.zzc((int) j);
                        if (zzc2 != -1) {
                            this.zzE.zzA = zzc2;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i);
                        this.zzE.zzy = true;
                        int zzb2 = zzi.zzb((int) j);
                        if (zzb2 != -1) {
                            this.zzE.zzz = zzb2;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i);
                        this.zzE.zzC = (int) j;
                        return;
                    case 21949:
                        zzq(i);
                        this.zzE.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03ad, code lost:
    
        if (r2.equals("V_MPEGH/ISO/HEVC") != false) goto L286;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzi(int i) throws zzat {
        int i2;
        int i3;
        SparseArray sparseArray;
        long j;
        int i4;
        List list;
        int i5;
        int i6;
        SparseArray sparseArray2;
        long zza2;
        long j2;
        long zzb2;
        long zza3;
        zzap zzg2;
        this.zzap.getClass();
        char c = '\b';
        long j3 = 0;
        int i7 = 2;
        int i8 = 0;
        if (i == 160) {
            if (this.zzU == 2) {
                zzajg zzajgVar = (zzajg) this.zzi.get(this.zzaa);
                zzajgVar.zzb();
                if (this.zzaf > 0 && "A_OPUS".equals(zzajgVar.zzc)) {
                    zzer zzerVar = this.zzv;
                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzaf).array();
                    zzerVar.zzb(array, array.length);
                }
                int i9 = 0;
                for (int i10 = 0; i10 < this.zzY; i10++) {
                    i9 += this.zzZ[i10];
                }
                int i11 = 0;
                while (i11 < this.zzY) {
                    long j4 = this.zzV + ((zzajgVar.zzf * i11) / 1000);
                    int i12 = this.zzac;
                    if (i11 == 0) {
                        if (!this.zzae) {
                            i12 |= 1;
                        }
                        i2 = 0;
                    } else {
                        i2 = i11;
                    }
                    int i13 = this.zzZ[i2];
                    int i14 = i9 - i13;
                    zzs(zzajgVar, j4, i12, i13, i14);
                    i11 = i2 + 1;
                    i9 = i14;
                }
                this.zzU = 0;
                return;
            }
            return;
        }
        int i15 = 20;
        if (i == 174) {
            zzajg zzajgVar2 = this.zzE;
            zzajgVar2.getClass();
            String str = zzajgVar2.zzc;
            if (str == null) {
                throw zzat.zzb("CodecId is missing in TrackEntry element", null);
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
                        c = '!';
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
                        c = 31;
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
                        c = ' ';
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
                case 738614379:
                    if (str.equals("S_TEXT/SSA")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 855502857:
                    break;
                case 1045209816:
                    if (str.equals("S_TEXT/WEBVTT")) {
                        c = 30;
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case ' ':
                case '!':
                    zzajgVar2.zza(zzajgVar2.zzd);
                    zzajgVar2.zzY = this.zzap.zzu(zzajgVar2.zzd, zzajgVar2.zze);
                    this.zzi.put(zzajgVar2.zzd, zzajgVar2);
                    break;
            }
            this.zzE = null;
            return;
        }
        if (i == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzK == -9223372036854775807L || (i3 = this.zzL) == -1 || this.zzM == -1) {
                return;
            }
            SparseArray sparseArray3 = this.zzI;
            List list2 = (List) sparseArray3.get(i3);
            if (list2 == null) {
                list2 = new ArrayList();
                sparseArray3.put(this.zzL, list2);
            }
            list2.add(new zzaje(this.zzK, this.zzy + this.zzM, this.zzN, null));
            return;
        }
        if (i == 19899) {
            int i16 = this.zzG;
            if (i16 != -1) {
                long j5 = this.zzH;
                if (j5 != -1) {
                    if (i16 == 475249515) {
                        this.zzQ = j5;
                        return;
                    }
                    return;
                }
            }
            throw zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            zzq(i);
            zzajg zzajgVar3 = this.zzE;
            if (zzajgVar3.zzh) {
                if (zzajgVar3.zzj == null) {
                    throw zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                zzajgVar3.zzl = new zzq(null, new zzp(zzg.zza, null, "video/webm", this.zzE.zzj.zzb));
                return;
            }
            return;
        }
        if (i == 28032) {
            zzq(i);
            zzajg zzajgVar4 = this.zzE;
            if (zzajgVar4.zzh && zzajgVar4.zzi != null) {
                throw zzat.zzb("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.zzz == -9223372036854775807L) {
                this.zzz = 1000000L;
            }
            long j6 = this.zzA;
            if (j6 != -9223372036854775807L) {
                this.zzB = zzz(j6);
                return;
            }
            return;
        }
        if (i == 374648427) {
            SparseArray sparseArray4 = this.zzi;
            if (sparseArray4.size() == 0) {
                throw zzat.zzb("No valid tracks were found", null);
            }
            boolean z = !this.zzj || this.zzQ == -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            for (int i21 = 0; i21 < sparseArray4.size(); i21++) {
                zzajg zzajgVar5 = (zzajg) sparseArray4.valueAt(i21);
                int i22 = zzajgVar5.zze;
                if (i22 == 2) {
                    if (zzajgVar5.zzX) {
                        i17 = zzajgVar5.zzd;
                    }
                    if (i18 == -1) {
                        i18 = zzajgVar5.zzd;
                    }
                } else if (i22 == 1) {
                    if (zzajgVar5.zzX) {
                        i19 = zzajgVar5.zzd;
                    }
                    if (i20 == -1) {
                        i20 = zzajgVar5.zzd;
                    }
                }
                if (z) {
                    zzajgVar5.zzb();
                    if (!zzajgVar5.zzV) {
                        zzagh zzaghVar = zzajgVar5.zzY;
                        zzv zzvVar = zzajgVar5.zzZ;
                        zzvVar.getClass();
                        zzaghVar.zzz(zzvVar);
                    }
                }
            }
            if (i17 != -1) {
                this.zzO = i17;
            } else if (i18 != -1) {
                this.zzO = i18;
            } else if (i19 != -1) {
                this.zzO = i19;
            } else if (i20 != -1) {
                this.zzO = i20;
            } else {
                this.zzO = sparseArray4.size() > 0 ? ((zzajg) sparseArray4.valueAt(0)).zzd : -1;
            }
            if (z) {
                zzB();
                return;
            }
            return;
        }
        if (i != 475249515 || this.zzF) {
            return;
        }
        int i23 = 0;
        while (true) {
            sparseArray = this.zzI;
            if (i23 >= sparseArray.size()) {
                break;
            }
            if (((List) sparseArray.valueAt(i23)).isEmpty()) {
                i23++;
            } else if (this.zzB != -9223372036854775807L) {
                for (int i24 = 0; i24 < sparseArray.size(); i24++) {
                    Collections.sort((List) sparseArray.valueAt(i24));
                }
                j = -9223372036854775807L;
                i4 = -1;
                this.zzap.zzw(new zzajf(sparseArray, this.zzB, this.zzO, this.zzy, this.zzx));
            }
        }
        j = -9223372036854775807L;
        i4 = -1;
        this.zzap.zzw(new zzafx(this.zzB, 0L));
        this.zzF = true;
        this.zzJ = false;
        int i25 = 0;
        while (true) {
            SparseArray sparseArray5 = this.zzi;
            if (i25 >= sparseArray5.size()) {
                zzB();
                return;
            }
            zzajg zzajgVar6 = (zzajg) sparseArray5.valueAt(i25);
            long j7 = this.zzB;
            long j8 = this.zzy;
            long j9 = j3;
            long j10 = this.zzx;
            if (zzajgVar6.zze != i7 || (list = (List) sparseArray.get(zzajgVar6.zzd)) == null || list.isEmpty()) {
                i6 = i25;
                sparseArray2 = sparseArray;
                i5 = i8;
            } else {
                if (list.isEmpty()) {
                    i6 = i25;
                    sparseArray2 = sparseArray;
                    i5 = i8;
                } else {
                    int min = Math.min(list.size(), i15);
                    double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    i5 = i8;
                    int i26 = i4;
                    while (i8 < min) {
                        zzaje zzajeVar = (zzaje) list.get(i8);
                        if (zzajeVar.zza() > 10000000) {
                            break;
                        }
                        int i27 = i8 + 1;
                        if (i8 < list.size() - 1) {
                            zzaje zzajeVar2 = (zzaje) list.get(i27);
                            j2 = zzajeVar2.zzb() + zzajeVar2.zzc();
                            zzb2 = zzajeVar.zzb() + zzajeVar.zzc();
                            zza3 = zzajeVar2.zza() - zzajeVar.zza();
                        } else {
                            j2 = j8 + j10;
                            zzb2 = zzajeVar.zzb() + zzajeVar.zzc();
                            zza3 = j7 - zzajeVar.zza();
                        }
                        long j11 = j2 - zzb2;
                        int i28 = i25;
                        SparseArray sparseArray6 = sparseArray;
                        long j12 = j10;
                        long j13 = zza3;
                        if (j13 > j9) {
                            double d2 = j11 / j13;
                            if (d2 > d) {
                                d = d2;
                                i26 = i8;
                            }
                        }
                        i8 = i27;
                        sparseArray = sparseArray6;
                        i25 = i28;
                        j10 = j12;
                    }
                    i6 = i25;
                    sparseArray2 = sparseArray;
                    if (i26 != i4) {
                        zza2 = ((zzaje) list.get(i26)).zza();
                        if (zza2 != j) {
                            zzv zzvVar2 = zzajgVar6.zzZ;
                            zzvVar2.getClass();
                            zzap zzapVar = zzvVar2.zzl;
                            zzahx zzahxVar = new zzahx(zza2);
                            if (zzapVar == null) {
                                zzao[] zzaoVarArr = new zzao[1];
                                zzaoVarArr[i5] = zzahxVar;
                                zzg2 = new zzap(j, zzaoVarArr);
                            } else {
                                zzao[] zzaoVarArr2 = new zzao[1];
                                zzaoVarArr2[i5] = zzahxVar;
                                zzg2 = zzapVar.zzg(zzaoVarArr2);
                            }
                            zzt zza4 = zzajgVar6.zzZ.zza();
                            zza4.zzk(zzg2);
                            zzajgVar6.zzZ = zza4.zzM();
                        }
                    }
                }
                zza2 = j;
                if (zza2 != j) {
                }
            }
            if (!zzajgVar6.zzV) {
                zzajgVar6.zzb();
                zzagh zzaghVar2 = zzajgVar6.zzY;
                zzv zzvVar3 = zzajgVar6.zzZ;
                zzvVar3.getClass();
                zzaghVar2.zzz(zzvVar3);
            }
            i25 = i6 + 1;
            sparseArray = sparseArray2;
            j3 = j9;
            i8 = i5;
            i7 = 2;
            i15 = 20;
            j = -9223372036854775807L;
            i4 = -1;
        }
    }
}
