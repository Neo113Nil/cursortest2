package com.squareup.protos.cash.discover.api.app.v1.message;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/discover/api/app/v1/message/GetDetailsPageResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Asset$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetDetailsPageResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDetailsPageResponse> CREATOR;
    public final DetailsPage details_page;

    static {
        GetDetailsPageResponse$Companion$ADAPTER$1 getDetailsPageResponse$Companion$ADAPTER$1 = new GetDetailsPageResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetDetailsPageResponse.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.message.GetDetailsPageResponse", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/message/get_details_page.proto");
        ADAPTER = getDetailsPageResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getDetailsPageResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDetailsPageResponse(DetailsPage detailsPage, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.details_page = detailsPage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDetailsPageResponse)) {
            return false;
        }
        GetDetailsPageResponse getDetailsPageResponse = (GetDetailsPageResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getDetailsPageResponse.unknownFields()) && Intrinsics.areEqual(this.details_page, getDetailsPageResponse.details_page);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DetailsPage detailsPage = this.details_page;
        int hashCode2 = hashCode + (detailsPage != null ? detailsPage.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(12);
        builder.asset_type = this.details_page;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DetailsPage detailsPage = this.details_page;
        if (detailsPage != null) {
            arrayList.add("details_page=" + detailsPage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDetailsPageResponse{", "}", 0, null, null, 56);
    }
}
