package com.squareup.cash.transactionpicker.presenters;

import androidx.media3.ui.compose.modifiers.ExtensionsKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.db2.activity.CashActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealTransactionLoader$getTransactions$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CashActivity $cashActivity;
    public final /* synthetic */ ZiplineHistoryDataJavaScripter $javaScripter;
    public final /* synthetic */ int $r8$classId = 1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTransactionLoader$getTransactions$1$1$1(ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, CashActivity cashActivity, Continuation continuation) {
        super(2, continuation);
        this.$javaScripter = ziplineHistoryDataJavaScripter;
        this.$cashActivity = cashActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CashActivity cashActivity = this.$cashActivity;
        ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = this.$javaScripter;
        switch (i) {
            case 0:
                return new RealTransactionLoader$getTransactions$1$1$1(cashActivity, ziplineHistoryDataJavaScripter, continuation);
            default:
                return new RealTransactionLoader$getTransactions$1$1$1(ziplineHistoryDataJavaScripter, cashActivity, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealTransactionLoader$getTransactions$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CashActivity cashActivity = this.$cashActivity;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object transactionViewModel = ExtensionsKt.toTransactionViewModel(cashActivity, this.$javaScripter, this);
                    return transactionViewModel == coroutineSingletons ? coroutineSingletons : transactionViewModel;
                }
                if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                String str = cashActivity.payment_render_data;
                String str2 = cashActivity.sender_render_data;
                String str3 = cashActivity.recipient_render_data;
                String str4 = cashActivity.receipt_render_data;
                this.label = 1;
                Object paymentHistoryData = this.$javaScripter.paymentHistoryData(str, str2, str3, str4, this);
                return paymentHistoryData == coroutineSingletons2 ? coroutineSingletons2 : paymentHistoryData;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTransactionLoader$getTransactions$1$1$1(CashActivity cashActivity, ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, Continuation continuation) {
        super(2, continuation);
        this.$cashActivity = cashActivity;
        this.$javaScripter = ziplineHistoryDataJavaScripter;
    }
}
