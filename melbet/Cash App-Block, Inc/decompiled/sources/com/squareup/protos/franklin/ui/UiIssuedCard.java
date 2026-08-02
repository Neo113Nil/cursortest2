package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.protos.franklin.common.CardScheme;
import com.squareup.protos.franklin.common.CashDrawerData;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.protos.franklin.common.RoundUpsData;
import com.squareup.protos.franklin.data.LinkResult;
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
import squareup.cash.savings.GoalFolder;

/* loaded from: classes8.dex */
public final class UiIssuedCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiIssuedCard> CREATOR;
    public final CardOrderData card_order_data;
    public final CardScheme card_scheme;
    public final CashDrawerData cash_drawer_data;
    public final CustomerData customer_data;
    public final InitialBlockerData initial_blocker_data;
    public final IssuedCard issued_card;
    public final Mode mode;
    public final RoundUpsData round_ups_data;

    public enum Mode implements WireEnum {
        NULL_STATE(1),
        NORMAL(2);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final UiIssuedCard$Mode$Companion$ADAPTER$1 ADAPTER = new UiIssuedCard$Mode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Mode.class), Syntax.PROTO_2, null);

        Mode(int i) {
            this.value = i;
        }

        public static final Mode fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return NULL_STATE;
            }
            if (i != 2) {
                return null;
            }
            return NORMAL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        UiIssuedCard$Companion$ADAPTER$1 uiIssuedCard$Companion$ADAPTER$1 = new UiIssuedCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiIssuedCard.class), "type.googleapis.com/squareup.franklin.ui.UiIssuedCard", Syntax.PROTO_2, null, "squareup/franklin/ui/issued_card.proto");
        ADAPTER = uiIssuedCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiIssuedCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiIssuedCard(IssuedCard issuedCard, CashDrawerData cashDrawerData, Mode mode, CardScheme cardScheme, RoundUpsData roundUpsData, InitialBlockerData initialBlockerData, CardOrderData cardOrderData, CustomerData customerData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.issued_card = issuedCard;
        this.cash_drawer_data = cashDrawerData;
        this.mode = mode;
        this.card_scheme = cardScheme;
        this.round_ups_data = roundUpsData;
        this.initial_blocker_data = initialBlockerData;
        this.card_order_data = cardOrderData;
        this.customer_data = customerData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiIssuedCard)) {
            return false;
        }
        UiIssuedCard uiIssuedCard = (UiIssuedCard) obj;
        return Intrinsics.areEqual(unknownFields(), uiIssuedCard.unknownFields()) && Intrinsics.areEqual(this.issued_card, uiIssuedCard.issued_card) && Intrinsics.areEqual(this.cash_drawer_data, uiIssuedCard.cash_drawer_data) && this.mode == uiIssuedCard.mode && Intrinsics.areEqual(this.card_scheme, uiIssuedCard.card_scheme) && Intrinsics.areEqual(this.round_ups_data, uiIssuedCard.round_ups_data) && Intrinsics.areEqual(this.initial_blocker_data, uiIssuedCard.initial_blocker_data) && Intrinsics.areEqual(this.card_order_data, uiIssuedCard.card_order_data) && Intrinsics.areEqual(this.customer_data, uiIssuedCard.customer_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        IssuedCard issuedCard = this.issued_card;
        int hashCode2 = (hashCode + (issuedCard != null ? issuedCard.hashCode() : 0)) * 37;
        CashDrawerData cashDrawerData = this.cash_drawer_data;
        int hashCode3 = (hashCode2 + (cashDrawerData != null ? cashDrawerData.hashCode() : 0)) * 37;
        Mode mode = this.mode;
        int hashCode4 = (hashCode3 + (mode != null ? mode.hashCode() : 0)) * 37;
        CardScheme cardScheme = this.card_scheme;
        int hashCode5 = (hashCode4 + (cardScheme != null ? cardScheme.hashCode() : 0)) * 37;
        RoundUpsData roundUpsData = this.round_ups_data;
        int hashCode6 = (hashCode5 + (roundUpsData != null ? roundUpsData.hashCode() : 0)) * 37;
        InitialBlockerData initialBlockerData = this.initial_blocker_data;
        int hashCode7 = (hashCode6 + (initialBlockerData != null ? initialBlockerData.hashCode() : 0)) * 37;
        CardOrderData cardOrderData = this.card_order_data;
        int hashCode8 = (hashCode7 + (cardOrderData != null ? cardOrderData.hashCode() : 0)) * 37;
        CustomerData customerData = this.customer_data;
        int hashCode9 = hashCode8 + (customerData != null ? customerData.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GoalFolder.Builder builder = new GoalFolder.Builder(5);
        builder.token = this.issued_card;
        builder.icon_unicode = this.cash_drawer_data;
        builder.completion_token = this.mode;
        builder.label = this.card_scheme;
        builder.goal_flow_parameters = this.round_ups_data;
        builder.met_goal = this.initial_blocker_data;
        builder.goal_amount = this.card_order_data;
        builder.goal_progress_percentage = this.customer_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        IssuedCard issuedCard = this.issued_card;
        if (issuedCard != null) {
            arrayList.add("issued_card=" + issuedCard);
        }
        CashDrawerData cashDrawerData = this.cash_drawer_data;
        if (cashDrawerData != null) {
            arrayList.add("cash_drawer_data=" + cashDrawerData);
        }
        Mode mode = this.mode;
        if (mode != null) {
            arrayList.add("mode=" + mode);
        }
        CardScheme cardScheme = this.card_scheme;
        if (cardScheme != null) {
            arrayList.add("card_scheme=" + cardScheme);
        }
        RoundUpsData roundUpsData = this.round_ups_data;
        if (roundUpsData != null) {
            arrayList.add("round_ups_data=" + roundUpsData);
        }
        InitialBlockerData initialBlockerData = this.initial_blocker_data;
        if (initialBlockerData != null) {
            arrayList.add("initial_blocker_data=" + initialBlockerData);
        }
        CardOrderData cardOrderData = this.card_order_data;
        if (cardOrderData != null) {
            arrayList.add("card_order_data=" + cardOrderData);
        }
        CustomerData customerData = this.customer_data;
        if (customerData != null) {
            arrayList.add("customer_data=" + customerData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiIssuedCard{", "}", 0, null, null, 56);
    }
}
