package org.apache.a.j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.a.p;
import org.apache.a.q;
import org.apache.a.r;
import org.apache.a.t;

/* compiled from: BasicHttpProcessor.java */
/* loaded from: classes2.dex */
public final class b implements Cloneable, f {

    /* renamed from: a, reason: collision with root package name */
    protected final List f9982a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    protected final List f9983b = new ArrayList();

    public void a(q qVar) {
        if (qVar == null) {
            return;
        }
        this.f9982a.add(qVar);
    }

    public final void b(q qVar) {
        a(qVar);
    }

    public int a() {
        return this.f9982a.size();
    }

    public q a(int i) {
        if (i < 0 || i >= this.f9982a.size()) {
            return null;
        }
        return (q) this.f9982a.get(i);
    }

    public void a(t tVar) {
        if (tVar == null) {
            return;
        }
        this.f9983b.add(tVar);
    }

    public final void b(t tVar) {
        a(tVar);
    }

    public int b() {
        return this.f9983b.size();
    }

    public t b(int i) {
        if (i < 0 || i >= this.f9983b.size()) {
            return null;
        }
        return (t) this.f9983b.get(i);
    }

    @Override // org.apache.a.q
    public void a(p pVar, e eVar) throws IOException, org.apache.a.l {
        for (int i = 0; i < this.f9982a.size(); i++) {
            ((q) this.f9982a.get(i)).a(pVar, eVar);
        }
    }

    @Override // org.apache.a.t
    public void a(r rVar, e eVar) throws IOException, org.apache.a.l {
        for (int i = 0; i < this.f9983b.size(); i++) {
            ((t) this.f9983b.get(i)).a(rVar, eVar);
        }
    }

    protected void a(b bVar) {
        bVar.f9982a.clear();
        bVar.f9982a.addAll(this.f9982a);
        bVar.f9983b.clear();
        bVar.f9983b.addAll(this.f9983b);
    }

    public Object clone() throws CloneNotSupportedException {
        b bVar = (b) super.clone();
        a(bVar);
        return bVar;
    }
}
