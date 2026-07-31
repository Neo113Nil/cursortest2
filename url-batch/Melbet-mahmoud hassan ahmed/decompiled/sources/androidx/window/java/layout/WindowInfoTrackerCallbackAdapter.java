package androidx.window.java.layout;

import android.app.Activity;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import m6.h;
import m6.h1;
import m6.l0;
import m6.m0;
import m6.o1;
import p6.b;
import q.a;
import v5.q;

/* loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<a<?>, o1> consumerToJobMap;
    private final ReentrantLock lock;
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker) {
        i.d(windowInfoTracker, "tracker");
        this.tracker = windowInfoTracker;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    private final <T> void addListener(Executor executor, a<T> aVar, b<? extends T> bVar) {
        o1 b7;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                l0 a7 = m0.a(h1.a(executor));
                Map<a<?>, o1> map = this.consumerToJobMap;
                b7 = h.b(a7, null, null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(bVar, aVar, null), 3, null);
                map.put(aVar, b7);
            }
            q qVar = q.f22838a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(a<?> aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            o1 o1Var = this.consumerToJobMap.get(aVar);
            if (o1Var != null) {
                o1.a.a(o1Var, null, 1, null);
            }
            this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        i.d(activity, "activity");
        i.d(executor, "executor");
        i.d(aVar, "consumer");
        addListener(executor, aVar, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(a<WindowLayoutInfo> aVar) {
        i.d(aVar, "consumer");
        removeListener(aVar);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        i.d(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
