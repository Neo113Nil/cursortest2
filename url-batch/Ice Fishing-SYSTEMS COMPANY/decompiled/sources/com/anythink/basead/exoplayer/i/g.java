package com.anythink.basead.exoplayer.i;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f8134a;

    /* renamed from: b, reason: collision with root package name */
    private final f[] f8135b;

    /* renamed from: c, reason: collision with root package name */
    private int f8136c;

    public g(f... fVarArr) {
        this.f8135b = fVarArr;
        this.f8134a = fVarArr.length;
    }

    public final f a(int i) {
        return this.f8135b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8135b, ((g) obj).f8135b);
    }

    public final int hashCode() {
        if (this.f8136c == 0) {
            this.f8136c = Arrays.hashCode(this.f8135b) + 527;
        }
        return this.f8136c;
    }

    public final f[] a() {
        return (f[]) this.f8135b.clone();
    }
}
