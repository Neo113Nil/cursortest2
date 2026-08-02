package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzjh;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.rewardly.ui.AppLinks;
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
import squareup.cash.savings.SavingsConfig;
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class BorrowAppletLoanHistoryTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BorrowAppletLoanHistoryTile> CREATOR;
    public final List tiles;

    static {
        BorrowAppletLoanHistoryTile$Companion$ADAPTER$1 borrowAppletLoanHistoryTile$Companion$ADAPTER$1 = new BorrowAppletLoanHistoryTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BorrowAppletLoanHistoryTile.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLoanHistoryTile", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = borrowAppletLoanHistoryTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLoanHistoryTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowAppletLoanHistoryTile(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.tiles = TransactorKt.immutableCopyOf("tiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BorrowAppletLoanHistoryTile)) {
            return false;
        }
        BorrowAppletLoanHistoryTile borrowAppletLoanHistoryTile = (BorrowAppletLoanHistoryTile) obj;
        return Intrinsics.areEqual(unknownFields(), borrowAppletLoanHistoryTile.unknownFields()) && Intrinsics.areEqual(this.tiles, borrowAppletLoanHistoryTile.tiles);
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
        Collection.Builder builder = new Collection.Builder(13, false);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "BorrowAppletLoanHistoryTile{", "}", 0, null, null, 56);
    }

    public final class Data extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Data> CREATOR;
        public final ExpandedLoanListViewData expanded_loan_list_view_data;
        public final List loans;
        public final LocalizedString title;

        public final class ExpandedLoanListViewData extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ExpandedLoanListViewData> CREATOR;
            public final LocalizedString expand_button_title;
            public final LocalizedString history_tile_expand_button_title;
            public final LocalizedString list_header;
            public final LocalizedString title;

            static {
                BorrowAppletLoanHistoryTile$Data$ExpandedLoanListViewData$Companion$ADAPTER$1 borrowAppletLoanHistoryTile$Data$ExpandedLoanListViewData$Companion$ADAPTER$1 = new BorrowAppletLoanHistoryTile$Data$ExpandedLoanListViewData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExpandedLoanListViewData.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = borrowAppletLoanHistoryTile$Data$ExpandedLoanListViewData$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLoanHistoryTile$Data$ExpandedLoanListViewData$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExpandedLoanListViewData(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.expand_button_title = localizedString;
                this.title = localizedString2;
                this.list_header = localizedString3;
                this.history_tile_expand_button_title = localizedString4;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ExpandedLoanListViewData)) {
                    return false;
                }
                ExpandedLoanListViewData expandedLoanListViewData = (ExpandedLoanListViewData) obj;
                return Intrinsics.areEqual(unknownFields(), expandedLoanListViewData.unknownFields()) && Intrinsics.areEqual(this.expand_button_title, expandedLoanListViewData.expand_button_title) && Intrinsics.areEqual(this.title, expandedLoanListViewData.title) && Intrinsics.areEqual(this.list_header, expandedLoanListViewData.list_header) && Intrinsics.areEqual(this.history_tile_expand_button_title, expandedLoanListViewData.history_tile_expand_button_title);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.expand_button_title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.title;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.list_header;
                int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                LocalizedString localizedString4 = this.history_tile_expand_button_title;
                int hashCode5 = hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield.Builder builder = new SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield.Builder(1);
                builder.yield_earn_up_to_enhanced = this.expand_button_title;
                builder.yield_subtitle_earn_enhanced = this.title;
                builder.yield_current_rate_standard = this.list_header;
                builder.yield_current_rate_enhanced = this.history_tile_expand_button_title;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.expand_button_title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("expand_button_title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.title;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString2, arrayList);
                }
                LocalizedString localizedString3 = this.list_header;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("list_header=", localizedString3, arrayList);
                }
                LocalizedString localizedString4 = this.history_tile_expand_button_title;
                if (localizedString4 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("history_tile_expand_button_title=", localizedString4, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ExpandedLoanListViewData{", "}", 0, null, null, 56);
            }
        }

        static {
            BorrowAppletLoanHistoryTile$Data$Companion$ADAPTER$1 borrowAppletLoanHistoryTile$Data$Companion$ADAPTER$1 = new BorrowAppletLoanHistoryTile$Data$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Data.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLoanHistoryTile.Data", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
            ADAPTER = borrowAppletLoanHistoryTile$Data$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLoanHistoryTile$Data$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(LocalizedString localizedString, List list, ExpandedLoanListViewData expandedLoanListViewData, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.expanded_loan_list_view_data = expandedLoanListViewData;
            this.loans = TransactorKt.immutableCopyOf("loans", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.areEqual(unknownFields(), data.unknownFields()) && Intrinsics.areEqual(this.title, data.title) && Intrinsics.areEqual(this.loans, data.loans) && Intrinsics.areEqual(this.expanded_loan_list_view_data, data.expanded_loan_list_view_data);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.loans);
            ExpandedLoanListViewData expandedLoanListViewData = this.expanded_loan_list_view_data;
            int hashCode2 = m + (expandedLoanListViewData != null ? expandedLoanListViewData.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Options.Builder builder = new GiftCard.Options.Builder(16);
            builder.label = this.title;
            builder.localizable_label = this.loans;
            builder.client_scenario = this.expanded_loan_list_view_data;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            List list = this.loans;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("loans=", arrayList, list);
            }
            ExpandedLoanListViewData expandedLoanListViewData = this.expanded_loan_list_view_data;
            if (expandedLoanListViewData != null) {
                arrayList.add("expanded_loan_list_view_data=" + expandedLoanListViewData);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Data{", "}", 0, null, null, 56);
        }

        public final class Loan extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Loan> CREATOR;
            public final String legacy_reference_token;
            public final Details loan_details;
            public final LocalizedString primary_text;
            public final LocalizedString right_text;
            public final LocalizedString secondary_text;
            public final Color secondary_text_tint_color;

            static {
                BorrowAppletLoanHistoryTile$Data$Loan$Companion$ADAPTER$1 borrowAppletLoanHistoryTile$Data$Loan$Companion$ADAPTER$1 = new BorrowAppletLoanHistoryTile$Data$Loan$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Loan.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLoanHistoryTile.Data.Loan", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = borrowAppletLoanHistoryTile$Data$Loan$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLoanHistoryTile$Data$Loan$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Loan(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, Details details, String str, Color color, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.primary_text = localizedString;
                this.secondary_text = localizedString2;
                this.right_text = localizedString3;
                this.loan_details = details;
                this.legacy_reference_token = str;
                this.secondary_text_tint_color = color;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Loan)) {
                    return false;
                }
                Loan loan = (Loan) obj;
                return Intrinsics.areEqual(unknownFields(), loan.unknownFields()) && Intrinsics.areEqual(this.primary_text, loan.primary_text) && Intrinsics.areEqual(this.secondary_text, loan.secondary_text) && Intrinsics.areEqual(this.right_text, loan.right_text) && Intrinsics.areEqual(this.loan_details, loan.loan_details) && Intrinsics.areEqual(this.legacy_reference_token, loan.legacy_reference_token) && Intrinsics.areEqual(this.secondary_text_tint_color, loan.secondary_text_tint_color);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.primary_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.secondary_text;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.right_text;
                int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                Details details = this.loan_details;
                int hashCode5 = (hashCode4 + (details != null ? details.hashCode() : 0)) * 37;
                String str = this.legacy_reference_token;
                int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
                Color color = this.secondary_text_tint_color;
                int hashCode7 = hashCode6 + (color != null ? color.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiPublicProfile.Builder builder = new UiPublicProfile.Builder(19, false);
                builder.photo_url = this.primary_text;
                builder.synopsis = this.secondary_text;
                builder.full_cashtag = this.right_text;
                builder.cashtag_url_enabled = this.loan_details;
                builder.full_name = this.legacy_reference_token;
                builder.is_verified_account = this.secondary_text_tint_color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.primary_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("primary_text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.secondary_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("secondary_text=", localizedString2, arrayList);
                }
                LocalizedString localizedString3 = this.right_text;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("right_text=", localizedString3, arrayList);
                }
                Details details = this.loan_details;
                if (details != null) {
                    arrayList.add("loan_details=" + details);
                }
                String str = this.legacy_reference_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "legacy_reference_token=", arrayList);
                }
                Color color = this.secondary_text_tint_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary_text_tint_color=", color, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Loan{", "}", 0, null, null, 56);
            }

            public final class Details extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Details> CREATOR;
                public final String cdf_variant;
                public final LocalizedString details_button_title;
                public final LocalizedString primary_text;
                public final ButtonData repayment_button_data;
                public final List rows;
                public final LocalizedString secondary_text;
                public final Color secondary_text_tint_color;
                public final Timeline timeline;
                public final LocalizedString timeline_button_title;

                public final class ButtonData extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<ButtonData> CREATOR;
                    public final zzjh routing;
                    public final LocalizedString title;

                    static {
                        BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Companion$ADAPTER$1 borrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Companion$ADAPTER$1 = new BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonData.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                        ADAPTER = borrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ButtonData(LocalizedString localizedString, zzjh zzjhVar, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.title = localizedString;
                        this.routing = zzjhVar;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ButtonData)) {
                            return false;
                        }
                        ButtonData buttonData = (ButtonData) obj;
                        return Intrinsics.areEqual(unknownFields(), buttonData.unknownFields()) && Intrinsics.areEqual(this.title, buttonData.title) && Intrinsics.areEqual(this.routing, buttonData.routing);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        LocalizedString localizedString = this.title;
                        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                        zzjh zzjhVar = this.routing;
                        int hashCode3 = hashCode2 + (zzjhVar != null ? zzjhVar.hashCode() : 0);
                        this.hashCode = hashCode3;
                        return hashCode3;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        AppLinks.Builder builder = new AppLinks.Builder(13);
                        builder.f1411android = this.title;
                        builder.ios = this.routing;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        LocalizedString localizedString = this.title;
                        if (localizedString != null) {
                            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                        }
                        zzjh zzjhVar = this.routing;
                        if (zzjhVar != null) {
                            arrayList.add("routing=" + zzjhVar);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonData{", "}", 0, null, null, 56);
                    }
                }

                static {
                    BorrowAppletLoanHistoryTile$Data$Loan$Details$Companion$ADAPTER$1 borrowAppletLoanHistoryTile$Data$Loan$Details$Companion$ADAPTER$1 = new BorrowAppletLoanHistoryTile$Data$Loan$Details$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Details.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLoanHistoryTile.Data.Loan.Details", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = borrowAppletLoanHistoryTile$Data$Loan$Details$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLoanHistoryTile$Data$Loan$Details$Companion$ADAPTER$1);
                }

                public Details(LocalizedString localizedString, LocalizedString localizedString2, List list, Timeline timeline, LocalizedString localizedString3, LocalizedString localizedString4, ButtonData buttonData, int i) {
                    this(localizedString, localizedString2, list, timeline, localizedString3, localizedString4, (i & 64) != 0 ? null : buttonData, null, (i & 256) == 0 ? "chevron-selfserve-off" : null, ByteString.EMPTY);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v14, types: [java.util.List] */
                public static Details copy$default(Details details, LocalizedString localizedString, LocalizedString localizedString2, ArrayList arrayList, Timeline timeline, LocalizedString localizedString3, LocalizedString localizedString4, ButtonData buttonData, Color color, ByteString byteString, int i) {
                    if ((i & 1) != 0) {
                        localizedString = details.primary_text;
                    }
                    LocalizedString localizedString5 = localizedString;
                    if ((i & 2) != 0) {
                        localizedString2 = details.secondary_text;
                    }
                    LocalizedString localizedString6 = localizedString2;
                    ArrayList arrayList2 = (i & 4) != 0 ? details.rows : arrayList;
                    LocalizedString localizedString7 = (i & 16) != 0 ? details.timeline_button_title : localizedString3;
                    LocalizedString localizedString8 = (i & 32) != 0 ? details.details_button_title : localizedString4;
                    ButtonData buttonData2 = (i & 64) != 0 ? details.repayment_button_data : buttonData;
                    Color color2 = (i & 128) != 0 ? details.secondary_text_tint_color : color;
                    String str = details.cdf_variant;
                    ByteString unknownFields = (i & 512) != 0 ? details.unknownFields() : byteString;
                    details.getClass();
                    arrayList2.getClass();
                    unknownFields.getClass();
                    return new Details(localizedString5, localizedString6, arrayList2, timeline, localizedString7, localizedString8, buttonData2, color2, str, unknownFields);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Details)) {
                        return false;
                    }
                    Details details = (Details) obj;
                    return Intrinsics.areEqual(unknownFields(), details.unknownFields()) && Intrinsics.areEqual(this.primary_text, details.primary_text) && Intrinsics.areEqual(this.secondary_text, details.secondary_text) && Intrinsics.areEqual(this.rows, details.rows) && Intrinsics.areEqual(this.timeline, details.timeline) && Intrinsics.areEqual(this.timeline_button_title, details.timeline_button_title) && Intrinsics.areEqual(this.details_button_title, details.details_button_title) && Intrinsics.areEqual(this.repayment_button_data, details.repayment_button_data) && Intrinsics.areEqual(this.secondary_text_tint_color, details.secondary_text_tint_color) && Intrinsics.areEqual(this.cdf_variant, details.cdf_variant);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalizedString localizedString = this.primary_text;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    LocalizedString localizedString2 = this.secondary_text;
                    int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.rows);
                    Timeline timeline = this.timeline;
                    int hashCode3 = (m + (timeline != null ? timeline.hashCode() : 0)) * 37;
                    LocalizedString localizedString3 = this.timeline_button_title;
                    int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                    LocalizedString localizedString4 = this.details_button_title;
                    int hashCode5 = (hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
                    ButtonData buttonData = this.repayment_button_data;
                    int hashCode6 = (hashCode5 + (buttonData != null ? buttonData.hashCode() : 0)) * 37;
                    Color color = this.secondary_text_tint_color;
                    int hashCode7 = (hashCode6 + (color != null ? color.hashCode() : 0)) * 37;
                    String str = this.cdf_variant;
                    int hashCode8 = hashCode7 + (str != null ? str.hashCode() : 0);
                    this.hashCode = hashCode8;
                    return hashCode8;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Transfer.Builder builder = new Transfer.Builder(14, false);
                    builder.source = this.primary_text;
                    builder.target = this.secondary_text;
                    builder.state = this.rows;
                    builder.amount = this.timeline;
                    builder.push_amount = this.timeline_button_title;
                    builder.created_at = this.details_button_title;
                    builder.completed_at = this.repayment_button_data;
                    builder.failed_at = this.secondary_text_tint_color;
                    builder.token = this.cdf_variant;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalizedString localizedString = this.primary_text;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("primary_text=", localizedString, arrayList);
                    }
                    LocalizedString localizedString2 = this.secondary_text;
                    if (localizedString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("secondary_text=", localizedString2, arrayList);
                    }
                    List list = this.rows;
                    if (!list.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
                    }
                    Timeline timeline = this.timeline;
                    if (timeline != null) {
                        arrayList.add("timeline=" + timeline);
                    }
                    LocalizedString localizedString3 = this.timeline_button_title;
                    if (localizedString3 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("timeline_button_title=", localizedString3, arrayList);
                    }
                    LocalizedString localizedString4 = this.details_button_title;
                    if (localizedString4 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("details_button_title=", localizedString4, arrayList);
                    }
                    ButtonData buttonData = this.repayment_button_data;
                    if (buttonData != null) {
                        arrayList.add("repayment_button_data=" + buttonData);
                    }
                    Color color = this.secondary_text_tint_color;
                    if (color != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary_text_tint_color=", color, arrayList);
                    }
                    String str = this.cdf_variant;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cdf_variant=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Details{", "}", 0, null, null, 56);
                }

                public final class Row extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<Row> CREATOR;
                    public final String client_route_action;
                    public final LocalizedString left_text;
                    public final Color left_text_color;
                    public final LocalizedString right_text;
                    public final Color right_text_color;
                    public final Boolean right_toggle_value;

                    static {
                        BorrowAppletLoanHistoryTile$Data$Loan$Details$Row$Companion$ADAPTER$1 borrowAppletLoanHistoryTile$Data$Loan$Details$Row$Companion$ADAPTER$1 = new BorrowAppletLoanHistoryTile$Data$Loan$Details$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletLoanHistoryTile.Data.Loan.Details.Row", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                        ADAPTER = borrowAppletLoanHistoryTile$Data$Loan$Details$Row$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletLoanHistoryTile$Data$Loan$Details$Row$Companion$ADAPTER$1);
                    }

                    public /* synthetic */ Row(LocalizedString localizedString, LocalizedString localizedString2, Color color, int i) {
                        this(localizedString, localizedString2, (i & 4) != 0 ? null : "https://example.com/toggle-autopay", null, (i & 16) != 0 ? null : color, null, ByteString.EMPTY);
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof Row)) {
                            return false;
                        }
                        Row row = (Row) obj;
                        return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.left_text, row.left_text) && Intrinsics.areEqual(this.right_text, row.right_text) && Intrinsics.areEqual(this.client_route_action, row.client_route_action) && Intrinsics.areEqual(this.left_text_color, row.left_text_color) && Intrinsics.areEqual(this.right_text_color, row.right_text_color) && Intrinsics.areEqual(this.right_toggle_value, row.right_toggle_value);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        LocalizedString localizedString = this.left_text;
                        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                        LocalizedString localizedString2 = this.right_text;
                        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                        String str = this.client_route_action;
                        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
                        Color color = this.left_text_color;
                        int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
                        Color color2 = this.right_text_color;
                        int hashCode6 = (hashCode5 + (color2 != null ? color2.hashCode() : 0)) * 37;
                        Boolean bool = this.right_toggle_value;
                        int hashCode7 = hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                        this.hashCode = hashCode7;
                        return hashCode7;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(20, false);
                        builder.photo_url = this.left_text;
                        builder.synopsis = this.right_text;
                        builder.full_name = this.client_route_action;
                        builder.full_cashtag = this.left_text_color;
                        builder.is_verified_account = this.right_text_color;
                        builder.cashtag_url_enabled = this.right_toggle_value;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        LocalizedString localizedString = this.left_text;
                        if (localizedString != null) {
                            Matcher$$ExternalSyntheticOutline0.m("left_text=", localizedString, arrayList);
                        }
                        LocalizedString localizedString2 = this.right_text;
                        if (localizedString2 != null) {
                            Matcher$$ExternalSyntheticOutline0.m("right_text=", localizedString2, arrayList);
                        }
                        String str = this.client_route_action;
                        if (str != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_action=", arrayList);
                        }
                        Color color = this.left_text_color;
                        if (color != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("left_text_color=", color, arrayList);
                        }
                        Color color2 = this.right_text_color;
                        if (color2 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("right_text_color=", color2, arrayList);
                        }
                        Boolean bool = this.right_toggle_value;
                        if (bool != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("right_toggle_value=", bool, arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Row(LocalizedString localizedString, LocalizedString localizedString2, String str, Color color, Color color2, Boolean bool, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.left_text = localizedString;
                        this.right_text = localizedString2;
                        this.client_route_action = str;
                        this.left_text_color = color;
                        this.right_text_color = color2;
                        this.right_toggle_value = bool;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Details(LocalizedString localizedString, LocalizedString localizedString2, List list, Timeline timeline, LocalizedString localizedString3, LocalizedString localizedString4, ButtonData buttonData, Color color, String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    list.getClass();
                    byteString.getClass();
                    this.primary_text = localizedString;
                    this.secondary_text = localizedString2;
                    this.timeline = timeline;
                    this.timeline_button_title = localizedString3;
                    this.details_button_title = localizedString4;
                    this.repayment_button_data = buttonData;
                    this.secondary_text_tint_color = color;
                    this.cdf_variant = str;
                    this.rows = TransactorKt.immutableCopyOf("rows", list);
                }
            }
        }
    }
}
