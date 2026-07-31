package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* loaded from: classes3.dex */
public final class K6 implements Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2997tn apply(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C2997tn(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
