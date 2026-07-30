package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.ph, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3751ph {

    /* renamed from: e, reason: collision with root package name */
    public static final C3751ph f33430e = new C3751ph(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f33431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33432b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33433c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33434d;

    public C3751ph(int i, int i4, int i9) {
        this.f33431a = i;
        this.f33432b = i4;
        this.f33433c = i9;
        this.f33434d = AbstractC3548lu.d(i9) ? AbstractC3548lu.f(i9) * i4 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3751ph)) {
            return false;
        }
        C3751ph c3751ph = (C3751ph) obj;
        return this.f33431a == c3751ph.f33431a && this.f33432b == c3751ph.f33432b && this.f33433c == c3751ph.f33433c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f33431a), Integer.valueOf(this.f33432b), Integer.valueOf(this.f33433c));
    }

    public final String toString() {
        int i = this.f33431a;
        int length = String.valueOf(i).length();
        int i4 = this.f33432b;
        int length2 = String.valueOf(i4).length();
        int i9 = this.f33433c;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i9).length() + 1);
        AbstractC5051n.i(sb, "AudioFormat[sampleRate=", i, ", channelCount=", i4);
        return AbstractC5051n.d(i9, ", encoding=", "]", sb);
    }
}
