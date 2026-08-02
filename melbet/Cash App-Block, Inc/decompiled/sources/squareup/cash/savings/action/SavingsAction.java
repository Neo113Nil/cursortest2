package squareup.cash.savings.action;

import android.hardware.camera2.CameraAccessException;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.GeneralMoneybotError;
import com.squareup.cash.moneybot.backend.api.mappers.MessageMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.kgoose.api.v3.ClientKickoffParams;
import com.squareup.protos.cash.kgoose.api.v3.InputMessage;
import com.squareup.protos.cash.kgoose.api.v3.MessageContent;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.bills.BillsConfig;

/* loaded from: classes10.dex */
public final class SavingsAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsAction> CREATOR;
    public final Action action;
    public final CdfEvent cdfEvent;

    /* loaded from: classes7.dex */
    public abstract class Action {

        /* loaded from: classes10.dex */
        public final class ClientRoute extends Action {
            public final String value;

            public ClientRoute(String str) {
                str.getClass();
                this.value = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientRoute) && Intrinsics.areEqual(this.value, ((ClientRoute) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(value=", this.value, ")");
            }
        }

        /* loaded from: classes10.dex */
        public final class PresentCard extends Action {
            public final Card value;

            public PresentCard(Card card) {
                card.getClass();
                this.value = card;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PresentCard) && Intrinsics.areEqual(this.value, ((PresentCard) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PresentCard(value=" + this.value + ")";
            }
        }

        public static final void AfterpayCategoriesSection(Modifier modifier, AfterpaySearchViewModel.CategoryTilesSectionViewModel categoryTilesSectionViewModel, LazyGridState lazyGridState, Function1 function1, Composer composer, int i) {
            LazyGridState lazyGridState2;
            int i2;
            categoryTilesSectionViewModel.getClass();
            function1.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(1606381269);
            int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(categoryTilesSectionViewModel) ? 32 : 16) | 128 | (gapComposer.changedInstance(function1) ? 2048 : 1024);
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 3, gapComposer);
                    i2 = i3 & (-897);
                } else {
                    gapComposer.skipToGroupEnd();
                    i2 = i3 & (-897);
                    lazyGridState2 = lazyGridState;
                }
                gapComposer.endDefaults();
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                ViewfinderDefaults.SectionHeader(categoryTilesSectionViewModel.header.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier testTag = TestTagKt.testTag(SizeKt.m279heightInVpY3zN4$default(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 2048.0f, 1), "AfterpayCategoryTiles");
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                boolean changedInstance = gapComposer.changedInstance(categoryTilesSectionViewModel) | ((i2 & 7168) == 2048);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CombinedModifier$$ExternalSyntheticLambda0(28, categoryTilesSectionViewModel, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyGridDslKt.LazyVerticalGrid(fixed, testTag, lazyGridState2, null, arrangement$SpacedAligned2, arrangement$SpacedAligned, null, false, null, (Function1) rememberedValue, gapComposer, 100663296, 664);
                gapComposer = gapComposer;
                gapComposer.end(true);
            } else {
                gapComposer.skipToGroupEnd();
                lazyGridState2 = lazyGridState;
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(modifier, i, categoryTilesSectionViewModel, lazyGridState2, function1, 23);
            }
        }

        /* renamed from: from-PVuDhNw$camera_camera2_pipe, reason: not valid java name */
        public static int m4396fromPVuDhNw$camera_camera2_pipe(Exception exc) {
            if (!(exc instanceof CameraAccessException)) {
                if (exc instanceof IllegalArgumentException) {
                    return 7;
                }
                if (exc instanceof SecurityException) {
                    return 8;
                }
                Log.w("CXCP", "Unexpected throwable: " + exc);
                return 11;
            }
            CameraAccessException cameraAccessException = (CameraAccessException) exc;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                return 3;
            }
            if (reason == 2) {
                return 6;
            }
            if (reason == 3) {
                return 0;
            }
            if (reason == 4) {
                return 1;
            }
            if (reason == 5) {
                return 2;
            }
            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
            return 11;
        }

        public static final List resolveAllMessages(HasObservability hasObservability, ChatKickoffParams chatKickoffParams, Set set) {
            set.getClass();
            byte[] bArr = chatKickoffParams.rawKickoffMessagesBytes;
            String str = chatKickoffParams.sessionId;
            List list = chatKickoffParams.initialMessages;
            if (bArr == null) {
                return list;
            }
            try {
                ClientKickoffParams clientKickoffParams = (ClientKickoffParams) ClientKickoffParams.ADAPTER.decode(bArr);
                PatternRedaction patternRedaction = new PatternRedaction((String) null, str, false);
                List<InputMessage> list2 = clientKickoffParams.kickoff_messages;
                ArrayList arrayList = new ArrayList();
                for (InputMessage inputMessage : list2) {
                    HasObservability hasObservability2 = hasObservability;
                    Message.Role role = MessageMappersKt.toRole(hasObservability2, inputMessage.role);
                    List<MessageContent> list3 = inputMessage.message_contents;
                    ArrayList arrayList2 = new ArrayList();
                    for (MessageContent messageContent : list3) {
                        Boolean bool = inputMessage.hidden;
                        Message message$default = MessageMappersKt.toMessage$default(hasObservability2, messageContent, patternRedaction, role, null, null, bool != null ? bool.booleanValue() : false, set, 88);
                        if (message$default != null) {
                            arrayList2.add(message$default);
                        }
                        hasObservability2 = hasObservability;
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList);
                }
                return arrayList;
            } catch (Exception e) {
                hasObservability.getErrorReporter().report(new GeneralMoneybotError("Failed to decode raw kickoff messages bytes", e), hasObservability.getOneErrorPerAppSessionStrategy());
                return list;
            }
        }

        public static final ChatKickoffParams toChatKickoffParams(HasObservability hasObservability, ClientKickoffParams clientKickoffParams) {
            hasObservability.getClass();
            clientKickoffParams.getClass();
            PatternRedaction patternRedaction = new PatternRedaction((String) null, clientKickoffParams.session_id, false);
            try {
                ProtoValidationScope protoValidationScope = new ProtoValidationScope(clientKickoffParams, patternRedaction, hasObservability);
                List<InputMessage> list = clientKickoffParams.kickoff_messages;
                ArrayList arrayList = new ArrayList();
                for (InputMessage inputMessage : list) {
                    List<MessageContent> list2 = inputMessage.message_contents;
                    ArrayList arrayList2 = new ArrayList();
                    for (MessageContent messageContent : list2) {
                        Message.Role role = MessageMappersKt.toRole(protoValidationScope, inputMessage.role);
                        Boolean bool = inputMessage.hidden;
                        Message message$default = MessageMappersKt.toMessage$default(protoValidationScope, messageContent, patternRedaction, role, null, null, bool != null ? bool.booleanValue() : false, null, EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        Message.TextMessage textMessage = message$default instanceof Message.TextMessage ? (Message.TextMessage) message$default : null;
                        if (textMessage != null) {
                            arrayList2.add(textMessage);
                        }
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList);
                }
                Boolean bool2 = clientKickoffParams.should_auto_send;
                return new ChatKickoffParams(arrayList, bool2 != null ? bool2.booleanValue() : false, clientKickoffParams.session_id, clientKickoffParams.encode());
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ClientKickoffParams.class), patternRedaction, null);
            }
        }
    }

    static {
        SavingsAction$Companion$ADAPTER$1 savingsAction$Companion$ADAPTER$1 = new SavingsAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsAction.class), "type.googleapis.com/squareup.cash.savings.action.SavingsAction", Syntax.PROTO_2, null, "squareup/cash/savings/action/SavingsAction.proto");
        ADAPTER = savingsAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAction(Action action, CdfEvent cdfEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = action;
        this.cdfEvent = cdfEvent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsAction)) {
            return false;
        }
        SavingsAction savingsAction = (SavingsAction) obj;
        return Intrinsics.areEqual(unknownFields(), savingsAction.unknownFields()) && Intrinsics.areEqual(this.action, savingsAction.action) && Intrinsics.areEqual(this.cdfEvent, savingsAction.cdfEvent);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Action action = this.action;
        int hashCode2 = (hashCode + (action != null ? action.hashCode() : 0)) * 37;
        CdfEvent cdfEvent = this.cdfEvent;
        int hashCode3 = hashCode2 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(26);
        builder.bills_applet_default_action = this.action;
        builder.half_applet_content = this.cdfEvent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        CdfEvent cdfEvent = this.cdfEvent;
        if (cdfEvent != null) {
            arrayList.add("cdfEvent=" + cdfEvent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsAction{", "}", 0, null, null, 56);
    }
}
