package defpackage;

import java.io.Closeable;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvu implements Callable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public gvu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i != 0) {
            ?? r1 = this.a;
            if (i != 1) {
                Closeable closeable = ((Closeable[]) ((kee) r1).a)[0];
                Object obj = this.b;
                ((htu) obj).a.j(closeable, huf.a);
                return null;
            }
            guq g = gta.g(gta.a(), r1);
            try {
                return this.b.call();
            } finally {
            }
        } else {
            guq h = gta.h(gta.a(), this.a);
            try {
                return this.b.call();
            } finally {
            }
        }
    }

    public final String toString() {
        int i = this.c;
        if (i == 0) {
            return "propagating=[" + this.b + "]";
        }
        if (i != 1) {
            return ((kee) this.a).toString();
        }
        return "propagating=[" + this.b + "]";
    }
}
