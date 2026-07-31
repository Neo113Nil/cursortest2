package o2;

import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f19696a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f19697b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    private int f19698c = Integer.MIN_VALUE;

    public void a(int i7) {
        synchronized (this.f19696a) {
            this.f19697b.add(Integer.valueOf(i7));
            this.f19698c = Math.max(this.f19698c, i7);
        }
    }

    public void b(int i7) {
        synchronized (this.f19696a) {
            this.f19697b.remove(Integer.valueOf(i7));
            this.f19698c = this.f19697b.isEmpty() ? Integer.MIN_VALUE : ((Integer) m0.j(this.f19697b.peek())).intValue();
            this.f19696a.notifyAll();
        }
    }
}
