package com.umeng.commonsdk.proguard;

import java.lang.reflect.InvocationTargetException;

/* compiled from: TEnumHelper.java */
/* loaded from: classes2.dex */
public class n {
    public static m a(Class<? extends m> cls, int i) {
        try {
            return (m) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException unused) {
            return null;
        } catch (NoSuchMethodException unused2) {
            return null;
        } catch (InvocationTargetException unused3) {
            return null;
        }
    }
}
