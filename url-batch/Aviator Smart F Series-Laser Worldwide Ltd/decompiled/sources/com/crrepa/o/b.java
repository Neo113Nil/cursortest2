package com.crrepa.o;

import com.crrepa.p.c;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13467a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13468b;

    /* renamed from: com.crrepa.o.b$b, reason: collision with other inner class name */
    private static class C0233b {

        /* renamed from: a, reason: collision with root package name */
        private static b f13469a = new b();

        private C0233b() {
        }
    }

    private b() {
        this.f13467a = false;
        this.f13468b = false;
    }

    public static b a() {
        return C0233b.f13469a;
    }

    private void b() {
        if (this.f13467a && this.f13468b) {
            c.d().h();
        }
    }

    public void c() {
        this.f13468b = true;
        b();
    }

    public void d() {
        this.f13467a = false;
        this.f13468b = false;
    }

    public void e() {
        this.f13467a = true;
        b();
    }
}
