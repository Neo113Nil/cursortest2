package z1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f4759a;

    /* renamed from: b, reason: collision with root package name */
    public final q f4760b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4761c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final i f4762e;

    /* renamed from: f, reason: collision with root package name */
    public final j f4763f;

    /* renamed from: g, reason: collision with root package name */
    public final E1.h f4764g;
    public final s h;
    public final s i;

    /* renamed from: j, reason: collision with root package name */
    public final s f4765j;

    /* renamed from: k, reason: collision with root package name */
    public final long f4766k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4767l;

    /* renamed from: m, reason: collision with root package name */
    public final D1.e f4768m;

    public s(H.e eVar, q qVar, String str, int i, i iVar, j jVar, E1.h hVar, s sVar, s sVar2, s sVar3, long j2, long j3, D1.e eVar2) {
        k1.e.e(eVar, "request");
        k1.e.e(qVar, "protocol");
        k1.e.e(str, "message");
        this.f4759a = eVar;
        this.f4760b = qVar;
        this.f4761c = str;
        this.d = i;
        this.f4762e = iVar;
        this.f4763f = jVar;
        this.f4764g = hVar;
        this.h = sVar;
        this.i = sVar2;
        this.f4765j = sVar3;
        this.f4766k = j2;
        this.f4767l = j3;
        this.f4768m = eVar2;
    }

    public static String a(String str, s sVar) {
        sVar.getClass();
        String a2 = sVar.f4763f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        E1.h hVar = this.f4764g;
        if (hVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        hVar.close();
    }

    public final r d() {
        r rVar = new r();
        rVar.f4749a = this.f4759a;
        rVar.f4750b = this.f4760b;
        rVar.f4751c = this.d;
        rVar.d = this.f4761c;
        rVar.f4752e = this.f4762e;
        rVar.f4753f = this.f4763f.c();
        rVar.f4754g = this.f4764g;
        rVar.h = this.h;
        rVar.i = this.i;
        rVar.f4755j = this.f4765j;
        rVar.f4756k = this.f4766k;
        rVar.f4757l = this.f4767l;
        rVar.f4758m = this.f4768m;
        return rVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f4760b + ", code=" + this.d + ", message=" + this.f4761c + ", url=" + ((l) this.f4759a.f483c) + '}';
    }
}
