package com.squareup.protos.cash.cardspendinginsights;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public final class CardSpendingInsightRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardSpendingInsightRow> CREATOR;
    public final CdfEvent cdfEvent;
    public final String client_route;
    public final RowImage image;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    public enum RowImage implements WireEnum {
        TOP_LOCATIONS(1),
        RECURRING_PAYMENTS(2),
        AI_SUMMARY(3);

        public final int value;
        public static final CardProduct.Companion Companion = new CardProduct.Companion(19);
        public static final CardSpendingInsightRow$RowImage$Companion$ADAPTER$1 ADAPTER = new CardSpendingInsightRow$RowImage$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RowImage.class), Syntax.PROTO_2, null);

        RowImage(int i) {
            this.value = i;
        }

        public static final RowImage fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return TOP_LOCATIONS;
            }
            if (i == 2) {
                return RECURRING_PAYMENTS;
            }
            if (i != 3) {
                return null;
            }
            return AI_SUMMARY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CardSpendingInsightRow$Companion$ADAPTER$1 cardSpendingInsightRow$Companion$ADAPTER$1 = new CardSpendingInsightRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightRow.class), "type.googleapis.com/squareup.cash.cardspendinginsights.CardSpendingInsightRow", Syntax.PROTO_2, null, "squareup/cash/cardspendinginsights/home.proto");
        ADAPTER = cardSpendingInsightRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsightRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSpendingInsightRow(RowImage rowImage, LocalizedString localizedString, String str, CdfEvent cdfEvent, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = rowImage;
        this.title = localizedString;
        this.client_route = str;
        this.cdfEvent = cdfEvent;
        this.subtitle = localizedString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardSpendingInsightRow)) {
            return false;
        }
        CardSpendingInsightRow cardSpendingInsightRow = (CardSpendingInsightRow) obj;
        return Intrinsics.areEqual(unknownFields(), cardSpendingInsightRow.unknownFields()) && this.image == cardSpendingInsightRow.image && Intrinsics.areEqual(this.title, cardSpendingInsightRow.title) && Intrinsics.areEqual(this.client_route, cardSpendingInsightRow.client_route) && Intrinsics.areEqual(this.cdfEvent, cardSpendingInsightRow.cdfEvent) && Intrinsics.areEqual(this.subtitle, cardSpendingInsightRow.subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RowImage rowImage = this.image;
        int hashCode2 = (hashCode + (rowImage != null ? rowImage.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        String str = this.client_route;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        CdfEvent cdfEvent = this.cdfEvent;
        int hashCode5 = (hashCode4 + (cdfEvent != null ? cdfEvent.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode6 = hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(21);
        builder.for_each = this.image;
        builder.moneybot_scaffold = this.title;
        builder.compose_platform = this.client_route;
        builder.is_included = this.cdfEvent;
        builder.motion = this.subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RowImage rowImage = this.image;
        if (rowImage != null) {
            arrayList.add("image=" + rowImage);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        CdfEvent cdfEvent = this.cdfEvent;
        if (cdfEvent != null) {
            arrayList.add("cdfEvent=" + cdfEvent);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardSpendingInsightRow{", "}", 0, null, null, 56);
    }
}
