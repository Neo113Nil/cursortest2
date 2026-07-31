package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class el {

    /* renamed from: a, reason: collision with root package name */
    protected final zk f4651a;

    /* renamed from: b, reason: collision with root package name */
    protected final int[] f4652b;

    /* renamed from: c, reason: collision with root package name */
    private final xe[] f4653c;

    /* renamed from: d, reason: collision with root package name */
    private int f4654d;

    public el(zk zkVar, int... iArr) {
        Objects.requireNonNull(zkVar);
        this.f4651a = zkVar;
        this.f4653c = new xe[1];
        for (int i7 = 0; i7 <= 0; i7++) {
            this.f4653c[i7] = zkVar.b(iArr[i7]);
        }
        Arrays.sort(this.f4653c, new dl(null));
        this.f4652b = new int[1];
        for (int i8 = 0; i8 <= 0; i8++) {
            this.f4652b[i8] = zkVar.a(this.f4653c[i8]);
        }
    }

    public final int a(int i7) {
        return this.f4652b[0];
    }

    public final int b() {
        int length = this.f4652b.length;
        return 1;
    }

    public final xe c(int i7) {
        return this.f4653c[i7];
    }

    public final zk d() {
        return this.f4651a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            el elVar = (el) obj;
            if (this.f4651a == elVar.f4651a && Arrays.equals(this.f4652b, elVar.f4652b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f4654d;
        if (i7 != 0) {
            return i7;
        }
        int identityHashCode = (System.identityHashCode(this.f4651a) * 31) + Arrays.hashCode(this.f4652b);
        this.f4654d = identityHashCode;
        return identityHashCode;
    }
}
