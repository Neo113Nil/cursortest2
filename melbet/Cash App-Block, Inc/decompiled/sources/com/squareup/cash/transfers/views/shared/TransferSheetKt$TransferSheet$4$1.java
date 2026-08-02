package com.squareup.cash.transfers.views.shared;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$investingCryptoExchangeView$1;
import com.squareup.cash.sheet.RealSheetState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class TransferSheetKt$TransferSheet$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $hasExpandedOnce$delegate;
    public final /* synthetic */ MutableState $hasPeekedOnce$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealSheetState $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransferSheetKt$TransferSheet$4$1(RealSheetState realSheetState, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$sheetState = realSheetState;
        this.$hasExpandedOnce$delegate = mutableState;
        this.$hasPeekedOnce$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new TransferSheetKt$TransferSheet$4$1(this.$sheetState, this.$hasExpandedOnce$delegate, this.$hasPeekedOnce$delegate, continuation, 0);
            case 1:
                return new TransferSheetKt$TransferSheet$4$1(this.$sheetState, this.$hasExpandedOnce$delegate, this.$hasPeekedOnce$delegate, continuation, 1);
            default:
                return new TransferSheetKt$TransferSheet$4$1(this.$sheetState, this.$hasExpandedOnce$delegate, this.$hasPeekedOnce$delegate, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TransferSheetKt$TransferSheet$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$hasPeekedOnce$delegate;
        RealSheetState realSheetState = this.$sheetState;
        MutableState mutableState2 = this.$hasExpandedOnce$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int ordinal = realSheetState.getSettledPosition().ordinal();
                if (ordinal == 0) {
                    mutableState2.setValue(Boolean.TRUE);
                } else if (ordinal == 1) {
                    mutableState.setValue(Boolean.TRUE);
                } else if (ordinal == 2) {
                    mutableState.setValue(Boolean.TRUE);
                } else if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int ordinal2 = realSheetState.getSettledPosition().ordinal();
                if (ordinal2 == 0) {
                    mutableState.setValue(Boolean.TRUE);
                } else if (ordinal2 == 1) {
                    mutableState2.setValue(Boolean.TRUE);
                } else if (ordinal2 == 2) {
                    mutableState2.setValue(Boolean.TRUE);
                } else if (ordinal2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int ordinal3 = realSheetState.getSettledPosition().ordinal();
                if (ordinal3 == 0) {
                    int i2 = ArcadeMigrationUtilsKt$investingCryptoExchangeView$1.$r8$clinit;
                    mutableState.setValue(Boolean.TRUE);
                } else if (ordinal3 == 1) {
                    int i3 = ArcadeMigrationUtilsKt$investingCryptoExchangeView$1.$r8$clinit;
                    mutableState2.setValue(Boolean.TRUE);
                } else if (ordinal3 == 2) {
                    int i4 = ArcadeMigrationUtilsKt$investingCryptoExchangeView$1.$r8$clinit;
                    mutableState2.setValue(Boolean.TRUE);
                } else if (ordinal3 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
