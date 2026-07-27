package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ThreadPoolExecutor;
import k1.n;
import k1.o;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5983e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5984i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5985j;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i2) {
        this.f5982d = i2;
        this.f5983e = obj;
        this.f5984i = obj2;
        this.f5985j = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5982d) {
            case 0:
                ((AFb1vSDK) this.f5983e).AFInAppEventType((Context) this.f5984i, (Intent) this.f5985j);
                return;
            case 1:
                AFd1iSDK.AFInAppEventParameterName((AFd1iSDK) this.f5983e, (Throwable) this.f5984i, (String) this.f5985j);
                return;
            case 2:
                ((AFi1aSDK) this.f5983e).values((AFi1lSDK) this.f5984i, (Runnable) this.f5985j);
                return;
            default:
                M1.b bVar = (M1.b) this.f5983e;
                M1.a aVar = (M1.a) this.f5984i;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f5985j;
                bVar.getClass();
                try {
                    o X3 = u3.l.X(bVar.f3573a);
                    if (X3 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    n nVar = (n) ((k1.g) X3.f6874b);
                    synchronized (nVar.f7400d) {
                        nVar.f7402f = threadPoolExecutor;
                    }
                    ((k1.g) X3.f6874b).a(new k1.j(aVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    aVar.K(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
