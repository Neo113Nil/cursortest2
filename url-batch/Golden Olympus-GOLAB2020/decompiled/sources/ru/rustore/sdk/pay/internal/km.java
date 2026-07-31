package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class km extends kotlin.jvm.internal.s implements Function1<xe, PurchaseId> {

    /* renamed from: a, reason: collision with root package name */
    public static final km f44494a = new km();

    public km() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xe dto = (xe) obj;
        Intrinsics.checkNotNullParameter(dto, "dto");
        return new PurchaseId(dto.f45225a);
    }
}
