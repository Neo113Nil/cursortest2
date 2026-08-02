package com.squareup.protos.cash.transfers;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
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
public final class WithdrawParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WithdrawParams> CREATOR;
    public final Money amount;
    public final DepositPreference deposit_preference;
    public final String instrument_token;
    public final TransferClientRouteSource source;

    static {
        WithdrawParams$Companion$ADAPTER$1 withdrawParams$Companion$ADAPTER$1 = new WithdrawParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WithdrawParams.class), "type.googleapis.com/squareup.cash.transfers.WithdrawParams", Syntax.PROTO_2, null, "squareup/cash/transfers/client/route/transfers_withdraw_params.proto");
        ADAPTER = withdrawParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(withdrawParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawParams(Money money, DepositPreference depositPreference, String str, TransferClientRouteSource transferClientRouteSource, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = money;
        this.deposit_preference = depositPreference;
        this.instrument_token = str;
        this.source = transferClientRouteSource;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WithdrawParams)) {
            return false;
        }
        WithdrawParams withdrawParams = (WithdrawParams) obj;
        return Intrinsics.areEqual(unknownFields(), withdrawParams.unknownFields()) && Intrinsics.areEqual(this.amount, withdrawParams.amount) && this.deposit_preference == withdrawParams.deposit_preference && Intrinsics.areEqual(this.instrument_token, withdrawParams.instrument_token) && this.source == withdrawParams.source;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        DepositPreference depositPreference = this.deposit_preference;
        int hashCode3 = (hashCode2 + (depositPreference != null ? depositPreference.hashCode() : 0)) * 37;
        String str = this.instrument_token;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        TransferClientRouteSource transferClientRouteSource = this.source;
        int hashCode5 = hashCode4 + (transferClientRouteSource != null ? transferClientRouteSource.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(29);
        builder.card_encryption_data = this.amount;
        builder.device_metadata = this.deposit_preference;
        builder.customer_token_hash_email = this.instrument_token;
        builder.success_screen = this.source;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        DepositPreference depositPreference = this.deposit_preference;
        if (depositPreference != null) {
            arrayList.add("deposit_preference=" + depositPreference);
        }
        String str = this.instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
        }
        TransferClientRouteSource transferClientRouteSource = this.source;
        if (transferClientRouteSource != null) {
            arrayList.add("source=" + transferClientRouteSource);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WithdrawParams{", "}", 0, null, null, 56);
    }
}
