package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605f5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f11821a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11822b;

    public C0605f5(IExecutionPolicy... iExecutionPolicyArr) {
        this.f11821a = iExecutionPolicyArr;
        this.f11822b = "Composite of {" + d3.g.V(iExecutionPolicyArr, ", ", C0579e5.f11725a) + '}';
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.f11821a;
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
    public final String description() {
        return this.f11822b;
    }
}
