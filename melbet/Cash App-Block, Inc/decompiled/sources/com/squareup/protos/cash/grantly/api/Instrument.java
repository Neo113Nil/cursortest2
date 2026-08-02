package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.common.Money;
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
public final class Instrument extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Instrument> CREATOR;
    public final Money available_balance;
    public final Card card;
    public final String fidelius_token;
    public final String instrument_link_token;
    public final String instrument_token;
    public final InstrumentType instrument_type;

    public enum InstrumentType implements WireEnum {
        CREDIT_CARD(1),
        DEBIT_CARD(2),
        BANK_ACCOUNT(3),
        STORED_VALUE(4);

        public final int value;
        public static final Action.Type.Companion Companion = new Action.Type.Companion();
        public static final Instrument$InstrumentType$Companion$ADAPTER$1 ADAPTER = new Instrument$InstrumentType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InstrumentType.class), Syntax.PROTO_2, null);

        InstrumentType(int i) {
            this.value = i;
        }

        public static final InstrumentType fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return CREDIT_CARD;
            }
            if (i == 2) {
                return DEBIT_CARD;
            }
            if (i == 3) {
                return BANK_ACCOUNT;
            }
            if (i != 4) {
                return null;
            }
            return STORED_VALUE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Instrument$Companion$ADAPTER$1 instrument$Companion$ADAPTER$1 = new Instrument$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Instrument.class), "type.googleapis.com/squareup.cash.grantly.api.Instrument", Syntax.PROTO_2, null, "squareup/cash/grantly/api/in_transaction_top_up_flow_end_result.proto");
        ADAPTER = instrument$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instrument$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Instrument(InstrumentType instrumentType, String str, String str2, String str3, Card card, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instrument_type = instrumentType;
        this.fidelius_token = str;
        this.instrument_token = str2;
        this.instrument_link_token = str3;
        this.card = card;
        this.available_balance = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Instrument)) {
            return false;
        }
        Instrument instrument = (Instrument) obj;
        return Intrinsics.areEqual(unknownFields(), instrument.unknownFields()) && this.instrument_type == instrument.instrument_type && Intrinsics.areEqual(this.fidelius_token, instrument.fidelius_token) && Intrinsics.areEqual(this.instrument_token, instrument.instrument_token) && Intrinsics.areEqual(this.instrument_link_token, instrument.instrument_link_token) && Intrinsics.areEqual(this.card, instrument.card) && Intrinsics.areEqual(this.available_balance, instrument.available_balance);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstrumentType instrumentType = this.instrument_type;
        int hashCode2 = (hashCode + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str = this.fidelius_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.instrument_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.instrument_link_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Card card = this.card;
        int hashCode6 = (hashCode5 + (card != null ? card.hashCode() : 0)) * 37;
        Money money = this.available_balance;
        int hashCode7 = hashCode6 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(9);
        builder.requester = this.instrument_type;
        builder.slice_token = this.fidelius_token;
        builder.responder = this.instrument_token;
        builder.status = this.instrument_link_token;
        builder.action = this.card;
        builder.amount = this.available_balance;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InstrumentType instrumentType = this.instrument_type;
        if (instrumentType != null) {
            arrayList.add("instrument_type=" + instrumentType);
        }
        String str = this.fidelius_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fidelius_token=", arrayList);
        }
        String str2 = this.instrument_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instrument_token=", arrayList);
        }
        String str3 = this.instrument_link_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "instrument_link_token=", arrayList);
        }
        Card card = this.card;
        if (card != null) {
            arrayList.add("card=" + card);
        }
        Money money = this.available_balance;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("available_balance=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Instrument{", "}", 0, null, null, 56);
    }
}
