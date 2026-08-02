package com.squareup.cash.ui;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import app.cash.redwood.treehouse.RealTreehouseApp;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.db2.payment.PendingPayment;
import com.squareup.cash.db2.payment.PendingTransfer;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.mooncake.compose_ui.components.LoadableContentKt$$ExternalSyntheticLambda11;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.storage.StorageLinkState;
import com.squareup.cash.treehouse.android.TreehouseModule$provideCashTreehouseAppFactory$1;
import com.squareup.cash.treehouse.platform.CashTreehouseAppFactory;
import com.squareup.cash.treehouse.platform.SerializersKt;
import com.squareup.cash.userjourneys.tracker.ActiveUserJourney;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.access.sync_values.PasswordInfo;
import com.squareup.protos.common.countries.Country;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.MatcherMatchResult;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.modules.SerialModuleImpl;
import okhttp3.Cache;
import okio.Path;
import papa.InteractionEngine;
import papa.InteractionEngine$sendEvent$realEventScope$1;
import papa.InteractionTrace;
import papa.InteractionTrace$Companion$$ExternalSyntheticLambda0;
import papa.InteractionTrigger;
import papa.MainThreadTriggerStack;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InteractionTrace interactionTrace$Companion$$ExternalSyntheticLambda0;
        List split$default;
        switch (this.$r8$classId) {
            case 0:
                SandboxedActivityContext sandboxedActivityContext = (SandboxedActivityContext) obj;
                int i = MainActivity.$r8$clinit;
                sandboxedActivityContext.getClass();
                return sandboxedActivityContext.viewContainerViewFactory;
            case 1:
                InteractionEngine$sendEvent$realEventScope$1 interactionEngine$sendEvent$realEventScope$1 = (InteractionEngine$sendEvent$realEventScope$1) obj;
                interactionEngine$sendEvent$realEventScope$1.getClass();
                InteractionEngine.RealRunningInteraction realRunningInteraction = (InteractionEngine.RealRunningInteraction) CollectionsKt.singleOrNull(CollectionsKt.toList(interactionEngine$sendEvent$realEventScope$1.this$0.runningInteractions));
                if (realRunningInteraction == null) {
                    Cache.Companion.m4319startInteractionSxA4cEA$default(interactionEngine$sendEvent$realEventScope$1, null, null, 7).recordEvent();
                } else {
                    realRunningInteraction.recordEvent();
                }
                return Unit.INSTANCE;
            case 2:
                InteractionEngine$sendEvent$realEventScope$1 interactionEngine$sendEvent$realEventScope$12 = (InteractionEngine$sendEvent$realEventScope$1) obj;
                interactionEngine$sendEvent$realEventScope$12.getClass();
                InteractionEngine.RealRunningInteraction realRunningInteraction2 = (InteractionEngine.RealRunningInteraction) CollectionsKt.singleOrNull(CollectionsKt.toList(interactionEngine$sendEvent$realEventScope$12.this$0.runningInteractions));
                if (realRunningInteraction2 == null) {
                    InteractionTrigger earliestInteractionTrigger = MainThreadTriggerStack.getEarliestInteractionTrigger();
                    if (earliestInteractionTrigger == null || (interactionTrace$Companion$$ExternalSyntheticLambda0 = earliestInteractionTrigger.takeOverInteractionTrace()) == null) {
                        int nanoTime = (int) (System.nanoTime() % 2147483647L);
                        SafeTrace.beginAsyncSection("Navigation", nanoTime);
                        interactionTrace$Companion$$ExternalSyntheticLambda0 = new InteractionTrace$Companion$$ExternalSyntheticLambda0("Navigation", nanoTime);
                    }
                    Cache.Companion.m4319startInteractionSxA4cEA$default(interactionEngine$sendEvent$realEventScope$12, MainThreadTriggerStack.getEarliestInteractionTrigger(), interactionTrace$Companion$$ExternalSyntheticLambda0, 4).finish();
                } else {
                    realRunningInteraction2.finish();
                }
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj;
                str.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str);
                forLanguageTag.getClass();
                return forLanguageTag;
            case 4:
                Locale locale = (Locale) obj;
                locale.getClass();
                String languageTag = locale.toLanguageTag();
                languageTag.getClass();
                return languageTag;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                return Country.valueOf(str2);
            case 6:
                Country country = (Country) obj;
                country.getClass();
                return country.name();
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                Locale forLanguageTag2 = Locale.forLanguageTag(str3);
                forLanguageTag2.getClass();
                return forLanguageTag2;
            case 8:
                Locale locale2 = (Locale) obj;
                locale2.getClass();
                String languageTag2 = locale2.toLanguageTag();
                languageTag2.getClass();
                return languageTag2;
            case 9:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                boolean booleanValue = ((Boolean) ((Pair) animatedContentTransitionScopeImpl.getTargetState()).second).booleanValue();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new LoadableContentKt$$ExternalSyntheticLambda11(booleanValue, 0)), EnterExitTransitionKt.slideOutHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new LoadableContentKt$$ExternalSyntheticLambda11(booleanValue, 1)));
            case 10:
                return Boolean.valueOf(((SessionState) obj) instanceof SessionState.Authenticated);
            case 11:
                PendingPayment pendingPayment = (PendingPayment) obj;
                pendingPayment.getClass();
                return pendingPayment.external_id;
            case 12:
                PendingTransfer pendingTransfer = (PendingTransfer) obj;
                pendingTransfer.getClass();
                return pendingTransfer.external_id;
            case 13:
                PendingTransfer pendingTransfer2 = (PendingTransfer) obj;
                pendingTransfer2.getClass();
                return pendingTransfer2.external_id;
            case 14:
                String str4 = (String) obj;
                str4.getClass();
                if (str4.length() == 0) {
                    return EmptySet.INSTANCE;
                }
                split$default = StringsKt__StringsKt.split$default(str4, new String[]{","}, false, 0, 6, null);
                return CollectionsKt.toSet(split$default);
            case 15:
                Set set = (Set) obj;
                set.getClass();
                return set.isEmpty() ? "" : CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62);
            case 16:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    return AppletAvailabilityState.LOADING;
                }
                if (bool.equals(Boolean.TRUE)) {
                    return AppletAvailabilityState.AVAILABLE;
                }
                if (bool.equals(Boolean.FALSE)) {
                    return AppletAvailabilityState.UNAVAILABLE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 17:
                PasswordInfo passwordInfo = (PasswordInfo) obj;
                if (passwordInfo != null) {
                    return passwordInfo.version;
                }
                return null;
            case 18:
                SessionState sessionState = (SessionState) obj;
                sessionState.getClass();
                return Boolean.valueOf(sessionState instanceof SessionState.Authenticated);
            case 19:
                StorageLinkState storageLinkState = (StorageLinkState) obj;
                storageLinkState.getClass();
                Timber.Forest forest = Timber.Forest;
                StorageLink storageLink = storageLinkState.link;
                forest.i("ActiveStorageLink: mapState received: " + storageLink, new Object[0]);
                return storageLink;
            case 20:
                Path path = (Path) obj;
                path.getClass();
                return path.name();
            case 21:
                TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$1 = (TreehouseModule$provideCashTreehouseAppFactory$1) obj;
                treehouseModule$provideCashTreehouseAppFactory$1.getClass();
                CashTreehouseAppFactory cashTreehouseAppFactory = (CashTreehouseAppFactory) treehouseModule$provideCashTreehouseAppFactory$1.appFactory.getValue();
                RealTreehouseApp.Factory factory = cashTreehouseAppFactory.treehouseAppFactory;
                if (factory != null) {
                    SizeMode$EnumUnboxingLocalUtility.m(factory);
                }
                cashTreehouseAppFactory.treehouseAppFactory = null;
                cashTreehouseAppFactory.platformServiceFactory = null;
                cashTreehouseAppFactory.eventListenerFactory = null;
                cashTreehouseAppFactory.launcherFactory = null;
                return Unit.INSTANCE;
            case 22:
                RealTreehouseApp realTreehouseApp = (RealTreehouseApp) obj;
                realTreehouseApp.getClass();
                realTreehouseApp.stop();
                return Unit.INSTANCE;
            case 23:
                JsonBuilder jsonBuilder = (JsonBuilder) obj;
                jsonBuilder.getClass();
                jsonBuilder.useArrayPolymorphism = true;
                jsonBuilder.ignoreUnknownKeys = true;
                jsonBuilder.allowStructuredMapKeys = true;
                SerialModuleImpl serialModuleImpl = SerializersKt.treehouseSerializersModule;
                serialModuleImpl.getClass();
                jsonBuilder.serializersModule = serialModuleImpl;
                return Unit.INSTANCE;
            case 24:
                ActiveUserJourney activeUserJourney = (ActiveUserJourney) obj;
                activeUserJourney.getClass();
                return activeUserJourney.name.getLabel();
            case 25:
                ActiveUserJourney activeUserJourney2 = (ActiveUserJourney) obj;
                activeUserJourney2.getClass();
                String uuid = activeUserJourney2.id.toString();
                uuid.getClass();
                return uuid;
            case 26:
                ActiveUserJourney activeUserJourney3 = (ActiveUserJourney) obj;
                activeUserJourney3.getClass();
                return Boolean.valueOf(activeUserJourney3.isSubJourney);
            case 27:
                File file = (File) obj;
                String readText = file.exists() ? FilesKt__FileReadWriteKt.readText(file, Charsets.UTF_8) : null;
                Timber.Forest.i(Recorder$$ExternalSyntheticOutline2.m("Read backup tag ", readText), new Object[0]);
                return readText;
            case 28:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                MatchResult.Destructured destructured = matchResult.getDestructured();
                return Recorder$$ExternalSyntheticOutline2.m((String) ((MatcherMatchResult) destructured.getMatch()).getGroupValues().get(1), "/REDACTED", (String) ((MatcherMatchResult) destructured.getMatch()).getGroupValues().get(2));
            default:
                ((MatchResult) obj).getClass();
                return "IPV4_REDACTED";
        }
    }
}
