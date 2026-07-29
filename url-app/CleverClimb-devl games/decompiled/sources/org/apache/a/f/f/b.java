package org.apache.a.f.f;

import java.io.IOException;
import org.apache.a.h.s;

/* compiled from: AbstractMessageWriter.java */
/* loaded from: classes2.dex */
public abstract class b implements org.apache.a.g.d {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.g.g f9897a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.apache.a.k.b f9898b;

    /* renamed from: c, reason: collision with root package name */
    protected final s f9899c;

    protected abstract void a(org.apache.a.o oVar) throws IOException;

    public b(org.apache.a.g.g gVar, s sVar, org.apache.a.i.d dVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        this.f9897a = gVar;
        this.f9898b = new org.apache.a.k.b(128);
        this.f9899c = sVar == null ? org.apache.a.h.i.f9953a : sVar;
    }

    @Override // org.apache.a.g.d
    public void b(org.apache.a.o oVar) throws IOException, org.apache.a.l {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        a(oVar);
        org.apache.a.g headerIterator = oVar.headerIterator();
        while (headerIterator.hasNext()) {
            this.f9897a.a(this.f9899c.a(this.f9898b, (org.apache.a.d) headerIterator.next()));
        }
        this.f9898b.a();
        this.f9897a.a(this.f9898b);
    }
}
