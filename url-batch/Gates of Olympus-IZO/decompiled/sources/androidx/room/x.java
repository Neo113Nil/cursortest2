package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class x {
    private final s database;
    private final AtomicBoolean lock;
    private final L1.g stmt$delegate;

    public x(s sVar) {
        Z1.i.f(sVar, "database");
        this.database = sVar;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = I2.d.F(new A2.l(17, this));
    }

    public v1.e acquire() {
        assertNotMainThread();
        if (this.lock.compareAndSet(false, true)) {
            return (v1.e) this.stmt$delegate.getValue();
        }
        return this.database.compileStatement(createQuery());
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(v1.e eVar) {
        Z1.i.f(eVar, "statement");
        if (eVar == ((v1.e) this.stmt$delegate.getValue())) {
            this.lock.set(false);
        }
    }
}
