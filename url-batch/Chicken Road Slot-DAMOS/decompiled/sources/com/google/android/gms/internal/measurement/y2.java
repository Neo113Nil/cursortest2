package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3003a;

    public y2() {
        this.f3003a = new ConcurrentHashMap();
    }

    public abstract Object a();

    public abstract void b(Object obj, long j, byte b10);

    public Object c(sg sgVar, oa oaVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f3003a;
        Object obj = concurrentHashMap.get(sgVar);
        if (obj != null) {
            return obj;
        }
        Object a9 = a();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(sgVar, a9);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int a10 = oaVar.a();
        for (int i3 = 0; i3 < a10; i3++) {
            if (ng.f2590f.equals(oaVar.i(i3))) {
                oaVar.j(i3);
            }
        }
        return a9;
    }

    public abstract boolean d(long j, Object obj);

    public abstract boolean e(Level level);

    public abstract void f(kg kgVar);

    public abstract void g(Object obj, long j, boolean z10);

    public abstract float h(long j, Object obj);

    public void i(RuntimeException runtimeException, kg kgVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void j(Object obj, long j, float f3);

    public abstract double k(long j, Object obj);

    public abstract void l(Object obj, long j, double d10);
}
