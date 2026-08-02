package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzhx;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetBrandProfileResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/BrandBanner$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzhx", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetBrandProfileResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBrandProfileResponse> CREATOR;
    public final Long expires_at;
    public final Boolean is_enrolled;
    public final LocalBuyer local_buyer;
    public final zzhx response;
    public final LocalUserIntent user_intent;

    static {
        GetBrandProfileResponse$Companion$ADAPTER$1 getBrandProfileResponse$Companion$ADAPTER$1 = new GetBrandProfileResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBrandProfileResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetBrandProfileResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getBrandProfileResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBrandProfileResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBrandProfileResponse(Long l, zzhx zzhxVar, Boolean bool, LocalBuyer localBuyer, LocalUserIntent localUserIntent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.expires_at = l;
        this.response = zzhxVar;
        this.is_enrolled = bool;
        this.local_buyer = localBuyer;
        this.user_intent = localUserIntent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBrandProfileResponse)) {
            return false;
        }
        GetBrandProfileResponse getBrandProfileResponse = (GetBrandProfileResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBrandProfileResponse.unknownFields()) && Intrinsics.areEqual(this.expires_at, getBrandProfileResponse.expires_at) && Intrinsics.areEqual(this.response, getBrandProfileResponse.response) && Intrinsics.areEqual(this.is_enrolled, getBrandProfileResponse.is_enrolled) && Intrinsics.areEqual(this.local_buyer, getBrandProfileResponse.local_buyer) && Intrinsics.areEqual(this.user_intent, getBrandProfileResponse.user_intent);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.expires_at;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        zzhx zzhxVar = this.response;
        int hashCode3 = (hashCode2 + (zzhxVar != null ? zzhxVar.hashCode() : 0)) * 37;
        Boolean bool = this.is_enrolled;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalBuyer localBuyer = this.local_buyer;
        int hashCode5 = (hashCode4 + (localBuyer != null ? localBuyer.hashCode() : 0)) * 37;
        LocalUserIntent localUserIntent = this.user_intent;
        int hashCode6 = hashCode5 + (localUserIntent != null ? localUserIntent.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(2);
        builder.icon = this.expires_at;
        builder.title = this.response;
        builder.subtitle = this.is_enrolled;
        builder.action = this.local_buyer;
        builder.icon_background_color = this.user_intent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        zzhx zzhxVar = this.response;
        if (zzhxVar != null) {
            arrayList.add("response=" + zzhxVar);
        }
        Boolean bool = this.is_enrolled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_enrolled=", bool, arrayList);
        }
        LocalBuyer localBuyer = this.local_buyer;
        if (localBuyer != null) {
            arrayList.add("local_buyer=" + localBuyer);
        }
        LocalUserIntent localUserIntent = this.user_intent;
        if (localUserIntent != null) {
            arrayList.add("user_intent=" + localUserIntent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBrandProfileResponse{", "}", 0, null, null, 56);
    }
}
