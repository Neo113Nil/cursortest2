package com.squareup.cash.support.presenters;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.glance.layout.BoxKt;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.internal.zzr;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessChangeIncidentAlert;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessOpenNode;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewPhoneVerificationAttempt;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Expired;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$FailedPin;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Invalid;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Pending;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Rejected;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Unknown;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Verified;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationResult;
import com.squareup.cash.support.backend.api.RecentlyViewedNode;
import com.squareup.cash.support.backend.api.SearchPlaceholder;
import com.squareup.cash.support.backend.api.SupportSearchService$SearchNode;
import com.squareup.cash.support.backend.api.activities.SupportTransaction;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.ArticlesService$ArticleResult;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.api.transaction.SupportTransactionService;
import com.squareup.cash.support.backend.real.RealSupportTransactionService;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.real.RealPendingMessagesStore;
import com.squareup.cash.support.chat.presenters.ChatPresenter;
import com.squareup.cash.support.chat.presenters.ChatState;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.cash.support.chat.views.ChatView$30$1;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$SubscriptionAction;
import com.squareup.cash.support.presenters.SupportSearchPresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screens.SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.support.viewmodels.PhoneVerificationViewModel;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewModel;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewEvent;
import com.squareup.cash.support.viewmodels.SupportSearchViewEvent;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.cash.supportarticles.app.v1.RecommendSupportArticlesRequest;
import com.squareup.cash.taptopay.backend.api.TagCommunicationData;
import com.squareup.cash.taptopay.backend.real.RealTagCommunication;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.web.TaxWebAppBridge$openTakePhoto$1$1;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.kotterknife.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ArticlePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $isLoadingTransaction$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $transaction$delegate;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArticlePresenter$models$1$1(int i, MutableState mutableState, Object obj, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$isLoadingTransaction$delegate = obj2;
        this.$transaction$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$isLoadingTransaction$delegate;
        Object obj3 = this.$transaction$delegate;
        switch (i) {
            case 0:
                return new ArticlePresenter$models$1$1((ArticlePresenter) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation, 0);
            case 1:
                return new ArticlePresenter$models$1$1((RealArticlesService) this.this$0, (String) obj3, (String) obj2, continuation, 1);
            case 2:
                return new ArticlePresenter$models$1$1((RealPendingMessagesStore) this.this$0, (String) obj3, (MessageBody) obj2, continuation, 2);
            case 3:
                return new ArticlePresenter$models$1$1((RealPendingMessagesStore) this.this$0, (LinkedHashMap) obj3, (RealPendingMessagesStore.MessagesState) obj2, continuation, 3);
            case 4:
                ArticlePresenter$models$1$1 articlePresenter$models$1$1 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (ErrorPresenter) obj2, 4);
                articlePresenter$models$1$1.this$0 = obj;
                return articlePresenter$models$1$1;
            case 5:
                ArticlePresenter$models$1$1 articlePresenter$models$1$12 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 5);
                articlePresenter$models$1$12.this$0 = obj;
                return articlePresenter$models$1$12;
            case 6:
                ArticlePresenter$models$1$1 articlePresenter$models$1$13 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (WorkHomePresenter) obj2, 6);
                articlePresenter$models$1$13.this$0 = obj;
                return articlePresenter$models$1$13;
            case 7:
                ArticlePresenter$models$1$1 articlePresenter$models$1$14 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (ChatPresenter) obj2, 7);
                articlePresenter$models$1$14.this$0 = obj;
                return articlePresenter$models$1$14;
            case 8:
                ArticlePresenter$models$1$1 articlePresenter$models$1$15 = new ArticlePresenter$models$1$1((ChatPresenter) obj2, (MutableState) obj3, continuation, 8);
                articlePresenter$models$1$15.this$0 = obj;
                return articlePresenter$models$1$15;
            case 9:
                return new ArticlePresenter$models$1$1((ChatPresenter) this.this$0, (ChatViewEvent) obj3, (State) obj2, continuation, 9);
            case 10:
                ArticlePresenter$models$1$1 articlePresenter$models$1$16 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (InviteErrorPresenter) obj2, 10);
                articlePresenter$models$1$16.this$0 = obj;
                return articlePresenter$models$1$16;
            case 11:
                ArticlePresenter$models$1$1 articlePresenter$models$1$17 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (InviteErrorPresenter) obj2, 11);
                articlePresenter$models$1$17.this$0 = obj;
                return articlePresenter$models$1$17;
            case 12:
                return new ArticlePresenter$models$1$1(12, (MutableState) obj3, (ArticlePresenter) this.this$0, (SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion) obj2, continuation);
            case 13:
                return new ArticlePresenter$models$1$1((PhoneVerificationPresenter) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation, 13);
            case 14:
                return new ArticlePresenter$models$1$1((PhoneVerificationPresenter) obj2, (MutableState) obj3, continuation, 14);
            case 15:
                ArticlePresenter$models$1$1 articlePresenter$models$1$18 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 15);
                articlePresenter$models$1$18.this$0 = obj;
                return articlePresenter$models$1$18;
            case 16:
                ArticlePresenter$models$1$1 articlePresenter$models$1$19 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (LocalHomePresenter) obj2, 16);
                articlePresenter$models$1$19.this$0 = obj;
                return articlePresenter$models$1$19;
            case 17:
                ArticlePresenter$models$1$1 articlePresenter$models$1$110 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (ErrorPresenter) obj2, 17);
                articlePresenter$models$1$110.this$0 = obj;
                return articlePresenter$models$1$110;
            case 18:
                ArticlePresenter$models$1$1 articlePresenter$models$1$111 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (ErrorPresenter) obj2, 18);
                articlePresenter$models$1$111.this$0 = obj;
                return articlePresenter$models$1$111;
            case 19:
                ArticlePresenter$models$1$1 articlePresenter$models$1$112 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (ErrorPresenter) obj2, 19);
                articlePresenter$models$1$112.this$0 = obj;
                return articlePresenter$models$1$112;
            case 20:
                return new ArticlePresenter$models$1$1(20, (MutableState) obj3, (InstrumentDetailsPresenter) this.this$0, (SupportIncidentDetailsViewEvent) obj2, continuation);
            case 21:
                ArticlePresenter$models$1$1 articlePresenter$models$1$113 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (InviteErrorPresenter) obj2, 21);
                articlePresenter$models$1$113.this$0 = obj;
                return articlePresenter$models$1$113;
            case 22:
                return new ArticlePresenter$models$1$1(22, (MutableState) obj3, (MutableSharedFlow) this.this$0, (SupportSearchPresenter) obj2, continuation);
            case 23:
                return new ArticlePresenter$models$1$1((SupportSearchPresenter) this.this$0, (MutableState) obj3, (SupportSearchViewEvent) obj2, continuation, 23);
            case 24:
                ArticlePresenter$models$1$1 articlePresenter$models$1$114 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 24);
                articlePresenter$models$1$114.this$0 = obj;
                return articlePresenter$models$1$114;
            case 25:
                return new ArticlePresenter$models$1$1(25, (MutableState) obj3, (LocalEditorialPresenter) this.this$0, (ArticleViewEvent) obj2, continuation);
            case 26:
                return new ArticlePresenter$models$1$1((LazyListState) this.this$0, (SupportDisputeTrackerViewModel.Loaded) obj3, (Function1) obj2, continuation, 26);
            case 27:
                return new ArticlePresenter$models$1$1((ScrollState) this.this$0, (MutableState) obj3, (ParcelableSnapshotMutableIntState) obj2, continuation, 27);
            case 28:
                ArticlePresenter$models$1$1 articlePresenter$models$1$115 = new ArticlePresenter$models$1$1((RealTagCommunication) obj3, (byte[]) obj2, continuation);
                articlePresenter$models$1$115.this$0 = obj;
                return articlePresenter$models$1$115;
            default:
                ArticlePresenter$models$1$1 articlePresenter$models$1$116 = new ArticlePresenter$models$1$1((Flow) obj3, continuation, (WorkHomePresenter) obj2, 29);
                articlePresenter$models$1$116.this$0 = obj;
                return articlePresenter$models$1$116;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((ArticlePresenter$models$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((ArticlePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0326, code lost:
    
        r7 = java.lang.Integer.valueOf(r17);
        r25 = r1;
        r23 = java.lang.Integer.valueOf(r4.size());
        r24 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x037f, code lost:
    
        r25 = r1;
        r22 = r4;
        r24 = java.lang.Integer.valueOf(r17);
        r23 = java.lang.Integer.valueOf(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x03d5, code lost:
    
        r4 = java.lang.Integer.valueOf(r17);
     */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ee  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object supportTransaction;
        long j;
        Object phoneVerificationAttempt;
        CustomerSupportAccessViewPhoneVerificationAttempt.Trigger trigger;
        CustomerSupportAccessViewPhoneVerificationAttempt.Trigger trigger2;
        ApiResult.Failure failure;
        CustomerSupportAccessViewPhoneVerificationAttempt.ErrorType errorType;
        CustomerSupportAccessViewPhoneVerificationAttempt.ErrorType errorType2;
        CustomerSupportAccessViewPhoneVerificationAttempt.Status status;
        PhoneVerificationViewModel.Loaded loaded;
        Object access$rejectPhoneVerificationAttempt;
        PhoneVerificationViewModel phoneVerificationViewModel;
        CustomerSupportAccessChangeIncidentAlert.Action action;
        CustomerSupportAccessChangeIncidentAlert.Status status2;
        SupportSearchService$SearchNode supportSearchService$SearchNode;
        CustomerSupportAccessOpenNode.SelectedType selectedType;
        Integer num;
        Integer num2;
        Integer num3;
        Integer valueOf;
        Collection values;
        String str;
        String str2;
        Unit navigateWith;
        String str3;
        String str4;
        Map map;
        SupportSearchService$SearchNode supportSearchService$SearchNode2;
        String str5;
        String str6;
        Link.Target target;
        int i = this.$r8$classId;
        int i2 = 6;
        int i3 = 8;
        int i4 = 3;
        int i5 = 10;
        int i6 = 11;
        Object obj2 = this.$isLoadingTransaction$delegate;
        Object obj3 = this.$transaction$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArticlePresenter articlePresenter = (ArticlePresenter) this.this$0;
                    String str7 = articlePresenter.args.data.paymentToken;
                    if (str7 == null) {
                        str7 = "entity_id_not_found";
                    }
                    SupportTransactionService supportTransactionService = articlePresenter.transactionService;
                    this.label = 1;
                    supportTransaction = ((RealSupportTransactionService) supportTransactionService).getSupportTransaction(str7, this);
                    if (supportTransaction == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    supportTransaction = obj;
                }
                SupportTransactionService.SupportTransactionResult supportTransactionResult = (SupportTransactionService.SupportTransactionResult) supportTransaction;
                if (supportTransactionResult instanceof SupportTransactionService.SupportTransactionResult.Success) {
                    SupportTransaction supportTransaction2 = ((SupportTransactionService.SupportTransactionResult.Success) supportTransactionResult).transaction;
                    List list = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                    ((MutableState) obj3).setValue(supportTransaction2);
                } else if (!(supportTransactionResult instanceof SupportTransactionService.SupportTransactionResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list2 = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                ((MutableState) obj2).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RecommendSupportArticlesRequest recommendSupportArticlesRequest = new RecommendSupportArticlesRequest((String) obj2, ByteString.EMPTY);
                this.label = 1;
                Object recommendSupportArticles = ((RealArticlesService) this.this$0).service.recommendSupportArticles((String) obj3, recommendSupportArticlesRequest, this);
                return recommendSupportArticles == coroutineSingletons2 ? coroutineSingletons2 : recommendSupportArticles;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (RealPendingMessagesStore.access$resolveTransaction((RealPendingMessagesStore) this.this$0, (String) obj3, (MessageBody.TransactionBody.Selected) ((MessageBody) obj2), this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str8 = ((RealPendingMessagesStore.MessagesState) obj2).flowToken;
                    this.label = 1;
                    if (RealPendingMessagesStore.access$dispatchSendMessages((RealPendingMessagesStore) this.this$0, (LinkedHashMap) obj3, str8, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                int i12 = 1;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$1 = new ChatView$30$1(coroutineScope, (ErrorPresenter) obj2, i12);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$1, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$12 = new ChatView$30$1(coroutineScope2, (TaxReturnsPresenter) obj2, 2);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$12, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$13 = new ChatView$30$1(coroutineScope3, (WorkHomePresenter) obj2, i4);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$13, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$1 = new TaxWebAppBridge$openTakePhoto$1$1(i3, coroutineScope4, (ChatPresenter) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(taxWebAppBridge$openTakePhoto$1$1, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                ChatPresenter chatPresenter = (ChatPresenter) obj2;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 != 0 && i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                do {
                    String str9 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                    if (!((Boolean) ((MutableState) obj3).getValue()).booleanValue() || !JobKt.isActive(coroutineScope5)) {
                        return Unit.INSTANCE;
                    }
                    chatPresenter.conversationService.loadNewMessages();
                    j = chatPresenter.pollingInterval;
                    this.this$0 = coroutineScope5;
                    this.label = 1;
                } while (JobKt.m4182delayVtjQ1oo(j, this) != coroutineSingletons9);
                return coroutineSingletons9;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatPresenter chatPresenter2 = (ChatPresenter) this.this$0;
                    String str10 = ((ChatViewEvent.BottomVisibleMessageChanged) ((ChatViewEvent) obj3)).messageToken;
                    String str11 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                    List list3 = ((ChatState) ((State) obj2).getValue()).messages;
                    this.label = 1;
                    if (ChatPresenter.access$updateLastReadMessageIfNecessary(chatPresenter2, str10, list3, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$14 = new ChatView$30$1(coroutineScope6, (InviteErrorPresenter) obj2, 5);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$14, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$15 = new ChatView$30$1(coroutineScope7, (InviteErrorPresenter) obj2, i2);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$15, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArticlePresenter articlePresenter2 = (ArticlePresenter) this.this$0;
                    RealContactSupportNavigator realContactSupportNavigator = articlePresenter2.contactSupportNavigator;
                    BetterNavigator.ScreenNavigator screenNavigator = articlePresenter2.navigator;
                    SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion transactionConfirmationQuestion = (SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion) obj2;
                    Article.ContactOption contactOption = transactionConfirmationQuestion.contactOption;
                    String str12 = transactionConfirmationQuestion.articleToken;
                    String str13 = articlePresenter2.args.data.flowToken;
                    Article article = (Article) ((MutableState) obj3).getValue();
                    Boolean valueOf2 = article != null ? Boolean.valueOf(article.includeIssueDescription) : null;
                    this.label = 1;
                    if (realContactSupportNavigator.goToScreenForOption(screenNavigator, contactOption, false, str12, str13, valueOf2, null, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                PhoneVerificationPresenter phoneVerificationPresenter = (PhoneVerificationPresenter) this.this$0;
                SupportScreens.PhoneVerificationScreen phoneVerificationScreen = phoneVerificationPresenter.args;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzr zzrVar = phoneVerificationPresenter.phoneVerificationService;
                    String str14 = phoneVerificationScreen.phoneVerificationId;
                    this.label = 1;
                    phoneVerificationAttempt = zzrVar.getPhoneVerificationAttempt(str14, this);
                    if (phoneVerificationAttempt == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    phoneVerificationAttempt = obj;
                }
                PhoneVerificationService$PhoneVerificationResult phoneVerificationService$PhoneVerificationResult = (PhoneVerificationService$PhoneVerificationResult) phoneVerificationAttempt;
                boolean z = phoneVerificationService$PhoneVerificationResult instanceof PhoneVerificationService$PhoneVerificationResult.Success;
                PhoneVerificationService$PhoneVerificationAttemptState$Invalid phoneVerificationService$PhoneVerificationAttemptState$Invalid = PhoneVerificationService$PhoneVerificationAttemptState$Invalid.INSTANCE;
                BoxKt boxKt = z ? ((PhoneVerificationService$PhoneVerificationResult.Success) phoneVerificationService$PhoneVerificationResult).verificationState : phoneVerificationService$PhoneVerificationAttemptState$Invalid;
                if (((Number) ((MutableState) obj3).getValue()).intValue() == 1) {
                    int ordinal = phoneVerificationScreen.source.ordinal();
                    if (ordinal == 0) {
                        trigger = CustomerSupportAccessViewPhoneVerificationAttempt.Trigger.NOTIFICATION;
                    } else {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            trigger2 = null;
                            Analytics analytics = phoneVerificationPresenter.analytics;
                            String str15 = phoneVerificationScreen.flowToken;
                            String str16 = phoneVerificationScreen.phoneVerificationId;
                            PhoneVerificationService$PhoneVerificationResult.Failure failure2 = !(phoneVerificationService$PhoneVerificationResult instanceof PhoneVerificationService$PhoneVerificationResult.Failure) ? (PhoneVerificationService$PhoneVerificationResult.Failure) phoneVerificationService$PhoneVerificationResult : null;
                            str15.getClass();
                            str16.getClass();
                            failure = failure2 == null ? failure2.failureType : null;
                            if (!(failure instanceof ApiResult.Failure.HttpFailure)) {
                                errorType2 = CustomerSupportAccessViewPhoneVerificationAttempt.ErrorType.SERVER;
                            } else {
                                if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                                    errorType = null;
                                    if (boxKt instanceof PhoneVerificationService$PhoneVerificationAttemptState$Pending) {
                                        status = CustomerSupportAccessViewPhoneVerificationAttempt.Status.PENDING;
                                    } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Rejected.INSTANCE)) {
                                        status = CustomerSupportAccessViewPhoneVerificationAttempt.Status.REJECTED;
                                    } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Verified.INSTANCE)) {
                                        status = CustomerSupportAccessViewPhoneVerificationAttempt.Status.VERIFIED;
                                    } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Expired.INSTANCE)) {
                                        status = CustomerSupportAccessViewPhoneVerificationAttempt.Status.EXPIRED;
                                    } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$FailedPin.INSTANCE)) {
                                        status = CustomerSupportAccessViewPhoneVerificationAttempt.Status.FAILED_PIN;
                                    } else {
                                        if (!boxKt.equals(phoneVerificationService$PhoneVerificationAttemptState$Invalid) && !boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Unknown.INSTANCE)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        status = CustomerSupportAccessViewPhoneVerificationAttempt.Status.INVALID;
                                    }
                                    analytics.track(new CustomerSupportAccessViewPhoneVerificationAttempt(str15, str16, status, errorType, trigger2), null);
                                    ((MutableState) obj2).setValue(PhoneVerificationPresenter.access$toViewModel(phoneVerificationPresenter, phoneVerificationService$PhoneVerificationResult));
                                    return Unit.INSTANCE;
                                }
                                errorType2 = CustomerSupportAccessViewPhoneVerificationAttempt.ErrorType.NETWORK;
                            }
                            errorType = errorType2;
                            if (boxKt instanceof PhoneVerificationService$PhoneVerificationAttemptState$Pending) {
                            }
                            analytics.track(new CustomerSupportAccessViewPhoneVerificationAttempt(str15, str16, status, errorType, trigger2), null);
                            ((MutableState) obj2).setValue(PhoneVerificationPresenter.access$toViewModel(phoneVerificationPresenter, phoneVerificationService$PhoneVerificationResult));
                            return Unit.INSTANCE;
                        }
                        trigger = CustomerSupportAccessViewPhoneVerificationAttempt.Trigger.SYNC_VALUE;
                    }
                } else {
                    trigger = CustomerSupportAccessViewPhoneVerificationAttempt.Trigger.RETRY;
                }
                trigger2 = trigger;
                Analytics analytics2 = phoneVerificationPresenter.analytics;
                String str152 = phoneVerificationScreen.flowToken;
                String str162 = phoneVerificationScreen.phoneVerificationId;
                if (!(phoneVerificationService$PhoneVerificationResult instanceof PhoneVerificationService$PhoneVerificationResult.Failure)) {
                }
                str152.getClass();
                str162.getClass();
                if (failure2 == null) {
                }
                if (!(failure instanceof ApiResult.Failure.HttpFailure)) {
                }
                errorType = errorType2;
                if (boxKt instanceof PhoneVerificationService$PhoneVerificationAttemptState$Pending) {
                }
                analytics2.track(new CustomerSupportAccessViewPhoneVerificationAttempt(str152, str162, status, errorType, trigger2), null);
                ((MutableState) obj2).setValue(PhoneVerificationPresenter.access$toViewModel(phoneVerificationPresenter, phoneVerificationService$PhoneVerificationResult));
                return Unit.INSTANCE;
            case 14:
                MutableState mutableState = (MutableState) obj3;
                PhoneVerificationPresenter phoneVerificationPresenter2 = (PhoneVerificationPresenter) obj2;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PhoneVerificationViewModel phoneVerificationViewModel2 = (PhoneVerificationViewModel) mutableState.getValue();
                    PhoneVerificationViewModel phoneVerificationViewModel3 = (PhoneVerificationViewModel) mutableState.getValue();
                    PhoneVerificationViewModel.Loaded loaded2 = phoneVerificationViewModel3 instanceof PhoneVerificationViewModel.Loaded ? (PhoneVerificationViewModel.Loaded) phoneVerificationViewModel3 : null;
                    if (loaded2 != null) {
                        PhoneVerificationViewModel.Loaded.Status status3 = PhoneVerificationViewModel.Loaded.Status.RESPONDING;
                        EmptyList emptyList = EmptyList.INSTANCE;
                        String str17 = loaded2.title;
                        String str18 = loaded2.subTitle;
                        boolean z2 = loaded2.phoneVerificationResultSuccess;
                        str17.getClass();
                        str18.getClass();
                        emptyList.getClass();
                        loaded = new PhoneVerificationViewModel.Loaded(str17, str18, status3, emptyList, z2);
                    } else {
                        loaded = null;
                    }
                    if (loaded == null) {
                        return Unit.INSTANCE;
                    }
                    mutableState.setValue(loaded);
                    this.this$0 = phoneVerificationViewModel2;
                    this.label = 1;
                    access$rejectPhoneVerificationAttempt = PhoneVerificationPresenter.access$rejectPhoneVerificationAttempt(phoneVerificationPresenter2, this);
                    if (access$rejectPhoneVerificationAttempt == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                    phoneVerificationViewModel = phoneVerificationViewModel2;
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    phoneVerificationViewModel = (PhoneVerificationViewModel) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    access$rejectPhoneVerificationAttempt = obj;
                }
                PhoneVerificationService$PhoneVerificationResult phoneVerificationService$PhoneVerificationResult2 = (PhoneVerificationService$PhoneVerificationResult) access$rejectPhoneVerificationAttempt;
                if (phoneVerificationService$PhoneVerificationResult2 instanceof PhoneVerificationService$PhoneVerificationResult.Failure) {
                    BetterNavigator.ScreenNavigator screenNavigator2 = phoneVerificationPresenter2.navigator;
                    AndroidStringManager androidStringManager = phoneVerificationPresenter2.stringManager;
                    screenNavigator2.goTo(new SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen(androidStringManager.get(R.string.voice_auth_reject_failed_title_text), androidStringManager.get(R.string.voice_auth_response_failed_body_text), true));
                } else {
                    phoneVerificationPresenter2.notificationManager.notificationManager.cancel(phoneVerificationPresenter2.args.phoneVerificationId, 6);
                    phoneVerificationViewModel = PhoneVerificationPresenter.access$toViewModel(phoneVerificationPresenter2, phoneVerificationService$PhoneVerificationResult2);
                }
                mutableState.setValue(phoneVerificationViewModel);
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$16 = new ChatView$30$1(coroutineScope8, (TaxReturnsPresenter) obj2, 7);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$16, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$17 = new ChatView$30$1(coroutineScope9, (LocalHomePresenter) obj2, i3);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$17, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$18 = new ChatView$30$1(coroutineScope10, (ErrorPresenter) obj2, 9);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$18, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$19 = new ChatView$30$1(coroutineScope11, (ErrorPresenter) obj2, i5);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$19, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$110 = new ChatView$30$1(coroutineScope12, (ErrorPresenter) obj2, i6);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$110, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                MutableState mutableState2 = (MutableState) obj3;
                SupportIncidentDetailsViewEvent supportIncidentDetailsViewEvent = (SupportIncidentDetailsViewEvent) obj2;
                InstrumentDetailsPresenter instrumentDetailsPresenter = (InstrumentDetailsPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction = ((SupportIncidentDetailsViewEvent.UpdateIncidentSubscription) supportIncidentDetailsViewEvent).action;
                    this.label = 1;
                    if (InstrumentDetailsPresenter.access$updateIncidentSubscription(instrumentDetailsPresenter, incidentViewModel$SubscriptionAction, mutableState2, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction2 = ((SupportIncidentDetailsViewEvent.UpdateIncidentSubscription) supportIncidentDetailsViewEvent).action;
                SupportIncidentDetailsPresenter$State supportIncidentDetailsPresenter$State = (SupportIncidentDetailsPresenter$State) mutableState2.getValue();
                Analytics analytics3 = instrumentDetailsPresenter.analytics;
                int ordinal2 = incidentViewModel$SubscriptionAction2.ordinal();
                if (ordinal2 == 0) {
                    action = CustomerSupportAccessChangeIncidentAlert.Action.SUBSCRIBE;
                } else {
                    if (ordinal2 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    action = CustomerSupportAccessChangeIncidentAlert.Action.UNSUBSCRIBE;
                }
                SupportScreens.FlowScreens.SupportIncidentDetailsScreen supportIncidentDetailsScreen = (SupportScreens.FlowScreens.SupportIncidentDetailsScreen) instrumentDetailsPresenter.scope;
                String str19 = supportIncidentDetailsScreen.data.flowToken;
                String str20 = supportIncidentDetailsScreen.incidentId;
                Incident incident = supportIncidentDetailsPresenter$State.incident;
                incident.getClass();
                int ordinal3 = incident.status.ordinal();
                if (ordinal3 == 0) {
                    status2 = CustomerSupportAccessChangeIncidentAlert.Status.IDENTIFIED;
                } else if (ordinal3 == 1) {
                    status2 = CustomerSupportAccessChangeIncidentAlert.Status.INVESTIGATING;
                } else if (ordinal3 == 2) {
                    status2 = CustomerSupportAccessChangeIncidentAlert.Status.RESOLVED;
                } else {
                    if (ordinal3 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    status2 = CustomerSupportAccessChangeIncidentAlert.Status.UNKNOWN;
                }
                analytics3.track(new CustomerSupportAccessChangeIncidentAlert(action, str19, str20, status2), null);
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$111 = new ChatView$30$1(coroutineScope13, (InviteErrorPresenter) obj2, 12);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$111, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                SupportSearchPresenter supportSearchPresenter = (SupportSearchPresenter) obj2;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow m4195debounceHG0u8IE = FlowKt.m4195debounceHG0u8IE((MutableSharedFlow) this.this$0, supportSearchPresenter.searchDebounceInMilliSeconds);
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$12 = new TaxWebAppBridge$openTakePhoto$1$1(i5, supportSearchPresenter, (MutableState) obj3);
                    this.label = 1;
                    if (m4195debounceHG0u8IE.collect(taxWebAppBridge$openTakePhoto$1$12, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                SupportSearchViewEvent supportSearchViewEvent = (SupportSearchViewEvent) obj2;
                MutableState mutableState3 = (MutableState) obj3;
                SupportSearchPresenter supportSearchPresenter2 = (SupportSearchPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SupportSearchPresenter.State state = (SupportSearchPresenter.State) mutableState3.getValue();
                    SupportSearchViewModel.Node node = ((SupportSearchViewEvent.ResultSelected) supportSearchViewEvent).node;
                    this.label = 1;
                    SupportScreens.FlowScreens.SupportSearchScreen supportSearchScreen = supportSearchPresenter2.args;
                    SupportSearchPresenter.SearchResults searchResults = state.searchResults;
                    SupportSearchPresenter.DefaultResults defaultResults = state.defaultResults;
                    Map map2 = defaultResults.suggested;
                    Map map3 = defaultResults.recentlyViewed;
                    SupportSearchViewModel.Node.Type type2 = node.f1211type;
                    String str21 = node.token;
                    int ordinal4 = type2.ordinal();
                    if (ordinal4 == 0) {
                        supportSearchService$SearchNode = searchResults != null ? (SupportSearchService$SearchNode) searchResults.results.get(str21) : null;
                    } else if (ordinal4 == 1) {
                        supportSearchService$SearchNode = (SupportSearchService$SearchNode) map2.get(str21);
                    } else {
                        if (ordinal4 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        supportSearchService$SearchNode = (SupportSearchService$SearchNode) map3.get(str21);
                    }
                    if (supportSearchService$SearchNode == null) {
                        navigateWith = Unit.INSTANCE;
                    } else {
                        Link link = supportSearchService$SearchNode.link;
                        String str22 = supportSearchService$SearchNode.token;
                        String str23 = state.viewToken;
                        int ordinal5 = node.f1211type.ordinal();
                        int i32 = -1;
                        int i33 = 0;
                        if (ordinal5 == 0) {
                            Integer valueOf3 = searchResults != null ? Integer.valueOf(searchResults.results.size()) : null;
                            selectedType = CustomerSupportAccessOpenNode.SelectedType.SEARCH;
                            if (searchResults != null && (values = searchResults.results.values()) != null) {
                                Iterator it = values.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    } else {
                                        Object next = it.next();
                                        if (i33 < 0) {
                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                            throw null;
                                        }
                                        if (Intrinsics.areEqual(((SupportSearchService$SearchNode) next).token, str22)) {
                                            i32 = i33;
                                            break;
                                        } else {
                                            i33++;
                                        }
                                    }
                                }
                            } else {
                                num = null;
                            }
                            num2 = valueOf3;
                            num3 = num;
                            valueOf = searchResults != null ? Integer.valueOf(searchResults.results.size()) : null;
                        } else if (ordinal5 == 1) {
                            Integer valueOf4 = Integer.valueOf(map2.size() + map3.size());
                            CustomerSupportAccessOpenNode.SelectedType selectedType2 = CustomerSupportAccessOpenNode.SelectedType.SUGGESTED;
                            Iterator it2 = map2.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else {
                                    Object next2 = it2.next();
                                    if (i33 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    if (Intrinsics.areEqual(((SupportSearchService$SearchNode) next2).token, str22)) {
                                        i32 = i33;
                                        break;
                                    } else {
                                        i33++;
                                    }
                                }
                            }
                        } else {
                            if (ordinal5 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Integer valueOf5 = Integer.valueOf(map2.size() + map3.size());
                            selectedType = CustomerSupportAccessOpenNode.SelectedType.RECENTLY_VIEWED;
                            Iterator it3 = map3.values().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                } else {
                                    Object next3 = it3.next();
                                    if (i33 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    if (Intrinsics.areEqual(((SupportSearchService$SearchNode) next3).token, str22)) {
                                        i32 = i33;
                                        break;
                                    } else {
                                        i33++;
                                    }
                                }
                            }
                        }
                        CustomerSupportAccessOpenNode.SelectedType selectedType3 = selectedType;
                        Analytics analytics4 = supportSearchPresenter2.analytics;
                        Link.Target target2 = link.target;
                        Link.Target.ClientScenario clientScenario = target2 instanceof Link.Target.ClientScenario ? (Link.Target.ClientScenario) target2 : null;
                        String str24 = clientScenario != null ? clientScenario.stringRepresentation : null;
                        Link.Target.External external = target2 instanceof Link.Target.External ? (Link.Target.External) target2 : null;
                        if (external == null || (str4 = external.url) == null) {
                            Link.Target.ClientRoute clientRoute = target2 instanceof Link.Target.ClientRoute ? (Link.Target.ClientRoute) target2 : null;
                            str = clientRoute != null ? clientRoute.url : null;
                        } else {
                            str = str4;
                        }
                        String str25 = supportSearchScreen.data.flowToken;
                        String str26 = supportSearchService$SearchNode.token;
                        CustomerSupportAccessOpenNode.Trigger trigger3 = CustomerSupportAccessOpenNode.Trigger.SEARCH;
                        if (searchResults == null || (str3 = searchResults.text) == null) {
                            str2 = null;
                        } else {
                            String lowerCase = str3.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            str2 = lowerCase;
                        }
                        analytics4.track(new CustomerSupportAccessOpenNode(str24, str, str25, str26, selectedType3, valueOf, num3, num2, trigger3, supportSearchScreen.data.paymentToken, str2, str23), null);
                        RealSupportLinkNavigator realSupportLinkNavigator = supportSearchPresenter2.linkNavigator;
                        BetterNavigator.ScreenNavigator screenNavigator3 = supportSearchPresenter2.navigator;
                        SupportScreens.FlowScreens.Data copy$default = SupportScreens.FlowScreens.Data.copy$default(supportSearchScreen.data, null, null, searchResults != null ? searchResults.text : null, null, null, null, 239);
                        String str27 = supportSearchScreen.nodeToken;
                        List list4 = supportSearchScreen.suggestedArticles;
                        SearchPlaceholder searchPlaceholder = supportSearchScreen.searchPlaceholder;
                        str27.getClass();
                        list4.getClass();
                        searchPlaceholder.getClass();
                        navigateWith = realSupportLinkNavigator.navigateWith(screenNavigator3, new SupportScreens.FlowScreens.SupportSearchScreen(copy$default, str27, list4, searchPlaceholder), link.target, null, BlockersData.AnalyticsData.Source.SUPPORT_SEARCH);
                        if (navigateWith != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            navigateWith = Unit.INSTANCE;
                        }
                    }
                    if (navigateWith == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                SupportSearchViewModel.Node node2 = ((SupportSearchViewEvent.ResultSelected) supportSearchViewEvent).node;
                SupportSearchPresenter.State state2 = (SupportSearchPresenter.State) mutableState3.getValue();
                int ordinal6 = node2.f1211type.ordinal();
                if (ordinal6 == 0) {
                    SupportSearchPresenter.SearchResults searchResults2 = state2.searchResults;
                    map = searchResults2 != null ? searchResults2.results : null;
                } else if (ordinal6 == 1) {
                    map = state2.defaultResults.suggested;
                } else {
                    if (ordinal6 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    map = state2.defaultResults.recentlyViewed;
                }
                Link link2 = (map == null || (supportSearchService$SearchNode2 = (SupportSearchService$SearchNode) map.get(node2.token)) == null) ? null : supportSearchService$SearchNode2.link;
                if (link2 != null) {
                    String str28 = link2.token;
                    RealArticlesService realArticlesService = supportSearchPresenter2.articlesService;
                    realArticlesService.linkCache.put(str28, link2);
                    realArticlesService.supportViewedArticlesStore.add(new RecentlyViewedNode(str28));
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$112 = new ChatView$30$1(coroutineScope14, (TaxReturnsPresenter) obj2, 13);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$112, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                ArticleViewEvent articleViewEvent = (ArticleViewEvent) obj2;
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.this$0;
                SupportScreens.UnauthenticatedArticleScreen unauthenticatedArticleScreen = (SupportScreens.UnauthenticatedArticleScreen) localEditorialPresenter.clock;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArticlesService$ArticleResult articlesService$ArticleResult = (ArticlesService$ArticleResult) ((MutableState) obj3).getValue();
                    ArticlesService$ArticleResult.Success success = articlesService$ArticleResult instanceof ArticlesService$ArticleResult.Success ? (ArticlesService$ArticleResult.Success) articlesService$ArticleResult : null;
                    Article article2 = success != null ? success.article : null;
                    if (article2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Cannot click article link without valid article.");
                        return null;
                    }
                    ArticleViewEvent.ClickLink clickLink = (ArticleViewEvent.ClickLink) articleViewEvent;
                    Link.Target target3 = clickLink.getLink().target;
                    Analytics analytics5 = (Analytics) localEditorialPresenter.installedStore;
                    Link.Target.ClientScenario clientScenario2 = target3 instanceof Link.Target.ClientScenario ? (Link.Target.ClientScenario) target3 : null;
                    String str29 = clientScenario2 != null ? clientScenario2.stringRepresentation : null;
                    Link.Target.External external2 = target3 instanceof Link.Target.External ? (Link.Target.External) target3 : null;
                    if (external2 == null || (str6 = external2.url) == null) {
                        Link.Target.ClientRoute clientRoute2 = target3 instanceof Link.Target.ClientRoute ? (Link.Target.ClientRoute) target3 : null;
                        if (clientRoute2 != null) {
                            str6 = clientRoute2.url;
                        } else {
                            str5 = null;
                            String str30 = unauthenticatedArticleScreen.flowToken;
                            String str31 = clickLink.getLink().token;
                            CustomerSupportAccessOpenNode.SelectedType selectedType4 = CustomerSupportAccessOpenNode.SelectedType.NODE_TREE;
                            List list5 = article2.links;
                            analytics5.track(new CustomerSupportAccessOpenNode(str29, str5, str30, str31, selectedType4, Integer.valueOf(list5.size()), Integer.valueOf(list5.indexOf(clickLink.getLink())), Integer.valueOf(list5.size()), CustomerSupportAccessOpenNode.Trigger.NODE, (String) null, (String) localEditorialPresenter.responseContextHandler, 1536), null);
                            Lazy lazy = (Lazy) localEditorialPresenter.service;
                            BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                            String str32 = article2.title;
                            String str33 = unauthenticatedArticleScreen.token;
                            String str34 = unauthenticatedArticleScreen.flowToken;
                            String str35 = unauthenticatedArticleScreen.parentTitle;
                            str33.getClass();
                            str34.getClass();
                            SupportScreens.UnauthenticatedArticleScreen unauthenticatedArticleScreen2 = new SupportScreens.UnauthenticatedArticleScreen(str33, str34, str35, str32);
                            target = clickLink.getLink().target;
                            this.label = 1;
                            RealRouter create$1 = ((RealRouter$Factory$Impl) lazy.initializer).create$1(screenNavigator4);
                            if (!(target instanceof Link.Target.Article)) {
                                screenNavigator4.goTo(new SupportScreens.UnauthenticatedArticleScreen(((Link.Target.Article) target).token, str34, str32, null));
                            } else if (target instanceof Link.Target.ClientRoute) {
                                create$1.route(new RoutingParams(null, null, null, null, null, null, 511), ((Link.Target.ClientRoute) target).url);
                            } else if (target instanceof Link.Target.External) {
                                ((IntentLauncher) lazy.value).launchUrlInExternalApp(((Link.Target.External) target).url);
                            } else {
                                if (!(target instanceof Link.Target.ClientScenario)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                screenNavigator4.goTo(new SupportScreens.SupportLoadClientScenarioScreen(((Link.Target.ClientScenario) target).stringRepresentation, new SupportScreens.FlowScreens.Data(str34, null, null, unauthenticatedArticleScreen2, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE)));
                            }
                            if (Unit.INSTANCE == coroutineSingletons26) {
                                return coroutineSingletons26;
                            }
                        }
                    }
                    str5 = str6;
                    String str302 = unauthenticatedArticleScreen.flowToken;
                    String str312 = clickLink.getLink().token;
                    CustomerSupportAccessOpenNode.SelectedType selectedType42 = CustomerSupportAccessOpenNode.SelectedType.NODE_TREE;
                    List list52 = article2.links;
                    analytics5.track(new CustomerSupportAccessOpenNode(str29, str5, str302, str312, selectedType42, Integer.valueOf(list52.size()), Integer.valueOf(list52.indexOf(clickLink.getLink())), Integer.valueOf(list52.size()), CustomerSupportAccessOpenNode.Trigger.NODE, (String) null, (String) localEditorialPresenter.responseContextHandler, 1536), null);
                    Lazy lazy2 = (Lazy) localEditorialPresenter.service;
                    BetterNavigator.ScreenNavigator screenNavigator42 = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                    String str322 = article2.title;
                    String str332 = unauthenticatedArticleScreen.token;
                    String str342 = unauthenticatedArticleScreen.flowToken;
                    String str352 = unauthenticatedArticleScreen.parentTitle;
                    str332.getClass();
                    str342.getClass();
                    SupportScreens.UnauthenticatedArticleScreen unauthenticatedArticleScreen22 = new SupportScreens.UnauthenticatedArticleScreen(str332, str342, str352, str322);
                    target = clickLink.getLink().target;
                    this.label = 1;
                    RealRouter create$12 = ((RealRouter$Factory$Impl) lazy2.initializer).create$1(screenNavigator42);
                    if (!(target instanceof Link.Target.Article)) {
                    }
                    if (Unit.INSTANCE == coroutineSingletons26) {
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24((LazyListState) this.this$0, 15)));
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$13 = new TaxWebAppBridge$openTakePhoto$1$1(i6, (SupportDisputeTrackerViewModel.Loaded) obj3, (Function1) obj2);
                    this.label = 1;
                    if (distinctUntilChanged.collect(taxWebAppBridge$openTakePhoto$1$13, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                MutableState mutableState4 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) mutableState4.getValue()).booleanValue()) {
                        ScrollState scrollState = (ScrollState) this.this$0;
                        int intValue = ((ParcelableSnapshotMutableIntState) obj2).getIntValue();
                        this.label = 1;
                        if (PlatformKt.scrollBy(scrollState, intValue - scrollState.value$delegate.getIntValue(), this) == coroutineSingletons28) {
                            return coroutineSingletons28;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i37 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutableState4.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 28:
                FlowCollector flowCollector = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TagCommunicationData tagCommunicationData = new TagCommunicationData(((RealTagCommunication) obj3).tagTechnology.transceive((byte[]) obj2), null);
                    this.this$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(tagCommunicationData, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatView$30$1 chatView$30$113 = new ChatView$30$1(coroutineScope15, (WorkHomePresenter) obj2, 14);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(chatView$30$113, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArticlePresenter$models$1$1(MoleculePresenter moleculePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isLoadingTransaction$delegate = moleculePresenter;
        this.$transaction$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticlePresenter$models$1$1(RealTagCommunication realTagCommunication, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 28;
        this.$transaction$delegate = realTagCommunication;
        this.$isLoadingTransaction$delegate = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArticlePresenter$models$1$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$transaction$delegate = obj2;
        this.$isLoadingTransaction$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArticlePresenter$models$1$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$transaction$delegate = flow;
        this.$isLoadingTransaction$delegate = moleculePresenter;
    }
}
