package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jly extends jjq {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int b;
    public final jjq c;
    public final jjq e;
    public final int f;
    private final int g;

    public jly(jjq jjqVar, jjq jjqVar2) {
        this.c = jjqVar;
        this.e = jjqVar2;
        int c = jjqVar.c();
        this.g = c;
        this.b = c + jjqVar2.c();
        this.f = Math.max(jjqVar.m(), jjqVar2.m()) + 1;
    }

    public static jjq C(jjq jjqVar, jjq jjqVar2) {
        int c = jjqVar.c();
        int c2 = jjqVar2.c();
        byte[] bArr = new byte[c + c2];
        jjqVar.B(bArr, 0, c);
        jjqVar2.B(bArr, c, c2);
        return jjq.u(bArr);
    }

    public static int l(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.jjq
    public final byte a(int i) {
        int i2 = this.g;
        return i < i2 ? this.c.a(i) : this.e.a(i - i2);
    }

    @Override // defpackage.jjq
    protected final int b(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.g;
        if (i4 <= i5) {
            return this.c.b(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.e.b(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.e.b(this.c.b(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.jjq
    public final int c() {
        return this.b;
    }

    @Override // defpackage.jjq
    public final jjq d(int i, int i2) {
        return e(i, i2);
    }

    @Override // defpackage.jjq
    public final jjq e(int i, int i2) {
        int i3 = this.b;
        int o = o(i, i2, i3);
        if (o == 0) {
            return jjq.d;
        }
        if (o == i3) {
            return this;
        }
        int i4 = this.g;
        if (i2 <= i4) {
            return this.c.d(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.e.d(i - i4, i5);
        }
        jjq jjqVar = this.c;
        return new jly(jjqVar.d(i, jjqVar.c()), this.e.d(0, i5));
    }

    @Override // defpackage.jjq
    public final jju f() {
        ArrayList arrayList = new ArrayList();
        jlx jlxVar = new jlx(this);
        while (jlxVar.hasNext()) {
            arrayList.add(jlxVar.next().g());
        }
        int i = jju.f;
        return jju.L(new jle(arrayList), 4096);
    }

    @Override // defpackage.jjq
    public final ByteBuffer g() {
        throw null;
    }

    @Override // defpackage.jjq
    protected final void h(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.g;
        if (i4 <= i5) {
            this.c.h(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.e.h(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.c.h(bArr, i, i2, i6);
            this.e.h(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.jjq
    public final void i(jji jjiVar) {
        this.c.i(jjiVar);
        this.e.i(jjiVar);
    }

    @Override // defpackage.jjq, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new jlw(this);
    }

    @Override // defpackage.jjq
    public final void j(OutputStream outputStream) {
        this.c.j(outputStream);
        this.e.j(outputStream);
    }

    @Override // defpackage.jjq
    public final boolean k(jjq jjqVar) {
        jlx jlxVar = new jlx(this);
        jjn next = jlxVar.next();
        jlx jlxVar2 = new jlx(jjqVar);
        jjn next2 = jlxVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int c = next.c() - i;
            int c2 = next2.c() - i2;
            int min = Math.min(c, c2);
            if (!(i == 0 ? next.l(next2, i2, min) : next2.l(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.b;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == c) {
                i = 0;
                next = jlxVar.next();
            } else {
                i += min;
                next = next;
            }
            if (min == c2) {
                next2 = jlxVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // defpackage.jjq
    protected final int m() {
        return this.f;
    }

    @Override // defpackage.jjq
    public final boolean n() {
        return this.b >= l(this.f);
    }

    @Override // defpackage.jjq
    /* renamed from: p */
    public final jjm iterator() {
        return new jlw(this);
    }

    Object writeReplace() {
        return jjq.u(x());
    }
}
