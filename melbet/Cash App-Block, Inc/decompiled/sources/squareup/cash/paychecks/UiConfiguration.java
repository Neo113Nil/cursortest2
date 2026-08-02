package squareup.cash.paychecks;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;
import squareup.cash.bills.BillsConfig;
import squareup.cash.earnings.EarningTool;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.Collection;

/* loaded from: classes10.dex */
public final class UiConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiConfiguration> CREATOR;
    public final List destination_ui_configs;
    public final DistributionSummaryUi distribution_summary_ui;
    public final PaychecksHomeUi paychecks_home_ui;
    public final List product_tint_wheel_color_lists;
    public final ReceiptUi receipt_ui;

    public final class DestinationUiConfiguration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DestinationUiConfiguration> CREATOR;
        public final AllocationDestination destination;
        public final DestinationUiConfigurationValues ui_config_values;

        public final class DestinationUiConfigurationValues extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DestinationUiConfigurationValues> CREATOR;
            public final Icon icon;
            public final LocalizedString name;
            public final Color tint_color;

            static {
                UiConfiguration$DestinationUiConfiguration$DestinationUiConfigurationValues$Companion$ADAPTER$1 uiConfiguration$DestinationUiConfiguration$DestinationUiConfigurationValues$Companion$ADAPTER$1 = new UiConfiguration$DestinationUiConfiguration$DestinationUiConfigurationValues$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DestinationUiConfigurationValues.class), "type.googleapis.com/squareup.cash.paychecks.UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues", Syntax.PROTO_2, null, "squareup/cash/paychecks/UiConfiguration.proto");
                ADAPTER = uiConfiguration$DestinationUiConfiguration$DestinationUiConfigurationValues$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(uiConfiguration$DestinationUiConfiguration$DestinationUiConfigurationValues$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DestinationUiConfigurationValues(Color color, LocalizedString localizedString, Icon icon, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.tint_color = color;
                this.name = localizedString;
                this.icon = icon;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DestinationUiConfigurationValues)) {
                    return false;
                }
                DestinationUiConfigurationValues destinationUiConfigurationValues = (DestinationUiConfigurationValues) obj;
                return Intrinsics.areEqual(unknownFields(), destinationUiConfigurationValues.unknownFields()) && Intrinsics.areEqual(this.tint_color, destinationUiConfigurationValues.tint_color) && Intrinsics.areEqual(this.name, destinationUiConfigurationValues.name) && Intrinsics.areEqual(this.icon, destinationUiConfigurationValues.icon);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Color color = this.tint_color;
                int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.name;
                int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode4 = hashCode3 + (icon != null ? icon.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BillsApplet.Builder builder = new BillsApplet.Builder(23);
                builder.action = this.tint_color;
                builder.full_applet = this.name;
                builder.half_applet = this.icon;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Color color = this.tint_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
                }
                LocalizedString localizedString = this.name;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("name=", localizedString, arrayList);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DestinationUiConfigurationValues{", "}", 0, null, null, 56);
            }
        }

        static {
            UiConfiguration$DestinationUiConfiguration$Companion$ADAPTER$1 uiConfiguration$DestinationUiConfiguration$Companion$ADAPTER$1 = new UiConfiguration$DestinationUiConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DestinationUiConfiguration.class), "type.googleapis.com/squareup.cash.paychecks.UiConfiguration.DestinationUiConfiguration", Syntax.PROTO_2, null, "squareup/cash/paychecks/UiConfiguration.proto");
            ADAPTER = uiConfiguration$DestinationUiConfiguration$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiConfiguration$DestinationUiConfiguration$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DestinationUiConfiguration(AllocationDestination allocationDestination, DestinationUiConfigurationValues destinationUiConfigurationValues, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.destination = allocationDestination;
            this.ui_config_values = destinationUiConfigurationValues;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DestinationUiConfiguration)) {
                return false;
            }
            DestinationUiConfiguration destinationUiConfiguration = (DestinationUiConfiguration) obj;
            return Intrinsics.areEqual(unknownFields(), destinationUiConfiguration.unknownFields()) && Intrinsics.areEqual(this.destination, destinationUiConfiguration.destination) && Intrinsics.areEqual(this.ui_config_values, destinationUiConfiguration.ui_config_values);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AllocationDestination allocationDestination = this.destination;
            int hashCode2 = (hashCode + (allocationDestination != null ? allocationDestination.hashCode() : 0)) * 37;
            DestinationUiConfigurationValues destinationUiConfigurationValues = this.ui_config_values;
            int hashCode3 = hashCode2 + (destinationUiConfigurationValues != null ? destinationUiConfigurationValues.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(21);
            builder.bills_applet_default_action = this.destination;
            builder.half_applet_content = this.ui_config_values;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AllocationDestination allocationDestination = this.destination;
            if (allocationDestination != null) {
                arrayList.add("destination=" + allocationDestination);
            }
            DestinationUiConfigurationValues destinationUiConfigurationValues = this.ui_config_values;
            if (destinationUiConfigurationValues != null) {
                arrayList.add("ui_config_values=" + destinationUiConfigurationValues);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DestinationUiConfiguration{", "}", 0, null, null, 56);
        }
    }

    public final class ReceiptUi extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ReceiptUi> CREATOR;
        public final AlertUi remove_from_paychecks_alert;

        static {
            UiConfiguration$ReceiptUi$Companion$ADAPTER$1 uiConfiguration$ReceiptUi$Companion$ADAPTER$1 = new UiConfiguration$ReceiptUi$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReceiptUi.class), "type.googleapis.com/squareup.cash.paychecks.UiConfiguration.ReceiptUi", Syntax.PROTO_2, null, "squareup/cash/paychecks/UiConfiguration.proto");
            ADAPTER = uiConfiguration$ReceiptUi$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiConfiguration$ReceiptUi$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiptUi(AlertUi alertUi, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.remove_from_paychecks_alert = alertUi;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReceiptUi)) {
                return false;
            }
            ReceiptUi receiptUi = (ReceiptUi) obj;
            return Intrinsics.areEqual(unknownFields(), receiptUi.unknownFields()) && Intrinsics.areEqual(this.remove_from_paychecks_alert, receiptUi.remove_from_paychecks_alert);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AlertUi alertUi = this.remove_from_paychecks_alert;
            int hashCode2 = hashCode + (alertUi != null ? alertUi.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningTool.Builder builder = new EarningTool.Builder(20);
            builder.tool = this.remove_from_paychecks_alert;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AlertUi alertUi = this.remove_from_paychecks_alert;
            if (alertUi != null) {
                arrayList.add("remove_from_paychecks_alert=" + alertUi);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ReceiptUi{", "}", 0, null, null, 56);
        }
    }

    public final class WheelColorList extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<WheelColorList> CREATOR;
        public final List product_tint_wheel_color_list;

        static {
            UiConfiguration$WheelColorList$Companion$ADAPTER$1 uiConfiguration$WheelColorList$Companion$ADAPTER$1 = new UiConfiguration$WheelColorList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WheelColorList.class), "type.googleapis.com/squareup.cash.paychecks.UiConfiguration.WheelColorList", Syntax.PROTO_2, null, "squareup/cash/paychecks/UiConfiguration.proto");
            ADAPTER = uiConfiguration$WheelColorList$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiConfiguration$WheelColorList$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WheelColorList(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.product_tint_wheel_color_list = TransactorKt.immutableCopyOf("product_tint_wheel_color_list", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WheelColorList)) {
                return false;
            }
            WheelColorList wheelColorList = (WheelColorList) obj;
            return Intrinsics.areEqual(unknownFields(), wheelColorList.unknownFields()) && Intrinsics.areEqual(this.product_tint_wheel_color_list, wheelColorList.product_tint_wheel_color_list);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.product_tint_wheel_color_list.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Collection.Builder builder = new Collection.Builder(25, false);
            builder.items = this.product_tint_wheel_color_list;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.product_tint_wheel_color_list;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("product_tint_wheel_color_list=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "WheelColorList{", "}", 0, null, null, 56);
        }
    }

    static {
        UiConfiguration$Companion$ADAPTER$1 uiConfiguration$Companion$ADAPTER$1 = new UiConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiConfiguration.class), "type.googleapis.com/squareup.cash.paychecks.UiConfiguration", Syntax.PROTO_2, null, "squareup/cash/paychecks/UiConfiguration.proto");
        ADAPTER = uiConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiConfiguration(List list, PaychecksHomeUi paychecksHomeUi, DistributionSummaryUi distributionSummaryUi, ReceiptUi receiptUi, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.paychecks_home_ui = paychecksHomeUi;
        this.distribution_summary_ui = distributionSummaryUi;
        this.receipt_ui = receiptUi;
        this.destination_ui_configs = TransactorKt.immutableCopyOf("destination_ui_configs", list);
        this.product_tint_wheel_color_lists = TransactorKt.immutableCopyOf("product_tint_wheel_color_lists", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiConfiguration)) {
            return false;
        }
        UiConfiguration uiConfiguration = (UiConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), uiConfiguration.unknownFields()) && Intrinsics.areEqual(this.destination_ui_configs, uiConfiguration.destination_ui_configs) && Intrinsics.areEqual(this.paychecks_home_ui, uiConfiguration.paychecks_home_ui) && Intrinsics.areEqual(this.distribution_summary_ui, uiConfiguration.distribution_summary_ui) && Intrinsics.areEqual(this.receipt_ui, uiConfiguration.receipt_ui) && Intrinsics.areEqual(this.product_tint_wheel_color_lists, uiConfiguration.product_tint_wheel_color_lists);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.destination_ui_configs);
        PaychecksHomeUi paychecksHomeUi = this.paychecks_home_ui;
        int hashCode = (m + (paychecksHomeUi != null ? paychecksHomeUi.hashCode() : 0)) * 37;
        DistributionSummaryUi distributionSummaryUi = this.distribution_summary_ui;
        int hashCode2 = (hashCode + (distributionSummaryUi != null ? distributionSummaryUi.hashCode() : 0)) * 37;
        ReceiptUi receiptUi = this.receipt_ui;
        int hashCode3 = this.product_tint_wheel_color_lists.hashCode() + ((hashCode2 + (receiptUi != null ? receiptUi.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(20);
        builder.key_path = this.destination_ui_configs;
        builder.get_transform = this.paychecks_home_ui;
        builder.set_transform = this.distribution_summary_ui;
        builder.validation = this.receipt_ui;
        builder.on_invalid = this.product_tint_wheel_color_lists;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.destination_ui_configs;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("destination_ui_configs=", arrayList, list);
        }
        PaychecksHomeUi paychecksHomeUi = this.paychecks_home_ui;
        if (paychecksHomeUi != null) {
            arrayList.add("paychecks_home_ui=" + paychecksHomeUi);
        }
        DistributionSummaryUi distributionSummaryUi = this.distribution_summary_ui;
        if (distributionSummaryUi != null) {
            arrayList.add("distribution_summary_ui=" + distributionSummaryUi);
        }
        ReceiptUi receiptUi = this.receipt_ui;
        if (receiptUi != null) {
            arrayList.add("receipt_ui=" + receiptUi);
        }
        List list2 = this.product_tint_wheel_color_lists;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("product_tint_wheel_color_lists=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiConfiguration{", "}", 0, null, null, 56);
    }
}
