package kotlinx.coroutines.flow;

import app.cash.zipline.Zipline;
import app.cash.zipline.internal.HostService$Companion$Adapter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Ready;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.session.backend.AuthenticatedState;
import com.squareup.cash.session.backend.OnboardedAccountStatus;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.storage.SessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1;
import com.squareup.cash.storage.StorageLinkState;
import com.squareup.cash.support.backend.real.RealSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.support.chat.backend.real.ChatLastLoadedMessageToken;
import com.squareup.cash.support.chat.backend.real.ChatLastReadMessageToken;
import com.squareup.cash.support.chat.backend.real.RealRecordedMessagesStore;
import com.squareup.cash.support.chat.backend.real.RealRecordedMessagesStore$messages$$inlined$filter$1$2$1;
import com.squareup.cash.support.chat.backend.real.RealRecordedMessagesStore$messages$$inlined$map$1$2$1;
import com.squareup.cash.support.chat.backend.real.RecordedTranscript;
import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1;
import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1;
import com.squareup.cash.tabprovider.real.TabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.HostActivityDataBridge$special$$inlined$map$1$2$1;
import com.squareup.cash.ui.MainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.ui.MainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.ui.MainContainerDelegate$special$$inlined$map$1$2$1;
import com.squareup.cash.ui.qrcodes.widget.QrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository$special$$inlined$map$1$2$1;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository$special$$inlined$map$3$2$1;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1;
import com.squareup.preferences.values.MoneyTabCardIntroState;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowKt__MergeKt$flattenConcat$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_flow;

    public /* synthetic */ FlowKt__MergeKt$flattenConcat$1$1(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1 sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1;
        int i;
        RealSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i2;
        RealRecordedMessagesStore$messages$$inlined$filter$1$2$1 realRecordedMessagesStore$messages$$inlined$filter$1$2$1;
        int i3;
        RealRecordedMessagesStore$messages$$inlined$map$1$2$1 realRecordedMessagesStore$messages$$inlined$map$1$2$1;
        int i4;
        SupportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1 supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1;
        int i5;
        Object obj2;
        SupportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1 supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1;
        int i6;
        TabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1 tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1;
        int i7;
        HostActivityDataBridge$special$$inlined$map$1$2$1 hostActivityDataBridge$special$$inlined$map$1$2$1;
        int i8;
        MainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1 mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i9;
        MainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1 mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1;
        int i10;
        MainContainerDelegate$special$$inlined$map$1$2$1 mainContainerDelegate$special$$inlined$map$1$2$1;
        int i11;
        QrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1 qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i12;
        RealCardAppletTileRepository$special$$inlined$map$1$2$1 realCardAppletTileRepository$special$$inlined$map$1$2$1;
        int i13;
        RealCardAppletTileRepository$special$$inlined$map$3$2$1 realCardAppletTileRepository$special$$inlined$map$3$2$1;
        int i14;
        CardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1 cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1;
        int i15;
        FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1;
        int i16;
        int i17 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_flow;
        switch (i17) {
            case 0:
                break;
            case 1:
                if (continuation instanceof SessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1) {
                    sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1 = (SessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1) continuation;
                    int i18 = sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1.label;
                    if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                        sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1.label = i18 - PKIFailureInfo.systemUnavail;
                        Object obj3 = sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            StorageLinkState storageLinkState = (StorageLinkState) ((Pair) obj).second;
                            sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(storageLinkState, sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1 = new SessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1(this, continuation);
                Object obj32 = sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sessionManagerKt$launchStorageLinkStateMachine$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
            case 2:
                if (continuation instanceof RealSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (RealSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i19 = realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                        realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i19 - PKIFailureInfo.systemUnavail;
                        Object obj4 = realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            if (obj instanceof OnboardedAccountStatus.Onboarded) {
                                realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new RealSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj42 = realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realSupportPhoneVerificationMonitor$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i2 != 0) {
                }
            case 3:
                if (continuation instanceof RealRecordedMessagesStore$messages$$inlined$filter$1$2$1) {
                    realRecordedMessagesStore$messages$$inlined$filter$1$2$1 = (RealRecordedMessagesStore$messages$$inlined$filter$1$2$1) continuation;
                    int i20 = realRecordedMessagesStore$messages$$inlined$filter$1$2$1.label;
                    if ((i20 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecordedMessagesStore$messages$$inlined$filter$1$2$1.label = i20 - PKIFailureInfo.systemUnavail;
                        Object obj5 = realRecordedMessagesStore$messages$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = realRecordedMessagesStore$messages$$inlined$filter$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            if (((RealRecordedMessagesStore.MessagesState) obj).loaded) {
                                realRecordedMessagesStore$messages$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realRecordedMessagesStore$messages$$inlined$filter$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                realRecordedMessagesStore$messages$$inlined$filter$1$2$1 = new RealRecordedMessagesStore$messages$$inlined$filter$1$2$1(this, continuation);
                Object obj52 = realRecordedMessagesStore$messages$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = realRecordedMessagesStore$messages$$inlined$filter$1$2$1.label;
                if (i3 != 0) {
                }
            case 4:
                if (continuation instanceof RealRecordedMessagesStore$messages$$inlined$map$1$2$1) {
                    realRecordedMessagesStore$messages$$inlined$map$1$2$1 = (RealRecordedMessagesStore$messages$$inlined$map$1$2$1) continuation;
                    int i21 = realRecordedMessagesStore$messages$$inlined$map$1$2$1.label;
                    if ((i21 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecordedMessagesStore$messages$$inlined$map$1$2$1.label = i21 - PKIFailureInfo.systemUnavail;
                        Object obj6 = realRecordedMessagesStore$messages$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realRecordedMessagesStore$messages$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            RealRecordedMessagesStore.MessagesState messagesState = (RealRecordedMessagesStore.MessagesState) obj;
                            RecordedTranscript recordedTranscript = new RecordedTranscript(messagesState.recordedMessages, messagesState.pagingStatus, messagesState.conversation);
                            realRecordedMessagesStore$messages$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(recordedTranscript, realRecordedMessagesStore$messages$$inlined$map$1$2$1) == coroutineSingletons5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                realRecordedMessagesStore$messages$$inlined$map$1$2$1 = new RealRecordedMessagesStore$messages$$inlined$map$1$2$1(this, continuation);
                Object obj62 = realRecordedMessagesStore$messages$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realRecordedMessagesStore$messages$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
            case 5:
                if (continuation instanceof SupportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1) {
                    supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1 = (SupportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1) continuation;
                    int i22 = supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1.label;
                    if ((i22 & PKIFailureInfo.systemUnavail) != 0) {
                        supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1.label = i22 - PKIFailureInfo.systemUnavail;
                        Object obj7 = supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            ChatLastLoadedMessageToken chatLastLoadedMessageToken = (ChatLastLoadedMessageToken) obj;
                            String str = chatLastLoadedMessageToken != null ? chatLastLoadedMessageToken.token : null;
                            obj2 = str != null ? str : null;
                            supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1) == coroutineSingletons6) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1 = new SupportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1(this, continuation);
                Object obj72 = supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = supportConversationPersistence$hasUnreadMessages$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
            case 6:
                if (continuation instanceof SupportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1) {
                    supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1 = (SupportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1) continuation;
                    int i23 = supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1.label;
                    if ((i23 & PKIFailureInfo.systemUnavail) != 0) {
                        supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1.label = i23 - PKIFailureInfo.systemUnavail;
                        Object obj8 = supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            ChatLastReadMessageToken chatLastReadMessageToken = (ChatLastReadMessageToken) obj;
                            String str2 = chatLastReadMessageToken != null ? chatLastReadMessageToken.token : null;
                            obj2 = str2 != null ? str2 : null;
                            supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(obj2, supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1) == coroutineSingletons7) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1 = new SupportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1(this, continuation);
                Object obj82 = supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = supportConversationPersistence$hasUnreadMessages$$inlined$map$2$2$1.label;
                if (i6 != 0) {
                }
            case 7:
                if (continuation instanceof TabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1) {
                    tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1 = (TabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1) continuation;
                    int i24 = tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1.label;
                    if ((i24 & PKIFailureInfo.systemUnavail) != 0) {
                        tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1.label = i24 - PKIFailureInfo.systemUnavail;
                        Object obj9 = tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            SessionState sessionState = (SessionState) obj;
                            SessionState.Authenticated authenticated = sessionState instanceof SessionState.Authenticated ? (SessionState.Authenticated) sessionState : null;
                            obj2 = authenticated != null ? ((AuthenticatedState) authenticated).getAccountToken() : null;
                            tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1) == coroutineSingletons8) {
                                break;
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1 = new TabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj92 = tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = tabProviderModule$Companion$provideTabProviderOnboardingWorker$1$setup$lambda$0$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
            case 8:
                if (continuation instanceof HostActivityDataBridge$special$$inlined$map$1$2$1) {
                    hostActivityDataBridge$special$$inlined$map$1$2$1 = (HostActivityDataBridge$special$$inlined$map$1$2$1) continuation;
                    int i25 = hostActivityDataBridge$special$$inlined$map$1$2$1.label;
                    if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                        hostActivityDataBridge$special$$inlined$map$1$2$1.label = i25 - PKIFailureInfo.systemUnavail;
                        Object obj10 = hostActivityDataBridge$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = hostActivityDataBridge$special$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            Zipline zipline = (Zipline) obj;
                            obj2 = zipline != null ? (ActivityDataBridge) Zipline.take$default(zipline, "activityDataBridge", new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 14)) : null;
                            hostActivityDataBridge$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, hostActivityDataBridge$special$$inlined$map$1$2$1) == coroutineSingletons9) {
                                break;
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                hostActivityDataBridge$special$$inlined$map$1$2$1 = new HostActivityDataBridge$special$$inlined$map$1$2$1(this, continuation);
                Object obj102 = hostActivityDataBridge$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = hostActivityDataBridge$special$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
            case 9:
                if (continuation instanceof MainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (MainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i26 = mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                        mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i26 - PKIFailureInfo.systemUnavail;
                        Object obj11 = mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            if (obj instanceof NavigationModel.Ready) {
                                mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons10) {
                                    break;
                                }
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj11);
                        }
                        break;
                    }
                }
                mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new MainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj112 = mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = mainContainerDelegate$6$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i9 != 0) {
                }
            case 10:
                if (continuation instanceof MainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1) {
                    mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1 = (MainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1) continuation;
                    int i27 = mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                    if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                        mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1.label = i27 - PKIFailureInfo.systemUnavail;
                        Object obj12 = mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            if (obj instanceof MainScreensViewModel$Ready) {
                                mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1) == coroutineSingletons11) {
                                    break;
                                }
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1 = new MainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj122 = mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = mainContainerDelegate$_init_$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                if (i10 != 0) {
                }
            case 11:
                if (continuation instanceof MainContainerDelegate$special$$inlined$map$1$2$1) {
                    mainContainerDelegate$special$$inlined$map$1$2$1 = (MainContainerDelegate$special$$inlined$map$1$2$1) continuation;
                    int i28 = mainContainerDelegate$special$$inlined$map$1$2$1.label;
                    if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                        mainContainerDelegate$special$$inlined$map$1$2$1.label = i28 - PKIFailureInfo.systemUnavail;
                        Object obj13 = mainContainerDelegate$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = mainContainerDelegate$special$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            Boolean valueOf = Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj).enabled());
                            mainContainerDelegate$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, mainContainerDelegate$special$$inlined$map$1$2$1) == coroutineSingletons12) {
                                break;
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj13);
                        }
                        break;
                    }
                }
                mainContainerDelegate$special$$inlined$map$1$2$1 = new MainContainerDelegate$special$$inlined$map$1$2$1(this, continuation);
                Object obj132 = mainContainerDelegate$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = mainContainerDelegate$special$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
            case 12:
                if (continuation instanceof QrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1) {
                    qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1 = (QrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i29 = qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                        qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1.label = i29 - PKIFailureInfo.systemUnavail;
                        Object obj14 = qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            Boolean valueOf2 = Boolean.valueOf(((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) obj).enabled());
                            qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf2, qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons13) {
                                break;
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1 = new QrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj142 = qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = qrWidgetRefreshApplicationWorker$work$2$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
            case 13:
                if (continuation instanceof RealCardAppletTileRepository$special$$inlined$map$1$2$1) {
                    realCardAppletTileRepository$special$$inlined$map$1$2$1 = (RealCardAppletTileRepository$special$$inlined$map$1$2$1) continuation;
                    int i30 = realCardAppletTileRepository$special$$inlined$map$1$2$1.label;
                    if ((i30 & PKIFailureInfo.systemUnavail) != 0) {
                        realCardAppletTileRepository$special$$inlined$map$1$2$1.label = i30 - PKIFailureInfo.systemUnavail;
                        Object obj15 = realCardAppletTileRepository$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = realCardAppletTileRepository$special$$inlined$map$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj15);
                            Boolean valueOf3 = Boolean.valueOf(((MoneyTabCardIntroState) obj).showIntroDialog);
                            realCardAppletTileRepository$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf3, realCardAppletTileRepository$special$$inlined$map$1$2$1) == coroutineSingletons14) {
                                break;
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj15);
                        }
                        break;
                    }
                }
                realCardAppletTileRepository$special$$inlined$map$1$2$1 = new RealCardAppletTileRepository$special$$inlined$map$1$2$1(this, continuation);
                Object obj152 = realCardAppletTileRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = realCardAppletTileRepository$special$$inlined$map$1$2$1.label;
                if (i13 != 0) {
                }
            case 14:
                if (continuation instanceof RealCardAppletTileRepository$special$$inlined$map$3$2$1) {
                    realCardAppletTileRepository$special$$inlined$map$3$2$1 = (RealCardAppletTileRepository$special$$inlined$map$3$2$1) continuation;
                    int i31 = realCardAppletTileRepository$special$$inlined$map$3$2$1.label;
                    if ((i31 & PKIFailureInfo.systemUnavail) != 0) {
                        realCardAppletTileRepository$special$$inlined$map$3$2$1.label = i31 - PKIFailureInfo.systemUnavail;
                        Object obj16 = realCardAppletTileRepository$special$$inlined$map$3$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = realCardAppletTileRepository$special$$inlined$map$3$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            AppletAvailabilityState appletAvailabilityState = ((List) obj) != null ? AppletAvailabilityState.AVAILABLE : AppletAvailabilityState.UNAVAILABLE;
                            realCardAppletTileRepository$special$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit(appletAvailabilityState, realCardAppletTileRepository$special$$inlined$map$3$2$1) == coroutineSingletons15) {
                                break;
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj16);
                        }
                        break;
                    }
                }
                realCardAppletTileRepository$special$$inlined$map$3$2$1 = new RealCardAppletTileRepository$special$$inlined$map$3$2$1(this, continuation);
                Object obj162 = realCardAppletTileRepository$special$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = realCardAppletTileRepository$special$$inlined$map$3$2$1.label;
                if (i14 != 0) {
                }
            case 15:
                if (continuation instanceof CardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1) {
                    cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1 = (CardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1) continuation;
                    int i32 = cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj17 = cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj17);
                            if (((SessionState) obj) instanceof SessionState.Authenticated) {
                                cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons16) {
                                    break;
                                }
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj17);
                        }
                        break;
                    }
                }
                cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1 = new CardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1(this, continuation);
                Object obj172 = cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = cardAppletWorker$setup$lambda$0$$inlined$filter$1$2$1.label;
                if (i15 != 0) {
                }
            default:
                if (continuation instanceof FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) {
                    flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 = (FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) continuation;
                    int i33 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj18 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            if (obj != null) {
                                flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label = 1;
                                if (flowCollector.emit(obj, flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) == coroutineSingletons17) {
                                    break;
                                }
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1(this, continuation);
                Object obj182 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label;
                if (i16 != 0) {
                }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(Flow flow, Continuation continuation) {
        FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1;
        int i;
        if (continuation instanceof FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = (FlowKt__MergeKt$flattenConcat$1$1$emit$1) continuation;
            int i2 = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowKt__MergeKt$flattenConcat$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = flowKt__MergeKt$flattenConcat$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowKt__MergeKt$flattenConcat$1$1$emit$1.label = 1;
                    if (FlowKt.emitAll(this.$this_flow, flow, flowKt__MergeKt$flattenConcat$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, continuation);
        Object obj2 = flowKt__MergeKt$flattenConcat$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
