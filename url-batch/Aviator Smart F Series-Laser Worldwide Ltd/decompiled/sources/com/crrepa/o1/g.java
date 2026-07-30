package com.crrepa.o1;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class g extends com.crrepa.t1.b {

    /* renamed from: o, reason: collision with root package name */
    private static final Writer f13487o = new a();

    /* renamed from: p, reason: collision with root package name */
    private static final com.crrepa.l1.k f13488p = new com.crrepa.l1.k("closed");

    /* renamed from: l, reason: collision with root package name */
    private final List<com.crrepa.l1.h> f13489l;

    /* renamed from: m, reason: collision with root package name */
    private String f13490m;

    /* renamed from: n, reason: collision with root package name */
    private com.crrepa.l1.h f13491n;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            throw new AssertionError();
        }
    }

    public g() {
        super(f13487o);
        this.f13489l = new ArrayList();
        this.f13491n = com.crrepa.l1.i.f13253a;
    }

    private com.crrepa.l1.h o() {
        return this.f13489l.get(r0.size() - 1);
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b a(double d8) {
        if (i() || !(Double.isNaN(d8) || Double.isInfinite(d8))) {
            a(new com.crrepa.l1.k(Double.valueOf(d8)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d8);
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f13489l.isEmpty() || this.f13490m != null) {
            throw new IllegalStateException();
        }
        if (!(o() instanceof com.crrepa.l1.j)) {
            throw new IllegalStateException();
        }
        this.f13490m = str;
        return this;
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b c() {
        com.crrepa.l1.g gVar = new com.crrepa.l1.g();
        a(gVar);
        this.f13489l.add(gVar);
        return this;
    }

    @Override // com.crrepa.t1.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f13489l.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f13489l.add(f13488p);
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b d() {
        com.crrepa.l1.j jVar = new com.crrepa.l1.j();
        a(jVar);
        this.f13489l.add(jVar);
        return this;
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b e() {
        if (this.f13489l.isEmpty() || this.f13490m != null) {
            throw new IllegalStateException();
        }
        if (!(o() instanceof com.crrepa.l1.g)) {
            throw new IllegalStateException();
        }
        this.f13489l.remove(r0.size() - 1);
        return this;
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b f() {
        if (this.f13489l.isEmpty() || this.f13490m != null) {
            throw new IllegalStateException();
        }
        if (!(o() instanceof com.crrepa.l1.j)) {
            throw new IllegalStateException();
        }
        this.f13489l.remove(r0.size() - 1);
        return this;
    }

    @Override // com.crrepa.t1.b, java.io.Flushable
    public void flush() {
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b k() {
        a(com.crrepa.l1.i.f13253a);
        return this;
    }

    public com.crrepa.l1.h n() {
        if (this.f13489l.isEmpty()) {
            return this.f13491n;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f13489l);
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b a(long j8) {
        a(new com.crrepa.l1.k(Long.valueOf(j8)));
        return this;
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b d(boolean z7) {
        a(new com.crrepa.l1.k(Boolean.valueOf(z7)));
        return this;
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b e(String str) {
        if (str == null) {
            return k();
        }
        a(new com.crrepa.l1.k(str));
        return this;
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b a(Boolean bool) {
        if (bool == null) {
            return k();
        }
        a(new com.crrepa.l1.k(bool));
        return this;
    }

    @Override // com.crrepa.t1.b
    public com.crrepa.t1.b a(Number number) {
        if (number == null) {
            return k();
        }
        if (!i()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a(new com.crrepa.l1.k(number));
        return this;
    }

    private void a(com.crrepa.l1.h hVar) {
        if (this.f13490m != null) {
            if (!hVar.s() || g()) {
                ((com.crrepa.l1.j) o()).a(this.f13490m, hVar);
            }
            this.f13490m = null;
            return;
        }
        if (this.f13489l.isEmpty()) {
            this.f13491n = hVar;
            return;
        }
        com.crrepa.l1.h o8 = o();
        if (!(o8 instanceof com.crrepa.l1.g)) {
            throw new IllegalStateException();
        }
        ((com.crrepa.l1.g) o8).a(hVar);
    }
}
