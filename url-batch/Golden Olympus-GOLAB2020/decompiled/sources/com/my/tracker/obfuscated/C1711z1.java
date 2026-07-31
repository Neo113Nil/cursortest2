package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.C1628e1;
import com.my.tracker.obfuscated.InterfaceC1707y1;

/* renamed from: com.my.tracker.obfuscated.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1711z1 implements InterfaceC1707y1 {

    /* renamed from: a, reason: collision with root package name */
    private final C1628e1 f21586a;

    /* renamed from: com.my.tracker.obfuscated.z1$a */
    private static final class a implements InterfaceC1707y1.a {

        /* renamed from: a, reason: collision with root package name */
        private final C1628e1 f21587a;

        /* renamed from: b, reason: collision with root package name */
        private final C1628e1.c f21588b;

        public a(C1628e1 c1628e1, C1628e1.c cVar) {
            this.f21587a = c1628e1;
            this.f21588b = cVar;
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1707y1.a
        public boolean b() {
            return this.f21588b.b();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1707y1.a
        public long c() {
            return this.f21588b.c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21588b.close();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1707y1.a
        public InterfaceC1707y1.b d() {
            return new b(this.f21587a.e(this.f21588b.a()));
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1707y1.a
        public long g() {
            return this.f21588b.g();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1707y1.a
        public byte[] l() {
            return this.f21588b.l();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.z1$b */
    private static final class b implements InterfaceC1707y1.b {

        /* renamed from: a, reason: collision with root package name */
        private final C1628e1.d f21589a;

        public b(C1628e1.d dVar) {
            this.f21589a = dVar;
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1707y1.b
        public boolean b() {
            return this.f21589a.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21589a.close();
        }

        @Override // com.my.tracker.obfuscated.InterfaceC1707y1.b
        public long e() {
            return this.f21589a.e();
        }
    }

    public C1711z1(C1628e1 c1628e1) {
        this.f21586a = c1628e1;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1707y1
    public InterfaceC1707y1.a a() {
        C1628e1 c1628e1 = this.f21586a;
        return new a(c1628e1, c1628e1.i());
    }
}
