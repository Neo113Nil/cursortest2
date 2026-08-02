package com.squareup.protos.cash.discover.api.app.v1.message;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/discover/api/app/v1/message/GetDiscoverContentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/discover/api/app/v1/model/Text$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetDiscoverContentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDiscoverContentResponse> CREATOR;
    public final List empty_search_sections;
    public final List preload_request_contexts;
    public final String screen_title;
    public final List sections;
    public final Integer ttl_in_sec;

    static {
        GetDiscoverContentResponse$Companion$ADAPTER$1 getDiscoverContentResponse$Companion$ADAPTER$1 = new GetDiscoverContentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetDiscoverContentResponse.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.message.GetDiscoverContentResponse", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/message/get_discover_content.proto");
        ADAPTER = getDiscoverContentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getDiscoverContentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDiscoverContentResponse(List list, Integer num, String str, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.ttl_in_sec = num;
        this.screen_title = str;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
        this.preload_request_contexts = TransactorKt.immutableCopyOf("preload_request_contexts", list2);
        this.empty_search_sections = TransactorKt.immutableCopyOf("empty_search_sections", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDiscoverContentResponse)) {
            return false;
        }
        GetDiscoverContentResponse getDiscoverContentResponse = (GetDiscoverContentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getDiscoverContentResponse.unknownFields()) && Intrinsics.areEqual(this.sections, getDiscoverContentResponse.sections) && Intrinsics.areEqual(this.ttl_in_sec, getDiscoverContentResponse.ttl_in_sec) && Intrinsics.areEqual(this.screen_title, getDiscoverContentResponse.screen_title) && Intrinsics.areEqual(this.preload_request_contexts, getDiscoverContentResponse.preload_request_contexts) && Intrinsics.areEqual(this.empty_search_sections, getDiscoverContentResponse.empty_search_sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.sections);
        Integer num = this.ttl_in_sec;
        int hashCode = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str = this.screen_title;
        int hashCode2 = this.empty_search_sections.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.preload_request_contexts);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(1);
        builder.text_style = this.sections;
        builder.text_decoration = this.ttl_in_sec;
        builder.text = this.screen_title;
        builder.text_color = this.preload_request_contexts;
        builder.icon = this.empty_search_sections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        Integer num = this.ttl_in_sec;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("ttl_in_sec=", num, arrayList);
        }
        String str = this.screen_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "screen_title=", arrayList);
        }
        List list2 = this.preload_request_contexts;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("preload_request_contexts=", arrayList, list2);
        }
        List list3 = this.empty_search_sections;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("empty_search_sections=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDiscoverContentResponse{", "}", 0, null, null, 56);
    }
}
