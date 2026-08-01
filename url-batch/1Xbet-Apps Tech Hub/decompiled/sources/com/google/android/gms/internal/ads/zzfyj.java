package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfyj extends zzfwx {
    static final zzfwx zza = new zzfyj(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzfyj(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static zzfyj zzj(int i, Object[] objArr, zzfww zzfwwVar) {
        short[] sArr;
        char c;
        char c2;
        Object[] objArr2;
        int i2 = i;
        Object[] objArr3 = objArr;
        if (i2 == 0) {
            return (zzfyj) zza;
        }
        Object obj = null;
        int i3 = 1;
        if (i2 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            zzfvr.zzb(obj2, obj3);
            return new zzfyj(null, objArr3, 1);
        }
        zzfty.zzb(i2, objArr3.length >> 1, FirebaseAnalytics.Param.INDEX);
        int zzh = zzfwz.zzh(i);
        if (i2 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            zzfvr.zzb(obj4, obj5);
            i2 = 1;
            c = 1;
            c2 = 2;
        } else {
            int i4 = zzh - 1;
            char c3 = 65535;
            if (zzh <= 128) {
                byte[] bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object obj6 = objArr3[i8];
                    obj6.getClass();
                    Object obj7 = objArr3[i8 ^ i3];
                    obj7.getClass();
                    zzfvr.zzb(obj6, obj7);
                    int zza2 = zzfwm.zza(obj6.hashCode());
                    while (true) {
                        int i9 = zza2 & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArr3[i7] = obj6;
                                objArr3[i7 ^ 1] = obj7;
                            }
                            i6++;
                        } else {
                            if (obj6.equals(objArr3[i10])) {
                                int i11 = i10 ^ 1;
                                Object obj8 = objArr3[i11];
                                obj8.getClass();
                                zzfwv zzfwvVar = new zzfwv(obj6, obj7, obj8);
                                objArr3[i11] = obj7;
                                obj = zzfwvVar;
                                break;
                            }
                            zza2 = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i6), obj};
                    c2 = 2;
                    c = 1;
                }
            } else {
                if (zzh <= 32768) {
                    sArr = new short[zzh];
                    Arrays.fill(sArr, (short) -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i2; i13++) {
                        int i14 = i12 + i12;
                        int i15 = i13 + i13;
                        Object obj9 = objArr3[i15];
                        obj9.getClass();
                        Object obj10 = objArr3[i15 ^ 1];
                        obj10.getClass();
                        zzfvr.zzb(obj9, obj10);
                        int zza3 = zzfwm.zza(obj9.hashCode());
                        while (true) {
                            int i16 = zza3 & i4;
                            char c4 = (char) sArr[i16];
                            if (c4 == 65535) {
                                sArr[i16] = (short) i14;
                                if (i12 < i13) {
                                    objArr3[i14] = obj9;
                                    objArr3[i14 ^ 1] = obj10;
                                }
                                i12++;
                            } else {
                                if (obj9.equals(objArr3[c4])) {
                                    int i17 = c4 ^ 1;
                                    Object obj11 = objArr3[i17];
                                    obj11.getClass();
                                    zzfwv zzfwvVar2 = new zzfwv(obj9, obj10, obj11);
                                    objArr3[i17] = obj10;
                                    obj = zzfwvVar2;
                                    break;
                                }
                                zza3 = i16 + 1;
                            }
                        }
                    }
                    if (i12 != i2) {
                        Integer valueOf = Integer.valueOf(i12);
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i18 = 1;
                    sArr = new int[zzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i2) {
                        int i21 = i20 + i20;
                        int i22 = i19 + i19;
                        Object obj12 = objArr3[i22];
                        obj12.getClass();
                        Object obj13 = objArr3[i22 ^ i18];
                        obj13.getClass();
                        zzfvr.zzb(obj12, obj13);
                        int zza4 = zzfwm.zza(obj12.hashCode());
                        while (true) {
                            int i23 = zza4 & i4;
                            ?? r15 = sArr[i23];
                            if (r15 == c3) {
                                sArr[i23] = i21;
                                if (i20 < i19) {
                                    objArr3[i21] = obj12;
                                    objArr3[i21 ^ 1] = obj13;
                                }
                                i20++;
                            } else {
                                if (obj12.equals(objArr3[r15])) {
                                    int i24 = r15 ^ 1;
                                    Object obj14 = objArr3[i24];
                                    obj14.getClass();
                                    zzfwv zzfwvVar3 = new zzfwv(obj12, obj13, obj14);
                                    objArr3[i24] = obj13;
                                    obj = zzfwvVar3;
                                    break;
                                }
                                zza4 = i23 + 1;
                                c3 = 65535;
                            }
                        }
                        i19++;
                        i18 = 1;
                        c3 = 65535;
                    }
                    if (i20 != i2) {
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i20), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c = 1;
            }
            c2 = 2;
            c = 1;
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr4 = (Object[]) obj;
            zzfwv zzfwvVar4 = (zzfwv) objArr4[c2];
            if (zzfwwVar == null) {
                throw zzfwvVar4.zza();
            }
            zzfwwVar.zzc = zzfwvVar4;
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[c]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i2 = intValue;
        }
        return new zzfyj(obj15, objArr3, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzfwx, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int zza2 = zzfwm.zza(obj.hashCode());
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
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzfwm.zza(obj.hashCode());
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
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzfwm.zza(obj.hashCode());
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

    @Override // com.google.android.gms.internal.ads.zzfwx
    final zzfwp zza() {
        return new zzfyi(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfwx
    final zzfwz zzf() {
        return new zzfyg(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfwx
    final zzfwz zzg() {
        return new zzfyh(this, new zzfyi(this.zzb, 0, this.zzd));
    }
}
