package s;

import u.InterfaceC0946n;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0863f implements InterfaceC0946n {

    /* renamed from: a, reason: collision with root package name */
    public final Z1.j f7362a;

    /* renamed from: b, reason: collision with root package name */
    public final Z1.j f7363b;

    /* renamed from: c, reason: collision with root package name */
    public final Q.a f7364c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0863f(Y1.c cVar, Y1.c cVar2, Q.a aVar) {
        this.f7362a = (Z1.j) cVar;
        this.f7363b = (Z1.j) cVar2;
        this.f7364c = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.c, Z1.j] */
    @Override // u.InterfaceC0946n
    public final Y1.c a() {
        return this.f7363b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.c, Z1.j] */
    @Override // u.InterfaceC0946n
    public final Y1.c getKey() {
        return this.f7362a;
    }
}
