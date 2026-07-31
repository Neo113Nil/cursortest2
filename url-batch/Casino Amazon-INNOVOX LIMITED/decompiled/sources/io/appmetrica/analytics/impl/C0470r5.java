package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.r5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0470r5 implements Sc {

    /* renamed from: a, reason: collision with root package name */
    public final String f1463a;

    public C0470r5(String str) {
        this.f1463a = str;
    }

    public final C0470r5 a(String str) {
        return new C0470r5(str);
    }

    public final String b() {
        return this.f1463a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0470r5) && Intrinsics.areEqual(this.f1463a, ((C0470r5) obj).f1463a);
    }

    public final int hashCode() {
        return this.f1463a.hashCode();
    }

    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f1463a + ')';
    }

    public static C0470r5 a(C0470r5 c0470r5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0470r5.f1463a;
        }
        c0470r5.getClass();
        return new C0470r5(str);
    }

    @Override // io.appmetrica.analytics.impl.Sc
    public final String a() {
        return this.f1463a;
    }
}
