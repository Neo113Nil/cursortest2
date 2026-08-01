package com.google.android.gms.internal.measurement;

import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2310a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f2310a) {
            case 0:
                h0 h0Var = new h0();
                h0Var.f2354d = 0;
                return h0Var;
            case 1:
                oa.f(Thread.currentThread());
                ag agVar = new ag();
                agVar.f2148a = false;
                agVar.f2149b = null;
                Thread currentThread = Thread.currentThread();
                WeakHashMap weakHashMap = mf.f2544c;
                synchronized (weakHashMap) {
                    weakHashMap.put(currentThread, agVar);
                }
                return agVar;
            case 2:
                return new Random();
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    d2.l0 l0Var = new d2.l0(choreographer, a.a.l(myLooper));
                    return kotlin.coroutines.e.c(l0Var, l0Var.f3465z);
                }
                kotlin.collections.i0.l("no Looper on this thread");
                return null;
            default:
                return 0L;
        }
    }
}
