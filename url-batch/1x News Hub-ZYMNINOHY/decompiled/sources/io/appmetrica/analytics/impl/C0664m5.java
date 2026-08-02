package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664m5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f7856a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7857b;

    public C0664m5(IExecutionPolicy... iExecutionPolicyArr) {
        this.f7856a = iExecutionPolicyArr;
        this.f7857b = "Composite of {" + c2.c.U(iExecutionPolicyArr, ", ", C0638l5.f7753a) + '}';
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.f7856a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i3];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i3++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f7857b;
    }
}
