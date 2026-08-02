package defpackage;

import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hot extends ham {
    final /* synthetic */ Deque a;
    final /* synthetic */ Deque b;

    public hot(Deque deque, Deque deque2) {
        this.a = deque;
        this.b = deque2;
    }

    @Override // defpackage.ham
    protected final Object a() {
        Deque deque = this.a;
        while (true) {
            Object b = hoq.b(deque);
            if (b == null) {
                Deque deque2 = this.b;
                if (!deque2.isEmpty()) {
                    return deque2.pop();
                }
                b();
                return null;
            }
            Iterator it = hoq.r(b).iterator();
            if (!it.hasNext()) {
                return b;
            }
            deque.addFirst(it);
            this.b.push(b);
        }
    }
}
