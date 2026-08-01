package androidx.room;

import androidx.lifecycle.K;
import i0.InterfaceC0146e;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class y {
    private final t database;
    private final AtomicBoolean lock;
    private final U0.b stmt$delegate;

    public y(t tVar) {
        g1.f.e(tVar, "database");
        this.database = tVar;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = new U0.g(new K(1, this));
    }

    public InterfaceC0146e acquire() {
        assertNotMainThread();
        if (this.lock.compareAndSet(false, true)) {
            return (InterfaceC0146e) ((U0.g) this.stmt$delegate).a();
        }
        return this.database.compileStatement(createQuery());
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(InterfaceC0146e interfaceC0146e) {
        g1.f.e(interfaceC0146e, "statement");
        if (interfaceC0146e == ((InterfaceC0146e) ((U0.g) this.stmt$delegate).a())) {
            this.lock.set(false);
        }
    }
}
