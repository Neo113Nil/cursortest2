package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzhy;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetBuyerAccountResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzhy", "Success", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetBuyerAccountResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBuyerAccountResponse> CREATOR;
    public final zzhy response;

    public final class Success extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Success> CREATOR;
        public final LocalBuyer.LocalBuyerAccount buyer_account;

        static {
            GetBuyerAccountResponse$Success$Companion$ADAPTER$1 getBuyerAccountResponse$Success$Companion$ADAPTER$1 = new GetBuyerAccountResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.local.client.v1.GetBuyerAccountResponse.Success", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getBuyerAccountResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getBuyerAccountResponse$Success$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(LocalBuyer.LocalBuyerAccount localBuyerAccount, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.buyer_account = localBuyerAccount;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(unknownFields(), success.unknownFields()) && Intrinsics.areEqual(this.buyer_account, success.buyer_account);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalBuyer.LocalBuyerAccount localBuyerAccount = this.buyer_account;
            int hashCode2 = hashCode + (localBuyerAccount != null ? localBuyerAccount.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GroupParticipant.Builder builder = new GroupParticipant.Builder(27);
            builder.f1276type = this.buyer_account;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalBuyer.LocalBuyerAccount localBuyerAccount = this.buyer_account;
            if (localBuyerAccount != null) {
                arrayList.add("buyer_account=" + localBuyerAccount);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Success{", "}", 0, null, null, 56);
        }
    }

    static {
        GetBuyerAccountResponse$Companion$ADAPTER$1 getBuyerAccountResponse$Companion$ADAPTER$1 = new GetBuyerAccountResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBuyerAccountResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetBuyerAccountResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getBuyerAccountResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBuyerAccountResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBuyerAccountResponse(zzhy zzhyVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = zzhyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBuyerAccountResponse)) {
            return false;
        }
        GetBuyerAccountResponse getBuyerAccountResponse = (GetBuyerAccountResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBuyerAccountResponse.unknownFields()) && Intrinsics.areEqual(this.response, getBuyerAccountResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzhy zzhyVar = this.response;
        int hashCode2 = hashCode + (zzhyVar != null ? zzhyVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(26);
        builder.f1276type = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzhy zzhyVar = this.response;
        if (zzhyVar != null) {
            arrayList.add("response=" + zzhyVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBuyerAccountResponse{", "}", 0, null, null, 56);
    }
}
