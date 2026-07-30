package com.anythink.core.common.n.c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: a, reason: collision with root package name */
    private final e f16044a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f16045b;

    /* renamed from: c, reason: collision with root package name */
    private int f16046c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16047d;

    private m(w wVar, Inflater inflater) {
        this(n.a(wVar), inflater);
    }

    private boolean b() {
        if (!this.f16045b.needsInput()) {
            return false;
        }
        c();
        if (this.f16045b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f16044a.g()) {
            return true;
        }
        s sVar = this.f16044a.c().f16004b;
        int i = sVar.f16074e;
        int i4 = sVar.f16073d;
        int i9 = i - i4;
        this.f16046c = i9;
        this.f16045b.setInput(sVar.f16072c, i4, i9);
        return false;
    }

    private void c() {
        int i = this.f16046c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f16045b.getRemaining();
        this.f16046c -= remaining;
        this.f16044a.i(remaining);
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f16044a.a();
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j9) {
        boolean z8;
        if (j9 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
        }
        if (this.f16047d) {
            throw new IllegalStateException("closed");
        }
        if (j9 == 0) {
            return 0L;
        }
        do {
            z8 = false;
            if (this.f16045b.needsInput()) {
                c();
                if (this.f16045b.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                if (this.f16044a.g()) {
                    z8 = true;
                } else {
                    s sVar = this.f16044a.c().f16004b;
                    int i = sVar.f16074e;
                    int i4 = sVar.f16073d;
                    int i9 = i - i4;
                    this.f16046c = i9;
                    this.f16045b.setInput(sVar.f16072c, i4, i9);
                }
            }
            try {
                s g9 = cVar.g(1);
                int inflate = this.f16045b.inflate(g9.f16072c, g9.f16074e, (int) Math.min(j9, 8192 - g9.f16074e));
                if (inflate > 0) {
                    g9.f16074e += inflate;
                    long j10 = inflate;
                    cVar.f16005c += j10;
                    return j10;
                }
                if (!this.f16045b.finished() && !this.f16045b.needsDictionary()) {
                }
                c();
                if (g9.f16073d != g9.f16074e) {
                    return -1L;
                }
                cVar.f16004b = g9.c();
                t.a(g9);
                return -1L;
            } catch (DataFormatException e6) {
                throw new IOException(e6);
            }
        } while (!z8);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16047d) {
            return;
        }
        this.f16045b.end();
        this.f16047d = true;
        this.f16044a.close();
    }

    public m(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f16044a = eVar;
        this.f16045b = inflater;
    }
}
