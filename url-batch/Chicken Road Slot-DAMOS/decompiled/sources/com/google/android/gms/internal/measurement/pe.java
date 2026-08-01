package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class pe {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2675a;

    /* renamed from: b, reason: collision with root package name */
    public final ec f2676b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.i f2677c;

    /* renamed from: d, reason: collision with root package name */
    public final b8.g f2678d;

    public pe(Uri uri, ec ecVar, a8.i iVar, b8.g gVar) {
        this.f2675a = uri;
        this.f2676b = ecVar;
        this.f2677c = iVar;
        this.f2678d = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pe)) {
            return false;
        }
        pe peVar = (pe) obj;
        if (!this.f2675a.equals(peVar.f2675a) || !this.f2676b.equals(peVar.f2676b) || !this.f2677c.equals(peVar.f2677c) || !this.f2678d.equals(peVar.f2678d)) {
            return false;
        }
        Object obj2 = h1.f2356i;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((((((this.f2675a.hashCode() ^ 1000003) * 1000003) ^ this.f2676b.hashCode()) * 1000003) ^ this.f2677c.hashCode()) * 1000003) ^ this.f2678d.hashCode()) * 1000003) ^ h1.f2356i.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String obj = this.f2675a.toString();
        int length = obj.length();
        String k1Var = this.f2676b.toString();
        int length2 = k1Var.length();
        h1 h1Var = h1.f2356i;
        String valueOf = String.valueOf(this.f2677c);
        String valueOf2 = String.valueOf(this.f2678d);
        String obj2 = h1Var.toString();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + obj2.length() + 32 + String.valueOf(true).length() + 22);
        n0.l.l(sb2, "ProtoDataStoreConfig{uri=", obj, ", schema=", k1Var);
        n0.l.l(sb2, ", handler=", valueOf, ", migrations=", valueOf2);
        return v4.a.p(sb2, ", variantConfig=", obj2, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
