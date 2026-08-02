package com.squareup.protos.cash.portfolios;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.ui.ActionType;
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

/* loaded from: classes7.dex */
public final class InvestmentBalanceEvent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestmentBalanceEvent> CREATOR;
    public final Long amount_cents;
    public final String investment_entity_token;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1327type;

    public enum Type implements WireEnum {
        BUY(1),
        SELL(2);

        public final int value;
        public static final ActionType.Companion Companion = new ActionType.Companion();
        public static final InvestmentBalanceEvent$Type$Companion$ADAPTER$1 ADAPTER = new InvestmentBalanceEvent$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return BUY;
            }
            if (i != 2) {
                return null;
            }
            return SELL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        InvestmentBalanceEvent$Companion$ADAPTER$1 investmentBalanceEvent$Companion$ADAPTER$1 = new InvestmentBalanceEvent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestmentBalanceEvent.class), "type.googleapis.com/squareup.cash.portfolios.InvestmentBalanceEvent", Syntax.PROTO_2, null, "squareup/cash/portfolios/service.proto");
        ADAPTER = investmentBalanceEvent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentBalanceEvent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentBalanceEvent(String str, Long l, Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_entity_token = str;
        this.amount_cents = l;
        this.f1327type = type2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestmentBalanceEvent)) {
            return false;
        }
        InvestmentBalanceEvent investmentBalanceEvent = (InvestmentBalanceEvent) obj;
        return Intrinsics.areEqual(unknownFields(), investmentBalanceEvent.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, investmentBalanceEvent.investment_entity_token) && Intrinsics.areEqual(this.amount_cents, investmentBalanceEvent.amount_cents) && this.f1327type == investmentBalanceEvent.f1327type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.amount_cents;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Type type2 = this.f1327type;
        int hashCode4 = hashCode3 + (type2 != null ? type2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(5);
        builder.modules = this.investment_entity_token;
        builder.overflow_modules = this.amount_cents;
        builder.card_home_actions = this.f1327type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        if (this.amount_cents != null) {
            arrayList.add("amount_cents=██");
        }
        Type type2 = this.f1327type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentBalanceEvent{", "}", 0, null, null, 56);
    }
}
