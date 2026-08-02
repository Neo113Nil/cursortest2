package com.squareup.protos.franklin.support;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityCategory;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/support/GetSupportContactStatusResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/marketdata/model/InvestmentEntityCategory$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSupportContactStatusResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSupportContactStatusResponse> CREATOR;
    public final Boolean chat_enabled;
    public final List contact_options;
    public final String text;
    public final String title;

    static {
        GetSupportContactStatusResponse$Companion$ADAPTER$1 getSupportContactStatusResponse$Companion$ADAPTER$1 = new GetSupportContactStatusResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSupportContactStatusResponse.class), "type.googleapis.com/squareup.franklin.support.GetSupportContactStatusResponse", Syntax.PROTO_2, null, "squareup/franklin/support.proto");
        ADAPTER = getSupportContactStatusResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSupportContactStatusResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSupportContactStatusResponse(Boolean bool, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.chat_enabled = bool;
        this.title = str;
        this.text = str2;
        this.contact_options = TransactorKt.immutableCopyOf("contact_options", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSupportContactStatusResponse)) {
            return false;
        }
        GetSupportContactStatusResponse getSupportContactStatusResponse = (GetSupportContactStatusResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSupportContactStatusResponse.unknownFields()) && Intrinsics.areEqual(this.chat_enabled, getSupportContactStatusResponse.chat_enabled) && Intrinsics.areEqual(this.title, getSupportContactStatusResponse.title) && Intrinsics.areEqual(this.text, getSupportContactStatusResponse.text) && Intrinsics.areEqual(this.contact_options, getSupportContactStatusResponse.contact_options);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.chat_enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.text;
        int hashCode4 = this.contact_options.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InvestmentEntityCategory.Builder builder = new InvestmentEntityCategory.Builder(1);
        builder.in_search_suggestion = this.chat_enabled;
        builder.name = this.title;
        builder.description = this.text;
        builder.investment_entities = this.contact_options;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.chat_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("chat_enabled=", bool, arrayList);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "text=", arrayList);
        }
        List list = this.contact_options;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("contact_options=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSupportContactStatusResponse{", "}", 0, null, null, 56);
    }
}
