package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.pay.model.ProductPurchaseResult;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class tc extends kotlin.jvm.internal.s implements Function1<Task<ProductPurchaseResult>.TaskResultProvider, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public static final tc f45041a = new tc();

    public tc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Task.TaskResultProvider create = (Task.TaskResultProvider) obj;
        Intrinsics.checkNotNullParameter(create, "$this$create");
        create.setTaskErrorResult(new RuStorePaymentException.RuStorePaymentCommonException("Invalid deeplink scheme. Scheme must contain only ASCII letters, digits, '+', '-', '.' and start with a letter", null, 2, null));
        return Unit.f41027a;
    }
}
