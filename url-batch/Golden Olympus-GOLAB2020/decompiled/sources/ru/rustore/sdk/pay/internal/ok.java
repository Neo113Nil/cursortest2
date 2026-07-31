package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ak;

/* loaded from: classes3.dex */
public final class ok extends kotlin.jvm.internal.s implements Function1<ak.a, ak> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f44761a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(bk bkVar) {
        super(1);
        this.f44761a = bkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak.a session = (ak.a) obj;
        Intrinsics.checkNotNullParameter(session, "session");
        n2 n2Var = this.f44761a.f43879e;
        n2Var.getClass();
        Intrinsics.checkNotNullParameter(session, "session");
        n2Var.f44670a.set(session);
        return session;
    }
}
