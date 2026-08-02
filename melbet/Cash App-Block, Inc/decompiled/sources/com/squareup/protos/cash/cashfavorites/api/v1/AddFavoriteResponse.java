package com.squareup.protos.cash.cashfavorites.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cashlynxflow.api.v2.AuthorizeDigitalWalletPaymentResponse;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashfavorites/api/v1/AddFavoriteResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashfavorites/api/v1/AddFavoriteResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddFavoriteResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddFavoriteResponse> CREATOR;
    public final Boolean is_first_time_customer_favorite;
    public final ResponseContext response_context;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Boolean is_first_time_customer_favorite;
        public ResponseContext response_context;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new AddFavoriteResponse(this.response_context, this.is_first_time_customer_favorite, buildUnknownFields());
                default:
                    return new AuthorizeDigitalWalletPaymentResponse(this.response_context, this.is_first_time_customer_favorite, buildUnknownFields());
            }
        }
    }

    static {
        AddFavoriteResponse$Companion$ADAPTER$1 addFavoriteResponse$Companion$ADAPTER$1 = new AddFavoriteResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddFavoriteResponse.class), "type.googleapis.com/squareup.cash.cashfavorites.api.v1.AddFavoriteResponse", Syntax.PROTO_2, null, "squareup/cash/cashfavorites/api/v1/favorites.proto");
        ADAPTER = addFavoriteResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(addFavoriteResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFavoriteResponse(ResponseContext responseContext, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.is_first_time_customer_favorite = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddFavoriteResponse)) {
            return false;
        }
        AddFavoriteResponse addFavoriteResponse = (AddFavoriteResponse) obj;
        return Intrinsics.areEqual(unknownFields(), addFavoriteResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, addFavoriteResponse.response_context) && Intrinsics.areEqual(this.is_first_time_customer_favorite, addFavoriteResponse.is_first_time_customer_favorite);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Boolean bool = this.is_first_time_customer_favorite;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.response_context = this.response_context;
        builder.is_first_time_customer_favorite = this.is_first_time_customer_favorite;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Boolean bool = this.is_first_time_customer_favorite;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_first_time_customer_favorite=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddFavoriteResponse{", "}", 0, null, null, 56);
    }
}
