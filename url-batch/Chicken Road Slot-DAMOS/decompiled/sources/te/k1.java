package te;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k1 implements re.e, k {

    /* renamed from: a, reason: collision with root package name */
    public final re.e f9396a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9397b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f9398c;

    public k1(re.e eVar) {
        eVar.getClass();
        this.f9396a = eVar;
        this.f9397b = eVar.a() + '?';
        this.f9398c = b1.b(eVar);
    }

    @Override // re.e
    public final String a() {
        return this.f9397b;
    }

    @Override // re.e
    public final i7.a b() {
        return this.f9396a.b();
    }

    @Override // re.e
    public final int c() {
        return this.f9396a.c();
    }

    @Override // re.e
    public final String d(int i3) {
        return this.f9396a.d(i3);
    }

    @Override // re.e
    public final boolean e() {
        return this.f9396a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            return Intrinsics.a(this.f9396a, ((k1) obj).f9396a);
        }
        return false;
    }

    @Override // te.k
    public final Set f() {
        return this.f9398c;
    }

    @Override // re.e
    public final boolean g() {
        return true;
    }

    @Override // re.e
    public final re.e h(int i3) {
        return this.f9396a.h(i3);
    }

    public final int hashCode() {
        return this.f9396a.hashCode() * 31;
    }

    @Override // re.e
    public final boolean i(int i3) {
        return this.f9396a.i(i3);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9396a);
        sb2.append('?');
        return sb2.toString();
    }
}
