package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzci extends zzbz {
    static final zzbz zza = new zzci(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzci(Object obj, Object[] objArr, int i4) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d1  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzci zzg(int i4, Object[] objArr, zzby zzbyVar) {
        int i5;
        boolean z4;
        int i6;
        char c4;
        Object obj;
        char c5;
        short[] sArr;
        boolean z5;
        int i7;
        ?? r16;
        boolean z6;
        boolean z7;
        int i8 = i4;
        Object[] objArr2 = objArr;
        if (i8 == 0) {
            return (zzci) zza;
        }
        Object obj2 = null;
        boolean z8 = false;
        int i9 = 1;
        if (i8 == 1) {
            Object obj3 = objArr2[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArr2[1];
            Objects.requireNonNull(obj4);
            zzbr.zza(obj3, obj4);
            return new zzci(null, objArr2, 1);
        }
        zzbj.zzb(i8, objArr2.length >> 1, FirebaseAnalytics.Param.INDEX);
        char c6 = 2;
        int max = Math.max(i8, 2);
        if (max < 751619276) {
            i5 = Integer.highestOneBit(max - 1);
            do {
                i5 += i5;
            } while (i5 * 0.7d < max);
        } else {
            i5 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i8 == 1) {
            Object obj5 = objArr2[0];
            Objects.requireNonNull(obj5);
            Object obj6 = objArr2[1];
            Objects.requireNonNull(obj6);
            zzbr.zza(obj5, obj6);
            z7 = false;
            i8 = 1;
            i6 = 1;
        } else {
            int i10 = i5 - 1;
            if (i5 <= 128) {
                byte[] bArr = new byte[i5];
                Arrays.fill(bArr, (byte) -1);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i8) {
                    int i13 = i12 + i12;
                    int i14 = i11 + i11;
                    Object obj7 = objArr2[i14];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArr2[i14 ^ i9];
                    Objects.requireNonNull(obj8);
                    zzbr.zza(obj7, obj8);
                    int zza2 = zzbs.zza(obj7.hashCode());
                    while (true) {
                        int i15 = zza2 & i10;
                        z5 = z8;
                        i7 = i9;
                        int i16 = bArr[i15] & 255;
                        if (i16 == 255) {
                            bArr[i15] = (byte) i13;
                            if (i12 < i11) {
                                objArr2[i13] = obj7;
                                objArr2[i13 ^ 1] = obj8;
                            }
                            i12++;
                        } else {
                            if (obj7.equals(objArr2[i16])) {
                                int i17 = i16 ^ 1;
                                Object obj9 = objArr2[i17];
                                Objects.requireNonNull(obj9);
                                zzbx zzbxVar = new zzbx(obj7, obj8, obj9);
                                objArr2[i17] = obj8;
                                obj2 = zzbxVar;
                                break;
                            }
                            zza2 = i15 + 1;
                            z8 = z5;
                            i9 = i7;
                        }
                    }
                    i11++;
                    z8 = z5;
                    i9 = i7;
                }
                z4 = z8;
                i6 = i9;
                if (i12 == i8) {
                    c4 = 2;
                    obj = bArr;
                    r16 = z4;
                    z6 = obj instanceof Object[];
                    Object obj10 = obj;
                    if (z6) {
                        Object[] objArr3 = (Object[]) obj;
                        zzbx zzbxVar2 = (zzbx) objArr3[c4];
                        if (zzbyVar == null) {
                            throw zzbxVar2.zza();
                        }
                        zzbyVar.zzc = zzbxVar2;
                        Object obj11 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i6]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj10 = obj11;
                        i8 = intValue;
                    }
                    return new zzci(obj10, objArr2, i8);
                }
                sArr = new Object[3];
                sArr[z4 ? 1 : 0] = bArr;
                sArr[i6] = Integer.valueOf(i12);
                sArr[2] = obj2;
                obj2 = sArr;
                z7 = z4;
            } else {
                z4 = false;
                i6 = 1;
                if (i5 > 32768) {
                    int[] iArr = new int[i5];
                    Arrays.fill(iArr, -1);
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i8) {
                        int i20 = i19 + i19;
                        int i21 = i18 + i18;
                        Object obj12 = objArr2[i21];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i21 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzbr.zza(obj12, obj13);
                        int zza3 = zzbs.zza(obj12.hashCode());
                        while (true) {
                            int i22 = zza3 & i10;
                            int i23 = iArr[i22];
                            if (i23 == -1) {
                                iArr[i22] = i20;
                                if (i19 < i18) {
                                    objArr2[i20] = obj12;
                                    objArr2[i20 ^ 1] = obj13;
                                }
                                i19++;
                                c5 = c6;
                            } else {
                                c5 = c6;
                                if (obj12.equals(objArr2[i23])) {
                                    int i24 = i23 ^ 1;
                                    Object obj14 = objArr2[i24];
                                    Objects.requireNonNull(obj14);
                                    zzbx zzbxVar3 = new zzbx(obj12, obj13, obj14);
                                    objArr2[i24] = obj13;
                                    obj2 = zzbxVar3;
                                    break;
                                }
                                zza3 = i22 + 1;
                                c6 = c5;
                            }
                        }
                        i18++;
                        c6 = c5;
                    }
                    c4 = c6;
                    if (i19 == i8) {
                        obj = iArr;
                        r16 = z4;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i19);
                        objArr4[c4] = obj2;
                        obj = objArr4;
                        r16 = z4;
                    }
                    z6 = obj instanceof Object[];
                    Object obj102 = obj;
                    if (z6) {
                    }
                    return new zzci(obj102, objArr2, i8);
                }
                sArr = new short[i5];
                Arrays.fill(sArr, (short) -1);
                int i25 = 0;
                for (int i26 = 0; i26 < i8; i26++) {
                    int i27 = i25 + i25;
                    int i28 = i26 + i26;
                    Object obj15 = objArr2[i28];
                    Objects.requireNonNull(obj15);
                    Object obj16 = objArr2[i28 ^ 1];
                    Objects.requireNonNull(obj16);
                    zzbr.zza(obj15, obj16);
                    int zza4 = zzbs.zza(obj15.hashCode());
                    while (true) {
                        int i29 = zza4 & i10;
                        char c7 = (char) sArr[i29];
                        if (c7 == 65535) {
                            sArr[i29] = (short) i27;
                            if (i25 < i26) {
                                objArr2[i27] = obj15;
                                objArr2[i27 ^ 1] = obj16;
                            }
                            i25++;
                        } else {
                            if (obj15.equals(objArr2[c7])) {
                                int i30 = c7 ^ 1;
                                Object obj17 = objArr2[i30];
                                Objects.requireNonNull(obj17);
                                zzbx zzbxVar4 = new zzbx(obj15, obj16, obj17);
                                objArr2[i30] = obj16;
                                obj2 = zzbxVar4;
                                break;
                            }
                            zza4 = i29 + 1;
                        }
                    }
                }
                if (i25 != i8) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i25), obj2};
                    z7 = z4;
                }
                obj2 = sArr;
                z7 = z4;
            }
        }
        c4 = 2;
        obj = obj2;
        r16 = z7;
        z6 = obj instanceof Object[];
        Object obj1022 = obj;
        if (z6) {
        }
        return new zzci(obj1022, objArr2, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.zzbz, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i4 = this.zzd;
            Object[] objArr = this.zzb;
            if (i4 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int zza2 = zzbs.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza2 & length;
                            int i6 = bArr[i5] & 255;
                            if (i6 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            zza2 = i5 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzbs.zza(obj.hashCode());
                        while (true) {
                            int i7 = zza3 & length2;
                            char c4 = (char) sArr[i7];
                            if (c4 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c4])) {
                                obj2 = objArr[c4 ^ 1];
                                break;
                            }
                            zza3 = i7 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzbs.zza(obj.hashCode());
                        while (true) {
                            int i8 = zza4 & length3;
                            int i9 = iArr[i8];
                            if (i9 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            zza4 = i8 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbz
    final zzbt zza() {
        return new zzch(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbz
    final zzca zzd() {
        return new zzcf(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbz
    final zzca zze() {
        return new zzcg(this, new zzch(this.zzb, 0, this.zzd));
    }
}
