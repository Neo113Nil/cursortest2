package com.squareup.protos.cash.postcard.app;

import android.os.Parcelable;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/postcard/app/FamilyAccountsUnlockIssuedCardsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsRequest$Builder;", "Builder", "Result", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FamilyAccountsUnlockIssuedCardsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FamilyAccountsUnlockIssuedCardsResponse> CREATOR;
    public final Result result;

    public enum Result implements WireEnum {
        SUCCESS(1),
        FAILURE(2);

        public final int value;
        public static final PoolVisibility.Companion Companion = new PoolVisibility.Companion();
        public static final FamilyAccountsUnlockIssuedCardsResponse$Result$Companion$ADAPTER$1 ADAPTER = new FamilyAccountsUnlockIssuedCardsResponse$Result$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Result.class), Syntax.PROTO_2, null);

        Result(int i) {
            this.value = i;
        }

        public static final Result fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return FAILURE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FamilyAccountsUnlockIssuedCardsResponse$Companion$ADAPTER$1 familyAccountsUnlockIssuedCardsResponse$Companion$ADAPTER$1 = new FamilyAccountsUnlockIssuedCardsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FamilyAccountsUnlockIssuedCardsResponse.class), "type.googleapis.com/squareup.cash.postcard.app.FamilyAccountsUnlockIssuedCardsResponse", Syntax.PROTO_2, null, "squareup/cash/postcard/app/FamilyAccountsUnlockIssuedCards.proto");
        ADAPTER = familyAccountsUnlockIssuedCardsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(familyAccountsUnlockIssuedCardsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyAccountsUnlockIssuedCardsResponse(Result result, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.result = result;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyAccountsUnlockIssuedCardsResponse)) {
            return false;
        }
        FamilyAccountsUnlockIssuedCardsResponse familyAccountsUnlockIssuedCardsResponse = (FamilyAccountsUnlockIssuedCardsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), familyAccountsUnlockIssuedCardsResponse.unknownFields()) && this.result == familyAccountsUnlockIssuedCardsResponse.result;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Result result = this.result;
        int hashCode2 = hashCode + (result != null ? result.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(12);
        builder.pool_lifecycle_filter = this.result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Result result = this.result;
        if (result != null) {
            arrayList.add("result=" + result);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FamilyAccountsUnlockIssuedCardsResponse{", "}", 0, null, null, 56);
    }
}
