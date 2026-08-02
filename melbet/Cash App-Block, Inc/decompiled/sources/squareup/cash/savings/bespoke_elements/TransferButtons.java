package squareup.cash.savings.bespoke_elements;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.bills.BillsApplet;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;
import squareup.cash.wires.WiresAccountInfo;
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class TransferButtons extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TransferButtons> CREATOR;
    public final ButtonDefaultGroup button_group;
    public final ClientRouteTemplate transfer_in_button_client_route_template;
    public final Long transfer_in_button_index;
    public final TransferInConfig transfer_in_config;
    public final ClientRouteTemplate transfer_out_button_client_route_template;
    public final Long transfer_out_button_index;
    public final TransferOutConfig transfer_out_config;

    public enum AlternativeButtonBehavior implements WireEnum {
        CLIENT_COULD_NOT_PARSE_ALT_BUTTON_BEHAVIOR(0),
        SHAKE_BALANCE(1);

        public static final TransferButtons$AlternativeButtonBehavior$Companion$ADAPTER$1 ADAPTER;
        public static final KClasses$$Lambda$1 Companion;
        public final int value;

        static {
            AlternativeButtonBehavior alternativeButtonBehavior = CLIENT_COULD_NOT_PARSE_ALT_BUTTON_BEHAVIOR;
            Companion = new KClasses$$Lambda$1(29);
            ADAPTER = new TransferButtons$AlternativeButtonBehavior$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AlternativeButtonBehavior.class), Syntax.PROTO_2, alternativeButtonBehavior);
        }

        AlternativeButtonBehavior(int i) {
            this.value = i;
        }

        public static final AlternativeButtonBehavior fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return CLIENT_COULD_NOT_PARSE_ALT_BUTTON_BEHAVIOR;
            }
            if (i != 1) {
                return null;
            }
            return SHAKE_BALANCE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class TransferInConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TransferInConfig> CREATOR;
        public final CdfEvent cdfEvent;
        public final Money initially_selected_amount;
        public final Money maximum_amount;
        public final Money minimum_amount;
        public final List quick_amounts;

        static {
            TransferButtons$TransferInConfig$Companion$ADAPTER$1 transferButtons$TransferInConfig$Companion$ADAPTER$1 = new TransferButtons$TransferInConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransferInConfig.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.TransferButtons.TransferInConfig", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/TransferButtons.proto");
            ADAPTER = transferButtons$TransferInConfig$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(transferButtons$TransferInConfig$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferInConfig(CdfEvent cdfEvent, List list, Money money, Money money2, Money money3, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.cdfEvent = cdfEvent;
            this.initially_selected_amount = money;
            this.minimum_amount = money2;
            this.maximum_amount = money3;
            this.quick_amounts = TransactorKt.immutableCopyOf("quick_amounts", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TransferInConfig)) {
                return false;
            }
            TransferInConfig transferInConfig = (TransferInConfig) obj;
            return Intrinsics.areEqual(unknownFields(), transferInConfig.unknownFields()) && Intrinsics.areEqual(this.cdfEvent, transferInConfig.cdfEvent) && Intrinsics.areEqual(this.quick_amounts, transferInConfig.quick_amounts) && Intrinsics.areEqual(this.initially_selected_amount, transferInConfig.initially_selected_amount) && Intrinsics.areEqual(this.minimum_amount, transferInConfig.minimum_amount) && Intrinsics.areEqual(this.maximum_amount, transferInConfig.maximum_amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CdfEvent cdfEvent = this.cdfEvent;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (cdfEvent != null ? cdfEvent.hashCode() : 0)) * 37, 37, this.quick_amounts);
            Money money = this.initially_selected_amount;
            int hashCode2 = (m + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.minimum_amount;
            int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Money money3 = this.maximum_amount;
            int hashCode4 = hashCode3 + (money3 != null ? money3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Binding.Builder builder = new Binding.Builder(25);
            builder.key_path = this.cdfEvent;
            builder.get_transform = this.quick_amounts;
            builder.set_transform = this.initially_selected_amount;
            builder.validation = this.minimum_amount;
            builder.on_invalid = this.maximum_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CdfEvent cdfEvent = this.cdfEvent;
            if (cdfEvent != null) {
                arrayList.add("cdfEvent=" + cdfEvent);
            }
            List list = this.quick_amounts;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("quick_amounts=", arrayList, list);
            }
            Money money = this.initially_selected_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("initially_selected_amount=", money, arrayList);
            }
            Money money2 = this.minimum_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("minimum_amount=", money2, arrayList);
            }
            Money money3 = this.maximum_amount;
            if (money3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("maximum_amount=", money3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TransferInConfig{", "}", 0, null, null, 56);
        }
    }

    public final class TransferOutConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TransferOutConfig> CREATOR;
        public final CdfEvent cdfEvent;
        public final Money minimum_amount;
        public final AlternativeButtonBehavior zero_balance_behavior;

        static {
            TransferButtons$TransferOutConfig$Companion$ADAPTER$1 transferButtons$TransferOutConfig$Companion$ADAPTER$1 = new TransferButtons$TransferOutConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransferOutConfig.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.TransferButtons.TransferOutConfig", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/TransferButtons.proto");
            ADAPTER = transferButtons$TransferOutConfig$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(transferButtons$TransferOutConfig$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferOutConfig(CdfEvent cdfEvent, Money money, AlternativeButtonBehavior alternativeButtonBehavior, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.cdfEvent = cdfEvent;
            this.minimum_amount = money;
            this.zero_balance_behavior = alternativeButtonBehavior;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TransferOutConfig)) {
                return false;
            }
            TransferOutConfig transferOutConfig = (TransferOutConfig) obj;
            return Intrinsics.areEqual(unknownFields(), transferOutConfig.unknownFields()) && Intrinsics.areEqual(this.cdfEvent, transferOutConfig.cdfEvent) && Intrinsics.areEqual(this.minimum_amount, transferOutConfig.minimum_amount) && this.zero_balance_behavior == transferOutConfig.zero_balance_behavior;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CdfEvent cdfEvent = this.cdfEvent;
            int hashCode2 = (hashCode + (cdfEvent != null ? cdfEvent.hashCode() : 0)) * 37;
            Money money = this.minimum_amount;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            AlternativeButtonBehavior alternativeButtonBehavior = this.zero_balance_behavior;
            int hashCode4 = hashCode3 + (alternativeButtonBehavior != null ? alternativeButtonBehavior.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.Builder builder = new BillsApplet.Builder(27);
            builder.action = this.cdfEvent;
            builder.full_applet = this.minimum_amount;
            builder.half_applet = this.zero_balance_behavior;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CdfEvent cdfEvent = this.cdfEvent;
            if (cdfEvent != null) {
                arrayList.add("cdfEvent=" + cdfEvent);
            }
            Money money = this.minimum_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("minimum_amount=", money, arrayList);
            }
            AlternativeButtonBehavior alternativeButtonBehavior = this.zero_balance_behavior;
            if (alternativeButtonBehavior != null) {
                arrayList.add("zero_balance_behavior=" + alternativeButtonBehavior);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TransferOutConfig{", "}", 0, null, null, 56);
        }
    }

    static {
        TransferButtons$Companion$ADAPTER$1 transferButtons$Companion$ADAPTER$1 = new TransferButtons$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransferButtons.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.TransferButtons", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/TransferButtons.proto");
        ADAPTER = transferButtons$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(transferButtons$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferButtons(ButtonDefaultGroup buttonDefaultGroup, Long l, TransferInConfig transferInConfig, Long l2, TransferOutConfig transferOutConfig, ClientRouteTemplate clientRouteTemplate, ClientRouteTemplate clientRouteTemplate2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.button_group = buttonDefaultGroup;
        this.transfer_in_button_index = l;
        this.transfer_in_config = transferInConfig;
        this.transfer_out_button_index = l2;
        this.transfer_out_config = transferOutConfig;
        this.transfer_in_button_client_route_template = clientRouteTemplate;
        this.transfer_out_button_client_route_template = clientRouteTemplate2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransferButtons)) {
            return false;
        }
        TransferButtons transferButtons = (TransferButtons) obj;
        return Intrinsics.areEqual(unknownFields(), transferButtons.unknownFields()) && Intrinsics.areEqual(this.button_group, transferButtons.button_group) && Intrinsics.areEqual(this.transfer_in_button_index, transferButtons.transfer_in_button_index) && Intrinsics.areEqual(this.transfer_in_config, transferButtons.transfer_in_config) && Intrinsics.areEqual(this.transfer_out_button_index, transferButtons.transfer_out_button_index) && Intrinsics.areEqual(this.transfer_out_config, transferButtons.transfer_out_config) && Intrinsics.areEqual(this.transfer_in_button_client_route_template, transferButtons.transfer_in_button_client_route_template) && Intrinsics.areEqual(this.transfer_out_button_client_route_template, transferButtons.transfer_out_button_client_route_template);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ButtonDefaultGroup buttonDefaultGroup = this.button_group;
        int hashCode2 = (hashCode + (buttonDefaultGroup != null ? buttonDefaultGroup.hashCode() : 0)) * 37;
        Long l = this.transfer_in_button_index;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        TransferInConfig transferInConfig = this.transfer_in_config;
        int hashCode4 = (hashCode3 + (transferInConfig != null ? transferInConfig.hashCode() : 0)) * 37;
        Long l2 = this.transfer_out_button_index;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        TransferOutConfig transferOutConfig = this.transfer_out_config;
        int hashCode6 = (hashCode5 + (transferOutConfig != null ? transferOutConfig.hashCode() : 0)) * 37;
        ClientRouteTemplate clientRouteTemplate = this.transfer_in_button_client_route_template;
        int hashCode7 = (hashCode6 + (clientRouteTemplate != null ? clientRouteTemplate.hashCode() : 0)) * 37;
        ClientRouteTemplate clientRouteTemplate2 = this.transfer_out_button_client_route_template;
        int hashCode8 = hashCode7 + (clientRouteTemplate2 != null ? clientRouteTemplate2.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WiresAccountInfo.Builder builder = new WiresAccountInfo.Builder(1);
        builder.routing_number = this.button_group;
        builder.account_number = this.transfer_in_button_index;
        builder.customer_name = this.transfer_in_config;
        builder.bank_address = this.transfer_out_button_index;
        builder.client_scenario = this.transfer_out_config;
        builder.action = this.transfer_in_button_client_route_template;
        builder.wires_profile = this.transfer_out_button_client_route_template;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ButtonDefaultGroup buttonDefaultGroup = this.button_group;
        if (buttonDefaultGroup != null) {
            arrayList.add("button_group=" + buttonDefaultGroup);
        }
        Long l = this.transfer_in_button_index;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("transfer_in_button_index=", l, arrayList);
        }
        TransferInConfig transferInConfig = this.transfer_in_config;
        if (transferInConfig != null) {
            arrayList.add("transfer_in_config=" + transferInConfig);
        }
        Long l2 = this.transfer_out_button_index;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("transfer_out_button_index=", l2, arrayList);
        }
        TransferOutConfig transferOutConfig = this.transfer_out_config;
        if (transferOutConfig != null) {
            arrayList.add("transfer_out_config=" + transferOutConfig);
        }
        ClientRouteTemplate clientRouteTemplate = this.transfer_in_button_client_route_template;
        if (clientRouteTemplate != null) {
            arrayList.add("transfer_in_button_client_route_template=" + clientRouteTemplate);
        }
        ClientRouteTemplate clientRouteTemplate2 = this.transfer_out_button_client_route_template;
        if (clientRouteTemplate2 != null) {
            arrayList.add("transfer_out_button_client_route_template=" + clientRouteTemplate2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransferButtons{", "}", 0, null, null, 56);
    }
}
