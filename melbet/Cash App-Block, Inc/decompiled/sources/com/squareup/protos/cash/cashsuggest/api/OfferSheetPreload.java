package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
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
public final class OfferSheetPreload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OfferSheetPreload> CREATOR;
    public final OfferSheetKey sheet_key;
    public final OffersSheetResponse sheet_response;

    static {
        OfferSheetPreload$Companion$ADAPTER$1 offerSheetPreload$Companion$ADAPTER$1 = new OfferSheetPreload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferSheetPreload.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OfferSheetPreload", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/OffersSheet.proto");
        ADAPTER = offerSheetPreload$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offerSheetPreload$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferSheetPreload(OfferSheetKey offerSheetKey, OffersSheetResponse offersSheetResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sheet_key = offerSheetKey;
        this.sheet_response = offersSheetResponse;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfferSheetPreload)) {
            return false;
        }
        OfferSheetPreload offerSheetPreload = (OfferSheetPreload) obj;
        return Intrinsics.areEqual(unknownFields(), offerSheetPreload.unknownFields()) && Intrinsics.areEqual(this.sheet_key, offerSheetPreload.sheet_key) && Intrinsics.areEqual(this.sheet_response, offerSheetPreload.sheet_response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OfferSheetKey offerSheetKey = this.sheet_key;
        int hashCode2 = (hashCode + (offerSheetKey != null ? offerSheetKey.hashCode() : 0)) * 37;
        OffersSheetResponse offersSheetResponse = this.sheet_response;
        int hashCode3 = hashCode2 + (offersSheetResponse != null ? offersSheetResponse.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(18);
        builder.image_url = this.sheet_key;
        builder.asset = this.sheet_response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OfferSheetKey offerSheetKey = this.sheet_key;
        if (offerSheetKey != null) {
            arrayList.add("sheet_key=" + offerSheetKey);
        }
        OffersSheetResponse offersSheetResponse = this.sheet_response;
        if (offersSheetResponse != null) {
            arrayList.add("sheet_response=" + offersSheetResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OfferSheetPreload{", "}", 0, null, null, 56);
    }
}
