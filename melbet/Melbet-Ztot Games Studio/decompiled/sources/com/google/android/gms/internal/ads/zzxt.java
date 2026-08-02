package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzxt extends zzxy implements zzlg {
    private static final zzfzc zzb = zzfzc.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzws
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public final Context zza;
    private final Object zzc;
    private final boolean zzd;
    private zzxi zze;
    private zzxm zzf;
    private zzh zzg;
    private final zzwo zzh;

    public zzxt(Context context) {
        zzwo zzwoVar = new zzwo();
        zzxi zzd = zzxi.zzd(context);
        this.zzc = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzh = zzwoVar;
        this.zze = zzd;
        this.zzg = zzh.zza;
        boolean z = false;
        if (context != null && zzet.zzN(context)) {
            z = true;
        }
        this.zzd = z;
        if (!z && context != null && zzet.zza >= 32) {
            this.zzf = zzxm.zza(context);
        }
        if (this.zze.zzM && context == null) {
            zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int zzb(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    protected static int zzc(zzaf zzafVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzafVar.zzd)) {
            return 4;
        }
        String zzh = zzh(str);
        String zzh2 = zzh(zzafVar.zzd);
        if (zzh2 == null || zzh == null) {
            return (z && zzh2 == null) ? 1 : 0;
        }
        if (zzh2.startsWith(zzh) || zzh.startsWith(zzh2)) {
            return 3;
        }
        int i = zzet.zza;
        return zzh2.split("-", 2)[0].equals(zzh.split("-", 2)[0]) ? 2 : 0;
    }

    protected static String zzh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r1 != 3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ boolean zzm(zzxt zzxtVar, zzaf zzafVar) {
        boolean z;
        char c;
        zzxm zzxmVar;
        synchronized (zzxtVar.zzc) {
            z = true;
            if (zzxtVar.zze.zzM && !zzxtVar.zzd && zzafVar.zzz > 2) {
                String str = zzafVar.zzm;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (str.equals("audio/eac3-joc")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078296:
                            if (str.equals("audio/ac3")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078297:
                            if (str.equals("audio/ac4")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504578661:
                            if (str.equals("audio/eac3")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                            }
                        }
                    }
                    if (zzet.zza >= 32) {
                        zzxm zzxmVar2 = zzxtVar.zzf;
                        if (zzxmVar2 != null) {
                            if (!zzxmVar2.zzg()) {
                            }
                        }
                    }
                }
                if (zzet.zza < 32 || (zzxmVar = zzxtVar.zzf) == null || !zzxmVar.zzg() || !zzxmVar.zze() || !zzxtVar.zzf.zzf() || !zzxtVar.zzf.zzd(zzxtVar.zzg, zzafVar)) {
                    z = false;
                }
            }
        }
        return z;
    }

    private static void zzt(zzwi zzwiVar, zzci zzciVar, Map map) {
        for (int i = 0; i < zzwiVar.zzb; i++) {
            if (((zzce) zzciVar.zzA.get(zzwiVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z;
        zzxm zzxmVar;
        synchronized (this.zzc) {
            z = false;
            if (this.zze.zzM && !this.zzd && zzet.zza >= 32 && (zzxmVar = this.zzf) != null && zzxmVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static final Pair zzv(int i, zzxx zzxxVar, int[][][] iArr, zzxo zzxoVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzxx zzxxVar2 = zzxxVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzxxVar2.zzc(i2)) {
                zzwi zzd = zzxxVar2.zzd(i2);
                for (int i3 = 0; i3 < zzd.zzb; i3++) {
                    zzcd zzb2 = zzd.zzb(i3);
                    List zza = zzxoVar.zza(i2, zzb2, iArr[i2][i3]);
                    boolean[] zArr = new boolean[zzb2.zza];
                    int i4 = 0;
                    while (i4 < zzb2.zza) {
                        int i5 = i4 + 1;
                        zzxp zzxpVar = (zzxp) zza.get(i4);
                        int zzb3 = zzxpVar.zzb();
                        if (!zArr[i4] && zzb3 != 0) {
                            if (zzb3 == 1) {
                                randomAccess = zzfxr.zzn(zzxpVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzxpVar);
                                for (int i6 = i5; i6 < zzb2.zza; i6++) {
                                    zzxp zzxpVar2 = (zzxp) zza.get(i6);
                                    if (zzxpVar2.zzb() == 2 && zzxpVar.zzc(zzxpVar2)) {
                                        arrayList2.add(zzxpVar2);
                                        zArr[i6] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i4 = i5;
                    }
                }
            }
            i2++;
            zzxxVar2 = zzxxVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((zzxp) list.get(i7)).zzc;
        }
        zzxp zzxpVar3 = (zzxp) list.get(0);
        return Pair.create(new zzxu(zzxpVar3.zzb, iArr2, 0), Integer.valueOf(zzxpVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zza(zzle zzleVar) {
        synchronized (this.zzc) {
            boolean z = this.zze.zzQ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxy
    protected final Pair zzd(zzxx zzxxVar, int[][][] iArr, final int[] iArr2, zzui zzuiVar, zzcc zzccVar) throws zzhw {
        final zzxi zzxiVar;
        Pair pair;
        int i;
        final boolean z;
        int i2;
        int[] iArr3;
        int length;
        zzxv zza;
        zzxm zzxmVar;
        synchronized (this.zzc) {
            zzxiVar = this.zze;
            if (zzxiVar.zzM && zzet.zza >= 32 && (zzxmVar = this.zzf) != null) {
                Looper myLooper = Looper.myLooper();
                zzdi.zzb(myLooper);
                zzxmVar.zzb(this, myLooper);
            }
        }
        int i3 = 2;
        zzxu[] zzxuVarArr = new zzxu[2];
        zzcg zzcgVar = zzxiVar.zzs;
        Pair zzv = zzv(2, zzxxVar, iArr, new zzxo() { // from class: com.google.android.gms.internal.ads.zzwy
            /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
            @Override // com.google.android.gms.internal.ads.zzxo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List zza(int i4, zzcd zzcdVar, int[] iArr4) {
                boolean z2;
                int i5;
                int i6;
                int i7;
                Point point;
                int i8;
                int i9;
                zzxi zzxiVar2 = zzxi.this;
                int i10 = iArr2[i4];
                int i11 = zzxiVar2.zzi;
                int i12 = zzxiVar2.zzj;
                boolean z3 = zzxiVar2.zzk;
                int i13 = Integer.MAX_VALUE;
                if (i11 == Integer.MAX_VALUE) {
                    i13 = Integer.MAX_VALUE;
                } else if (i12 != Integer.MAX_VALUE) {
                    int i14 = Integer.MAX_VALUE;
                    for (int i15 = 0; i15 < zzcdVar.zza; i15++) {
                        zzaf zzb2 = zzcdVar.zzb(i15);
                        int i16 = zzb2.zzr;
                        if (i16 > 0 && (i5 = zzb2.zzs) > 0) {
                            if (z3) {
                                if ((i16 > i5) != (i11 > i12)) {
                                    i7 = i11;
                                    i6 = i12;
                                    if (i16 * i7 < i5 * i6) {
                                        int i17 = zzet.zza;
                                        point = new Point(i6, ((r12 + i16) - 1) / i16);
                                    } else {
                                        int i18 = zzet.zza;
                                        point = new Point(((r15 + i5) - 1) / i5, i7);
                                    }
                                    i8 = zzb2.zzr;
                                    i9 = zzb2.zzs * i8;
                                    if (i8 >= ((int) (point.x * 0.98f)) && zzb2.zzs >= ((int) (point.y * 0.98f)) && i9 < i14) {
                                        i14 = i9;
                                    }
                                }
                            }
                            i6 = i11;
                            i7 = i12;
                            if (i16 * i7 < i5 * i6) {
                            }
                            i8 = zzb2.zzr;
                            i9 = zzb2.zzs * i8;
                            if (i8 >= ((int) (point.x * 0.98f))) {
                                i14 = i9;
                            }
                        }
                    }
                    i13 = i14;
                }
                zzfxo zzfxoVar = new zzfxo();
                for (int i19 = 0; i19 < zzcdVar.zza; i19++) {
                    int zza2 = zzcdVar.zzb(i19).zza();
                    if (i13 != Integer.MAX_VALUE && (zza2 == -1 || zza2 > i13)) {
                        z2 = false;
                        zzfxoVar.zzf(new zzxs(i4, zzcdVar, i19, zzxiVar2, iArr4[i19], i10, z2));
                    }
                    z2 = true;
                    zzfxoVar.zzf(new zzxs(i4, zzcdVar, i19, zzxiVar2, iArr4[i19], i10, z2));
                }
                return zzfxoVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfxg.zzj().zzc((zzxs) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zzd((zzxs) obj3, (zzxs) obj4);
                    }
                }), (zzxs) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zzd((zzxs) obj3, (zzxs) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zzd((zzxs) obj3, (zzxs) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzxs) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxr
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zza((zzxs) obj3, (zzxs) obj4);
                    }
                }), (zzxs) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxr
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zza((zzxs) obj3, (zzxs) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxr
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxs.zza((zzxs) obj3, (zzxs) obj4);
                    }
                }).zza();
            }
        });
        boolean z2 = zzxiVar.zzx;
        int i4 = 4;
        if (zzv == null) {
            zzcg zzcgVar2 = zzxiVar.zzs;
            pair = zzv(4, zzxxVar, iArr, new zzxo() { // from class: com.google.android.gms.internal.ads.zzwu
                @Override // com.google.android.gms.internal.ads.zzxo
                public final List zza(int i5, zzcd zzcdVar, int[] iArr4) {
                    zzfxo zzfxoVar = new zzfxo();
                    for (int i6 = 0; i6 < zzcdVar.zza; i6++) {
                        zzfxoVar.zzf(new zzxd(i5, zzcdVar, i6, zzxi.this, iArr4[i6]));
                    }
                    return zzfxoVar.zzi();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwv
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((zzxd) ((List) obj).get(0)).compareTo((zzxd) ((List) obj2).get(0));
                }
            });
        } else {
            pair = null;
        }
        if (pair != null) {
            zzxuVarArr[((Integer) pair.second).intValue()] = (zzxu) pair.first;
        } else if (zzv != null) {
            zzxuVarArr[((Integer) zzv.second).intValue()] = (zzxu) zzv.first;
        }
        int i5 = 0;
        while (true) {
            i = 1;
            if (i5 >= 2) {
                z = false;
                break;
            }
            if (zzxxVar.zzc(i5) == 2 && zzxxVar.zzd(i5).zzb > 0) {
                z = true;
                break;
            }
            i5++;
        }
        Pair zzv2 = zzv(1, zzxxVar, iArr, new zzxo() { // from class: com.google.android.gms.internal.ads.zzww
            @Override // com.google.android.gms.internal.ads.zzxo
            public final List zza(int i6, zzcd zzcdVar, int[] iArr4) {
                final zzxt zzxtVar = zzxt.this;
                zzfuv zzfuvVar = new zzfuv() { // from class: com.google.android.gms.internal.ads.zzwt
                    @Override // com.google.android.gms.internal.ads.zzfuv
                    public final boolean zza(Object obj) {
                        return zzxt.zzm(zzxt.this, (zzaf) obj);
                    }
                };
                int i7 = iArr2[i6];
                zzfxo zzfxoVar = new zzfxo();
                for (int i8 = 0; i8 < zzcdVar.zza; i8++) {
                    int i9 = i8;
                    zzfxoVar.zzf(new zzxc(i6, zzcdVar, i9, zzxiVar, iArr4[i8], z, zzfuvVar, i7));
                }
                return zzfxoVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxc) Collections.max((List) obj)).zza((zzxc) Collections.max((List) obj2));
            }
        });
        if (zzv2 != null) {
            zzxuVarArr[((Integer) zzv2.second).intValue()] = (zzxu) zzv2.first;
        }
        final String str = zzv2 == null ? null : ((zzxu) zzv2.first).zza.zzb(((zzxu) zzv2.first).zzb[0]).zzd;
        zzcg zzcgVar3 = zzxiVar.zzs;
        int i6 = 3;
        Pair zzv3 = zzv(3, zzxxVar, iArr, new zzxo() { // from class: com.google.android.gms.internal.ads.zzxa
            @Override // com.google.android.gms.internal.ads.zzxo
            public final List zza(int i7, zzcd zzcdVar, int[] iArr4) {
                zzfxo zzfxoVar = new zzfxo();
                for (int i8 = 0; i8 < zzcdVar.zza; i8++) {
                    int i9 = i8;
                    zzfxoVar.zzf(new zzxn(i7, zzcdVar, i9, zzxi.this, iArr4[i8], str));
                }
                return zzfxoVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxn) ((List) obj).get(0)).zza((zzxn) ((List) obj2).get(0));
            }
        });
        if (zzv3 != null) {
            zzxuVarArr[((Integer) zzv3.second).intValue()] = (zzxu) zzv3.first;
        }
        int i7 = 0;
        while (i7 < i3) {
            int zzc = zzxxVar.zzc(i7);
            if (zzc != i3 && zzc != i && zzc != i6 && zzc != i4) {
                zzwi zzd = zzxxVar.zzd(i7);
                int[][] iArr4 = iArr[i7];
                zzcg zzcgVar4 = zzxiVar.zzs;
                int i8 = 0;
                zzcd zzcdVar = null;
                int i9 = 0;
                zzxe zzxeVar = null;
                while (i8 < zzd.zzb) {
                    zzcd zzb2 = zzd.zzb(i8);
                    int[] iArr5 = iArr4[i8];
                    zzxe zzxeVar2 = zzxeVar;
                    for (int i10 = 0; i10 < zzb2.zza; i10++) {
                        if (zzlf.zza(iArr5[i10], zzxiVar.zzN)) {
                            zzxe zzxeVar3 = new zzxe(zzb2.zzb(i10), iArr5[i10]);
                            if (zzxeVar2 == null || zzxeVar3.compareTo(zzxeVar2) > 0) {
                                zzcdVar = zzb2;
                                zzxeVar2 = zzxeVar3;
                                i9 = i10;
                            }
                        }
                    }
                    i8++;
                    zzxeVar = zzxeVar2;
                }
                zzxuVarArr[i7] = zzcdVar == null ? null : new zzxu(zzcdVar, new int[]{i9}, 0);
            }
            i7++;
            i3 = 2;
            i4 = 4;
            i = 1;
            i6 = 3;
        }
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < 2; i11++) {
            zzt(zzxxVar.zzd(i11), zzxiVar, hashMap);
        }
        zzt(zzxxVar.zze(), zzxiVar, hashMap);
        for (int i12 = 0; i12 < 2; i12++) {
            if (((zzce) hashMap.get(Integer.valueOf(zzxxVar.zzc(i12)))) != null) {
                throw null;
            }
        }
        int i13 = 0;
        for (int i14 = 2; i13 < i14; i14 = 2) {
            zzwi zzd2 = zzxxVar.zzd(i13);
            if (zzxiVar.zzg(i13, zzd2)) {
                if (zzxiVar.zze(i13, zzd2) != null) {
                    throw null;
                }
                zzxuVarArr[i13] = null;
            }
            i13++;
        }
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            int zzc2 = zzxxVar.zzc(i15);
            if (zzxiVar.zzf(i15) || zzxiVar.zzB.contains(Integer.valueOf(zzc2))) {
                zzxuVarArr[i15] = null;
            }
            i15++;
        }
        zzwo zzwoVar = this.zzh;
        zzyj zzq = zzq();
        zzfxr zzf = zzwp.zzf(zzxuVarArr);
        int i17 = 2;
        zzxv[] zzxvVarArr = new zzxv[2];
        int i18 = 0;
        while (i18 < i17) {
            zzxu zzxuVar = zzxuVarArr[i18];
            if (zzxuVar == null || (length = (iArr3 = zzxuVar.zzb).length) == 0) {
                i2 = i18;
            } else {
                if (length == 1) {
                    zza = new zzxw(zzxuVar.zza, iArr3[0], 0, 0, null);
                    i2 = i18;
                } else {
                    i2 = i18;
                    zza = zzwoVar.zza(zzxuVar.zza, iArr3, 0, zzq, (zzfxr) zzf.get(i18));
                }
                zzxvVarArr[i2] = zza;
            }
            i18 = i2 + 1;
            i17 = 2;
        }
        zzli[] zzliVarArr = new zzli[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            zzliVarArr[i19] = (zzxiVar.zzf(i19) || zzxiVar.zzB.contains(Integer.valueOf(zzxxVar.zzc(i19))) || (zzxxVar.zzc(i19) != -2 && zzxvVarArr[i19] == null)) ? null : zzli.zza;
        }
        boolean z3 = zzxiVar.zzO;
        zzcg zzcgVar5 = zzxiVar.zzs;
        return Pair.create(zzliVarArr, zzxvVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final zzlg zze() {
        return this;
    }

    public final zzxi zzf() {
        zzxi zzxiVar;
        synchronized (this.zzc) {
            zzxiVar = this.zze;
        }
        return zzxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzj() {
        zzxm zzxmVar;
        synchronized (this.zzc) {
            if (zzet.zza >= 32 && (zzxmVar = this.zzf) != null) {
                zzxmVar.zzc();
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzk(zzh zzhVar) {
        boolean z;
        synchronized (this.zzc) {
            z = !this.zzg.equals(zzhVar);
            this.zzg = zzhVar;
        }
        if (z) {
            zzu();
        }
    }

    public final void zzl(zzxg zzxgVar) {
        boolean z;
        zzxi zzxiVar = new zzxi(zzxgVar);
        synchronized (this.zzc) {
            z = !this.zze.equals(zzxiVar);
            this.zze = zzxiVar;
        }
        if (z) {
            if (zzxiVar.zzM && this.zza == null) {
                zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final boolean zzn() {
        return true;
    }
}
