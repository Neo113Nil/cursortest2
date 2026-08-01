package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes.dex */
public final class f extends com.bykv.vk.openvk.preload.a.d.c {
    private static final Writer f = new Writer() { // from class: com.bykv.vk.openvk.preload.a.b.a.f.1
        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }
    };
    private static final p g = new p("closed");
    public final List<com.bykv.vk.openvk.preload.a.k> a;
    public com.bykv.vk.openvk.preload.a.k b;
    private String h;

    @Override // com.bykv.vk.openvk.preload.a.d.c, java.io.Flushable
    public final void flush() throws IOException {
    }

    public f() {
        super(f);
        this.a = new ArrayList();
        this.b = com.bykv.vk.openvk.preload.a.m.a;
    }

    private com.bykv.vk.openvk.preload.a.k f() {
        return this.a.get(r0.size() - 1);
    }

    private void a(com.bykv.vk.openvk.preload.a.k kVar) {
        if (this.h == null) {
            if (this.a.isEmpty()) {
                this.b = kVar;
                return;
            }
            com.bykv.vk.openvk.preload.a.k f2 = f();
            if (f2 instanceof com.bykv.vk.openvk.preload.a.i) {
                ((com.bykv.vk.openvk.preload.a.i) f2).a(kVar);
                return;
            }
            throw new IllegalStateException();
        }
        if (!(kVar instanceof com.bykv.vk.openvk.preload.a.m) || this.e) {
            ((com.bykv.vk.openvk.preload.a.n) f()).a(this.h, kVar);
        }
        this.h = null;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a() throws IOException {
        com.bykv.vk.openvk.preload.a.i iVar = new com.bykv.vk.openvk.preload.a.i();
        a(iVar);
        this.a.add(iVar);
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c b() throws IOException {
        if (this.a.isEmpty() || this.h != null) {
            throw new IllegalStateException();
        }
        if (f() instanceof com.bykv.vk.openvk.preload.a.i) {
            this.a.remove(r0.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c c() throws IOException {
        com.bykv.vk.openvk.preload.a.n nVar = new com.bykv.vk.openvk.preload.a.n();
        a(nVar);
        this.a.add(nVar);
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c d() throws IOException {
        if (this.a.isEmpty() || this.h != null) {
            throw new IllegalStateException();
        }
        if (f() instanceof com.bykv.vk.openvk.preload.a.n) {
            this.a.remove(r0.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.a.isEmpty() || this.h != null) {
            throw new IllegalStateException();
        }
        if (f() instanceof com.bykv.vk.openvk.preload.a.n) {
            this.h = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c b(String str) throws IOException {
        if (str == null) {
            return e();
        }
        a(new p(str));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c e() throws IOException {
        a(com.bykv.vk.openvk.preload.a.m.a);
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(boolean z) throws IOException {
        a(new p(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(Boolean bool) throws IOException {
        if (bool == null) {
            return e();
        }
        a(new p(bool));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(long j) throws IOException {
        a(new p(Long.valueOf(j)));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(Number number) throws IOException {
        if (number == null) {
            return e();
        }
        if (!this.c) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        a(new p(number));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.a.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.a.add(g);
    }
}
