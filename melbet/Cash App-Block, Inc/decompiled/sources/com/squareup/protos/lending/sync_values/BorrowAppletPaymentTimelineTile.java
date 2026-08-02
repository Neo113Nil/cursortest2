package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
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
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class BorrowAppletPaymentTimelineTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BorrowAppletPaymentTimelineTile> CREATOR;
    public final List tiles;

    public final class Data extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Data> CREATOR;
        public final Button button;
        public final String identifier;
        public final LoanRepaymentSelectionData repayment_selection;
        public final Timeline timeline;
        public final LocalizedString title;

        public final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;
            public final String action_url;
            public final Boolean enabled;
            public final LocalizedString text;

            static {
                BorrowAppletPaymentTimelineTile$Data$Button$Companion$ADAPTER$1 borrowAppletPaymentTimelineTile$Data$Button$Companion$ADAPTER$1 = new BorrowAppletPaymentTimelineTile$Data$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletPaymentTimelineTile.Data.Button", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = borrowAppletPaymentTimelineTile$Data$Button$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletPaymentTimelineTile$Data$Button$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(LocalizedString localizedString, Boolean bool, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.action_url = str;
                this.text = localizedString;
                this.enabled = bool;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.action_url, button.action_url) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.enabled, button.enabled);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.action_url;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.text;
                int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                Boolean bool = this.enabled;
                int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CardSpendingInsightsHome.EntryPoint.Builder builder = new CardSpendingInsightsHome.EntryPoint.Builder(2);
                builder.client_route = this.action_url;
                builder.preview_text = this.text;
                builder.visible = this.enabled;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.action_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
                }
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                Boolean bool = this.enabled;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }
        }

        static {
            BorrowAppletPaymentTimelineTile$Data$Companion$ADAPTER$1 borrowAppletPaymentTimelineTile$Data$Companion$ADAPTER$1 = new BorrowAppletPaymentTimelineTile$Data$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Data.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletPaymentTimelineTile.Data", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
            ADAPTER = borrowAppletPaymentTimelineTile$Data$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletPaymentTimelineTile$Data$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(LocalizedString localizedString, Timeline timeline, Button button, LoanRepaymentSelectionData loanRepaymentSelectionData, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.timeline = timeline;
            this.button = button;
            this.repayment_selection = loanRepaymentSelectionData;
            this.identifier = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.areEqual(unknownFields(), data.unknownFields()) && Intrinsics.areEqual(this.title, data.title) && Intrinsics.areEqual(this.timeline, data.timeline) && Intrinsics.areEqual(this.button, data.button) && Intrinsics.areEqual(this.repayment_selection, data.repayment_selection) && Intrinsics.areEqual(this.identifier, data.identifier);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Timeline timeline = this.timeline;
            int hashCode3 = (hashCode2 + (timeline != null ? timeline.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
            LoanRepaymentSelectionData loanRepaymentSelectionData = this.repayment_selection;
            int hashCode5 = (hashCode4 + (loanRepaymentSelectionData != null ? loanRepaymentSelectionData.hashCode() : 0)) * 37;
            String str = this.identifier;
            int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileAlias.Builder builder = new ProfileAlias.Builder(28, false);
            builder.alias = this.title;
            builder.verified = this.timeline;
            builder.expires_at = this.button;
            builder.version = this.repayment_selection;
            builder.display_date = this.identifier;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            Timeline timeline = this.timeline;
            if (timeline != null) {
                arrayList.add("timeline=" + timeline);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            LoanRepaymentSelectionData loanRepaymentSelectionData = this.repayment_selection;
            if (loanRepaymentSelectionData != null) {
                arrayList.add("repayment_selection=" + loanRepaymentSelectionData);
            }
            String str = this.identifier;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "identifier=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Data{", "}", 0, null, null, 56);
        }
    }

    static {
        BorrowAppletPaymentTimelineTile$Companion$ADAPTER$1 borrowAppletPaymentTimelineTile$Companion$ADAPTER$1 = new BorrowAppletPaymentTimelineTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BorrowAppletPaymentTimelineTile.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletPaymentTimelineTile", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = borrowAppletPaymentTimelineTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletPaymentTimelineTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowAppletPaymentTimelineTile(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.tiles = TransactorKt.immutableCopyOf("tiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BorrowAppletPaymentTimelineTile)) {
            return false;
        }
        BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile = (BorrowAppletPaymentTimelineTile) obj;
        return Intrinsics.areEqual(unknownFields(), borrowAppletPaymentTimelineTile.unknownFields()) && Intrinsics.areEqual(this.tiles, borrowAppletPaymentTimelineTile.tiles);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.tiles.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(14, false);
        builder.items = this.tiles;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.tiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tiles=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BorrowAppletPaymentTimelineTile{", "}", 0, null, null, 56);
    }
}
