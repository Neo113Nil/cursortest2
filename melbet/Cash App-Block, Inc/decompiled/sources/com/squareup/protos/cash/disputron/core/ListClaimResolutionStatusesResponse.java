package com.squareup.protos.cash.disputron.core;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/disputron/core/ListClaimResolutionStatusesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashsuggest/api/ToggleScreen$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListClaimResolutionStatusesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListClaimResolutionStatusesResponse> CREATOR;
    public final String next;
    public final List statuses;

    static {
        ListClaimResolutionStatusesResponse$Companion$ADAPTER$1 listClaimResolutionStatusesResponse$Companion$ADAPTER$1 = new ListClaimResolutionStatusesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListClaimResolutionStatusesResponse.class), "type.googleapis.com/squareup.cash.disputron.core.ListClaimResolutionStatusesResponse", Syntax.PROTO_3, null, "squareup/cash/disputron/core/ListClaimResolutionStatuses.proto");
        ADAPTER = listClaimResolutionStatusesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listClaimResolutionStatusesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListClaimResolutionStatusesResponse(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.next = str;
        this.statuses = TransactorKt.immutableCopyOf("statuses", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListClaimResolutionStatusesResponse)) {
            return false;
        }
        ListClaimResolutionStatusesResponse listClaimResolutionStatusesResponse = (ListClaimResolutionStatusesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), listClaimResolutionStatusesResponse.unknownFields()) && Intrinsics.areEqual(this.statuses, listClaimResolutionStatusesResponse.statuses) && Intrinsics.areEqual(this.next, listClaimResolutionStatusesResponse.next);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.statuses);
        String str = this.next;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(15, false);
        builder.sections = this.statuses;
        builder.toggle_title = this.next;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.statuses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("statuses=", arrayList, list);
        }
        String str = this.next;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListClaimResolutionStatusesResponse{", "}", 0, null, null, 56);
    }
}
