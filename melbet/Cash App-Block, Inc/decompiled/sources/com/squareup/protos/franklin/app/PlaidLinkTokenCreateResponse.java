package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PoolsConfig;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/PlaidLinkTokenCreateResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/PoolsConfig$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlaidLinkTokenCreateResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PlaidLinkTokenCreateResponse> CREATOR;
    public final String expiration;
    public final String link_token;
    public final String request_id;

    static {
        PlaidLinkTokenCreateResponse$Companion$ADAPTER$1 plaidLinkTokenCreateResponse$Companion$ADAPTER$1 = new PlaidLinkTokenCreateResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PlaidLinkTokenCreateResponse.class), "type.googleapis.com/squareup.franklin.app.PlaidLinkTokenCreateResponse", Syntax.PROTO_2, null, "squareup/franklin/app/plaid.proto");
        ADAPTER = plaidLinkTokenCreateResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(plaidLinkTokenCreateResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidLinkTokenCreateResponse(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.link_token = str;
        this.expiration = str2;
        this.request_id = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaidLinkTokenCreateResponse)) {
            return false;
        }
        PlaidLinkTokenCreateResponse plaidLinkTokenCreateResponse = (PlaidLinkTokenCreateResponse) obj;
        return Intrinsics.areEqual(unknownFields(), plaidLinkTokenCreateResponse.unknownFields()) && Intrinsics.areEqual(this.link_token, plaidLinkTokenCreateResponse.link_token) && Intrinsics.areEqual(this.expiration, plaidLinkTokenCreateResponse.expiration) && Intrinsics.areEqual(this.request_id, plaidLinkTokenCreateResponse.request_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.link_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.expiration;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.request_id;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolsConfig.Builder builder = new PoolsConfig.Builder(5);
        builder.nux_details_img_url = this.link_token;
        builder.nux_activity_img_url = this.expiration;
        builder.share_background_img_url = this.request_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.link_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "link_token=", arrayList);
        }
        String str2 = this.expiration;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "expiration=", arrayList);
        }
        String str3 = this.request_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "request_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidLinkTokenCreateResponse{", "}", 0, null, null, 56);
    }
}
