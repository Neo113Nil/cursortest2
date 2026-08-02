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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u0012\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchResponse$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchOffset;", "search_offset", "Lcom/squareup/protos/cash/activity/api/v1/SearchOffset;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityCursor;", "cursor", "Lcom/squareup/protos/cash/activity/api/v1/ActivityCursor;", "", "has_more", "Ljava/lang/Boolean;", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow;", "activity_rows", "Ljava/util/List;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult;", "aggregation_results", "Lcom/squareup/protos/cash/activity/api/v1/Chip;", "chips", "getChips$annotations", "()V", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilterGroup;", "applied_filter_groups", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivitySearchResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ActivityRow> activity_rows;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivitySearchAggregationResult#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 6)
    public final List<ActivitySearchAggregationResult> aggregation_results;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivitySearchFilterGroup#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 5)
    public final List<ActivitySearchFilterGroup> applied_filter_groups;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.Chip#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 4)
    public final List<Chip> chips;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityCursor#ADAPTER", schemaIndex = 3, tag = 7)
    public final ActivityCursor cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 3)
    public final Boolean has_more;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchOffset#ADAPTER", schemaIndex = 2, tag = 2)
    public final SearchOffset search_offset;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H\u0007J\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchResponse;", "<init>", "()V", "activity_rows", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow;", "aggregation_results", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult;", "search_offset", "Lcom/squareup/protos/cash/activity/api/v1/SearchOffset;", "cursor", "Lcom/squareup/protos/cash/activity/api/v1/ActivityCursor;", "has_more", "", "Ljava/lang/Boolean;", "chips", "Lcom/squareup/protos/cash/activity/api/v1/Chip;", "applied_filter_groups", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilterGroup;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchResponse$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<ActivityRow> activity_rows;
        public List<ActivitySearchAggregationResult> aggregation_results;
        public List<ActivitySearchFilterGroup> applied_filter_groups;
        public List<Chip> chips;
        public ActivityCursor cursor;
        public Boolean has_more;
        public SearchOffset search_offset;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.activity_rows = emptyList;
            this.aggregation_results = emptyList;
            this.chips = emptyList;
            this.applied_filter_groups = emptyList;
        }

        public final Builder activity_rows(List<ActivityRow> activity_rows) {
            activity_rows.getClass();
            TransactorKt.checkElementsNotNull(activity_rows);
            this.activity_rows = activity_rows;
            return this;
        }

        public final Builder aggregation_results(List<ActivitySearchAggregationResult> aggregation_results) {
            aggregation_results.getClass();
            TransactorKt.checkElementsNotNull(aggregation_results);
            this.aggregation_results = aggregation_results;
            return this;
        }

        public final Builder applied_filter_groups(List<ActivitySearchFilterGroup> applied_filter_groups) {
            applied_filter_groups.getClass();
            TransactorKt.checkElementsNotNull(applied_filter_groups);
            this.applied_filter_groups = applied_filter_groups;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivitySearchResponse build() {
            return new ActivitySearchResponse(this.activity_rows, this.aggregation_results, this.search_offset, this.cursor, this.has_more, this.chips, this.applied_filter_groups, buildUnknownFields());
        }

        @Deprecated
        public final Builder chips(List<Chip> chips) {
            chips.getClass();
            TransactorKt.checkElementsNotNull(chips);
            this.chips = chips;
            return this;
        }

        public final Builder cursor(ActivityCursor cursor) {
            this.cursor = cursor;
            return this;
        }

        public final Builder has_more(Boolean has_more) {
            this.has_more = has_more;
            return this;
        }

        public final Builder search_offset(SearchOffset search_offset) {
            this.search_offset = search_offset;
            return this;
        }
    }

    static {
        ActivitySearchResponse$Companion$ADAPTER$1 activitySearchResponse$Companion$ADAPTER$1 = new ActivitySearchResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySearchResponse.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivitySearchResponse", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = activitySearchResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activitySearchResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySearchResponse(List list, List list2, SearchOffset searchOffset, ActivityCursor activityCursor, Boolean bool, List list3, List list4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.search_offset = searchOffset;
        this.cursor = activityCursor;
        this.has_more = bool;
        this.activity_rows = TransactorKt.immutableCopyOf("activity_rows", list);
        this.aggregation_results = TransactorKt.immutableCopyOf("aggregation_results", list2);
        this.chips = TransactorKt.immutableCopyOf("chips", list3);
        this.applied_filter_groups = TransactorKt.immutableCopyOf("applied_filter_groups", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySearchResponse)) {
            return false;
        }
        ActivitySearchResponse activitySearchResponse = (ActivitySearchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), activitySearchResponse.unknownFields()) && Intrinsics.areEqual(this.activity_rows, activitySearchResponse.activity_rows) && Intrinsics.areEqual(this.aggregation_results, activitySearchResponse.aggregation_results) && Intrinsics.areEqual(this.search_offset, activitySearchResponse.search_offset) && Intrinsics.areEqual(this.cursor, activitySearchResponse.cursor) && Intrinsics.areEqual(this.has_more, activitySearchResponse.has_more) && Intrinsics.areEqual(this.chips, activitySearchResponse.chips) && Intrinsics.areEqual(this.applied_filter_groups, activitySearchResponse.applied_filter_groups);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.activity_rows), 37, this.aggregation_results);
        SearchOffset searchOffset = this.search_offset;
        int hashCode = (m + (searchOffset != null ? searchOffset.hashCode() : 0)) * 37;
        ActivityCursor activityCursor = this.cursor;
        int hashCode2 = (hashCode + (activityCursor != null ? activityCursor.hashCode() : 0)) * 37;
        Boolean bool = this.has_more;
        int hashCode3 = this.applied_filter_groups.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.chips);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.activity_rows = this.activity_rows;
        builder.aggregation_results = this.aggregation_results;
        builder.search_offset = this.search_offset;
        builder.cursor = this.cursor;
        builder.has_more = this.has_more;
        builder.chips = this.chips;
        builder.applied_filter_groups = this.applied_filter_groups;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.activity_rows.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("activity_rows=", arrayList, this.activity_rows);
        }
        if (!this.aggregation_results.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("aggregation_results=", arrayList, this.aggregation_results);
        }
        SearchOffset searchOffset = this.search_offset;
        if (searchOffset != null) {
            arrayList.add("search_offset=" + searchOffset);
        }
        ActivityCursor activityCursor = this.cursor;
        if (activityCursor != null) {
            arrayList.add("cursor=" + activityCursor);
        }
        Boolean bool = this.has_more;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_more=", bool, arrayList);
        }
        if (!this.chips.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("chips=", arrayList, this.chips);
        }
        if (!this.applied_filter_groups.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("applied_filter_groups=", arrayList, this.applied_filter_groups);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySearchResponse{", "}", 0, null, null, 56);
    }
}
