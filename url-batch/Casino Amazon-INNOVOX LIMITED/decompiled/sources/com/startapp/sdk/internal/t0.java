package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.reflect.Method;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Application f429a;

    public static Context a(Context context) {
        Context context2 = f429a;
        if (context2 != null) {
            return context2;
        }
        try {
            if (context instanceof Application) {
                try {
                    f429a = (Application) context;
                } catch (Throwable unused) {
                }
                context2 = context;
            } else if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext != null) {
                    context2 = a(baseContext);
                }
            } else if (context != null) {
                context2 = context.getApplicationContext();
            }
        } catch (Throwable unused2) {
        }
        if (context2 != null) {
            return context2;
        }
        Application application = f429a;
        if (application == null) {
            synchronized (t0.class) {
                application = f429a;
                if (application == null) {
                    try {
                        Method declaredMethod = Class.forName(Activity.class.getName().concat("Thread")).getDeclaredMethod("current".concat("Application"), null);
                        declaredMethod.setAccessible(true);
                        application = (Application) declaredMethod.invoke(null, null);
                    } catch (Throwable unused3) {
                    }
                    f429a = application;
                }
            }
        }
        return application == null ? context : application;
    }
}
