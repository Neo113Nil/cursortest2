package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.C1628e1;
import com.my.tracker.obfuscated.InterfaceC1609a2;

/* renamed from: com.my.tracker.obfuscated.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1614b2 implements InterfaceC1609a2 {

    /* renamed from: a, reason: collision with root package name */
    private final C1628e1 f21145a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21146b;

    /* renamed from: com.my.tracker.obfuscated.b2$a */
    private static final class a implements InterfaceC1609a2.a {

        /* renamed from: a, reason: collision with root package name */
        private final C1628e1 f21147a;

        /* renamed from: b, reason: collision with root package name */
        private final C1628e1.f f21148b;

        public a(C1628e1 c1628e1, C1628e1.f fVar) {
            this.f21147a = c1628e1;
            this.f21148b = fVar;
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1609a2.a
        public long a() {
            return this.f21148b.a();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1609a2.a
        public boolean b() {
            return this.f21148b.b();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1609a2.a
        public long c() {
            return this.f21148b.c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21148b.close();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1609a2.a
        public InterfaceC1609a2.b d() {
            return new b(this.f21147a.h(this.f21148b.a()));
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1609a2.a
        public String k() {
            return this.f21148b.k();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b2$b */
    private static final class b implements InterfaceC1609a2.b {

        /* renamed from: a, reason: collision with root package name */
        private final C1628e1.g f21149a;

        public b(C1628e1.g gVar) {
            this.f21149a = gVar;
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1609a2.b
        public boolean b() {
            return this.f21149a.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21149a.close();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1609a2.b
        public boolean f() {
            return this.f21149a.o();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1609a2.b
        public long h() {
            return this.f21149a.n();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1609a2.b
        public long j() {
            return this.f21149a.m();
        }
    }

    C1614b2(C1628e1 c1628e1, String str) {
        this.f21145a = c1628e1;
        this.f21146b = str;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1609a2
    public InterfaceC1609a2.a a() {
        C1628e1 c1628e1 = this.f21145a;
        return new a(c1628e1, c1628e1.a(this.f21146b));
    }
}
