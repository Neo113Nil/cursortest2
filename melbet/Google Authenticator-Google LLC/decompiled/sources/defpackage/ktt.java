package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktt implements Iterator {
    final /* synthetic */ ktz a;
    private Object b;
    private int c = -2;

    public ktt(ktz ktzVar) {
        this.a = ktzVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kri] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, krt] */
    private final void a() {
        Object a;
        int i = this.c;
        ktz ktzVar = this.a;
        if (i == -2) {
            a = ktzVar.b.a();
        } else {
            Object obj = this.b;
            obj.getClass();
            a = ktzVar.a.a(obj);
        }
        this.b = a;
        this.c = a == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.b;
        obj.getClass();
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.c();
    }
}
