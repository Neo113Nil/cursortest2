package com.squareup.protos.cash.activity.api.v1;

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
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedResponse$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityOffset;", "activity_offset", "Lcom/squareup/protos/cash/activity/api/v1/ActivityOffset;", "", "has_more", "Ljava/lang/Boolean;", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow;", "activity_rows", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityPageThreadedFeedResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityPageThreadedFeedResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityOffset#ADAPTER", schemaIndex = 1, tag = 2)
    public final ActivityOffset activity_offset;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ActivityRow> activity_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean has_more;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedResponse;", "<init>", "()V", "activity_rows", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow;", "activity_offset", "Lcom/squareup/protos/cash/activity/api/v1/ActivityOffset;", "has_more", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedResponse$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ActivityOffset activity_offset;
        public List<ActivityRow> activity_rows = EmptyList.INSTANCE;
        public Boolean has_more;

        public final Builder activity_offset(ActivityOffset activity_offset) {
            this.activity_offset = activity_offset;
            return this;
        }

        public final Builder activity_rows(List<ActivityRow> activity_rows) {
            activity_rows.getClass();
            TransactorKt.checkElementsNotNull(activity_rows);
            this.activity_rows = activity_rows;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivityPageThreadedFeedResponse build() {
            return new ActivityPageThreadedFeedResponse(this.activity_rows, this.activity_offset, this.has_more, buildUnknownFields());
        }

        public final Builder has_more(Boolean has_more) {
            this.has_more = has_more;
            return this;
        }
    }

    static {
        ActivityPageThreadedFeedResponse$Companion$ADAPTER$1 activityPageThreadedFeedResponse$Companion$ADAPTER$1 = new ActivityPageThreadedFeedResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityPageThreadedFeedResponse.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivityPageThreadedFeedResponse", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/service.proto");
        ADAPTER = activityPageThreadedFeedResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityPageThreadedFeedResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityPageThreadedFeedResponse(List list, ActivityOffset activityOffset, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.activity_offset = activityOffset;
        this.has_more = bool;
        this.activity_rows = TransactorKt.immutableCopyOf("activity_rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityPageThreadedFeedResponse)) {
            return false;
        }
        ActivityPageThreadedFeedResponse activityPageThreadedFeedResponse = (ActivityPageThreadedFeedResponse) obj;
        return Intrinsics.areEqual(unknownFields(), activityPageThreadedFeedResponse.unknownFields()) && Intrinsics.areEqual(this.activity_rows, activityPageThreadedFeedResponse.activity_rows) && Intrinsics.areEqual(this.activity_offset, activityPageThreadedFeedResponse.activity_offset) && Intrinsics.areEqual(this.has_more, activityPageThreadedFeedResponse.has_more);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.activity_rows);
        ActivityOffset activityOffset = this.activity_offset;
        int hashCode = (m + (activityOffset != null ? activityOffset.hashCode() : 0)) * 37;
        Boolean bool = this.has_more;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.activity_rows = this.activity_rows;
        builder.activity_offset = this.activity_offset;
        builder.has_more = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.activity_rows.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("activity_rows=", arrayList, this.activity_rows);
        }
        ActivityOffset activityOffset = this.activity_offset;
        if (activityOffset != null) {
            arrayList.add("activity_offset=" + activityOffset);
        }
        Boolean bool = this.has_more;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_more=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityPageThreadedFeedResponse{", "}", 0, null, null, 56);
    }
}
