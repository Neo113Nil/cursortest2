package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.giftly.GiftCard;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/lending/SyncPrepurchaseCashCardResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/giftly/GiftCard$Options$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SyncPrepurchaseCashCardResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncPrepurchaseCashCardResponse> CREATOR;
    public final List alternative_locale_applet_data_list;
    public final PrepurchaseCashCardAppletData applet_data;
    public final ResponseContext response_context;

    static {
        SyncPrepurchaseCashCardResponse$Companion$ADAPTER$1 syncPrepurchaseCashCardResponse$Companion$ADAPTER$1 = new SyncPrepurchaseCashCardResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncPrepurchaseCashCardResponse.class), "type.googleapis.com/squareup.franklin.lending.SyncPrepurchaseCashCardResponse", Syntax.PROTO_2, null, "squareup/franklin/lending_api.proto");
        ADAPTER = syncPrepurchaseCashCardResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncPrepurchaseCashCardResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPrepurchaseCashCardResponse(ResponseContext responseContext, PrepurchaseCashCardAppletData prepurchaseCashCardAppletData, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.response_context = responseContext;
        this.applet_data = prepurchaseCashCardAppletData;
        this.alternative_locale_applet_data_list = TransactorKt.immutableCopyOf("alternative_locale_applet_data_list", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncPrepurchaseCashCardResponse)) {
            return false;
        }
        SyncPrepurchaseCashCardResponse syncPrepurchaseCashCardResponse = (SyncPrepurchaseCashCardResponse) obj;
        return Intrinsics.areEqual(unknownFields(), syncPrepurchaseCashCardResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, syncPrepurchaseCashCardResponse.response_context) && Intrinsics.areEqual(this.applet_data, syncPrepurchaseCashCardResponse.applet_data) && Intrinsics.areEqual(this.alternative_locale_applet_data_list, syncPrepurchaseCashCardResponse.alternative_locale_applet_data_list);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = this.applet_data;
        int hashCode3 = this.alternative_locale_applet_data_list.hashCode() + ((hashCode2 + (prepurchaseCashCardAppletData != null ? prepurchaseCashCardAppletData.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(7);
        builder.label = this.response_context;
        builder.localizable_label = this.applet_data;
        builder.client_scenario = this.alternative_locale_applet_data_list;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = this.applet_data;
        if (prepurchaseCashCardAppletData != null) {
            arrayList.add("applet_data=" + prepurchaseCashCardAppletData);
        }
        List list = this.alternative_locale_applet_data_list;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("alternative_locale_applet_data_list=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncPrepurchaseCashCardResponse{", "}", 0, null, null, 56);
    }
}
