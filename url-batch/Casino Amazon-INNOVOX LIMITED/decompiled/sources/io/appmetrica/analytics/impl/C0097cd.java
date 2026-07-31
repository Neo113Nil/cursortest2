package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0097cd {

    /* renamed from: a, reason: collision with root package name */
    public final String f1197a;
    public final boolean b;

    public C0097cd(String str, boolean z) {
        this.f1197a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0097cd)) {
            return false;
        }
        C0097cd c0097cd = (C0097cd) obj;
        return Intrinsics.areEqual(this.f1197a, c0097cd.f1197a) && this.b == c0097cd.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f1197a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f1197a + ", loaded=" + this.b + ')';
    }
}
