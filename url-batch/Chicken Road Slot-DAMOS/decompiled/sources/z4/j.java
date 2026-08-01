package z4;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f10761b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f10762c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f10763d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f10760a = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f10764e = new ReentrantLock();

    public j(int i3) {
        this.f10761b = new long[i3];
        this.f10762c = new boolean[i3];
    }
}
