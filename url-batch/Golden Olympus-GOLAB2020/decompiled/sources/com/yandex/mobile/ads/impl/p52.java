package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public interface p52 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f30345a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f30346b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30347c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30348d;

        public a(int i4, int i5, int i6, byte[] bArr) {
            this.f30345a = i4;
            this.f30346b = bArr;
            this.f30347c = i5;
            this.f30348d = i6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f30345a == aVar.f30345a && this.f30347c == aVar.f30347c && this.f30348d == aVar.f30348d && Arrays.equals(this.f30346b, aVar.f30346b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f30346b) + (this.f30345a * 31)) * 31) + this.f30347c) * 31) + this.f30348d;
        }
    }

    int a(fv fvVar, int i4, boolean z4);

    default void a(int i4, sf1 sf1Var) {
        b(i4, sf1Var);
    }

    void a(long j4, int i4, int i5, int i6, a aVar);

    void a(yb0 yb0Var);

    default int b(fv fvVar, int i4, boolean z4) {
        return a(fvVar, i4, z4);
    }

    void b(int i4, sf1 sf1Var);
}
