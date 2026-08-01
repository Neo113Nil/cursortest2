package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ze {

    /* renamed from: a, reason: collision with root package name */
    public final ec f3049a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f3050b;

    public ze(ec ecVar, c1 c1Var) {
        this.f3049a = ecVar;
        if (c1Var != null) {
            this.f3050b = c1Var;
        } else {
            a2.r.j("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ze)) {
            return false;
        }
        ze zeVar = (ze) obj;
        return this.f3049a.equals(zeVar.f3049a) && this.f3050b.equals(zeVar.f3050b);
    }

    public final int hashCode() {
        return ((this.f3049a.hashCode() ^ 1000003) * 1000003) ^ this.f3050b.hashCode();
    }

    public final String toString() {
        String k1Var = this.f3049a.toString();
        int length = k1Var.length();
        String obj = this.f3050b.toString();
        StringBuilder sb2 = new StringBuilder(length + 53 + obj.length() + 1);
        n0.l.l(sb2, "ProtoSerializer{defaultValue=", k1Var, ", extensionRegistryLite=", obj);
        sb2.append("}");
        return sb2.toString();
    }
}
