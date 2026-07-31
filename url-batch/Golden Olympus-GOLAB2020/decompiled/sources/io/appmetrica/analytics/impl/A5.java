package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.collections.AbstractC3219i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class A5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f37152a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37153b;

    public A5(@NotNull IExecutionPolicy... iExecutionPolicyArr) {
        this.f37152a = iExecutionPolicyArr;
        this.f37153b = "Composite of {" + AbstractC3219i.n0(iExecutionPolicyArr, ", ", null, null, 0, null, C3135z5.f40303a, 30, null) + '}';
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.f37152a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i4];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i4++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.f37153b;
    }
}
