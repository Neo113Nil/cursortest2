package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class y84 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<x84> f14582a = new CopyOnWriteArrayList<>();

    public final void a(Handler handler, z84 z84Var) {
        c(z84Var);
        this.f14582a.add(new x84(handler, z84Var));
    }

    public final void b(final int i7, final long j7, final long j8) {
        boolean z6;
        Handler handler;
        Iterator<x84> it = this.f14582a.iterator();
        while (it.hasNext()) {
            final x84 next = it.next();
            z6 = next.f14091c;
            if (!z6) {
                handler = next.f14089a;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.w84
                    @Override // java.lang.Runnable
                    public final void run() {
                        z84 z84Var;
                        x84 x84Var = x84.this;
                        int i8 = i7;
                        long j9 = j7;
                        long j10 = j8;
                        z84Var = x84Var.f14090b;
                        z84Var.d(i8, j9, j10);
                    }
                });
            }
        }
    }

    public final void c(z84 z84Var) {
        z84 z84Var2;
        Iterator<x84> it = this.f14582a.iterator();
        while (it.hasNext()) {
            x84 next = it.next();
            z84Var2 = next.f14090b;
            if (z84Var2 == z84Var) {
                next.c();
                this.f14582a.remove(next);
            }
        }
    }
}
