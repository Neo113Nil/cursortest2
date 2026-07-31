package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class vu3 implements Iterator<p7>, Closeable, q7 {

    /* renamed from: l, reason: collision with root package name */
    private static final p7 f13501l = new uu3("eof ");

    /* renamed from: m, reason: collision with root package name */
    private static final cv3 f13502m = cv3.b(vu3.class);

    /* renamed from: f, reason: collision with root package name */
    protected m7 f13503f;

    /* renamed from: g, reason: collision with root package name */
    protected wu3 f13504g;

    /* renamed from: h, reason: collision with root package name */
    p7 f13505h = null;

    /* renamed from: i, reason: collision with root package name */
    long f13506i = 0;

    /* renamed from: j, reason: collision with root package name */
    long f13507j = 0;

    /* renamed from: k, reason: collision with root package name */
    private final List<p7> f13508k = new ArrayList();

    public void close() {
    }

    @Override // java.util.Iterator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final p7 next() {
        p7 a7;
        p7 p7Var = this.f13505h;
        if (p7Var != null && p7Var != f13501l) {
            this.f13505h = null;
            return p7Var;
        }
        wu3 wu3Var = this.f13504g;
        if (wu3Var == null || this.f13506i >= this.f13507j) {
            this.f13505h = f13501l;
            throw new NoSuchElementException();
        }
        try {
            synchronized (wu3Var) {
                this.f13504g.e(this.f13506i);
                a7 = this.f13503f.a(this.f13504g, this);
                this.f13506i = this.f13504g.a();
            }
            return a7;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        p7 p7Var = this.f13505h;
        if (p7Var == f13501l) {
            return false;
        }
        if (p7Var != null) {
            return true;
        }
        try {
            this.f13505h = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f13505h = f13501l;
            return false;
        }
    }

    public final List<p7> i() {
        return (this.f13504g == null || this.f13505h == f13501l) ? this.f13508k : new bv3(this.f13508k, this);
    }

    public final void q(wu3 wu3Var, long j7, m7 m7Var) {
        this.f13504g = wu3Var;
        this.f13506i = wu3Var.a();
        wu3Var.e(wu3Var.a() + j7);
        this.f13507j = wu3Var.a();
        this.f13503f = m7Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i7 = 0; i7 < this.f13508k.size(); i7++) {
            if (i7 > 0) {
                sb.append(";");
            }
            sb.append(this.f13508k.get(i7).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
