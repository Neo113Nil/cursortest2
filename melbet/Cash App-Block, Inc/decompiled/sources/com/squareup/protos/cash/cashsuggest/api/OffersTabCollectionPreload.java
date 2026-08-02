package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
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
public final class OffersTabCollectionPreload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OffersTabCollectionPreload> CREATOR;
    public final OffersTabCollectionResponse collection_response;
    public final String collection_token;

    static {
        OffersTabCollectionPreload$Companion$ADAPTER$1 offersTabCollectionPreload$Companion$ADAPTER$1 = new OffersTabCollectionPreload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OffersTabCollectionPreload.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OffersTabCollectionPreload", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/OffersTabCollection.proto");
        ADAPTER = offersTabCollectionPreload$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offersTabCollectionPreload$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersTabCollectionPreload(String str, OffersTabCollectionResponse offersTabCollectionResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.collection_token = str;
        this.collection_response = offersTabCollectionResponse;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OffersTabCollectionPreload)) {
            return false;
        }
        OffersTabCollectionPreload offersTabCollectionPreload = (OffersTabCollectionPreload) obj;
        return Intrinsics.areEqual(unknownFields(), offersTabCollectionPreload.unknownFields()) && Intrinsics.areEqual(this.collection_token, offersTabCollectionPreload.collection_token) && Intrinsics.areEqual(this.collection_response, offersTabCollectionPreload.collection_response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.collection_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        OffersTabCollectionResponse offersTabCollectionResponse = this.collection_response;
        int hashCode3 = hashCode2 + (offersTabCollectionResponse != null ? offersTabCollectionResponse.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(19);
        builder.image_url = this.collection_token;
        builder.asset = this.collection_response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.collection_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "collection_token=", arrayList);
        }
        OffersTabCollectionResponse offersTabCollectionResponse = this.collection_response;
        if (offersTabCollectionResponse != null) {
            arrayList.add("collection_response=" + offersTabCollectionResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OffersTabCollectionPreload{", "}", 0, null, null, 56);
    }
}
