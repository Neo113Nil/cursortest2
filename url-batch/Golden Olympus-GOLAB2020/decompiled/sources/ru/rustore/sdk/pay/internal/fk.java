package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fk extends kotlin.jvm.internal.s implements Function1<ak, ak> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f44133a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(bk bkVar) {
        super(1);
        this.f44133a = bkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak session = (ak) obj;
        Intrinsics.checkNotNullParameter(session, "session");
        h hVar = this.f44133a.f43878d;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(session, "session");
        hVar.f44190a.set(session);
        return session;
    }
}
