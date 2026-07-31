package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class kh {

    /* renamed from: a, reason: collision with root package name */
    public final int f7513a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7514b;

    public kh(int i7, byte[] bArr) {
        this.f7514b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kh.class == obj.getClass() && Arrays.equals(this.f7514b, ((kh) obj).f7514b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7514b) + 31;
    }
}
