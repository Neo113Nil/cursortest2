package com.squareup.wire;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class RuntimeEnumAdapter extends EnumAdapter {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Method fromValueMethod;
    public final Class javaType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RuntimeEnumAdapter(Class cls, Syntax syntax) {
        super(r0, syntax, (WireEnum) r4);
        Object obj;
        cls.getClass();
        syntax.getClass();
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(cls);
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            WireEnum wireEnum = (WireEnum) obj;
            wireEnum.getClass();
            if (wireEnum.getValue() == 0) {
                break;
            } else {
                i++;
            }
        }
        this.javaType = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof RuntimeEnumAdapter) && Intrinsics.areEqual(((RuntimeEnumAdapter) obj).getType(), getType());
    }

    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Method method = this.fromValueMethod;
        if (method == null) {
            method = this.javaType.getMethod("fromValue", Integer.TYPE);
            this.fromValueMethod = method;
            method.getClass();
        }
        Object invoke = method.invoke(null, Integer.valueOf(i));
        invoke.getClass();
        return (WireEnum) invoke;
    }

    public final int hashCode() {
        KClass type2 = getType();
        if (type2 != null) {
            return type2.hashCode();
        }
        return 0;
    }
}
