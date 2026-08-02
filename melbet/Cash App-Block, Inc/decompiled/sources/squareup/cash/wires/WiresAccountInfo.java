package squareup.cash.wires;

import android.os.Parcelable;
import androidx.camera.camera2.pipe.Metadata;
import androidx.compose.ui.draw.RotateKt;
import androidx.room.TransactorKt;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.amountchooser.presenters.KeypadAmountChangedHandled;
import com.squareup.cash.amountchooser.presenters.TapAmountSelectorOptionHandled;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewEvent;
import com.squareup.cash.amountchooser.viewmodels.AmountSelectorOption;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.backend.api.MoneybotParsingErrorFactory;
import com.squareup.cash.moneybot.backend.api.model.chat.InChatPrompt;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPromptManager;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;
import squareup.cash.paychecks.Deduction;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.savings.bespoke_elements.TransferButtons;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.EasingCurve;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.Navigate;
import xyz.block.protos.genie.OpenURL;
import xyz.block.protos.genie.TransitionEffect$Fade;
import xyz.block.protos.genie.TransitionEffect$Instant;
import xyz.block.protos.genie.TransitionEffect$Pop;
import xyz.block.protos.genie.TransitionEffect$Push;
import xyz.block.protos.genie.TransitionEffect$Slide;

/* loaded from: classes10.dex */
public final class WiresAccountInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WiresAccountInfo> CREATOR;
    public final String account_number;
    public final Action action;
    public final GlobalAddress bank_address;
    public final ClientScenario client_scenario;
    public final String customer_name;
    public final String routing_number;
    public final WiresProfile wires_profile;

    public final class Action extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Action> CREATOR;
        public final String client_route_url;

        static {
            WiresAccountInfo$Action$Companion$ADAPTER$1 wiresAccountInfo$Action$Companion$ADAPTER$1 = new WiresAccountInfo$Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.cash.wires.WiresAccountInfo.Action", Syntax.PROTO_2, null, "squareup/cash/wires/WiresAccountInfo.proto");
            ADAPTER = wiresAccountInfo$Action$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(wiresAccountInfo$Action$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.client_route_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.client_route_url, action.client_route_url);
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
            OpenURL.Builder builder = new OpenURL.Builder(7);
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
        }
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object account_number;
        public Serializable action;
        public Object bank_address;
        public Serializable client_scenario;
        public Object customer_name;
        public Serializable routing_number;
        public Object wires_profile;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new WiresAccountInfo((String) this.routing_number, (String) this.account_number, (String) this.customer_name, (GlobalAddress) this.bank_address, (ClientScenario) this.client_scenario, (Action) this.action, (WiresProfile) this.wires_profile, buildUnknownFields());
                case 1:
                    return new TransferButtons((ButtonDefaultGroup) this.routing_number, (Long) this.account_number, (TransferButtons.TransferInConfig) this.customer_name, (Long) this.bank_address, (TransferButtons.TransferOutConfig) this.client_scenario, (ClientRouteTemplate) this.action, (ClientRouteTemplate) this.wires_profile, buildUnknownFields());
                case 2:
                    return new Navigate.Dismiss.Transition((TransitionEffect$Instant) this.routing_number, (TransitionEffect$Fade) this.account_number, (TransitionEffect$Pop) this.customer_name, (TransitionEffect$Slide) this.bank_address, (Navigate.MatchStrategy) this.client_scenario, (Integer) this.action, (EasingCurve) this.wires_profile, buildUnknownFields());
                case 3:
                    Expression expression = (Expression) this.routing_number;
                    if (expression != null) {
                        return new Navigate.Present(expression, (List) this.account_number, (List) this.customer_name, (List) this.bank_address, (Navigate.Present.Push) this.client_scenario, (Navigate.Present.PresentModal) this.action, (Navigate.Present.Transition) this.wires_profile, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression, "view_slug");
                    throw null;
                default:
                    return new Navigate.Present.Transition((TransitionEffect$Instant) this.routing_number, (TransitionEffect$Fade) this.account_number, (TransitionEffect$Push) this.customer_name, (TransitionEffect$Slide) this.bank_address, (Navigate.MatchStrategy) this.client_scenario, (Integer) this.action, (EasingCurve) this.wires_profile, buildUnknownFields());
            }
        }
    }

    public final class DeactivationDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DeactivationDetails> CREATOR;
        public final Action action;
        public final String description;
        public final String learn_more_button_text;
        public final String title;

        static {
            WiresAccountInfo$DeactivationDetails$Companion$ADAPTER$1 wiresAccountInfo$DeactivationDetails$Companion$ADAPTER$1 = new WiresAccountInfo$DeactivationDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeactivationDetails.class), "type.googleapis.com/squareup.cash.wires.WiresAccountInfo.DeactivationDetails", Syntax.PROTO_2, null, "squareup/cash/wires/WiresAccountInfo.proto");
            ADAPTER = wiresAccountInfo$DeactivationDetails$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(wiresAccountInfo$DeactivationDetails$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeactivationDetails(String str, String str2, String str3, Action action, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.description = str2;
            this.learn_more_button_text = str3;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeactivationDetails)) {
                return false;
            }
            DeactivationDetails deactivationDetails = (DeactivationDetails) obj;
            return Intrinsics.areEqual(unknownFields(), deactivationDetails.unknownFields()) && Intrinsics.areEqual(this.title, deactivationDetails.title) && Intrinsics.areEqual(this.description, deactivationDetails.description) && Intrinsics.areEqual(this.learn_more_button_text, deactivationDetails.learn_more_button_text) && Intrinsics.areEqual(this.action, deactivationDetails.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.learn_more_button_text;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Action action = this.action;
            int hashCode5 = hashCode4 + (action != null ? action.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Deduction.Builder builder = new Deduction.Builder(27);
            builder.amount = this.title;
            builder.description = this.description;
            builder.note = this.learn_more_button_text;
            builder.tint_color = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            String str3 = this.learn_more_button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "learn_more_button_text=", arrayList);
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DeactivationDetails{", "}", 0, null, null, 56);
        }
    }

    public final class EligibilityDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EligibilityDetails> CREATOR;
        public final String account_number;
        public final Action action;
        public final GlobalAddress bank_address;
        public final String customer_name;
        public final String routing_number;

        static {
            WiresAccountInfo$EligibilityDetails$Companion$ADAPTER$1 wiresAccountInfo$EligibilityDetails$Companion$ADAPTER$1 = new WiresAccountInfo$EligibilityDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EligibilityDetails.class), "type.googleapis.com/squareup.cash.wires.WiresAccountInfo.EligibilityDetails", Syntax.PROTO_2, null, "squareup/cash/wires/WiresAccountInfo.proto");
            ADAPTER = wiresAccountInfo$EligibilityDetails$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(wiresAccountInfo$EligibilityDetails$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibilityDetails(String str, String str2, String str3, GlobalAddress globalAddress, Action action, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.routing_number = str;
            this.account_number = str2;
            this.customer_name = str3;
            this.bank_address = globalAddress;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EligibilityDetails)) {
                return false;
            }
            EligibilityDetails eligibilityDetails = (EligibilityDetails) obj;
            return Intrinsics.areEqual(unknownFields(), eligibilityDetails.unknownFields()) && Intrinsics.areEqual(this.routing_number, eligibilityDetails.routing_number) && Intrinsics.areEqual(this.account_number, eligibilityDetails.account_number) && Intrinsics.areEqual(this.customer_name, eligibilityDetails.customer_name) && Intrinsics.areEqual(this.bank_address, eligibilityDetails.bank_address) && Intrinsics.areEqual(this.action, eligibilityDetails.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.routing_number;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.account_number;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.customer_name;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            GlobalAddress globalAddress = this.bank_address;
            int hashCode5 = (hashCode4 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
            Action action = this.action;
            int hashCode6 = hashCode5 + (action != null ? action.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Binding.Builder builder = new Binding.Builder(28);
            builder.key_path = this.routing_number;
            builder.get_transform = this.account_number;
            builder.set_transform = this.customer_name;
            builder.validation = this.bank_address;
            builder.on_invalid = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.routing_number != null) {
                arrayList.add("routing_number=██");
            }
            if (this.account_number != null) {
                arrayList.add("account_number=██");
            }
            if (this.customer_name != null) {
                arrayList.add("customer_name=██");
            }
            if (this.bank_address != null) {
                arrayList.add("bank_address=██");
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EligibilityDetails{", "}", 0, null, null, 56);
        }
    }

    public final class IneligibilityDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IneligibilityDetails> CREATOR;
        public final Action action;
        public final LocalizedString action_title;
        public final LocalizedString description;

        static {
            WiresAccountInfo$IneligibilityDetails$Companion$ADAPTER$1 wiresAccountInfo$IneligibilityDetails$Companion$ADAPTER$1 = new WiresAccountInfo$IneligibilityDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IneligibilityDetails.class), "type.googleapis.com/squareup.cash.wires.WiresAccountInfo.IneligibilityDetails", Syntax.PROTO_2, null, "squareup/cash/wires/WiresAccountInfo.proto");
            ADAPTER = wiresAccountInfo$IneligibilityDetails$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(wiresAccountInfo$IneligibilityDetails$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IneligibilityDetails(LocalizedString localizedString, LocalizedString localizedString2, Action action, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.description = localizedString;
            this.action_title = localizedString2;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IneligibilityDetails)) {
                return false;
            }
            IneligibilityDetails ineligibilityDetails = (IneligibilityDetails) obj;
            return Intrinsics.areEqual(unknownFields(), ineligibilityDetails.unknownFields()) && Intrinsics.areEqual(this.description, ineligibilityDetails.description) && Intrinsics.areEqual(this.action_title, ineligibilityDetails.action_title) && Intrinsics.areEqual(this.action, ineligibilityDetails.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.description;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.action_title;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Action action = this.action;
            int hashCode4 = hashCode3 + (action != null ? action.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.Builder builder = new BillsApplet.Builder(28);
            builder.action = this.description;
            builder.full_applet = this.action_title;
            builder.half_applet = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.description;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("description=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.action_title;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("action_title=", localizedString2, arrayList);
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IneligibilityDetails{", "}", 0, null, null, 56);
        }
    }

    static {
        WiresAccountInfo$Companion$ADAPTER$1 wiresAccountInfo$Companion$ADAPTER$1 = new WiresAccountInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WiresAccountInfo.class), "type.googleapis.com/squareup.cash.wires.WiresAccountInfo", Syntax.PROTO_2, null, "squareup/cash/wires/WiresAccountInfo.proto");
        ADAPTER = wiresAccountInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(wiresAccountInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WiresAccountInfo(String str, String str2, String str3, GlobalAddress globalAddress, ClientScenario clientScenario, Action action, WiresProfile wiresProfile, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.routing_number = str;
        this.account_number = str2;
        this.customer_name = str3;
        this.bank_address = globalAddress;
        this.client_scenario = clientScenario;
        this.action = action;
        this.wires_profile = wiresProfile;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WiresAccountInfo)) {
            return false;
        }
        WiresAccountInfo wiresAccountInfo = (WiresAccountInfo) obj;
        return Intrinsics.areEqual(unknownFields(), wiresAccountInfo.unknownFields()) && Intrinsics.areEqual(this.routing_number, wiresAccountInfo.routing_number) && Intrinsics.areEqual(this.account_number, wiresAccountInfo.account_number) && Intrinsics.areEqual(this.customer_name, wiresAccountInfo.customer_name) && Intrinsics.areEqual(this.bank_address, wiresAccountInfo.bank_address) && this.client_scenario == wiresAccountInfo.client_scenario && Intrinsics.areEqual(this.action, wiresAccountInfo.action) && Intrinsics.areEqual(this.wires_profile, wiresAccountInfo.wires_profile);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.routing_number;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.account_number;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.customer_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.bank_address;
        int hashCode5 = (hashCode4 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
        ClientScenario clientScenario = this.client_scenario;
        int hashCode6 = (hashCode5 + (clientScenario != null ? clientScenario.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode7 = (hashCode6 + (action != null ? action.hashCode() : 0)) * 37;
        WiresProfile wiresProfile = this.wires_profile;
        int hashCode8 = hashCode7 + (wiresProfile != null ? wiresProfile.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.routing_number = this.routing_number;
        builder.account_number = this.account_number;
        builder.customer_name = this.customer_name;
        builder.bank_address = this.bank_address;
        builder.client_scenario = this.client_scenario;
        builder.action = this.action;
        builder.wires_profile = this.wires_profile;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.routing_number != null) {
            arrayList.add("routing_number=██");
        }
        if (this.account_number != null) {
            arrayList.add("account_number=██");
        }
        if (this.customer_name != null) {
            arrayList.add("customer_name=██");
        }
        if (this.bank_address != null) {
            arrayList.add("bank_address=██");
        }
        ClientScenario clientScenario = this.client_scenario;
        if (clientScenario != null) {
            Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        WiresProfile wiresProfile = this.wires_profile;
        if (wiresProfile != null) {
            arrayList.add("wires_profile=" + wiresProfile);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WiresAccountInfo{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public abstract class WiresProfile {

        /* loaded from: classes10.dex */
        public final class DeactivationDetails extends WiresProfile {
            public final DeactivationDetails value;

            public DeactivationDetails(DeactivationDetails deactivationDetails) {
                deactivationDetails.getClass();
                this.value = deactivationDetails;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeactivationDetails) && Intrinsics.areEqual(this.value, ((DeactivationDetails) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DeactivationDetails(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class EligibilityDetails extends WiresProfile {
            public final EligibilityDetails value;

            public EligibilityDetails(EligibilityDetails eligibilityDetails) {
                eligibilityDetails.getClass();
                this.value = eligibilityDetails;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EligibilityDetails) && Intrinsics.areEqual(this.value, ((EligibilityDetails) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EligibilityDetails(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class IneligibilityDetails extends WiresProfile {
            public final IneligibilityDetails value;

            public IneligibilityDetails(IneligibilityDetails ineligibilityDetails) {
                ineligibilityDetails.getClass();
                this.value = ineligibilityDetails;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IneligibilityDetails) && Intrinsics.areEqual(this.value, ((IneligibilityDetails) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "IneligibilityDetails(value=" + this.value + ")";
            }
        }

        public static Metadata.Key create(String str, KClass kClass) {
            Metadata.Key key;
            kClass.getClass();
            HashMap hashMap = Metadata.Key.keys;
            synchronized (hashMap) {
                try {
                    Object obj = hashMap.get(str);
                    if (obj == null) {
                        obj = new Metadata.Key(str, kClass);
                        hashMap.put(str, obj);
                    }
                    key = (Metadata.Key) obj;
                    if (!Intrinsics.areEqual(key.f837type, kClass)) {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return key;
        }

        public static final TapAmountSelectorOptionHandled handle(AmountChooserViewEvent.TapAmountSelectorOption tapAmountSelectorOption, String str, List list, boolean z) {
            AmountSelectorOption copy$default;
            tapAmountSelectorOption.getClass();
            str.getClass();
            list.getClass();
            AmountSelectorOption amountSelectorOption = tapAmountSelectorOption.amountSelectorOption;
            if (amountSelectorOption instanceof AmountSelectorOption.CustomAmountSelectorOption) {
                return new TapAmountSelectorOptionHandled(str, list, true);
            }
            if (!(amountSelectorOption instanceof AmountSelectorOption.PreSetAmountSelectorOption)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Long l = ((AmountSelectorOption.PreSetAmountSelectorOption) amountSelectorOption).amount.amount;
            l.getClass();
            String rawAmount = toRawAmount(l.longValue());
            List<AmountSelectorOption> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (AmountSelectorOption amountSelectorOption2 : list2) {
                if (amountSelectorOption2 instanceof AmountSelectorOption.CustomAmountSelectorOption) {
                    copy$default = new AmountSelectorOption.CustomAmountSelectorOption(false);
                } else {
                    if (!(amountSelectorOption2 instanceof AmountSelectorOption.PreSetAmountSelectorOption)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    AmountSelectorOption.PreSetAmountSelectorOption preSetAmountSelectorOption = (AmountSelectorOption.PreSetAmountSelectorOption) amountSelectorOption2;
                    long cents = toCents(rawAmount);
                    Long l2 = preSetAmountSelectorOption.amount.amount;
                    l2.getClass();
                    copy$default = AmountSelectorOption.PreSetAmountSelectorOption.copy$default(preSetAmountSelectorOption, cents == l2.longValue());
                }
                arrayList.add(copy$default);
            }
            return new TapAmountSelectorOptionHandled(rawAmount, arrayList, z);
        }

        public static final boolean isCustom(String str, List list) {
            str.getClass();
            list.getClass();
            if (Intrinsics.areEqual(str, "0")) {
                return false;
            }
            ArrayList<AmountSelectorOption.PreSetAmountSelectorOption> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof AmountSelectorOption.PreSetAmountSelectorOption) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            for (AmountSelectorOption.PreSetAmountSelectorOption preSetAmountSelectorOption : arrayList) {
                long cents = toCents(str);
                Long l = preSetAmountSelectorOption.amount.amount;
                l.getClass();
                if (cents == l.longValue()) {
                    return false;
                }
            }
            return true;
        }

        public static final boolean isInLimit(Long l, String str, Long l2) {
            str.getClass();
            long cents = toCents(str);
            if (l == null || cents >= l.longValue()) {
                return l2 == null || cents <= l2.longValue();
            }
            return false;
        }

        public static final long toCents(String str) {
            str.getClass();
            return MathKt__MathJVMKt.roundToLong(Double.parseDouble(str) * 100.0d);
        }

        public static final InChatPrompt toInChatPrompt(RealMoneybotPromptManager realMoneybotPromptManager, com.squareup.protos.cash.kgoose.api.v3.InChatPrompt inChatPrompt) {
            String str;
            String str2;
            inChatPrompt.getClass();
            MoneybotParsingErrorFactory moneybotParsingErrorFactory = MoneybotParsingErrorFactory.INSTANCE;
            try {
                String str3 = inChatPrompt.body_text;
                try {
                    ProtoValidationScope.required(str3, "body_text");
                    str = str3;
                } catch (Exception e) {
                    realMoneybotPromptManager.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(inChatPrompt.getClass()), moneybotParsingErrorFactory, null), realMoneybotPromptManager.getOneErrorPerAppSessionStrategy());
                    str = null;
                }
                if (str != null) {
                    UiAvatar uiAvatar = inChatPrompt.avatar;
                    String str4 = inChatPrompt.prompt;
                    try {
                        ProtoValidationScope.required(str4, "prompt");
                        str2 = str4;
                    } catch (Exception e2) {
                        realMoneybotPromptManager.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(inChatPrompt.getClass()), moneybotParsingErrorFactory, null), realMoneybotPromptManager.getOneErrorPerAppSessionStrategy());
                        str2 = null;
                    }
                    if (str2 != null) {
                        return new InChatPrompt(str, uiAvatar, str2, inChatPrompt.id, inChatPrompt.category);
                    }
                }
                return null;
            } catch (Exception e3) {
                throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.InChatPrompt.class), moneybotParsingErrorFactory, null);
            }
        }

        public static final String toRawAmount(long j) {
            String format2 = new DecimalFormat("0.##").format(j / 100.0d);
            format2.getClass();
            return format2;
        }

        public static final KeypadAmountChangedHandled handle(AmountChooserViewEvent.KeypadAmountChanged keypadAmountChanged, List list, Versioned versioned) {
            AmountSelectorOption copy$default;
            keypadAmountChanged.getClass();
            list.getClass();
            versioned.getClass();
            String str = keypadAmountChanged.rawNewAmount;
            boolean isCustom = isCustom(str, list);
            List<AmountSelectorOption> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (AmountSelectorOption amountSelectorOption : list2) {
                if (amountSelectorOption instanceof AmountSelectorOption.CustomAmountSelectorOption) {
                    copy$default = new AmountSelectorOption.CustomAmountSelectorOption(isCustom);
                } else if (amountSelectorOption instanceof AmountSelectorOption.PreSetAmountSelectorOption) {
                    AmountSelectorOption.PreSetAmountSelectorOption preSetAmountSelectorOption = (AmountSelectorOption.PreSetAmountSelectorOption) amountSelectorOption;
                    long cents = toCents(str);
                    Long l = preSetAmountSelectorOption.amount.amount;
                    l.getClass();
                    copy$default = AmountSelectorOption.PreSetAmountSelectorOption.copy$default(preSetAmountSelectorOption, cents == l.longValue());
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                arrayList.add(copy$default);
            }
            if (((Boolean) versioned.value).booleanValue()) {
                versioned = VersionedKt.update(versioned, Boolean.FALSE);
            }
            return new KeypadAmountChangedHandled(str, arrayList, versioned);
        }
    }
}
