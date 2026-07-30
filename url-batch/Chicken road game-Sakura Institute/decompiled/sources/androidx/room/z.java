package androidx.room;

import androidx.lifecycle.r0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class z {
    private final u database;
    private final AtomicBoolean lock;
    private final d6.g stmt$delegate;

    public z(u uVar) {
        r6.k.f(uVar, "database");
        this.database = uVar;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = d6.a.d(new r0(1, this));
    }

    public y3.e acquire() {
        assertNotMainThread();
        if (this.lock.compareAndSet(false, true)) {
            return (y3.e) this.stmt$delegate.getValue();
        }
        return this.database.compileStatement(createQuery());
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(y3.e eVar) {
        r6.k.f(eVar, "statement");
        if (eVar == ((y3.e) this.stmt$delegate.getValue())) {
            this.lock.set(false);
        }
    }
}
