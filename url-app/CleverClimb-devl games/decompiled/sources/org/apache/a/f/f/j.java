package org.apache.a.f.f;

import java.io.IOException;
import org.apache.a.h.t;
import org.apache.a.h.u;
import org.apache.a.s;
import org.apache.a.x;
import org.apache.a.y;

/* compiled from: HttpResponseParser.java */
/* loaded from: classes2.dex */
public class j extends a {

    /* renamed from: b, reason: collision with root package name */
    private final s f9924b;

    /* renamed from: c, reason: collision with root package name */
    private final org.apache.a.k.b f9925c;

    public j(org.apache.a.g.f fVar, t tVar, s sVar, org.apache.a.i.d dVar) {
        super(fVar, tVar, dVar);
        if (sVar == null) {
            throw new IllegalArgumentException("Response factory may not be null");
        }
        this.f9924b = sVar;
        this.f9925c = new org.apache.a.k.b(128);
    }

    @Override // org.apache.a.f.f.a
    protected org.apache.a.o a(org.apache.a.g.f fVar) throws IOException, org.apache.a.l, y {
        this.f9925c.a();
        if (fVar.a(this.f9925c) == -1) {
            throw new x("The target server failed to respond");
        }
        return this.f9924b.a(this.f9893a.c(this.f9925c, new u(0, this.f9925c.c())), null);
    }
}
