package org.apache.a.a;

/* compiled from: AuthState.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private a f9641a;

    /* renamed from: b, reason: collision with root package name */
    private d f9642b;

    /* renamed from: c, reason: collision with root package name */
    private h f9643c;

    public void a() {
        this.f9641a = null;
        this.f9642b = null;
        this.f9643c = null;
    }

    public boolean b() {
        return this.f9641a != null;
    }

    public void a(a aVar) {
        if (aVar == null) {
            a();
        } else {
            this.f9641a = aVar;
        }
    }

    public a c() {
        return this.f9641a;
    }

    public h d() {
        return this.f9643c;
    }

    public void a(h hVar) {
        this.f9643c = hVar;
    }

    public d e() {
        return this.f9642b;
    }

    public void a(d dVar) {
        this.f9642b = dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("auth scope [");
        sb.append(this.f9642b);
        sb.append("]; credentials set [");
        sb.append(this.f9643c != null ? "true" : "false");
        sb.append("]");
        return sb.toString();
    }
}
