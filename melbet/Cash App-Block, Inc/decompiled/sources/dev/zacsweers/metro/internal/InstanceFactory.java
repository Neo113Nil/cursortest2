package dev.zacsweers.metro.internal;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InstanceFactory implements Factory, Lazy {
    public final Object value;

    public /* synthetic */ InstanceFactory(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InstanceFactory m4115boximpl(Object obj) {
        return new InstanceFactory(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InstanceFactory) {
            return Intrinsics.areEqual(this.value, ((InstanceFactory) obj).value);
        }
        return false;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.value;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
