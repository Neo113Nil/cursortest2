package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949x5 implements Yc {

    /* renamed from: a, reason: collision with root package name */
    public final String f8611a;

    public C0949x5(String str) {
        this.f8611a = str;
    }

    public final C0949x5 a(String str) {
        return new C0949x5(str);
    }

    public final String b() {
        return this.f8611a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0949x5) && kotlin.jvm.internal.j.a(this.f8611a, ((C0949x5) obj).f8611a);
    }

    public final int hashCode() {
        return this.f8611a.hashCode();
    }

    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f8611a + ')';
    }

    public static C0949x5 a(C0949x5 c0949x5, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = c0949x5.f8611a;
        }
        c0949x5.getClass();
        return new C0949x5(str);
    }

    @Override // io.appmetrica.analytics.impl.Yc
    public final String a() {
        return this.f8611a;
    }
}
