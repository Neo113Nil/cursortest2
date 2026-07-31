package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class cv3 {
    public static cv3 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new xu3(cls.getSimpleName()) : new zu3(cls.getSimpleName());
    }

    public abstract void a(String str);
}
