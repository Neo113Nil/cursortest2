package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class bec {
    private final Queue a;

    public bec() {
        char[] cArr = bmi.a;
        this.a = new ArrayDeque(20);
    }

    public abstract ben a();

    final ben b() {
        ben benVar = (ben) this.a.poll();
        return benVar == null ? a() : benVar;
    }

    public final void c(ben benVar) {
        Queue queue = this.a;
        if (queue.size() < 20) {
            queue.offer(benVar);
        }
    }
}
