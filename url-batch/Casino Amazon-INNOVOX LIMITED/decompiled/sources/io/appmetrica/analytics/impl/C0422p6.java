package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* renamed from: io.appmetrica.analytics.impl.p6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0422p6 implements Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0638xn apply(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C0638xn(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
