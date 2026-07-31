package ru.rustore.sdk.pay.internal;

import android.os.SystemClock;
import com.huawei.hms.iap.entity.OrderStatusCode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseStatus;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.reactive.observable.ObservableEmitter;

/* loaded from: classes3.dex */
public final class z7 extends kotlin.jvm.internal.s implements Function1<ObservableEmitter<PurchaseStatus>, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c8 f45318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f45319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(c8 c8Var, PurchaseId purchaseId) {
        super(1);
        this.f45318a = c8Var;
        this.f45319b = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object m243constructorimpl;
        ObservableEmitter emitter = (ObservableEmitter) obj;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f45318a.f43902a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + OrderStatusCode.ORDER_STATE_CANCEL;
        c8 c8Var = this.f45318a;
        PurchaseId purchaseId = this.f45319b;
        try {
            Result.Companion companion = Result.Companion;
            c8.a(c8Var, emitter, purchaseId, elapsedRealtime);
            m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null) {
            if (!emitter.isDisposed()) {
                emitter.onError(d4);
            }
        } else if (!emitter.isDisposed()) {
            emitter.onError(new RuStorePaymentException.RuStorePaymentCommonException("Purchase status validation timeout", null, 2, null));
        }
        return Unit.f41027a;
    }
}
