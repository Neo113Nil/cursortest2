package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyx extends lbx {
    private final kyo c;
    private final bst d;

    public kyx(long j, kyx kyxVar, kyo kyoVar, int i) {
        super(j, kyxVar, i);
        this.c = kyoVar;
        int i2 = kyq.b;
        this.d = new bst(i2 + i2);
    }

    @Override // defpackage.lbx
    public final int a() {
        return kyq.b;
    }

    public final Object b(int i, Object obj) {
        return this.d.A(i + i + 1).a(obj);
    }

    public final Object c(int i) {
        return this.d.A(i + i).a;
    }

    public final Object d(int i) {
        return this.d.A(i + i + 1).a;
    }

    public final Object e(int i) {
        Object c = c(i);
        h(i, null);
        return c;
    }

    public final kyo f() {
        kyo kyoVar = this.c;
        kyoVar.getClass();
        return kyoVar;
    }

    public final void g(int i, boolean z) {
        if (z) {
            f().t((this.b * kyq.b) + i);
        }
        r();
    }

    public final void h(int i, Object obj) {
        this.d.A(i + i).b(obj);
    }

    public final void i(int i, Object obj) {
        this.d.A(i + i + 1).c(obj);
    }

    public final boolean j(int i, Object obj, Object obj2) {
        return this.d.A(i + i + 1).d(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x004c, code lost:
    
        h(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004f, code lost:
    
        if (r1 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0051, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // defpackage.lbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i) {
        int i2 = kyq.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        c(i);
        while (true) {
            Object d = d(i);
            if ((d instanceof kyc) || (d instanceof kzh)) {
                if (j(i, d, z ? kyq.j : kyq.k)) {
                    h(i, null);
                    g(i, !z);
                    if (z) {
                        f();
                        return;
                    }
                    return;
                }
            } else {
                if (d == kyq.j || d == kyq.k) {
                    break;
                }
                if (d != kyq.g && d != kyq.f) {
                    if (d == kyq.i || d == kyq.d || d == kyq.l) {
                        return;
                    }
                    Objects.toString(d);
                    throw new IllegalStateException("unexpected state: ".concat(String.valueOf(d)));
                }
            }
        }
    }
}
