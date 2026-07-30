package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.vQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4066vQ extends AbstractC3850rQ {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f34798e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f34799c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f34800d;

    public C4066vQ(AbstractC3832r8 abstractC3832r8, Object obj, Object obj2) {
        super(abstractC3832r8);
        this.f34799c = obj;
        this.f34800d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3850rQ, com.google.android.gms.internal.ads.AbstractC3832r8
    public final Y7 b(int i, Y7 y72, long j9) {
        this.f34040b.b(i, y72, j9);
        if (Objects.equals(y72.f28794a, this.f34799c)) {
            y72.f28794a = Y7.f28792m;
        }
        return y72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3850rQ, com.google.android.gms.internal.ads.AbstractC3832r8
    public final L7 d(int i, L7 l72, boolean z8) {
        this.f34040b.d(i, l72, z8);
        if (Objects.equals(l72.f26107b, this.f34800d) && z8) {
            l72.f26107b = f34798e;
        }
        return l72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3850rQ, com.google.android.gms.internal.ads.AbstractC3832r8
    public final int e(Object obj) {
        Object obj2;
        if (f34798e.equals(obj) && (obj2 = this.f34800d) != null) {
            obj = obj2;
        }
        return this.f34040b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3850rQ, com.google.android.gms.internal.ads.AbstractC3832r8
    public final Object f(int i) {
        Object f6 = this.f34040b.f(i);
        return Objects.equals(f6, this.f34800d) ? f34798e : f6;
    }
}
