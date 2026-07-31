package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0616x1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1557a;

    public RunnableC0616x1(Context context) {
        this.f1557a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rj rj = AbstractC0435pj.f1437a;
        Context context = this.f1557a;
        synchronized (rj) {
            if (rj.b == null) {
                rj.b = AbstractC0409oi.f1417a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                Iterator it = rj.f1030a.iterator();
                while (it.hasNext()) {
                    ((Ra) it.next()).a(rj.b);
                }
                rj.f1030a.clear();
            }
        }
    }
}
