package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eq {
    private static final Object b = new Object();
    private static Executor c;
    public Executor a;
    private final ez d;

    public eq(ez ezVar) {
        this.d = ezVar;
    }

    public final brr a() {
        if (this.a == null) {
            synchronized (b) {
                if (c == null) {
                    c = Executors.newFixedThreadPool(2);
                }
            }
            this.a = c;
        }
        return new brr(this.a, this.d);
    }
}
