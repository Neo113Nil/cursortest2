package com.squareup.protos.cash.janus.api.trusthub;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
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
import squareup.cash.ui.arcade.elements.HeroHeader;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/janus/api/trusthub/GetTrustHubResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/Group$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetTrustHubResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetTrustHubResponse> CREATOR;
    public final List alerts;
    public final HeroHeader header;
    public final StatusIndicator indicator;

    static {
        GetTrustHubResponse$Companion$ADAPTER$1 getTrustHubResponse$Companion$ADAPTER$1 = new GetTrustHubResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetTrustHubResponse.class), "type.googleapis.com/squareup.cash.janus.api.trusthub.GetTrustHubResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/trusthub/TrustHub.proto");
        ADAPTER = getTrustHubResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getTrustHubResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrustHubResponse(StatusIndicator statusIndicator, HeroHeader heroHeader, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.indicator = statusIndicator;
        this.header = heroHeader;
        this.alerts = TransactorKt.immutableCopyOf("alerts", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetTrustHubResponse)) {
            return false;
        }
        GetTrustHubResponse getTrustHubResponse = (GetTrustHubResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getTrustHubResponse.unknownFields()) && this.indicator == getTrustHubResponse.indicator && Intrinsics.areEqual(this.header, getTrustHubResponse.header) && Intrinsics.areEqual(this.alerts, getTrustHubResponse.alerts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        StatusIndicator statusIndicator = this.indicator;
        int hashCode2 = (hashCode + (statusIndicator != null ? statusIndicator.hashCode() : 0)) * 37;
        HeroHeader heroHeader = this.header;
        int hashCode3 = this.alerts.hashCode() + ((hashCode2 + (heroHeader != null ? heroHeader.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(10);
        builder.name = this.indicator;
        builder.group_image = this.header;
        builder.participants = this.alerts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StatusIndicator statusIndicator = this.indicator;
        if (statusIndicator != null) {
            arrayList.add("indicator=" + statusIndicator);
        }
        HeroHeader heroHeader = this.header;
        if (heroHeader != null) {
            arrayList.add("header=" + heroHeader);
        }
        List list = this.alerts;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("alerts=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTrustHubResponse{", "}", 0, null, null, 56);
    }
}
