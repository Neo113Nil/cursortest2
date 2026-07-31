package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class in0 {

    /* renamed from: a, reason: collision with root package name */
    private int f6707a;

    /* renamed from: b, reason: collision with root package name */
    private final w74[] f6708b;

    public in0(w74[] w74VarArr, byte... bArr) {
        this.f6708b = w74VarArr;
        int length = w74VarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || in0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6708b, ((in0) obj).f6708b);
    }

    public final int hashCode() {
        int i7 = this.f6707a;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f6708b) + 527;
        this.f6707a = hashCode;
        return hashCode;
    }
}
