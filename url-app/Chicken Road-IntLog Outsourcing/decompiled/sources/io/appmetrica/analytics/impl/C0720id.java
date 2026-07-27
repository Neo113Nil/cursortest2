package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720id {

    /* renamed from: a, reason: collision with root package name */
    public final String f8452a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8453b;

    public C0720id(String str, boolean z) {
        this.f8452a = str;
        this.f8453b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0720id)) {
            return false;
        }
        C0720id c0720id = (C0720id) obj;
        return kotlin.jvm.internal.i.a(this.f8452a, c0720id.f8452a) && this.f8453b == c0720id.f8453b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f8452a.hashCode() * 31;
        boolean z = this.f8453b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f8452a + ", loaded=" + this.f8453b + ')';
    }
}
