package com.huawei.hms.framework.common;

/* loaded from: classes.dex */
public class RunnableEnhance implements Runnable {
    static final String TRANCELOGO = " ->";

    /* renamed from: b, reason: collision with root package name */
    private Runnable f14149b;

    /* renamed from: c, reason: collision with root package name */
    private String f14150c = Thread.currentThread().getName();

    RunnableEnhance(Runnable runnable) {
        this.f14149b = runnable;
    }

    public String getParentName() {
        return this.f14150c;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f14149b.run();
    }
}
