package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s7 extends kotlin.jvm.internal.s implements Function1<u7, rb> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t7 f44967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(t7 t7Var) {
        super(1);
        this.f44967a = t7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        sb sbVar = this.f44967a.f45037b;
        String str = response.f45085c;
        sbVar.getClass();
        return sb.a(str);
    }
}
