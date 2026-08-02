package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
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
public final class GetWalletAddressesError extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetWalletAddressesError> CREATOR;
    public final GetWalletAddressesErrorCode code;
    public final String message;

    static {
        GetWalletAddressesError$Companion$ADAPTER$1 getWalletAddressesError$Companion$ADAPTER$1 = new GetWalletAddressesError$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetWalletAddressesError.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.GetWalletAddressesError", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/wallet_addresses_messages.proto");
        ADAPTER = getWalletAddressesError$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getWalletAddressesError$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWalletAddressesError(GetWalletAddressesErrorCode getWalletAddressesErrorCode, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.code = getWalletAddressesErrorCode;
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetWalletAddressesError)) {
            return false;
        }
        GetWalletAddressesError getWalletAddressesError = (GetWalletAddressesError) obj;
        return Intrinsics.areEqual(unknownFields(), getWalletAddressesError.unknownFields()) && this.code == getWalletAddressesError.code && Intrinsics.areEqual(this.message, getWalletAddressesError.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GetWalletAddressesErrorCode getWalletAddressesErrorCode = this.code;
        int hashCode2 = (hashCode + (getWalletAddressesErrorCode != null ? getWalletAddressesErrorCode.hashCode() : 0)) * 37;
        String str = this.message;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(29);
        builder.errors = this.code;
        builder.result = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GetWalletAddressesErrorCode getWalletAddressesErrorCode = this.code;
        if (getWalletAddressesErrorCode != null) {
            arrayList.add("code=" + getWalletAddressesErrorCode);
        }
        String str = this.message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetWalletAddressesError{", "}", 0, null, null, 56);
    }
}
