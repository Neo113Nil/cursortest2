package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.bk;

/* loaded from: classes3.dex */
public final class ik extends kotlin.jvm.internal.s implements Function1<ak, bk.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final ik f44348a = new ik();

    public ik() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak session = (ak) obj;
        Intrinsics.checkNotNullParameter(session, "session");
        return new bk.a.b(session);
    }
}
