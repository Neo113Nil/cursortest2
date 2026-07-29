package com.ironsource.b.a;

/* compiled from: ConfigValidationResult.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6721a = true;

    /* renamed from: b, reason: collision with root package name */
    private com.ironsource.b.d.b f6722b = null;

    public void a(com.ironsource.b.d.b bVar) {
        this.f6721a = false;
        this.f6722b = bVar;
    }

    public boolean a() {
        return this.f6721a;
    }

    public com.ironsource.b.d.b b() {
        return this.f6722b;
    }

    public String toString() {
        if (a()) {
            return "valid:" + this.f6721a;
        }
        return "valid:" + this.f6721a + ", IronSourceError:" + this.f6722b;
    }
}
