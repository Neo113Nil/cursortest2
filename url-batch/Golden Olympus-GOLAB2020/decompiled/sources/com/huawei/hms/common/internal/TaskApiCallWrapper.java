package com.huawei.hms.common.internal;

import z0.j;

/* loaded from: classes.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final TaskApiCall<? extends AnyClient, TResult> f14103a;

    /* renamed from: b, reason: collision with root package name */
    private final j f14104b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, j jVar) {
        super(1);
        this.f14103a = taskApiCall;
        this.f14104b = jVar;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.f14103a;
    }

    public j getTaskCompletionSource() {
        return this.f14104b;
    }
}
