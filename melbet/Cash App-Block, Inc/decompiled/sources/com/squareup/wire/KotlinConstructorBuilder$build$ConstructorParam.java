package com.squareup.wire;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class KotlinConstructorBuilder$build$ConstructorParam {
    public final int schemaIndex;

    /* renamed from: type, reason: collision with root package name */
    public final Class f1417type;
    public final Function0 value;

    public KotlinConstructorBuilder$build$ConstructorParam(Class cls, int i, Function0 function0) {
        cls.getClass();
        this.f1417type = cls;
        this.schemaIndex = i;
        this.value = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinConstructorBuilder$build$ConstructorParam)) {
            return false;
        }
        KotlinConstructorBuilder$build$ConstructorParam kotlinConstructorBuilder$build$ConstructorParam = (KotlinConstructorBuilder$build$ConstructorParam) obj;
        return Intrinsics.areEqual(this.f1417type, kotlinConstructorBuilder$build$ConstructorParam.f1417type) && this.schemaIndex == kotlinConstructorBuilder$build$ConstructorParam.schemaIndex && this.value.equals(kotlinConstructorBuilder$build$ConstructorParam.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.schemaIndex, this.f1417type.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConstructorParam(type=" + this.f1417type + ", schemaIndex=" + this.schemaIndex + ", value=" + this.value + ')';
    }
}
