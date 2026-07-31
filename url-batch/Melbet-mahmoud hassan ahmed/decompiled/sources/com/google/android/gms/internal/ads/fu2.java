package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fu2 implements du2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5243a;

    public fu2(String str) {
        this.f5243a = str;
    }

    @Override // com.google.android.gms.internal.ads.du2
    public final boolean equals(Object obj) {
        if (obj instanceof fu2) {
            return this.f5243a.equals(((fu2) obj).f5243a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.du2
    public final int hashCode() {
        return this.f5243a.hashCode();
    }

    public final String toString() {
        return this.f5243a;
    }
}
