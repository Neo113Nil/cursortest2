package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.TrustsData;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashstorefronts/api/GetBusinessProfileResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/TrustsData$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetBusinessProfileResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBusinessProfileResponse> CREATOR;
    public final List business_profiles;

    static {
        GetBusinessProfileResponse$Companion$ADAPTER$1 getBusinessProfileResponse$Companion$ADAPTER$1 = new GetBusinessProfileResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBusinessProfileResponse.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.GetBusinessProfileResponse", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/BusinessProfile.proto");
        ADAPTER = getBusinessProfileResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBusinessProfileResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBusinessProfileResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.business_profiles = TransactorKt.immutableCopyOf("business_profiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBusinessProfileResponse)) {
            return false;
        }
        GetBusinessProfileResponse getBusinessProfileResponse = (GetBusinessProfileResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBusinessProfileResponse.unknownFields()) && Intrinsics.areEqual(this.business_profiles, getBusinessProfileResponse.business_profiles);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.business_profiles.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        TrustsData.Builder builder = new TrustsData.Builder(8);
        builder.trust = this.business_profiles;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.business_profiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("business_profiles=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBusinessProfileResponse{", "}", 0, null, null, 56);
    }
}
