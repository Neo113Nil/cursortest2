package com.baidu.platform.comapi.c.a;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f8997a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8998b;

    /* renamed from: com.baidu.platform.comapi.c.a.b$b, reason: collision with other inner class name */
    public static class C0102b {

        /* renamed from: a, reason: collision with root package name */
        private String f8999a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9000b;

        public C0102b() {
            this(null);
        }

        public C0102b a(String str) {
            this.f8999a = str;
            return this;
        }

        public C0102b(b bVar) {
            if (bVar != null) {
                this.f8999a = bVar.f8997a;
                this.f9000b = bVar.f8998b;
            }
        }

        public C0102b a(boolean z7) {
            this.f9000b = z7;
            return this;
        }

        public b a() {
            return new b(this.f8999a, this.f9000b);
        }
    }

    public String a() {
        return this.f8997a;
    }

    public boolean b() {
        return this.f8998b;
    }

    private b(String str, boolean z7) {
        this.f8997a = str;
        this.f8998b = z7;
    }
}
