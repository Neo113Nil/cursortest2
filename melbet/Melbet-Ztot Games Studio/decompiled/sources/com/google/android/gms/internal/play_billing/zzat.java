package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes3.dex */
final class zzat extends zzal {
    static final zzal zza = new zzat(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzat(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c5  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzat zzg(int i, Object[] objArr, zzak zzakVar) {
        int i2;
        short[] sArr;
        char c;
        char c2;
        boolean z;
        int i3 = i;
        Object[] objArr2 = objArr;
        if (i3 == 0) {
            return (zzat) zza;
        }
        Object obj = null;
        int i4 = 1;
        if (i3 == 1) {
            zzad.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            return new zzat(null, objArr2, 1);
        }
        zzaa.zzb(i3, objArr2.length >> 1, "index");
        int max = Math.max(i3, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i3 == 1) {
            zzad.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            i3 = 1;
        } else {
            int i5 = i2 - 1;
            char c3 = 65535;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i6 = 0;
                int i7 = 0;
                while (i6 < i3) {
                    int i8 = i7 + i7;
                    int i9 = i6 + i6;
                    Object requireNonNull = Objects.requireNonNull(objArr2[i9]);
                    Object requireNonNull2 = Objects.requireNonNull(objArr2[i9 ^ i4]);
                    zzad.zza(requireNonNull, requireNonNull2);
                    int zza2 = zzae.zza(requireNonNull.hashCode());
                    while (true) {
                        int i10 = zza2 & i5;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            bArr[i10] = (byte) i8;
                            if (i7 < i6) {
                                objArr2[i8] = requireNonNull;
                                objArr2[i8 ^ 1] = requireNonNull2;
                            }
                            i7++;
                        } else {
                            if (requireNonNull.equals(objArr2[i11])) {
                                int i12 = i11 ^ 1;
                                zzaj zzajVar = new zzaj(requireNonNull, requireNonNull2, Objects.requireNonNull(objArr2[i12]));
                                objArr2[i12] = requireNonNull2;
                                obj = zzajVar;
                                break;
                            }
                            zza2 = i10 + 1;
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 == i3) {
                    obj = bArr;
                } else {
                    sArr = new Object[]{bArr, Integer.valueOf(i7), obj};
                }
            } else if (i2 <= 32768) {
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i3; i14++) {
                    int i15 = i13 + i13;
                    int i16 = i14 + i14;
                    Object requireNonNull3 = Objects.requireNonNull(objArr2[i16]);
                    Object requireNonNull4 = Objects.requireNonNull(objArr2[i16 ^ 1]);
                    zzad.zza(requireNonNull3, requireNonNull4);
                    int zza3 = zzae.zza(requireNonNull3.hashCode());
                    while (true) {
                        int i17 = zza3 & i5;
                        char c4 = (char) sArr[i17];
                        if (c4 == 65535) {
                            sArr[i17] = (short) i15;
                            if (i13 < i14) {
                                objArr2[i15] = requireNonNull3;
                                objArr2[i15 ^ 1] = requireNonNull4;
                            }
                            i13++;
                        } else {
                            if (requireNonNull3.equals(objArr2[c4])) {
                                int i18 = c4 ^ 1;
                                zzaj zzajVar2 = new zzaj(requireNonNull3, requireNonNull4, Objects.requireNonNull(objArr2[i18]));
                                objArr2[i18] = requireNonNull4;
                                obj = zzajVar2;
                                break;
                            }
                            zza3 = i17 + 1;
                        }
                    }
                }
                if (i13 != i3) {
                    c2 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i13), obj};
                    c = 1;
                    z = obj instanceof Object[];
                    Object obj2 = obj;
                    if (z) {
                        Object[] objArr3 = (Object[]) obj;
                        zzaj zzajVar3 = (zzaj) objArr3[c2];
                        if (zzakVar == null) {
                            throw zzajVar3.zza();
                        }
                        zzakVar.zzc = zzajVar3;
                        Object obj3 = objArr3[0];
                        int intValue = ((Integer) objArr3[c]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj2 = obj3;
                        i3 = intValue;
                    }
                    return new zzat(obj2, objArr2, i3);
                }
            } else {
                int i19 = 1;
                sArr = new int[i2];
                Arrays.fill((int[]) sArr, -1);
                int i20 = 0;
                int i21 = 0;
                while (i20 < i3) {
                    int i22 = i21 + i21;
                    int i23 = i20 + i20;
                    Object requireNonNull5 = Objects.requireNonNull(objArr2[i23]);
                    Object requireNonNull6 = Objects.requireNonNull(objArr2[i23 ^ i19]);
                    zzad.zza(requireNonNull5, requireNonNull6);
                    int zza4 = zzae.zza(requireNonNull5.hashCode());
                    while (true) {
                        int i24 = zza4 & i5;
                        ?? r15 = sArr[i24];
                        if (r15 == c3) {
                            sArr[i24] = i22;
                            if (i21 < i20) {
                                objArr2[i22] = requireNonNull5;
                                objArr2[i22 ^ 1] = requireNonNull6;
                            }
                            i21++;
                        } else {
                            if (requireNonNull5.equals(objArr2[r15])) {
                                int i25 = r15 ^ 1;
                                zzaj zzajVar4 = new zzaj(requireNonNull5, requireNonNull6, Objects.requireNonNull(objArr2[i25]));
                                objArr2[i25] = requireNonNull6;
                                obj = zzajVar4;
                                break;
                            }
                            zza4 = i24 + 1;
                            c3 = 65535;
                        }
                    }
                    i20++;
                    i19 = 1;
                    c3 = 65535;
                }
                if (i21 != i3) {
                    c = 1;
                    c2 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i21), obj};
                    z = obj instanceof Object[];
                    Object obj22 = obj;
                    if (z) {
                    }
                    return new zzat(obj22, objArr2, i3);
                }
            }
            obj = sArr;
        }
        c2 = 2;
        c = 1;
        z = obj instanceof Object[];
        Object obj222 = obj;
        if (z) {
        }
        return new zzat(obj222, objArr2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.zzal, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i != 1) {
                Object obj3 = this.zzc;
                if (obj3 != null) {
                    if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        int length = bArr.length - 1;
                        int zza2 = zzae.zza(obj.hashCode());
                        while (true) {
                            int i2 = zza2 & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            zza2 = i2 + 1;
                        }
                    } else if (obj3 instanceof short[]) {
                        short[] sArr = (short[]) obj3;
                        int length2 = sArr.length - 1;
                        int zza3 = zzae.zza(obj.hashCode());
                        while (true) {
                            int i4 = zza3 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            zza3 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj3;
                        int length3 = iArr.length - 1;
                        int zza4 = zzae.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza4 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            zza4 = i5 + 1;
                        }
                    }
                }
            } else if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                obj2 = Objects.requireNonNull(objArr[1]);
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

    @Override // com.google.android.gms.internal.play_billing.zzal
    final zzaf zza() {
        return new zzas(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final zzam zzd() {
        return new zzaq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final zzam zze() {
        return new zzar(this, new zzas(this.zzb, 0, this.zzd));
    }
}
