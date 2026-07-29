package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes2.dex */
public final class d extends com.google.gson.c.c {

    /* renamed from: a, reason: collision with root package name */
    private static final Writer f6592a = new Writer() { // from class: com.google.gson.internal.bind.d.1
        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final o f6593b = new o("closed");

    /* renamed from: c, reason: collision with root package name */
    private final List<j> f6594c;

    /* renamed from: d, reason: collision with root package name */
    private String f6595d;
    private j e;

    @Override // com.google.gson.c.c, java.io.Flushable
    public void flush() throws IOException {
    }

    public d() {
        super(f6592a);
        this.f6594c = new ArrayList();
        this.e = l.f6665a;
    }

    public j a() {
        if (!this.f6594c.isEmpty()) {
            throw new IllegalStateException("Expected one JSON element but was " + this.f6594c);
        }
        return this.e;
    }

    private j j() {
        return this.f6594c.get(this.f6594c.size() - 1);
    }

    private void a(j jVar) {
        if (this.f6595d != null) {
            if (!jVar.l() || i()) {
                ((m) j()).a(this.f6595d, jVar);
            }
            this.f6595d = null;
            return;
        }
        if (this.f6594c.isEmpty()) {
            this.e = jVar;
            return;
        }
        j j = j();
        if (j instanceof com.google.gson.g) {
            ((com.google.gson.g) j).a(jVar);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c b() throws IOException {
        com.google.gson.g gVar = new com.google.gson.g();
        a(gVar);
        this.f6594c.add(gVar);
        return this;
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c c() throws IOException {
        if (this.f6594c.isEmpty() || this.f6595d != null) {
            throw new IllegalStateException();
        }
        if (j() instanceof com.google.gson.g) {
            this.f6594c.remove(this.f6594c.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c d() throws IOException {
        m mVar = new m();
        a(mVar);
        this.f6594c.add(mVar);
        return this;
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c e() throws IOException {
        if (this.f6594c.isEmpty() || this.f6595d != null) {
            throw new IllegalStateException();
        }
        if (j() instanceof m) {
            this.f6594c.remove(this.f6594c.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c a(String str) throws IOException {
        if (this.f6594c.isEmpty() || this.f6595d != null) {
            throw new IllegalStateException();
        }
        if (j() instanceof m) {
            this.f6595d = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c b(String str) throws IOException {
        if (str == null) {
            return f();
        }
        a(new o(str));
        return this;
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c f() throws IOException {
        a(l.f6665a);
        return this;
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c a(boolean z) throws IOException {
        a(new o(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c a(Boolean bool) throws IOException {
        if (bool == null) {
            return f();
        }
        a(new o(bool));
        return this;
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c a(long j) throws IOException {
        a(new o((Number) Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.c.c
    public com.google.gson.c.c a(Number number) throws IOException {
        if (number == null) {
            return f();
        }
        if (!g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a(new o(number));
        return this;
    }

    @Override // com.google.gson.c.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f6594c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f6594c.add(f6593b);
    }
}
