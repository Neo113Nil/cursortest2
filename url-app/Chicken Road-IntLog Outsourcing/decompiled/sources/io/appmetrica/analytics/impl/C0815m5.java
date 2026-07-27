package io.appmetrica.analytics.impl;

import g4.AbstractC0464i;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815m5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f8765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8766b;

    public C0815m5(IExecutionPolicy... iExecutionPolicyArr) {
        this.f8765a = iExecutionPolicyArr;
        this.f8766b = B0.o.l(new StringBuilder("Composite of {"), AbstractC0464i.X(iExecutionPolicyArr, ", ", C0789l5.f8655a, 30), '}');
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.f8765a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i2];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i2++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f8766b;
    }
}
