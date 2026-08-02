package com.squareup.cash.support.chat.views;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.ArrayMap;
import androidx.graphics.shapes.CubicKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.navigation.NavArgumentKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewEvent$Exit;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.balancebasedaddcash.BalanceBasedAddCashEditAmountClose;
import com.squareup.cash.cdf.customersupport.CustomerSupportCaptureStart;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatSelectExitAction;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactSubmitTransaction;
import com.squareup.cash.cdf.customersupport.CustomerSupportFullTransactionPickerStart;
import com.squareup.cash.cdf.customersupport.FullTransactionPickerOrigin;
import com.squareup.cash.cdf.instrument.InstrumentLinkInitiate;
import com.squareup.cash.cdf.instrument.InstrumentLinkRemove;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.taxeshub.TaxesHubViewTap;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Failed;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Recorded;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Sending;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.cash.support.chat.backend.real.RealChatManager;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.presenters.ChatPresenter;
import com.squareup.cash.support.chat.screens.ChatTransactionPickerResult;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatErrorViewEvent$Close;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptViewEvents;
import com.squareup.cash.support.chat.viewmodels.ChatFailedDeliveryViewEvent;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyUnavailableViewEvent;
import com.squareup.cash.support.chat.views.transcript.TranscriptRecyclerView;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screens.SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen;
import com.squareup.cash.support.screenshot.AnalyticsUitlKt;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.viewmodels.ScreenshotConfirmViewEvent$Confirm;
import com.squareup.cash.support.viewmodels.SupportArticleIncidentsSheetViewEvent;
import com.squareup.cash.support.viewmodels.SupportFlowCheckConnectionViewEvent$Close;
import com.squareup.cash.support.viewmodels.SupportHomeContactOptionsSheetEvents;
import com.squareup.cash.support.viewmodels.SupportLoadClientScenarioEvent$GoBack;
import com.squareup.cash.support.viewmodels.SupportNotification;
import com.squareup.cash.support.viewmodels.SupportTransactionConfirmationViewEvent;
import com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen;
import com.squareup.cash.taptopay.screens.TapToPayFirstTimeScreen;
import com.squareup.cash.taptopay.screens.TapToPayPaymentScreen;
import com.squareup.cash.taptopay.viewmodels.TapToPayErrorDialogViewEvent;
import com.squareup.cash.taptopay.viewmodels.TapToPayErrorViewEvent$Close;
import com.squareup.cash.taptopay.viewmodels.TapToPayFirstTimeScreenViewEvent;
import com.squareup.cash.tax.presenters.RealTaxDesktopTooltipPreference;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.screens.TaxReturnsScreen;
import com.squareup.cash.tax.viewmodels.TaxMenuSheetViewEvent$MenuClick;
import com.squareup.cash.tax.viewmodels.TaxReturnsEvent;
import com.squareup.cash.tax.viewmodels.TaxTooltipEvent$TooltipDismissed;
import com.squareup.cash.tax.viewmodels.TaxWebBridgeDialogViewEvent$ButtonClick;
import com.squareup.cash.tax.viewmodels.TaxesAppletTileEvent$TaxesAppletOnClickTile;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter;
import com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewEvent$Exit;
import com.squareup.cash.transactionpicker.blocker.presenters.UnifiedActivityPickerBlockerPresenter;
import com.squareup.cash.transactionpicker.viewmodels.TransactionPickerViewEvent;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter;
import com.squareup.cash.transfers.screens.InstrumentDetailsScreen;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsScreen;
import com.squareup.cash.transfers.screens.LinkedAccountsScreen;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsDismissDialogScreen;
import com.squareup.cash.transfers.screens.SetDefaultInstrumentScreen;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAddCashDisabledDialogViewEvent;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewEvent;
import com.squareup.cash.transfers.viewmodels.InstrumentLinkingOptionsViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsDismissDialogViewEvent;
import com.squareup.cash.transfers.viewmodels.SetDefaultInstrumentViewEvent$CloseClick;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.scannerview.TextSetter;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final class ChatView$30$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ ChatView$30$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        String str2;
        int i;
        int i2;
        BlockersScreens.StartFlowEntryPoint startProfileLinkingFlow;
        BlockersData blockersData;
        String str3;
        int i3 = this.$r8$classId;
        FullScreenActivityViewEvent$Exit fullScreenActivityViewEvent$Exit = FullScreenActivityViewEvent$Exit.INSTANCE;
        int i4 = 4;
        Back back = Back.INSTANCE;
        Object obj2 = this.this$0;
        Continuation continuation2 = null;
        switch (i3) {
            case 0:
                ChatView chatView = (ChatView) obj2;
                TranscriptRecyclerView transcriptRecyclerView = chatView.chatView;
                RecyclerView.Adapter adapter = transcriptRecyclerView.mAdapter;
                ChatView.access$emitLastMessageVisibilityChange(chatView, transcriptRecyclerView.linearLayoutManager.findLastVisibleItemPosition() >= (adapter != null ? adapter.getItemCount() : 0) - 2);
                return Unit.INSTANCE;
            case 1:
                if (Intrinsics.areEqual((ChatErrorViewEvent$Close) obj, ChatErrorViewEvent$Close.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, ((ErrorPresenter) obj2).navigator);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 2:
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator;
                Analytics analytics = (Analytics) taxReturnsPresenter.args;
                SupportChatScreens.SupportChatDialogs.ChatExitPrompt chatExitPrompt = (SupportChatScreens.SupportChatDialogs.ChatExitPrompt) taxReturnsPresenter.router;
                ChatExitPromptViewEvents chatExitPromptViewEvents = (ChatExitPromptViewEvents) obj;
                if (Intrinsics.areEqual(chatExitPromptViewEvents, ChatExitPromptViewEvents.EndConversation.INSTANCE)) {
                    RealChatManager realChatManager = (RealChatManager) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider;
                    String str4 = chatExitPrompt.flowToken;
                    str4.getClass();
                    JobKt.launch$default(realChatManager.scope, null, null, new ShoppingWebBridge$loadUrl$1(realChatManager, str4, null, 15), 3);
                    analytics.track(new CustomerSupportChatSelectExitAction(CustomerSupportChatSelectExitAction.Action.END, chatExitPrompt.flowToken), null);
                    screenNavigator.giveAnswer(chatExitPrompt.question, SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.EndConversation.INSTANCE);
                } else {
                    if (!Intrinsics.areEqual(chatExitPromptViewEvents, ChatExitPromptViewEvents.SaveAndContinue.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    analytics.track(new CustomerSupportChatSelectExitAction(CustomerSupportChatSelectExitAction.Action.CONTINUE, chatExitPrompt.flowToken), null);
                    screenNavigator.giveAnswer(chatExitPrompt.question, SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.SaveAndContinue.INSTANCE);
                }
                return Unit.INSTANCE;
            case 3:
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj2;
                SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet chatFailedDeliverySheet = (SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet) workHomePresenter.payPresenter;
                RealConversationService realConversationService = (RealConversationService) workHomePresenter.shiftsAnalytics;
                ChatFailedDeliveryViewEvent chatFailedDeliveryViewEvent = (ChatFailedDeliveryViewEvent) obj;
                if (!Intrinsics.areEqual(chatFailedDeliveryViewEvent, ChatFailedDeliveryViewEvent.Cancel.INSTANCE)) {
                    if (Intrinsics.areEqual(chatFailedDeliveryViewEvent, ChatFailedDeliveryViewEvent.DeleteMessage.INSTANCE)) {
                        realConversationService.deletePendingMessage(chatFailedDeliverySheet.messageIdempotenceToken);
                        ((AndroidAccessibilityManager) workHomePresenter.titleBarPresenter).announceForAccessibility(((AndroidStringManager) workHomePresenter.shiftSection2Presenter).get(R.string.support_chat_a11y_announce_message_deleted));
                    } else {
                        if (!Intrinsics.areEqual(chatFailedDeliveryViewEvent, ChatFailedDeliveryViewEvent.ResendMessage.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        realConversationService.resendMessage(chatFailedDeliverySheet.messageIdempotenceToken, chatFailedDeliverySheet.flowToken, chatFailedDeliverySheet.conversation, chatFailedDeliverySheet.isTypingIndicatorDisplayed);
                    }
                }
                ((BetterNavigator.ScreenNavigator) workHomePresenter.youPresenter).goTo(back);
                return Unit.INSTANCE;
            case 4:
                List list = (List) obj;
                List list2 = (List) list.get(0);
                List list3 = (List) list.get(1);
                TextSetter textSetter = ((ChatPresenter) obj2).chatAccessibilityManager;
                Resources resources = ((AndroidStringManager) textSetter.textSwitcher).resources;
                list2.getClass();
                list3.getClass();
                AndroidAccessibilityManager androidAccessibilityManager = (AndroidAccessibilityManager) textSetter.textView;
                if (((AccessibilityManager) androidAccessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof PendingMessage) {
                            arrayList.add(obj3);
                        }
                    }
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        linkedHashMap.put(((PendingMessage) next).idempotenceToken, next);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (obj4 instanceof PendingMessage) {
                            arrayList2.add(obj4);
                        }
                    }
                    int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    if (mapCapacity2 < 16) {
                        mapCapacity2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        linkedHashMap2.put(((PendingMessage) next2).idempotenceToken, next2);
                    }
                    int size = CollectionsKt.subtract(linkedHashMap2.keySet(), linkedHashMap.keySet()).size();
                    boolean isEmpty = linkedHashMap2.isEmpty();
                    MessageStatus$Sending messageStatus$Sending = MessageStatus$Sending.INSTANCE;
                    if (isEmpty) {
                        i = 0;
                    } else {
                        i = 0;
                        for (Map.Entry entry : linkedHashMap2.entrySet()) {
                            PendingMessage pendingMessage = (PendingMessage) linkedHashMap.get(entry.getKey());
                            if (Intrinsics.areEqual(pendingMessage != null ? pendingMessage.status : null, messageStatus$Sending) && (((PendingMessage) entry.getValue()).status instanceof MessageStatus$Recorded)) {
                                i++;
                            }
                        }
                    }
                    if (linkedHashMap2.isEmpty()) {
                        i2 = 0;
                    } else {
                        int i5 = 0;
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            PendingMessage pendingMessage2 = (PendingMessage) linkedHashMap.get(entry2.getKey());
                            if (Intrinsics.areEqual(pendingMessage2 != null ? pendingMessage2.status : null, messageStatus$Sending) && (((PendingMessage) entry2.getValue()).status instanceof MessageStatus$Failed)) {
                                i5++;
                            }
                        }
                        i2 = i5;
                    }
                    if (size > 0) {
                        Integer valueOf = Integer.valueOf(size);
                        ArrayMap arrayMap = new ArrayMap(1);
                        arrayMap.put("count", valueOf);
                        resources.getClass();
                        String format2 = new MessageFormat(resources.getString(R.string.support_chat_a11y_announce_sending_message)).format(arrayMap);
                        format2.getClass();
                        androidAccessibilityManager.announceForAccessibility(format2);
                    }
                    if (i > 0) {
                        Integer valueOf2 = Integer.valueOf(i);
                        ArrayMap arrayMap2 = new ArrayMap(1);
                        arrayMap2.put("count", valueOf2);
                        resources.getClass();
                        String format3 = new MessageFormat(resources.getString(R.string.support_chat_a11y_announce_messages_sent)).format(arrayMap2);
                        format3.getClass();
                        androidAccessibilityManager.announceForAccessibility(format3);
                    }
                    if (i2 > 0) {
                        Integer valueOf3 = Integer.valueOf(i2);
                        ArrayMap arrayMap3 = new ArrayMap(1);
                        arrayMap3.put("count", valueOf3);
                        resources.getClass();
                        String format4 = new MessageFormat(resources.getString(R.string.support_chat_a11y_announce_messages_not_sent)).format(arrayMap3);
                        format4.getClass();
                        androidAccessibilityManager.announceForAccessibility(format4);
                    }
                }
                AndroidStringManager androidStringManager = (AndroidStringManager) textSetter.textSwitcher;
                AndroidAccessibilityManager androidAccessibilityManager2 = (AndroidAccessibilityManager) textSetter.textView;
                if (((AccessibilityManager) androidAccessibilityManager2.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : list2) {
                        if (obj5 instanceof RecordedMessage) {
                            arrayList3.add(obj5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        if (((RecordedMessage) next3).sender != Message.Sender.CUSTOMER) {
                            arrayList4.add(next3);
                        }
                    }
                    int mapCapacity3 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                    if (mapCapacity3 < 16) {
                        mapCapacity3 = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity3);
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        Object next4 = it4.next();
                        linkedHashMap3.put(((RecordedMessage) next4).messageToken, next4);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj6 : list3) {
                        if (obj6 instanceof RecordedMessage) {
                            arrayList5.add(obj6);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        Object next5 = it5.next();
                        if (((RecordedMessage) next5).sender != Message.Sender.CUSTOMER) {
                            arrayList6.add(next5);
                        }
                    }
                    int mapCapacity4 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(mapCapacity4 >= 16 ? mapCapacity4 : 16);
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        Object next6 = it6.next();
                        linkedHashMap4.put(((RecordedMessage) next6).messageToken, next6);
                    }
                    Iterator it7 = CollectionsKt.subtract(linkedHashMap4.keySet(), linkedHashMap3.keySet()).iterator();
                    while (it7.hasNext()) {
                        RecordedMessage recordedMessage = (RecordedMessage) MapsKt__MapsKt.getValue(linkedHashMap4, (String) it7.next());
                        ChatContentViewModel.EntryViewModel.ContentDescription createContentDescription = CubicKt.createContentDescription(recordedMessage, androidStringManager, (AssetPublicSuffixList) textSetter.scannerText);
                        MessageBody messageBody = recordedMessage.body;
                        boolean z = messageBody instanceof MessageBody.TextBody;
                        MessageBody.UnknownBody unknownBody = MessageBody.UnknownBody.INSTANCE;
                        if (z || (messageBody instanceof MessageBody.SelectedReplyBody) || (messageBody instanceof MessageBody.SystemMessageBody)) {
                            str = createContentDescription.messagePrefix;
                        } else {
                            if (!(messageBody instanceof MessageBody.FileBody) && !(messageBody instanceof MessageBody.ActionBody) && !(messageBody instanceof MessageBody.TransactionBody) && !(messageBody instanceof MessageBody.ActivityItemTransactionBody) && !messageBody.equals(unknownBody)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            str = createContentDescription.messageDescription;
                        }
                        if (z) {
                            str2 = ((MessageBody.TextBody) messageBody).text;
                        } else if (messageBody instanceof MessageBody.SystemMessageBody) {
                            str2 = ((MessageBody.SystemMessageBody) messageBody).text;
                        } else if (messageBody instanceof MessageBody.SelectedReplyBody) {
                            str2 = ((MessageBody.SelectedReplyBody) messageBody).reply.text;
                        } else {
                            if (!(messageBody instanceof MessageBody.FileBody) && !(messageBody instanceof MessageBody.ActionBody) && !(messageBody instanceof MessageBody.TransactionBody) && !(messageBody instanceof MessageBody.ActivityItemTransactionBody) && !messageBody.equals(unknownBody)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            str2 = null;
                        }
                        androidAccessibilityManager2.announceForAccessibility(CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str, str2}), androidStringManager.get(R.string.support_chat_a11y_announce_enumeration_comma), null, null, 0, null, null, 62));
                    }
                }
                return Unit.INSTANCE;
            case 5:
                InviteErrorPresenter inviteErrorPresenter = (InviteErrorPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) inviteErrorPresenter.navigator;
                ChatSurveyUnavailableViewEvent chatSurveyUnavailableViewEvent = (ChatSurveyUnavailableViewEvent) obj;
                if (chatSurveyUnavailableViewEvent instanceof ChatSurveyUnavailableViewEvent.Retry) {
                    screenNavigator2.goTo(((RealSupportNavigator) inviteErrorPresenter.analytics).startSupportSurvey(((SupportChatScreens.SupportChatDialogs.ChatSurveyUnavailable) inviteErrorPresenter.args).surveyToken));
                } else {
                    if (!Intrinsics.areEqual(chatSurveyUnavailableViewEvent, ChatSurveyUnavailableViewEvent.Cancel.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator2.goTo(back);
                }
                return Unit.INSTANCE;
            case 6:
                InviteErrorPresenter inviteErrorPresenter2 = (InviteErrorPresenter) obj2;
                SupportChatScreens.FlowScreen.ChatTransactionPicker chatTransactionPicker = (SupportChatScreens.FlowScreen.ChatTransactionPicker) inviteErrorPresenter2.args;
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) inviteErrorPresenter2.navigator;
                TransactionPickerViewEvent transactionPickerViewEvent = (TransactionPickerViewEvent) obj;
                if (Intrinsics.areEqual(transactionPickerViewEvent, TransactionPickerViewEvent.ExitFlow.INSTANCE)) {
                    screenNavigator3.giveAnswer(chatTransactionPicker.question, ChatTransactionPickerResult.Failure.INSTANCE);
                } else {
                    if (!(transactionPickerViewEvent instanceof TransactionPickerViewEvent.SelectTransaction)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator3.giveAnswer(chatTransactionPicker.question, new ChatTransactionPickerResult.Success(((TransactionPickerViewEvent.SelectTransaction) transactionPickerViewEvent).token));
                }
                return Unit.INSTANCE;
            case 7:
                TaxReturnsPresenter taxReturnsPresenter2 = (TaxReturnsPresenter) obj2;
                RealScreenshotManager realScreenshotManager = (RealScreenshotManager) taxReturnsPresenter2.args;
                SupportScreens.ScreenshotScreen.ScreenshotConfirmScreen screenshotConfirmScreen = (SupportScreens.ScreenshotScreen.ScreenshotConfirmScreen) taxReturnsPresenter2.taxesDocumentsTaxReturnsDataProvider;
                if (!Intrinsics.areEqual((ScreenshotConfirmViewEvent$Confirm) obj, ScreenshotConfirmViewEvent$Confirm.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Analytics analytics2 = (Analytics) taxReturnsPresenter2.router;
                SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs = screenshotConfirmScreen.screenshotArgs;
                analytics2.track(new CustomerSupportCaptureStart(screenshotArgs.flowToken, screenshotArgs.screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(screenshotArgs.trigger)), null);
                realScreenshotManager.startScreenshotSession();
                realScreenshotManager.showScreenshotControls(screenshotConfirmScreen.screenshotArgs);
                ((BetterNavigator.ScreenNavigator) taxReturnsPresenter2.navigator).goTo(back);
                return Unit.INSTANCE;
            case 8:
                if (Intrinsics.areEqual((FullScreenActivityViewEvent$Exit) obj, fullScreenActivityViewEvent$Exit)) {
                    ((BetterNavigator.ScreenNavigator) ((LocalHomePresenter) obj2).navigator).goTo(back);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 9:
                ErrorPresenter errorPresenter = (ErrorPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator4 = errorPresenter.navigator;
                SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen supportArticleIncidentsSheetScreen = (SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen) errorPresenter.args;
                SupportArticleIncidentsSheetViewEvent supportArticleIncidentsSheetViewEvent = (SupportArticleIncidentsSheetViewEvent) obj;
                if (Intrinsics.areEqual(supportArticleIncidentsSheetViewEvent, SupportArticleIncidentsSheetViewEvent.Close.INSTANCE)) {
                    screenNavigator4.giveAnswer(supportArticleIncidentsSheetScreen.question, SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.Result.DISMISSED);
                } else {
                    if (!(supportArticleIncidentsSheetViewEvent instanceof SupportArticleIncidentsSheetViewEvent.IncidentNotificationClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    SupportNotification.Trigger trigger = ((SupportArticleIncidentsSheetViewEvent.IncidentNotificationClicked) supportArticleIncidentsSheetViewEvent).trigger;
                    if (!(trigger instanceof SupportNotification.Trigger.Incident)) {
                        a$$ExternalSyntheticBUOutline0.m$3("Unsupported trigger.");
                        return null;
                    }
                    screenNavigator4.giveAnswer(supportArticleIncidentsSheetScreen.question, SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.Result.NAVIGATED);
                    screenNavigator4.goTo(new SupportScreens.FlowScreens.SupportIncidentDetailsScreen(supportArticleIncidentsSheetScreen.data, ((SupportNotification.Trigger.Incident) trigger).id, true, SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source.NODE));
                }
                return Unit.INSTANCE;
            case 10:
                if (((SupportFlowCheckConnectionViewEvent$Close) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ErrorPresenter errorPresenter2 = (ErrorPresenter) obj2;
                boolean z2 = ((SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen) errorPresenter2.args).handleCloseNavigation;
                BetterNavigator.ScreenNavigator screenNavigator5 = errorPresenter2.navigator;
                if (z2) {
                    screenNavigator5.goTo(back);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, screenNavigator5);
                }
                return Unit.INSTANCE;
            case 11:
                ErrorPresenter errorPresenter3 = (ErrorPresenter) obj2;
                SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen supportHomeContactOptionsSheetScreen = (SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen) errorPresenter3.args;
                BetterNavigator.ScreenNavigator screenNavigator6 = errorPresenter3.navigator;
                SupportHomeContactOptionsSheetEvents supportHomeContactOptionsSheetEvents = (SupportHomeContactOptionsSheetEvents) obj;
                if (Intrinsics.areEqual(supportHomeContactOptionsSheetEvents, SupportHomeContactOptionsSheetEvents.ChatClicked.INSTANCE)) {
                    screenNavigator6.giveAnswer(supportHomeContactOptionsSheetScreen.question, SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult.Chat.INSTANCE);
                } else if (Intrinsics.areEqual(supportHomeContactOptionsSheetEvents, SupportHomeContactOptionsSheetEvents.PhoneClicked.INSTANCE)) {
                    screenNavigator6.giveAnswer(supportHomeContactOptionsSheetScreen.question, SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult.Phone.INSTANCE);
                } else if (Intrinsics.areEqual(supportHomeContactOptionsSheetEvents, SupportHomeContactOptionsSheetEvents.MoreContactOptionsClicked.INSTANCE)) {
                    screenNavigator6.goTo(new SupportScreens.FlowScreens.ArticleScreen(new SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken("SUPPORT_CONTACT_DETAILS"), supportHomeContactOptionsSheetScreen.data, false, 28));
                } else {
                    if (!Intrinsics.areEqual(supportHomeContactOptionsSheetEvents, SupportHomeContactOptionsSheetEvents.DismissSheet.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator6.goTo(back);
                }
                return Unit.INSTANCE;
            case 12:
                if (Intrinsics.areEqual((SupportLoadClientScenarioEvent$GoBack) obj, SupportLoadClientScenarioEvent$GoBack.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj2).navigator).goTo(back);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 13:
                TaxReturnsPresenter taxReturnsPresenter3 = (TaxReturnsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) taxReturnsPresenter3.navigator;
                Analytics analytics3 = (Analytics) taxReturnsPresenter3.args;
                SupportScreens.SupportSheets.SupportTransactionConfirmationSheet supportTransactionConfirmationSheet = (SupportScreens.SupportSheets.SupportTransactionConfirmationSheet) taxReturnsPresenter3.router;
                SupportTransactionConfirmationViewEvent supportTransactionConfirmationViewEvent = (SupportTransactionConfirmationViewEvent) obj;
                if (Intrinsics.areEqual(supportTransactionConfirmationViewEvent, SupportTransactionConfirmationViewEvent.YesClicked.INSTANCE)) {
                    analytics3.track(new CustomerSupportFullTransactionPickerStart(supportTransactionConfirmationSheet.data.flowToken, FullTransactionPickerOrigin.ARTICLE), null);
                    screenNavigator7.giveAnswer(supportTransactionConfirmationSheet.question, SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult.Yes.INSTANCE);
                } else {
                    if (!Intrinsics.areEqual(supportTransactionConfirmationViewEvent, SupportTransactionConfirmationViewEvent.NoClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    analytics3.track(new CustomerSupportContactSubmitTransaction(supportTransactionConfirmationSheet.data.flowToken), null);
                    screenNavigator7.giveAnswer(supportTransactionConfirmationSheet.question, SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult.No.INSTANCE);
                }
                return Unit.INSTANCE;
            case 14:
                WorkHomePresenter workHomePresenter2 = (WorkHomePresenter) obj2;
                TapToPayErrorDialogScreen tapToPayErrorDialogScreen = (TapToPayErrorDialogScreen) workHomePresenter2.youPresenter;
                BetterNavigator.ScreenNavigator screenNavigator8 = (BetterNavigator.ScreenNavigator) workHomePresenter2.payPresenter;
                int ordinal = ((TapToPayErrorDialogViewEvent) obj).action.ordinal();
                if (ordinal == 0) {
                    screenNavigator8.goTo(RealSupportNavigator.startSupportFlow$default((RealSupportNavigator) workHomePresenter2.shiftSection2Presenter, "TTP_TROUBLESHOOTING_ANDROID", null, tapToPayErrorDialogScreen.getExitScreen(), SupportNavigator$Source.CARD, null, null, 102));
                } else if (ordinal == 1) {
                    screenNavigator8.goTo(back);
                } else if (ordinal == 2) {
                    screenNavigator8.goTo(tapToPayErrorDialogScreen.getExitScreen());
                } else {
                    if (ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((IntentLauncher) workHomePresenter2.titleBarPresenter).launchSettings();
                    screenNavigator8.goTo(back);
                }
                return Unit.INSTANCE;
            case 15:
                if (Intrinsics.areEqual((TapToPayErrorViewEvent$Close) obj, TapToPayErrorViewEvent$Close.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj2).navigator).goTo(back);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 16:
                TaxReturnsPresenter taxReturnsPresenter4 = (TaxReturnsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator9 = (BetterNavigator.ScreenNavigator) taxReturnsPresenter4.navigator;
                TapToPayFirstTimeScreenViewEvent tapToPayFirstTimeScreenViewEvent = (TapToPayFirstTimeScreenViewEvent) obj;
                if (Intrinsics.areEqual(tapToPayFirstTimeScreenViewEvent, TapToPayFirstTimeScreenViewEvent.Close.INSTANCE)) {
                    screenNavigator9.goTo(back);
                } else if (Intrinsics.areEqual(tapToPayFirstTimeScreenViewEvent, TapToPayFirstTimeScreenViewEvent.Next.INSTANCE)) {
                    screenNavigator9.goTo(new TapToPayPaymentScreen(((TapToPayFirstTimeScreen) taxReturnsPresenter4.router).initiatorNotes));
                }
                return Unit.INSTANCE;
            case 17:
                if (((TaxesAppletTileEvent$TaxesAppletOnClickTile) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj2;
                ((Analytics) shareSheetPresenter.analytics).track(new TaxesHubViewTap(), null);
                ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) shareSheetPresenter.profileManager)).submitSelectItemEvent(ItemId.TAXES.INSTANCE, null, MoneySelectAction.TAP);
                RealRouter realRouter = (RealRouter) shareSheetPresenter.navigator;
                ClientRoute.ViewTaxesHub viewTaxesHub = new ClientRoute.ViewTaxesHub();
                RoutingParams routingParams = new RoutingParams(null, null, RealMoneyNavigatorHelper.moneyTabScreen(), null, null, null, 503);
                realRouter.getClass();
                realRouter.clientRouteRouter.route(viewTaxesHub, routingParams);
                return Unit.INSTANCE;
            case 18:
                TaxMenuSheetViewEvent$MenuClick taxMenuSheetViewEvent$MenuClick = (TaxMenuSheetViewEvent$MenuClick) obj;
                if (taxMenuSheetViewEvent$MenuClick != null) {
                    ((ErrorPresenter) obj2).navigator.goTo(new Finish(taxMenuSheetViewEvent$MenuClick.taxMenuItem));
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 19:
                TaxReturnsPresenter taxReturnsPresenter5 = (TaxReturnsPresenter) obj2;
                TaxReturnsEvent taxReturnsEvent = (TaxReturnsEvent) obj;
                if (Intrinsics.areEqual(taxReturnsEvent, TaxReturnsEvent.GoBack.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) taxReturnsPresenter5.navigator);
                } else {
                    if (!(taxReturnsEvent instanceof TaxReturnsEvent.RouteToDeepLink)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    TaxReturnsScreen taxReturnsScreen = (TaxReturnsScreen) taxReturnsPresenter5.args;
                    RoutingParams routingParams2 = new RoutingParams(taxReturnsScreen, null, taxReturnsScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502);
                    RealRouter realRouter2 = (RealRouter) taxReturnsPresenter5.router;
                    ClientRoute.ViewTaxesWebApp viewTaxesWebApp = new ClientRoute.ViewTaxesWebApp(ClientRoute.ViewTaxesWebApp.spec, ClientRoute.ViewTaxesWebApp.deepLinkSpecs, null, ((TaxReturnsEvent.RouteToDeepLink) taxReturnsEvent).deeplink);
                    realRouter2.getClass();
                    realRouter2.clientRouteRouter.route(viewTaxesWebApp, routingParams2);
                }
                return Unit.INSTANCE;
            case 20:
                TaxReturnsPresenter taxReturnsPresenter6 = (TaxReturnsPresenter) obj2;
                if (!Intrinsics.areEqual((TaxTooltipEvent$TooltipDismissed) obj, TaxTooltipEvent$TooltipDismissed.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((RealTaxDesktopTooltipPreference) taxReturnsPresenter6.args).desktopTooltipPreference.set(true);
                NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) taxReturnsPresenter6.navigator);
                return Unit.INSTANCE;
            case 21:
                TaxWebBridgeDialogViewEvent$ButtonClick taxWebBridgeDialogViewEvent$ButtonClick = (TaxWebBridgeDialogViewEvent$ButtonClick) obj;
                if (taxWebBridgeDialogViewEvent$ButtonClick != null) {
                    ((ErrorPresenter) obj2).navigator.goTo(new Finish(taxWebBridgeDialogViewEvent$ButtonClick.button));
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 22:
                if (!Intrinsics.areEqual((ThreeDsViewEvent$Exit) obj, ThreeDsViewEvent$Exit.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ThreeDsPresenter threeDsPresenter = (ThreeDsPresenter) obj2;
                threeDsPresenter.navigator.goTo(threeDsPresenter.args.blockersData.exitScreen);
                return Unit.INSTANCE;
            case 23:
                if (!Intrinsics.areEqual((FullScreenActivityViewEvent$Exit) obj, fullScreenActivityViewEvent$Exit)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                UnifiedActivityPickerBlockerPresenter unifiedActivityPickerBlockerPresenter = (UnifiedActivityPickerBlockerPresenter) obj2;
                unifiedActivityPickerBlockerPresenter.navigator.goTo(unifiedActivityPickerBlockerPresenter.args.blockersData.exitScreen);
                return Unit.INSTANCE;
            case 24:
                BetterNavigator.ScreenNavigator screenNavigator10 = ((ErrorPresenter) obj2).navigator;
                BalanceBasedAddCashDisabledDialogViewEvent balanceBasedAddCashDisabledDialogViewEvent = (BalanceBasedAddCashDisabledDialogViewEvent) obj;
                if (Intrinsics.areEqual(balanceBasedAddCashDisabledDialogViewEvent, BalanceBasedAddCashDisabledDialogViewEvent.NegativeButtonClick.INSTANCE) || Intrinsics.areEqual(balanceBasedAddCashDisabledDialogViewEvent, BalanceBasedAddCashDisabledDialogViewEvent.OnBack.INSTANCE)) {
                    screenNavigator10.goTo(back);
                } else {
                    if (!Intrinsics.areEqual(balanceBasedAddCashDisabledDialogViewEvent, BalanceBasedAddCashDisabledDialogViewEvent.PositiveButtonClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator10.goTo(new Finish(AlertDialogResult.POSITIVE));
                }
                return Unit.INSTANCE;
            case 25:
                InstrumentDetailsPresenter instrumentDetailsPresenter = (InstrumentDetailsPresenter) obj2;
                FlowStarter flowStarter = (FlowStarter) instrumentDetailsPresenter.flowStarter;
                Analytics analytics4 = instrumentDetailsPresenter.analytics;
                InstrumentDetailsScreen instrumentDetailsScreen = (InstrumentDetailsScreen) instrumentDetailsPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator11 = instrumentDetailsPresenter.navigator;
                InstrumentDetailsViewEvent instrumentDetailsViewEvent = (InstrumentDetailsViewEvent) obj;
                if (Intrinsics.areEqual(instrumentDetailsViewEvent, InstrumentDetailsViewEvent.Cancel.INSTANCE)) {
                    screenNavigator11.goTo(back);
                } else if (Intrinsics.areEqual(instrumentDetailsViewEvent, InstrumentDetailsViewEvent.Remove.INSTANCE)) {
                    screenNavigator11.goTo(back);
                    CashInstrumentType instrumentType = instrumentDetailsScreen.getInstrumentType();
                    String instrumentToken = instrumentDetailsScreen.getInstrumentToken();
                    instrumentType.getClass();
                    instrumentToken.getClass();
                    analytics4.track(new InstrumentLinkRemove(instrumentToken, NavArgumentKt.toCdfInstrumentType(instrumentType)), null);
                    JobKt.launch$default((CoroutineScope) instrumentDetailsPresenter.scope, (CoroutineContext) instrumentDetailsPresenter.ioDispatcher, null, new ExoPlayerVideoView.AnonymousClass2(instrumentDetailsPresenter, continuation2, i4), 2);
                } else if (Intrinsics.areEqual(instrumentDetailsViewEvent, InstrumentDetailsViewEvent.Replace.INSTANCE)) {
                    NavArgumentKt.logInstrumentLinkReplace(analytics4, instrumentDetailsScreen.getInstrumentType(), instrumentDetailsScreen.getInstrumentToken());
                    screenNavigator11.goTo(((RealFlowStarter) flowStarter).startProfileLinkingFlow(instrumentDetailsScreen.getParentScreen(), instrumentDetailsScreen.getInstrumentType(), instrumentDetailsScreen.getInstrumentToken()));
                } else {
                    if (!Intrinsics.areEqual(instrumentDetailsViewEvent, InstrumentDetailsViewEvent.SetDefault.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator11.goTo(new SetDefaultInstrumentScreen(FlowStarter.startFlow$default(flowStarter, BlockersData.Flow.CLIENT_SCENARIO, LinkedAccountsScreen.INSTANCE, null, ClientScenario.PROFILE, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO), instrumentDetailsScreen.getInstrumentToken()));
                }
                return Unit.INSTANCE;
            case 26:
                WorkHomePresenter workHomePresenter3 = (WorkHomePresenter) obj2;
                FlowStarter flowStarter2 = (FlowStarter) workHomePresenter3.titleBarPresenter;
                Analytics analytics5 = (Analytics) workHomePresenter3.shiftSection2Presenter;
                InstrumentLinkingOptionsScreen instrumentLinkingOptionsScreen = (InstrumentLinkingOptionsScreen) workHomePresenter3.payPresenter;
                BetterNavigator.ScreenNavigator screenNavigator12 = (BetterNavigator.ScreenNavigator) workHomePresenter3.youPresenter;
                InstrumentLinkingOptionsViewEvent instrumentLinkingOptionsViewEvent = (InstrumentLinkingOptionsViewEvent) obj;
                if (Intrinsics.areEqual(instrumentLinkingOptionsViewEvent, InstrumentLinkingOptionsViewEvent.Close.INSTANCE)) {
                    screenNavigator12.goTo(back);
                } else if (instrumentLinkingOptionsViewEvent instanceof InstrumentLinkingOptionsViewEvent.LinkClick) {
                    InstrumentLinkingOptionsScreen.Mode mode = instrumentLinkingOptionsScreen.mode;
                    if (mode instanceof InstrumentLinkingOptionsScreen.Mode.Navigation) {
                        CashInstrumentType cashInstrumentType = ((InstrumentLinkingOptionsViewEvent.LinkClick) instrumentLinkingOptionsViewEvent).cashInstrumentType;
                        analytics5.track(new InstrumentLinkInitiate(null, cashInstrumentType != null ? NavArgumentKt.toCdfInstrumentType(cashInstrumentType) : null, 4), null);
                        startProfileLinkingFlow = ((RealFlowStarter) flowStarter2).startProfileLinkingFlow(((InstrumentLinkingOptionsScreen.Mode.Navigation) mode).exitScreen, cashInstrumentType, (String) null);
                        screenNavigator12.goTo(startProfileLinkingFlow);
                    } else {
                        if (!(mode instanceof InstrumentLinkingOptionsScreen.Mode.Question)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator12.giveAnswer(((InstrumentLinkingOptionsScreen.Mode.Question) mode).question, new InstrumentLinkingOption.Link(((InstrumentLinkingOptionsViewEvent.LinkClick) instrumentLinkingOptionsViewEvent).cashInstrumentType));
                    }
                } else if (instrumentLinkingOptionsViewEvent instanceof InstrumentLinkingOptionsViewEvent.ReplaceClick) {
                    InstrumentLinkingOptionsScreen.Mode mode2 = instrumentLinkingOptionsScreen.mode;
                    if (mode2 instanceof InstrumentLinkingOptionsScreen.Mode.Navigation) {
                        a$$ExternalSyntheticBUOutline0.m$1("Navigation is not supported for ReplaceClick!");
                        return null;
                    }
                    if (!(mode2 instanceof InstrumentLinkingOptionsScreen.Mode.Question)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator12.giveAnswer(((InstrumentLinkingOptionsScreen.Mode.Question) mode2).question, new InstrumentLinkingOption.Replace(((InstrumentLinkingOptionsViewEvent.ReplaceClick) instrumentLinkingOptionsViewEvent).cashInstrumentType));
                } else {
                    if (!(instrumentLinkingOptionsViewEvent instanceof InstrumentLinkingOptionsViewEvent.ReplaceInstrumentClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    InstrumentLinkingOptionsScreen.Mode mode3 = instrumentLinkingOptionsScreen.mode;
                    if (mode3 instanceof InstrumentLinkingOptionsScreen.Mode.Navigation) {
                        InstrumentLinkingOptionsViewEvent.ReplaceInstrumentClick replaceInstrumentClick = (InstrumentLinkingOptionsViewEvent.ReplaceInstrumentClick) instrumentLinkingOptionsViewEvent;
                        String str5 = replaceInstrumentClick.instrumentToken;
                        CashInstrumentType cashInstrumentType2 = replaceInstrumentClick.cashInstrumentType;
                        NavArgumentKt.logInstrumentLinkReplace(analytics5, cashInstrumentType2, str5);
                        screenNavigator12.goTo(((RealFlowStarter) flowStarter2).startProfileLinkingFlow(((InstrumentLinkingOptionsScreen.Mode.Navigation) mode3).exitScreen, cashInstrumentType2, str5));
                    } else {
                        if (!(mode3 instanceof InstrumentLinkingOptionsScreen.Mode.Question)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        InstrumentLinkingOptionsViewEvent.ReplaceInstrumentClick replaceInstrumentClick2 = (InstrumentLinkingOptionsViewEvent.ReplaceInstrumentClick) instrumentLinkingOptionsViewEvent;
                        screenNavigator12.giveAnswer(((InstrumentLinkingOptionsScreen.Mode.Question) mode3).question, new InstrumentLinkingOption.ReplaceInstrument(replaceInstrumentClick2.cashInstrumentType, replaceInstrumentClick2.instrumentToken));
                    }
                }
                return Unit.INSTANCE;
            case 27:
                ((BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj2).navigator).goTo(LinkedAccountsScreen.INSTANCE);
                return Unit.INSTANCE;
            case 28:
                WorkHomePresenter workHomePresenter4 = (WorkHomePresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator13 = (BetterNavigator.ScreenNavigator) workHomePresenter4.youPresenter;
                RecurringReloadsDismissDialogScreen recurringReloadsDismissDialogScreen = (RecurringReloadsDismissDialogScreen) workHomePresenter4.payPresenter;
                RecurringReloadsDismissDialogViewEvent recurringReloadsDismissDialogViewEvent = (RecurringReloadsDismissDialogViewEvent) obj;
                if (Intrinsics.areEqual(recurringReloadsDismissDialogViewEvent, RecurringReloadsDismissDialogViewEvent.ConfirmClick.INSTANCE)) {
                    BlockersData blockersData2 = recurringReloadsDismissDialogScreen.blockersData;
                    if (blockersData2 != null) {
                        ((BlockerFlowListener) workHomePresenter4.titleBarPresenter).onFlowCancelled(blockersData2);
                    }
                    if (recurringReloadsDismissDialogScreen.reloadType == RecurringReloadOptionScreen.ReloadType.BALANCE_BASED && (blockersData = recurringReloadsDismissDialogScreen.blockersData) != null && (str3 = blockersData.flowToken) != null) {
                        ((Analytics) workHomePresenter4.shiftSection2Presenter).track(new BalanceBasedAddCashEditAmountClose(str3), null);
                    }
                    screenNavigator13.goTo(recurringReloadsDismissDialogScreen.exitScreen);
                } else {
                    if (!Intrinsics.areEqual(recurringReloadsDismissDialogViewEvent, RecurringReloadsDismissDialogViewEvent.CancelClick.INSTANCE) && !Intrinsics.areEqual(recurringReloadsDismissDialogViewEvent, RecurringReloadsDismissDialogViewEvent.OnBack.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator13.goTo(back);
                }
                return Unit.INSTANCE;
            default:
                if (!Intrinsics.areEqual((SetDefaultInstrumentViewEvent$CloseClick) obj, SetDefaultInstrumentViewEvent$CloseClick.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SetDefaultInstrumentPresenter setDefaultInstrumentPresenter = (SetDefaultInstrumentPresenter) obj2;
                setDefaultInstrumentPresenter.navigator.goTo(((SetDefaultInstrumentScreen) setDefaultInstrumentPresenter.args).blockersData.exitScreen);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ChatView$30$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
    }
}
