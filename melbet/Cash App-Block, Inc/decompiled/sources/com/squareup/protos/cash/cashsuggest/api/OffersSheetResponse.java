package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.shop.rendering.api.OfferSheet;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashsuggest/api/OffersSheetResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/Row$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OffersSheetResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OffersSheetResponse> CREATOR;
    public final Long expire_at_ms;
    public final OfferSheet sheet;
    public final List sheets_preload;

    static {
        OffersSheetResponse$Companion$ADAPTER$1 offersSheetResponse$Companion$ADAPTER$1 = new OffersSheetResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OffersSheetResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OffersSheetResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/OffersSheet.proto");
        ADAPTER = offersSheetResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offersSheetResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetResponse(OfferSheet offerSheet, Long l, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.sheet = offerSheet;
        this.expire_at_ms = l;
        this.sheets_preload = TransactorKt.immutableCopyOf("sheets_preload", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OffersSheetResponse)) {
            return false;
        }
        OffersSheetResponse offersSheetResponse = (OffersSheetResponse) obj;
        return Intrinsics.areEqual(unknownFields(), offersSheetResponse.unknownFields()) && Intrinsics.areEqual(this.sheet, offersSheetResponse.sheet) && Intrinsics.areEqual(this.expire_at_ms, offersSheetResponse.expire_at_ms) && Intrinsics.areEqual(this.sheets_preload, offersSheetResponse.sheets_preload);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OfferSheet offerSheet = this.sheet;
        int hashCode2 = (hashCode + (offerSheet != null ? offerSheet.hashCode() : 0)) * 37;
        Long l = this.expire_at_ms;
        int hashCode3 = this.sheets_preload.hashCode() + ((hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder();
        builder.title = this.sheet;
        builder.subtitle = this.expire_at_ms;
        builder.action = this.sheets_preload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OfferSheet offerSheet = this.sheet;
        if (offerSheet != null) {
            arrayList.add("sheet=" + offerSheet);
        }
        Long l = this.expire_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at_ms=", l, arrayList);
        }
        List list = this.sheets_preload;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sheets_preload=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OffersSheetResponse{", "}", 0, null, null, 56);
    }
}
