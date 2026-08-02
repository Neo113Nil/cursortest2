package squareup.cash.overdraft;

import android.hardware.camera2.CaptureRequest;
import android.os.Parcelable;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.Config;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomeMapperKt;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletUpsellSheetMapperKt$WhenMappings;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import com.squareup.cash.money.disclosure.DisclosureItemModel;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.util.Strings;
import com.squareup.util.cash.StringsKt;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.Plane;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import squareup.cash.bills.BillsConfig;
import squareup.cash.earnings.ActionButton;
import squareup.cash.earnings.EarningTool;
import squareup.cash.paychecks.Deduction;
import squareup.cash.savings.GoalFolder;
import squareup.cash.savings.SavingsConfig;
import squareup.cash.ui.arcade.elements.ButtonProminence;
import xyz.block.protos.genie.Action;
import xyz.block.protos.genie.EasingCurve;
import xyz.block.protos.genie.OpenURL;

/* loaded from: classes10.dex */
public final class OverdraftStatus extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OverdraftStatus> CREATOR;
    public final State_ State;
    public final Button footer_button;
    public final Button footer_button_override;
    public final LocalizedString localized_header_text;

    public final class Action extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Action> CREATOR;
        public final MoneyTabBookletKt action;

        public final class ActivateOverdraftAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ActivateOverdraftAction> CREATOR;
            public final String client_route_url;

            static {
                OverdraftStatus$Action$ActivateOverdraftAction$Companion$ADAPTER$1 overdraftStatus$Action$ActivateOverdraftAction$Companion$ADAPTER$1 = new OverdraftStatus$Action$ActivateOverdraftAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivateOverdraftAction.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.Action.ActivateOverdraftAction", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
                ADAPTER = overdraftStatus$Action$ActivateOverdraftAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$Action$ActivateOverdraftAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivateOverdraftAction(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.client_route_url = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ActivateOverdraftAction)) {
                    return false;
                }
                ActivateOverdraftAction activateOverdraftAction = (ActivateOverdraftAction) obj;
                return Intrinsics.areEqual(unknownFields(), activateOverdraftAction.unknownFields()) && Intrinsics.areEqual(this.client_route_url, activateOverdraftAction.client_route_url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.client_route_url;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                OpenURL.Builder builder = new OpenURL.Builder(6);
                builder.url = this.client_route_url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.client_route_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ActivateOverdraftAction{", "}", 0, null, null, 56);
            }
        }

        public final class DisableOverdraftAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DisableOverdraftAction> CREATOR;

            static {
                OverdraftStatus$Action$DisableOverdraftAction$Companion$ADAPTER$1 overdraftStatus$Action$DisableOverdraftAction$Companion$ADAPTER$1 = new OverdraftStatus$Action$DisableOverdraftAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisableOverdraftAction.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.Action.DisableOverdraftAction", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
                ADAPTER = overdraftStatus$Action$DisableOverdraftAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$Action$DisableOverdraftAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisableOverdraftAction(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof DisableOverdraftAction) && Intrinsics.areEqual(unknownFields(), ((DisableOverdraftAction) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(15);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "DisableOverdraftAction{}";
            }
        }

        public final class EnableOverdraftAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<EnableOverdraftAction> CREATOR;

            static {
                OverdraftStatus$Action$EnableOverdraftAction$Companion$ADAPTER$1 overdraftStatus$Action$EnableOverdraftAction$Companion$ADAPTER$1 = new OverdraftStatus$Action$EnableOverdraftAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EnableOverdraftAction.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.Action.EnableOverdraftAction", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
                ADAPTER = overdraftStatus$Action$EnableOverdraftAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$Action$EnableOverdraftAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EnableOverdraftAction(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof EnableOverdraftAction) && Intrinsics.areEqual(unknownFields(), ((EnableOverdraftAction) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(16);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "EnableOverdraftAction{}";
            }
        }

        static {
            OverdraftStatus$Action$Companion$ADAPTER$1 overdraftStatus$Action$Companion$ADAPTER$1 = new OverdraftStatus$Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.Action", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
            ADAPTER = overdraftStatus$Action$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$Action$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(MoneyTabBookletKt moneyTabBookletKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.action = moneyTabBookletKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.action, action.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            MoneyTabBookletKt moneyTabBookletKt = this.action;
            int hashCode2 = hashCode + (moneyTabBookletKt != null ? moneyTabBookletKt.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningTool.Builder builder = new EarningTool.Builder(19);
            builder.tool = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            MoneyTabBookletKt moneyTabBookletKt = this.action;
            if (moneyTabBookletKt != null) {
                arrayList.add("action=" + moneyTabBookletKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
        }
    }

    public final class Activated extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Activated> CREATOR;
        public final Money limit;
        public final LocalizedString localized_detailed_usage_summary_label;
        public final LocalizedString localized_usage_subtitle;
        public final LocalizedString localized_usage_summary_label;
        public final Button repayment_button;
        public final ToggleButton toggle_button;

        static {
            OverdraftStatus$Activated$Companion$ADAPTER$1 overdraftStatus$Activated$Companion$ADAPTER$1 = new OverdraftStatus$Activated$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Activated.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.Activated", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
            ADAPTER = overdraftStatus$Activated$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$Activated$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activated(Money money, LocalizedString localizedString, Button button, ToggleButton toggleButton, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.limit = money;
            this.localized_usage_subtitle = localizedString;
            this.repayment_button = button;
            this.toggle_button = toggleButton;
            this.localized_usage_summary_label = localizedString2;
            this.localized_detailed_usage_summary_label = localizedString3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Activated)) {
                return false;
            }
            Activated activated = (Activated) obj;
            return Intrinsics.areEqual(unknownFields(), activated.unknownFields()) && Intrinsics.areEqual(this.limit, activated.limit) && Intrinsics.areEqual(this.localized_usage_subtitle, activated.localized_usage_subtitle) && Intrinsics.areEqual(this.repayment_button, activated.repayment_button) && Intrinsics.areEqual(this.toggle_button, activated.toggle_button) && Intrinsics.areEqual(this.localized_usage_summary_label, activated.localized_usage_summary_label) && Intrinsics.areEqual(this.localized_detailed_usage_summary_label, activated.localized_detailed_usage_summary_label);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.limit;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.localized_usage_subtitle;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Button button = this.repayment_button;
            int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
            ToggleButton toggleButton = this.toggle_button;
            int hashCode5 = (hashCode4 + (toggleButton != null ? toggleButton.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.localized_usage_summary_label;
            int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.localized_detailed_usage_summary_label;
            int hashCode7 = hashCode6 + (localizedString3 != null ? localizedString3.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.Builder builder = new Action.Builder(4);
            builder.navigate = this.limit;
            builder.set_view_state_value = this.localized_usage_subtitle;
            builder.open_url = this.repayment_button;
            builder.compound_action = this.toggle_button;
            builder.submit = this.localized_usage_summary_label;
            builder.collection_mutation = this.localized_detailed_usage_summary_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.limit;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("limit=", money, arrayList);
            }
            LocalizedString localizedString = this.localized_usage_subtitle;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_usage_subtitle=", localizedString, arrayList);
            }
            Button button = this.repayment_button;
            if (button != null) {
                arrayList.add("repayment_button=" + button);
            }
            ToggleButton toggleButton = this.toggle_button;
            if (toggleButton != null) {
                arrayList.add("toggle_button=" + toggleButton);
            }
            LocalizedString localizedString2 = this.localized_usage_summary_label;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_usage_summary_label=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.localized_detailed_usage_summary_label;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_detailed_usage_summary_label=", localizedString3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Activated{", "}", 0, null, null, 56);
        }
    }

    public final class Button extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Button> CREATOR;
        public final String client_route_url;
        public final LocalizedString localized_text;

        static {
            OverdraftStatus$Button$Companion$ADAPTER$1 overdraftStatus$Button$Companion$ADAPTER$1 = new OverdraftStatus$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.Button", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
            ADAPTER = overdraftStatus$Button$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$Button$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(LocalizedString localizedString, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.localized_text = localizedString;
            this.client_route_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.localized_text, button.localized_text) && Intrinsics.areEqual(this.client_route_url, button.client_route_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.localized_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            String str = this.client_route_url;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ActionButton.Builder builder = new ActionButton.Builder(6);
            builder.title = this.localized_text;
            builder.client_route = this.client_route_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.localized_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_text=", localizedString, arrayList);
            }
            String str = this.client_route_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
        }
    }

    public final class Disabled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Disabled> CREATOR;
        public final LocalizedString localized_body_text;
        public final LocalizedString localized_detailed_usage_summary_label;
        public final LocalizedString localized_usage_subtitle;
        public final LocalizedString localized_usage_summary_label;
        public final Boolean needs_alert_treatment;
        public final Reason reason;
        public final Button repayment_button;
        public final ToggleButton toggle_button;
        public final Money usage;

        public enum Reason implements WireEnum {
            UNKNOWN(0),
            TEMPORARY_DELINQUENCY(1),
            USER_DISABLED(2),
            LOST_ELIGIBILITY(3);

            public static final OverdraftStatus$Disabled$Reason$Companion$ADAPTER$1 ADAPTER;
            public static final POPMatchingFactory Companion;
            public final int value;

            static {
                Reason reason = UNKNOWN;
                Companion = new POPMatchingFactory(26);
                ADAPTER = new OverdraftStatus$Disabled$Reason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Reason.class), Syntax.PROTO_2, reason);
            }

            Reason(int i) {
                this.value = i;
            }

            public static final Reason fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return TEMPORARY_DELINQUENCY;
                }
                if (i == 2) {
                    return USER_DISABLED;
                }
                if (i != 3) {
                    return null;
                }
                return LOST_ELIGIBILITY;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            OverdraftStatus$Disabled$Companion$ADAPTER$1 overdraftStatus$Disabled$Companion$ADAPTER$1 = new OverdraftStatus$Disabled$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Disabled.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.Disabled", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
            ADAPTER = overdraftStatus$Disabled$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$Disabled$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disabled(LocalizedString localizedString, Money money, LocalizedString localizedString2, Button button, ToggleButton toggleButton, LocalizedString localizedString3, Boolean bool, LocalizedString localizedString4, Reason reason, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.localized_body_text = localizedString;
            this.usage = money;
            this.localized_usage_subtitle = localizedString2;
            this.repayment_button = button;
            this.toggle_button = toggleButton;
            this.localized_usage_summary_label = localizedString3;
            this.needs_alert_treatment = bool;
            this.localized_detailed_usage_summary_label = localizedString4;
            this.reason = reason;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Disabled)) {
                return false;
            }
            Disabled disabled = (Disabled) obj;
            return Intrinsics.areEqual(unknownFields(), disabled.unknownFields()) && Intrinsics.areEqual(this.localized_body_text, disabled.localized_body_text) && Intrinsics.areEqual(this.usage, disabled.usage) && Intrinsics.areEqual(this.localized_usage_subtitle, disabled.localized_usage_subtitle) && Intrinsics.areEqual(this.repayment_button, disabled.repayment_button) && Intrinsics.areEqual(this.toggle_button, disabled.toggle_button) && Intrinsics.areEqual(this.localized_usage_summary_label, disabled.localized_usage_summary_label) && Intrinsics.areEqual(this.needs_alert_treatment, disabled.needs_alert_treatment) && Intrinsics.areEqual(this.localized_detailed_usage_summary_label, disabled.localized_detailed_usage_summary_label) && this.reason == disabled.reason;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.localized_body_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Money money = this.usage;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.localized_usage_subtitle;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Button button = this.repayment_button;
            int hashCode5 = (hashCode4 + (button != null ? button.hashCode() : 0)) * 37;
            ToggleButton toggleButton = this.toggle_button;
            int hashCode6 = (hashCode5 + (toggleButton != null ? toggleButton.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.localized_usage_summary_label;
            int hashCode7 = (hashCode6 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            Boolean bool = this.needs_alert_treatment;
            int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            LocalizedString localizedString4 = this.localized_detailed_usage_summary_label;
            int hashCode9 = (hashCode8 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
            Reason reason = this.reason;
            int hashCode10 = hashCode9 + (reason != null ? reason.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Transfer.Builder builder = new Transfer.Builder(21, false);
            builder.token = this.localized_body_text;
            builder.amount = this.usage;
            builder.source = this.localized_usage_subtitle;
            builder.target = this.repayment_button;
            builder.state = this.toggle_button;
            builder.push_amount = this.localized_usage_summary_label;
            builder.created_at = this.needs_alert_treatment;
            builder.completed_at = this.localized_detailed_usage_summary_label;
            builder.failed_at = this.reason;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.localized_body_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_body_text=", localizedString, arrayList);
            }
            Money money = this.usage;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("usage=", money, arrayList);
            }
            LocalizedString localizedString2 = this.localized_usage_subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_usage_subtitle=", localizedString2, arrayList);
            }
            Button button = this.repayment_button;
            if (button != null) {
                arrayList.add("repayment_button=" + button);
            }
            ToggleButton toggleButton = this.toggle_button;
            if (toggleButton != null) {
                arrayList.add("toggle_button=" + toggleButton);
            }
            LocalizedString localizedString3 = this.localized_usage_summary_label;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_usage_summary_label=", localizedString3, arrayList);
            }
            Boolean bool = this.needs_alert_treatment;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("needs_alert_treatment=", bool, arrayList);
            }
            LocalizedString localizedString4 = this.localized_detailed_usage_summary_label;
            if (localizedString4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_detailed_usage_summary_label=", localizedString4, arrayList);
            }
            Reason reason = this.reason;
            if (reason != null) {
                arrayList.add("reason=" + reason);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Disabled{", "}", 0, null, null, 56);
        }
    }

    public final class Eligible extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Eligible> CREATOR;
        public final LocalizedString localized_body_text;
        public final ToggleButton toggle_button;

        static {
            OverdraftStatus$Eligible$Companion$ADAPTER$1 overdraftStatus$Eligible$Companion$ADAPTER$1 = new OverdraftStatus$Eligible$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Eligible.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.Eligible", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
            ADAPTER = overdraftStatus$Eligible$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$Eligible$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Eligible(LocalizedString localizedString, ToggleButton toggleButton, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.localized_body_text = localizedString;
            this.toggle_button = toggleButton;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Eligible)) {
                return false;
            }
            Eligible eligible = (Eligible) obj;
            return Intrinsics.areEqual(unknownFields(), eligible.unknownFields()) && Intrinsics.areEqual(this.localized_body_text, eligible.localized_body_text) && Intrinsics.areEqual(this.toggle_button, eligible.toggle_button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.localized_body_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            ToggleButton toggleButton = this.toggle_button;
            int hashCode3 = hashCode2 + (toggleButton != null ? toggleButton.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(13);
            builder.bills_applet_default_action = this.localized_body_text;
            builder.half_applet_content = this.toggle_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.localized_body_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_body_text=", localizedString, arrayList);
            }
            ToggleButton toggleButton = this.toggle_button;
            if (toggleButton != null) {
                arrayList.add("toggle_button=" + toggleButton);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Eligible{", "}", 0, null, null, 56);
        }
    }

    public final class PermanentlyDisabled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PermanentlyDisabled> CREATOR;
        public final LocalizedString localized_body_text;
        public final LocalizedString localized_detailed_usage_summary_label;
        public final LocalizedString localized_usage_subtitle;
        public final LocalizedString localized_usage_summary_label;
        public final Boolean needs_alert_treatment;
        public final Reason reason;
        public final Button repayment_button;
        public final Money usage;

        public enum Reason implements WireEnum {
            UNKNOWN(0),
            PERMANENT_DELINQUENCY(1),
            PERMANENT_EXCEEDED_VELOCITY(2);

            public static final OverdraftStatus$PermanentlyDisabled$Reason$Companion$ADAPTER$1 ADAPTER;
            public static final Plane Companion;
            public final int value;

            static {
                Reason reason = UNKNOWN;
                Companion = new Plane(26);
                ADAPTER = new OverdraftStatus$PermanentlyDisabled$Reason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Reason.class), Syntax.PROTO_2, reason);
            }

            Reason(int i) {
                this.value = i;
            }

            public static final Reason fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return PERMANENT_DELINQUENCY;
                }
                if (i != 2) {
                    return null;
                }
                return PERMANENT_EXCEEDED_VELOCITY;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            OverdraftStatus$PermanentlyDisabled$Companion$ADAPTER$1 overdraftStatus$PermanentlyDisabled$Companion$ADAPTER$1 = new OverdraftStatus$PermanentlyDisabled$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PermanentlyDisabled.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.PermanentlyDisabled", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
            ADAPTER = overdraftStatus$PermanentlyDisabled$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$PermanentlyDisabled$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PermanentlyDisabled(LocalizedString localizedString, Money money, LocalizedString localizedString2, Button button, LocalizedString localizedString3, Boolean bool, LocalizedString localizedString4, Reason reason, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.localized_body_text = localizedString;
            this.usage = money;
            this.localized_usage_subtitle = localizedString2;
            this.repayment_button = button;
            this.localized_usage_summary_label = localizedString3;
            this.needs_alert_treatment = bool;
            this.localized_detailed_usage_summary_label = localizedString4;
            this.reason = reason;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PermanentlyDisabled)) {
                return false;
            }
            PermanentlyDisabled permanentlyDisabled = (PermanentlyDisabled) obj;
            return Intrinsics.areEqual(unknownFields(), permanentlyDisabled.unknownFields()) && Intrinsics.areEqual(this.localized_body_text, permanentlyDisabled.localized_body_text) && Intrinsics.areEqual(this.usage, permanentlyDisabled.usage) && Intrinsics.areEqual(this.localized_usage_subtitle, permanentlyDisabled.localized_usage_subtitle) && Intrinsics.areEqual(this.repayment_button, permanentlyDisabled.repayment_button) && Intrinsics.areEqual(this.localized_usage_summary_label, permanentlyDisabled.localized_usage_summary_label) && Intrinsics.areEqual(this.needs_alert_treatment, permanentlyDisabled.needs_alert_treatment) && Intrinsics.areEqual(this.localized_detailed_usage_summary_label, permanentlyDisabled.localized_detailed_usage_summary_label) && this.reason == permanentlyDisabled.reason;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.localized_body_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Money money = this.usage;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.localized_usage_subtitle;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Button button = this.repayment_button;
            int hashCode5 = (hashCode4 + (button != null ? button.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.localized_usage_summary_label;
            int hashCode6 = (hashCode5 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            Boolean bool = this.needs_alert_treatment;
            int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            LocalizedString localizedString4 = this.localized_detailed_usage_summary_label;
            int hashCode8 = (hashCode7 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
            Reason reason = this.reason;
            int hashCode9 = hashCode8 + (reason != null ? reason.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GoalFolder.Builder builder = new GoalFolder.Builder(12);
            builder.token = this.localized_body_text;
            builder.goal_amount = this.usage;
            builder.icon_unicode = this.localized_usage_subtitle;
            builder.completion_token = this.repayment_button;
            builder.label = this.localized_usage_summary_label;
            builder.met_goal = this.needs_alert_treatment;
            builder.goal_flow_parameters = this.localized_detailed_usage_summary_label;
            builder.goal_progress_percentage = this.reason;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.localized_body_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_body_text=", localizedString, arrayList);
            }
            Money money = this.usage;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("usage=", money, arrayList);
            }
            LocalizedString localizedString2 = this.localized_usage_subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_usage_subtitle=", localizedString2, arrayList);
            }
            Button button = this.repayment_button;
            if (button != null) {
                arrayList.add("repayment_button=" + button);
            }
            LocalizedString localizedString3 = this.localized_usage_summary_label;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_usage_summary_label=", localizedString3, arrayList);
            }
            Boolean bool = this.needs_alert_treatment;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("needs_alert_treatment=", bool, arrayList);
            }
            LocalizedString localizedString4 = this.localized_detailed_usage_summary_label;
            if (localizedString4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_detailed_usage_summary_label=", localizedString4, arrayList);
            }
            Reason reason = this.reason;
            if (reason != null) {
                arrayList.add("reason=" + reason);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PermanentlyDisabled{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes5.dex */
    public abstract class State_ {

        /* loaded from: classes10.dex */
        public final class Activated extends State_ {
            public final Activated value;

            public Activated(Activated activated) {
                activated.getClass();
                this.value = activated;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activated) && Intrinsics.areEqual(this.value, ((Activated) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Activated(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class Disabled extends State_ {
            public final Disabled value;

            public Disabled(Disabled disabled) {
                disabled.getClass();
                this.value = disabled;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Disabled) && Intrinsics.areEqual(this.value, ((Disabled) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Disabled(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class Eligible extends State_ {
            public final Eligible value;

            public Eligible(Eligible eligible) {
                eligible.getClass();
                this.value = eligible;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Eligible) && Intrinsics.areEqual(this.value, ((Eligible) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Eligible(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class PermanentlyDisabled extends State_ {
            public final PermanentlyDisabled value;

            public PermanentlyDisabled(PermanentlyDisabled permanentlyDisabled) {
                permanentlyDisabled.getClass();
                this.value = permanentlyDisabled;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PermanentlyDisabled) && Intrinsics.areEqual(this.value, ((PermanentlyDisabled) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PermanentlyDisabled(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class Upsell extends State_ {
            public final Upsell value;

            public Upsell(Upsell upsell) {
                upsell.getClass();
                this.value = upsell;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Upsell) && Intrinsics.areEqual(this.value, ((Upsell) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Upsell(value=" + this.value + ")";
            }
        }

        public static final void DisclosureUI(DisclosureItemModel disclosureItemModel, Function2 function2, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-1991866521);
            int i2 = 4;
            int i3 = i | (gapComposer.changed(disclosureItemModel) ? 4 : 2) | (gapComposer.changedInstance(function2) ? 32 : 16);
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda13(i2);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, true, (Function1) rememberedValue);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                disclosureItemModel.getClass();
                gapComposer.startReplaceGroup(-1865804955);
                gapComposer.end(false);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                LazyDslKt.m304MarkdownTextpCuZGqc(disclosureItemModel.text, function2, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7), Strings.getTypography(gapComposer).bodyXSmall, Strings.getColors(gapComposer).semantic.text.subtle, new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer).linkXSmall.spanStyle, Strings.getColors(gapComposer).semantic.text.link, null, 0L, JpegConstants.COM_MARKER), 2), null, null, 0, 0, 5, gapComposer, i3 & 112, 960);
                gapComposer.end(true);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(disclosureItemModel, function2, i, 24);
            }
        }

        public static final AfterpayAppletUpsellSheetViewModel.CtaButton access$toCtaButton(ProtoValidationScope protoValidationScope, com.squareup.protos.cash.shop.rendering.api.Button button, ButtonProminence buttonProminence) {
            LocalizedString localizedString = button.l_text;
            String translated = localizedString != null ? StringsKt.translated(localizedString) : "";
            TapAction tapAction = button.tap_action;
            ButtonProminence buttonProminence2 = null;
            if (tapAction == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            Tap tapViewModel = AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction);
            Button.Prominence prominence = button.prominence;
            int i = prominence == null ? -1 : AfterpayAppletUpsellSheetMapperKt$WhenMappings.$EnumSwitchMapping$0[prominence.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    buttonProminence2 = ButtonProminence.STANDARD;
                } else if (i == 2) {
                    buttonProminence2 = ButtonProminence.PROMINENT;
                } else if (i == 3) {
                    buttonProminence2 = ButtonProminence.SUBTLE;
                } else if (i != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            if (buttonProminence2 == null) {
                ButtonProminence buttonProminence3 = button.button_prominence;
                if (buttonProminence3 != null) {
                    buttonProminence = buttonProminence3;
                }
            } else {
                buttonProminence = buttonProminence2;
            }
            return new AfterpayAppletUpsellSheetViewModel.CtaButton(translated, tapViewModel, buttonProminence);
        }

        public static final AutoValue_Config_Option createCaptureRequestOption(CaptureRequest.Key key) {
            key.getClass();
            return new AutoValue_Config_Option("camera2.captureRequest.option." + key.getName(), Object.class, key);
        }

        public static final LinkedHashMap toParameters(Config config) {
            Object retrieveOption;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (AutoValue_Config_Option autoValue_Config_Option : config.listOptions()) {
                Object obj = autoValue_Config_Option.token;
                CaptureRequest.Key key = obj instanceof CaptureRequest.Key ? (CaptureRequest.Key) obj : null;
                if (key != null && (retrieveOption = config.retrieveOption(autoValue_Config_Option)) != null) {
                    linkedHashMap.put(key, retrieveOption);
                }
            }
            return linkedHashMap;
        }
    }

    public final class ToggleButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ToggleButton> CREATOR;
        public final Action action;
        public final Boolean is_on;
        public final Boolean is_user_interaction_enabled;
        public final LocalizedString localized_header_text;

        static {
            OverdraftStatus$ToggleButton$Companion$ADAPTER$1 overdraftStatus$ToggleButton$Companion$ADAPTER$1 = new OverdraftStatus$ToggleButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ToggleButton.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.ToggleButton", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
            ADAPTER = overdraftStatus$ToggleButton$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$ToggleButton$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToggleButton(LocalizedString localizedString, Boolean bool, Boolean bool2, Action action, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.localized_header_text = localizedString;
            this.is_on = bool;
            this.is_user_interaction_enabled = bool2;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ToggleButton)) {
                return false;
            }
            ToggleButton toggleButton = (ToggleButton) obj;
            return Intrinsics.areEqual(unknownFields(), toggleButton.unknownFields()) && Intrinsics.areEqual(this.localized_header_text, toggleButton.localized_header_text) && Intrinsics.areEqual(this.is_on, toggleButton.is_on) && Intrinsics.areEqual(this.is_user_interaction_enabled, toggleButton.is_user_interaction_enabled) && Intrinsics.areEqual(this.action, toggleButton.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.localized_header_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Boolean bool = this.is_on;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_user_interaction_enabled;
            int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            Action action = this.action;
            int hashCode5 = hashCode4 + (action != null ? action.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Deduction.Builder builder = new Deduction.Builder(13);
            builder.description = this.localized_header_text;
            builder.amount = this.is_on;
            builder.note = this.is_user_interaction_enabled;
            builder.tint_color = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.localized_header_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_header_text=", localizedString, arrayList);
            }
            Boolean bool = this.is_on;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_on=", bool, arrayList);
            }
            Boolean bool2 = this.is_user_interaction_enabled;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_user_interaction_enabled=", bool2, arrayList);
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ToggleButton{", "}", 0, null, null, 56);
        }
    }

    public final class Upsell extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Upsell> CREATOR;
        public final LocalizedString localized_body_text;

        static {
            OverdraftStatus$Upsell$Companion$ADAPTER$1 overdraftStatus$Upsell$Companion$ADAPTER$1 = new OverdraftStatus$Upsell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Upsell.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus.Upsell", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
            ADAPTER = overdraftStatus$Upsell$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$Upsell$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Upsell(LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.localized_body_text = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Upsell)) {
                return false;
            }
            Upsell upsell = (Upsell) obj;
            return Intrinsics.areEqual(unknownFields(), upsell.unknownFields()) && Intrinsics.areEqual(this.localized_body_text, upsell.localized_body_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.localized_body_text;
            int hashCode2 = hashCode + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SavingsConfig.Yield.Builder builder = new SavingsConfig.Yield.Builder(9);
            builder.yield_current_rate_enhanced = this.localized_body_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.localized_body_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_body_text=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Upsell{", "}", 0, null, null, 56);
        }
    }

    static {
        OverdraftStatus$Companion$ADAPTER$1 overdraftStatus$Companion$ADAPTER$1 = new OverdraftStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverdraftStatus.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftStatus", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftStatusProto.proto");
        ADAPTER = overdraftStatus$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftStatus$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftStatus(LocalizedString localizedString, Button button, Button button2, State_ state_, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.localized_header_text = localizedString;
        this.footer_button = button;
        this.footer_button_override = button2;
        this.State = state_;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OverdraftStatus)) {
            return false;
        }
        OverdraftStatus overdraftStatus = (OverdraftStatus) obj;
        return Intrinsics.areEqual(unknownFields(), overdraftStatus.unknownFields()) && Intrinsics.areEqual(this.localized_header_text, overdraftStatus.localized_header_text) && Intrinsics.areEqual(this.footer_button, overdraftStatus.footer_button) && Intrinsics.areEqual(this.footer_button_override, overdraftStatus.footer_button_override) && Intrinsics.areEqual(this.State, overdraftStatus.State);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.localized_header_text;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Button button = this.footer_button;
        int hashCode3 = (hashCode2 + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.footer_button_override;
        int hashCode4 = (hashCode3 + (button2 != null ? button2.hashCode() : 0)) * 37;
        State_ state_ = this.State;
        int hashCode5 = hashCode4 + (state_ != null ? state_.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(12);
        builder.description = this.localized_header_text;
        builder.amount = this.footer_button;
        builder.note = this.footer_button_override;
        builder.tint_color = this.State;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.localized_header_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_header_text=", localizedString, arrayList);
        }
        Button button = this.footer_button;
        if (button != null) {
            arrayList.add("footer_button=" + button);
        }
        Button button2 = this.footer_button_override;
        if (button2 != null) {
            arrayList.add("footer_button_override=" + button2);
        }
        State_ state_ = this.State;
        if (state_ != null) {
            arrayList.add("State=" + state_);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OverdraftStatus{", "}", 0, null, null, 56);
    }
}
