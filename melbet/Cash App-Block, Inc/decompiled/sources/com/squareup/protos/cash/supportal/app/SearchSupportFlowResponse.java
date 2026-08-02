package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppMesssages;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Deprecated
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/supportal/app/SearchSupportFlowResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiAppMesssages$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SearchSupportFlowResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchSupportFlowResponse> CREATOR;
    public final List matched_nodes;
    public final Boolean treat_unknown_nodes_as_stubs;

    static {
        SearchSupportFlowResponse$Companion$ADAPTER$1 searchSupportFlowResponse$Companion$ADAPTER$1 = new SearchSupportFlowResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchSupportFlowResponse.class), "type.googleapis.com/squareup.cash.supportal.app.SearchSupportFlowResponse", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = searchSupportFlowResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchSupportFlowResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSupportFlowResponse(Boolean bool, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.treat_unknown_nodes_as_stubs = bool;
        this.matched_nodes = TransactorKt.immutableCopyOf("matched_nodes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchSupportFlowResponse)) {
            return false;
        }
        SearchSupportFlowResponse searchSupportFlowResponse = (SearchSupportFlowResponse) obj;
        return Intrinsics.areEqual(unknownFields(), searchSupportFlowResponse.unknownFields()) && Intrinsics.areEqual(this.matched_nodes, searchSupportFlowResponse.matched_nodes) && Intrinsics.areEqual(this.treat_unknown_nodes_as_stubs, searchSupportFlowResponse.treat_unknown_nodes_as_stubs);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.matched_nodes);
        Boolean bool = this.treat_unknown_nodes_as_stubs;
        int hashCode = m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppMesssages.Builder builder = new UiAppMesssages.Builder(4, false);
        builder.app_message_tokens = this.matched_nodes;
        builder.app_message_notifications_enabled = this.treat_unknown_nodes_as_stubs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.matched_nodes;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("matched_nodes=", arrayList, list);
        }
        Boolean bool = this.treat_unknown_nodes_as_stubs;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("treat_unknown_nodes_as_stubs=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchSupportFlowResponse{", "}", 0, null, null, 56);
    }
}
