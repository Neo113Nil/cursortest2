package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/api/v1/GetWalletAddressesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetWalletAddressesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetWalletAddressesResponse> CREATOR;
    public final GetWalletAddressesError error;
    public final List wallet_addresses;

    static {
        GetWalletAddressesResponse$Companion$ADAPTER$1 getWalletAddressesResponse$Companion$ADAPTER$1 = new GetWalletAddressesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetWalletAddressesResponse.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.GetWalletAddressesResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/wallet_addresses_messages.proto");
        ADAPTER = getWalletAddressesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getWalletAddressesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWalletAddressesResponse(List list, GetWalletAddressesError getWalletAddressesError, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.error = getWalletAddressesError;
        this.wallet_addresses = TransactorKt.immutableCopyOf("wallet_addresses", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetWalletAddressesResponse)) {
            return false;
        }
        GetWalletAddressesResponse getWalletAddressesResponse = (GetWalletAddressesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getWalletAddressesResponse.unknownFields()) && Intrinsics.areEqual(this.wallet_addresses, getWalletAddressesResponse.wallet_addresses) && Intrinsics.areEqual(this.error, getWalletAddressesResponse.error);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.wallet_addresses);
        GetWalletAddressesError getWalletAddressesError = this.error;
        int hashCode = m + (getWalletAddressesError != null ? getWalletAddressesError.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(1);
        builder.image_url = this.wallet_addresses;
        builder.asset = this.error;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.wallet_addresses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("wallet_addresses=", arrayList, list);
        }
        GetWalletAddressesError getWalletAddressesError = this.error;
        if (getWalletAddressesError != null) {
            arrayList.add("error=" + getWalletAddressesError);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetWalletAddressesResponse{", "}", 0, null, null, 56);
    }
}
