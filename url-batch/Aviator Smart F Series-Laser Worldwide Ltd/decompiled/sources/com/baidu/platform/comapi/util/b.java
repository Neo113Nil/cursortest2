package com.baidu.platform.comapi.util;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private String f9829a;

    public b(String str) {
        this.f9829a = "BaiduMapSDK-" + str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f9829a);
    }
}
