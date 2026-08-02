package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InTransactionTopUpInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InTransactionTopUpInfo> CREATOR;
    public final Money minimum_required_top_up_amount;
    public final Instrument selected_instrument;
    public final Money top_up_amount;

    static {
        InTransactionTopUpInfo$Companion$ADAPTER$1 inTransactionTopUpInfo$Companion$ADAPTER$1 = new InTransactionTopUpInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InTransactionTopUpInfo.class), "type.googleapis.com/squareup.cash.grantly.api.InTransactionTopUpInfo", Syntax.PROTO_2, null, "squareup/cash/grantly/api/in_transaction_top_up_flow_end_result.proto");
        ADAPTER = inTransactionTopUpInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inTransactionTopUpInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InTransactionTopUpInfo(Instrument instrument, Money money, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.selected_instrument = instrument;
        this.top_up_amount = money;
        this.minimum_required_top_up_amount = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InTransactionTopUpInfo)) {
            return false;
        }
        InTransactionTopUpInfo inTransactionTopUpInfo = (InTransactionTopUpInfo) obj;
        return Intrinsics.areEqual(unknownFields(), inTransactionTopUpInfo.unknownFields()) && Intrinsics.areEqual(this.selected_instrument, inTransactionTopUpInfo.selected_instrument) && Intrinsics.areEqual(this.top_up_amount, inTransactionTopUpInfo.top_up_amount) && Intrinsics.areEqual(this.minimum_required_top_up_amount, inTransactionTopUpInfo.minimum_required_top_up_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Instrument instrument = this.selected_instrument;
        int hashCode2 = (hashCode + (instrument != null ? instrument.hashCode() : 0)) * 37;
        Money money = this.top_up_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.minimum_required_top_up_amount;
        int hashCode4 = hashCode3 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(27);
        builder.loan_type = this.selected_instrument;
        builder.payment_schedule = this.top_up_amount;
        builder.tila_data = this.minimum_required_top_up_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Instrument instrument = this.selected_instrument;
        if (instrument != null) {
            arrayList.add("selected_instrument=" + instrument);
        }
        Money money = this.top_up_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("top_up_amount=", money, arrayList);
        }
        Money money2 = this.minimum_required_top_up_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("minimum_required_top_up_amount=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InTransactionTopUpInfo{", "}", 0, null, null, 56);
    }
}
