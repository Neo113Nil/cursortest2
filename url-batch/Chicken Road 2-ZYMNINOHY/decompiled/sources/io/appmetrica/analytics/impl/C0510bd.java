package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510bd {

    /* renamed from: a, reason: collision with root package name */
    public final String f11534a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11535b;

    public C0510bd(String str, boolean z) {
        this.f11534a = str;
        this.f11535b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0510bd)) {
            return false;
        }
        C0510bd c0510bd = (C0510bd) obj;
        return kotlin.jvm.internal.i.a(this.f11534a, c0510bd.f11534a) && this.f11535b == c0510bd.f11535b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f11534a.hashCode() * 31;
        boolean z = this.f11535b;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f11534a + ", loaded=" + this.f11535b + ')';
    }
}
