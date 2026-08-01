package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class ha implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2371e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Serializable f2372i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2373r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2374s;

    public /* synthetic */ ha(int i3, Serializable serializable, Object obj, Object obj2, Object obj3) {
        this.f2370d = i3;
        this.f2371e = obj;
        this.f2372i = serializable;
        this.f2373r = obj2;
        this.f2374s = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2370d) {
            case 0:
                f8.x0 x0Var = (f8.x0) this.f2371e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2372i;
                Context context = (Context) this.f2373r;
                ga gaVar = (ga) this.f2374s;
                if ((x0Var.f4174d instanceof f8.d) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(gaVar);
                        break;
                    } catch (IllegalArgumentException e2) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
                        return;
                    }
                }
                break;
            default:
                v5 v5Var = xa.f2981a;
                Level level = (Level) this.f2371e;
                y2 y2Var = (y2) v5Var.f2870e;
                boolean e9 = y2Var.e(level);
                String str = (String) y2Var.f3003a;
                ((i) d.f2209a).getClass();
                n.f2553b.a(str, level, e9);
                ((jg) ((jg) (!e9 ? v5.f2868s : new kg(v5Var, level)).a((Throwable) this.f2372i)).b()).c((String) this.f2373r, (Object[]) this.f2374s);
                break;
        }
    }
}
