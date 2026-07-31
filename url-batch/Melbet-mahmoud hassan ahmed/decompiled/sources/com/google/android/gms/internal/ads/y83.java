package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
final class y83<K, V> extends i73<K, V> {

    /* renamed from: l, reason: collision with root package name */
    static final i73<Object, Object> f14578l = new y83(null, new Object[0], 0);

    /* renamed from: i, reason: collision with root package name */
    private final transient Object f14579i;

    /* renamed from: j, reason: collision with root package name */
    final transient Object[] f14580j;

    /* renamed from: k, reason: collision with root package name */
    private final transient int f14581k;

    private y83(Object obj, Object[] objArr, int i7) {
        this.f14579i = obj;
        this.f14580j = objArr;
        this.f14581k = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <K, V> y83<K, V> h(int i7, Object[] objArr) {
        byte[] bArr;
        if (i7 == 0) {
            return (y83) f14578l;
        }
        Object obj = null;
        int i8 = 0;
        if (i7 == 1) {
            Object obj2 = objArr[0];
            obj2.getClass();
            Object obj3 = objArr[1];
            obj3.getClass();
            c63.b(obj2, obj3);
            return new y83<>(null, objArr, 1);
        }
        q43.b(i7, objArr.length >> 1, "index");
        int p7 = p73.p(i7);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            Object obj5 = objArr[1];
            obj5.getClass();
            c63.b(obj4, obj5);
        } else {
            int i9 = p7 - 1;
            if (p7 <= 128) {
                bArr = new byte[p7];
                Arrays.fill(bArr, (byte) -1);
                while (i8 < i7) {
                    int i10 = i8 + i8;
                    Object obj6 = objArr[i10];
                    obj6.getClass();
                    Object obj7 = objArr[i10 ^ 1];
                    obj7.getClass();
                    c63.b(obj6, obj7);
                    int a7 = w63.a(obj6.hashCode());
                    while (true) {
                        int i11 = a7 & i9;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj6.equals(objArr[i12])) {
                            throw i(obj6, obj7, objArr, i12);
                        }
                        a7 = i11 + 1;
                    }
                }
            } else if (p7 <= 32768) {
                bArr = new short[p7];
                Arrays.fill(bArr, (short) -1);
                while (i8 < i7) {
                    int i13 = i8 + i8;
                    Object obj8 = objArr[i13];
                    obj8.getClass();
                    Object obj9 = objArr[i13 ^ 1];
                    obj9.getClass();
                    c63.b(obj8, obj9);
                    int a8 = w63.a(obj8.hashCode());
                    while (true) {
                        int i14 = a8 & i9;
                        char c7 = (char) bArr[i14];
                        if (c7 == 65535) {
                            break;
                        }
                        if (obj8.equals(objArr[c7])) {
                            throw i(obj8, obj9, objArr, c7);
                        }
                        a8 = i14 + 1;
                    }
                }
            } else {
                bArr = new int[p7];
                Arrays.fill((int[]) bArr, -1);
                while (i8 < i7) {
                    int i15 = i8 + i8;
                    Object obj10 = objArr[i15];
                    obj10.getClass();
                    Object obj11 = objArr[i15 ^ 1];
                    obj11.getClass();
                    c63.b(obj10, obj11);
                    int a9 = w63.a(obj10.hashCode());
                    while (true) {
                        int i16 = a9 & i9;
                        ?? r8 = bArr[i16];
                        if (r8 == -1) {
                            break;
                        }
                        if (obj10.equals(objArr[r8])) {
                            throw i(obj10, obj11, objArr, r8);
                        }
                        a9 = i16 + 1;
                    }
                }
            }
            obj = bArr;
        }
        return new y83<>(obj, objArr, i7);
    }

    private static IllegalArgumentException i(Object obj, Object obj2, Object[] objArr, int i7) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i7]);
        String valueOf4 = String.valueOf(objArr[i7 ^ 1]);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.i73
    final z63<V> a() {
        return new x83(this.f14580j, 1, this.f14581k);
    }

    @Override // com.google.android.gms.internal.ads.i73
    final p73<Map.Entry<K, V>> e() {
        return new v83(this, this.f14580j, 0, this.f14581k);
    }

    @Override // com.google.android.gms.internal.ads.i73
    final p73<K> f() {
        return new w83(this, new x83(this.f14580j, 0, this.f14581k));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.i73, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v6;
        Object obj2 = this.f14579i;
        Object[] objArr = this.f14580j;
        int i7 = this.f14581k;
        if (obj != null) {
            if (i7 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    v6 = (V) objArr[1];
                    v6.getClass();
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int a7 = w63.a(obj.hashCode());
                    while (true) {
                        int i8 = a7 & length;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i9])) {
                            v6 = (V) objArr[i9 ^ 1];
                            break;
                        }
                        a7 = i8 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int a8 = w63.a(obj.hashCode());
                    while (true) {
                        int i10 = a8 & length2;
                        char c7 = (char) sArr[i10];
                        if (c7 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c7])) {
                            v6 = (V) objArr[c7 ^ 1];
                            break;
                        }
                        a8 = i10 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int a9 = w63.a(obj.hashCode());
                    while (true) {
                        int i11 = a9 & length3;
                        int i12 = iArr[i11];
                        if (i12 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            v6 = (V) objArr[i12 ^ 1];
                            break;
                        }
                        a9 = i11 + 1;
                    }
                }
            }
            if (v6 != null) {
                return null;
            }
            return v6;
        }
        v6 = null;
        if (v6 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f14581k;
    }
}
