package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public abstract class d3 {
    public abstract void a(za zaVar);

    public final boolean a(Context context, String[] strArr, ya yaVar, Bundle bundle) {
        Class cls;
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (String str : strArr) {
            try {
                cls = Class.forName(str).asSubclass(za.class);
            } catch (Throwable unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(Context.class, ya.class, Bundle.class);
                    declaredConstructor.setAccessible(true);
                    Context a3 = w0.a(context);
                    if (a3 == null) {
                        a3 = context;
                    }
                    a((za) declaredConstructor.newInstance(a3, yaVar, bundle));
                    z = true;
                } catch (Throwable unused2) {
                }
            }
        }
        return z;
    }
}
