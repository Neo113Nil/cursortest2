package com.baidu.mapapi;

import android.app.Application;
import android.content.Context;
import com.baidu.vi.VIContext;

/* loaded from: classes2.dex */
public class JNIInitializer {

    /* renamed from: a, reason: collision with root package name */
    private static Context f5308a;

    public static Context getCachedContext() {
        return f5308a;
    }

    public static void setContext(Application application) {
        if (application == null) {
            throw new RuntimeException();
        }
        if (f5308a == null) {
            f5308a = application;
        }
        VIContext.init(application);
    }
}
