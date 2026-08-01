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

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzxw extends zzyb implements zzma {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfyd zzc = zzfyd.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwv
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzxw.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    private static final zzfyd zzd = zzfyd.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzww
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = zzxw.zzb;
            return 0;
        }
    });
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    private zzxk zzg;
    private zzxp zzh;
    private zzk zzi;
    private final zzwr zzj;

    public zzxw(Context context) {
        zzwr zzwrVar = new zzwr();
        zzxk zzd2 = zzxk.zzd(context);
        this.zze = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzwrVar;
        this.zzg = zzd2;
        this.zzi = zzk.zza;
        boolean z = false;
        if (context != null && zzfs.zzI(context)) {
            z = true;
        }
        this.zzf = z;
        if (!z && context != null && zzfs.zza >= 32) {
            this.zzh = zzxp.zza(context);
        }
        if (this.zzg.zzR && context == null) {
            zzez.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static int zza(zzam zzamVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzamVar.zzd)) {
            return 4;
        }
        String zzg = zzg(str);
        String zzg2 = zzg(zzamVar.zzd);
        if (zzg2 == null || zzg == null) {
            return (z && zzg2 == null) ? 1 : 0;
        }
        if (zzg2.startsWith(zzg) || zzg.startsWith(zzg2)) {
            return 3;
        }
        int i = zzfs.zza;
        return zzg2.split("-", 2)[0].equals(zzg.split("-", 2)[0]) ? 2 : 0;
    }

    protected static String zzg(String str) {
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
    public static /* synthetic */ boolean zzl(zzxw zzxwVar, zzam zzamVar) {
        boolean z;
        char c;
        zzxp zzxpVar;
        synchronized (zzxwVar.zze) {
            z = true;
            if (zzxwVar.zzg.zzR && !zzxwVar.zzf && zzamVar.zzz > 2) {
                String str = zzamVar.zzm;
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
                    if (zzfs.zza >= 32) {
                        zzxp zzxpVar2 = zzxwVar.zzh;
                        if (zzxpVar2 != null) {
                            if (!zzxpVar2.zzg()) {
                            }
                        }
                    }
                }
                if (zzfs.zza < 32 || (zzxpVar = zzxwVar.zzh) == null || !zzxpVar.zzg() || !zzxpVar.zze() || !zzxwVar.zzh.zzf() || !zzxwVar.zzh.zzd(zzxwVar.zzi, zzamVar)) {
                    z = false;
                }
            }
        }
        return z;
    }

    protected static boolean zzn(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    private static void zzt(zzwl zzwlVar, zzdj zzdjVar, Map map) {
        for (int i = 0; i < zzwlVar.zzc; i++) {
            if (((zzde) zzdjVar.zzC.get(zzwlVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z;
        zzxp zzxpVar;
        synchronized (this.zze) {
            z = false;
            if (this.zzg.zzR && !this.zzf && zzfs.zza >= 32 && (zzxpVar = this.zzh) != null && zzxpVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static final Pair zzv(int i, zzya zzyaVar, int[][][] iArr, zzxr zzxrVar, Comparator comparator) {
        int i2;
        List arrayList;
        zzya zzyaVar2 = zzyaVar;
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i3 < 2) {
            if (i == zzyaVar2.zzc(i3)) {
                zzwl zzd2 = zzyaVar2.zzd(i3);
                for (int i4 = 0; i4 < zzd2.zzc; i4++) {
                    zzdc zzb2 = zzd2.zzb(i4);
                    List zza = zzxrVar.zza(i3, zzb2, iArr[i3][i4]);
                    int i5 = zzb2.zzb;
                    int i6 = 1;
                    boolean[] zArr = new boolean[1];
                    int i7 = 0;
                    while (true) {
                        int i8 = zzb2.zzb;
                        if (i7 <= 0) {
                            int i9 = i7 + 1;
                            zzxs zzxsVar = (zzxs) zza.get(i7);
                            int zzb3 = zzxsVar.zzb();
                            if (zArr[i7] || zzb3 == 0) {
                                i2 = i6;
                            } else {
                                if (zzb3 == i6) {
                                    arrayList = zzfwu.zzm(zzxsVar);
                                    i2 = i6;
                                } else {
                                    arrayList = new ArrayList();
                                    arrayList.add(zzxsVar);
                                    int i10 = i9;
                                    while (true) {
                                        int i11 = zzb2.zzb;
                                        if (i10 > 0) {
                                            break;
                                        }
                                        zzxs zzxsVar2 = (zzxs) zza.get(i10);
                                        if (zzxsVar2.zzb() == 2 && zzxsVar.zzc(zzxsVar2)) {
                                            arrayList.add(zzxsVar2);
                                            zArr[i10] = true;
                                        }
                                        i10++;
                                    }
                                    i2 = 1;
                                }
                                arrayList2.add(arrayList);
                            }
                            i6 = i2;
                            i7 = i9;
                        }
                    }
                }
            }
            i3++;
            zzyaVar2 = zzyaVar;
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i12 = 0; i12 < list.size(); i12++) {
            iArr2[i12] = ((zzxs) list.get(i12)).zzc;
        }
        zzxs zzxsVar3 = (zzxs) list.get(0);
        return Pair.create(new zzxx(zzxsVar3.zzb, iArr2, 0), Integer.valueOf(zzxsVar3.zza));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzyb
    protected final Pair zzb(zzya zzyaVar, int[][][] iArr, final int[] iArr2, zzuk zzukVar, zzda zzdaVar) throws zzit {
        final zzxk zzxkVar;
        int i;
        final boolean z;
        int i2;
        int[] iArr3;
        int length;
        zzxy zza;
        zzxp zzxpVar;
        synchronized (this.zze) {
            zzxkVar = this.zzg;
            if (zzxkVar.zzR && zzfs.zza >= 32 && (zzxpVar = this.zzh) != null) {
                Looper myLooper = Looper.myLooper();
                zzef.zzb(myLooper);
                zzxpVar.zzb(this, myLooper);
            }
        }
        int i3 = 2;
        zzxx[] zzxxVarArr = new zzxx[2];
        zzdh zzdhVar = zzxkVar.zzv;
        Pair zzv = zzv(2, zzyaVar, iArr, new zzxr() { // from class: com.google.android.gms.internal.ads.zzxa
            /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
            @Override // com.google.android.gms.internal.ads.zzxr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List zza(int i4, zzdc zzdcVar, int[] iArr4) {
                int i5;
                int i6;
                int i7;
                Point point;
                int i8;
                int i9;
                int i10 = zzxw.zzb;
                zzxk zzxkVar2 = zzxk.this;
                int i11 = iArr2[i4];
                int i12 = zzxkVar2.zzl;
                int i13 = zzxkVar2.zzm;
                boolean z2 = zzxkVar2.zzn;
                int i14 = -1;
                int i15 = 0;
                int i16 = Integer.MAX_VALUE;
                if (i12 == Integer.MAX_VALUE) {
                    i16 = Integer.MAX_VALUE;
                } else if (i13 != Integer.MAX_VALUE) {
                    char c = 0;
                    int i17 = Integer.MAX_VALUE;
                    while (true) {
                        int i18 = zzdcVar.zzb;
                        if (c > 0) {
                            break;
                        }
                        zzam zzb2 = zzdcVar.zzb(i15);
                        int i19 = zzb2.zzr;
                        if (i19 > 0 && (i5 = zzb2.zzs) > 0) {
                            if (z2) {
                                if ((i19 <= i5 ? i15 : 1) != (i12 <= i13 ? i15 : 1)) {
                                    i7 = i12;
                                    i6 = i13;
                                    if (i19 * i7 < i5 * i6) {
                                        int i20 = zzfs.zza;
                                        point = new Point(i6, ((r14 + i19) - 1) / i19);
                                    } else {
                                        int i21 = zzfs.zza;
                                        point = new Point(((r15 + i5) - 1) / i5, i7);
                                    }
                                    i8 = zzb2.zzr;
                                    i9 = zzb2.zzs * i8;
                                    if (i8 >= ((int) (point.x * 0.98f)) && zzb2.zzs >= ((int) (point.y * 0.98f)) && i9 < i17) {
                                        i17 = i9;
                                    }
                                }
                            }
                            i6 = i12;
                            i7 = i13;
                            if (i19 * i7 < i5 * i6) {
                            }
                            i8 = zzb2.zzr;
                            i9 = zzb2.zzs * i8;
                            if (i8 >= ((int) (point.x * 0.98f))) {
                                i17 = i9;
                            }
                        }
                        c = 1;
                        i15 = 0;
                    }
                    i16 = i17;
                }
                zzfwr zzfwrVar = new zzfwr();
                char c2 = 0;
                while (true) {
                    int i22 = zzdcVar.zzb;
                    if (c2 > 0) {
                        return zzfwrVar.zzi();
                    }
                    int zza2 = zzdcVar.zzb(0).zza();
                    zzfwrVar.zzf(new zzxv(i4, zzdcVar, 0, zzxkVar2, iArr4[0], i11, i16 == Integer.MAX_VALUE || (zza2 != i14 && zza2 <= i16)));
                    c2 = 1;
                    i14 = -1;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfwj.zzj().zzc((zzxv) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxt
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxv.zzd((zzxv) obj3, (zzxv) obj4);
                    }
                }), (zzxv) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxt
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxv.zzd((zzxv) obj3, (zzxv) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxt
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxv.zzd((zzxv) obj3, (zzxv) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzxv) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxu
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxv.zza((zzxv) obj3, (zzxv) obj4);
                    }
                }), (zzxv) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxu
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxv.zza((zzxv) obj3, (zzxv) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxu
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxv.zza((zzxv) obj3, (zzxv) obj4);
                    }
                }).zza();
            }
        });
        if (zzv != null) {
            zzxxVarArr[((Integer) zzv.second).intValue()] = (zzxx) zzv.first;
        }
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (zzyaVar.zzc(i4) == 2 && zzyaVar.zzd(i4).zzc > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair zzv2 = zzv(1, zzyaVar, iArr, new zzxr() { // from class: com.google.android.gms.internal.ads.zzwy
            @Override // com.google.android.gms.internal.ads.zzxr
            public final List zza(int i5, zzdc zzdcVar, int[] iArr4) {
                final zzxw zzxwVar = zzxw.this;
                zzftz zzftzVar = new zzftz() { // from class: com.google.android.gms.internal.ads.zzwx
                    @Override // com.google.android.gms.internal.ads.zzftz
                    public final boolean zza(Object obj) {
                        return zzxw.zzl(zzxw.this, (zzam) obj);
                    }
                };
                int i6 = iArr2[i5];
                zzfwr zzfwrVar = new zzfwr();
                int i7 = 0;
                while (true) {
                    int i8 = zzdcVar.zzb;
                    if (i7 > 0) {
                        return zzfwrVar.zzi();
                    }
                    zzfwrVar.zzf(new zzxe(i5, zzdcVar, i7, zzxkVar, iArr4[i7], z, zzftzVar, i6));
                    i7++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxe) Collections.max((List) obj)).zza((zzxe) Collections.max((List) obj2));
            }
        });
        if (zzv2 != null) {
            zzxxVarArr[((Integer) zzv2.second).intValue()] = (zzxx) zzv2.first;
        }
        final String str = zzv2 == null ? null : ((zzxx) zzv2.first).zza.zzb(((zzxx) zzv2.first).zzb[0]).zzd;
        zzdh zzdhVar2 = zzxkVar.zzv;
        int i5 = 3;
        Pair zzv3 = zzv(3, zzyaVar, iArr, new zzxr() { // from class: com.google.android.gms.internal.ads.zzxc
            @Override // com.google.android.gms.internal.ads.zzxr
            public final List zza(int i6, zzdc zzdcVar, int[] iArr4) {
                int i7 = zzxw.zzb;
                zzfwr zzfwrVar = new zzfwr();
                int i8 = 0;
                while (true) {
                    int i9 = zzdcVar.zzb;
                    if (i8 > 0) {
                        return zzfwrVar.zzi();
                    }
                    int i10 = i8;
                    zzfwrVar.zzf(new zzxq(i6, zzdcVar, i10, zzxk.this, iArr4[i8], str));
                    i8++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxq) ((List) obj).get(0)).zza((zzxq) ((List) obj2).get(0));
            }
        });
        if (zzv3 != null) {
            zzxxVarArr[((Integer) zzv3.second).intValue()] = (zzxx) zzv3.first;
        }
        int i6 = 0;
        while (i6 < i3) {
            int zzc2 = zzyaVar.zzc(i6);
            if (zzc2 != i3 && zzc2 != i && zzc2 != i5) {
                zzwl zzd2 = zzyaVar.zzd(i6);
                int[][] iArr4 = iArr[i6];
                zzdh zzdhVar3 = zzxkVar.zzv;
                zzdc zzdcVar = null;
                zzxf zzxfVar = null;
                for (int i7 = 0; i7 < zzd2.zzc; i7++) {
                    zzdc zzb2 = zzd2.zzb(i7);
                    int[] iArr5 = iArr4[i7];
                    char c = 0;
                    while (true) {
                        int i8 = zzb2.zzb;
                        if (c <= 0) {
                            if (zzn(iArr5[0], zzxkVar.zzS)) {
                                zzxf zzxfVar2 = new zzxf(zzb2.zzb(0), iArr5[0]);
                                if (zzxfVar == null || zzxfVar2.compareTo(zzxfVar) > 0) {
                                    zzxfVar = zzxfVar2;
                                    zzdcVar = zzb2;
                                }
                            }
                            c = 1;
                        }
                    }
                }
                zzxxVarArr[i6] = zzdcVar == null ? null : new zzxx(zzdcVar, new int[]{0}, 0);
            }
            i6++;
            i3 = 2;
            i = 1;
            i5 = 3;
        }
        HashMap hashMap = new HashMap();
        int i9 = 2;
        for (int i10 = 0; i10 < 2; i10++) {
            zzt(zzyaVar.zzd(i10), zzxkVar, hashMap);
        }
        zzt(zzyaVar.zze(), zzxkVar, hashMap);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((zzde) hashMap.get(Integer.valueOf(zzyaVar.zzc(i11)))) != null) {
                throw null;
            }
        }
        int i12 = 0;
        while (i12 < i9) {
            zzwl zzd3 = zzyaVar.zzd(i12);
            if (zzxkVar.zzg(i12, zzd3)) {
                if (zzxkVar.zze(i12, zzd3) != null) {
                    throw null;
                }
                zzxxVarArr[i12] = null;
            }
            i12++;
            i9 = 2;
        }
        int i13 = 0;
        for (int i14 = i9; i13 < i14; i14 = 2) {
            int zzc3 = zzyaVar.zzc(i13);
            if (zzxkVar.zzf(i13) || zzxkVar.zzD.contains(Integer.valueOf(zzc3))) {
                zzxxVarArr[i13] = null;
            }
            i13++;
        }
        zzwr zzwrVar = this.zzj;
        zzym zzq = zzq();
        zzfwu zzf = zzws.zzf(zzxxVarArr);
        int i15 = 2;
        zzxy[] zzxyVarArr = new zzxy[2];
        int i16 = 0;
        while (i16 < i15) {
            zzxx zzxxVar = zzxxVarArr[i16];
            if (zzxxVar == null || (length = (iArr3 = zzxxVar.zzb).length) == 0) {
                i2 = i16;
            } else {
                if (length == 1) {
                    zza = new zzxz(zzxxVar.zza, iArr3[0], 0, 0, null);
                    i2 = i16;
                } else {
                    i2 = i16;
                    zza = zzwrVar.zza(zzxxVar.zza, iArr3, 0, zzq, (zzfwu) zzf.get(i16));
                }
                zzxyVarArr[i2] = zza;
            }
            i16 = i2 + 1;
            i15 = 2;
        }
        zzmc[] zzmcVarArr = new zzmc[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            zzmcVarArr[i17] = (zzxkVar.zzf(i17) || zzxkVar.zzD.contains(Integer.valueOf(zzyaVar.zzc(i17))) || (zzyaVar.zzc(i17) != -2 && zzxyVarArr[i17] == null)) ? null : zzmc.zza;
        }
        boolean z2 = zzxkVar.zzT;
        zzdh zzdhVar4 = zzxkVar.zzv;
        return Pair.create(zzmcVarArr, zzxyVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final zzma zzc() {
        return this;
    }

    public final zzxk zzd() {
        zzxk zzxkVar;
        synchronized (this.zze) {
            zzxkVar = this.zzg;
        }
        return zzxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzi() {
        zzxp zzxpVar;
        synchronized (this.zze) {
            if (zzfs.zza >= 32 && (zzxpVar = this.zzh) != null) {
                zzxpVar.zzc();
            }
        }
        super.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzj(zzk zzkVar) {
        boolean z;
        synchronized (this.zze) {
            z = !this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (z) {
            zzu();
        }
    }

    public final void zzk(zzxi zzxiVar) {
        boolean z;
        zzxk zzxkVar = new zzxk(zzxiVar);
        synchronized (this.zze) {
            z = !this.zzg.equals(zzxkVar);
            this.zzg = zzxkVar;
        }
        if (z) {
            if (zzxkVar.zzR && this.zza == null) {
                zzez.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzm() {
        return true;
    }
}
