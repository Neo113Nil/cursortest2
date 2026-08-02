package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kpw {
    public final kpy a;
    public int b;
    public int c = -1;
    private int d;

    public kpw(kpy kpyVar) {
        this.a = kpyVar;
        this.d = kpyVar.f;
        b();
    }

    public final void a() {
        if (this.a.f != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            kpy kpyVar = this.a;
            if (i >= kpyVar.e || kpyVar.d[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.e;
    }

    public final void remove() {
        a();
        if (this.c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        kpy kpyVar = this.a;
        kpyVar.f();
        kpyVar.g(this.c);
        this.c = -1;
        this.d = kpyVar.f;
    }
}
