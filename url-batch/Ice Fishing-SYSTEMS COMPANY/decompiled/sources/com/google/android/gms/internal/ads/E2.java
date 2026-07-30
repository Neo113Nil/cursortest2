package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class E2 implements InterfaceC3344i3 {

    /* renamed from: n, reason: collision with root package name */
    public long f24632n;

    /* renamed from: u, reason: collision with root package name */
    public long f24633u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24634v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24635w;

    public E2(String str, byte[] bArr, long j9, long j10) {
        this.f24634v = str;
        this.f24635w = bArr;
        this.f24632n = j9;
        this.f24633u = j10;
    }

    public static E2 a(M.h hVar, byte[] bArr, boolean z8) {
        hVar.s();
        ((Y5) hVar.f1828u).f28789c.f26649u = J5.e(bArr);
        List list = (List) hVar.v(Optional.empty());
        long longValue = ((Long) list.get(0)).longValue();
        long longValue2 = ((Long) list.get(1)).longValue();
        long longValue3 = ((Long) list.get(2)).longValue();
        hVar.w(longValue, Optional.empty());
        byte[] k6 = AbstractC3194fG.k();
        String g9 = HC.f25320d.g(k6.length, k6);
        int length = g9.length();
        String str = true != z8 ? "" : "-s";
        String o9 = D.y.o(new StringBuilder(str.length() + length + 12), "3.893135394.", g9, str);
        E2 e22 = new E2();
        e22.f24635w = hVar;
        e22.f24632n = longValue2;
        e22.f24633u = longValue3;
        e22.f24634v = o9;
        return e22;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3344i3
    public void b(long j9) {
        long[] jArr = (long[]) ((C2881Yl) this.f24635w).f28862u;
        this.f24633u = jArr[AbstractC3548lu.s(jArr, j9, true)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3344i3
    public long h(J0 j02) {
        long j9 = this.f24633u;
        if (j9 < 0) {
            return -1L;
        }
        this.f24633u = -1L;
        return -(j9 + 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3344i3
    /* renamed from: i */
    public InterfaceC3015c1 mo6i() {
        PA.T(this.f24632n != -1);
        return new T0((U0) this.f24634v, this.f24632n);
    }

    public E2(long j9) {
        PA.T(((C3931t) this.f24634v) == null);
        this.f24632n = j9;
        this.f24633u = j9 + 65536;
    }
}
