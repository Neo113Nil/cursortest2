package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2923r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f39695a;

    public RunnableC2923r1(Context context) {
        this.f39695a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2551ck c2551ck = Bj.f37257a;
        Context context = this.f39695a;
        synchronized (c2551ck) {
            try {
                if (c2551ck.f38788b == null) {
                    c2551ck.f38788b = Ai.f37187a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    ArrayList arrayList = c2551ck.f38787a;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((InterfaceC2778lb) obj).a(c2551ck.f38788b);
                    }
                    c2551ck.f38787a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
