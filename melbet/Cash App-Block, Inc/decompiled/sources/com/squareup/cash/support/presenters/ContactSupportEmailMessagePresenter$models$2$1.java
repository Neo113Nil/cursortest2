package com.squareup.cash.support.presenters;

import androidx.compose.runtime.MutableState;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewEvent;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewModel$Editing;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.franklin.support.CreateSupportCaseRequest;
import com.squareup.protos.franklin.support.CreateSupportCaseResponse;
import com.squareup.protos.franklin.support.SupportContactType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ContactSupportEmailMessagePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ContactSupportEmailMessageViewEvent $event;
    public final /* synthetic */ MutableState $isSubmitting$delegate;
    public final /* synthetic */ MutableState $statusResult$delegate;
    public int label;
    public final /* synthetic */ WorkHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSupportEmailMessagePresenter$models$2$1(WorkHomePresenter workHomePresenter, ContactSupportEmailMessageViewEvent contactSupportEmailMessageViewEvent, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = workHomePresenter;
        this.$event = contactSupportEmailMessageViewEvent;
        this.$isSubmitting$delegate = mutableState;
        this.$statusResult$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactSupportEmailMessagePresenter$models$2$1(this.this$0, this.$event, this.$isSubmitting$delegate, this.$statusResult$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactSupportEmailMessagePresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object createSupportCase;
        WorkHomePresenter workHomePresenter = this.this$0;
        Analytics analytics = (Analytics) workHomePresenter.shiftSection2Presenter;
        AndroidStringManager androidStringManager = (AndroidStringManager) workHomePresenter.titleBarPresenter;
        SupportScreens.ContactScreens.ContactSupportMessageScreen contactSupportMessageScreen = (SupportScreens.ContactScreens.ContactSupportMessageScreen) workHomePresenter.payPresenter;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String str = ((ContactSupportEmailMessageViewEvent.SubmitMessage) this.$event).message;
            SupportScreens.ContactScreens.Data data = contactSupportMessageScreen.data;
            this.label = 1;
            AppService appService = (AppService) workHomePresenter.shiftsAnalytics;
            String str2 = data.flowToken;
            SupportScreens.ContactScreens.Data copy$default = SupportScreens.ContactScreens.Data.copy$default(data, null, new RedactedString(str), 383);
            String str3 = copy$default.supportNodeToken;
            String str4 = copy$default.paymentToken;
            SupportContactType supportContactType = SupportContactType.EMAIL;
            Redacted redacted = copy$default.email;
            String str5 = redacted != null ? (String) redacted.getValue() : null;
            Redacted redacted2 = copy$default.phoneNumber;
            String str6 = redacted2 != null ? (String) redacted2.getValue() : null;
            Redacted redacted3 = copy$default.message;
            createSupportCase = appService.createSupportCase(str2, new CreateSupportCaseRequest(str3, str4, supportContactType, str5, str6, redacted3 != null ? (String) redacted3.getValue() : null, null, ByteString.EMPTY), this);
            if (createSupportCase == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            createSupportCase = obj;
        }
        ApiResult apiResult = (ApiResult) createSupportCase;
        if (apiResult instanceof ApiResult.Success) {
            zzpd.trackComplete(analytics, contactSupportMessageScreen.data, true);
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) workHomePresenter.youPresenter;
            BlockersData blockersData = BlockersData.DUMMY;
            Finish finish = new Finish(null);
            BlockersData.Flow flow = BlockersData.Flow.STATUS_RESULT;
            screenNavigator.goTo(new BlockersScreens.StatusResultFullScreen(BlockersData.copy$default(blockersData, flow, null, null, null, null, null, finish, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -66, 65535), flow, new StatusResult(StatusResult.Icon.SUCCESS, ((CreateSupportCaseResponse) ((ApiResult.Success) apiResult).response).result_text, new StatusResultButton(StatusResultButton.ButtonAction.PAY_SCREEN, androidStringManager.get(R.string.contact_support_ok), EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))));
        } else {
            if (!(apiResult instanceof ApiResult.Failure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            zzpd.trackComplete(analytics, contactSupportMessageScreen.data, false);
            this.$isSubmitting$delegate.setValue(Boolean.FALSE);
            ApiResult.Failure failure = (ApiResult.Failure) apiResult;
            this.$statusResult$delegate.setValue(new ContactSupportEmailMessageViewModel$Editing.StatusResult(TextUtilsCompat.errorMessaging(androidStringManager, failure, null).title, TextUtilsCompat.errorMessaging(androidStringManager, failure, null).message));
        }
        return Unit.INSTANCE;
    }
}
