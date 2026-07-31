package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ak;

/* loaded from: classes3.dex */
public final /* synthetic */ class sk extends kotlin.jvm.internal.p implements Function1<ak, Unit> {
    public sk(Object obj) {
        super(1, obj, bk.class, "set", "set(Lru/rustore/sdk/pay/internal/network/session/Session;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak session = (ak) obj;
        Intrinsics.checkNotNullParameter(session, "p0");
        bk bkVar = (bk) this.receiver;
        bkVar.getClass();
        Intrinsics.checkNotNullParameter(session, "session");
        if (session instanceof ak.c) {
            s2 s2Var = bkVar.f43880f;
            ak.c session2 = (ak.c) session;
            s2Var.getClass();
            Intrinsics.checkNotNullParameter(session2, "session");
            s2Var.f44952a.set(session2);
            h hVar = bkVar.f43878d;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(session, "session");
            hVar.f44190a.set(session);
        } else if (session instanceof ak.a) {
            n2 n2Var = bkVar.f43879e;
            ak.a session3 = (ak.a) session;
            n2Var.getClass();
            Intrinsics.checkNotNullParameter(session3, "session");
            n2Var.f44670a.set(session3);
            h hVar2 = bkVar.f43878d;
            hVar2.getClass();
            Intrinsics.checkNotNullParameter(session, "session");
            hVar2.f44190a.set(session);
        } else if (session instanceof ak.b) {
            h hVar3 = bkVar.f43878d;
            hVar3.getClass();
            Intrinsics.checkNotNullParameter(session, "session");
            hVar3.f44190a.set(session);
        }
        return Unit.f41027a;
    }
}
