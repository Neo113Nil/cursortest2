package org.apache.a;

import java.io.Serializable;

/* compiled from: ProtocolVersion.java */
/* loaded from: classes2.dex */
public class aa implements Serializable, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    protected final String f9650d;
    protected final int e;
    protected final int f;

    public aa(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Protocol name must not be null.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Protocol major version number must not be negative.");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Protocol minor version number may not be negative");
        }
        this.f9650d = str;
        this.e = i;
        this.f = i2;
    }

    public final String a() {
        return this.f9650d;
    }

    public final int b() {
        return this.e;
    }

    public final int c() {
        return this.f;
    }

    public aa a(int i, int i2) {
        return (i == this.e && i2 == this.f) ? this : new aa(this.f9650d, i, i2);
    }

    public final int hashCode() {
        return (this.f9650d.hashCode() ^ (this.e * 100000)) ^ this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return this.f9650d.equals(aaVar.f9650d) && this.e == aaVar.e && this.f == aaVar.f;
    }

    public boolean a(aa aaVar) {
        return aaVar != null && this.f9650d.equals(aaVar.f9650d);
    }

    public int b(aa aaVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("Protocol version must not be null.");
        }
        if (!this.f9650d.equals(aaVar.f9650d)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Versions for different protocols cannot be compared. ");
            stringBuffer.append(this);
            stringBuffer.append(" ");
            stringBuffer.append(aaVar);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        int b2 = b() - aaVar.b();
        return b2 == 0 ? c() - aaVar.c() : b2;
    }

    public final boolean c(aa aaVar) {
        return a(aaVar) && b(aaVar) <= 0;
    }

    public String toString() {
        org.apache.a.k.b bVar = new org.apache.a.k.b(16);
        bVar.a(this.f9650d);
        bVar.a('/');
        bVar.a(Integer.toString(this.e));
        bVar.a('.');
        bVar.a(Integer.toString(this.f));
        return bVar.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
