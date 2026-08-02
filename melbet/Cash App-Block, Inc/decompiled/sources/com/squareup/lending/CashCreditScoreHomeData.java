package com.squareup.lending;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.notifications.Op;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.cashapproxy.api.Divider;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
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
import okio.ByteString;
import squareup.cash.bills.BillsApplet;
import squareup.cash.savings.SavingsConfig;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashCreditScoreHomeData> CREATOR;
    public final List app_supports;
    public final DisclaimerSection disclaimer_section;
    public final List info_sections;
    public final ScoreSummary score_summary;
    public final TitleBar title_bar;

    public final class Action extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Action> CREATOR;
        public final RecommendationOverlayData recommendation_overlay;
        public final ScoreSummaryOverlayData score_summary_overlay;
        public final String uri;

        static {
            CashCreditScoreHomeData$Action$Companion$ADAPTER$1 cashCreditScoreHomeData$Action$Companion$ADAPTER$1 = new CashCreditScoreHomeData$Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.Action", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
            ADAPTER = cashCreditScoreHomeData$Action$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$Action$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(String str, ScoreSummaryOverlayData scoreSummaryOverlayData, RecommendationOverlayData recommendationOverlayData, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.uri = str;
            this.score_summary_overlay = scoreSummaryOverlayData;
            this.recommendation_overlay = recommendationOverlayData;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.uri, action.uri) && Intrinsics.areEqual(this.score_summary_overlay, action.score_summary_overlay) && Intrinsics.areEqual(this.recommendation_overlay, action.recommendation_overlay);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.uri;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            ScoreSummaryOverlayData scoreSummaryOverlayData = this.score_summary_overlay;
            int hashCode3 = (hashCode2 + (scoreSummaryOverlayData != null ? scoreSummaryOverlayData.hashCode() : 0)) * 37;
            RecommendationOverlayData recommendationOverlayData = this.recommendation_overlay;
            int hashCode4 = hashCode3 + (recommendationOverlayData != null ? recommendationOverlayData.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(27);
            builder.customer_token = this.uri;
            builder.withdrawalType = this.score_summary_overlay;
            builder.customer_supplied_amount = this.recommendation_overlay;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.uri;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "uri=", arrayList);
            }
            ScoreSummaryOverlayData scoreSummaryOverlayData = this.score_summary_overlay;
            if (scoreSummaryOverlayData != null) {
                arrayList.add("score_summary_overlay=" + scoreSummaryOverlayData);
            }
            RecommendationOverlayData recommendationOverlayData = this.recommendation_overlay;
            if (recommendationOverlayData != null) {
                arrayList.add("recommendation_overlay=" + recommendationOverlayData);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
        }
    }

    public final class DisclaimerSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DisclaimerSection> CREATOR;
        public final LocalizedString text;
        public final TextAlignment text_alignment;

        static {
            CashCreditScoreHomeData$DisclaimerSection$Companion$ADAPTER$1 cashCreditScoreHomeData$DisclaimerSection$Companion$ADAPTER$1 = new CashCreditScoreHomeData$DisclaimerSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisclaimerSection.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.DisclaimerSection", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
            ADAPTER = cashCreditScoreHomeData$DisclaimerSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$DisclaimerSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisclaimerSection(LocalizedString localizedString, TextAlignment textAlignment, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = localizedString;
            this.text_alignment = textAlignment;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisclaimerSection)) {
                return false;
            }
            DisclaimerSection disclaimerSection = (DisclaimerSection) obj;
            return Intrinsics.areEqual(unknownFields(), disclaimerSection.unknownFields()) && Intrinsics.areEqual(this.text, disclaimerSection.text) && this.text_alignment == disclaimerSection.text_alignment;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            TextAlignment textAlignment = this.text_alignment;
            int hashCode3 = hashCode2 + (textAlignment != null ? textAlignment.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(26);
            builder.customer_token = this.text;
            builder.sponsorship_tier = this.text_alignment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            TextAlignment textAlignment = this.text_alignment;
            if (textAlignment != null) {
                arrayList.add("text_alignment=" + textAlignment);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DisclaimerSection{", "}", 0, null, null, 56);
        }
    }

    public final class Graphic extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Graphic> CREATOR;
        public final Card card;
        public final Image image;

        public final class Card extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Card> CREATOR;

            static {
                CashCreditScoreHomeData$Graphic$Card$Companion$ADAPTER$1 cashCreditScoreHomeData$Graphic$Card$Companion$ADAPTER$1 = new CashCreditScoreHomeData$Graphic$Card$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Card.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.Graphic.Card", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
                ADAPTER = cashCreditScoreHomeData$Graphic$Card$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$Graphic$Card$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Card(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof Card) && Intrinsics.areEqual(unknownFields(), ((Card) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Divider.Builder builder = new Divider.Builder(11);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "Card{}";
            }
        }

        static {
            CashCreditScoreHomeData$Graphic$Companion$ADAPTER$1 cashCreditScoreHomeData$Graphic$Companion$ADAPTER$1 = new CashCreditScoreHomeData$Graphic$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Graphic.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.Graphic", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
            ADAPTER = cashCreditScoreHomeData$Graphic$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$Graphic$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Graphic(Image image, Card card, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.card = card;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Graphic)) {
                return false;
            }
            Graphic graphic = (Graphic) obj;
            return Intrinsics.areEqual(unknownFields(), graphic.unknownFields()) && Intrinsics.areEqual(this.image, graphic.image) && Intrinsics.areEqual(this.card, graphic.card);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            Card card = this.card;
            int hashCode3 = hashCode2 + (card != null ? card.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(27);
            builder.customer_token = this.image;
            builder.sponsorship_tier = this.card;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Card card = this.card;
            if (card != null) {
                arrayList.add("card=" + card);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Graphic{", "}", 0, null, null, 56);
        }
    }

    public final class InfoSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InfoSection> CREATOR;
        public final LocalizedString body;
        public final List items;
        public final Boolean show_top_divider;
        public final LocalizedString title;

        public final class Callout extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Callout> CREATOR;
            public final Action action;
            public final Graphic graphic;
            public final LocalizedString title;

            static {
                CashCreditScoreHomeData$InfoSection$Callout$Companion$ADAPTER$1 cashCreditScoreHomeData$InfoSection$Callout$Companion$ADAPTER$1 = new CashCreditScoreHomeData$InfoSection$Callout$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Callout.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.InfoSection.Callout", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
                ADAPTER = cashCreditScoreHomeData$InfoSection$Callout$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$InfoSection$Callout$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Callout(Action action, Graphic graphic, LocalizedString localizedString, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.action = action;
                this.graphic = graphic;
                this.title = localizedString;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Callout)) {
                    return false;
                }
                Callout callout = (Callout) obj;
                return Intrinsics.areEqual(unknownFields(), callout.unknownFields()) && Intrinsics.areEqual(this.action, callout.action) && Intrinsics.areEqual(this.graphic, callout.graphic) && Intrinsics.areEqual(this.title, callout.title);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Action action = this.action;
                int hashCode2 = (hashCode + (action != null ? action.hashCode() : 0)) * 37;
                Graphic graphic = this.graphic;
                int hashCode3 = (hashCode2 + (graphic != null ? graphic.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.title;
                int hashCode4 = hashCode3 + (localizedString != null ? localizedString.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(28);
                builder.withdrawalType = this.action;
                builder.customer_supplied_amount = this.graphic;
                builder.customer_token = this.title;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Action action = this.action;
                if (action != null) {
                    arrayList.add("action=" + action);
                }
                Graphic graphic = this.graphic;
                if (graphic != null) {
                    arrayList.add("graphic=" + graphic);
                }
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Callout{", "}", 0, null, null, 56);
            }
        }

        public final class CollapsingItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CollapsingItem> CREATOR;
            public final LocalizedString body;
            public final LocalizedString title;

            static {
                CashCreditScoreHomeData$InfoSection$CollapsingItem$Companion$ADAPTER$1 cashCreditScoreHomeData$InfoSection$CollapsingItem$Companion$ADAPTER$1 = new CashCreditScoreHomeData$InfoSection$CollapsingItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CollapsingItem.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.InfoSection.CollapsingItem", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
                ADAPTER = cashCreditScoreHomeData$InfoSection$CollapsingItem$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$InfoSection$CollapsingItem$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CollapsingItem(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = localizedString;
                this.body = localizedString2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CollapsingItem)) {
                    return false;
                }
                CollapsingItem collapsingItem = (CollapsingItem) obj;
                return Intrinsics.areEqual(unknownFields(), collapsingItem.unknownFields()) && Intrinsics.areEqual(this.title, collapsingItem.title) && Intrinsics.areEqual(this.body, collapsingItem.body);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.body;
                int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BillsApplet.HalfApplet.Builder builder = new BillsApplet.HalfApplet.Builder(2);
                builder.title = this.title;
                builder.description = this.body;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.body;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CollapsingItem{", "}", 0, null, null, 56);
            }
        }

        public final class InfoItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<InfoItem> CREATOR;
            public final Callout callout;
            public final CollapsingItem collapsing_item;
            public final Row row;

            static {
                CashCreditScoreHomeData$InfoSection$InfoItem$Companion$ADAPTER$1 cashCreditScoreHomeData$InfoSection$InfoItem$Companion$ADAPTER$1 = new CashCreditScoreHomeData$InfoSection$InfoItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InfoItem.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.InfoSection.InfoItem", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
                ADAPTER = cashCreditScoreHomeData$InfoSection$InfoItem$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$InfoSection$InfoItem$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InfoItem(CollapsingItem collapsingItem, Row row, Callout callout, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.collapsing_item = collapsingItem;
                this.row = row;
                this.callout = callout;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof InfoItem)) {
                    return false;
                }
                InfoItem infoItem = (InfoItem) obj;
                return Intrinsics.areEqual(unknownFields(), infoItem.unknownFields()) && Intrinsics.areEqual(this.collapsing_item, infoItem.collapsing_item) && Intrinsics.areEqual(this.row, infoItem.row) && Intrinsics.areEqual(this.callout, infoItem.callout);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                CollapsingItem collapsingItem = this.collapsing_item;
                int hashCode2 = (hashCode + (collapsingItem != null ? collapsingItem.hashCode() : 0)) * 37;
                Row row = this.row;
                int hashCode3 = (hashCode2 + (row != null ? row.hashCode() : 0)) * 37;
                Callout callout = this.callout;
                int hashCode4 = hashCode3 + (callout != null ? callout.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(29);
                builder.withdrawalType = this.collapsing_item;
                builder.customer_supplied_amount = this.row;
                builder.customer_token = this.callout;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                CollapsingItem collapsingItem = this.collapsing_item;
                if (collapsingItem != null) {
                    arrayList.add("collapsing_item=" + collapsingItem);
                }
                Row row = this.row;
                if (row != null) {
                    arrayList.add("row=" + row);
                }
                Callout callout = this.callout;
                if (callout != null) {
                    arrayList.add("callout=" + callout);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "InfoItem{", "}", 0, null, null, 56);
            }
        }

        public final class Row extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Row> CREATOR;
            public final Action action;
            public final LocalizedString body;
            public final Icon icon;
            public final LocalizedString title;

            static {
                CashCreditScoreHomeData$InfoSection$Row$Companion$ADAPTER$1 cashCreditScoreHomeData$InfoSection$Row$Companion$ADAPTER$1 = new CashCreditScoreHomeData$InfoSection$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.InfoSection.Row", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
                ADAPTER = cashCreditScoreHomeData$InfoSection$Row$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$InfoSection$Row$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Row(Action action, Icon icon, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.action = action;
                this.icon = icon;
                this.title = localizedString;
                this.body = localizedString2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Row)) {
                    return false;
                }
                Row row = (Row) obj;
                return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.action, row.action) && Intrinsics.areEqual(this.icon, row.icon) && Intrinsics.areEqual(this.title, row.title) && Intrinsics.areEqual(this.body, row.body);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Action action = this.action;
                int hashCode2 = (hashCode + (action != null ? action.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.title;
                int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.body;
                int hashCode5 = hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ForEach.Builder builder = new ForEach.Builder(14);
                builder.collection = this.action;
                builder.template = this.icon;
                builder.item_variable = this.title;
                builder.source = this.body;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Action action = this.action;
                if (action != null) {
                    arrayList.add("action=" + action);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.body;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
            }
        }

        static {
            CashCreditScoreHomeData$InfoSection$Companion$ADAPTER$1 cashCreditScoreHomeData$InfoSection$Companion$ADAPTER$1 = new CashCreditScoreHomeData$InfoSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InfoSection.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.InfoSection", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
            ADAPTER = cashCreditScoreHomeData$InfoSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$InfoSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoSection(Boolean bool, LocalizedString localizedString, LocalizedString localizedString2, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.show_top_divider = bool;
            this.title = localizedString;
            this.body = localizedString2;
            this.items = TransactorKt.immutableCopyOf("items", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InfoSection)) {
                return false;
            }
            InfoSection infoSection = (InfoSection) obj;
            return Intrinsics.areEqual(unknownFields(), infoSection.unknownFields()) && Intrinsics.areEqual(this.show_top_divider, infoSection.show_top_divider) && Intrinsics.areEqual(this.title, infoSection.title) && Intrinsics.areEqual(this.body, infoSection.body) && Intrinsics.areEqual(this.items, infoSection.items);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.show_top_divider;
            int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.body;
            int hashCode4 = this.items.hashCode() + ((hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ForEach.Builder builder = new ForEach.Builder(13);
            builder.collection = this.show_top_divider;
            builder.template = this.title;
            builder.item_variable = this.body;
            builder.source = this.items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.show_top_divider;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("show_top_divider=", bool, arrayList);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.body;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
            }
            List list = this.items;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InfoSection{", "}", 0, null, null, 56);
        }
    }

    public final class RecommendationOverlayData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecommendationOverlayData> CREATOR;
        public final LocalizedString body;
        public final Graphic graphic;
        public final Action primary_button_action;
        public final LocalizedString primary_button_text;
        public final LocalizedString title;

        static {
            CashCreditScoreHomeData$RecommendationOverlayData$Companion$ADAPTER$1 cashCreditScoreHomeData$RecommendationOverlayData$Companion$ADAPTER$1 = new CashCreditScoreHomeData$RecommendationOverlayData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecommendationOverlayData.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.RecommendationOverlayData", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
            ADAPTER = cashCreditScoreHomeData$RecommendationOverlayData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$RecommendationOverlayData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecommendationOverlayData(Graphic graphic, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, Action action, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.graphic = graphic;
            this.title = localizedString;
            this.body = localizedString2;
            this.primary_button_text = localizedString3;
            this.primary_button_action = action;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecommendationOverlayData)) {
                return false;
            }
            RecommendationOverlayData recommendationOverlayData = (RecommendationOverlayData) obj;
            return Intrinsics.areEqual(unknownFields(), recommendationOverlayData.unknownFields()) && Intrinsics.areEqual(this.graphic, recommendationOverlayData.graphic) && Intrinsics.areEqual(this.title, recommendationOverlayData.title) && Intrinsics.areEqual(this.body, recommendationOverlayData.body) && Intrinsics.areEqual(this.primary_button_text, recommendationOverlayData.primary_button_text) && Intrinsics.areEqual(this.primary_button_action, recommendationOverlayData.primary_button_action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Graphic graphic = this.graphic;
            int hashCode2 = (hashCode + (graphic != null ? graphic.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.body;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.primary_button_text;
            int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            Action action = this.primary_button_action;
            int hashCode6 = hashCode5 + (action != null ? action.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Node.Builder builder = new Node.Builder(11);
            builder.for_each = this.graphic;
            builder.moneybot_scaffold = this.title;
            builder.compose_platform = this.body;
            builder.is_included = this.primary_button_text;
            builder.motion = this.primary_button_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Graphic graphic = this.graphic;
            if (graphic != null) {
                arrayList.add("graphic=" + graphic);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.body;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.primary_button_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("primary_button_text=", localizedString3, arrayList);
            }
            Action action = this.primary_button_action;
            if (action != null) {
                arrayList.add("primary_button_action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecommendationOverlayData{", "}", 0, null, null, 56);
        }
    }

    public final class ScoreSummary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ScoreSummary> CREATOR;
        public final Action action;
        public final LocalizedString action_accessibility_description;
        public final Icon action_leading_icon;
        public final LocalizedString action_text;
        public final Integer previous_score;
        public final Integer score;
        public final String score_token;
        public final Visualization visualization;

        static {
            CashCreditScoreHomeData$ScoreSummary$Companion$ADAPTER$1 cashCreditScoreHomeData$ScoreSummary$Companion$ADAPTER$1 = new CashCreditScoreHomeData$ScoreSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScoreSummary.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.ScoreSummary", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
            ADAPTER = cashCreditScoreHomeData$ScoreSummary$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$ScoreSummary$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScoreSummary(Visualization visualization, Integer num, Integer num2, String str, Icon icon, LocalizedString localizedString, LocalizedString localizedString2, Action action, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.visualization = visualization;
            this.score = num;
            this.previous_score = num2;
            this.score_token = str;
            this.action_leading_icon = icon;
            this.action_text = localizedString;
            this.action_accessibility_description = localizedString2;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScoreSummary)) {
                return false;
            }
            ScoreSummary scoreSummary = (ScoreSummary) obj;
            return Intrinsics.areEqual(unknownFields(), scoreSummary.unknownFields()) && Intrinsics.areEqual(this.visualization, scoreSummary.visualization) && Intrinsics.areEqual(this.score, scoreSummary.score) && Intrinsics.areEqual(this.previous_score, scoreSummary.previous_score) && Intrinsics.areEqual(this.score_token, scoreSummary.score_token) && Intrinsics.areEqual(this.action_leading_icon, scoreSummary.action_leading_icon) && Intrinsics.areEqual(this.action_text, scoreSummary.action_text) && Intrinsics.areEqual(this.action_accessibility_description, scoreSummary.action_accessibility_description) && Intrinsics.areEqual(this.action, scoreSummary.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Visualization visualization = this.visualization;
            int hashCode2 = (hashCode + (visualization != null ? visualization.hashCode() : 0)) * 37;
            Integer num = this.score;
            int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.previous_score;
            int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            String str = this.score_token;
            int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
            Icon icon = this.action_leading_icon;
            int hashCode6 = (hashCode5 + (icon != null ? icon.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.action_text;
            int hashCode7 = (hashCode6 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.action_accessibility_description;
            int hashCode8 = (hashCode7 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Action action = this.action;
            int hashCode9 = hashCode8 + (action != null ? action.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Badge.Builder builder = new Badge.Builder(4, false);
            builder.customer_token = this.visualization;
            builder.external_version = this.score;
            builder.updated_at = this.previous_score;
            builder.external_token = this.score_token;
            builder.created_at = this.action_leading_icon;
            builder.is_badged = this.action_text;
            builder.item_type = this.action_accessibility_description;
            builder.count_groups = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Visualization visualization = this.visualization;
            if (visualization != null) {
                arrayList.add("visualization=" + visualization);
            }
            Integer num = this.score;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("score=", num, arrayList);
            }
            Integer num2 = this.previous_score;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("previous_score=", num2, arrayList);
            }
            String str = this.score_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "score_token=", arrayList);
            }
            Icon icon = this.action_leading_icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("action_leading_icon=", icon, arrayList);
            }
            LocalizedString localizedString = this.action_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("action_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.action_accessibility_description;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("action_accessibility_description=", localizedString2, arrayList);
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ScoreSummary{", "}", 0, null, null, 56);
        }
    }

    public final class ScoreSummaryOverlayData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ScoreSummaryOverlayData> CREATOR;
        public final LocalizedString body;
        public final Boolean describes_feature_impact;
        public final DisclaimerSection disclaimer_section;
        public final List list;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        public final class ListItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ListItem> CREATOR;
            public final LocalizedString accessory_accessibility_description;
            public final Color accessory_color;
            public final Icon accessory_icon;
            public final LocalizedString accessory_text;
            public final LocalizedString body_text;
            public final LocalizedString text;

            static {
                CashCreditScoreHomeData$ScoreSummaryOverlayData$ListItem$Companion$ADAPTER$1 cashCreditScoreHomeData$ScoreSummaryOverlayData$ListItem$Companion$ADAPTER$1 = new CashCreditScoreHomeData$ScoreSummaryOverlayData$ListItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListItem.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
                ADAPTER = cashCreditScoreHomeData$ScoreSummaryOverlayData$ListItem$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$ScoreSummaryOverlayData$ListItem$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListItem(LocalizedString localizedString, LocalizedString localizedString2, Icon icon, LocalizedString localizedString3, LocalizedString localizedString4, Color color, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = localizedString;
                this.body_text = localizedString2;
                this.accessory_icon = icon;
                this.accessory_text = localizedString3;
                this.accessory_accessibility_description = localizedString4;
                this.accessory_color = color;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ListItem)) {
                    return false;
                }
                ListItem listItem = (ListItem) obj;
                return Intrinsics.areEqual(unknownFields(), listItem.unknownFields()) && Intrinsics.areEqual(this.text, listItem.text) && Intrinsics.areEqual(this.body_text, listItem.body_text) && Intrinsics.areEqual(this.accessory_icon, listItem.accessory_icon) && Intrinsics.areEqual(this.accessory_text, listItem.accessory_text) && Intrinsics.areEqual(this.accessory_accessibility_description, listItem.accessory_accessibility_description) && Intrinsics.areEqual(this.accessory_color, listItem.accessory_color);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.body_text;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                Icon icon = this.accessory_icon;
                int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.accessory_text;
                int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                LocalizedString localizedString4 = this.accessory_accessibility_description;
                int hashCode6 = (hashCode5 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
                Color color = this.accessory_color;
                int hashCode7 = hashCode6 + (color != null ? color.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Error.Builder builder = new Error.Builder(7, false);
                builder.category = this.text;
                builder.code = this.body_text;
                builder.description = this.accessory_icon;
                builder.field = this.accessory_text;
                builder.retryable = this.accessory_accessibility_description;
                builder.metadata = this.accessory_color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.body_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body_text=", localizedString2, arrayList);
                }
                Icon icon = this.accessory_icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("accessory_icon=", icon, arrayList);
                }
                LocalizedString localizedString3 = this.accessory_text;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("accessory_text=", localizedString3, arrayList);
                }
                LocalizedString localizedString4 = this.accessory_accessibility_description;
                if (localizedString4 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("accessory_accessibility_description=", localizedString4, arrayList);
                }
                Color color = this.accessory_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("accessory_color=", color, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ListItem{", "}", 0, null, null, 56);
            }
        }

        static {
            CashCreditScoreHomeData$ScoreSummaryOverlayData$Companion$ADAPTER$1 cashCreditScoreHomeData$ScoreSummaryOverlayData$Companion$ADAPTER$1 = new CashCreditScoreHomeData$ScoreSummaryOverlayData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScoreSummaryOverlayData.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.ScoreSummaryOverlayData", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
            ADAPTER = cashCreditScoreHomeData$ScoreSummaryOverlayData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$ScoreSummaryOverlayData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScoreSummaryOverlayData(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, List list, DisclaimerSection disclaimerSection, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.body = localizedString3;
            this.disclaimer_section = disclaimerSection;
            this.describes_feature_impact = bool;
            this.list = TransactorKt.immutableCopyOf("list", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScoreSummaryOverlayData)) {
                return false;
            }
            ScoreSummaryOverlayData scoreSummaryOverlayData = (ScoreSummaryOverlayData) obj;
            return Intrinsics.areEqual(unknownFields(), scoreSummaryOverlayData.unknownFields()) && Intrinsics.areEqual(this.title, scoreSummaryOverlayData.title) && Intrinsics.areEqual(this.subtitle, scoreSummaryOverlayData.subtitle) && Intrinsics.areEqual(this.body, scoreSummaryOverlayData.body) && Intrinsics.areEqual(this.list, scoreSummaryOverlayData.list) && Intrinsics.areEqual(this.disclaimer_section, scoreSummaryOverlayData.disclaimer_section) && Intrinsics.areEqual(this.describes_feature_impact, scoreSummaryOverlayData.describes_feature_impact);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.body;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37, 37, this.list);
            DisclaimerSection disclaimerSection = this.disclaimer_section;
            int hashCode4 = (m + (disclaimerSection != null ? disclaimerSection.hashCode() : 0)) * 37;
            Boolean bool = this.describes_feature_impact;
            int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Error.Builder builder = new Error.Builder(6, false);
            builder.category = this.title;
            builder.code = this.subtitle;
            builder.description = this.body;
            builder.field = this.list;
            builder.metadata = this.disclaimer_section;
            builder.retryable = this.describes_feature_impact;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.body;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("body=", localizedString3, arrayList);
            }
            List list = this.list;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("list=", arrayList, list);
            }
            DisclaimerSection disclaimerSection = this.disclaimer_section;
            if (disclaimerSection != null) {
                arrayList.add("disclaimer_section=" + disclaimerSection);
            }
            Boolean bool = this.describes_feature_impact;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("describes_feature_impact=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ScoreSummaryOverlayData{", "}", 0, null, null, 56);
        }
    }

    public enum TextAlignment implements WireEnum {
        LEADING(1),
        CENTERED(2);

        public final int value;
        public static final Op.Companion Companion = new Op.Companion();
        public static final CashCreditScoreHomeData$TextAlignment$Companion$ADAPTER$1 ADAPTER = new CashCreditScoreHomeData$TextAlignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextAlignment.class), Syntax.PROTO_2, null);

        TextAlignment(int i) {
            this.value = i;
        }

        public static final TextAlignment fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return LEADING;
            }
            if (i != 2) {
                return null;
            }
            return CENTERED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class TitleBar extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TitleBar> CREATOR;
        public final LocalizedString title;

        static {
            CashCreditScoreHomeData$TitleBar$Companion$ADAPTER$1 cashCreditScoreHomeData$TitleBar$Companion$ADAPTER$1 = new CashCreditScoreHomeData$TitleBar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TitleBar.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.TitleBar", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
            ADAPTER = cashCreditScoreHomeData$TitleBar$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$TitleBar$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleBar(LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TitleBar)) {
                return false;
            }
            TitleBar titleBar = (TitleBar) obj;
            return Intrinsics.areEqual(unknownFields(), titleBar.unknownFields()) && Intrinsics.areEqual(this.title, titleBar.title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = hashCode + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SavingsConfig.Yield.Builder builder = new SavingsConfig.Yield.Builder(1);
            builder.yield_current_rate_enhanced = this.title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TitleBar{", "}", 0, null, null, 56);
        }
    }

    public final class Visualization extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Visualization> CREATOR;
        public final List dot_fraction;
        public final Float fill_fraction;
        public final Float previous_fill_fraction;
        public final ScoreLock score_lock;

        public final class ScoreLock extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ScoreLock> CREATOR;
            public final Image image;
            public final Boolean show_unlock_celebration;
            public final LocalizedString text;
            public final Float threshold;
            public final LocalizedString unlock_celebration_text;

            static {
                CashCreditScoreHomeData$Visualization$ScoreLock$Companion$ADAPTER$1 cashCreditScoreHomeData$Visualization$ScoreLock$Companion$ADAPTER$1 = new CashCreditScoreHomeData$Visualization$ScoreLock$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScoreLock.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.Visualization.ScoreLock", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
                ADAPTER = cashCreditScoreHomeData$Visualization$ScoreLock$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$Visualization$ScoreLock$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScoreLock(Float f, LocalizedString localizedString, Boolean bool, Image image, LocalizedString localizedString2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.threshold = f;
                this.text = localizedString;
                this.show_unlock_celebration = bool;
                this.image = image;
                this.unlock_celebration_text = localizedString2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ScoreLock)) {
                    return false;
                }
                ScoreLock scoreLock = (ScoreLock) obj;
                return Intrinsics.areEqual(unknownFields(), scoreLock.unknownFields()) && Intrinsics.areEqual(this.threshold, scoreLock.threshold) && Intrinsics.areEqual(this.text, scoreLock.text) && Intrinsics.areEqual(this.show_unlock_celebration, scoreLock.show_unlock_celebration) && Intrinsics.areEqual(this.image, scoreLock.image) && Intrinsics.areEqual(this.unlock_celebration_text, scoreLock.unlock_celebration_text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Float f = this.threshold;
                int hashCode2 = (hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
                LocalizedString localizedString = this.text;
                int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                Boolean bool = this.show_unlock_celebration;
                int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                Image image = this.image;
                int hashCode5 = (hashCode4 + (image != null ? image.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.unlock_celebration_text;
                int hashCode6 = hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Node.Builder builder = new Node.Builder(12);
                builder.for_each = this.threshold;
                builder.moneybot_scaffold = this.text;
                builder.compose_platform = this.show_unlock_celebration;
                builder.is_included = this.image;
                builder.motion = this.unlock_celebration_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Float f = this.threshold;
                if (f != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("threshold=", f, arrayList);
                }
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                Boolean bool = this.show_unlock_celebration;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("show_unlock_celebration=", bool, arrayList);
                }
                Image image = this.image;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                }
                LocalizedString localizedString2 = this.unlock_celebration_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("unlock_celebration_text=", localizedString2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ScoreLock{", "}", 0, null, null, 56);
            }
        }

        static {
            CashCreditScoreHomeData$Visualization$Companion$ADAPTER$1 cashCreditScoreHomeData$Visualization$Companion$ADAPTER$1 = new CashCreditScoreHomeData$Visualization$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Visualization.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData.Visualization", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
            ADAPTER = cashCreditScoreHomeData$Visualization$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$Visualization$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Visualization(Float f, Float f2, List list, ScoreLock scoreLock, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.fill_fraction = f;
            this.previous_fill_fraction = f2;
            this.score_lock = scoreLock;
            this.dot_fraction = TransactorKt.immutableCopyOf("dot_fraction", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Visualization)) {
                return false;
            }
            Visualization visualization = (Visualization) obj;
            return Intrinsics.areEqual(unknownFields(), visualization.unknownFields()) && Intrinsics.areEqual(this.fill_fraction, visualization.fill_fraction) && Intrinsics.areEqual(this.previous_fill_fraction, visualization.previous_fill_fraction) && Intrinsics.areEqual(this.dot_fraction, visualization.dot_fraction) && Intrinsics.areEqual(this.score_lock, visualization.score_lock);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Float f = this.fill_fraction;
            int hashCode2 = (hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            Float f2 = this.previous_fill_fraction;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0)) * 37, 37, this.dot_fraction);
            ScoreLock scoreLock = this.score_lock;
            int hashCode3 = m + (scoreLock != null ? scoreLock.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ForEach.Builder builder = new ForEach.Builder(15);
            builder.collection = this.fill_fraction;
            builder.template = this.previous_fill_fraction;
            builder.item_variable = this.dot_fraction;
            builder.source = this.score_lock;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Float f = this.fill_fraction;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("fill_fraction=", f, arrayList);
            }
            Float f2 = this.previous_fill_fraction;
            if (f2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("previous_fill_fraction=", f2, arrayList);
            }
            List list = this.dot_fraction;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("dot_fraction=", arrayList, list);
            }
            ScoreLock scoreLock = this.score_lock;
            if (scoreLock != null) {
                arrayList.add("score_lock=" + scoreLock);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Visualization{", "}", 0, null, null, 56);
        }
    }

    static {
        CashCreditScoreHomeData$Companion$ADAPTER$1 cashCreditScoreHomeData$Companion$ADAPTER$1 = new CashCreditScoreHomeData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashCreditScoreHomeData.class), "type.googleapis.com/squareup.lending.CashCreditScoreHomeData", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_home_data.proto");
        ADAPTER = cashCreditScoreHomeData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreHomeData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashCreditScoreHomeData(List list, TitleBar titleBar, ScoreSummary scoreSummary, List list2, DisclaimerSection disclaimerSection, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.title_bar = titleBar;
        this.score_summary = scoreSummary;
        this.disclaimer_section = disclaimerSection;
        this.app_supports = TransactorKt.immutableCopyOf("app_supports", list);
        this.info_sections = TransactorKt.immutableCopyOf("info_sections", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashCreditScoreHomeData)) {
            return false;
        }
        CashCreditScoreHomeData cashCreditScoreHomeData = (CashCreditScoreHomeData) obj;
        return Intrinsics.areEqual(unknownFields(), cashCreditScoreHomeData.unknownFields()) && Intrinsics.areEqual(this.app_supports, cashCreditScoreHomeData.app_supports) && Intrinsics.areEqual(this.title_bar, cashCreditScoreHomeData.title_bar) && Intrinsics.areEqual(this.score_summary, cashCreditScoreHomeData.score_summary) && Intrinsics.areEqual(this.info_sections, cashCreditScoreHomeData.info_sections) && Intrinsics.areEqual(this.disclaimer_section, cashCreditScoreHomeData.disclaimer_section);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.app_supports);
        TitleBar titleBar = this.title_bar;
        int hashCode = (m + (titleBar != null ? titleBar.hashCode() : 0)) * 37;
        ScoreSummary scoreSummary = this.score_summary;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode + (scoreSummary != null ? scoreSummary.hashCode() : 0)) * 37, 37, this.info_sections);
        DisclaimerSection disclaimerSection = this.disclaimer_section;
        int hashCode2 = m2 + (disclaimerSection != null ? disclaimerSection.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(10);
        builder.for_each = this.app_supports;
        builder.moneybot_scaffold = this.title_bar;
        builder.compose_platform = this.score_summary;
        builder.is_included = this.info_sections;
        builder.motion = this.disclaimer_section;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.app_supports;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("app_supports=", arrayList, list);
        }
        TitleBar titleBar = this.title_bar;
        if (titleBar != null) {
            arrayList.add("title_bar=" + titleBar);
        }
        ScoreSummary scoreSummary = this.score_summary;
        if (scoreSummary != null) {
            arrayList.add("score_summary=" + scoreSummary);
        }
        List list2 = this.info_sections;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("info_sections=", arrayList, list2);
        }
        DisclaimerSection disclaimerSection = this.disclaimer_section;
        if (disclaimerSection != null) {
            arrayList.add("disclaimer_section=" + disclaimerSection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashCreditScoreHomeData{", "}", 0, null, null, 56);
    }
}
