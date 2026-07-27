package G;

import j2.AbstractC0720j;
import java.util.concurrent.Callable;

/* renamed from: G.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2956a = false;

    public Object a(Callable callable) {
        AbstractC0720j.b("runInTransaction called when an existing transaction is already in progress.", !this.f2956a);
        this.f2956a = true;
        try {
            return callable.call();
        } finally {
        }
    }

    public void b() {
        AbstractC0720j.b("Transaction expected to already be in progress.", this.f2956a);
    }
}
