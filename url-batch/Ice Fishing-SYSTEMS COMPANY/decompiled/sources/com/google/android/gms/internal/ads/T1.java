package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class T1 extends Y1 {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f27678b;

    public T1(String str, byte[] bArr) {
        super(str);
        this.f27678b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && T1.class == obj.getClass()) {
            T1 t12 = (T1) obj;
            if (this.f28771a.equals(t12.f28771a) && Arrays.equals(this.f27678b, t12.f27678b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27678b) + ((this.f28771a.hashCode() + 527) * 31);
    }
}
