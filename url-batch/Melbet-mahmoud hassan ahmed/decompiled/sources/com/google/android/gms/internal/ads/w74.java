package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
public class w74 {

    /* renamed from: a, reason: collision with root package name */
    protected final gk0 f13748a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f13749b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f13750c;

    /* renamed from: d, reason: collision with root package name */
    private final c0[] f13751d;

    /* renamed from: e, reason: collision with root package name */
    private int f13752e;

    public w74(gk0 gk0Var, int[] iArr, int i7) {
        int length = iArr.length;
        wu1.f(length > 0);
        Objects.requireNonNull(gk0Var);
        this.f13748a = gk0Var;
        this.f13749b = length;
        this.f13751d = new c0[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.f13751d[i8] = gk0Var.b(iArr[i8]);
        }
        Arrays.sort(this.f13751d, new Comparator() { // from class: com.google.android.gms.internal.ads.v74
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((c0) obj2).f3656h - ((c0) obj).f3656h;
            }
        });
        this.f13750c = new int[this.f13749b];
        for (int i9 = 0; i9 < this.f13749b; i9++) {
            this.f13750c[i9] = gk0Var.a(this.f13751d[i9]);
        }
    }

    public final int a(int i7) {
        return this.f13750c[0];
    }

    public final int b() {
        return this.f13750c.length;
    }

    public final c0 c(int i7) {
        return this.f13751d[i7];
    }

    public final gk0 d() {
        return this.f13748a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            w74 w74Var = (w74) obj;
            if (this.f13748a == w74Var.f13748a && Arrays.equals(this.f13750c, w74Var.f13750c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f13752e;
        if (i7 != 0) {
            return i7;
        }
        int identityHashCode = (System.identityHashCode(this.f13748a) * 31) + Arrays.hashCode(this.f13750c);
        this.f13752e = identityHashCode;
        return identityHashCode;
    }
}
