package org.apache.a.h;

import java.util.Locale;
import org.apache.a.aa;
import org.apache.a.ab;
import org.apache.a.ad;

/* compiled from: BasicHttpResponse.java */
/* loaded from: classes2.dex */
public class h extends a implements org.apache.a.r {

    /* renamed from: a, reason: collision with root package name */
    private ad f9949a;

    /* renamed from: b, reason: collision with root package name */
    private org.apache.a.j f9950b;

    /* renamed from: c, reason: collision with root package name */
    private ab f9951c;

    /* renamed from: d, reason: collision with root package name */
    private Locale f9952d;

    public h(ad adVar, ab abVar, Locale locale) {
        if (adVar == null) {
            throw new IllegalArgumentException("Status line may not be null.");
        }
        this.f9949a = adVar;
        this.f9951c = abVar;
        this.f9952d = locale == null ? Locale.getDefault() : locale;
    }

    public h(ad adVar) {
        this(adVar, null, null);
    }

    @Override // org.apache.a.o
    public aa getProtocolVersion() {
        return this.f9949a.a();
    }

    @Override // org.apache.a.r
    public ad a() {
        return this.f9949a;
    }

    @Override // org.apache.a.r
    public org.apache.a.j b() {
        return this.f9950b;
    }

    @Override // org.apache.a.r
    public void a(org.apache.a.j jVar) {
        this.f9950b = jVar;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9949a);
        stringBuffer.append(" ");
        stringBuffer.append(this.headergroup);
        return stringBuffer.toString();
    }
}
