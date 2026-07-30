package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3574mJ extends UG {

    /* renamed from: a, reason: collision with root package name */
    public final C3520lJ f32677a;

    public C3574mJ(C3520lJ c3520lJ) {
        this.f32677a = c3520lJ;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f32677a != C3520lJ.f32563e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3574mJ) && ((C3574mJ) obj).f32677a == this.f32677a;
    }

    public final int hashCode() {
        return Objects.hash(C3574mJ.class, this.f32677a);
    }

    public final String toString() {
        String str = this.f32677a.f32564a;
        return D.y.o(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
