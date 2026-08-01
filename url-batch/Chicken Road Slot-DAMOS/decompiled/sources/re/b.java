package re;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final f f8235a;

    /* renamed from: b, reason: collision with root package name */
    public final ce.b f8236b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8237c;

    public b(f fVar, ce.b bVar) {
        bVar.getClass();
        this.f8235a = fVar;
        this.f8236b = bVar;
        this.f8237c = fVar.f8246a + '<' + ((wd.h) bVar).c() + '>';
    }

    @Override // re.e
    public final String a() {
        return this.f8237c;
    }

    @Override // re.e
    public final i7.a b() {
        return this.f8235a.f8247b;
    }

    @Override // re.e
    public final int c() {
        return this.f8235a.f8248c;
    }

    @Override // re.e
    public final String d(int i3) {
        return this.f8235a.f8250e[i3];
    }

    @Override // re.e
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f8235a.equals(bVar.f8235a) && Intrinsics.a(bVar.f8236b, this.f8236b);
    }

    @Override // re.e
    public final boolean g() {
        return false;
    }

    @Override // re.e
    public final e h(int i3) {
        return this.f8235a.f8251f[i3];
    }

    public final int hashCode() {
        return this.f8237c.hashCode() + (((wd.h) this.f8236b).hashCode() * 31);
    }

    @Override // re.e
    public final boolean i(int i3) {
        return this.f8235a.g[i3];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f8236b + ", original: " + this.f8235a + ')';
    }
}
