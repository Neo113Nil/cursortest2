package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3570mF extends AE {

    /* renamed from: a, reason: collision with root package name */
    public final LE f32675a;

    public C3570mF(LE le) {
        this.f32675a = le;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f32675a != LE.f26119C;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3570mF) && ((C3570mF) obj).f32675a == this.f32675a;
    }

    public final int hashCode() {
        return Objects.hash(C3570mF.class, this.f32675a);
    }

    public final String toString() {
        String str = this.f32675a.f26130u;
        return D.y.o(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
