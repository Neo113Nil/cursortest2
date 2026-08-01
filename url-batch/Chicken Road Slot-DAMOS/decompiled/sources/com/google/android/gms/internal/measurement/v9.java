package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v9 extends d7.a {
    public static final Parcelable.Creator<v9> CREATOR = new o6(5);

    /* renamed from: d, reason: collision with root package name */
    public final String f2872d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2873e;

    /* renamed from: i, reason: collision with root package name */
    public final byte[][] f2874i;

    /* renamed from: r, reason: collision with root package name */
    public final byte[][] f2875r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[][] f2876s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[][] f2877t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f2878u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[][] f2879v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f2880w;

    /* renamed from: x, reason: collision with root package name */
    public final byte[][] f2881x;

    public v9(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f2872d = str;
        this.f2873e = bArr;
        this.f2874i = bArr2;
        this.f2875r = bArr3;
        this.f2876s = bArr4;
        this.f2877t = bArr5;
        this.f2878u = iArr;
        this.f2879v = bArr6;
        this.f2880w = iArr2;
        this.f2881x = bArr7;
    }

    public static void b(StringBuilder sb2, String str, byte[][] bArr) {
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            sb2.append("null");
            return;
        }
        sb2.append("(");
        boolean z10 = true;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("'");
            c7.c0.g(bArr2);
            sb2.append(Base64.encodeToString(bArr2, 3));
            sb2.append("'");
            i3++;
            z10 = false;
        }
        sb2.append(")");
    }

    public static Set e(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet Q = a.a.Q(length);
        for (byte[] bArr2 : bArr) {
            c7.c0.g(bArr2);
            Q.add(Base64.encodeToString(bArr2, 3));
        }
        return Q;
    }

    public static List f(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i3 = 0; i3 < iArr.length; i3 += 2) {
            arrayList.add(new z9(iArr[i3], iArr[i3 + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final Set c() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.f2879v;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f2873e;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        int length;
        int length2;
        if (obj instanceof v9) {
            v9 v9Var = (v9) obj;
            if (hg.c(this.f2872d, v9Var.f2872d) && hg.c(c(), v9Var.c()) && hg.c(e(this.f2874i), e(v9Var.f2874i)) && hg.c(e(this.f2875r), e(v9Var.f2875r)) && hg.c(e(this.f2876s), e(v9Var.f2876s)) && hg.c(e(this.f2877t), e(v9Var.f2877t))) {
                int[] iArr = this.f2878u;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    obj2 = Collections.EMPTY_SET;
                } else {
                    obj2 = a.a.Q(length2);
                    for (int i3 : iArr) {
                        obj2.add(Integer.valueOf(i3));
                    }
                }
                int[] iArr2 = v9Var.f2878u;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    obj3 = Collections.EMPTY_SET;
                } else {
                    obj3 = a.a.Q(length);
                    for (int i10 : iArr2) {
                        obj3.add(Integer.valueOf(i10));
                    }
                }
                if (hg.c(obj2, obj3) && hg.c(f(this.f2880w), f(v9Var.f2880w)) && hg.c(e(this.f2881x), e(v9Var.f2881x))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f2872d;
        sb2.append(str == null ? "null" : v4.a.p(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb2.append(", direct==");
        byte[] bArr = this.f2873e;
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        b(sb2, "GAIA=", this.f2874i);
        sb2.append(", ");
        b(sb2, "PSEUDO=", this.f2875r);
        sb2.append(", ");
        b(sb2, "ALWAYS=", this.f2876s);
        sb2.append(", ");
        b(sb2, "OTHER=", this.f2877t);
        sb2.append(", weak=");
        sb2.append(Arrays.toString(this.f2878u));
        sb2.append(", ");
        b(sb2, "directs=", this.f2879v);
        sb2.append(", genDims=");
        sb2.append(Arrays.toString(f(this.f2880w).toArray()));
        sb2.append(", ");
        b(sb2, "external=", this.f2881x);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.V(parcel, 2, this.f2872d);
        cf.c.Q(parcel, 3, this.f2873e);
        cf.c.R(parcel, 4, this.f2874i);
        cf.c.R(parcel, 5, this.f2875r);
        cf.c.R(parcel, 6, this.f2876s);
        cf.c.R(parcel, 7, this.f2877t);
        cf.c.T(parcel, 8, this.f2878u);
        cf.c.R(parcel, 9, this.f2879v);
        cf.c.T(parcel, 10, this.f2880w);
        cf.c.R(parcel, 11, this.f2881x);
        cf.c.a0(parcel, Z);
    }
}
