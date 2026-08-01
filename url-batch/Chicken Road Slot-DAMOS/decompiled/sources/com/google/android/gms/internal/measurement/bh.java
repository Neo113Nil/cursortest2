package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class bh implements sg {

    /* renamed from: a, reason: collision with root package name */
    public final sg f2176a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2177b;

    public bh(sg sgVar, Object obj) {
        this.f2176a = sgVar;
        g1.c(obj, "log site qualifier");
        this.f2177b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bh)) {
            return false;
        }
        bh bhVar = (bh) obj;
        return this.f2176a.equals(bhVar.f2176a) && this.f2177b.equals(bhVar.f2177b);
    }

    public final int hashCode() {
        return this.f2176a.hashCode() ^ this.f2177b.hashCode();
    }

    public final String toString() {
        String obj = this.f2176a.toString();
        int length = obj.length();
        String obj2 = this.f2177b.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + obj2.length() + 3);
        n0.l.l(sb2, "SpecializedLogSiteKey{ delegate='", obj, "', qualifier='", obj2);
        sb2.append("' }");
        return sb2.toString();
    }
}
