package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class LA implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26112n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2631Jq f26113u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f26114v;

    public /* synthetic */ LA(C2631Jq c2631Jq, Runnable runnable, int i) {
        this.f26112n = i;
        this.f26113u = c2631Jq;
        this.f26114v = runnable;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f26112n) {
            case 0:
                C2631Jq c2631Jq = this.f26113u;
                Runnable runnable = this.f26114v;
                if (((BA) c2631Jq.f25821C) != null || c2631Jq.f25822n) {
                    if (!c2631Jq.f25822n) {
                        runnable.run();
                        return;
                    }
                    ((HE) c2631Jq.f25825w).a("Waiting to bind to the service.", new Object[0]);
                    ArrayList arrayList = (ArrayList) c2631Jq.f25827y;
                    synchronized (arrayList) {
                        arrayList.add(runnable);
                    }
                    return;
                }
                ((HE) c2631Jq.f25825w).a("Initiate binding to the service.", new Object[0]);
                ArrayList arrayList2 = (ArrayList) c2631Jq.f25827y;
                synchronized (arrayList2) {
                    arrayList2.add(runnable);
                }
                JA ja = new JA(c2631Jq);
                c2631Jq.f25820B = ja;
                c2631Jq.f25822n = true;
                if (((Context) c2631Jq.f25823u).bindService((Intent) c2631Jq.f25828z, ja, 1)) {
                    return;
                }
                ((HE) c2631Jq.f25825w).a("Failed to bind to the service.", new Object[0]);
                c2631Jq.f25822n = false;
                ArrayList arrayList3 = (ArrayList) c2631Jq.f25827y;
                synchronized (arrayList3) {
                    arrayList3.clear();
                }
                return;
            default:
                Runnable runnable2 = this.f26114v;
                C2631Jq c2631Jq2 = this.f26113u;
                c2631Jq2.getClass();
                try {
                    runnable2.run();
                    return;
                } catch (RuntimeException e6) {
                    ((HE) c2631Jq2.f25825w).c("error caused by ", e6);
                    return;
                }
        }
    }
}
