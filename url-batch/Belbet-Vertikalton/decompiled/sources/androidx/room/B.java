package androidx.room;

import androidx.lifecycle.K;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.InterfaceC0203e;

/* loaded from: classes.dex */
public abstract class B {
    private final w database;
    private final AtomicBoolean lock;
    private final W0.b stmt$delegate;

    public B(w wVar) {
        j1.h.e(wVar, "database");
        this.database = wVar;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = new W0.g(new K(1, this));
    }

    public InterfaceC0203e acquire() {
        assertNotMainThread();
        if (this.lock.compareAndSet(false, true)) {
            return (InterfaceC0203e) ((W0.g) this.stmt$delegate).a();
        }
        return this.database.compileStatement(createQuery());
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(InterfaceC0203e interfaceC0203e) {
        j1.h.e(interfaceC0203e, "statement");
        if (interfaceC0203e == ((InterfaceC0203e) ((W0.g) this.stmt$delegate).a())) {
            this.lock.set(false);
        }
    }
}
