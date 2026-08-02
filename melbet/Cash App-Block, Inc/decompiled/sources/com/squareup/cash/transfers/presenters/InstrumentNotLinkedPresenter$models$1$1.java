package com.squareup.cash.transfers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.transfers.screens.InstrumentNotLinkedScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class InstrumentNotLinkedPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ShareSheetPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstrumentNotLinkedPresenter$models$1$1(ShareSheetPresenter shareSheetPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = shareSheetPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ShareSheetPresenter shareSheetPresenter = this.this$0;
        switch (i) {
            case 0:
                return new InstrumentNotLinkedPresenter$models$1$1(shareSheetPresenter, continuation, 0);
            default:
                return new InstrumentNotLinkedPresenter$models$1$1(shareSheetPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InstrumentNotLinkedPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ShareSheetPresenter shareSheetPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    n nVar = (n) shareSheetPresenter.modelUpdates;
                    InstrumentNotLinkedScreen instrumentNotLinkedScreen = (InstrumentNotLinkedScreen) shareSheetPresenter.profileManager;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
                    this.label = 1;
                    if (nVar.processActions(instrumentNotLinkedScreen, screenNavigator, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransferManager transferManager = (TransferManager) shareSheetPresenter.shareTargetsManager;
                    BlockersData blockersData = ((InstrumentNotLinkedScreen) shareSheetPresenter.profileManager).blockersData;
                    this.label = 1;
                    if (((RealTransferManager) transferManager).processTransfer(blockersData, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
