package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fdg implements Closeable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fdg(frx frxVar, int i) {
        this.b = i;
        this.a = frxVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i != 0) {
            Object obj = this.a;
            if (i != 1) {
                hoq.I(((frx) obj).a.compareAndSet(true, false), "AccountOperationContext is already in the immutable state. This may be caused by concurrent access to the object, which is forbidden.");
                return;
            } else {
                ((fdf) obj).c = true;
                return;
            }
        }
        Object obj2 = this.a;
        synchronized (((fdl) obj2).h) {
            int i2 = ((fdl) obj2).k;
            hoq.J(i2 > 0, "Refcount went negative!", i2);
            ((fdl) obj2).k--;
            ((fdl) obj2).c();
        }
    }

    public /* synthetic */ fdg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
