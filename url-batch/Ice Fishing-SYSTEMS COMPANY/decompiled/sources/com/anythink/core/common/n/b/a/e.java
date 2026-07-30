package com.anythink.core.common.n.b.a;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15268c;

    public /* synthetic */ e(int i, String str, boolean z8) {
        this.f15266a = i;
        this.f15267b = str;
        this.f15268c = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a9;
        switch (this.f15266a) {
            case 0:
                a9 = c.a(this.f15267b, this.f15268c, runnable);
                return a9;
            default:
                Thread thread = new Thread(runnable, this.f15267b);
                thread.setDaemon(this.f15268c);
                return thread;
        }
    }
}
