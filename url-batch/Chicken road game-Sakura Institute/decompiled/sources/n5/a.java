package n5;

import java.util.concurrent.Callable;
import o5.j;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6555a = false;

    public Object a(Callable callable) {
        j.b("runInTransaction called when an existing transaction is already in progress.", !this.f6555a);
        this.f6555a = true;
        try {
            return callable.call();
        } finally {
        }
    }

    public void b() {
        j.b("Transaction expected to already be in progress.", this.f6555a);
    }
}
