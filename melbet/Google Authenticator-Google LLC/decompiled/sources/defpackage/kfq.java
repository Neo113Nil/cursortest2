package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfq extends kek {
    private static final kfo b = new kfm(1);
    private static final kfo c = new kfm(0);
    private static final kfo d = new kfm(2);
    private static final kfp e = new kfn();
    public int a;
    private final Deque f;
    private Deque g;
    private boolean h;

    public kfq() {
        this.f = new ArrayDeque();
    }

    private final int l(kfp kfpVar, int i, Object obj, int i2) {
        a(i);
        Deque deque = this.f;
        if (!deque.isEmpty()) {
            o();
        }
        while (i > 0 && !deque.isEmpty()) {
            kkb kkbVar = (kkb) deque.peek();
            int min = Math.min(i, kkbVar.f());
            i2 = kfpVar.a(kkbVar, min, obj, i2);
            i -= min;
            this.a -= min;
            o();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int m(kfo kfoVar, int i, Object obj, int i2) {
        try {
            return l(kfoVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void n() {
        if (!this.h) {
            ((kkb) this.f.remove()).close();
            return;
        }
        Deque deque = this.g;
        Deque deque2 = this.f;
        deque.add((kkb) deque2.remove());
        kkb kkbVar = (kkb) deque2.peek();
        if (kkbVar != null) {
            kkbVar.b();
        }
    }

    private final void o() {
        if (((kkb) this.f.peek()).f() == 0) {
            n();
        }
    }

    @Override // defpackage.kek, defpackage.kkb
    public final void b() {
        if (this.g == null) {
            this.g = new ArrayDeque(Math.min(this.f.size(), 16));
        }
        while (!this.g.isEmpty()) {
            ((kkb) this.g.remove()).close();
        }
        this.h = true;
        kkb kkbVar = (kkb) this.f.peek();
        if (kkbVar != null) {
            kkbVar.b();
        }
    }

    @Override // defpackage.kek, defpackage.kkb
    public final void c() {
        if (!this.h) {
            throw new InvalidMarkException();
        }
        Deque deque = this.f;
        kkb kkbVar = (kkb) deque.peek();
        if (kkbVar != null) {
            int f = kkbVar.f();
            kkbVar.c();
            this.a += kkbVar.f() - f;
        }
        while (true) {
            kkb kkbVar2 = (kkb) this.g.pollLast();
            if (kkbVar2 == null) {
                return;
            }
            kkbVar2.c();
            deque.addFirst(kkbVar2);
            this.a += kkbVar2.f();
        }
    }

    @Override // defpackage.kek, defpackage.kkb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.f;
            if (deque.isEmpty()) {
                break;
            } else {
                ((kkb) deque.remove()).close();
            }
        }
        if (this.g != null) {
            while (!this.g.isEmpty()) {
                ((kkb) this.g.remove()).close();
            }
        }
    }

    @Override // defpackage.kek, defpackage.kkb
    public final boolean d() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            if (!((kkb) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.kkb
    public final int e() {
        return m(b, 1, null, 0);
    }

    @Override // defpackage.kkb
    public final int f() {
        return this.a;
    }

    @Override // defpackage.kkb
    public final kkb g(int i) {
        kkb kkbVar;
        int i2;
        kkb kkbVar2;
        if (i <= 0) {
            return kkf.a;
        }
        a(i);
        this.a -= i;
        kkb kkbVar3 = null;
        kfq kfqVar = null;
        while (true) {
            Deque deque = this.f;
            kkb kkbVar4 = (kkb) deque.peek();
            int f = kkbVar4.f();
            if (f > i) {
                kkbVar2 = kkbVar4.g(i);
                i2 = 0;
            } else {
                if (this.h) {
                    kkbVar = kkbVar4.g(f);
                    n();
                } else {
                    kkbVar = (kkb) deque.poll();
                }
                kkb kkbVar5 = kkbVar;
                i2 = i - f;
                kkbVar2 = kkbVar5;
            }
            if (kkbVar3 == null) {
                kkbVar3 = kkbVar2;
            } else {
                if (kfqVar == null) {
                    kfqVar = new kfq(i2 != 0 ? Math.min(deque.size() + 2, 16) : 2);
                    kfqVar.h(kkbVar3);
                    kkbVar3 = kfqVar;
                }
                kfqVar.h(kkbVar2);
            }
            if (i2 <= 0) {
                return kkbVar3;
            }
            i = i2;
        }
    }

    public final void h(kkb kkbVar) {
        boolean z = this.h && this.f.isEmpty();
        if (kkbVar instanceof kfq) {
            kfq kfqVar = (kfq) kkbVar;
            while (true) {
                Deque deque = kfqVar.f;
                if (deque.isEmpty()) {
                    break;
                } else {
                    this.f.add((kkb) deque.remove());
                }
            }
            this.a += kfqVar.a;
            kfqVar.a = 0;
            kfqVar.close();
        } else {
            this.f.add(kkbVar);
            this.a += kkbVar.f();
        }
        if (z) {
            ((kkb) this.f.peek()).b();
        }
    }

    @Override // defpackage.kkb
    public final void i(OutputStream outputStream, int i) {
        l(e, i, outputStream, 0);
    }

    @Override // defpackage.kkb
    public final void j(byte[] bArr, int i, int i2) {
        m(d, i2, bArr, i);
    }

    @Override // defpackage.kkb
    public final void k(int i) {
        m(c, i, null, 0);
    }

    public kfq(int i) {
        this.f = new ArrayDeque(i);
    }
}
