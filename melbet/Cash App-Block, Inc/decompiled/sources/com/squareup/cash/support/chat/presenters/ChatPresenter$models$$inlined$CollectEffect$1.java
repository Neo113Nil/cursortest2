package com.squareup.cash.support.chat.presenters;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.glance.session.TimerScopeKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.brand.checkout.CheckoutGiftCardState;
import app.cash.local.presenters.brand.checkout.CheckoutTipState;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter;
import app.cash.local.primitives.Cart;
import app.cash.local.viewmodels.OrderBuilderModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.bugreporting.presenters.BugReportingPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationExited;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationTransformed;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationWarned;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.cashtagprovisioning.DeviceType;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatOpenLink;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatOpenMessageAction;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatOpenMessageImage;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatOpenMessageTransaction;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatRetryImageLoad;
import com.squareup.cash.cdf.customersupport.CustomerSupportFullTransactionPickerStart;
import com.squareup.cash.cdf.customersupport.FullTransactionPickerOrigin;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.ClientRouteParserKt;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportChatUnifiedTransactionPicker;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.api.FidesmoShutdownReason;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningFlowContext;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewEvent;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.cash.observability.backend.api.ViewTracking;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.presenters.ElementUtilKt;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter$models$6$1;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter$models$6$2;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter$models$6$3;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter$models$6$4;
import com.squareup.cash.payments.presenters.StickerSelectedResult;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PersonalizePaymentResult;
import com.squareup.cash.payments.viewmodels.CanvasDetails;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.ListProperty;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent$DialogEvent$CloseDialog;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent$DialogEvent$RetryResourceSync;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent$DialogEvent$SendBasicPayment;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged;
import com.squareup.cash.payments.viewmodels.Position;
import com.squareup.cash.payments.viewmodels.Rotation;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.viewmodels.Zoom;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Failed;
import com.squareup.cash.support.chat.backend.api.PagingStatus;
import com.squareup.cash.support.chat.backend.api.SuggestedReply;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.presenters.ChatPresenter;
import com.squareup.cash.support.chat.screens.ChatTransactionQuestion;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.CashAppTagKt;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.android.uicore.elements.FormLabelKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.HttpUrl;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ChatPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $chatState$delegate$inlined;
    public final /* synthetic */ Object $conversation$delegate$inlined;
    public final /* synthetic */ Object $currentInput$delegate$inlined;
    public final /* synthetic */ MutableState $fileAttachment$delegate$inlined;
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ Object $hasAcceptedHandover$delegate$inlined;
    public final /* synthetic */ Object $hasInput$delegate$inlined;
    public final /* synthetic */ Object $hasPerformedAction$delegate$inlined;
    public final /* synthetic */ MutableState $hasSentMessage$delegate$inlined;
    public final /* synthetic */ Object $hasUnreadMessages$delegate$inlined;
    public final /* synthetic */ MutableState $isShowingTypingIndicator$delegate$inlined;
    public final /* synthetic */ Object $lastItemVisible$delegate$inlined;
    public final /* synthetic */ MutableState $lastMessageSentTimestamp$delegate$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, OrderBuilderModel orderBuilderModel, LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter, Function1 function1, OrderBuilderModel.BuyerInfo.UiReady uiReady, JWECryptoParts jWECryptoParts, CheckoutTipState checkoutTipState, CheckoutGiftCardState checkoutGiftCardState, Cart cart, MutableState mutableState, State state, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        super(2, continuation);
        this.$flow = flow;
        this.this$0 = orderBuilderModel;
        this.$hasUnreadMessages$delegate$inlined = localBrandLocationCheckoutPresenter;
        this.$conversation$delegate$inlined = function1;
        this.$hasPerformedAction$delegate$inlined = uiReady;
        this.$hasAcceptedHandover$delegate$inlined = jWECryptoParts;
        this.$hasInput$delegate$inlined = checkoutTipState;
        this.$lastItemVisible$delegate$inlined = checkoutGiftCardState;
        this.$currentInput$delegate$inlined = cart;
        this.$isShowingTypingIndicator$delegate$inlined = mutableState;
        this.$chatState$delegate$inlined = state;
        this.$hasSentMessage$delegate$inlined = mutableState2;
        this.$fileAttachment$delegate$inlined = mutableState3;
        this.$lastMessageSentTimestamp$delegate$inlined = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$chatState$delegate$inlined;
        Object obj3 = this.$hasUnreadMessages$delegate$inlined;
        Object obj4 = this.$currentInput$delegate$inlined;
        Object obj5 = this.$lastItemVisible$delegate$inlined;
        Object obj6 = this.$hasInput$delegate$inlined;
        Object obj7 = this.$hasAcceptedHandover$delegate$inlined;
        Object obj8 = this.$hasPerformedAction$delegate$inlined;
        Object obj9 = this.$conversation$delegate$inlined;
        Object obj10 = this.this$0;
        switch (i) {
            case 0:
                ChatPresenter$models$$inlined$CollectEffect$1 chatPresenter$models$$inlined$CollectEffect$1 = new ChatPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, (ChatPresenter) obj10, (State) obj2, this.$isShowingTypingIndicator$delegate$inlined, this.$hasSentMessage$delegate$inlined, this.$fileAttachment$delegate$inlined, this.$lastMessageSentTimestamp$delegate$inlined, (MutableState) obj9, (MutableState) obj8, (MutableState) obj7, (State) obj3, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4);
                chatPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
                return chatPresenter$models$$inlined$CollectEffect$1;
            case 1:
                State state = (State) obj2;
                MutableState mutableState = this.$fileAttachment$delegate$inlined;
                MutableState mutableState2 = this.$lastMessageSentTimestamp$delegate$inlined;
                ChatPresenter$models$$inlined$CollectEffect$1 chatPresenter$models$$inlined$CollectEffect$12 = new ChatPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, (OrderBuilderModel) obj10, (LocalBrandLocationCheckoutPresenter) obj3, (Function1) obj9, (OrderBuilderModel.BuyerInfo.UiReady) obj8, (JWECryptoParts) obj7, (CheckoutTipState) obj6, (CheckoutGiftCardState) obj5, (Cart) obj4, this.$isShowingTypingIndicator$delegate$inlined, state, this.$hasSentMessage$delegate$inlined, mutableState, mutableState2);
                chatPresenter$models$$inlined$CollectEffect$12.L$0 = obj;
                return chatPresenter$models$$inlined$CollectEffect$12;
            default:
                MutableState mutableState3 = (MutableState) obj4;
                Object obj11 = this.$chatState$delegate$inlined;
                Set set = (Set) obj3;
                ChatPresenter$models$$inlined$CollectEffect$1 chatPresenter$models$$inlined$CollectEffect$13 = new ChatPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, (FidesmoDeprovisioningPresenter) obj10, this.$isShowingTypingIndicator$delegate$inlined, this.$hasSentMessage$delegate$inlined, this.$fileAttachment$delegate$inlined, this.$lastMessageSentTimestamp$delegate$inlined, (MutableState) obj9, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6, (MutableState) obj5, mutableState3, obj11, set);
                chatPresenter$models$$inlined$CollectEffect$13.L$0 = obj;
                return chatPresenter$models$$inlined$CollectEffect$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ChatPresenter$models$$inlined$CollectEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$chatState$delegate$inlined;
        Object obj3 = this.$hasUnreadMessages$delegate$inlined;
        Object obj4 = this.$currentInput$delegate$inlined;
        Object obj5 = this.$lastItemVisible$delegate$inlined;
        Object obj6 = this.$hasInput$delegate$inlined;
        Object obj7 = this.$hasAcceptedHandover$delegate$inlined;
        Object obj8 = this.$hasPerformedAction$delegate$inlined;
        Object obj9 = this.$conversation$delegate$inlined;
        Object obj10 = this.this$0;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState = (MutableState) obj5;
                    MutableState mutableState2 = (MutableState) obj4;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, (ChatPresenter) obj10, (State) obj2, this.$isShowingTypingIndicator$delegate$inlined, this.$hasSentMessage$delegate$inlined, this.$fileAttachment$delegate$inlined, this.$lastMessageSentTimestamp$delegate$inlined, (MutableState) obj9, (MutableState) obj8, (MutableState) obj7, (State) obj3, (MutableState) obj6, mutableState, mutableState2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BugReportingPresenter$models$$inlined$CollectEffect$1$1 bugReportingPresenter$models$$inlined$CollectEffect$1$1 = new BugReportingPresenter$models$$inlined$CollectEffect$1$1(coroutineScope2, (OrderBuilderModel) obj10, (LocalBrandLocationCheckoutPresenter) obj3, (Function1) obj9, (OrderBuilderModel.BuyerInfo.UiReady) obj8, (JWECryptoParts) obj7, (CheckoutTipState) obj6, (CheckoutGiftCardState) obj5, (Cart) obj4, this.$isShowingTypingIndicator$delegate$inlined, (State) obj2, this.$hasSentMessage$delegate$inlined, this.$fileAttachment$delegate$inlined, this.$lastMessageSentTimestamp$delegate$inlined);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(bugReportingPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState3 = (MutableState) obj6;
                    MutableState mutableState4 = (MutableState) obj5;
                    MutableState mutableState5 = (MutableState) obj4;
                    Object obj11 = this.$chatState$delegate$inlined;
                    Set set = (Set) obj3;
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(coroutineScope3, (FidesmoDeprovisioningPresenter) obj10, this.$isShowingTypingIndicator$delegate$inlined, this.$hasSentMessage$delegate$inlined, this.$fileAttachment$delegate$inlined, this.$lastMessageSentTimestamp$delegate$inlined, (MutableState) obj9, (MutableState) obj8, (MutableState) obj7, mutableState3, mutableState4, mutableState5, obj11, set);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass12, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.support.chat.presenters.ChatPresenter$models$$inlined$CollectEffect$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ Object $$this$LaunchedEffect;
        public final /* synthetic */ Object $chatState$delegate$inlined;
        public final /* synthetic */ MutableState $conversation$delegate$inlined;
        public final /* synthetic */ MutableState $currentInput$delegate$inlined;
        public final /* synthetic */ MutableState $fileAttachment$delegate$inlined;
        public final /* synthetic */ MutableState $hasAcceptedHandover$delegate$inlined;
        public final /* synthetic */ MutableState $hasPerformedAction$delegate$inlined;
        public final /* synthetic */ MutableState $hasSentMessage$delegate$inlined;
        public final /* synthetic */ Object $hasUnreadMessages$delegate$inlined;
        public final /* synthetic */ MutableState $isShowingTypingIndicator$delegate$inlined;
        public final /* synthetic */ MutableState $lastItemVisible$delegate$inlined;
        public final /* synthetic */ MutableState $lastMessageSentTimestamp$delegate$inlined;
        public final /* synthetic */ int $r8$classId = 1;
        public final /* synthetic */ Object this$0;

        public AnonymousClass1(CoroutineScope coroutineScope, FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, Object obj, Set set) {
            this.$$this$LaunchedEffect = fidesmoDeprovisioningPresenter;
            this.$isShowingTypingIndicator$delegate$inlined = mutableState;
            this.$hasSentMessage$delegate$inlined = mutableState2;
            this.$fileAttachment$delegate$inlined = mutableState3;
            this.$lastMessageSentTimestamp$delegate$inlined = mutableState4;
            this.$conversation$delegate$inlined = mutableState5;
            this.$hasPerformedAction$delegate$inlined = mutableState6;
            this.$hasAcceptedHandover$delegate$inlined = mutableState7;
            this.$lastItemVisible$delegate$inlined = mutableState8;
            this.$currentInput$delegate$inlined = mutableState9;
            this.this$0 = mutableState10;
            this.$chatState$delegate$inlined = obj;
            this.$hasUnreadMessages$delegate$inlined = set;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            boolean booleanValue;
            String str;
            HttpUrl httpUrl;
            boolean booleanValue2;
            Object obj2;
            boolean booleanValue3;
            boolean booleanValue4;
            boolean booleanValue5;
            boolean booleanValue6;
            ArrayList updateProperties$default;
            Object obj3;
            ArrayList arrayList;
            List list;
            int i = this.$r8$classId;
            MutableState mutableState = this.$hasPerformedAction$delegate$inlined;
            MutableState mutableState2 = this.$isShowingTypingIndicator$delegate$inlined;
            MutableState mutableState3 = this.$hasSentMessage$delegate$inlined;
            MutableState mutableState4 = this.$lastMessageSentTimestamp$delegate$inlined;
            Object obj4 = this.$hasUnreadMessages$delegate$inlined;
            MutableState mutableState5 = this.$lastItemVisible$delegate$inlined;
            MutableState mutableState6 = this.$conversation$delegate$inlined;
            Object obj5 = this.$$this$LaunchedEffect;
            Object obj6 = this.this$0;
            MutableState mutableState7 = this.$hasAcceptedHandover$delegate$inlined;
            MutableState mutableState8 = this.$currentInput$delegate$inlined;
            Object obj7 = this.$chatState$delegate$inlined;
            switch (i) {
                case 0:
                    State state = (State) obj7;
                    final ChatPresenter chatPresenter = (ChatPresenter) obj6;
                    IntentLauncher intentLauncher = chatPresenter.launcher;
                    BetterNavigator.ScreenNavigator screenNavigator = chatPresenter.navigator;
                    RealConversationService realConversationService = chatPresenter.conversationService;
                    Analytics analytics = chatPresenter.analytics;
                    SupportChatScreens.FlowScreen.ChatScreen chatScreen = chatPresenter.args;
                    CoroutineScope coroutineScope = (CoroutineScope) obj5;
                    ChatViewEvent chatViewEvent = (ChatViewEvent) obj;
                    boolean z = chatViewEvent instanceof ChatViewEvent.SendMessage;
                    MutableState mutableState9 = this.$fileAttachment$delegate$inlined;
                    if (z) {
                        String str2 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                        MessageBody.FileBody fileBody = ((ChatState) state.getValue()).fileAttachment;
                        String str3 = ((ChatViewEvent.SendMessage) chatViewEvent).text;
                        Conversation conversation = ((ChatState) state.getValue()).conversation;
                        booleanValue6 = ((Boolean) mutableState2.getValue()).booleanValue();
                        if (fileBody != null) {
                            realConversationService.sendMessage(fileBody, chatScreen.flowToken, conversation, booleanValue6);
                        }
                        if (str3 != null && !StringsKt.isBlank(str3)) {
                            realConversationService.sendMessage(new MessageBody.TextBody(str3), chatScreen.flowToken, conversation, booleanValue6);
                        }
                        mutableState3.setValue(Boolean.TRUE);
                        mutableState9.setValue(null);
                        mutableState4.setValue(DimensionKt.now(chatPresenter.clock));
                    } else if (chatViewEvent instanceof ChatViewEvent.LaunchUrl) {
                        ChatViewEvent.LaunchUrl launchUrl = (ChatViewEvent.LaunchUrl) chatViewEvent;
                        String str4 = launchUrl.url;
                        intentLauncher.launchUrlInInternalBrowser(str4);
                        analytics.track(new CustomerSupportChatOpenLink(chatScreen.flowToken, launchUrl.messageToken, str4), null);
                    } else if (chatViewEvent instanceof ChatViewEvent.CloseChat) {
                        String str5 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                        Conversation conversation2 = (Conversation) mutableState6.getValue();
                        if ((conversation2 != null ? conversation2.botStatus : null) != Conversation.BotStatus.ACTIVE || ((!((Boolean) mutableState3.getValue()).booleanValue() && !((Boolean) mutableState.getValue()).booleanValue()) || ((Boolean) mutableState7.getValue()).booleanValue() || !((Boolean) chatPresenter.isEndCashbotConvoEnabled$delegate.getValue()).booleanValue())) {
                            chatPresenter.closeChat(((Boolean) mutableState3.getValue()).booleanValue());
                            booleanValue4 = ((Boolean) ((State) obj4).getValue()).booleanValue();
                            booleanValue5 = ((Boolean) mutableState2.getValue()).booleanValue();
                            chatPresenter.trackChatCompletionAndExit(booleanValue4, booleanValue5, (Conversation) mutableState6.getValue(), (Instant) mutableState4.getValue());
                            mutableState4.setValue(null);
                        } else if (((Boolean) chatPresenter.isImmediateCsatEnabled$delegate.getValue()).booleanValue()) {
                            final int i2 = 0;
                            screenNavigator.askQuestion(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.INSTANCE, new Function1() { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$models$4$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj8) {
                                    int i3 = i2;
                                    ChatPresenter chatPresenter2 = chatPresenter;
                                    switch (i3) {
                                        case 0:
                                            AskedQuestion askedQuestion = (AskedQuestion) obj8;
                                            askedQuestion.getClass();
                                            return new SupportChatScreens.SupportChatSheets.ChatExitPromptSheet(chatPresenter2.args.flowToken, askedQuestion);
                                        case 1:
                                            AskedQuestion askedQuestion2 = (AskedQuestion) obj8;
                                            askedQuestion2.getClass();
                                            return new SupportChatScreens.SupportChatDialogs.ChatExitPrompt(chatPresenter2.args.flowToken, askedQuestion2);
                                        default:
                                            AskedQuestion askedQuestion3 = (AskedQuestion) obj8;
                                            askedQuestion3.getClass();
                                            SupportChatScreens.FlowScreen.ChatScreen chatScreen2 = chatPresenter2.args;
                                            return new SupportScreens.FlowScreens.SupportActivityPickerFullScreen(new SupportScreens.FlowScreens.Data(chatScreen2.flowToken, null, null, chatScreen2, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE), FullTransactionPickerOrigin.CHAT, askedQuestion3);
                                    }
                                }
                            });
                        } else {
                            final int i3 = 1;
                            screenNavigator.askQuestion(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.INSTANCE, new Function1() { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$models$4$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj8) {
                                    int i32 = i3;
                                    ChatPresenter chatPresenter2 = chatPresenter;
                                    switch (i32) {
                                        case 0:
                                            AskedQuestion askedQuestion = (AskedQuestion) obj8;
                                            askedQuestion.getClass();
                                            return new SupportChatScreens.SupportChatSheets.ChatExitPromptSheet(chatPresenter2.args.flowToken, askedQuestion);
                                        case 1:
                                            AskedQuestion askedQuestion2 = (AskedQuestion) obj8;
                                            askedQuestion2.getClass();
                                            return new SupportChatScreens.SupportChatDialogs.ChatExitPrompt(chatPresenter2.args.flowToken, askedQuestion2);
                                        default:
                                            AskedQuestion askedQuestion3 = (AskedQuestion) obj8;
                                            askedQuestion3.getClass();
                                            SupportChatScreens.FlowScreen.ChatScreen chatScreen2 = chatPresenter2.args;
                                            return new SupportScreens.FlowScreens.SupportActivityPickerFullScreen(new SupportScreens.FlowScreens.Data(chatScreen2.flowToken, null, null, chatScreen2, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE), FullTransactionPickerOrigin.CHAT, askedQuestion3);
                                    }
                                }
                            });
                        }
                    } else if (chatViewEvent instanceof ChatViewEvent.ClickImage) {
                        analytics.track(new CustomerSupportChatOpenMessageImage(chatScreen.flowToken), null);
                        screenNavigator.goTo(new SupportChatScreens.FlowScreen.ChatImageDetail(((ChatViewEvent.ClickImage) chatViewEvent).url));
                    } else if (chatViewEvent instanceof ChatViewEvent.ImageLoadFailed) {
                        chatPresenter.errorReporter.report(new ChatPresenter.SupportChatImageLoadingError(Recorder$$ExternalSyntheticOutline2.m("Failed to load image in support chat: ", ((ChatViewEvent.ImageLoadFailed) chatViewEvent).message)), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    } else if (chatViewEvent instanceof ChatViewEvent.ClickRetryImageLoad) {
                        analytics.track(new CustomerSupportChatRetryImageLoad(chatScreen.flowToken), null);
                    } else {
                        if (chatViewEvent instanceof ChatViewEvent.FailedMessageClicked) {
                            String str6 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                            List list2 = ((ChatState) state.getValue()).messages;
                            String str7 = ((ChatViewEvent.FailedMessageClicked) chatViewEvent).messageKey;
                            Conversation conversation3 = ((ChatState) state.getValue()).conversation;
                            booleanValue3 = ((Boolean) mutableState2.getValue()).booleanValue();
                            ListIterator listIterator = list2.listIterator(list2.size());
                            while (listIterator.hasPrevious()) {
                                Message message = (Message) listIterator.previous();
                                if (Intrinsics.areEqual(message.getIdempotenceToken(), str7)) {
                                    TimerScopeKt status = message.getStatus();
                                    if (status instanceof MessageStatus$Failed) {
                                        screenNavigator.goTo(new SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet(str7, ((MessageStatus$Failed) status).f1206type == MessageStatus$Failed.Type.DELIVERY, chatScreen.flowToken, conversation3, booleanValue3));
                                    }
                                }
                            }
                            OptionalProvider$$ExternalSyntheticLambda0.m("List contains no element matching the predicate.");
                            return null;
                        }
                        if (chatViewEvent instanceof ChatViewEvent.SuggestedReplySelected) {
                            String str8 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                            List list3 = ((ChatState) state.getValue()).suggestedReplies;
                            String str9 = ((ChatViewEvent.SuggestedReplySelected) chatViewEvent).token;
                            Conversation conversation4 = ((ChatState) state.getValue()).conversation;
                            booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                            Iterator it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.areEqual(((SuggestedReply) next).token, str9)) {
                                        obj2 = next;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            SuggestedReply suggestedReply = (SuggestedReply) obj2;
                            if (suggestedReply != null) {
                                realConversationService.sendMessage(new MessageBody.SelectedReplyBody(suggestedReply), chatScreen.flowToken, conversation4, booleanValue2);
                            }
                            mutableState3.setValue(Boolean.TRUE);
                            mutableState7.setValue(Boolean.valueOf(Intrinsics.areEqual(str9, "ACCEPT_HANDOVER") || ((Boolean) mutableState7.getValue()).booleanValue()));
                        } else if (chatViewEvent instanceof ChatViewEvent.LoadOldMessages) {
                            String str10 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                            PagingStatus pagingStatus = ((ChatState) state.getValue()).oldMessageStatus;
                            if (pagingStatus == PagingStatus.HAS_MORE || pagingStatus == PagingStatus.FAILED) {
                                StateFlowKt.sendOrThrow$default(realConversationService.recordedMessagesStore.oldMessagesRequests, Unit.INSTANCE);
                            }
                        } else if (chatViewEvent instanceof ChatViewEvent.RemoveAttachment) {
                            String str11 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                            mutableState9.setValue(null);
                        } else {
                            Continuation continuation2 = null;
                            if (chatViewEvent instanceof ChatViewEvent.AttachImage) {
                                JobKt.launch$default(coroutineScope, null, null, new TaxWebAppPresenter$models$1$1(10, mutableState9, chatPresenter, chatViewEvent, continuation2), 3);
                            } else if (chatViewEvent instanceof ChatViewEvent.UpdateCashApp) {
                                intentLauncher.launchPlayStore(chatPresenter.applicationId);
                            } else if (chatViewEvent instanceof ChatViewEvent.ClickAction) {
                                String str12 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                                mutableState.setValue(Boolean.TRUE);
                                ChatViewEvent.ClickAction clickAction = (ChatViewEvent.ClickAction) chatViewEvent;
                                String str13 = clickAction.messageToken;
                                BodyViewModel$ActionBodyViewModel.Action action = clickAction.action;
                                if (action instanceof BodyViewModel$ActionBodyViewModel.Action.OpenLink) {
                                    String str14 = ((BodyViewModel$ActionBodyViewModel.Action.OpenLink) action).url;
                                    RealClientRouteParser realClientRouteParser = chatPresenter.clientRouteParser;
                                    if (ClientRouteParserKt.tryIsClientRouteCandidate(realClientRouteParser, str14) && (ClientRouteParserKt.tryParse(realClientRouteParser, str14) instanceof ClientRoute.Flow)) {
                                        try {
                                            HttpUrl.Builder builder = new HttpUrl.Builder();
                                            builder.parse$okhttp(null, str14);
                                            httpUrl = builder.build();
                                        } catch (IllegalArgumentException unused) {
                                            httpUrl = null;
                                        }
                                        if (httpUrl != null) {
                                            Set queryParameterNames = httpUrl.queryParameterNames();
                                            HttpUrl.Builder newBuilder = httpUrl.newBuilder();
                                            Iterator it2 = queryParameterNames.iterator();
                                            while (it2.hasNext()) {
                                                newBuilder.removeAllQueryParameters((String) it2.next());
                                            }
                                            str = newBuilder.build().url;
                                            analytics.track(new CustomerSupportChatOpenMessageAction(str, CustomerSupportChatOpenMessageAction.ActionType.LINK, str13, chatScreen.flowToken), null);
                                            chatPresenter.router.route(new RoutingParams(chatPresenter.args, BlockersData.AnalyticsData.Source.SUPPORT_CHAT.getAnalyticsName(), null, null, new AnalyticsParams.SupportAnalyticsParams(chatScreen.flowToken), null, 476), str14);
                                        }
                                    }
                                    str = str14;
                                    analytics.track(new CustomerSupportChatOpenMessageAction(str, CustomerSupportChatOpenMessageAction.ActionType.LINK, str13, chatScreen.flowToken), null);
                                    chatPresenter.router.route(new RoutingParams(chatPresenter.args, BlockersData.AnalyticsData.Source.SUPPORT_CHAT.getAnalyticsName(), null, null, new AnalyticsParams.SupportAnalyticsParams(chatScreen.flowToken), null, 476), str14);
                                } else {
                                    if (!Intrinsics.areEqual(action, BodyViewModel$ActionBodyViewModel.Action.PickTransaction.INSTANCE)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    analytics.track(new CustomerSupportChatOpenMessageAction(null, CustomerSupportChatOpenMessageAction.ActionType.SELECT_TRANSACTION, str13, chatScreen.flowToken), null);
                                    if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportChatUnifiedTransactionPicker.INSTANCE)).enabled()) {
                                        analytics.track(new CustomerSupportFullTransactionPickerStart(chatScreen.flowToken, FullTransactionPickerOrigin.CHAT), null);
                                        final int i4 = 2;
                                        screenNavigator.askQuestion(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.INSTANCE, new Function1() { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$models$4$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj8) {
                                                int i32 = i4;
                                                ChatPresenter chatPresenter2 = chatPresenter;
                                                switch (i32) {
                                                    case 0:
                                                        AskedQuestion askedQuestion = (AskedQuestion) obj8;
                                                        askedQuestion.getClass();
                                                        return new SupportChatScreens.SupportChatSheets.ChatExitPromptSheet(chatPresenter2.args.flowToken, askedQuestion);
                                                    case 1:
                                                        AskedQuestion askedQuestion2 = (AskedQuestion) obj8;
                                                        askedQuestion2.getClass();
                                                        return new SupportChatScreens.SupportChatDialogs.ChatExitPrompt(chatPresenter2.args.flowToken, askedQuestion2);
                                                    default:
                                                        AskedQuestion askedQuestion3 = (AskedQuestion) obj8;
                                                        askedQuestion3.getClass();
                                                        SupportChatScreens.FlowScreen.ChatScreen chatScreen2 = chatPresenter2.args;
                                                        return new SupportScreens.FlowScreens.SupportActivityPickerFullScreen(new SupportScreens.FlowScreens.Data(chatScreen2.flowToken, null, null, chatScreen2, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE), FullTransactionPickerOrigin.CHAT, askedQuestion3);
                                                }
                                            }
                                        });
                                    } else {
                                        screenNavigator.askQuestion(ChatTransactionQuestion.INSTANCE, ChatPresenter$models$4$5.INSTANCE);
                                    }
                                }
                            } else if (chatViewEvent instanceof ChatViewEvent.BottomVisibleMessageChanged) {
                                boolean z2 = ((ChatViewEvent.BottomVisibleMessageChanged) chatViewEvent).lastItemVisible;
                                String str15 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                                mutableState5.setValue(Boolean.valueOf(z2));
                                JobKt.launch$default(coroutineScope, null, null, new ArticlePresenter$models$1$1(chatPresenter, chatViewEvent, state, continuation2, 9), 3);
                            } else if (chatViewEvent instanceof ChatViewEvent.InputChanged) {
                                String str16 = ((ChatViewEvent.InputChanged) chatViewEvent).input;
                                String str17 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                                mutableState8.setValue(str16);
                            } else if (chatViewEvent instanceof ChatViewEvent.ActivityTransactionClicked) {
                                analytics.track(new CustomerSupportChatOpenMessageTransaction(chatScreen.flowToken, ActivityItemKt.getItemId(((ChatViewEvent.ActivityTransactionClicked) chatViewEvent).activityItem)), null);
                                JobKt.launch$default(coroutineScope, null, null, new ShoppingWebBridge$loadUrl$1(chatPresenter, chatViewEvent, null, 18), 3);
                            } else if (chatViewEvent instanceof ChatViewEvent.ResendMessage) {
                                String str18 = ((ChatViewEvent.ResendMessage) chatViewEvent).messageToken;
                                String str19 = chatScreen.flowToken;
                                Conversation conversation5 = ((ChatState) state.getValue()).conversation;
                                booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                                realConversationService.resendMessage(str18, str19, conversation5, booleanValue);
                            } else {
                                if (!(chatViewEvent instanceof ChatViewEvent.DeleteMessage)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                realConversationService.deletePendingMessage(((ChatViewEvent.DeleteMessage) chatViewEvent).messageToken);
                                chatPresenter.accessibilityManager.announceForAccessibility(chatPresenter.stringManager.get(R.string.support_chat_a11y_announce_message_deleted));
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter = (FidesmoDeprovisioningPresenter) obj5;
                    BetterNavigator.ScreenNavigator screenNavigator2 = fidesmoDeprovisioningPresenter.navigator;
                    FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = fidesmoDeprovisioningPresenter.flowContext;
                    FidesmoProvisioningViewEvent fidesmoProvisioningViewEvent = (FidesmoProvisioningViewEvent) obj;
                    if (fidesmoProvisioningViewEvent instanceof FidesmoProvisioningViewEvent.ActivityReady) {
                        mutableState2.setValue(((FidesmoProvisioningViewEvent.ActivityReady) fidesmoProvisioningViewEvent).activity);
                    } else if (fidesmoProvisioningViewEvent instanceof FidesmoProvisioningViewEvent.ActivityResumed) {
                        mutableState3.setValue(Boolean.valueOf(((FidesmoProvisioningViewEvent.ActivityResumed) fidesmoProvisioningViewEvent).isNfcEnabled));
                    } else if (Intrinsics.areEqual(fidesmoProvisioningViewEvent, FidesmoProvisioningViewEvent.OpenNfcSettings.INSTANCE)) {
                        Activity activity = (Activity) mutableState2.getValue();
                        if (activity != null) {
                            activity.startActivity(new Intent("android.settings.NFC_SETTINGS").addFlags(268435456));
                        }
                    } else {
                        boolean areEqual = Intrinsics.areEqual(fidesmoProvisioningViewEvent, FidesmoProvisioningViewEvent.PreScanInstructionsCompleted.INSTANCE);
                        MutableState mutableState10 = this.$fileAttachment$delegate$inlined;
                        if (areEqual) {
                            mutableState10.setValue(Boolean.TRUE);
                        } else if (Intrinsics.areEqual(fidesmoProvisioningViewEvent, FidesmoProvisioningViewEvent.Retry.INSTANCE)) {
                            fidesmoDeprovisioningPresenter.endJourneyIfNeeded(UserJourney$Outcome.Failed.INSTANCE);
                            Boolean bool = Boolean.FALSE;
                            mutableState10.setValue(bool);
                            mutableState3.setValue(bool);
                            mutableState4.setValue(FidesmoDeprovisioningPresenter.DeprovisionPhase.AwaitingTag.INSTANCE);
                            fidesmoDeprovisioningPresenter.deliveryStartedLogged = false;
                            fidesmoDeprovisioningPresenter.deliveryCompletedLogged = false;
                            fidesmoDeprovisioningPresenter.stateHistory.clear();
                            mutableState6.setValue(null);
                            mutableState.setValue(null);
                            mutableState7.setValue(bool);
                            mutableState5.setValue(null);
                            ((RealFidesmoClient) fidesmoDeprovisioningPresenter.fidesmoClient).setProvisioningData(null);
                            fidesmoDeprovisioningPresenter.isRetryAttempt = true;
                            fidesmoDeprovisioningPresenter.journeyStarted = false;
                            fidesmoDeprovisioningPresenter.journeyEnded = false;
                            fidesmoDeprovisioningPresenter.scanAttempts = 0;
                            FidesmoFlowType fidesmoFlowType = FidesmoFlowType.DEPROVISION;
                            List list4 = (List) mutableState8.getValue();
                            list4.getClass();
                            CashAppTag currentCashAppTagOrNull = CashAppTagKt.currentCashAppTagOrNull(list4);
                            TagFormFactor tagFormFactor = currentCashAppTagOrNull != null ? currentCashAppTagOrNull.formFactor : null;
                            DeviceType cdfDeviceType = tagFormFactor != null ? FormLabelKt.toCdfDeviceType(tagFormFactor) : null;
                            String str20 = Build.MODEL;
                            fidesmoProvisioningFlowContext.logFlowStarted(fidesmoFlowType, cdfDeviceType, null);
                        } else {
                            boolean areEqual2 = Intrinsics.areEqual(fidesmoProvisioningViewEvent, FidesmoProvisioningViewEvent.ContactSupport.INSTANCE);
                            Back back = Back.INSTANCE;
                            if (areEqual2) {
                                screenNavigator2.goTo(RealSupportNavigator.startSupportFlow$default(fidesmoDeprovisioningPresenter.supportNavigator, null, null, back, SupportNavigator$Source.CARD, null, null, 103));
                            } else if (fidesmoProvisioningViewEvent instanceof FidesmoProvisioningViewEvent.OpenUrl) {
                                fidesmoDeprovisioningPresenter.router.route(new RoutingParams(fidesmoDeprovisioningPresenter.args, null, null, null, null, null, 510), ((FidesmoProvisioningViewEvent.OpenUrl) fidesmoProvisioningViewEvent).url);
                            } else {
                                if (!Intrinsics.areEqual(fidesmoProvisioningViewEvent, FidesmoProvisioningViewEvent.Close.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                Activity activity2 = (Activity) mutableState2.getValue();
                                if (activity2 != null) {
                                    Set set = (Set) obj4;
                                    FidesmoShutdownReason fidesmoShutdownReason = (FidesmoShutdownReason) ((MutableState) obj6).getValue();
                                    fidesmoShutdownReason.getClass();
                                    if (fidesmoShutdownReason == FidesmoShutdownReason.STREAM_DISPOSED) {
                                        fidesmoShutdownReason = FidesmoShutdownReason.FLOW_CLOSED;
                                    }
                                    FidesmoDeprovisioningPresenter.access$models$shutdownFidesmo(obj7, fidesmoDeprovisioningPresenter, set, activity2, fidesmoShutdownReason);
                                }
                                if (!Intrinsics.areEqual((FidesmoDeprovisioningPresenter.DeprovisionPhase) mutableState4.getValue(), FidesmoDeprovisioningPresenter.DeprovisionPhase.ResetSucceeded.INSTANCE)) {
                                    fidesmoDeprovisioningPresenter.endJourneyIfNeeded(UserJourney$Outcome.UserCanceled.INSTANCE);
                                    fidesmoProvisioningFlowContext.logFlowDismissed();
                                }
                                screenNavigator2.goTo(back);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                default:
                    MutableState mutableState11 = (MutableState) obj7;
                    PersonalizePaymentPresenter personalizePaymentPresenter = (PersonalizePaymentPresenter) obj6;
                    LinkedHashMap linkedHashMap = personalizePaymentPresenter.zIndexes;
                    RealMusicPlayer realMusicPlayer = personalizePaymentPresenter.musicPlayer;
                    BetterNavigator.ScreenNavigator screenNavigator3 = personalizePaymentPresenter.navigator;
                    Analytics analytics2 = personalizePaymentPresenter.analytics;
                    PaymentScreens.PersonalizePayment personalizePayment = personalizePaymentPresenter.args;
                    CoroutineScope coroutineScope2 = (CoroutineScope) obj5;
                    PersonalizePaymentViewEvent personalizePaymentViewEvent = (PersonalizePaymentViewEvent) obj;
                    boolean z3 = personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.OnDialogEvent;
                    MutableState mutableState12 = this.$hasSentMessage$delegate$inlined;
                    MutableState mutableState13 = this.$fileAttachment$delegate$inlined;
                    MutableState mutableState14 = this.$lastMessageSentTimestamp$delegate$inlined;
                    MutableState mutableState15 = this.$hasPerformedAction$delegate$inlined;
                    MutableState mutableState16 = this.$isShowingTypingIndicator$delegate$inlined;
                    if (z3) {
                        PersonalizePaymentViewEvent.OnDialogEvent onDialogEvent = (PersonalizePaymentViewEvent.OnDialogEvent) personalizePaymentViewEvent;
                        Screen screen = onDialogEvent.screenArgs;
                        Object obj8 = onDialogEvent.result;
                        if (screen instanceof PaymentScreens.ConfirmDuplicate) {
                            ViewTracking viewTracking = personalizePaymentPresenter.dialogViewTracking;
                            if (viewTracking != null) {
                                ViewTracking.viewEnded$default(viewTracking);
                            }
                            if (obj8 == AlertDialogResult.POSITIVE) {
                                JobKt.launch$default(coroutineScope2, null, null, new PersonalizePaymentPresenter$models$6$1(personalizePaymentPresenter, this.$isShowingTypingIndicator$delegate$inlined, mutableState12, mutableState13, this.$lastMessageSentTimestamp$delegate$inlined, this.$conversation$delegate$inlined, mutableState15, null), 3);
                            }
                        } else if (screen instanceof PaymentScreens.PersonalizePaymentStickers) {
                            CanvasDetails canvasDetails = (CanvasDetails) mutableState14.getValue();
                            List list5 = (List) mutableState16.getValue();
                            ExperienceType experienceType = personalizePaymentPresenter.experienceType;
                            StickerSelectedResult stickerSelectedResult = obj8 instanceof StickerSelectedResult ? (StickerSelectedResult) obj8 : null;
                            if (stickerSelectedResult != null) {
                                Sticker sticker = stickerSelectedResult.sticker;
                                float f = personalizePaymentPresenter.getzIndex(sticker);
                                int i5 = sticker.id;
                                ListProperty listProperty = sticker.properties;
                                ListProperty copy$default = ListProperty.copy$default(listProperty, Position.copy$default(listProperty.position, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, 3), null, null, null, false, 30);
                                String str21 = sticker.mainUrl;
                                String str22 = sticker.previewUrl;
                                String str23 = sticker.remoteId;
                                String str24 = sticker.accessibilityDescription;
                                re$$ExternalSyntheticOutline0.m1432m(str21, str22, str23);
                                analytics2.track(new AssetSendPersonalizationTransformed(personalizePayment.paymentToken.toString(), personalizePayment.flowToken, null, null, null, str23, null, null, null, experienceType, 3772), null);
                                Size size = canvasDetails.size;
                                size.getClass();
                                float min = Math.min(size.width * 0.35f, 0.35f * size.height);
                                Size size2 = new Size(min, min);
                                Size size3 = canvasDetails.size;
                                size3.getClass();
                                list = CollectionsKt.plus((Collection) list5, (Object) new Sticker(i5, ListProperty.copy$default(copy$default, Position.copy$default(copy$default.position, (size3.width / 2.0f) - (min / 2.0f), (size3.height / 2.0f) - (min / 2.0f), RecyclerView.DECELERATION_RATE, 4), null, null, size2, false, 22), str21, str22, str23, str24));
                            } else {
                                list = null;
                            }
                            if (list == null) {
                                list = (List) mutableState16.getValue();
                            }
                            mutableState16.setValue(list);
                        }
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.AddTextTapped) {
                        if (ElementUtilKt.canAddText((List) mutableState16.getValue())) {
                            mutableState16.setValue(CollectionsKt.plus((Collection) ElementUtilKt.clearFocus((List) mutableState16.getValue()), (Object) personalizePaymentPresenter.createTextElement(((CanvasDetails) mutableState14.getValue()).size, ((CanvasDetails) mutableState7.getValue()).size.height + ((CanvasDetails) mutableState7.getValue()).start.y, "", false, true)));
                            analytics2.track(new AssetSendPersonalizationTransformed(personalizePayment.paymentToken.toString(), personalizePayment.flowToken, null, null, null, null, null, null, null, personalizePaymentPresenter.experienceType, 4084), null);
                        } else {
                            AndroidStringManager androidStringManager = personalizePaymentPresenter.stringManager;
                            Object[] objArr = {new Integer(25)};
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            String format2 = new MessageFormat(resources.getString(R.string.send_payment_personalize_max_texts)).format(objArr);
                            format2.getClass();
                            RedactedString redactedString = new RedactedString(format2);
                            analytics2.track(new AssetSendPersonalizationWarned(personalizePayment.paymentToken.toString(), personalizePayment.flowToken, format2), null);
                            screenNavigator3.goTo(new PaymentScreens.WarningDialog((RedactedString) null, redactedString, (RedactedString) null, 13));
                        }
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.Back) {
                        if (personalizePaymentPresenter.isMusicEnabled) {
                            realMusicPlayer.stop();
                        }
                        String initiatorNote = PersonalizePaymentPresenter.getInitiatorNote((String) personalizePayment.note.getValue(), (List) mutableState16.getValue());
                        if (personalizePaymentPresenter.isDoneMode) {
                            personalizePaymentPresenter.draftStore._draft.setValue(null);
                        }
                        PersonalizePaymentResult personalizePaymentResult = new PersonalizePaymentResult(new RedactedString(initiatorNote));
                        AskedQuestion askedQuestion = personalizePayment.question;
                        if (askedQuestion != null) {
                            screenNavigator3.giveAnswer(askedQuestion, personalizePaymentResult);
                        } else {
                            screenNavigator3.goTo(new Finish(personalizePaymentResult));
                        }
                        analytics2.track(new AssetSendPersonalizationExited(personalizePayment.paymentToken.toString(), personalizePayment.flowToken), null);
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent$DialogEvent$SendBasicPayment) {
                        JobKt.launch$default(coroutineScope2, null, null, new PersonalizePaymentPresenter$models$6$2(personalizePaymentPresenter, null, 0), 3);
                        mutableState15.setValue(null);
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent$DialogEvent$RetryResourceSync) {
                        mutableState15.setValue(null);
                        JobKt.launch$default(coroutineScope2, null, null, new PersonalizePaymentPresenter$models$6$3(personalizePaymentPresenter, mutableState15, null, 0), 3);
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.Send) {
                        JobKt.launch$default(coroutineScope2, null, null, new PersonalizePaymentPresenter$models$6$4(personalizePaymentPresenter, personalizePaymentViewEvent, mutableState12, mutableState13, mutableState16, mutableState14, this.$conversation$delegate$inlined, mutableState15, null), 3);
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.MusicButtonTapped) {
                        ((ExoPlayerImpl) ((ExoPlayer) realMusicPlayer.mediaPlayer.player)).setPlayWhenReady(false);
                        screenNavigator3.askQuestion(MusicScreen.MusicQuestion.INSTANCE, new RealBrandFollowPresenter$models$2$1$1(29, mutableState6));
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.StickerMenuTapped) {
                        if (ElementUtilKt.canAddSticker((List) mutableState16.getValue())) {
                            screenNavigator3.goTo(new PaymentScreens.PersonalizePaymentStickers(personalizePayment.flowToken));
                        } else {
                            AndroidStringManager androidStringManager2 = personalizePaymentPresenter.stringManager;
                            Object[] objArr2 = {new Integer(25)};
                            Resources resources2 = androidStringManager2.resources;
                            resources2.getClass();
                            String format3 = new MessageFormat(resources2.getString(R.string.send_payment_personalize_max_stickers)).format(objArr2);
                            format3.getClass();
                            screenNavigator3.goTo(new PaymentScreens.WarningDialog((RedactedString) null, new RedactedString(format3), (RedactedString) null, 13));
                            analytics2.track(new AssetSendPersonalizationWarned(personalizePayment.paymentToken.toString(), personalizePayment.flowToken, format3), null);
                        }
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.SelectBackground) {
                        mutableState13.setValue(Integer.valueOf(((PersonalizePaymentViewEvent.SelectBackground) personalizePaymentViewEvent).backgroundIndex));
                        mutableState5.setValue(Boolean.TRUE);
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.RequestFocus) {
                        Iterator it3 = ((List) mutableState16.getValue()).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj3 = it3.next();
                                if (((Element) obj3).getId() == ((PersonalizePaymentViewEvent.RequestFocus) personalizePaymentViewEvent).element.getId()) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        Element element = (Element) obj3;
                        if (element != null && (element instanceof Text)) {
                            if (((Text) element).value.length() == 0) {
                                arrayList = CollectionsKt.toMutableList((Collection) mutableState16.getValue());
                                final KClasses$$Lambda$2 kClasses$$Lambda$2 = new KClasses$$Lambda$2(personalizePaymentViewEvent, 18);
                                arrayList.removeIf(new Predicate() { // from class: com.squareup.cash.payments.presenters.PersonalizePaymentPresenter$sam$java_util_function_Predicate$0
                                    @Override // java.util.function.Predicate
                                    public final /* synthetic */ boolean test(Object obj9) {
                                        return ((Boolean) KClasses$$Lambda$2.this.invoke(obj9)).booleanValue();
                                    }
                                });
                            } else {
                                List list6 = (List) mutableState16.getValue();
                                PersonalizePaymentViewEvent.RequestFocus requestFocus = (PersonalizePaymentViewEvent.RequestFocus) personalizePaymentViewEvent;
                                int id = requestFocus.element.getId();
                                boolean z4 = requestFocus.hasFocus;
                                list6.getClass();
                                ArrayList clearFocus = ElementUtilKt.clearFocus(list6);
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(clearFocus, 10));
                                Iterator it4 = clearFocus.iterator();
                                while (it4.hasNext()) {
                                    Element element2 = (Element) it4.next();
                                    if (element2.getId() == id && (element2 instanceof Text)) {
                                        element2 = Text.copy$default((Text) element2, z4, null, 55);
                                    }
                                    arrayList2.add(element2);
                                }
                                arrayList = arrayList2;
                            }
                            mutableState16.setValue(arrayList);
                        }
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.ResetShakeOnInvalidEntry) {
                        mutableState8.setValue(Boolean.FALSE);
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.TextChanged) {
                        PersonalizePaymentViewEvent.TextChanged textChanged = (PersonalizePaymentViewEvent.TextChanged) personalizePaymentViewEvent;
                        String str25 = textChanged.text;
                        if (str25.length() > 50) {
                            mutableState8.setValue(Boolean.TRUE);
                        }
                        List list7 = (List) mutableState16.getValue();
                        int id2 = textChanged.element.getId();
                        String take = StringsKt___StringsKt.take(50, str25);
                        list7.getClass();
                        List<Element> list8 = list7;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                        for (Element element3 : list8) {
                            if (element3.getId() == id2 && (element3 instanceof Text)) {
                                element3 = Text.copy$default((Text) element3, false, take, 31);
                            }
                            arrayList3.add(element3);
                        }
                        mutableState16.setValue(arrayList3);
                    } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged) {
                        PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged personalizePaymentViewEvent$ElementEvent$TextSizeChanged = (PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged) personalizePaymentViewEvent;
                        Size size4 = personalizePaymentViewEvent$ElementEvent$TextSizeChanged.size;
                        float f2 = size4.width;
                        Element element4 = personalizePaymentViewEvent$ElementEvent$TextSizeChanged.element;
                        float f3 = (personalizePaymentViewEvent$ElementEvent$TextSizeChanged.previousSize.width / 2.0f) + element4.getProperties().position.x;
                        List list9 = (List) mutableState16.getValue();
                        int id3 = element4.getId();
                        ListProperty properties = element4.getProperties();
                        Size size5 = element4.getProperties().size;
                        float f4 = size4.height;
                        size5.getClass();
                        ListProperty copy$default2 = ListProperty.copy$default(properties, Position.copy$default(element4.getProperties().position, f3 - (f2 / 2.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 6), null, null, new Size(f2, f4), false, 22);
                        list9.getClass();
                        List<Element> list10 = list9;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10, 10));
                        for (Element element5 : list10) {
                            if (element5.getId() == id3) {
                                element5 = element5.copy(copy$default2);
                            }
                            arrayList4.add(element5);
                        }
                        mutableState16.setValue(arrayList4);
                    } else {
                        if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.TransformationStarted) {
                            int i6 = ((PersonalizePaymentViewEvent.TransformationStarted) personalizePaymentViewEvent).elementId;
                            for (Element element6 : (List) mutableState16.getValue()) {
                                if (element6.getId() == i6) {
                                    float f5 = personalizePaymentPresenter.getzIndex(element6);
                                    if (personalizePaymentPresenter.lastDraggedElementId != i6) {
                                        f5 = ElementUtilKt.getNextzIndex(linkedHashMap);
                                        linkedHashMap.put(new Integer(i6), new Float(f5));
                                        personalizePaymentPresenter.lastDraggedElementId = i6;
                                    }
                                    mutableState16.setValue(ElementUtilKt.updateProperties$default((List) mutableState16.getValue(), i6, Position.copy$default(element6.getProperties().position, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f5, 3), null, null, null, 28));
                                    mutableState11.setValue(SetsKt___SetsKt.plus((Set) mutableState11.getValue(), new Integer(i6)));
                                }
                            }
                            OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                            return null;
                        }
                        if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.TransformationEnded) {
                            PersonalizePaymentViewEvent.TransformationEnded transformationEnded = (PersonalizePaymentViewEvent.TransformationEnded) personalizePaymentViewEvent;
                            int i7 = transformationEnded.elementId;
                            mutableState11.setValue(SetsKt___SetsKt.minus((Set) mutableState11.getValue(), new Integer(i7)));
                            for (Element element7 : (List) mutableState16.getValue()) {
                                if (element7.getId() == i7) {
                                    if (element7.getProperties().isOnTopOfDelete) {
                                        List list11 = (List) mutableState16.getValue();
                                        updateProperties$default = new ArrayList();
                                        for (Object obj9 : list11) {
                                            if (((Element) obj9).getId() != i7) {
                                                updateProperties$default.add(obj9);
                                            }
                                        }
                                    } else {
                                        updateProperties$default = ElementUtilKt.updateProperties$default((List) mutableState16.getValue(), i7, Position.copy$default(element7.getProperties().position, transformationEnded.offsetX, transformationEnded.offsetY, RecyclerView.DECELERATION_RATE, 4), new Rotation(transformationEnded.rotation), new Zoom(transformationEnded.zoom), null, 16);
                                    }
                                    mutableState16.setValue(updateProperties$default);
                                    ExperienceType experienceType2 = personalizePaymentPresenter.experienceType;
                                    if (element7 instanceof Sticker) {
                                        String str26 = personalizePayment.flowToken;
                                        Sticker sticker2 = (Sticker) element7;
                                        String str27 = sticker2.remoteId;
                                        boolean z5 = sticker2.properties.isOnTopOfDelete;
                                        analytics2.track(new AssetSendPersonalizationTransformed(personalizePayment.paymentToken.toString(), str26, null, null, null, str27, z5 ? Boolean.TRUE : null, z5 ? null : Boolean.TRUE, null, experienceType2, 2492), null);
                                    } else if (element7 instanceof Text) {
                                        String str28 = personalizePayment.flowToken;
                                        boolean z6 = ((Text) element7).properties.isOnTopOfDelete;
                                        analytics2.track(new AssetSendPersonalizationTransformed(personalizePayment.paymentToken.toString(), str28, null, z6 ? Boolean.TRUE : null, z6 ? null : Boolean.TRUE, null, null, null, null, experienceType2, 4044), null);
                                    }
                                }
                            }
                            OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                            return null;
                        }
                        if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.DeleteElement) {
                            PersonalizePaymentViewEvent.DeleteElement deleteElement = (PersonalizePaymentViewEvent.DeleteElement) personalizePaymentViewEvent;
                            mutableState16.setValue(ElementUtilKt.updateProperties$default((List) mutableState16.getValue(), deleteElement.elementId, null, null, null, Boolean.valueOf(deleteElement.shouldDelete), 14));
                        } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.OnCanvasDrawn) {
                            mutableState14.setValue(((PersonalizePaymentViewEvent.OnCanvasDrawn) personalizePaymentViewEvent).canvasDetails);
                        } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.OnAmountDrawn) {
                            mutableState7.setValue(((PersonalizePaymentViewEvent.OnAmountDrawn) personalizePaymentViewEvent).amountCanvasDetails);
                        } else if (personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent.OnDeleteDrawn) {
                            ((MutableState) obj4).setValue(((PersonalizePaymentViewEvent.OnDeleteDrawn) personalizePaymentViewEvent).deleteCanvasDetails);
                        } else {
                            if (!(personalizePaymentViewEvent instanceof PersonalizePaymentViewEvent$DialogEvent$CloseDialog)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            mutableState15.setValue(null);
                        }
                    }
                    return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(CoroutineScope coroutineScope, PersonalizePaymentPresenter personalizePaymentPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11) {
            this.this$0 = personalizePaymentPresenter;
            this.$isShowingTypingIndicator$delegate$inlined = mutableState;
            this.$hasSentMessage$delegate$inlined = mutableState2;
            this.$fileAttachment$delegate$inlined = mutableState3;
            this.$lastMessageSentTimestamp$delegate$inlined = mutableState4;
            this.$conversation$delegate$inlined = mutableState5;
            this.$hasPerformedAction$delegate$inlined = mutableState6;
            this.$hasAcceptedHandover$delegate$inlined = mutableState7;
            this.$lastItemVisible$delegate$inlined = mutableState8;
            this.$currentInput$delegate$inlined = mutableState9;
            this.$chatState$delegate$inlined = mutableState10;
            this.$hasUnreadMessages$delegate$inlined = mutableState11;
            this.$$this$LaunchedEffect = coroutineScope;
        }

        public AnonymousClass1(CoroutineScope coroutineScope, ChatPresenter chatPresenter, State state, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, State state2, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10) {
            this.this$0 = chatPresenter;
            this.$chatState$delegate$inlined = state;
            this.$isShowingTypingIndicator$delegate$inlined = mutableState;
            this.$hasSentMessage$delegate$inlined = mutableState2;
            this.$fileAttachment$delegate$inlined = mutableState3;
            this.$lastMessageSentTimestamp$delegate$inlined = mutableState4;
            this.$conversation$delegate$inlined = mutableState5;
            this.$hasPerformedAction$delegate$inlined = mutableState6;
            this.$hasAcceptedHandover$delegate$inlined = mutableState7;
            this.$hasUnreadMessages$delegate$inlined = state2;
            this.$lastItemVisible$delegate$inlined = mutableState9;
            this.$currentInput$delegate$inlined = mutableState10;
            this.$$this$LaunchedEffect = coroutineScope;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, Object obj, Set set) {
        super(2, continuation);
        this.$flow = flow;
        this.this$0 = fidesmoDeprovisioningPresenter;
        this.$isShowingTypingIndicator$delegate$inlined = mutableState;
        this.$hasSentMessage$delegate$inlined = mutableState2;
        this.$fileAttachment$delegate$inlined = mutableState3;
        this.$lastMessageSentTimestamp$delegate$inlined = mutableState4;
        this.$conversation$delegate$inlined = mutableState5;
        this.$hasPerformedAction$delegate$inlined = mutableState6;
        this.$hasAcceptedHandover$delegate$inlined = mutableState7;
        this.$hasInput$delegate$inlined = mutableState8;
        this.$lastItemVisible$delegate$inlined = mutableState9;
        this.$currentInput$delegate$inlined = mutableState10;
        this.$chatState$delegate$inlined = obj;
        this.$hasUnreadMessages$delegate$inlined = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, ChatPresenter chatPresenter, State state, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, State state2, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10) {
        super(2, continuation);
        this.$flow = flow;
        this.this$0 = chatPresenter;
        this.$chatState$delegate$inlined = state;
        this.$isShowingTypingIndicator$delegate$inlined = mutableState;
        this.$hasSentMessage$delegate$inlined = mutableState2;
        this.$fileAttachment$delegate$inlined = mutableState3;
        this.$lastMessageSentTimestamp$delegate$inlined = mutableState4;
        this.$conversation$delegate$inlined = mutableState5;
        this.$hasPerformedAction$delegate$inlined = mutableState6;
        this.$hasAcceptedHandover$delegate$inlined = mutableState7;
        this.$hasUnreadMessages$delegate$inlined = state2;
        this.$hasInput$delegate$inlined = mutableState8;
        this.$lastItemVisible$delegate$inlined = mutableState9;
        this.$currentInput$delegate$inlined = mutableState10;
    }
}
