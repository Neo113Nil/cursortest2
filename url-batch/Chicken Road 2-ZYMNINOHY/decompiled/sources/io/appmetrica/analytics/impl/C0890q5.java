package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890q5 implements Rc {

    /* renamed from: a, reason: collision with root package name */
    public final String f12605a;

    public C0890q5(String str) {
        this.f12605a = str;
    }

    public final C0890q5 a(String str) {
        return new C0890q5(str);
    }

    public final String b() {
        return this.f12605a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0890q5) && kotlin.jvm.internal.i.a(this.f12605a, ((C0890q5) obj).f12605a);
    }

    public final int hashCode() {
        return this.f12605a.hashCode();
    }

    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f12605a + ')';
    }

    public static C0890q5 a(C0890q5 c0890q5, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c0890q5.f12605a;
        }
        c0890q5.getClass();
        return new C0890q5(str);
    }

    @Override // io.appmetrica.analytics.impl.Rc
    public final String a() {
        return this.f12605a;
    }
}
