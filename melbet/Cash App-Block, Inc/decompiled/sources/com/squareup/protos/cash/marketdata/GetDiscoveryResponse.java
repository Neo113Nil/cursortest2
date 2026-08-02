package com.squareup.protos.cash.marketdata;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/marketdata/GetDiscoveryResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/bankingbenefits/ui/GreenBenefitsV1$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetDiscoveryResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDiscoveryResponse> CREATOR;
    public final List categories;
    public final List search_categories;

    static {
        GetDiscoveryResponse$Companion$ADAPTER$1 getDiscoveryResponse$Companion$ADAPTER$1 = new GetDiscoveryResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetDiscoveryResponse.class), "type.googleapis.com/squareup.cash.marketdata.GetDiscoveryResponse", Syntax.PROTO_2, null, "squareup/cash/marketdata/service.proto");
        ADAPTER = getDiscoveryResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getDiscoveryResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDiscoveryResponse(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.categories = TransactorKt.immutableCopyOf("categories", list);
        this.search_categories = TransactorKt.immutableCopyOf("search_categories", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDiscoveryResponse)) {
            return false;
        }
        GetDiscoveryResponse getDiscoveryResponse = (GetDiscoveryResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getDiscoveryResponse.unknownFields()) && Intrinsics.areEqual(this.categories, getDiscoveryResponse.categories) && Intrinsics.areEqual(this.search_categories, getDiscoveryResponse.search_categories);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.search_categories.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.categories);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(11, false);
        builder.card_holder_benefits = this.categories;
        builder.green_status_benefits = this.search_categories;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.categories;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("categories=", arrayList, list);
        }
        List list2 = this.search_categories;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("search_categories=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDiscoveryResponse{", "}", 0, null, null, 56);
    }
}
