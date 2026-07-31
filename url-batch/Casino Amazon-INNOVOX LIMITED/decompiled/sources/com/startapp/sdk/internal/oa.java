package com.startapp.sdk.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class oa {

    /* renamed from: a, reason: collision with root package name */
    public final pa f362a;

    public oa(final c7 c7Var) {
        this.f362a = new pa(new c7() { // from class: com.startapp.sdk.internal.oa$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return oa.a(c7.this);
            }
        });
    }

    public static /* synthetic */ AtomicReference a(c7 c7Var) {
        return new AtomicReference(c7Var.call());
    }

    public final Object a() {
        return ((AtomicReference) this.f362a.a()).get();
    }
}
