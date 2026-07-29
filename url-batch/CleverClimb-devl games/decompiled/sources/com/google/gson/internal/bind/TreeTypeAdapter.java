package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends t<T> {

    /* renamed from: a, reason: collision with root package name */
    final com.google.gson.e f6558a;

    /* renamed from: b, reason: collision with root package name */
    private final q<T> f6559b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.gson.i<T> f6560c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.b.a<T> f6561d;
    private final u e;
    private final TreeTypeAdapter<T>.a f = new a();
    private t<T> g;

    public TreeTypeAdapter(q<T> qVar, com.google.gson.i<T> iVar, com.google.gson.e eVar, com.google.gson.b.a<T> aVar, u uVar) {
        this.f6559b = qVar;
        this.f6560c = iVar;
        this.f6558a = eVar;
        this.f6561d = aVar;
        this.e = uVar;
    }

    @Override // com.google.gson.t
    public T b(com.google.gson.c.a aVar) throws IOException {
        if (this.f6560c == null) {
            return b().b(aVar);
        }
        j a2 = com.google.gson.internal.j.a(aVar);
        if (a2.l()) {
            return null;
        }
        return this.f6560c.a(a2, this.f6561d.getType(), this.f);
    }

    @Override // com.google.gson.t
    public void a(com.google.gson.c.c cVar, T t) throws IOException {
        if (this.f6559b == null) {
            b().a(cVar, t);
        } else if (t == null) {
            cVar.f();
        } else {
            com.google.gson.internal.j.a(this.f6559b.a(t, this.f6561d.getType(), this.f), cVar);
        }
    }

    private t<T> b() {
        t<T> tVar = this.g;
        if (tVar != null) {
            return tVar;
        }
        t<T> a2 = this.f6558a.a(this.e, this.f6561d);
        this.g = a2;
        return a2;
    }

    private static final class SingleTypeFactory implements u {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.gson.b.a<?> f6562a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6563b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<?> f6564c;

        /* renamed from: d, reason: collision with root package name */
        private final q<?> f6565d;
        private final com.google.gson.i<?> e;

        @Override // com.google.gson.u
        public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
            boolean isAssignableFrom;
            if (this.f6562a != null) {
                isAssignableFrom = this.f6562a.equals(aVar) || (this.f6563b && this.f6562a.getType() == aVar.getRawType());
            } else {
                isAssignableFrom = this.f6564c.isAssignableFrom(aVar.getRawType());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(this.f6565d, this.e, eVar, aVar, this);
            }
            return null;
        }
    }

    private final class a implements com.google.gson.h, p {
        private a() {
        }
    }
}
