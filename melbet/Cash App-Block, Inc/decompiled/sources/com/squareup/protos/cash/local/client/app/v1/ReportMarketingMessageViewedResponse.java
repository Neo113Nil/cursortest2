package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.BadgeCounts;
import com.squareup.protos.cash.badging.api.BatchClearBadgeClientResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/local/client/app/v1/ReportMarketingMessageViewedResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/badging/api/BatchClearBadgeClientResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReportMarketingMessageViewedResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReportMarketingMessageViewedResponse> CREATOR;
    public final BadgeCounts badge_counts;
    public final List successfully_viewed_tokens;

    static {
        ReportMarketingMessageViewedResponse$Companion$ADAPTER$1 reportMarketingMessageViewedResponse$Companion$ADAPTER$1 = new ReportMarketingMessageViewedResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReportMarketingMessageViewedResponse.class), "type.googleapis.com/squareup.cash.local.client.app.v1.ReportMarketingMessageViewedResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = reportMarketingMessageViewedResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(reportMarketingMessageViewedResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportMarketingMessageViewedResponse(List list, BadgeCounts badgeCounts, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.badge_counts = badgeCounts;
        this.successfully_viewed_tokens = TransactorKt.immutableCopyOf("successfully_viewed_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReportMarketingMessageViewedResponse)) {
            return false;
        }
        ReportMarketingMessageViewedResponse reportMarketingMessageViewedResponse = (ReportMarketingMessageViewedResponse) obj;
        return Intrinsics.areEqual(unknownFields(), reportMarketingMessageViewedResponse.unknownFields()) && Intrinsics.areEqual(this.successfully_viewed_tokens, reportMarketingMessageViewedResponse.successfully_viewed_tokens) && Intrinsics.areEqual(this.badge_counts, reportMarketingMessageViewedResponse.badge_counts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.successfully_viewed_tokens);
        BadgeCounts badgeCounts = this.badge_counts;
        int hashCode = m + (badgeCounts != null ? badgeCounts.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BatchClearBadgeClientResponse.Builder builder = new BatchClearBadgeClientResponse.Builder(1);
        builder.badges = this.successfully_viewed_tokens;
        builder.badge_count = this.badge_counts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.successfully_viewed_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("successfully_viewed_tokens=", arrayList, list);
        }
        BadgeCounts badgeCounts = this.badge_counts;
        if (badgeCounts != null) {
            arrayList.add("badge_counts=" + badgeCounts);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReportMarketingMessageViewedResponse{", "}", 0, null, null, 56);
    }
}
