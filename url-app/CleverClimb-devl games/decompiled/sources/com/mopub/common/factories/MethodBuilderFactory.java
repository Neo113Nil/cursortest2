package com.mopub.common.factories;

import com.mopub.common.util.Reflection;

/* loaded from: classes2.dex */
public class MethodBuilderFactory {
    protected static MethodBuilderFactory instance = new MethodBuilderFactory();

    @Deprecated
    public static void setInstance(MethodBuilderFactory methodBuilderFactory) {
        instance = methodBuilderFactory;
    }

    public static Reflection.MethodBuilder create(Object obj, String str) {
        return instance.internalCreate(obj, str);
    }

    protected Reflection.MethodBuilder internalCreate(Object obj, String str) {
        return new Reflection.MethodBuilder(obj, str);
    }
}
