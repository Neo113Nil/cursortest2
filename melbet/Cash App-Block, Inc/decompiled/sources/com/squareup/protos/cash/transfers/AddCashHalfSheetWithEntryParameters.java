package com.squareup.protos.cash.transfers;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
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
public final class AddCashHalfSheetWithEntryParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddCashHalfSheetWithEntryParameters> CREATOR;
    public final String entry_client_route;
    public final String entry_token;
    public final Money suggested_amount;
    public final LocalizedString title;

    static {
        AddCashHalfSheetWithEntryParameters$Companion$ADAPTER$1 addCashHalfSheetWithEntryParameters$Companion$ADAPTER$1 = new AddCashHalfSheetWithEntryParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddCashHalfSheetWithEntryParameters.class), "type.googleapis.com/squareup.cash.transfers.AddCashHalfSheetWithEntryParameters", Syntax.PROTO_2, null, "squareup/cash/transfers/client/route/add_cash_half_sheet_params.proto");
        ADAPTER = addCashHalfSheetWithEntryParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(addCashHalfSheetWithEntryParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCashHalfSheetWithEntryParameters(String str, LocalizedString localizedString, String str2, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entry_client_route = str;
        this.title = localizedString;
        this.entry_token = str2;
        this.suggested_amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddCashHalfSheetWithEntryParameters)) {
            return false;
        }
        AddCashHalfSheetWithEntryParameters addCashHalfSheetWithEntryParameters = (AddCashHalfSheetWithEntryParameters) obj;
        return Intrinsics.areEqual(unknownFields(), addCashHalfSheetWithEntryParameters.unknownFields()) && Intrinsics.areEqual(this.entry_client_route, addCashHalfSheetWithEntryParameters.entry_client_route) && Intrinsics.areEqual(this.title, addCashHalfSheetWithEntryParameters.title) && Intrinsics.areEqual(this.entry_token, addCashHalfSheetWithEntryParameters.entry_token) && Intrinsics.areEqual(this.suggested_amount, addCashHalfSheetWithEntryParameters.suggested_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.entry_client_route;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        String str2 = this.entry_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.suggested_amount;
        int hashCode5 = hashCode4 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(27);
        builder.customer_token_hash_email = this.entry_client_route;
        builder.card_encryption_data = this.title;
        builder.device_metadata = this.entry_token;
        builder.success_screen = this.suggested_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.entry_client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entry_client_route=", arrayList);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        String str2 = this.entry_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "entry_token=", arrayList);
        }
        Money money = this.suggested_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("suggested_amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddCashHalfSheetWithEntryParameters{", "}", 0, null, null, 56);
    }
}
