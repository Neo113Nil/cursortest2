package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1015v1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12865a;

    public RunnableC1015v1(Context context) {
        this.f12865a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Qj qj = AbstractC0852oj.f12527a;
        Context context = this.f12865a;
        synchronized (qj) {
            try {
                if (qj.f10848b == null) {
                    qj.f10848b = AbstractC0825ni.f12468a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    ArrayList arrayList = qj.f10847a;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((Qa) obj).a(qj.f10848b);
                    }
                    qj.f10847a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
