package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hk extends kotlin.jvm.internal.s implements Function1<?, ak> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f44290a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(bk bkVar) {
        super(1);
        this.f44290a = bkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak session = (ak) obj;
        Intrinsics.checkNotNullParameter(session, "session");
        h hVar = this.f44290a.f43878d;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(session, "session");
        hVar.f44190a.set(session);
        return session;
    }
}
