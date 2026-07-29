package org.apache.a.b.b;

/* compiled from: HttpEntityEnclosingRequestBase.java */
/* loaded from: classes2.dex */
public abstract class c extends i implements org.apache.a.k {
    private org.apache.a.j entity;

    @Override // org.apache.a.k
    public org.apache.a.j getEntity() {
        return this.entity;
    }

    public void setEntity(org.apache.a.j jVar) {
        this.entity = jVar;
    }

    @Override // org.apache.a.k
    public boolean expectContinue() {
        org.apache.a.d firstHeader = getFirstHeader("Expect");
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.d());
    }

    @Override // org.apache.a.b.b.i
    public Object clone() throws CloneNotSupportedException {
        c cVar = (c) super.clone();
        if (this.entity != null) {
            cVar.entity = (org.apache.a.j) org.apache.a.b.e.a.a(this.entity);
        }
        return cVar;
    }
}
