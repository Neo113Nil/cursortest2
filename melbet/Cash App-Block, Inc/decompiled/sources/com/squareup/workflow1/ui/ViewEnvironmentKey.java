package com.squareup.workflow1.ui;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes8.dex */
public abstract class ViewEnvironmentKey {

    /* renamed from: type, reason: collision with root package name */
    public final KClass f1424type;

    public ViewEnvironmentKey(KClass kClass) {
        kClass.getClass();
        this.f1424type = kClass;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            ReflectionFactory reflectionFactory = Reflection.factory;
            if (!reflectionFactory.getOrCreateKotlinClass(cls).equals(reflectionFactory.getOrCreateKotlinClass(obj.getClass()))) {
                return false;
            }
        }
        if (obj != null) {
            return Intrinsics.areEqual(this.f1424type, ((ViewEnvironmentKey) obj).f1424type);
        }
        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type com.squareup.workflow1.ui.ViewEnvironmentKey<*>");
        return false;
    }

    public abstract Object getDefault();

    public final int hashCode() {
        return this.f1424type.hashCode();
    }

    public final String toString() {
        return "ViewEnvironmentKey(" + this.f1424type + ")-" + super.toString();
    }
}
