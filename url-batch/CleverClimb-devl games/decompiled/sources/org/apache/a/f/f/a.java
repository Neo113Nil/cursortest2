package org.apache.a.f.f;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.a.h.t;
import org.apache.a.y;
import org.apache.a.z;

/* compiled from: AbstractMessageParser.java */
/* loaded from: classes2.dex */
public abstract class a implements org.apache.a.g.c {

    /* renamed from: a, reason: collision with root package name */
    protected final t f9893a;

    /* renamed from: b, reason: collision with root package name */
    private final org.apache.a.g.f f9894b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9895c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9896d;
    private final List e;
    private int f;
    private org.apache.a.o g;

    protected abstract org.apache.a.o a(org.apache.a.g.f fVar) throws IOException, org.apache.a.l, y;

    public a(org.apache.a.g.f fVar, t tVar, org.apache.a.i.d dVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.f9894b = fVar;
        this.f9895c = dVar.a("http.connection.max-header-count", -1);
        this.f9896d = dVar.a("http.connection.max-line-length", -1);
        this.f9893a = tVar == null ? org.apache.a.h.j.f9954a : tVar;
        this.e = new ArrayList();
        this.f = 0;
    }

    public static org.apache.a.d[] a(org.apache.a.g.f fVar, int i, int i2, t tVar) throws org.apache.a.l, IOException {
        if (tVar == null) {
            tVar = org.apache.a.h.j.f9954a;
        }
        return a(fVar, i, i2, tVar, new ArrayList());
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        r8 = new org.apache.a.d[r12.size()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r5 >= r12.size()) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
    
        r8[r5] = r11.a((org.apache.a.k.b) r12.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        throw new org.apache.a.z(r8.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00aa, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.apache.a.d[] a(org.apache.a.g.f fVar, int i, int i2, t tVar, List list) throws org.apache.a.l, IOException {
        char a2;
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (tVar == null) {
            throw new IllegalArgumentException("Line parser may not be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("Header line list may not be null");
        }
        org.apache.a.k.b bVar = null;
        org.apache.a.k.b bVar2 = null;
        while (true) {
            if (bVar == null) {
                bVar = new org.apache.a.k.b(64);
            } else {
                bVar.a();
            }
            int i3 = 0;
            if (fVar.a(bVar) == -1 || bVar.c() < 1) {
                break;
            }
            if ((bVar.a(0) == ' ' || bVar.a(0) == '\t') && bVar2 != null) {
                while (i3 < bVar.c() && ((a2 = bVar.a(i3)) == ' ' || a2 == '\t')) {
                    i3++;
                }
                if (i2 > 0 && ((bVar2.c() + 1) + bVar.c()) - i3 > i2) {
                    throw new IOException("Maximum line length limit exceeded");
                }
                bVar2.a(' ');
                bVar2.a(bVar, i3, bVar.c() - i3);
            } else {
                list.add(bVar);
                bVar2 = bVar;
                bVar = null;
            }
            if (i > 0 && list.size() >= i) {
                throw new IOException("Maximum header count exceeded");
            }
        }
    }

    @Override // org.apache.a.g.c
    public org.apache.a.o a() throws IOException, org.apache.a.l {
        switch (this.f) {
            case 0:
                try {
                    this.g = a(this.f9894b);
                    this.f = 1;
                    break;
                } catch (y e) {
                    throw new z(e.getMessage(), e);
                }
            case 1:
                break;
            default:
                throw new IllegalStateException("Inconsistent parser state");
        }
        this.g.setHeaders(a(this.f9894b, this.f9895c, this.f9896d, this.f9893a, this.e));
        org.apache.a.o oVar = this.g;
        this.g = null;
        this.e.clear();
        this.f = 0;
        return oVar;
    }
}
