package com.google.gson;

import java.io.IOException;

/* compiled from: TypeAdapter.java */
/* loaded from: classes2.dex */
public abstract class t<T> {
    public abstract void a(com.google.gson.c.c cVar, T t) throws IOException;

    public abstract T b(com.google.gson.c.a aVar) throws IOException;

    public final t<T> a() {
        return new t<T>() { // from class: com.google.gson.t.1
            @Override // com.google.gson.t
            public void a(com.google.gson.c.c cVar, T t) throws IOException {
                if (t == null) {
                    cVar.f();
                } else {
                    t.this.a(cVar, t);
                }
            }

            @Override // com.google.gson.t
            public T b(com.google.gson.c.a aVar) throws IOException {
                if (aVar.f() == com.google.gson.c.b.NULL) {
                    aVar.j();
                    return null;
                }
                return (T) t.this.b(aVar);
            }
        };
    }

    public final j a(T t) {
        try {
            com.google.gson.internal.bind.d dVar = new com.google.gson.internal.bind.d();
            a(dVar, t);
            return dVar.a();
        } catch (IOException e) {
            throw new k(e);
        }
    }
}
