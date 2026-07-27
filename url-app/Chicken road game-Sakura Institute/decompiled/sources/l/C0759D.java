package l;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759D {

    /* renamed from: a, reason: collision with root package name */
    public final Float f7564a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0797x f7565b;

    /* renamed from: c, reason: collision with root package name */
    public int f7566c;

    public C0759D(Float f4, InterfaceC0797x interfaceC0797x) {
        this.f7564a = f4;
        this.f7565b = interfaceC0797x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0759D)) {
            return false;
        }
        C0759D c0759d = (C0759D) obj;
        return c0759d.f7564a.equals(this.f7564a) && Intrinsics.a(c0759d.f7565b, this.f7565b) && c0759d.f7566c == this.f7566c;
    }

    public final int hashCode() {
        return this.f7565b.hashCode() + AbstractC0784j.c(this.f7566c, this.f7564a.hashCode() * 31, 31);
    }
}
