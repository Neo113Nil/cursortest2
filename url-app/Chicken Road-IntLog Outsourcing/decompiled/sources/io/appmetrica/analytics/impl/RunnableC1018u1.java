package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1018u1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9331a;

    public RunnableC1018u1(Context context) {
        this.f9331a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Vj vj = AbstractC1010tj.f9323a;
        Context context = this.f9331a;
        synchronized (vj) {
            try {
                if (vj.f7636b == null) {
                    vj.f7636b = AbstractC0983si.f9260a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = vj.f7635a.iterator();
                    while (it.hasNext()) {
                        ((Xa) it.next()).a(vj.f7636b);
                    }
                    vj.f7635a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
