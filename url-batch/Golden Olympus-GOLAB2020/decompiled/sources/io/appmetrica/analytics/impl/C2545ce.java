package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2545ce extends kotlin.jvm.internal.p implements Function1 {
    public C2545ce(Object obj) {
        super(1, obj, C2572de.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2572de c2572de = (C2572de) this.receiver;
        c2572de.f38851a.markCrashCompleted((String) obj);
        c2572de.f38851a.deleteCompletedCrashes();
        return Unit.f41027a;
    }
}
