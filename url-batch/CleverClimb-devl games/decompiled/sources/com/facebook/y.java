package com.facebook;

import android.os.Handler;
import com.facebook.p;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ProgressOutputStream.java */
/* loaded from: classes.dex */
class y extends FilterOutputStream implements z {

    /* renamed from: a, reason: collision with root package name */
    private final Map<GraphRequest, aa> f6473a;

    /* renamed from: b, reason: collision with root package name */
    private final p f6474b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6475c;

    /* renamed from: d, reason: collision with root package name */
    private long f6476d;
    private long e;
    private long f;
    private aa g;

    y(OutputStream outputStream, p pVar, Map<GraphRequest, aa> map, long j) {
        super(outputStream);
        this.f6474b = pVar;
        this.f6473a = map;
        this.f = j;
        this.f6475c = l.h();
    }

    private void a(long j) {
        if (this.g != null) {
            this.g.a(j);
        }
        this.f6476d += j;
        if (this.f6476d >= this.e + this.f6475c || this.f6476d >= this.f) {
            a();
        }
    }

    private void a() {
        if (this.f6476d > this.e) {
            for (p.a aVar : this.f6474b.e()) {
                if (aVar instanceof p.b) {
                    Handler c2 = this.f6474b.c();
                    final p.b bVar = (p.b) aVar;
                    if (c2 == null) {
                        bVar.a(this.f6474b, this.f6476d, this.f);
                    } else {
                        c2.post(new Runnable() { // from class: com.facebook.y.1
                            @Override // java.lang.Runnable
                            public void run() {
                                bVar.a(y.this.f6474b, y.this.f6476d, y.this.f);
                            }
                        });
                    }
                }
            }
            this.e = this.f6476d;
        }
    }

    @Override // com.facebook.z
    public void a(GraphRequest graphRequest) {
        this.g = graphRequest != null ? this.f6473a.get(graphRequest) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        a(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        a(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        this.out.write(i);
        a(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<aa> it = this.f6473a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        a();
    }
}
