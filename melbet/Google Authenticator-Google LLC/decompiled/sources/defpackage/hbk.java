package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hbk extends hbp implements Serializable {
    private static final long serialVersionUID = 0;
    transient hik a = g();
    transient long b;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.a = g();
        for (int i = 0; i < readInt; i++) {
            a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(j().size());
        for (hid hidVar : j()) {
            objectOutputStream.writeObject(hidVar.a);
            objectOutputStream.writeInt(hidVar.a());
        }
    }

    @Override // defpackage.hbp, defpackage.hic
    public final int a(Object obj, int i) {
        if (i == 0) {
            return b(obj);
        }
        hoq.A(i > 0, "occurrences cannot be negative: %s", i);
        int d = this.a.d(obj);
        long j = i;
        hik hikVar = this.a;
        if (d == -1) {
            hikVar.o(obj, i);
            this.b += j;
            return 0;
        }
        int c = hikVar.c(d);
        long j2 = c + j;
        hoq.B(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.a.m(d, (int) j2);
        this.b += j;
        return c;
    }

    @Override // defpackage.hic
    public final int b(Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.hbp
    public final int c() {
        return this.a.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        hik hikVar = this.a;
        hikVar.d++;
        Arrays.fill(hikVar.a, 0, hikVar.c, (Object) null);
        Arrays.fill(hikVar.b, 0, hikVar.c, 0);
        Arrays.fill(hikVar.e, -1);
        Arrays.fill(hikVar.f, -1L);
        hikVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.hbp, defpackage.hic
    public final int d(Object obj, int i) {
        hoq.A(true, "occurrences cannot be negative: %s", i);
        int d = this.a.d(obj);
        if (d == -1) {
            return 0;
        }
        int c = this.a.c(d);
        hik hikVar = this.a;
        if (c > i) {
            hikVar.m(d, c - i);
        } else {
            hikVar.g(d);
            i = c;
        }
        this.b -= i;
        return c;
    }

    @Override // defpackage.hbp
    public final Iterator e() {
        return new hbh(this);
    }

    @Override // defpackage.hbp
    public final Iterator f() {
        return new hbi(this);
    }

    public abstract hik g();

    @Override // defpackage.hbp, defpackage.hic
    public final boolean h(Object obj, int i) {
        hnu.ap(i, "oldCount");
        int d = this.a.d(obj);
        if (d == -1) {
            return i == 0;
        }
        if (this.a.c(d) != i) {
            return false;
        }
        this.a.g(d);
        this.b -= i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new hig(this, j().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.hic
    public final int size() {
        return hnu.ba(this.b);
    }
}
