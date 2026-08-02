package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0893v1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f8476a;

    public RunnableC0893v1(Context context) {
        this.f8476a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Vj vj = AbstractC0859tj.f8379a;
        Context context = this.f8476a;
        synchronized (vj) {
            try {
                if (vj.f6803b == null) {
                    vj.f6803b = AbstractC0832si.f8319a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = vj.f6802a.iterator();
                    while (it.hasNext()) {
                        ((Xa) it.next()).a(vj.f6803b);
                    }
                    vj.f6802a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
