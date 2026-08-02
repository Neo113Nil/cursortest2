package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashface/api/GetGenericElementTreeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashregistrar/Account$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetGenericElementTreeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetGenericElementTreeResponse> CREATOR;
    public final AnalyticsData analytics_data;
    public final AnalyticsEvent dismiss_event;
    public final List elements;
    public final String toolbar_title;
    public final AnalyticsEvent view_event;

    static {
        GetGenericElementTreeResponse$Companion$ADAPTER$1 getGenericElementTreeResponse$Companion$ADAPTER$1 = new GetGenericElementTreeResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetGenericElementTreeResponse.class), "type.googleapis.com/squareup.cash.cashface.api.GetGenericElementTreeResponse", Syntax.PROTO_2, null, "squareup/cash/cashface/api/GenericElementTree.proto");
        ADAPTER = getGenericElementTreeResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getGenericElementTreeResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGenericElementTreeResponse(List list, AnalyticsData analyticsData, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.analytics_data = analyticsData;
        this.view_event = analyticsEvent;
        this.dismiss_event = analyticsEvent2;
        this.toolbar_title = str;
        this.elements = TransactorKt.immutableCopyOf("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetGenericElementTreeResponse)) {
            return false;
        }
        GetGenericElementTreeResponse getGenericElementTreeResponse = (GetGenericElementTreeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getGenericElementTreeResponse.unknownFields()) && Intrinsics.areEqual(this.elements, getGenericElementTreeResponse.elements) && Intrinsics.areEqual(this.analytics_data, getGenericElementTreeResponse.analytics_data) && Intrinsics.areEqual(this.view_event, getGenericElementTreeResponse.view_event) && Intrinsics.areEqual(this.dismiss_event, getGenericElementTreeResponse.dismiss_event) && Intrinsics.areEqual(this.toolbar_title, getGenericElementTreeResponse.toolbar_title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.elements);
        AnalyticsData analyticsData = this.analytics_data;
        int hashCode = (m + (analyticsData != null ? analyticsData.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.view_event;
        int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent2 = this.dismiss_event;
        int hashCode3 = (hashCode2 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0)) * 37;
        String str = this.toolbar_title;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(3, false);
        builder.account_token = this.elements;
        builder.display_name = this.analytics_data;
        builder.account_type = this.view_event;
        builder.is_sponsored_account = this.dismiss_event;
        builder.customer_token = this.toolbar_title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.elements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
        }
        AnalyticsData analyticsData = this.analytics_data;
        if (analyticsData != null) {
            arrayList.add("analytics_data=" + analyticsData);
        }
        AnalyticsEvent analyticsEvent = this.view_event;
        if (analyticsEvent != null) {
            arrayList.add("view_event=" + analyticsEvent);
        }
        AnalyticsEvent analyticsEvent2 = this.dismiss_event;
        if (analyticsEvent2 != null) {
            arrayList.add("dismiss_event=" + analyticsEvent2);
        }
        String str = this.toolbar_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "toolbar_title=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetGenericElementTreeResponse{", "}", 0, null, null, 56);
    }
}
