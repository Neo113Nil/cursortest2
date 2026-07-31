package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ml {

    /* renamed from: a, reason: collision with root package name */
    private int f8612a;

    /* renamed from: b, reason: collision with root package name */
    private final el[] f8613b;

    public ml(el[] elVarArr, byte... bArr) {
        this.f8613b = elVarArr;
    }

    public final el a(int i7) {
        return this.f8613b[i7];
    }

    public final el[] b() {
        return (el[]) this.f8613b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ml.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8613b, ((ml) obj).f8613b);
    }

    public final int hashCode() {
        int i7 = this.f8612a;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f8613b) + 527;
        this.f8612a = hashCode;
        return hashCode;
    }
}
