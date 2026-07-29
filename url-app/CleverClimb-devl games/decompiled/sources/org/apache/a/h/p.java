package org.apache.a.h;

import java.io.Serializable;
import org.apache.a.y;

/* compiled from: BufferedHeader.java */
/* loaded from: classes2.dex */
public class p implements Serializable, Cloneable, org.apache.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f9972a;

    /* renamed from: b, reason: collision with root package name */
    private final org.apache.a.k.b f9973b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9974c;

    public p(org.apache.a.k.b bVar) throws y {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        int c2 = bVar.c(58);
        if (c2 == -1) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid header: ");
            stringBuffer.append(bVar.toString());
            throw new y(stringBuffer.toString());
        }
        String b2 = bVar.b(0, c2);
        if (b2.length() == 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Invalid header: ");
            stringBuffer2.append(bVar.toString());
            throw new y(stringBuffer2.toString());
        }
        this.f9973b = bVar;
        this.f9972a = b2;
        this.f9974c = c2 + 1;
    }

    @Override // org.apache.a.d
    public String c() {
        return this.f9972a;
    }

    @Override // org.apache.a.d
    public String d() {
        return this.f9973b.b(this.f9974c, this.f9973b.c());
    }

    @Override // org.apache.a.d
    public org.apache.a.e[] e() throws y {
        u uVar = new u(0, this.f9973b.c());
        uVar.a(this.f9974c);
        return f.f9944a.a(this.f9973b, uVar);
    }

    @Override // org.apache.a.c
    public int b() {
        return this.f9974c;
    }

    @Override // org.apache.a.c
    public org.apache.a.k.b a() {
        return this.f9973b;
    }

    public String toString() {
        return this.f9973b.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
