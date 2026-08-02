package com.squareup.protos.cash.clientsync.service;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/clientsync/service/GetSyncEntitiesByTargetResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashsuggest/api/AfterpayAppletRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSyncEntitiesByTargetResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSyncEntitiesByTargetResponse> CREATOR;
    public final Boolean has_more;
    public final List offsets;
    public final List target_entities;

    static {
        GetSyncEntitiesByTargetResponse$Companion$ADAPTER$1 getSyncEntitiesByTargetResponse$Companion$ADAPTER$1 = new GetSyncEntitiesByTargetResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSyncEntitiesByTargetResponse.class), "type.googleapis.com/squareup.cash.clientsync.service.GetSyncEntitiesByTargetResponse", Syntax.PROTO_2, null, "squareup/cash/clientsync/app.proto");
        ADAPTER = getSyncEntitiesByTargetResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSyncEntitiesByTargetResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSyncEntitiesByTargetResponse(Boolean bool, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.has_more = bool;
        this.target_entities = TransactorKt.immutableCopyOf("target_entities", list);
        this.offsets = TransactorKt.immutableCopyOf("offsets", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSyncEntitiesByTargetResponse)) {
            return false;
        }
        GetSyncEntitiesByTargetResponse getSyncEntitiesByTargetResponse = (GetSyncEntitiesByTargetResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSyncEntitiesByTargetResponse.unknownFields()) && Intrinsics.areEqual(this.target_entities, getSyncEntitiesByTargetResponse.target_entities) && Intrinsics.areEqual(this.offsets, getSyncEntitiesByTargetResponse.offsets) && Intrinsics.areEqual(this.has_more, getSyncEntitiesByTargetResponse.has_more);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.target_entities), 37, this.offsets);
        Boolean bool = this.has_more;
        int hashCode = m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AfterpayAppletRequest.Builder builder = new AfterpayAppletRequest.Builder(1);
        builder.viewed_display_message_ids = this.target_entities;
        builder.viewed_section_ids = this.offsets;
        builder.has_viewed_applet = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.target_entities;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("target_entities=", arrayList, list);
        }
        List list2 = this.offsets;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("offsets=", arrayList, list2);
        }
        Boolean bool = this.has_more;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_more=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSyncEntitiesByTargetResponse{", "}", 0, null, null, 56);
    }
}
