package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class y2 {
    public abstract void a(ga gaVar);

    public final boolean a(Context context, String[] strArr, fa faVar, Bundle bundle) {
        Class cls;
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (String str : strArr) {
            try {
                cls = Class.forName(str).asSubclass(ga.class);
            } catch (Throwable unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(Context.class, fa.class, Bundle.class);
                    declaredConstructor.setAccessible(true);
                    Context a2 = t0.a(context);
                    if (a2 == null) {
                        a2 = context;
                    }
                    a((ga) declaredConstructor.newInstance(a2, faVar, bundle));
                    z = true;
                } catch (Throwable unused2) {
                }
            }
        }
        return z;
    }
}
