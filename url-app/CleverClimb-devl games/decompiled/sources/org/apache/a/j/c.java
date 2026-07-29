package org.apache.a.j;

/* compiled from: DefaultedHttpContext.java */
/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final e f9984a;

    /* renamed from: b, reason: collision with root package name */
    private final e f9985b;

    public c(e eVar, e eVar2) {
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        this.f9984a = eVar;
        this.f9985b = eVar2;
    }

    @Override // org.apache.a.j.e
    public Object a(String str) {
        Object a2 = this.f9984a.a(str);
        return a2 == null ? this.f9985b.a(str) : a2;
    }

    @Override // org.apache.a.j.e
    public void a(String str, Object obj) {
        this.f9984a.a(str, obj);
    }
}
