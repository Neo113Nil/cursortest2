package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzbcy<T> implements zzbdm<T> {
    private static final Unsafe zzdwf = zzbek.zzagh();
    private final int[] zzdwg;
    private final Object[] zzdwh;
    private final int zzdwi;
    private final int zzdwj;
    private final int zzdwk;
    private final zzbcu zzdwl;
    private final boolean zzdwm;
    private final boolean zzdwn;
    private final boolean zzdwo;
    private final boolean zzdwp;
    private final int[] zzdwq;
    private final int[] zzdwr;
    private final int[] zzdws;
    private final zzbdc zzdwt;
    private final zzbce zzdwu;
    private final zzbee<?, ?> zzdwv;
    private final zzbbd<?> zzdww;
    private final zzbcp zzdwx;

    private zzbcy(int[] iArr, Object[] objArr, int i, int i2, int i3, zzbcu zzbcuVar, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, zzbdc zzbdcVar, zzbce zzbceVar, zzbee<?, ?> zzbeeVar, zzbbd<?> zzbbdVar, zzbcp zzbcpVar) {
        this.zzdwg = iArr;
        this.zzdwh = objArr;
        this.zzdwi = i;
        this.zzdwj = i2;
        this.zzdwk = i3;
        this.zzdwn = zzbcuVar instanceof zzbbo;
        this.zzdwo = z;
        this.zzdwm = zzbbdVar != null && zzbbdVar.zzh(zzbcuVar);
        this.zzdwp = false;
        this.zzdwq = iArr2;
        this.zzdwr = iArr3;
        this.zzdws = iArr4;
        this.zzdwt = zzbdcVar;
        this.zzdwu = zzbceVar;
        this.zzdwv = zzbeeVar;
        this.zzdww = zzbbdVar;
        this.zzdwl = zzbcuVar;
        this.zzdwx = zzbcpVar;
    }

    private static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzbae zzbaeVar) throws IOException {
        return zzbad.zza(i, bArr, i2, i3, zzz(obj), zzbaeVar);
    }

    private static int zza(zzbdm<?> zzbdmVar, int i, byte[] bArr, int i2, int i3, zzbbt<?> zzbbtVar, zzbae zzbaeVar) throws IOException {
        int zza = zza((zzbdm) zzbdmVar, bArr, i2, i3, zzbaeVar);
        while (true) {
            zzbbtVar.add(zzbaeVar.zzdpn);
            if (zza >= i3) {
                break;
            }
            int zza2 = zzbad.zza(bArr, zza, zzbaeVar);
            if (i != zzbaeVar.zzdpl) {
                break;
            }
            zza = zza((zzbdm) zzbdmVar, bArr, zza2, i3, zzbaeVar);
        }
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzbdm zzbdmVar, byte[] bArr, int i, int i2, int i3, zzbae zzbaeVar) throws IOException {
        zzbcy zzbcyVar = (zzbcy) zzbdmVar;
        Object newInstance = zzbcyVar.newInstance();
        int zza = zzbcyVar.zza((zzbcy) newInstance, bArr, i, i2, i3, zzbaeVar);
        zzbcyVar.zzo(newInstance);
        zzbaeVar.zzdpn = newInstance;
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzbdm zzbdmVar, byte[] bArr, int i, int i2, zzbae zzbaeVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzbad.zza(i4, bArr, i3, zzbaeVar);
            i4 = zzbaeVar.zzdpl;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzbbu.zzadl();
        }
        Object newInstance = zzbdmVar.newInstance();
        int i6 = i4 + i5;
        zzbdmVar.zza(newInstance, bArr, i5, i6, zzbaeVar);
        zzbdmVar.zzo(newInstance);
        zzbaeVar.zzdpn = newInstance;
        return i6;
    }

    private static <UT, UB> int zza(zzbee<UT, UB> zzbeeVar, T t) {
        return zzbeeVar.zzy(zzbeeVar.zzac(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzbae zzbaeVar) throws IOException {
        Object valueOf;
        Object valueOf2;
        int zzb;
        long j2;
        int i9;
        Object valueOf3;
        int i10;
        Unsafe unsafe = zzdwf;
        long j3 = this.zzdwg[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    valueOf = Double.valueOf(zzbad.zzg(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    zzb = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(zzbad.zzh(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    zzb = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb = zzbad.zzb(bArr, i, zzbaeVar);
                    j2 = zzbaeVar.zzdpm;
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb = zzbad.zza(bArr, i, zzbaeVar);
                    i9 = zzbaeVar.zzdpl;
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    valueOf = Long.valueOf(zzbad.zzf(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    zzb = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    valueOf2 = Integer.valueOf(zzbad.zze(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    zzb = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = zzbad.zzb(bArr, i, zzbaeVar);
                    valueOf3 = Boolean.valueOf(zzbaeVar.zzdpm != 0);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    zzb = zzbad.zza(bArr, i, zzbaeVar);
                    i10 = zzbaeVar.zzdpl;
                    if (i10 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t, j, valueOf3);
                        unsafe.putInt(t, j3, i4);
                        return zzb;
                    }
                    if ((i6 & 536870912) != 0 && !zzbem.zzf(bArr, zzb, zzb + i10)) {
                        throw zzbbu.zzads();
                    }
                    unsafe.putObject(t, j, new String(bArr, zzb, i10, zzbbq.UTF_8));
                    zzb += i10;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    zzb = zza(zzcq(i8), bArr, i, i2, zzbaeVar);
                    Object object = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = object == null ? zzbaeVar.zzdpn : zzbbq.zza(object, zzbaeVar.zzdpn);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb = zzbad.zza(bArr, i, zzbaeVar);
                    i10 = zzbaeVar.zzdpl;
                    if (i10 == 0) {
                        valueOf3 = zzbah.zzdpq;
                        unsafe.putObject(t, j, valueOf3);
                        unsafe.putInt(t, j3, i4);
                        return zzb;
                    }
                    unsafe.putObject(t, j, zzbah.zzc(bArr, zzb, i10));
                    zzb += i10;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza = zzbad.zza(bArr, i, zzbaeVar);
                    int i11 = zzbaeVar.zzdpl;
                    zzbbs<?> zzcs = zzcs(i8);
                    if (zzcs != null && zzcs.zzq(i11) == null) {
                        zzz(t).zzb(i3, Long.valueOf(i11));
                        return zza;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i11));
                    zzb = zza;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb = zzbad.zza(bArr, i, zzbaeVar);
                    i9 = zzbaq.zzbu(zzbaeVar.zzdpl);
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb = zzbad.zzb(bArr, i, zzbaeVar);
                    j2 = zzbaq.zzl(zzbaeVar.zzdpm);
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = zza(zzcq(i8), bArr, i, i2, (i3 & (-8)) | 4, zzbaeVar);
                    Object object2 = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = object2 == null ? zzbaeVar.zzdpn : zzbbq.zza(object2, zzbaeVar.zzdpn);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x022e, code lost:
    
        if (r30.zzdpm != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0230, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0233, code lost:
    
        r11.addBoolean(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0236, code lost:
    
        if (r4 >= r20) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0238, code lost:
    
        r6 = com.google.android.gms.internal.ads.zzbad.zza(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x023e, code lost:
    
        if (r21 != r30.zzdpl) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0240, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzbad.zzb(r18, r6, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0248, code lost:
    
        if (r30.zzdpm == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0232, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0233, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0130, code lost:
    
        if (r4 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0132, code lost:
    
        r11.add(com.google.android.gms.internal.ads.zzbah.zzdpq);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0140, code lost:
    
        if (r1 >= r20) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0142, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzbad.zza(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0148, code lost:
    
        if (r21 != r30.zzdpl) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014a, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzbad.zza(r18, r4, r30);
        r4 = r30.zzdpl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0150, code lost:
    
        if (r4 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0138, code lost:
    
        r11.add(com.google.android.gms.internal.ads.zzbah.zzc(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0140, code lost:
    
        r11.add(com.google.android.gms.internal.ads.zzbah.zzc(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0248 -> B:117:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0150 -> B:60:0x0132). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01a1 -> B:74:0x0180). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01dd -> B:85:0x01b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzbae zzbaeVar) throws IOException {
        int zzb;
        int zza;
        int zza2;
        int zzb2;
        int i8 = i;
        zzbbt zzbbtVar = (zzbbt) zzdwf.getObject(t, j2);
        if (!zzbbtVar.zzaay()) {
            int size = zzbbtVar.size();
            zzbbtVar = zzbbtVar.zzbm(size == 0 ? 10 : size << 1);
            zzdwf.putObject(t, j2, zzbbtVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzbay zzbayVar = (zzbay) zzbbtVar;
                    int zza3 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i9 = zzbaeVar.zzdpl + zza3;
                    while (zza3 < i9) {
                        zzbayVar.zzd(zzbad.zzg(bArr, zza3));
                        zza3 += 8;
                    }
                    if (zza3 == i9) {
                        return zza3;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 1) {
                    zzbay zzbayVar2 = (zzbay) zzbbtVar;
                    zzbayVar2.zzd(zzbad.zzg(bArr, i));
                    while (true) {
                        int i10 = i8 + 8;
                        if (i10 >= i2) {
                            return i10;
                        }
                        i8 = zzbad.zza(bArr, i10, zzbaeVar);
                        if (i3 != zzbaeVar.zzdpl) {
                            return i10;
                        }
                        zzbayVar2.zzd(zzbad.zzg(bArr, i8));
                    }
                }
                return i8;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzbbm zzbbmVar = (zzbbm) zzbbtVar;
                    int zza4 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i11 = zzbaeVar.zzdpl + zza4;
                    while (zza4 < i11) {
                        zzbbmVar.zzd(zzbad.zzh(bArr, zza4));
                        zza4 += 4;
                    }
                    if (zza4 == i11) {
                        return zza4;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 5) {
                    zzbbm zzbbmVar2 = (zzbbm) zzbbtVar;
                    zzbbmVar2.zzd(zzbad.zzh(bArr, i));
                    while (true) {
                        int i12 = i8 + 4;
                        if (i12 >= i2) {
                            return i12;
                        }
                        i8 = zzbad.zza(bArr, i12, zzbaeVar);
                        if (i3 != zzbaeVar.zzdpl) {
                            return i12;
                        }
                        zzbbmVar2.zzd(zzbad.zzh(bArr, i8));
                    }
                }
                return i8;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzbci zzbciVar = (zzbci) zzbbtVar;
                    int zza5 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i13 = zzbaeVar.zzdpl + zza5;
                    while (zza5 < i13) {
                        zza5 = zzbad.zzb(bArr, zza5, zzbaeVar);
                        zzbciVar.zzw(zzbaeVar.zzdpm);
                    }
                    if (zza5 == i13) {
                        return zza5;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 0) {
                    zzbci zzbciVar2 = (zzbci) zzbbtVar;
                    do {
                        zzb = zzbad.zzb(bArr, i8, zzbaeVar);
                        zzbciVar2.zzw(zzbaeVar.zzdpm);
                        if (zzb >= i2) {
                            return zzb;
                        }
                        i8 = zzbad.zza(bArr, zzb, zzbaeVar);
                    } while (i3 == zzbaeVar.zzdpl);
                    return zzb;
                }
                return i8;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzbad.zza(bArr, i8, (zzbbt<?>) zzbbtVar, zzbaeVar);
                }
                if (i5 == 0) {
                    return zzbad.zza(i3, bArr, i, i2, (zzbbt<?>) zzbbtVar, zzbaeVar);
                }
                return i8;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzbci zzbciVar3 = (zzbci) zzbbtVar;
                    int zza6 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i14 = zzbaeVar.zzdpl + zza6;
                    while (zza6 < i14) {
                        zzbciVar3.zzw(zzbad.zzf(bArr, zza6));
                        zza6 += 8;
                    }
                    if (zza6 == i14) {
                        return zza6;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 1) {
                    zzbci zzbciVar4 = (zzbci) zzbbtVar;
                    zzbciVar4.zzw(zzbad.zzf(bArr, i));
                    while (true) {
                        int i15 = i8 + 8;
                        if (i15 >= i2) {
                            return i15;
                        }
                        i8 = zzbad.zza(bArr, i15, zzbaeVar);
                        if (i3 != zzbaeVar.zzdpl) {
                            return i15;
                        }
                        zzbciVar4.zzw(zzbad.zzf(bArr, i8));
                    }
                }
                return i8;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzbbp zzbbpVar = (zzbbp) zzbbtVar;
                    int zza7 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i16 = zzbaeVar.zzdpl + zza7;
                    while (zza7 < i16) {
                        zzbbpVar.zzco(zzbad.zze(bArr, zza7));
                        zza7 += 4;
                    }
                    if (zza7 == i16) {
                        return zza7;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 5) {
                    zzbbp zzbbpVar2 = (zzbbp) zzbbtVar;
                    zzbbpVar2.zzco(zzbad.zze(bArr, i));
                    while (true) {
                        int i17 = i8 + 4;
                        if (i17 >= i2) {
                            return i17;
                        }
                        i8 = zzbad.zza(bArr, i17, zzbaeVar);
                        if (i3 != zzbaeVar.zzdpl) {
                            return i17;
                        }
                        zzbbpVar2.zzco(zzbad.zze(bArr, i8));
                    }
                }
                return i8;
            case 25:
            case 42:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzbaf zzbafVar = (zzbaf) zzbbtVar;
                        i8 = zzbad.zzb(bArr, i8, zzbaeVar);
                        break;
                    }
                    return i8;
                }
                zzbaf zzbafVar2 = (zzbaf) zzbbtVar;
                zza = zzbad.zza(bArr, i8, zzbaeVar);
                int i18 = zzbaeVar.zzdpl + zza;
                while (zza < i18) {
                    zza = zzbad.zzb(bArr, zza, zzbaeVar);
                    zzbafVar2.addBoolean(zzbaeVar.zzdpm != 0);
                }
                if (zza != i18) {
                    throw zzbbu.zzadl();
                }
                return zza;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int zza8 = zzbad.zza(bArr, i8, zzbaeVar);
                        int i19 = zzbaeVar.zzdpl;
                        if (i19 != 0) {
                            zzbbtVar.add(new String(bArr, zza8, i19, zzbbq.UTF_8));
                            zza8 += i19;
                            while (zza8 < i2) {
                                int zza9 = zzbad.zza(bArr, zza8, zzbaeVar);
                                if (i3 != zzbaeVar.zzdpl) {
                                    return zza8;
                                }
                                zza8 = zzbad.zza(bArr, zza9, zzbaeVar);
                                int i20 = zzbaeVar.zzdpl;
                                if (i20 != 0) {
                                    zzbbtVar.add(new String(bArr, zza8, i20, zzbbq.UTF_8));
                                    zza8 += i20;
                                }
                            }
                            return zza8;
                        }
                        zzbbtVar.add("");
                        while (zza8 < i2) {
                        }
                        return zza8;
                    }
                    int zza10 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i21 = zzbaeVar.zzdpl;
                    if (i21 != 0) {
                        int i22 = zza10 + i21;
                        if (!zzbem.zzf(bArr, zza10, i22)) {
                            throw zzbbu.zzads();
                        }
                        zzbbtVar.add(new String(bArr, zza10, i21, zzbbq.UTF_8));
                        zza10 = i22;
                        while (zza10 < i2) {
                            int zza11 = zzbad.zza(bArr, zza10, zzbaeVar);
                            if (i3 != zzbaeVar.zzdpl) {
                                return zza10;
                            }
                            zza10 = zzbad.zza(bArr, zza11, zzbaeVar);
                            int i23 = zzbaeVar.zzdpl;
                            if (i23 != 0) {
                                int i24 = zza10 + i23;
                                if (!zzbem.zzf(bArr, zza10, i24)) {
                                    throw zzbbu.zzads();
                                }
                                zzbbtVar.add(new String(bArr, zza10, i23, zzbbq.UTF_8));
                                zza10 = i24;
                            }
                        }
                        return zza10;
                    }
                    zzbbtVar.add("");
                    while (zza10 < i2) {
                    }
                    return zza10;
                }
                return i8;
            case 27:
                if (i5 == 2) {
                    return zza((zzbdm<?>) zzcq(i6), i3, bArr, i, i2, (zzbbt<?>) zzbbtVar, zzbaeVar);
                }
                return i8;
            case 28:
                if (i5 == 2) {
                    int zza12 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i25 = zzbaeVar.zzdpl;
                    break;
                }
                return i8;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zza = zzbad.zza(i3, bArr, i, i2, (zzbbt<?>) zzbbtVar, zzbaeVar);
                    }
                    return i8;
                }
                zza = zzbad.zza(bArr, i8, (zzbbt<?>) zzbbtVar, zzbaeVar);
                zzbbo zzbboVar = (zzbbo) t;
                zzbef zzbefVar = zzbboVar.zzdtt;
                if (zzbefVar == zzbef.zzagc()) {
                    zzbefVar = null;
                }
                zzbef zzbefVar2 = (zzbef) zzbdo.zza(i4, zzbbtVar, zzcs(i6), zzbefVar, this.zzdwv);
                if (zzbefVar2 != null) {
                    zzbboVar.zzdtt = zzbefVar2;
                }
                return zza;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzbbp zzbbpVar3 = (zzbbp) zzbbtVar;
                    int zza13 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i26 = zzbaeVar.zzdpl + zza13;
                    while (zza13 < i26) {
                        zza13 = zzbad.zza(bArr, zza13, zzbaeVar);
                        zzbbpVar3.zzco(zzbaq.zzbu(zzbaeVar.zzdpl));
                    }
                    if (zza13 == i26) {
                        return zza13;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 0) {
                    zzbbp zzbbpVar4 = (zzbbp) zzbbtVar;
                    do {
                        zza2 = zzbad.zza(bArr, i8, zzbaeVar);
                        zzbbpVar4.zzco(zzbaq.zzbu(zzbaeVar.zzdpl));
                        if (zza2 >= i2) {
                            return zza2;
                        }
                        i8 = zzbad.zza(bArr, zza2, zzbaeVar);
                    } while (i3 == zzbaeVar.zzdpl);
                    return zza2;
                }
                return i8;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzbci zzbciVar5 = (zzbci) zzbbtVar;
                    int zza14 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i27 = zzbaeVar.zzdpl + zza14;
                    while (zza14 < i27) {
                        zza14 = zzbad.zzb(bArr, zza14, zzbaeVar);
                        zzbciVar5.zzw(zzbaq.zzl(zzbaeVar.zzdpm));
                    }
                    if (zza14 == i27) {
                        return zza14;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 0) {
                    zzbci zzbciVar6 = (zzbci) zzbbtVar;
                    do {
                        zzb2 = zzbad.zzb(bArr, i8, zzbaeVar);
                        zzbciVar6.zzw(zzbaq.zzl(zzbaeVar.zzdpm));
                        if (zzb2 >= i2) {
                            return zzb2;
                        }
                        i8 = zzbad.zza(bArr, zzb2, zzbaeVar);
                    } while (i3 == zzbaeVar.zzdpl);
                    return zzb2;
                }
                return i8;
            case 49:
                if (i5 == 3) {
                    zzbdm zzcq = zzcq(i6);
                    int i28 = (i3 & (-8)) | 4;
                    zzbdm zzbdmVar = zzcq;
                    byte[] bArr2 = bArr;
                    int i29 = i;
                    while (true) {
                        i8 = zza(zzbdmVar, bArr2, i29, i2, i28, zzbaeVar);
                        zzbbtVar.add(zzbaeVar.zzdpn);
                        if (i8 < i2) {
                            int zza15 = zzbad.zza(bArr, i8, zzbaeVar);
                            if (i3 == zzbaeVar.zzdpl) {
                                zzbdmVar = zzcq;
                                bArr2 = bArr;
                                i29 = zza15;
                            }
                        }
                    }
                }
                return i8;
            default:
                return i8;
        }
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, long j, zzbae zzbaeVar) throws IOException {
        Unsafe unsafe = zzdwf;
        Object zzcr = zzcr(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzdwx.zzu(object)) {
            Object zzw = this.zzdwx.zzw(zzcr);
            this.zzdwx.zzb(zzw, object);
            unsafe.putObject(t, j, zzw);
            object = zzw;
        }
        zzbcn<?, ?> zzx = this.zzdwx.zzx(zzcr);
        Map<?, ?> zzs = this.zzdwx.zzs(object);
        int zza = zzbad.zza(bArr, i, zzbaeVar);
        int i5 = zzbaeVar.zzdpl;
        if (i5 < 0 || i5 > i2 - zza) {
            throw zzbbu.zzadl();
        }
        int i6 = i5 + zza;
        K k = zzx.zzdvz;
        V v = zzx.zzdwb;
        while (zza < i6) {
            int i7 = zza + 1;
            int i8 = bArr[zza];
            if (i8 < 0) {
                i7 = zzbad.zza(i8, bArr, i7, zzbaeVar);
                i8 = zzbaeVar.zzdpl;
            }
            int i9 = i7;
            int i10 = i8 & 7;
            switch (i8 >>> 3) {
                case 1:
                    if (i10 != zzx.zzdvy.zzagm()) {
                        zza = zzbad.zza(i8, bArr, i9, i2, zzbaeVar);
                        break;
                    } else {
                        zza = zza(bArr, i9, i2, zzx.zzdvy, (Class<?>) null, zzbaeVar);
                        k = (K) zzbaeVar.zzdpn;
                        break;
                    }
                case 2:
                    if (i10 != zzx.zzdwa.zzagm()) {
                        zza = zzbad.zza(i8, bArr, i9, i2, zzbaeVar);
                        break;
                    } else {
                        zza = zza(bArr, i9, i2, zzx.zzdwa, zzx.zzdwb.getClass(), zzbaeVar);
                        v = zzbaeVar.zzdpn;
                        break;
                    }
                default:
                    zza = zzbad.zza(i8, bArr, i9, i2, zzbaeVar);
                    break;
            }
        }
        if (zza != i6) {
            throw zzbbu.zzadr();
        }
        zzs.put(k, v);
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x02ff, code lost:
    
        if (r0 == r5) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0301, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0304, code lost:
    
        r12 = r33;
        r9 = r37;
        r6 = r17;
        r7 = r24;
        r10 = r29;
        r1 = r30;
        r8 = -1;
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0346, code lost:
    
        if (r0 == r15) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0363, code lost:
    
        if (r0 == r15) goto L119;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0074. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0376 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, zzbae zzbaeVar) throws IOException {
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        T t2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int zze;
        int i15;
        int i16;
        long j;
        Object obj;
        zzbcy<T> zzbcyVar = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i17 = i2;
        int i18 = i3;
        zzbae zzbaeVar2 = zzbaeVar;
        Unsafe unsafe2 = zzdwf;
        int i19 = -1;
        int i20 = i;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        while (true) {
            if (i20 < i17) {
                int i24 = i20 + 1;
                byte b2 = bArr2[i20];
                if (b2 < 0) {
                    i10 = zzbad.zza(b2, bArr2, i24, zzbaeVar2);
                    i9 = zzbaeVar2.zzdpl;
                } else {
                    i9 = b2;
                    i10 = i24;
                }
                int i25 = i9 >>> 3;
                int i26 = i9 & 7;
                int zzcw = zzbcyVar.zzcw(i25);
                if (zzcw != i19) {
                    int i27 = zzbcyVar.zzdwg[zzcw + 1];
                    int i28 = (i27 & 267386880) >>> 20;
                    int i29 = i9;
                    long j2 = i27 & 1048575;
                    if (i28 <= 17) {
                        int i30 = zzbcyVar.zzdwg[zzcw + 2];
                        int i31 = 1 << (i30 >>> 20);
                        int i32 = i30 & 1048575;
                        if (i32 != i23) {
                            if (i23 != -1) {
                                i13 = zzcw;
                                unsafe2.putInt(t3, i23, i22);
                            } else {
                                i13 = zzcw;
                            }
                            i22 = unsafe2.getInt(t3, i32);
                            i23 = i32;
                        } else {
                            i13 = zzcw;
                        }
                        switch (i28) {
                            case 0:
                                i15 = i10;
                                i5 = i23;
                                i16 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 == 1) {
                                    zzbek.zza(t3, j2, zzbad.zzg(bArr2, i15));
                                    i20 = i15 + 8;
                                    i22 |= i31;
                                    i23 = i5;
                                    i21 = i16;
                                    break;
                                } else {
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6 && i6 != 0) {
                                        break;
                                    } else {
                                        i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                        bArr2 = bArr;
                                        zzbaeVar2 = zzbaeVar;
                                        i18 = i6;
                                        i21 = i8;
                                        i22 = i4;
                                        i23 = i5;
                                        unsafe2 = unsafe;
                                        i19 = -1;
                                        i17 = i2;
                                        t3 = t;
                                        zzbcyVar = this;
                                    }
                                }
                            case 1:
                                i15 = i10;
                                i5 = i23;
                                i16 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 == 5) {
                                    zzbek.zza((Object) t3, j2, zzbad.zzh(bArr2, i15));
                                    i20 = i15 + 4;
                                    i22 |= i31;
                                    i23 = i5;
                                    i21 = i16;
                                    break;
                                } else {
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 2:
                            case 3:
                                i15 = i10;
                                i5 = i23;
                                i16 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 == 0) {
                                    int zzb = zzbad.zzb(bArr2, i15, zzbaeVar2);
                                    unsafe2.putLong(t, j2, zzbaeVar2.zzdpm);
                                    i22 |= i31;
                                    i20 = zzb;
                                    i23 = i5;
                                    i21 = i16;
                                    break;
                                } else {
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 4:
                            case 11:
                                i15 = i10;
                                i5 = i23;
                                i16 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 == 0) {
                                    i20 = zzbad.zza(bArr2, i15, zzbaeVar2);
                                    unsafe2.putInt(t3, j2, zzbaeVar2.zzdpl);
                                    i22 |= i31;
                                    i23 = i5;
                                    i21 = i16;
                                    break;
                                } else {
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 5:
                            case 14:
                                i5 = i23;
                                i16 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 == 1) {
                                    unsafe2.putLong(t, j2, zzbad.zzf(bArr2, i10));
                                    i20 = i10 + 8;
                                    i22 |= i31;
                                    i23 = i5;
                                    i21 = i16;
                                    break;
                                } else {
                                    i15 = i10;
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 6:
                            case 13:
                                i5 = i23;
                                i16 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 == 5) {
                                    unsafe2.putInt(t3, j2, zzbad.zze(bArr2, i10));
                                    i20 = i10 + 4;
                                    i22 |= i31;
                                    i23 = i5;
                                    i21 = i16;
                                    break;
                                } else {
                                    i15 = i10;
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 7:
                                i5 = i23;
                                i16 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 == 0) {
                                    i20 = zzbad.zzb(bArr2, i10, zzbaeVar2);
                                    zzbek.zza(t3, j2, zzbaeVar2.zzdpm != 0);
                                    i22 |= i31;
                                    i23 = i5;
                                    i21 = i16;
                                    break;
                                } else {
                                    i15 = i10;
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 8:
                                i5 = i23;
                                j = j2;
                                i16 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 == 2) {
                                    i20 = (i27 & 536870912) == 0 ? zzbad.zzc(bArr2, i10, zzbaeVar2) : zzbad.zzd(bArr2, i10, zzbaeVar2);
                                    obj = zzbaeVar2.zzdpn;
                                    unsafe2.putObject(t3, j, obj);
                                    i22 |= i31;
                                    i23 = i5;
                                    i21 = i16;
                                    break;
                                } else {
                                    i15 = i10;
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 9:
                                i5 = i23;
                                j = j2;
                                i16 = i29;
                                int i33 = i13;
                                bArr2 = bArr;
                                if (i26 == 2) {
                                    i17 = i2;
                                    i20 = zza(zzbcyVar.zzcq(i33), bArr2, i10, i17, zzbaeVar2);
                                    obj = (i22 & i31) == 0 ? zzbaeVar2.zzdpn : zzbbq.zza(unsafe2.getObject(t3, j), zzbaeVar2.zzdpn);
                                    unsafe2.putObject(t3, j, obj);
                                    i22 |= i31;
                                    i23 = i5;
                                    i21 = i16;
                                    break;
                                } else {
                                    i15 = i10;
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 10:
                                i14 = i29;
                                bArr2 = bArr;
                                if (i26 == 2) {
                                    zze = zzbad.zze(bArr2, i10, zzbaeVar2);
                                    unsafe2.putObject(t3, j2, zzbaeVar2.zzdpn);
                                    i22 |= i31;
                                    i20 = zze;
                                    i21 = i14;
                                    i19 = -1;
                                    i18 = i3;
                                    i17 = i2;
                                } else {
                                    i15 = i10;
                                    i5 = i23;
                                    i16 = i14;
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 12:
                                i14 = i29;
                                int i34 = i13;
                                bArr2 = bArr;
                                if (i26 == 0) {
                                    i20 = zzbad.zza(bArr2, i10, zzbaeVar2);
                                    int i35 = zzbaeVar2.zzdpl;
                                    zzbbs<?> zzcs = zzbcyVar.zzcs(i34);
                                    if (zzcs == null || zzcs.zzq(i35) != null) {
                                        t3 = t;
                                        unsafe2.putInt(t3, j2, i35);
                                        i22 |= i31;
                                        i21 = i14;
                                        i19 = -1;
                                        i18 = i3;
                                        i17 = i2;
                                    } else {
                                        zzz(t).zzb(i14, Long.valueOf(i35));
                                        i21 = i14;
                                        i19 = -1;
                                        i18 = i3;
                                        i17 = i2;
                                        t3 = t;
                                    }
                                } else {
                                    i15 = i10;
                                    i5 = i23;
                                    i16 = i14;
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 15:
                                i14 = i29;
                                bArr2 = bArr;
                                if (i26 == 0) {
                                    zze = zzbad.zza(bArr2, i10, zzbaeVar2);
                                    unsafe2.putInt(t3, j2, zzbaq.zzbu(zzbaeVar2.zzdpl));
                                    i22 |= i31;
                                    i20 = zze;
                                    i21 = i14;
                                    i19 = -1;
                                    i18 = i3;
                                    i17 = i2;
                                } else {
                                    i15 = i10;
                                    i5 = i23;
                                    i16 = i14;
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 16:
                                i14 = i29;
                                if (i26 == 0) {
                                    bArr2 = bArr;
                                    int zzb2 = zzbad.zzb(bArr2, i10, zzbaeVar2);
                                    unsafe2.putLong(t, j2, zzbaq.zzl(zzbaeVar2.zzdpm));
                                    i22 |= i31;
                                    i21 = i14;
                                    i20 = zzb2;
                                    i19 = -1;
                                    i18 = i3;
                                    i17 = i2;
                                } else {
                                    i15 = i10;
                                    i5 = i23;
                                    i16 = i14;
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            case 17:
                                if (i26 == 3) {
                                    i20 = zza(zzbcyVar.zzcq(i13), bArr, i10, i2, (i25 << 3) | 4, zzbaeVar);
                                    unsafe2.putObject(t3, j2, (i22 & i31) == 0 ? zzbaeVar2.zzdpn : zzbbq.zza(unsafe2.getObject(t3, j2), zzbaeVar2.zzdpn));
                                    i22 |= i31;
                                    i21 = i29;
                                    i19 = -1;
                                    i18 = i3;
                                    bArr2 = bArr;
                                    i17 = i2;
                                } else {
                                    i15 = i10;
                                    i5 = i23;
                                    i16 = i29;
                                    i7 = i15;
                                    i4 = i22;
                                    unsafe = unsafe2;
                                    i8 = i16;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                }
                                break;
                            default:
                                i15 = i10;
                                i5 = i23;
                                i16 = i29;
                                i7 = i15;
                                i4 = i22;
                                unsafe = unsafe2;
                                i8 = i16;
                                i6 = i3;
                                if (i8 != i6) {
                                }
                                i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                bArr2 = bArr;
                                zzbaeVar2 = zzbaeVar;
                                i18 = i6;
                                i21 = i8;
                                i22 = i4;
                                i23 = i5;
                                unsafe2 = unsafe;
                                i19 = -1;
                                i17 = i2;
                                t3 = t;
                                zzbcyVar = this;
                                break;
                        }
                    } else {
                        int i36 = i10;
                        i5 = i23;
                        bArr2 = bArr;
                        if (i28 != 27) {
                            i4 = i22;
                            if (i28 <= 49) {
                                unsafe = unsafe2;
                                i12 = i29;
                                i20 = zza((zzbcy<T>) t, bArr, i36, i2, i29, i25, i26, zzcw, i27, i28, j2, zzbaeVar);
                            } else {
                                i11 = i36;
                                unsafe = unsafe2;
                                i12 = i29;
                                if (i28 == 50) {
                                    if (i26 == 2) {
                                        i20 = zza(t, bArr, i11, i2, zzcw, i25, j2, zzbaeVar);
                                    }
                                    i7 = i11;
                                    i8 = i12;
                                    i6 = i3;
                                    if (i8 != i6) {
                                    }
                                    i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                                    bArr2 = bArr;
                                    zzbaeVar2 = zzbaeVar;
                                    i18 = i6;
                                    i21 = i8;
                                    i22 = i4;
                                    i23 = i5;
                                    unsafe2 = unsafe;
                                    i19 = -1;
                                    i17 = i2;
                                    t3 = t;
                                    zzbcyVar = this;
                                } else {
                                    i20 = zza((zzbcy<T>) t, bArr, i11, i2, i12, i25, i26, i27, i28, j2, zzcw, zzbaeVar);
                                }
                            }
                        } else if (i26 == 2) {
                            zzbbt zzbbtVar = (zzbbt) unsafe2.getObject(t3, j2);
                            if (!zzbbtVar.zzaay()) {
                                int size = zzbbtVar.size();
                                zzbbtVar = zzbbtVar.zzbm(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t3, j2, zzbbtVar);
                            }
                            i20 = zza((zzbdm<?>) zzbcyVar.zzcq(zzcw), i29, bArr, i36, i2, (zzbbt<?>) zzbbtVar, zzbaeVar);
                            i21 = i29;
                            i22 = i22;
                            i23 = i5;
                        } else {
                            i4 = i22;
                            i12 = i29;
                            i11 = i36;
                        }
                    }
                    i19 = -1;
                    i18 = i3;
                } else {
                    i11 = i10;
                    i12 = i9;
                    i4 = i22;
                    i5 = i23;
                }
                unsafe = unsafe2;
                i7 = i11;
                i8 = i12;
                i6 = i3;
                if (i8 != i6) {
                }
                i20 = zza(i8, bArr, i7, i2, t, zzbaeVar);
                bArr2 = bArr;
                zzbaeVar2 = zzbaeVar;
                i18 = i6;
                i21 = i8;
                i22 = i4;
                i23 = i5;
                unsafe2 = unsafe;
                i19 = -1;
                i17 = i2;
                t3 = t;
                zzbcyVar = this;
            } else {
                i4 = i22;
                i5 = i23;
                unsafe = unsafe2;
                i6 = i18;
                i7 = i20;
                i8 = i21;
            }
        }
        int i37 = i4;
        int i38 = i5;
        if (i38 != -1) {
            long j3 = i38;
            t2 = t;
            unsafe.putInt(t2, j3, i37);
        } else {
            t2 = t;
        }
        if (this.zzdwr != null) {
            zzbef zzbefVar = null;
            for (int i39 : this.zzdwr) {
                zzbefVar = (zzbef) zza((Object) t2, i39, (int) zzbefVar, (zzbee<UT, int>) this.zzdwv);
            }
            if (zzbefVar != null) {
                this.zzdwv.zzf(t2, zzbefVar);
            }
        }
        if (i6 == 0) {
            if (i7 != i2) {
                throw zzbbu.zzadr();
            }
        } else if (i7 > i2 || i8 != i6) {
            throw zzbbu.zzadr();
        }
        return i7;
    }

    private static int zza(byte[] bArr, int i, int i2, zzbes zzbesVar, Class<?> cls, zzbae zzbaeVar) throws IOException {
        int zzb;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int i3;
        long j;
        switch (zzbcz.zzdql[zzbesVar.ordinal()]) {
            case 1:
                zzb = zzbad.zzb(bArr, i, zzbaeVar);
                valueOf = Boolean.valueOf(zzbaeVar.zzdpm != 0);
                zzbaeVar.zzdpn = valueOf;
                return zzb;
            case 2:
                return zzbad.zze(bArr, i, zzbaeVar);
            case 3:
                valueOf2 = Double.valueOf(zzbad.zzg(bArr, i));
                zzbaeVar.zzdpn = valueOf2;
                return i + 8;
            case 4:
            case 5:
                valueOf3 = Integer.valueOf(zzbad.zze(bArr, i));
                zzbaeVar.zzdpn = valueOf3;
                return i + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(zzbad.zzf(bArr, i));
                zzbaeVar.zzdpn = valueOf2;
                return i + 8;
            case 8:
                valueOf3 = Float.valueOf(zzbad.zzh(bArr, i));
                zzbaeVar.zzdpn = valueOf3;
                return i + 4;
            case 9:
            case 10:
            case 11:
                zzb = zzbad.zza(bArr, i, zzbaeVar);
                i3 = zzbaeVar.zzdpl;
                valueOf = Integer.valueOf(i3);
                zzbaeVar.zzdpn = valueOf;
                return zzb;
            case 12:
            case 13:
                zzb = zzbad.zzb(bArr, i, zzbaeVar);
                j = zzbaeVar.zzdpm;
                valueOf = Long.valueOf(j);
                zzbaeVar.zzdpn = valueOf;
                return zzb;
            case 14:
                return zza((zzbdm) zzbdg.zzaeo().zze(cls), bArr, i, i2, zzbaeVar);
            case 15:
                zzb = zzbad.zza(bArr, i, zzbaeVar);
                i3 = zzbaq.zzbu(zzbaeVar.zzdpl);
                valueOf = Integer.valueOf(i3);
                zzbaeVar.zzdpn = valueOf;
                return zzb;
            case 16:
                zzb = zzbad.zzb(bArr, i, zzbaeVar);
                j = zzbaq.zzl(zzbaeVar.zzdpm);
                valueOf = Long.valueOf(j);
                zzbaeVar.zzdpn = valueOf;
                return zzb;
            case 17:
                return zzbad.zzd(bArr, i, zzbaeVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016d A[EDGE_INSN: B:50:0x016d->B:71:0x016d BREAK  A[LOOP:0: B:18:0x0067->B:27:0x0169], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> zzbcy<T> zza(Class<T> cls, zzbcs zzbcsVar, zzbdc zzbdcVar, zzbce zzbceVar, zzbee<?, ?> zzbeeVar, zzbbd<?> zzbbdVar, zzbcp zzbcpVar) {
        int zzaew;
        int i;
        int i2;
        int zza;
        int i3;
        int zzafh;
        int zzaez;
        if (!(zzbcsVar instanceof zzbdi)) {
            ((zzbdz) zzbcsVar).zzaeh();
            throw new NoSuchMethodError();
        }
        zzbdi zzbdiVar = (zzbdi) zzbcsVar;
        boolean z = zzbdiVar.zzaeh() == zzbbo.zze.zzduj;
        if (zzbdiVar.getFieldCount() == 0) {
            zzaew = 0;
            i = 0;
            i2 = 0;
        } else {
            int zzaer = zzbdiVar.zzaer();
            int zzaes = zzbdiVar.zzaes();
            zzaew = zzbdiVar.zzaew();
            i = zzaer;
            i2 = zzaes;
        }
        int[] iArr = new int[zzaew << 2];
        Object[] objArr = new Object[zzaew << 1];
        int[] iArr2 = zzbdiVar.zzaet() > 0 ? new int[zzbdiVar.zzaet()] : null;
        int[] iArr3 = zzbdiVar.zzaeu() > 0 ? new int[zzbdiVar.zzaeu()] : null;
        zzbdj zzaeq = zzbdiVar.zzaeq();
        if (zzaeq.next()) {
            int zzaci = zzaeq.zzaci();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (zzaci >= zzbdiVar.zzaex() || i4 >= ((zzaci - i) << 2)) {
                    if (zzaeq.zzafb()) {
                        zza = (int) zzbek.zza(zzaeq.zzafc());
                        i3 = (int) zzbek.zza(zzaeq.zzafd());
                    } else {
                        zza = (int) zzbek.zza(zzaeq.zzafe());
                        if (zzaeq.zzaff()) {
                            i3 = (int) zzbek.zza(zzaeq.zzafg());
                            zzafh = zzaeq.zzafh();
                            iArr[i4] = zzaeq.zzaci();
                            int i7 = i4 + 1;
                            iArr[i7] = (!zzaeq.zzafj() ? 536870912 : 0) | (!zzaeq.zzafi() ? 268435456 : 0) | (zzaeq.zzaez() << 20) | zza;
                            iArr[i4 + 2] = i3 | (zzafh << 20);
                            if (zzaeq.zzafm() == null) {
                                int i8 = (i4 / 4) << 1;
                                objArr[i8] = zzaeq.zzafm();
                                if (zzaeq.zzafk() != null) {
                                    objArr[i8 + 1] = zzaeq.zzafk();
                                } else if (zzaeq.zzafl() != null) {
                                    objArr[i8 + 1] = zzaeq.zzafl();
                                }
                            } else if (zzaeq.zzafk() != null) {
                                objArr[((i4 / 4) << 1) + 1] = zzaeq.zzafk();
                            } else if (zzaeq.zzafl() != null) {
                                objArr[((i4 / 4) << 1) + 1] = zzaeq.zzafl();
                            }
                            zzaez = zzaeq.zzaez();
                            if (zzaez != zzbbj.MAP.ordinal()) {
                                iArr2[i5] = i4;
                                i5++;
                            } else if (zzaez >= 18 && zzaez <= 49) {
                                iArr3[i6] = iArr[i7] & 1048575;
                                i6++;
                            }
                            if (zzaeq.next()) {
                                break;
                            }
                            zzaci = zzaeq.zzaci();
                        } else {
                            i3 = 0;
                        }
                    }
                    zzafh = 0;
                    iArr[i4] = zzaeq.zzaci();
                    int i72 = i4 + 1;
                    iArr[i72] = (!zzaeq.zzafj() ? 536870912 : 0) | (!zzaeq.zzafi() ? 268435456 : 0) | (zzaeq.zzaez() << 20) | zza;
                    iArr[i4 + 2] = i3 | (zzafh << 20);
                    if (zzaeq.zzafm() == null) {
                    }
                    zzaez = zzaeq.zzaez();
                    if (zzaez != zzbbj.MAP.ordinal()) {
                    }
                    if (zzaeq.next()) {
                    }
                } else {
                    for (int i9 = 0; i9 < 4; i9++) {
                        iArr[i4 + i9] = -1;
                    }
                }
                i4 += 4;
            }
        }
        return new zzbcy<>(iArr, objArr, i, i2, zzbdiVar.zzaex(), zzbdiVar.zzaej(), z, false, zzbdiVar.zzaev(), iArr2, iArr3, zzbdcVar, zzbceVar, zzbeeVar, zzbbdVar, zzbcpVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzbbs<?> zzbbsVar, UB ub, zzbee<UT, UB> zzbeeVar) {
        zzbcn<?, ?> zzx = this.zzdwx.zzx(zzcr(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (zzbbsVar.zzq(((Integer) next.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = zzbeeVar.zzagb();
                }
                zzbam zzbo = zzbah.zzbo(zzbcm.zza(zzx, next.getKey(), next.getValue()));
                try {
                    zzbcm.zza(zzbo.zzabj(), zzx, next.getKey(), next.getValue());
                    zzbeeVar.zza((zzbee<UT, UB>) ub, i2, zzbo.zzabi());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzbee<UT, UB> zzbeeVar) {
        zzbbs<?> zzcs;
        int i2 = this.zzdwg[i];
        Object zzp = zzbek.zzp(obj, zzct(i) & 1048575);
        return (zzp == null || (zzcs = zzcs(i)) == null) ? ub : (UB) zza(i, i2, this.zzdwx.zzs(zzp), zzcs, (zzbbs<?>) ub, (zzbee<UT, zzbbs<?>>) zzbeeVar);
    }

    private static void zza(int i, Object obj, zzbey zzbeyVar) throws IOException {
        if (obj instanceof String) {
            zzbeyVar.zzf(i, (String) obj);
        } else {
            zzbeyVar.zza(i, (zzbah) obj);
        }
    }

    private static <UT, UB> void zza(zzbee<UT, UB> zzbeeVar, T t, zzbey zzbeyVar) throws IOException {
        zzbeeVar.zza((zzbee<UT, UB>) zzbeeVar.zzac(t), zzbeyVar);
    }

    private final <K, V> void zza(zzbey zzbeyVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzbeyVar.zza(i, this.zzdwx.zzx(zzcr(i2)), this.zzdwx.zzt(obj));
        }
    }

    private final void zza(Object obj, int i, zzbdl zzbdlVar) throws IOException {
        long j;
        Object zzabs;
        if (zzcv(i)) {
            j = i & 1048575;
            zzabs = zzbdlVar.zzabr();
        } else if (this.zzdwn) {
            j = i & 1048575;
            zzabs = zzbdlVar.readString();
        } else {
            j = i & 1048575;
            zzabs = zzbdlVar.zzabs();
        }
        zzbek.zza(obj, j, zzabs);
    }

    private final void zza(T t, T t2, int i) {
        long zzct = zzct(i) & 1048575;
        if (zza((zzbcy<T>) t2, i)) {
            Object zzp = zzbek.zzp(t, zzct);
            Object zzp2 = zzbek.zzp(t2, zzct);
            if (zzp != null && zzp2 != null) {
                zzbek.zza(t, zzct, zzbbq.zza(zzp, zzp2));
                zzb((zzbcy<T>) t, i);
            } else if (zzp2 != null) {
                zzbek.zza(t, zzct, zzp2);
                zzb((zzbcy<T>) t, i);
            }
        }
    }

    private final boolean zza(T t, int i) {
        if (!this.zzdwo) {
            int zzcu = zzcu(i);
            return (zzbek.zzk(t, (long) (zzcu & 1048575)) & (1 << (zzcu >>> 20))) != 0;
        }
        int zzct = zzct(i);
        long j = zzct & 1048575;
        switch ((zzct & 267386880) >>> 20) {
            case 0:
                return zzbek.zzo(t, j) != 0.0d;
            case 1:
                return zzbek.zzn(t, j) != 0.0f;
            case 2:
                return zzbek.zzl(t, j) != 0;
            case 3:
                return zzbek.zzl(t, j) != 0;
            case 4:
                return zzbek.zzk(t, j) != 0;
            case 5:
                return zzbek.zzl(t, j) != 0;
            case 6:
                return zzbek.zzk(t, j) != 0;
            case 7:
                return zzbek.zzm(t, j);
            case 8:
                Object zzp = zzbek.zzp(t, j);
                if (zzp instanceof String) {
                    return !((String) zzp).isEmpty();
                }
                if (zzp instanceof zzbah) {
                    return !zzbah.zzdpq.equals(zzp);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzbek.zzp(t, j) != null;
            case 10:
                return !zzbah.zzdpq.equals(zzbek.zzp(t, j));
            case 11:
                return zzbek.zzk(t, j) != 0;
            case 12:
                return zzbek.zzk(t, j) != 0;
            case 13:
                return zzbek.zzk(t, j) != 0;
            case 14:
                return zzbek.zzl(t, j) != 0;
            case 15:
                return zzbek.zzk(t, j) != 0;
            case 16:
                return zzbek.zzl(t, j) != 0;
            case 17:
                return zzbek.zzp(t, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzbek.zzk(t, (long) (zzcu(i2) & 1048575)) == i;
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        return this.zzdwo ? zza((zzbcy<T>) t, i) : (i2 & i3) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzbdm zzbdmVar) {
        return zzbdmVar.zzaa(zzbek.zzp(obj, i & 1048575));
    }

    private final void zzb(T t, int i) {
        if (this.zzdwo) {
            return;
        }
        int zzcu = zzcu(i);
        long j = zzcu & 1048575;
        zzbek.zzb(t, j, zzbek.zzk(t, j) | (1 << (zzcu >>> 20)));
    }

    private final void zzb(T t, int i, int i2) {
        zzbek.zzb(t, zzcu(i2) & 1048575, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(T t, zzbey zzbeyVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        Map.Entry<?, ?> entry2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        int i10;
        List list;
        boolean z6;
        if (this.zzdwm) {
            zzbbg<?> zzm = this.zzdww.zzm(t);
            if (!zzm.isEmpty()) {
                it = zzm.iterator();
                entry = (Map.Entry) it.next();
                int i11 = -1;
                length = this.zzdwg.length;
                Unsafe unsafe = zzdwf;
                entry2 = entry;
                int i12 = 0;
                for (i = 0; i < length; i = i4 + 4) {
                    int zzct = zzct(i);
                    int i13 = this.zzdwg[i];
                    int i14 = (267386880 & zzct) >>> 20;
                    if (this.zzdwo || i14 > 17) {
                        i2 = i;
                        i3 = 0;
                    } else {
                        int i15 = this.zzdwg[i + 2];
                        int i16 = i15 & 1048575;
                        if (i16 != i11) {
                            i2 = i;
                            i12 = unsafe.getInt(t, i16);
                            i11 = i16;
                        } else {
                            i2 = i;
                        }
                        i3 = 1 << (i15 >>> 20);
                    }
                    while (entry2 != null && this.zzdww.zza(entry2) <= i13) {
                        this.zzdww.zza(zzbeyVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzct & 1048575;
                    switch (i14) {
                        case 0:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zza(i13, zzbek.zzo(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zza(i13, zzbek.zzn(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzi(i13, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zza(i13, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzm(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzc(i13, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzp(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzf(i13, zzbek.zzm(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zza(i13, unsafe.getObject(t, j), zzbeyVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zza(i13, unsafe.getObject(t, j), zzcq(i4));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zza(i13, (zzbah) unsafe.getObject(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzn(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzx(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzw(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzj(i13, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzo(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzb(i13, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            i4 = i2;
                            if ((i3 & i12) != 0) {
                                zzbeyVar.zzb(i13, unsafe.getObject(t, j), zzcq(i4));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i4 = i2;
                            zzbdo.zza(this.zzdwg[i4], (List<Double>) unsafe.getObject(t, j), zzbeyVar, false);
                            break;
                        case 19:
                            i4 = i2;
                            zzbdo.zzb(this.zzdwg[i4], (List<Float>) unsafe.getObject(t, j), zzbeyVar, false);
                            break;
                        case 20:
                            i4 = i2;
                            zzbdo.zzc(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            break;
                        case 21:
                            i4 = i2;
                            zzbdo.zzd(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            break;
                        case 22:
                            i4 = i2;
                            zzbdo.zzh(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            break;
                        case 23:
                            i4 = i2;
                            zzbdo.zzf(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            break;
                        case 24:
                            i4 = i2;
                            zzbdo.zzk(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            break;
                        case 25:
                            i4 = i2;
                            zzbdo.zzn(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            break;
                        case 26:
                            i4 = i2;
                            zzbdo.zza(this.zzdwg[i4], (List<String>) unsafe.getObject(t, j), zzbeyVar);
                            break;
                        case 27:
                            i4 = i2;
                            zzbdo.zza(this.zzdwg[i4], (List<?>) unsafe.getObject(t, j), zzbeyVar, zzcq(i4));
                            break;
                        case 28:
                            i4 = i2;
                            zzbdo.zzb(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar);
                            break;
                        case 29:
                            i4 = i2;
                            z = false;
                            i5 = this.zzdwg[i4];
                            zzbdo.zzi(i5, (List) unsafe.getObject(t, j), zzbeyVar, z);
                            break;
                        case 30:
                            i4 = i2;
                            z2 = false;
                            i6 = this.zzdwg[i4];
                            zzbdo.zzm(i6, (List) unsafe.getObject(t, j), zzbeyVar, z2);
                            break;
                        case 31:
                            i4 = i2;
                            z3 = false;
                            i7 = this.zzdwg[i4];
                            zzbdo.zzl(i7, (List) unsafe.getObject(t, j), zzbeyVar, z3);
                            break;
                        case 32:
                            i4 = i2;
                            z4 = false;
                            i8 = this.zzdwg[i4];
                            zzbdo.zzg(i8, (List) unsafe.getObject(t, j), zzbeyVar, z4);
                            break;
                        case 33:
                            i4 = i2;
                            z5 = false;
                            i9 = this.zzdwg[i4];
                            zzbdo.zzj(i9, (List) unsafe.getObject(t, j), zzbeyVar, z5);
                            break;
                        case 34:
                            i4 = i2;
                            i10 = this.zzdwg[i4];
                            list = (List) unsafe.getObject(t, j);
                            z6 = false;
                            zzbdo.zze(i10, list, zzbeyVar, z6);
                            break;
                        case 35:
                            i4 = i2;
                            zzbdo.zza(this.zzdwg[i4], (List<Double>) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 36:
                            i4 = i2;
                            zzbdo.zzb(this.zzdwg[i4], (List<Float>) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 37:
                            i4 = i2;
                            zzbdo.zzc(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 38:
                            i4 = i2;
                            zzbdo.zzd(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 39:
                            i4 = i2;
                            zzbdo.zzh(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 40:
                            i4 = i2;
                            zzbdo.zzf(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 41:
                            i4 = i2;
                            zzbdo.zzk(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 42:
                            i4 = i2;
                            zzbdo.zzn(this.zzdwg[i4], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 43:
                            i4 = i2;
                            z = true;
                            i5 = this.zzdwg[i4];
                            zzbdo.zzi(i5, (List) unsafe.getObject(t, j), zzbeyVar, z);
                            break;
                        case 44:
                            i4 = i2;
                            z2 = true;
                            i6 = this.zzdwg[i4];
                            zzbdo.zzm(i6, (List) unsafe.getObject(t, j), zzbeyVar, z2);
                            break;
                        case 45:
                            i4 = i2;
                            z3 = true;
                            i7 = this.zzdwg[i4];
                            zzbdo.zzl(i7, (List) unsafe.getObject(t, j), zzbeyVar, z3);
                            break;
                        case 46:
                            i4 = i2;
                            z4 = true;
                            i8 = this.zzdwg[i4];
                            zzbdo.zzg(i8, (List) unsafe.getObject(t, j), zzbeyVar, z4);
                            break;
                        case 47:
                            i4 = i2;
                            z5 = true;
                            i9 = this.zzdwg[i4];
                            zzbdo.zzj(i9, (List) unsafe.getObject(t, j), zzbeyVar, z5);
                            break;
                        case 48:
                            i4 = i2;
                            i10 = this.zzdwg[i4];
                            list = (List) unsafe.getObject(t, j);
                            z6 = true;
                            zzbdo.zze(i10, list, zzbeyVar, z6);
                            break;
                        case 49:
                            i4 = i2;
                            zzbdo.zzb(this.zzdwg[i4], (List<?>) unsafe.getObject(t, j), zzbeyVar, zzcq(i4));
                            break;
                        case 50:
                            i4 = i2;
                            zza(zzbeyVar, i13, unsafe.getObject(t, j), i4);
                            break;
                        case 51:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zza(i13, zzf(t, j));
                            }
                            break;
                        case 52:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zza(i13, zzg(t, j));
                            }
                            break;
                        case 53:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzi(i13, zzi(t, j));
                            }
                            break;
                        case 54:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zza(i13, zzi(t, j));
                            }
                            break;
                        case 55:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzm(i13, zzh(t, j));
                            }
                            break;
                        case 56:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzc(i13, zzi(t, j));
                            }
                            break;
                        case 57:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzp(i13, zzh(t, j));
                            }
                            break;
                        case 58:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzf(i13, zzj(t, j));
                            }
                            break;
                        case 59:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zza(i13, unsafe.getObject(t, j), zzbeyVar);
                            }
                            break;
                        case 60:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zza(i13, unsafe.getObject(t, j), zzcq(i4));
                            }
                            break;
                        case 61:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zza(i13, (zzbah) unsafe.getObject(t, j));
                            }
                            break;
                        case 62:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzn(i13, zzh(t, j));
                            }
                            break;
                        case 63:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzx(i13, zzh(t, j));
                            }
                            break;
                        case 64:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzw(i13, zzh(t, j));
                            }
                            break;
                        case 65:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzj(i13, zzi(t, j));
                            }
                            break;
                        case 66:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzo(i13, zzh(t, j));
                            }
                            break;
                        case 67:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzb(i13, zzi(t, j));
                            }
                            break;
                        case 68:
                            i4 = i2;
                            if (zza((zzbcy<T>) t, i13, i4)) {
                                zzbeyVar.zzb(i13, unsafe.getObject(t, j), zzcq(i4));
                            }
                            break;
                        default:
                            i4 = i2;
                            break;
                    }
                }
                while (entry2 != null) {
                    this.zzdww.zza(zzbeyVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zza(this.zzdwv, t, zzbeyVar);
            }
        }
        it = null;
        entry = null;
        int i112 = -1;
        length = this.zzdwg.length;
        Unsafe unsafe2 = zzdwf;
        entry2 = entry;
        int i122 = 0;
        while (i < length) {
        }
        while (entry2 != null) {
        }
        zza(this.zzdwv, t, zzbeyVar);
    }

    private final void zzb(T t, T t2, int i) {
        int zzct = zzct(i);
        int i2 = this.zzdwg[i];
        long j = zzct & 1048575;
        if (zza((zzbcy<T>) t2, i2, i)) {
            Object zzp = zzbek.zzp(t, j);
            Object zzp2 = zzbek.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzbek.zza(t, j, zzbbq.zza(zzp, zzp2));
                zzb((zzbcy<T>) t, i2, i);
            } else if (zzp2 != null) {
                zzbek.zza(t, j, zzp2);
                zzb((zzbcy<T>) t, i2, i);
            }
        }
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzbcy<T>) t, i) == zza((zzbcy<T>) t2, i);
    }

    private final zzbdm zzcq(int i) {
        int i2 = (i / 4) << 1;
        zzbdm zzbdmVar = (zzbdm) this.zzdwh[i2];
        if (zzbdmVar != null) {
            return zzbdmVar;
        }
        zzbdm<T> zze = zzbdg.zzaeo().zze((Class) this.zzdwh[i2 + 1]);
        this.zzdwh[i2] = zze;
        return zze;
    }

    private final Object zzcr(int i) {
        return this.zzdwh[(i / 4) << 1];
    }

    private final zzbbs<?> zzcs(int i) {
        return (zzbbs) this.zzdwh[((i / 4) << 1) + 1];
    }

    private final int zzct(int i) {
        return this.zzdwg[i + 1];
    }

    private final int zzcu(int i) {
        return this.zzdwg[i + 2];
    }

    private static boolean zzcv(int i) {
        return (i & 536870912) != 0;
    }

    private final int zzcw(int i) {
        if (i >= this.zzdwi) {
            if (i < this.zzdwk) {
                int i2 = (i - this.zzdwi) << 2;
                if (this.zzdwg[i2] == i) {
                    return i2;
                }
                return -1;
            }
            if (i <= this.zzdwj) {
                int i3 = this.zzdwk - this.zzdwi;
                int length = (this.zzdwg.length / 4) - 1;
                while (i3 <= length) {
                    int i4 = (length + i3) >>> 1;
                    int i5 = i4 << 2;
                    int i6 = this.zzdwg[i5];
                    if (i == i6) {
                        return i5;
                    }
                    if (i < i6) {
                        length = i4 - 1;
                    } else {
                        i3 = i4 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private static <E> List<E> zze(Object obj, long j) {
        return (List) zzbek.zzp(obj, j);
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzbek.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzbek.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzbek.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzbek.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzbek.zzp(t, j)).booleanValue();
    }

    private static zzbef zzz(Object obj) {
        zzbbo zzbboVar = (zzbbo) obj;
        zzbef zzbefVar = zzbboVar.zzdtt;
        if (zzbefVar != zzbef.zzagc()) {
            return zzbefVar;
        }
        zzbef zzagd = zzbef.zzagd();
        zzbboVar.zzdtt = zzagd;
        return zzagd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (com.google.android.gms.internal.ads.zzbdo.zzd(com.google.android.gms.internal.ads.zzbek.zzp(r10, r6), com.google.android.gms.internal.ads.zzbek.zzp(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (com.google.android.gms.internal.ads.zzbdo.zzd(com.google.android.gms.internal.ads.zzbek.zzp(r10, r6), com.google.android.gms.internal.ads.zzbek.zzp(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (com.google.android.gms.internal.ads.zzbdo.zzd(com.google.android.gms.internal.ads.zzbek.zzp(r10, r6), com.google.android.gms.internal.ads.zzbek.zzp(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (com.google.android.gms.internal.ads.zzbdo.zzd(com.google.android.gms.internal.ads.zzbek.zzp(r10, r6), com.google.android.gms.internal.ads.zzbek.zzp(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzm(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzm(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018d, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a0, code lost:
    
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.ads.zzbdo.zzd(com.google.android.gms.internal.ads.zzbek.zzp(r10, r6), com.google.android.gms.internal.ads.zzbek.zzp(r11, r6)) != false) goto L104;
     */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(T t, T t2) {
        int length = this.zzdwg.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                if (!this.zzdwv.zzac(t).equals(this.zzdwv.zzac(t2))) {
                    return false;
                }
                if (this.zzdwm) {
                    return this.zzdww.zzm(t).equals(this.zzdww.zzm(t2));
                }
                return true;
            }
            int zzct = zzct(i);
            long j = zzct & 1048575;
            switch ((zzct & 267386880) >>> 20) {
                case 0:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 1:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 2:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 3:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 4:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 5:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 6:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 8:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 9:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 10:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 11:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 12:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 13:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 14:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 15:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 16:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 17:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
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
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    z = zzbdo.zzd(zzbek.zzp(t, j), zzbek.zzp(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzcu = zzcu(i) & 1048575;
                    if (zzbek.zzk(t, zzcu) == zzbek.zzk(t2, zzcu)) {
                        break;
                    }
                    z = false;
                    break;
            }
            if (!z) {
                return false;
            }
            i += 4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ce, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e6, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e2, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e0, code lost:
    
        if (r3 != null) goto L68;
     */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode(T t) {
        int i;
        double zzo;
        float zzn;
        long zzl;
        int zzk;
        boolean zzm;
        Object zzp;
        Object zzp2;
        int length = this.zzdwg.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 4) {
            int zzct = zzct(i3);
            int i4 = this.zzdwg[i3];
            long j = 1048575 & zzct;
            int i5 = 37;
            switch ((zzct & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzo = zzbek.zzo(t, j);
                    zzl = Double.doubleToLongBits(zzo);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 1:
                    i = i2 * 53;
                    zzn = zzbek.zzn(t, j);
                    zzk = Float.floatToIntBits(zzn);
                    i2 = i + zzk;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    zzl = zzbek.zzl(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i2 * 53;
                    zzk = zzbek.zzk(t, j);
                    i2 = i + zzk;
                    break;
                case 7:
                    i = i2 * 53;
                    zzm = zzbek.zzm(t, j);
                    zzk = zzbbq.zzar(zzm);
                    i2 = i + zzk;
                    break;
                case 8:
                    i = i2 * 53;
                    zzk = ((String) zzbek.zzp(t, j)).hashCode();
                    i2 = i + zzk;
                    break;
                case 9:
                    zzp = zzbek.zzp(t, j);
                    break;
                case 10:
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
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i = i2 * 53;
                    zzp2 = zzbek.zzp(t, j);
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
                case 17:
                    zzp = zzbek.zzp(t, j);
                    break;
                case 51:
                    if (zza((zzbcy<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzo = zzf(t, j);
                        zzl = Double.doubleToLongBits(zzo);
                        zzk = zzbbq.zzv(zzl);
                        i2 = i + zzk;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzbcy<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzn = zzg(t, j);
                        zzk = Float.floatToIntBits(zzn);
                        i2 = i + zzk;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 54:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 55:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 56:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 57:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 58:
                    if (zza((zzbcy<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzm = zzj(t, j);
                        zzk = zzbbq.zzar(zzm);
                        i2 = i + zzk;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = ((String) zzbek.zzp(t, j)).hashCode();
                    i2 = i + zzk;
                    break;
                case 60:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    zzp2 = zzbek.zzp(t, j);
                    i = i2 * 53;
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
                case 61:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzp2 = zzbek.zzp(t, j);
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
                case 62:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 63:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 64:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 65:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 66:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 67:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 68:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    zzp2 = zzbek.zzp(t, j);
                    i = i2 * 53;
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
            }
        }
        int hashCode = (i2 * 53) + this.zzdwv.zzac(t).hashCode();
        return this.zzdwm ? (hashCode * 53) + this.zzdww.zzm(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final T newInstance() {
        return (T) this.zzdwt.newInstance(this.zzdwl);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza(T t, zzbdl zzbdlVar, zzbbb zzbbbVar) throws IOException {
        long j;
        Object zza;
        int zzabu;
        List<Double> zza2;
        List<Float> zza3;
        List<Long> zza4;
        List<Long> zza5;
        List<Integer> zza6;
        List<Long> zza7;
        List<Integer> zza8;
        List<Boolean> zza9;
        List<Integer> zza10;
        List<Integer> zza11;
        zzbbs<?> zzcs;
        List<Integer> zza12;
        List<Long> zza13;
        List<Integer> zza14;
        List<Long> zza15;
        Object zza16;
        if (zzbbbVar == null) {
            throw new NullPointerException();
        }
        zzbee zzbeeVar = this.zzdwv;
        zzbbd<?> zzbbdVar = this.zzdww;
        zzbbg<?> zzbbgVar = null;
        Object obj = null;
        while (true) {
            int i = 0;
            try {
                int zzaci = zzbdlVar.zzaci();
                int zzcw = zzcw(zzaci);
                if (zzcw >= 0) {
                    int zzct = zzct(zzcw);
                    switch ((267386880 & zzct) >>> 20) {
                        case 0:
                            zzbek.zza(t, zzct & 1048575, zzbdlVar.readDouble());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 1:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.readFloat());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 2:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.zzabm());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 3:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.zzabl());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 4:
                            zzbek.zzb(t, zzct & 1048575, zzbdlVar.zzabn());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 5:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.zzabo());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 6:
                            zzbek.zzb(t, zzct & 1048575, zzbdlVar.zzabp());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 7:
                            zzbek.zza(t, zzct & 1048575, zzbdlVar.zzabq());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 8:
                            zza(t, zzct, zzbdlVar);
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 9:
                            if (!zza((zzbcy<T>) t, zzcw)) {
                                zzbek.zza(t, zzct & 1048575, zzbdlVar.zza(zzcq(zzcw), zzbbbVar));
                                zzb((zzbcy<T>) t, zzcw);
                                break;
                            } else {
                                j = zzct & 1048575;
                                zza = zzbbq.zza(zzbek.zzp(t, j), zzbdlVar.zza(zzcq(zzcw), zzbbbVar));
                                zzbek.zza(t, j, zza);
                                break;
                            }
                        case 10:
                            zzbek.zza(t, zzct & 1048575, zzbdlVar.zzabs());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 11:
                            zzbek.zzb(t, zzct & 1048575, zzbdlVar.zzabt());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 12:
                            zzabu = zzbdlVar.zzabu();
                            zzbbs<?> zzcs2 = zzcs(zzcw);
                            if (zzcs2 != null && zzcs2.zzq(zzabu) == null) {
                                zza16 = zzbdo.zza(zzaci, zzabu, obj, (zzbee<UT, Object>) zzbeeVar);
                                obj = zza16;
                                break;
                            } else {
                                zzbek.zzb(t, zzct & 1048575, zzabu);
                                zzb((zzbcy<T>) t, zzcw);
                                break;
                            }
                        case 13:
                            zzbek.zzb(t, zzct & 1048575, zzbdlVar.zzabv());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 14:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.zzabw());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 15:
                            zzbek.zzb(t, zzct & 1048575, zzbdlVar.zzabx());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 16:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.zzaby());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 17:
                            if (!zza((zzbcy<T>) t, zzcw)) {
                                zzbek.zza(t, zzct & 1048575, zzbdlVar.zzb(zzcq(zzcw), zzbbbVar));
                                zzb((zzbcy<T>) t, zzcw);
                                break;
                            } else {
                                j = zzct & 1048575;
                                zza = zzbbq.zza(zzbek.zzp(t, j), zzbdlVar.zzb(zzcq(zzcw), zzbbbVar));
                                zzbek.zza(t, j, zza);
                                break;
                            }
                        case 18:
                            zza2 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzp(zza2);
                            break;
                        case 19:
                            zza3 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzq(zza3);
                            break;
                        case 20:
                            zza4 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzs(zza4);
                            break;
                        case 21:
                            zza5 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzr(zza5);
                            break;
                        case 22:
                            zza6 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzt(zza6);
                            break;
                        case 23:
                            zza7 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzu(zza7);
                            break;
                        case 24:
                            zza8 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzv(zza8);
                            break;
                        case 25:
                            zza9 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzw(zza9);
                            break;
                        case 26:
                            if (!zzcv(zzct)) {
                                zzbdlVar.readStringList(this.zzdwu.zza(t, zzct & 1048575));
                                break;
                            } else {
                                zzbdlVar.zzx(this.zzdwu.zza(t, zzct & 1048575));
                                break;
                            }
                        case 27:
                            zzbdlVar.zza(this.zzdwu.zza(t, zzct & 1048575), zzcq(zzcw), zzbbbVar);
                            break;
                        case 28:
                            zzbdlVar.zzy(this.zzdwu.zza(t, zzct & 1048575));
                            break;
                        case 29:
                            zza10 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzz(zza10);
                            break;
                        case 30:
                            zza11 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzaa(zza11);
                            zzcs = zzcs(zzcw);
                            zza16 = zzbdo.zza(zzaci, zza11, zzcs, obj, zzbeeVar);
                            obj = zza16;
                            break;
                        case 31:
                            zza12 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzab(zza12);
                            break;
                        case 32:
                            zza13 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzac(zza13);
                            break;
                        case 33:
                            zza14 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzad(zza14);
                            break;
                        case 34:
                            zza15 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzae(zza15);
                            break;
                        case 35:
                            zza2 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzp(zza2);
                            break;
                        case 36:
                            zza3 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzq(zza3);
                            break;
                        case 37:
                            zza4 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzs(zza4);
                            break;
                        case 38:
                            zza5 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzr(zza5);
                            break;
                        case 39:
                            zza6 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzt(zza6);
                            break;
                        case 40:
                            zza7 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzu(zza7);
                            break;
                        case 41:
                            zza8 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzv(zza8);
                            break;
                        case 42:
                            zza9 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzw(zza9);
                            break;
                        case 43:
                            zza10 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzz(zza10);
                            break;
                        case 44:
                            zza11 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzaa(zza11);
                            zzcs = zzcs(zzcw);
                            zza16 = zzbdo.zza(zzaci, zza11, zzcs, obj, zzbeeVar);
                            obj = zza16;
                            break;
                        case 45:
                            zza12 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzab(zza12);
                            break;
                        case 46:
                            zza13 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzac(zza13);
                            break;
                        case 47:
                            zza14 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzad(zza14);
                            break;
                        case 48:
                            zza15 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzae(zza15);
                            break;
                        case 49:
                            zzbdlVar.zzb(this.zzdwu.zza(t, zzct & 1048575), zzcq(zzcw), zzbbbVar);
                            break;
                        case 50:
                            Object zzcr = zzcr(zzcw);
                            long zzct2 = zzct(zzcw) & 1048575;
                            Object zzp = zzbek.zzp(t, zzct2);
                            if (zzp == null) {
                                zzp = this.zzdwx.zzw(zzcr);
                                zzbek.zza(t, zzct2, zzp);
                            } else if (this.zzdwx.zzu(zzp)) {
                                Object zzw = this.zzdwx.zzw(zzcr);
                                this.zzdwx.zzb(zzw, zzp);
                                zzbek.zza(t, zzct2, zzw);
                                zzp = zzw;
                            }
                            zzbdlVar.zza(this.zzdwx.zzs(zzp), this.zzdwx.zzx(zzcr), zzbbbVar);
                            break;
                        case 51:
                            zzbek.zza(t, zzct & 1048575, Double.valueOf(zzbdlVar.readDouble()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 52:
                            zzbek.zza(t, zzct & 1048575, Float.valueOf(zzbdlVar.readFloat()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 53:
                            zzbek.zza(t, zzct & 1048575, Long.valueOf(zzbdlVar.zzabm()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 54:
                            zzbek.zza(t, zzct & 1048575, Long.valueOf(zzbdlVar.zzabl()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 55:
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzbdlVar.zzabn()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 56:
                            zzbek.zza(t, zzct & 1048575, Long.valueOf(zzbdlVar.zzabo()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 57:
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzbdlVar.zzabp()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 58:
                            zzbek.zza(t, zzct & 1048575, Boolean.valueOf(zzbdlVar.zzabq()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 59:
                            zza(t, zzct, zzbdlVar);
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 60:
                            if (zza((zzbcy<T>) t, zzaci, zzcw)) {
                                long j2 = zzct & 1048575;
                                zzbek.zza(t, j2, zzbbq.zza(zzbek.zzp(t, j2), zzbdlVar.zza(zzcq(zzcw), zzbbbVar)));
                            } else {
                                zzbek.zza(t, zzct & 1048575, zzbdlVar.zza(zzcq(zzcw), zzbbbVar));
                                zzb((zzbcy<T>) t, zzcw);
                            }
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 61:
                            zzbek.zza(t, zzct & 1048575, zzbdlVar.zzabs());
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 62:
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzbdlVar.zzabt()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 63:
                            zzabu = zzbdlVar.zzabu();
                            zzbbs<?> zzcs3 = zzcs(zzcw);
                            if (zzcs3 != null && zzcs3.zzq(zzabu) == null) {
                                zza16 = zzbdo.zza(zzaci, zzabu, obj, (zzbee<UT, Object>) zzbeeVar);
                                obj = zza16;
                                break;
                            }
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzabu));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 64:
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzbdlVar.zzabv()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 65:
                            zzbek.zza(t, zzct & 1048575, Long.valueOf(zzbdlVar.zzabw()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 66:
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzbdlVar.zzabx()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 67:
                            zzbek.zza(t, zzct & 1048575, Long.valueOf(zzbdlVar.zzaby()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 68:
                            zzbek.zza(t, zzct & 1048575, zzbdlVar.zzb(zzcq(zzcw), zzbbbVar));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzbeeVar.zzagb();
                                } catch (zzbbv unused) {
                                    zzbeeVar.zza(zzbdlVar);
                                    if (obj == null) {
                                        obj = zzbeeVar.zzad(t);
                                    }
                                    if (!zzbeeVar.zza((zzbee) obj, zzbdlVar)) {
                                        if (this.zzdwr != null) {
                                            int[] iArr = this.zzdwr;
                                            int length = iArr.length;
                                            while (i < length) {
                                                obj = zza((Object) t, iArr[i], (int) obj, (zzbee<UT, int>) zzbeeVar);
                                                i++;
                                            }
                                        }
                                        if (obj != null) {
                                            zzbeeVar.zzf(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzbeeVar.zza((zzbee) obj, zzbdlVar)) {
                                if (this.zzdwr != null) {
                                    int[] iArr2 = this.zzdwr;
                                    int length2 = iArr2.length;
                                    while (i < length2) {
                                        obj = zza((Object) t, iArr2[i], (int) obj, (zzbee<UT, int>) zzbeeVar);
                                        i++;
                                    }
                                }
                                if (obj != null) {
                                    zzbeeVar.zzf(t, obj);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                } else {
                    if (zzaci == Integer.MAX_VALUE) {
                        if (this.zzdwr != null) {
                            int[] iArr3 = this.zzdwr;
                            int length3 = iArr3.length;
                            while (i < length3) {
                                obj = zza((Object) t, iArr3[i], (int) obj, (zzbee<UT, int>) zzbeeVar);
                                i++;
                            }
                        }
                        if (obj != null) {
                            zzbeeVar.zzf(t, obj);
                            return;
                        }
                        return;
                    }
                    Object zza17 = !this.zzdwm ? null : zzbbdVar.zza(zzbbbVar, this.zzdwl, zzaci);
                    if (zza17 != null) {
                        if (zzbbgVar == null) {
                            zzbbgVar = zzbbdVar.zzn(t);
                        }
                        zzbbg<?> zzbbgVar2 = zzbbgVar;
                        obj = zzbbdVar.zza(zzbdlVar, zza17, zzbbbVar, zzbbgVar2, obj, zzbeeVar);
                        zzbbgVar = zzbbgVar2;
                    } else {
                        zzbeeVar.zza(zzbdlVar);
                        if (obj == null) {
                            obj = zzbeeVar.zzad(t);
                        }
                        if (!zzbeeVar.zza((zzbee) obj, zzbdlVar)) {
                            if (this.zzdwr != null) {
                                int[] iArr4 = this.zzdwr;
                                int length4 = iArr4.length;
                                while (i < length4) {
                                    obj = zza((Object) t, iArr4[i], (int) obj, (zzbee<UT, int>) zzbeeVar);
                                    i++;
                                }
                            }
                            if (obj != null) {
                                zzbeeVar.zzf(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                if (this.zzdwr != null) {
                    int[] iArr5 = this.zzdwr;
                    int length5 = iArr5.length;
                    while (i < length5) {
                        obj = zza((Object) t, iArr5[i], (int) obj, (zzbee<UT, int>) zzbeeVar);
                        i++;
                    }
                }
                if (obj != null) {
                    zzbeeVar.zzf(t, obj);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0977  */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzbey zzbeyVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        Map.Entry<?, ?> entry2;
        int i;
        double zzo;
        float zzn;
        long zzl;
        long zzl2;
        int zzk;
        long zzl3;
        int zzk2;
        boolean zzm;
        int zzk3;
        int zzk4;
        int zzk5;
        long zzl4;
        int zzk6;
        long zzl5;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, ?> entry3;
        int length2;
        double zzo2;
        float zzn2;
        long zzl6;
        long zzl7;
        int zzk7;
        long zzl8;
        int zzk8;
        boolean zzm2;
        int zzk9;
        int zzk10;
        int zzk11;
        long zzl9;
        int zzk12;
        long zzl10;
        if (zzbeyVar.zzacn() == zzbbo.zze.zzdum) {
            zza(this.zzdwv, t, zzbeyVar);
            if (this.zzdwm) {
                zzbbg<?> zzm3 = this.zzdww.zzm(t);
                if (!zzm3.isEmpty()) {
                    it2 = zzm3.descendingIterator();
                    entry3 = (Map.Entry) it2.next();
                    for (length2 = this.zzdwg.length - 4; length2 >= 0; length2 -= 4) {
                        int zzct = zzct(length2);
                        int i2 = this.zzdwg[length2];
                        while (entry3 != null && this.zzdww.zza(entry3) > i2) {
                            this.zzdww.zza(zzbeyVar, entry3);
                            entry3 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        }
                        switch ((zzct & 267386880) >>> 20) {
                            case 0:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzo2 = zzbek.zzo(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzo2);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzn2 = zzbek.zzn(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzn2);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzl6 = zzbek.zzl(t, zzct & 1048575);
                                    zzbeyVar.zzi(i2, zzl6);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzl7 = zzbek.zzl(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzl7);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk7 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzm(i2, zzk7);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzl8 = zzbek.zzl(t, zzct & 1048575);
                                    zzbeyVar.zzc(i2, zzl8);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk8 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzp(i2, zzk8);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzm2 = zzbek.zzm(t, zzct & 1048575);
                                    zzbeyVar.zzf(i2, zzm2);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (!zza((zzbcy<T>) t, length2)) {
                                    break;
                                }
                                zza(i2, zzbek.zzp(t, zzct & 1048575), zzbeyVar);
                                break;
                            case 9:
                                if (!zza((zzbcy<T>) t, length2)) {
                                    break;
                                }
                                zzbeyVar.zza(i2, zzbek.zzp(t, zzct & 1048575), zzcq(length2));
                                break;
                            case 10:
                                if (!zza((zzbcy<T>) t, length2)) {
                                    break;
                                }
                                zzbeyVar.zza(i2, (zzbah) zzbek.zzp(t, zzct & 1048575));
                                break;
                            case 11:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk9 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzn(i2, zzk9);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk10 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzx(i2, zzk10);
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk11 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzw(i2, zzk11);
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzl9 = zzbek.zzl(t, zzct & 1048575);
                                    zzbeyVar.zzj(i2, zzl9);
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk12 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzo(i2, zzk12);
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzl10 = zzbek.zzl(t, zzct & 1048575);
                                    zzbeyVar.zzb(i2, zzl10);
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (!zza((zzbcy<T>) t, length2)) {
                                    break;
                                }
                                zzbeyVar.zzb(i2, zzbek.zzp(t, zzct & 1048575), zzcq(length2));
                                break;
                            case 18:
                                zzbdo.zza(this.zzdwg[length2], (List<Double>) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 19:
                                zzbdo.zzb(this.zzdwg[length2], (List<Float>) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 20:
                                zzbdo.zzc(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 21:
                                zzbdo.zzd(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 22:
                                zzbdo.zzh(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 23:
                                zzbdo.zzf(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 24:
                                zzbdo.zzk(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 25:
                                zzbdo.zzn(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 26:
                                zzbdo.zza(this.zzdwg[length2], (List<String>) zzbek.zzp(t, zzct & 1048575), zzbeyVar);
                                break;
                            case 27:
                                zzbdo.zza(this.zzdwg[length2], (List<?>) zzbek.zzp(t, zzct & 1048575), zzbeyVar, zzcq(length2));
                                break;
                            case 28:
                                zzbdo.zzb(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar);
                                break;
                            case 29:
                                zzbdo.zzi(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 30:
                                zzbdo.zzm(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 31:
                                zzbdo.zzl(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 32:
                                zzbdo.zzg(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 33:
                                zzbdo.zzj(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 34:
                                zzbdo.zze(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 35:
                                zzbdo.zza(this.zzdwg[length2], (List<Double>) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 36:
                                zzbdo.zzb(this.zzdwg[length2], (List<Float>) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 37:
                                zzbdo.zzc(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 38:
                                zzbdo.zzd(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 39:
                                zzbdo.zzh(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 40:
                                zzbdo.zzf(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 41:
                                zzbdo.zzk(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 42:
                                zzbdo.zzn(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 43:
                                zzbdo.zzi(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 44:
                                zzbdo.zzm(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 45:
                                zzbdo.zzl(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 46:
                                zzbdo.zzg(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 47:
                                zzbdo.zzj(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 48:
                                zzbdo.zze(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 49:
                                zzbdo.zzb(this.zzdwg[length2], (List<?>) zzbek.zzp(t, zzct & 1048575), zzbeyVar, zzcq(length2));
                                break;
                            case 50:
                                zza(zzbeyVar, i2, zzbek.zzp(t, zzct & 1048575), length2);
                                break;
                            case 51:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzo2 = zzf(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzo2);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzn2 = zzg(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzn2);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzl6 = zzi(t, zzct & 1048575);
                                    zzbeyVar.zzi(i2, zzl6);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzl7 = zzi(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzl7);
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk7 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzm(i2, zzk7);
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzl8 = zzi(t, zzct & 1048575);
                                    zzbeyVar.zzc(i2, zzl8);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk8 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzp(i2, zzk8);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzm2 = zzj(t, zzct & 1048575);
                                    zzbeyVar.zzf(i2, zzm2);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (!zza((zzbcy<T>) t, i2, length2)) {
                                    break;
                                }
                                zza(i2, zzbek.zzp(t, zzct & 1048575), zzbeyVar);
                                break;
                            case 60:
                                if (!zza((zzbcy<T>) t, i2, length2)) {
                                    break;
                                }
                                zzbeyVar.zza(i2, zzbek.zzp(t, zzct & 1048575), zzcq(length2));
                                break;
                            case 61:
                                if (!zza((zzbcy<T>) t, i2, length2)) {
                                    break;
                                }
                                zzbeyVar.zza(i2, (zzbah) zzbek.zzp(t, zzct & 1048575));
                                break;
                            case 62:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk9 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzn(i2, zzk9);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk10 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzx(i2, zzk10);
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk11 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzw(i2, zzk11);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzl9 = zzi(t, zzct & 1048575);
                                    zzbeyVar.zzj(i2, zzl9);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk12 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzo(i2, zzk12);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzl10 = zzi(t, zzct & 1048575);
                                    zzbeyVar.zzb(i2, zzl10);
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (!zza((zzbcy<T>) t, i2, length2)) {
                                    break;
                                }
                                zzbeyVar.zzb(i2, zzbek.zzp(t, zzct & 1048575), zzcq(length2));
                                break;
                        }
                    }
                    while (entry3 != null) {
                        this.zzdww.zza(zzbeyVar, entry3);
                        entry3 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry3 = null;
            while (length2 >= 0) {
            }
            while (entry3 != null) {
            }
            return;
        }
        if (!this.zzdwo) {
            zzb((zzbcy<T>) t, zzbeyVar);
            return;
        }
        if (this.zzdwm) {
            zzbbg<?> zzm4 = this.zzdww.zzm(t);
            if (!zzm4.isEmpty()) {
                it = zzm4.iterator();
                entry = (Map.Entry) it.next();
                length = this.zzdwg.length;
                entry2 = entry;
                for (i = 0; i < length; i += 4) {
                    int zzct2 = zzct(i);
                    int i3 = this.zzdwg[i];
                    while (entry2 != null && this.zzdww.zza(entry2) <= i3) {
                        this.zzdww.zza(zzbeyVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch ((zzct2 & 267386880) >>> 20) {
                        case 0:
                            if (zza((zzbcy<T>) t, i)) {
                                zzo = zzbek.zzo(t, zzct2 & 1048575);
                                zzbeyVar.zza(i3, zzo);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zza((zzbcy<T>) t, i)) {
                                zzn = zzbek.zzn(t, zzct2 & 1048575);
                                zzbeyVar.zza(i3, zzn);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zza((zzbcy<T>) t, i)) {
                                zzl = zzbek.zzl(t, zzct2 & 1048575);
                                zzbeyVar.zzi(i3, zzl);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zza((zzbcy<T>) t, i)) {
                                zzl2 = zzbek.zzl(t, zzct2 & 1048575);
                                zzbeyVar.zza(i3, zzl2);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zza((zzbcy<T>) t, i)) {
                                zzk = zzbek.zzk(t, zzct2 & 1048575);
                                zzbeyVar.zzm(i3, zzk);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zza((zzbcy<T>) t, i)) {
                                zzl3 = zzbek.zzl(t, zzct2 & 1048575);
                                zzbeyVar.zzc(i3, zzl3);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zza((zzbcy<T>) t, i)) {
                                zzk2 = zzbek.zzk(t, zzct2 & 1048575);
                                zzbeyVar.zzp(i3, zzk2);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zza((zzbcy<T>) t, i)) {
                                zzm = zzbek.zzm(t, zzct2 & 1048575);
                                zzbeyVar.zzf(i3, zzm);
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (!zza((zzbcy<T>) t, i)) {
                                break;
                            }
                            zza(i3, zzbek.zzp(t, zzct2 & 1048575), zzbeyVar);
                            break;
                        case 9:
                            if (!zza((zzbcy<T>) t, i)) {
                                break;
                            }
                            zzbeyVar.zza(i3, zzbek.zzp(t, zzct2 & 1048575), zzcq(i));
                            break;
                        case 10:
                            if (!zza((zzbcy<T>) t, i)) {
                                break;
                            }
                            zzbeyVar.zza(i3, (zzbah) zzbek.zzp(t, zzct2 & 1048575));
                            break;
                        case 11:
                            if (zza((zzbcy<T>) t, i)) {
                                zzk3 = zzbek.zzk(t, zzct2 & 1048575);
                                zzbeyVar.zzn(i3, zzk3);
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zza((zzbcy<T>) t, i)) {
                                zzk4 = zzbek.zzk(t, zzct2 & 1048575);
                                zzbeyVar.zzx(i3, zzk4);
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zza((zzbcy<T>) t, i)) {
                                zzk5 = zzbek.zzk(t, zzct2 & 1048575);
                                zzbeyVar.zzw(i3, zzk5);
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zza((zzbcy<T>) t, i)) {
                                zzl4 = zzbek.zzl(t, zzct2 & 1048575);
                                zzbeyVar.zzj(i3, zzl4);
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zza((zzbcy<T>) t, i)) {
                                zzk6 = zzbek.zzk(t, zzct2 & 1048575);
                                zzbeyVar.zzo(i3, zzk6);
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zza((zzbcy<T>) t, i)) {
                                zzl5 = zzbek.zzl(t, zzct2 & 1048575);
                                zzbeyVar.zzb(i3, zzl5);
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (!zza((zzbcy<T>) t, i)) {
                                break;
                            }
                            zzbeyVar.zzb(i3, zzbek.zzp(t, zzct2 & 1048575), zzcq(i));
                            break;
                        case 18:
                            zzbdo.zza(this.zzdwg[i], (List<Double>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 19:
                            zzbdo.zzb(this.zzdwg[i], (List<Float>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 20:
                            zzbdo.zzc(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 21:
                            zzbdo.zzd(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 22:
                            zzbdo.zzh(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 23:
                            zzbdo.zzf(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 24:
                            zzbdo.zzk(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 25:
                            zzbdo.zzn(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 26:
                            zzbdo.zza(this.zzdwg[i], (List<String>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar);
                            break;
                        case 27:
                            zzbdo.zza(this.zzdwg[i], (List<?>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, zzcq(i));
                            break;
                        case 28:
                            zzbdo.zzb(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar);
                            break;
                        case 29:
                            zzbdo.zzi(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 30:
                            zzbdo.zzm(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 31:
                            zzbdo.zzl(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 32:
                            zzbdo.zzg(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 33:
                            zzbdo.zzj(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 34:
                            zzbdo.zze(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                            break;
                        case 35:
                            zzbdo.zza(this.zzdwg[i], (List<Double>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 36:
                            zzbdo.zzb(this.zzdwg[i], (List<Float>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 37:
                            zzbdo.zzc(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 38:
                            zzbdo.zzd(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 39:
                            zzbdo.zzh(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 40:
                            zzbdo.zzf(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 41:
                            zzbdo.zzk(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 42:
                            zzbdo.zzn(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 43:
                            zzbdo.zzi(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 44:
                            zzbdo.zzm(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 45:
                            zzbdo.zzl(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 46:
                            zzbdo.zzg(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 47:
                            zzbdo.zzj(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 48:
                            zzbdo.zze(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                            break;
                        case 49:
                            zzbdo.zzb(this.zzdwg[i], (List<?>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, zzcq(i));
                            break;
                        case 50:
                            zza(zzbeyVar, i3, zzbek.zzp(t, zzct2 & 1048575), i);
                            break;
                        case 51:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzo = zzf(t, zzct2 & 1048575);
                                zzbeyVar.zza(i3, zzo);
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzn = zzg(t, zzct2 & 1048575);
                                zzbeyVar.zza(i3, zzn);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzl = zzi(t, zzct2 & 1048575);
                                zzbeyVar.zzi(i3, zzl);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzl2 = zzi(t, zzct2 & 1048575);
                                zzbeyVar.zza(i3, zzl2);
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzk = zzh(t, zzct2 & 1048575);
                                zzbeyVar.zzm(i3, zzk);
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzl3 = zzi(t, zzct2 & 1048575);
                                zzbeyVar.zzc(i3, zzl3);
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzk2 = zzh(t, zzct2 & 1048575);
                                zzbeyVar.zzp(i3, zzk2);
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzm = zzj(t, zzct2 & 1048575);
                                zzbeyVar.zzf(i3, zzm);
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (!zza((zzbcy<T>) t, i3, i)) {
                                break;
                            }
                            zza(i3, zzbek.zzp(t, zzct2 & 1048575), zzbeyVar);
                            break;
                        case 60:
                            if (!zza((zzbcy<T>) t, i3, i)) {
                                break;
                            }
                            zzbeyVar.zza(i3, zzbek.zzp(t, zzct2 & 1048575), zzcq(i));
                            break;
                        case 61:
                            if (!zza((zzbcy<T>) t, i3, i)) {
                                break;
                            }
                            zzbeyVar.zza(i3, (zzbah) zzbek.zzp(t, zzct2 & 1048575));
                            break;
                        case 62:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzk3 = zzh(t, zzct2 & 1048575);
                                zzbeyVar.zzn(i3, zzk3);
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzk4 = zzh(t, zzct2 & 1048575);
                                zzbeyVar.zzx(i3, zzk4);
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzk5 = zzh(t, zzct2 & 1048575);
                                zzbeyVar.zzw(i3, zzk5);
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzl4 = zzi(t, zzct2 & 1048575);
                                zzbeyVar.zzj(i3, zzl4);
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzk6 = zzh(t, zzct2 & 1048575);
                                zzbeyVar.zzo(i3, zzk6);
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zza((zzbcy<T>) t, i3, i)) {
                                zzl5 = zzi(t, zzct2 & 1048575);
                                zzbeyVar.zzb(i3, zzl5);
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (!zza((zzbcy<T>) t, i3, i)) {
                                break;
                            }
                            zzbeyVar.zzb(i3, zzbek.zzp(t, zzct2 & 1048575), zzcq(i));
                            break;
                    }
                }
                while (entry2 != null) {
                    this.zzdww.zza(zzbeyVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zza(this.zzdwv, t, zzbeyVar);
            }
        }
        it = null;
        entry = null;
        length = this.zzdwg.length;
        entry2 = entry;
        while (i < length) {
        }
        while (entry2 != null) {
        }
        zza(this.zzdwv, t, zzbeyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0164, code lost:
    
        if (r0 == r15) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0166, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0189, code lost:
    
        if (r0 == r15) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a2, code lost:
    
        if (r0 == r15) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzbae zzbaeVar) throws IOException {
        byte b2;
        int i3;
        Unsafe unsafe;
        int i4;
        int zzb;
        long j;
        Object zza;
        int i5;
        zzbcy<T> zzbcyVar = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i6 = i2;
        zzbae zzbaeVar2 = zzbaeVar;
        if (!zzbcyVar.zzdwo) {
            zza((zzbcy<T>) t, bArr, i, i2, 0, zzbaeVar);
            return;
        }
        Unsafe unsafe2 = zzdwf;
        int i7 = i;
        while (i7 < i6) {
            int i8 = i7 + 1;
            byte b3 = bArr2[i7];
            if (b3 < 0) {
                i3 = zzbad.zza(b3, bArr2, i8, zzbaeVar2);
                b2 = zzbaeVar2.zzdpl;
            } else {
                b2 = b3;
                i3 = i8;
            }
            int i9 = b2 >>> 3;
            int i10 = b2 & 7;
            int zzcw = zzbcyVar.zzcw(i9);
            if (zzcw >= 0) {
                int i11 = zzbcyVar.zzdwg[zzcw + 1];
                int i12 = (267386880 & i11) >>> 20;
                long j2 = 1048575 & i11;
                if (i12 <= 17) {
                    switch (i12) {
                        case 0:
                            if (i10 != 1) {
                                break;
                            } else {
                                zzbek.zza(t2, j2, zzbad.zzg(bArr2, i3));
                                i7 = i3 + 8;
                                break;
                            }
                        case 1:
                            if (i10 != 5) {
                                break;
                            } else {
                                zzbek.zza((Object) t2, j2, zzbad.zzh(bArr2, i3));
                                i7 = i3 + 4;
                                break;
                            }
                        case 2:
                        case 3:
                            if (i10 != 0) {
                                break;
                            } else {
                                zzb = zzbad.zzb(bArr2, i3, zzbaeVar2);
                                j = zzbaeVar2.zzdpm;
                                unsafe2.putLong(t, j2, j);
                                i7 = zzb;
                                break;
                            }
                        case 4:
                        case 11:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = zzbad.zza(bArr2, i3, zzbaeVar2);
                                i5 = zzbaeVar2.zzdpl;
                                unsafe2.putInt(t2, j2, i5);
                                break;
                            }
                        case 5:
                        case 14:
                            if (i10 != 1) {
                                break;
                            } else {
                                unsafe2.putLong(t, j2, zzbad.zzf(bArr2, i3));
                                i7 = i3 + 8;
                                break;
                            }
                        case 6:
                        case 13:
                            if (i10 != 5) {
                                break;
                            } else {
                                unsafe2.putInt(t2, j2, zzbad.zze(bArr2, i3));
                                i7 = i3 + 4;
                                break;
                            }
                        case 7:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = zzbad.zzb(bArr2, i3, zzbaeVar2);
                                zzbek.zza(t2, j2, zzbaeVar2.zzdpm != 0);
                                break;
                            }
                        case 8:
                            if (i10 != 2) {
                                break;
                            } else {
                                i7 = (536870912 & i11) == 0 ? zzbad.zzc(bArr2, i3, zzbaeVar2) : zzbad.zzd(bArr2, i3, zzbaeVar2);
                                zza = zzbaeVar2.zzdpn;
                                unsafe2.putObject(t2, j2, zza);
                                break;
                            }
                        case 9:
                            if (i10 != 2) {
                                break;
                            } else {
                                i7 = zza(zzbcyVar.zzcq(zzcw), bArr2, i3, i6, zzbaeVar2);
                                Object object = unsafe2.getObject(t2, j2);
                                if (object != null) {
                                    zza = zzbbq.zza(object, zzbaeVar2.zzdpn);
                                    unsafe2.putObject(t2, j2, zza);
                                    break;
                                }
                                zza = zzbaeVar2.zzdpn;
                                unsafe2.putObject(t2, j2, zza);
                            }
                        case 10:
                            if (i10 != 2) {
                                break;
                            } else {
                                i7 = zzbad.zze(bArr2, i3, zzbaeVar2);
                                zza = zzbaeVar2.zzdpn;
                                unsafe2.putObject(t2, j2, zza);
                                break;
                            }
                        case 12:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = zzbad.zza(bArr2, i3, zzbaeVar2);
                                i5 = zzbaeVar2.zzdpl;
                                unsafe2.putInt(t2, j2, i5);
                                break;
                            }
                        case 15:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = zzbad.zza(bArr2, i3, zzbaeVar2);
                                i5 = zzbaq.zzbu(zzbaeVar2.zzdpl);
                                unsafe2.putInt(t2, j2, i5);
                                break;
                            }
                        case 16:
                            if (i10 != 0) {
                                break;
                            } else {
                                zzb = zzbad.zzb(bArr2, i3, zzbaeVar2);
                                j = zzbaq.zzl(zzbaeVar2.zzdpm);
                                unsafe2.putLong(t, j2, j);
                                i7 = zzb;
                                break;
                            }
                    }
                } else if (i12 != 27) {
                    if (i12 <= 49) {
                        unsafe = unsafe2;
                        int i13 = i3;
                        i7 = zza((zzbcy<T>) t, bArr, i3, i2, b2, i9, i10, zzcw, i11, i12, j2, zzbaeVar);
                    } else {
                        unsafe = unsafe2;
                        i4 = i3;
                        if (i12 != 50) {
                            i7 = zza((zzbcy<T>) t, bArr, i4, i2, b2, i9, i10, i11, i12, j2, zzcw, zzbaeVar);
                        } else if (i10 == 2) {
                            i7 = zza(t, bArr, i4, i2, zzcw, i9, j2, zzbaeVar);
                        }
                    }
                    t2 = t;
                    bArr2 = bArr;
                    zzbaeVar2 = zzbaeVar;
                    unsafe2 = unsafe;
                    i6 = i2;
                    zzbcyVar = this;
                } else if (i10 == 2) {
                    zzbbt zzbbtVar = (zzbbt) unsafe2.getObject(t2, j2);
                    if (!zzbbtVar.zzaay()) {
                        int size = zzbbtVar.size();
                        zzbbtVar = zzbbtVar.zzbm(size == 0 ? 10 : size << 1);
                        unsafe2.putObject(t2, j2, zzbbtVar);
                    }
                    i7 = zza((zzbdm<?>) zzbcyVar.zzcq(zzcw), b2, bArr, i3, i2, (zzbbt<?>) zzbbtVar, zzbaeVar);
                }
                int i14 = i4;
                i7 = zza(b2, bArr, i14, i2, t, zzbaeVar);
                t2 = t;
                bArr2 = bArr;
                zzbaeVar2 = zzbaeVar;
                unsafe2 = unsafe;
                i6 = i2;
                zzbcyVar = this;
            }
            unsafe = unsafe2;
            i4 = i3;
            int i142 = i4;
            i7 = zza(b2, bArr, i142, i2, t, zzbaeVar);
            t2 = t;
            bArr2 = bArr;
            zzbaeVar2 = zzbaeVar;
            unsafe2 = unsafe;
            i6 = i2;
            zzbcyVar = this;
        }
        if (i7 != i6) {
            throw zzbbu.zzadr();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.google.android.gms.internal.ads.zzbdm] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.zzbdm] */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzaa(T t) {
        int[] iArr;
        int i;
        boolean z;
        boolean z2;
        int i2 = 1;
        if (this.zzdwq == null || this.zzdwq.length == 0) {
            return true;
        }
        int[] iArr2 = this.zzdwq;
        int length = iArr2.length;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (i3 < length) {
            int i6 = iArr2[i3];
            int zzcw = zzcw(i6);
            int zzct = zzct(zzcw);
            if (this.zzdwo) {
                iArr = iArr2;
                i = 0;
            } else {
                int i7 = this.zzdwg[zzcw + 2];
                int i8 = i7 & 1048575;
                i = i2 << (i7 >>> 20);
                if (i8 != i4) {
                    iArr = iArr2;
                    i5 = zzdwf.getInt(t, i8);
                    i4 = i8;
                } else {
                    iArr = iArr2;
                }
            }
            if (((268435456 & zzct) != 0) && !zza((zzbcy<T>) t, zzcw, i5, i)) {
                return false;
            }
            int i9 = (267386880 & zzct) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 != 60 && i9 != 68) {
                        switch (i9) {
                            case 50:
                                Map<?, ?> zzt = this.zzdwx.zzt(zzbek.zzp(t, zzct & 1048575));
                                if (!zzt.isEmpty()) {
                                    if (this.zzdwx.zzx(zzcr(zzcw)).zzdwa.zzagl() == zzbex.MESSAGE) {
                                        ?? r4 = 0;
                                        for (Object obj : zzt.values()) {
                                            r4 = r4;
                                            if (r4 == 0) {
                                                r4 = zzbdg.zzaeo().zze(obj.getClass());
                                            }
                                            if (!r4.zzaa(obj)) {
                                                z2 = false;
                                                if (z2) {
                                                    return false;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                }
                        }
                    } else if (zza((zzbcy<T>) t, i6, zzcw) && !zza(t, zzct, zzcq(zzcw))) {
                        return false;
                    }
                }
                List list = (List) zzbek.zzp(t, zzct & 1048575);
                if (!list.isEmpty()) {
                    ?? zzcq = zzcq(zzcw);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!zzcq.zzaa(list.get(i10))) {
                            z = false;
                            if (z) {
                                return false;
                            }
                        }
                    }
                }
                z = true;
                if (z) {
                }
            } else if (zza((zzbcy<T>) t, zzcw, i5, i) && !zza(t, zzct, zzcq(zzcw))) {
                return false;
            }
            i3++;
            iArr2 = iArr;
            i2 = 1;
        }
        return !this.zzdwm || this.zzdww.zzm(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzc(T t, T t2) {
        if (t2 == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < this.zzdwg.length; i += 4) {
            int zzct = zzct(i);
            long j = 1048575 & zzct;
            int i2 = this.zzdwg[i];
            switch ((zzct & 267386880) >>> 20) {
                case 0:
                    if (zza((zzbcy<T>) t2, i)) {
                        zzbek.zza(t, j, zzbek.zzo(t2, j));
                        zzb((zzbcy<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzbcy<T>) t2, i)) {
                        zzbek.zza((Object) t, j, zzbek.zzn(t2, j));
                        zzb((zzbcy<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza((Object) t, j, zzbek.zzl(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 3:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza((Object) t, j, zzbek.zzl(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 4:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 5:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza((Object) t, j, zzbek.zzl(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 6:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 7:
                    if (zza((zzbcy<T>) t2, i)) {
                        zzbek.zza(t, j, zzbek.zzm(t2, j));
                        zzb((zzbcy<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza(t, j, zzbek.zzp(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 9:
                case 17:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza(t, j, zzbek.zzp(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 11:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 12:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 13:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 14:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza((Object) t, j, zzbek.zzl(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 15:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 16:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza((Object) t, j, zzbek.zzl(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
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
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzdwu.zza(t, t2, j);
                    break;
                case 50:
                    zzbdo.zza(this.zzdwx, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zza((zzbcy<T>) t2, i2, i)) {
                        break;
                    }
                    zzbek.zza(t, j, zzbek.zzp(t2, j));
                    zzb((zzbcy<T>) t, i2, i);
                    break;
                case 60:
                case 68:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zza((zzbcy<T>) t2, i2, i)) {
                        break;
                    }
                    zzbek.zza(t, j, zzbek.zzp(t2, j));
                    zzb((zzbcy<T>) t, i2, i);
                    break;
            }
        }
        if (this.zzdwo) {
            return;
        }
        zzbdo.zza(this.zzdwv, t, t2);
        if (this.zzdwm) {
            zzbdo.zza(this.zzdww, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzo(T t) {
        if (this.zzdwr != null) {
            for (int i : this.zzdwr) {
                long zzct = zzct(i) & 1048575;
                Object zzp = zzbek.zzp(t, zzct);
                if (zzp != null) {
                    zzbek.zza(t, zzct, this.zzdwx.zzv(zzp));
                }
            }
        }
        if (this.zzdws != null) {
            int length = this.zzdws.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.zzdwu.zzb(t, r0[i2]);
            }
        }
        this.zzdwv.zzo(t);
        if (this.zzdwm) {
            this.zzdww.zzo(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0127, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0211, code lost:
    
        r3 = (com.google.android.gms.internal.ads.zzbav.zzcd(r3) + com.google.android.gms.internal.ads.zzbav.zzcf(r5)) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020d, code lost:
    
        r2.putInt(r21, r14, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0139, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x014b, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015d, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x016f, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0181, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0193, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a5, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b6, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c7, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d8, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e9, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01fa, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x020b, code lost:
    
        if (r20.zzdwp != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0331, code lost:
    
        if ((r5 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0418, code lost:
    
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r21, r14, r3) != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x06ba, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzbav.zzc(r14, (com.google.android.gms.internal.ads.zzbcu) r2.getObject(r21, r9), zzcq(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0438, code lost:
    
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r21, r14, r3) != false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x06e7, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzbav.zzh(r14, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0440, code lost:
    
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r21, r14, r3) != false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06f2, code lost:
    
        r9 = com.google.android.gms.internal.ads.zzbav.zzu(r14, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0460, code lost:
    
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r21, r14, r3) != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0717, code lost:
    
        r4 = r2.getObject(r21, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x071b, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzbav.zzc(r14, (com.google.android.gms.internal.ads.zzbah) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0468, code lost:
    
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r21, r14, r3) != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0726, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzbdo.zzc(r14, r2.getObject(r21, r9), zzcq(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0478, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0741, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzbav.zzg(r14, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0480, code lost:
    
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r21, r14, r3) != false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x074d, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzbav.zzg(r14, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0518, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0602, code lost:
    
        r4 = (com.google.android.gms.internal.ads.zzbav.zzcd(r14) + com.google.android.gms.internal.ads.zzbav.zzcf(r9)) + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x05fe, code lost:
    
        r2.putInt(r21, r4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x052a, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x053c, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x054e, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0560, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0572, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0584, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0596, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x05a7, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x05b8, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x05c9, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x05da, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x05eb, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x05fc, code lost:
    
        if (r20.zzdwp != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x06b8, code lost:
    
        if ((r12 & r16) != 0) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x06e5, code lost:
    
        if ((r12 & r16) != 0) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x06f0, code lost:
    
        if ((r12 & r16) != 0) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0715, code lost:
    
        if ((r12 & r16) != 0) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0724, code lost:
    
        if ((r12 & r16) != 0) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x073e, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x074b, code lost:
    
        if ((r12 & r16) != 0) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ab, code lost:
    
        if ((r5 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0334, code lost:
    
        r3 = com.google.android.gms.internal.ads.zzbav.zzg(r3, (java.lang.String) r5);
     */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzy(T t) {
        int i;
        int i2;
        long j;
        int zzd;
        Object object;
        int i3;
        int i4;
        int i5;
        long j2;
        int zzw;
        int zzan;
        int zzb;
        long zzl;
        long zzl2;
        int zzk;
        Object zzp;
        int zzk2;
        int zzk3;
        int zzk4;
        long zzl3;
        int zzw2;
        int zzan2;
        int i6 = 267386880;
        if (!this.zzdwo) {
            Unsafe unsafe = zzdwf;
            int i7 = 0;
            int i8 = 0;
            int i9 = -1;
            int i10 = 0;
            while (i7 < this.zzdwg.length) {
                int zzct = zzct(i7);
                int i11 = this.zzdwg[i7];
                int i12 = (zzct & 267386880) >>> 20;
                if (i12 <= 17) {
                    i = this.zzdwg[i7 + 2];
                    int i13 = i & 1048575;
                    i2 = 1 << (i >>> 20);
                    if (i13 != i9) {
                        i10 = unsafe.getInt(t, i13);
                        i9 = i13;
                    }
                } else {
                    i = (!this.zzdwp || i12 < zzbbj.DOUBLE_LIST_PACKED.id() || i12 > zzbbj.SINT64_LIST_PACKED.id()) ? 0 : this.zzdwg[i7 + 2] & 1048575;
                    i2 = 0;
                }
                long j3 = zzct & 1048575;
                switch (i12) {
                    case 0:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            i8 += zzbav.zzb(i11, 0.0d);
                            break;
                        }
                        break;
                    case 1:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            i8 += zzbav.zzb(i11, 0.0f);
                            break;
                        }
                    case 2:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            zzd = zzbav.zzd(i11, unsafe.getLong(t, j3));
                            i8 += zzd;
                        }
                        break;
                    case 3:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            zzd = zzbav.zze(i11, unsafe.getLong(t, j3));
                            i8 += zzd;
                        }
                        break;
                    case 4:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            zzd = zzbav.zzq(i11, unsafe.getInt(t, j3));
                            i8 += zzd;
                        }
                        break;
                    case 5:
                        if ((i10 & i2) != 0) {
                            i8 += zzbav.zzg(i11, 0L);
                            j = 0;
                            break;
                        }
                        j = 0;
                        break;
                    case 6:
                        if ((i10 & i2) != 0) {
                            i8 += zzbav.zzt(i11, 0);
                            j = 0;
                            break;
                        }
                        j = 0;
                    case 7:
                        break;
                    case 8:
                        if ((i10 & i2) != 0) {
                            object = unsafe.getObject(t, j3);
                            break;
                        }
                        j = 0;
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        if ((i10 & i2) != 0) {
                            i3 = unsafe.getInt(t, j3);
                            zzw = zzbav.zzr(i11, i3);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 12:
                        if ((i10 & i2) != 0) {
                            i4 = unsafe.getInt(t, j3);
                            zzw = zzbav.zzv(i11, i4);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        if ((i10 & i2) != 0) {
                            i5 = unsafe.getInt(t, j3);
                            zzw = zzbav.zzs(i11, i5);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 16:
                        if ((i10 & i2) != 0) {
                            j2 = unsafe.getLong(t, j3);
                            zzw = zzbav.zzf(i11, j2);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 17:
                        break;
                    case 18:
                    case 23:
                    case 32:
                        zzw = zzbdo.zzw(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 19:
                    case 24:
                    case 31:
                        zzw = zzbdo.zzv(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 20:
                        zzw = zzbdo.zzo(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 21:
                        zzw = zzbdo.zzp(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 22:
                        zzw = zzbdo.zzs(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 25:
                        zzw = zzbdo.zzx(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 26:
                        zzw = zzbdo.zzc(i11, (List) unsafe.getObject(t, j3));
                        i8 += zzw;
                        j = 0;
                        break;
                    case 27:
                        zzw = zzbdo.zzc(i11, (List<?>) unsafe.getObject(t, j3), zzcq(i7));
                        i8 += zzw;
                        j = 0;
                        break;
                    case 28:
                        zzw = zzbdo.zzd(i11, (List<zzbah>) unsafe.getObject(t, j3));
                        i8 += zzw;
                        j = 0;
                        break;
                    case 29:
                        zzw = zzbdo.zzt(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 30:
                        zzw = zzbdo.zzr(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 33:
                        zzw = zzbdo.zzu(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 34:
                        zzw = zzbdo.zzq(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 35:
                        zzan = zzbdo.zzan((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 36:
                        zzan = zzbdo.zzam((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 37:
                        zzan = zzbdo.zzaf((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 38:
                        zzan = zzbdo.zzag((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 39:
                        zzan = zzbdo.zzaj((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 40:
                        zzan = zzbdo.zzan((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 41:
                        zzan = zzbdo.zzam((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 42:
                        zzan = zzbdo.zzao((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 43:
                        zzan = zzbdo.zzak((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 44:
                        zzan = zzbdo.zzai((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 45:
                        zzan = zzbdo.zzam((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 46:
                        zzan = zzbdo.zzan((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 47:
                        zzan = zzbdo.zzal((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 48:
                        zzan = zzbdo.zzah((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 49:
                        zzw = zzbdo.zzd(i11, (List) unsafe.getObject(t, j3), zzcq(i7));
                        i8 += zzw;
                        j = 0;
                        break;
                    case 50:
                        zzw = this.zzdwx.zzb(i11, unsafe.getObject(t, j3), zzcr(i7));
                        i8 += zzw;
                        j = 0;
                        break;
                    case 51:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            zzw = zzbav.zzb(i11, 0.0d);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 52:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            zzb = zzbav.zzb(i11, 0.0f);
                            i8 += zzb;
                        }
                        j = 0;
                        break;
                    case 53:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            zzw = zzbav.zzd(i11, zzi(t, j3));
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 54:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            zzw = zzbav.zze(i11, zzi(t, j3));
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 55:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            zzw = zzbav.zzq(i11, zzh(t, j3));
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 56:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            zzw = zzbav.zzg(i11, 0L);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 57:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            zzb = zzbav.zzt(i11, 0);
                            i8 += zzb;
                        }
                        j = 0;
                        break;
                    case 58:
                        break;
                    case 59:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            object = unsafe.getObject(t, j3);
                            break;
                        }
                        j = 0;
                        break;
                    case 60:
                        break;
                    case 61:
                        break;
                    case 62:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            i3 = zzh(t, j3);
                            zzw = zzbav.zzr(i11, i3);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 63:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            i4 = zzh(t, j3);
                            zzw = zzbav.zzv(i11, i4);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 64:
                        break;
                    case 65:
                        break;
                    case 66:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            i5 = zzh(t, j3);
                            zzw = zzbav.zzs(i11, i5);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 67:
                        if (zza((zzbcy<T>) t, i11, i7)) {
                            j2 = zzi(t, j3);
                            zzw = zzbav.zzf(i11, j2);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 68:
                        break;
                    default:
                        j = 0;
                        break;
                }
                i7 += 4;
            }
            int zza = i8 + zza(this.zzdwv, t);
            return this.zzdwm ? zza + this.zzdww.zzm(t).zzacw() : zza;
        }
        Unsafe unsafe2 = zzdwf;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.zzdwg.length) {
            int zzct2 = zzct(i14);
            int i16 = (zzct2 & i6) >>> 20;
            int i17 = this.zzdwg[i14];
            long j4 = zzct2 & 1048575;
            int i18 = (i16 < zzbbj.DOUBLE_LIST_PACKED.id() || i16 > zzbbj.SINT64_LIST_PACKED.id()) ? 0 : this.zzdwg[i14 + 2] & 1048575;
            switch (i16) {
                case 0:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzb(i17, 0.0d);
                    i15 += zzw2;
                    break;
                case 1:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzb(i17, 0.0f);
                    i15 += zzw2;
                    break;
                case 2:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    } else {
                        zzl = zzbek.zzl(t, j4);
                        zzw2 = zzbav.zzd(i17, zzl);
                        i15 += zzw2;
                        break;
                    }
                case 3:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    } else {
                        zzl2 = zzbek.zzl(t, j4);
                        zzw2 = zzbav.zze(i17, zzl2);
                        i15 += zzw2;
                        break;
                    }
                case 4:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    } else {
                        zzk = zzbek.zzk(t, j4);
                        zzw2 = zzbav.zzq(i17, zzk);
                        i15 += zzw2;
                        break;
                    }
                case 5:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzg(i17, 0L);
                    i15 += zzw2;
                    break;
                case 6:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzt(i17, 0);
                    i15 += zzw2;
                    break;
                case 7:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzg(i17, true);
                    i15 += zzw2;
                    break;
                case 8:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    } else {
                        zzp = zzbek.zzp(t, j4);
                        break;
                    }
                case 9:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzbdo.zzc(i17, zzbek.zzp(t, j4), zzcq(i14));
                    i15 += zzw2;
                    break;
                case 10:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    }
                    zzp = zzbek.zzp(t, j4);
                    zzw2 = zzbav.zzc(i17, (zzbah) zzp);
                    i15 += zzw2;
                    break;
                case 11:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    } else {
                        zzk2 = zzbek.zzk(t, j4);
                        zzw2 = zzbav.zzr(i17, zzk2);
                        i15 += zzw2;
                        break;
                    }
                case 12:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    } else {
                        zzk3 = zzbek.zzk(t, j4);
                        zzw2 = zzbav.zzv(i17, zzk3);
                        i15 += zzw2;
                        break;
                    }
                case 13:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzu(i17, 0);
                    i15 += zzw2;
                    break;
                case 14:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzh(i17, 0L);
                    i15 += zzw2;
                    break;
                case 15:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    } else {
                        zzk4 = zzbek.zzk(t, j4);
                        zzw2 = zzbav.zzs(i17, zzk4);
                        i15 += zzw2;
                        break;
                    }
                case 16:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    } else {
                        zzl3 = zzbek.zzl(t, j4);
                        zzw2 = zzbav.zzf(i17, zzl3);
                        i15 += zzw2;
                        break;
                    }
                case 17:
                    if (!zza((zzbcy<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzc(i17, (zzbcu) zzbek.zzp(t, j4), zzcq(i14));
                    i15 += zzw2;
                    break;
                case 18:
                case 23:
                case 32:
                    zzw2 = zzbdo.zzw(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 19:
                case 24:
                case 31:
                    zzw2 = zzbdo.zzv(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 20:
                    zzw2 = zzbdo.zzo(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 21:
                    zzw2 = zzbdo.zzp(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 22:
                    zzw2 = zzbdo.zzs(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 25:
                    zzw2 = zzbdo.zzx(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 26:
                    zzw2 = zzbdo.zzc(i17, zze(t, j4));
                    i15 += zzw2;
                    break;
                case 27:
                    zzw2 = zzbdo.zzc(i17, (List<?>) zze(t, j4), zzcq(i14));
                    i15 += zzw2;
                    break;
                case 28:
                    zzw2 = zzbdo.zzd(i17, (List<zzbah>) zze(t, j4));
                    i15 += zzw2;
                    break;
                case 29:
                    zzw2 = zzbdo.zzt(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 30:
                    zzw2 = zzbdo.zzr(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 33:
                    zzw2 = zzbdo.zzu(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 34:
                    zzw2 = zzbdo.zzq(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 35:
                    zzan2 = zzbdo.zzan((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzan2 = zzbdo.zzam((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzan2 = zzbdo.zzaf((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzan2 = zzbdo.zzag((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzan2 = zzbdo.zzaj((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzan2 = zzbdo.zzan((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzan2 = zzbdo.zzam((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzan2 = zzbdo.zzao((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzan2 = zzbdo.zzak((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzan2 = zzbdo.zzai((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzan2 = zzbdo.zzam((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzan2 = zzbdo.zzan((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzan2 = zzbdo.zzal((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzan2 = zzbdo.zzah((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzw2 = zzbdo.zzd(i17, zze(t, j4), zzcq(i14));
                    i15 += zzw2;
                    break;
                case 50:
                    zzw2 = this.zzdwx.zzb(i17, zzbek.zzp(t, j4), zzcr(i14));
                    i15 += zzw2;
                    break;
                case 51:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzb(i17, 0.0d);
                    i15 += zzw2;
                    break;
                case 52:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzb(i17, 0.0f);
                    i15 += zzw2;
                    break;
                case 53:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzl = zzi(t, j4);
                        zzw2 = zzbav.zzd(i17, zzl);
                        i15 += zzw2;
                        break;
                    }
                case 54:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzl2 = zzi(t, j4);
                        zzw2 = zzbav.zze(i17, zzl2);
                        i15 += zzw2;
                        break;
                    }
                case 55:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzk = zzh(t, j4);
                        zzw2 = zzbav.zzq(i17, zzk);
                        i15 += zzw2;
                        break;
                    }
                case 56:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzg(i17, 0L);
                    i15 += zzw2;
                    break;
                case 57:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzt(i17, 0);
                    i15 += zzw2;
                    break;
                case 58:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzg(i17, true);
                    i15 += zzw2;
                    break;
                case 59:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzp = zzbek.zzp(t, j4);
                        break;
                    }
                case 60:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzbdo.zzc(i17, zzbek.zzp(t, j4), zzcq(i14));
                    i15 += zzw2;
                    break;
                case 61:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    }
                    zzp = zzbek.zzp(t, j4);
                    zzw2 = zzbav.zzc(i17, (zzbah) zzp);
                    i15 += zzw2;
                    break;
                case 62:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzk2 = zzh(t, j4);
                        zzw2 = zzbav.zzr(i17, zzk2);
                        i15 += zzw2;
                        break;
                    }
                case 63:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzk3 = zzh(t, j4);
                        zzw2 = zzbav.zzv(i17, zzk3);
                        i15 += zzw2;
                        break;
                    }
                case 64:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzu(i17, 0);
                    i15 += zzw2;
                    break;
                case 65:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzh(i17, 0L);
                    i15 += zzw2;
                    break;
                case 66:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzk4 = zzh(t, j4);
                        zzw2 = zzbav.zzs(i17, zzk4);
                        i15 += zzw2;
                        break;
                    }
                case 67:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzl3 = zzi(t, j4);
                        zzw2 = zzbav.zzf(i17, zzl3);
                        i15 += zzw2;
                        break;
                    }
                case 68:
                    if (!zza((zzbcy<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzbav.zzc(i17, (zzbcu) zzbek.zzp(t, j4), zzcq(i14));
                    i15 += zzw2;
                    break;
            }
            i14 += 4;
            i6 = 267386880;
        }
        return i15 + zza(this.zzdwv, t);
    }
}
