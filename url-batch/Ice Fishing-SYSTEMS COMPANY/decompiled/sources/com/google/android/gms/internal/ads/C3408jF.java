package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3408jF extends AE {

    /* renamed from: a, reason: collision with root package name */
    public final HE f32094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32095b;

    public C3408jF(HE he, int i) {
        this.f32094a = he;
        this.f32095b = i;
    }

    public static C3408jF b(HE he, int i) {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new C3408jF(he, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f32094a != HE.f25334j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3408jF)) {
            return false;
        }
        C3408jF c3408jF = (C3408jF) obj;
        return c3408jF.f32094a == this.f32094a && c3408jF.f32095b == this.f32095b;
    }

    public final int hashCode() {
        return Objects.hash(C3408jF.class, this.f32094a, Integer.valueOf(this.f32095b));
    }

    public final String toString() {
        String str = this.f32094a.f25338b;
        int length = str.length();
        int i = this.f32095b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(str);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
