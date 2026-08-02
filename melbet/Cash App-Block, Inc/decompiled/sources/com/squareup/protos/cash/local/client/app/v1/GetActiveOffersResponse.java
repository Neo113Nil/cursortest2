package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/local/client/app/v1/GetActiveOffersResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/SandboxMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetActiveOffersResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetActiveOffersResponse> CREATOR;
    public final List offers;

    static {
        GetActiveOffersResponse$Companion$ADAPTER$1 getActiveOffersResponse$Companion$ADAPTER$1 = new GetActiveOffersResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetActiveOffersResponse.class), "type.googleapis.com/squareup.cash.local.client.app.v1.GetActiveOffersResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = getActiveOffersResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getActiveOffersResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActiveOffersResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.offers = TransactorKt.immutableCopyOf("offers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetActiveOffersResponse)) {
            return false;
        }
        GetActiveOffersResponse getActiveOffersResponse = (GetActiveOffersResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getActiveOffersResponse.unknownFields()) && Intrinsics.areEqual(this.offers, getActiveOffersResponse.offers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.offers.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(27, false);
        builder.scenarios = this.offers;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.offers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("offers=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetActiveOffersResponse{", "}", 0, null, null, 56);
    }
}
