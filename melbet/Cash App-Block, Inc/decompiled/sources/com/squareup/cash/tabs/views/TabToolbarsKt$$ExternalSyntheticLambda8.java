package com.squareup.cash.tabs.views;

import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.support.viewmodels.PhoneVerificationEvents;
import com.squareup.cash.support.viewmodels.SupportHomeViewEvent;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewEvent;
import com.squareup.cash.support.viewmodels.SupportSearchViewEvent;
import com.squareup.cash.support.viewmodels.SupportTransactionConfirmationViewEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.taptopay.viewmodels.TapToPayErrorViewEvent$Close;
import com.squareup.cash.taptopay.viewmodels.TapToPayFirstTimeScreenViewEvent;
import com.squareup.cash.taptopay.viewmodels.TapToPayOnboardingCompleteViewEvent;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentRequestViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda8 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda8(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PhoneVerificationEvents.Close close = PhoneVerificationEvents.Close.INSTANCE;
        ArticleViewEvent.GoBack goBack = ArticleViewEvent.GoBack.INSTANCE;
        TabToolbarInternalViewEvent.ProfileLongClick profileLongClick = TabToolbarInternalViewEvent.ProfileLongClick.INSTANCE;
        TapToPayOnboardingCompleteViewEvent.Close close2 = TapToPayOnboardingCompleteViewEvent.Close.INSTANCE;
        TapToPayPaymentRequestViewEvent.Close close3 = TapToPayPaymentRequestViewEvent.Close.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(TabToolbarInternalViewEvent.BackButtonClick.INSTANCE);
                break;
            case 1:
                function1.invoke(SupportPhoneStatusViewEvent.Close.INSTANCE);
                break;
            case 2:
                function1.invoke(SupportPhoneStatusViewEvent.Cancel.INSTANCE);
                break;
            case 3:
                function1.invoke(close);
                break;
            case 4:
                function1.invoke(close);
                break;
            case 5:
                function1.invoke(SupportTransactionConfirmationViewEvent.NoClicked.INSTANCE);
                break;
            case 6:
                function1.invoke(SupportTransactionConfirmationViewEvent.YesClicked.INSTANCE);
                break;
            case 7:
                function1.invoke(ArticleViewEvent.Retry.INSTANCE);
                break;
            case 8:
                function1.invoke(goBack);
                break;
            case 9:
                function1.invoke(goBack);
                break;
            case 10:
                function1.invoke(SupportHomeViewEvent.ProminentSupportContactClicked.INSTANCE);
                break;
            case 11:
                function1.invoke(SupportHomeViewEvent.SearchClicked.INSTANCE);
                break;
            case 12:
                function1.invoke(SupportHomeViewEvent.ViewMoreTransactionClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(SupportHomeViewEvent.DisputesClicked.INSTANCE);
                break;
            case 14:
                function1.invoke(SupportHomeViewEvent.Close.INSTANCE);
                break;
            case 15:
                function1.invoke(SupportSearchViewEvent.GoBack.INSTANCE);
                break;
            case 16:
                function1.invoke(profileLongClick);
                break;
            case 17:
                function1.invoke(profileLongClick);
                break;
            case 18:
                function1.invoke(TabToolbarInternalViewEvent.CloseButtonClick.INSTANCE);
                break;
            case 19:
                function1.invoke(TapToPayFirstTimeScreenViewEvent.Close.INSTANCE);
                break;
            case 20:
                function1.invoke(TapToPayFirstTimeScreenViewEvent.Next.INSTANCE);
                break;
            case 21:
                function1.invoke(close2);
                break;
            case 22:
                function1.invoke(close2);
                break;
            case 23:
                function1.invoke(TapToPayOnboardingCompleteViewEvent.TryDemoMode.INSTANCE);
                break;
            case 24:
                function1.invoke(close3);
                break;
            case 25:
                function1.invoke(close3);
                break;
            case 26:
                function1.invoke(close3);
                break;
            case 27:
                function1.invoke(close3);
                break;
            case 28:
                function1.invoke(TapToPayPaymentRequestViewEvent.SendReceipt.INSTANCE);
                break;
            default:
                function1.invoke(TapToPayErrorViewEvent$Close.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
