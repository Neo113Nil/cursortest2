package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f2308a = c0.f2179b;

    /* renamed from: b, reason: collision with root package name */
    public final String f2309b;

    public g(String str) {
        this.f2309b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2308a.equals(gVar.f2308a) && this.f2309b.equals(gVar.f2309b);
    }

    public final int hashCode() {
        return this.f2308a.hashCode() ^ this.f2309b.hashCode();
    }
}
