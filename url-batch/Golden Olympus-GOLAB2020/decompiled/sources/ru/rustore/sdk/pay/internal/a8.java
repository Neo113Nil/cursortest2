package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseStatus;

/* loaded from: classes3.dex */
public final class a8 extends kotlin.jvm.internal.s implements Function1<PurchaseStatus, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c8 f43798a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(c8 c8Var) {
        super(1);
        this.f43798a = c8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PurchaseStatus status = (PurchaseStatus) obj;
        Intrinsics.checkNotNullParameter(status, "status");
        return Boolean.valueOf(this.f43798a.a(status));
    }
}
