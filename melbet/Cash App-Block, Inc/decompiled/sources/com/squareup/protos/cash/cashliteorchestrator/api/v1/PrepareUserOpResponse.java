package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Deprecated
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PrepareUserOpResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PrepareUserOpResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PrepareUserOpResponse> CREATOR;
    public final ByteString prepared_calls;
    public final List signature_requests;

    static {
        PrepareUserOpResponse$Companion$ADAPTER$1 prepareUserOpResponse$Companion$ADAPTER$1 = new PrepareUserOpResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PrepareUserOpResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.PrepareUserOpResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = prepareUserOpResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(prepareUserOpResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepareUserOpResponse(ByteString byteString, List list, ByteString byteString2) {
        super(ADAPTER, byteString2);
        list.getClass();
        byteString2.getClass();
        this.prepared_calls = byteString;
        this.signature_requests = TransactorKt.immutableCopyOf("signature_requests", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrepareUserOpResponse)) {
            return false;
        }
        PrepareUserOpResponse prepareUserOpResponse = (PrepareUserOpResponse) obj;
        return Intrinsics.areEqual(unknownFields(), prepareUserOpResponse.unknownFields()) && Intrinsics.areEqual(this.prepared_calls, prepareUserOpResponse.prepared_calls) && Intrinsics.areEqual(this.signature_requests, prepareUserOpResponse.signature_requests);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.prepared_calls;
        int hashCode2 = this.signature_requests.hashCode() + ((hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(5);
        builder.image_url = this.prepared_calls;
        builder.asset = this.signature_requests;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.prepared_calls;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("prepared_calls=", byteString, arrayList);
        }
        List list = this.signature_requests;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("signature_requests=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrepareUserOpResponse{", "}", 0, null, null, 56);
    }
}
