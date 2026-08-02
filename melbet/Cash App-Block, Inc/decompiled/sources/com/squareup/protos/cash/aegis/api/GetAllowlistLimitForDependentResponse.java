package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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
import squareup.cash.earnings.EarningsYearToDate;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/aegis/api/GetAllowlistLimitForDependentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/earnings/EarningsYearToDate$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAllowlistLimitForDependentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAllowlistLimitForDependentResponse> CREATOR;
    public final Integer allowlist_limit;

    static {
        GetAllowlistLimitForDependentResponse$Companion$ADAPTER$1 getAllowlistLimitForDependentResponse$Companion$ADAPTER$1 = new GetAllowlistLimitForDependentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAllowlistLimitForDependentResponse.class), "type.googleapis.com/squareup.cash.aegis.api.GetAllowlistLimitForDependentResponse", Syntax.PROTO_2, null, "squareup/cash/aegis/api/GetAllowlistLimitForDependentResponse.proto");
        ADAPTER = getAllowlistLimitForDependentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAllowlistLimitForDependentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAllowlistLimitForDependentResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.allowlist_limit = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAllowlistLimitForDependentResponse)) {
            return false;
        }
        GetAllowlistLimitForDependentResponse getAllowlistLimitForDependentResponse = (GetAllowlistLimitForDependentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAllowlistLimitForDependentResponse.unknownFields()) && Intrinsics.areEqual(this.allowlist_limit, getAllowlistLimitForDependentResponse.allowlist_limit);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.allowlist_limit;
        int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningsYearToDate.Builder builder = new EarningsYearToDate.Builder(1);
        builder.year = this.allowlist_limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.allowlist_limit;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("allowlist_limit=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAllowlistLimitForDependentResponse{", "}", 0, null, null, 56);
    }
}
