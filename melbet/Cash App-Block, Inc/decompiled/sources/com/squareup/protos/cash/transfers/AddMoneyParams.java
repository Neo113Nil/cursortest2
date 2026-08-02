package com.squareup.protos.cash.transfers;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.Allowed;
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

/* loaded from: classes8.dex */
public final class AddMoneyParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddMoneyParams> CREATOR;
    public final Money amount;
    public final String instrument_token;
    public final TransferClientRouteSource source;
    public final Boolean start_in_keypad;

    static {
        AddMoneyParams$Companion$ADAPTER$1 addMoneyParams$Companion$ADAPTER$1 = new AddMoneyParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddMoneyParams.class), "type.googleapis.com/squareup.cash.transfers.AddMoneyParams", Syntax.PROTO_2, null, "squareup/cash/transfers/client/route/transfers_add_money_params.proto");
        ADAPTER = addMoneyParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(addMoneyParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMoneyParams(Money money, String str, TransferClientRouteSource transferClientRouteSource, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = money;
        this.instrument_token = str;
        this.source = transferClientRouteSource;
        this.start_in_keypad = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddMoneyParams)) {
            return false;
        }
        AddMoneyParams addMoneyParams = (AddMoneyParams) obj;
        return Intrinsics.areEqual(unknownFields(), addMoneyParams.unknownFields()) && Intrinsics.areEqual(this.amount, addMoneyParams.amount) && Intrinsics.areEqual(this.instrument_token, addMoneyParams.instrument_token) && this.source == addMoneyParams.source && Intrinsics.areEqual(this.start_in_keypad, addMoneyParams.start_in_keypad);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.instrument_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        TransferClientRouteSource transferClientRouteSource = this.source;
        int hashCode4 = (hashCode3 + (transferClientRouteSource != null ? transferClientRouteSource.hashCode() : 0)) * 37;
        Boolean bool = this.start_in_keypad;
        int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(28);
        builder.card_encryption_data = this.amount;
        builder.customer_token_hash_email = this.instrument_token;
        builder.device_metadata = this.source;
        builder.success_screen = this.start_in_keypad;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        String str = this.instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
        }
        TransferClientRouteSource transferClientRouteSource = this.source;
        if (transferClientRouteSource != null) {
            arrayList.add("source=" + transferClientRouteSource);
        }
        Boolean bool = this.start_in_keypad;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_in_keypad=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddMoneyParams{", "}", 0, null, null, 56);
    }
}
