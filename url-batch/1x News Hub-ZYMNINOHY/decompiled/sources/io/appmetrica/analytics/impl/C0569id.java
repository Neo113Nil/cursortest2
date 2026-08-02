package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569id {

    /* renamed from: a, reason: collision with root package name */
    public final String f7563a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7564b;

    public C0569id(String str, boolean z) {
        this.f7563a = str;
        this.f7564b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0569id)) {
            return false;
        }
        C0569id c0569id = (C0569id) obj;
        return kotlin.jvm.internal.j.a(this.f7563a, c0569id.f7563a) && this.f7564b == c0569id.f7564b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f7563a.hashCode() * 31;
        boolean z = this.f7564b;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f7563a + ", loaded=" + this.f7564b + ')';
    }
}
