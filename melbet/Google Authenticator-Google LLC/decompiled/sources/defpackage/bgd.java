package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgd {
    private static final Queue a;
    private int b;
    private int c;
    private Object d;

    static {
        char[] cArr = bmi.a;
        a = new ArrayDeque(0);
    }

    private bgd() {
    }

    public static bgd b(Object obj) {
        bgd bgdVar;
        Queue queue = a;
        synchronized (queue) {
            bgdVar = (bgd) queue.poll();
        }
        if (bgdVar == null) {
            bgdVar = new bgd();
        }
        bgdVar.d = obj;
        bgdVar.c = 0;
        bgdVar.b = 0;
        return bgdVar;
    }

    public final void a() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bgd) {
            bgd bgdVar = (bgd) obj;
            int i = bgdVar.c;
            int i2 = bgdVar.b;
            if (this.d.equals(bgdVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
