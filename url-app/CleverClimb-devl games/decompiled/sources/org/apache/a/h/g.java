package org.apache.a.h;

import org.apache.a.aa;
import org.apache.a.ac;

/* compiled from: BasicHttpRequest.java */
/* loaded from: classes2.dex */
public class g extends a implements org.apache.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final String f9946a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9947b;

    /* renamed from: c, reason: collision with root package name */
    private ac f9948c;

    public g(String str, String str2, aa aaVar) {
        this(new m(str, str2, aaVar));
    }

    public g(ac acVar) {
        if (acVar == null) {
            throw new IllegalArgumentException("Request line may not be null");
        }
        this.f9948c = acVar;
        this.f9946a = acVar.a();
        this.f9947b = acVar.c();
    }

    @Override // org.apache.a.o
    public aa getProtocolVersion() {
        return getRequestLine().b();
    }

    @Override // org.apache.a.p
    public ac getRequestLine() {
        if (this.f9948c == null) {
            this.f9948c = new m(this.f9946a, this.f9947b, org.apache.a.i.e.b(getParams()));
        }
        return this.f9948c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9946a);
        stringBuffer.append(" ");
        stringBuffer.append(this.f9947b);
        stringBuffer.append(" ");
        stringBuffer.append(this.headergroup);
        return stringBuffer.toString();
    }
}
