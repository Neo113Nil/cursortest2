package org.apache.a.f.e;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.a.e.e;
import org.apache.a.f.f.f;
import org.apache.a.f.f.h;
import org.apache.a.f.f.m;
import org.apache.a.g.g;
import org.apache.a.j;
import org.apache.a.l;
import org.apache.a.o;

/* compiled from: EntitySerializer.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final e f9890a;

    public b(e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("Content length strategy may not be null");
        }
        this.f9890a = eVar;
    }

    protected OutputStream a(g gVar, o oVar) throws l, IOException {
        long a2 = this.f9890a.a(oVar);
        if (a2 == -2) {
            return new f(gVar);
        }
        if (a2 == -1) {
            return new m(gVar);
        }
        return new h(gVar, a2);
    }

    public void a(g gVar, o oVar, j jVar) throws l, IOException {
        if (gVar == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        OutputStream a2 = a(gVar, oVar);
        jVar.a(a2);
        a2.close();
    }
}
