package io.flutter.embedding.android;

import B3.k;
import C3.o;
import android.app.Activity;
import d2.C0389g;
import f3.C0431i;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import w1.C1502a;
import x1.C1524a;
import x3.AbstractC1528C;
import x3.AbstractC1562w;
import x3.C1536K;
import x3.C1559t;
import x3.T;
import y1.j;
import y3.C1578c;

/* loaded from: classes.dex */
public class WindowInfoRepositoryCallbackAdapterWrapper {
    final C1524a adapter;

    public WindowInfoRepositoryCallbackAdapterWrapper(C1524a c1524a) {
        this.adapter = c1524a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [A3.d] */
    public void addWindowLayoutInfoListener(Activity activity, Executor executor, D.a consumer) {
        C1524a c1524a = this.adapter;
        c1524a.getClass();
        i.e(activity, "activity");
        i.e(executor, "executor");
        i.e(consumer, "consumer");
        C0389g c0389g = c1524a.f15981c;
        y1.b bVar = c1524a.f15980b;
        bVar.getClass();
        j jVar = new j(bVar, activity, null);
        z3.a aVar = z3.a.f16290a;
        C0431i c0431i = C0431i.f8817a;
        A3.c cVar = new A3.c(jVar, c0431i, -2, aVar);
        E3.e eVar = AbstractC1528C.f15989a;
        C1578c c1578c = o.f314a;
        if (c1578c.n(C1559t.f16059b) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + c1578c).toString());
        }
        A3.c cVar2 = cVar;
        if (!c1578c.equals(c0431i)) {
            cVar2 = k.a(cVar, c1578c, 0, null, 6);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0389g.f8265c;
        ReentrantLock reentrantLock = (ReentrantLock) c0389g.f8264b;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(consumer) == null) {
                linkedHashMap.put(consumer, AbstractC1562w.g(AbstractC1562w.a(new C1536K(executor)), null, new C1502a(cVar2, consumer, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void removeWindowLayoutInfoListener(D.a consumer) {
        C1524a c1524a = this.adapter;
        c1524a.getClass();
        i.e(consumer, "consumer");
        C0389g c0389g = c1524a.f15981c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0389g.f8265c;
        ReentrantLock reentrantLock = (ReentrantLock) c0389g.f8264b;
        reentrantLock.lock();
        try {
            T t4 = (T) linkedHashMap.get(consumer);
            if (t4 != null) {
                t4.b(null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
