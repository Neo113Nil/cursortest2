package com.squareup.protos.cash.discover.api.app.v2.api;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/discover/api/app/v2/api/AiSearchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Asset$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AiSearchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AiSearchResponse> CREATOR;
    public final Summary summary;

    static {
        AiSearchResponse$Companion$ADAPTER$1 aiSearchResponse$Companion$ADAPTER$1 = new AiSearchResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AiSearchResponse.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.api.AiSearchResponse", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/api/search.proto");
        ADAPTER = aiSearchResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(aiSearchResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiSearchResponse(Summary summary, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.summary = summary;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiSearchResponse)) {
            return false;
        }
        AiSearchResponse aiSearchResponse = (AiSearchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), aiSearchResponse.unknownFields()) && Intrinsics.areEqual(this.summary, aiSearchResponse.summary);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Summary summary = this.summary;
        int hashCode2 = hashCode + (summary != null ? summary.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(14);
        builder.asset_type = this.summary;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Summary summary = this.summary;
        if (summary != null) {
            arrayList.add("summary=" + summary);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AiSearchResponse{", "}", 0, null, null, 56);
    }
}
