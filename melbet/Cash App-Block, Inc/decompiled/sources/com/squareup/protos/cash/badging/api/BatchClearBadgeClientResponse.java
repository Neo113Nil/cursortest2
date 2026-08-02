package com.squareup.protos.cash.badging.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/badging/api/BatchClearBadgeClientResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/badging/api/BatchClearBadgeClientResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BatchClearBadgeClientResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BatchClearBadgeClientResponse> CREATOR;
    public final BadgeCounts badge_count;
    public final List badges;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public BadgeCounts badge_count;
        public List badges;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new BatchClearBadgeClientResponse(this.badges, this.badge_count, buildUnknownFields());
                default:
                    return new ReportMarketingMessageViewedResponse(this.badges, this.badge_count, buildUnknownFields());
            }
        }
    }

    static {
        BatchClearBadgeClientResponse$Companion$ADAPTER$1 batchClearBadgeClientResponse$Companion$ADAPTER$1 = new BatchClearBadgeClientResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BatchClearBadgeClientResponse.class), "type.googleapis.com/squareup.cash.badging.api.BatchClearBadgeClientResponse", Syntax.PROTO_2, null, "squareup/cash/badging/api/service.proto");
        ADAPTER = batchClearBadgeClientResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(batchClearBadgeClientResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchClearBadgeClientResponse(List list, BadgeCounts badgeCounts, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.badge_count = badgeCounts;
        this.badges = TransactorKt.immutableCopyOf("badges", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchClearBadgeClientResponse)) {
            return false;
        }
        BatchClearBadgeClientResponse batchClearBadgeClientResponse = (BatchClearBadgeClientResponse) obj;
        return Intrinsics.areEqual(unknownFields(), batchClearBadgeClientResponse.unknownFields()) && Intrinsics.areEqual(this.badges, batchClearBadgeClientResponse.badges) && Intrinsics.areEqual(this.badge_count, batchClearBadgeClientResponse.badge_count);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.badges);
        BadgeCounts badgeCounts = this.badge_count;
        int hashCode = m + (badgeCounts != null ? badgeCounts.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.badges = this.badges;
        builder.badge_count = this.badge_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.badges;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("badges=", arrayList, list);
        }
        BadgeCounts badgeCounts = this.badge_count;
        if (badgeCounts != null) {
            arrayList.add("badge_count=" + badgeCounts);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchClearBadgeClientResponse{", "}", 0, null, null, 56);
    }
}
