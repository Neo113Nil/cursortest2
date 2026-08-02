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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%$R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u0012\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u0012\u0004\b \u0010\u0017R \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u0012\u0004\b#\u0010\u0017¨\u0006&"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchRequest$Builder;", "", "free_text_search", "Ljava/lang/String;", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort;", "sort", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort;", "Lcom/squareup/protos/cash/activity/api/v1/SearchOffset;", "search_offset", "Lcom/squareup/protos/cash/activity/api/v1/SearchOffset;", "", "page_size", "Ljava/lang/Integer;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "activity_token", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "query_token", "", "allow_overlap", "Ljava/lang/Boolean;", "getAllow_overlap$annotations", "()V", "sum_amount", "getSum_amount$annotations", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilterGroup;", "filter_groups", "Ljava/util/List;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter;", "filters", "getFilters$annotations", "Lcom/squareup/protos/cash/activity/api/v1/Chip;", "ignore_chips", "getIgnore_chips$annotations", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivitySearchRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityToken#ADAPTER", schemaIndex = 5, tag = 5)
    public final ActivityToken activity_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 7)
    public final Boolean allow_overlap;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivitySearchFilterGroup#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 8)
    public final List<ActivitySearchFilterGroup> filter_groups;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilter#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 2)
    public final List<SearchFilter> filters;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String free_text_search;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.Chip#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 9)
    public final List<Chip> ignore_chips;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 4)
    public final Integer page_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 11)
    public final String query_token;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchOffset#ADAPTER", schemaIndex = 3, tag = 3)
    public final SearchOffset search_offset;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchSort#ADAPTER", schemaIndex = 2, tag = 6)
    public final SearchSort sort;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 10, tag = 10)
    public final Boolean sum_amount;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0014\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u0019\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\bH\u0007J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchRequest;", "<init>", "()V", "free_text_search", "", "filter_groups", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilterGroup;", "sort", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort;", "search_offset", "Lcom/squareup/protos/cash/activity/api/v1/SearchOffset;", "page_size", "", "Ljava/lang/Integer;", "activity_token", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "query_token", "filters", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter;", "allow_overlap", "", "Ljava/lang/Boolean;", "ignore_chips", "Lcom/squareup/protos/cash/activity/api/v1/Chip;", "sum_amount", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchRequest$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ActivityToken activity_token;
        public Boolean allow_overlap;
        public List<ActivitySearchFilterGroup> filter_groups;
        public List<SearchFilter> filters;
        public String free_text_search;
        public List<Chip> ignore_chips;
        public Integer page_size;
        public String query_token;
        public SearchOffset search_offset;
        public SearchSort sort;
        public Boolean sum_amount;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.filter_groups = emptyList;
            this.filters = emptyList;
            this.ignore_chips = emptyList;
        }

        public final Builder activity_token(ActivityToken activity_token) {
            this.activity_token = activity_token;
            return this;
        }

        @Deprecated
        public final Builder allow_overlap(Boolean allow_overlap) {
            this.allow_overlap = allow_overlap;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivitySearchRequest build() {
            return new ActivitySearchRequest(this.free_text_search, this.filter_groups, this.sort, this.search_offset, this.page_size, this.activity_token, this.query_token, this.filters, this.allow_overlap, this.ignore_chips, this.sum_amount, buildUnknownFields());
        }

        public final Builder filter_groups(List<ActivitySearchFilterGroup> filter_groups) {
            filter_groups.getClass();
            TransactorKt.checkElementsNotNull(filter_groups);
            this.filter_groups = filter_groups;
            return this;
        }

        @Deprecated
        public final Builder filters(List<SearchFilter> filters) {
            filters.getClass();
            TransactorKt.checkElementsNotNull(filters);
            this.filters = filters;
            return this;
        }

        public final Builder free_text_search(String free_text_search) {
            this.free_text_search = free_text_search;
            return this;
        }

        @Deprecated
        public final Builder ignore_chips(List<Chip> ignore_chips) {
            ignore_chips.getClass();
            TransactorKt.checkElementsNotNull(ignore_chips);
            this.ignore_chips = ignore_chips;
            return this;
        }

        public final Builder page_size(Integer page_size) {
            this.page_size = page_size;
            return this;
        }

        public final Builder query_token(String query_token) {
            this.query_token = query_token;
            return this;
        }

        public final Builder search_offset(SearchOffset search_offset) {
            this.search_offset = search_offset;
            return this;
        }

        public final Builder sort(SearchSort sort) {
            this.sort = sort;
            return this;
        }

        @Deprecated
        public final Builder sum_amount(Boolean sum_amount) {
            this.sum_amount = sum_amount;
            return this;
        }
    }

    static {
        ActivitySearchRequest$Companion$ADAPTER$1 activitySearchRequest$Companion$ADAPTER$1 = new ActivitySearchRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySearchRequest.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivitySearchRequest", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = activitySearchRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activitySearchRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySearchRequest(String str, List list, SearchSort searchSort, SearchOffset searchOffset, Integer num, ActivityToken activityToken, String str2, List list2, Boolean bool, List list3, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.free_text_search = str;
        this.sort = searchSort;
        this.search_offset = searchOffset;
        this.page_size = num;
        this.activity_token = activityToken;
        this.query_token = str2;
        this.allow_overlap = bool;
        this.sum_amount = bool2;
        this.filter_groups = TransactorKt.immutableCopyOf("filter_groups", list);
        this.filters = TransactorKt.immutableCopyOf("filters", list2);
        this.ignore_chips = TransactorKt.immutableCopyOf("ignore_chips", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySearchRequest)) {
            return false;
        }
        ActivitySearchRequest activitySearchRequest = (ActivitySearchRequest) obj;
        return Intrinsics.areEqual(unknownFields(), activitySearchRequest.unknownFields()) && Intrinsics.areEqual(this.free_text_search, activitySearchRequest.free_text_search) && Intrinsics.areEqual(this.filter_groups, activitySearchRequest.filter_groups) && Intrinsics.areEqual(this.sort, activitySearchRequest.sort) && Intrinsics.areEqual(this.search_offset, activitySearchRequest.search_offset) && Intrinsics.areEqual(this.page_size, activitySearchRequest.page_size) && Intrinsics.areEqual(this.activity_token, activitySearchRequest.activity_token) && Intrinsics.areEqual(this.query_token, activitySearchRequest.query_token) && Intrinsics.areEqual(this.filters, activitySearchRequest.filters) && Intrinsics.areEqual(this.allow_overlap, activitySearchRequest.allow_overlap) && Intrinsics.areEqual(this.ignore_chips, activitySearchRequest.ignore_chips) && Intrinsics.areEqual(this.sum_amount, activitySearchRequest.sum_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.free_text_search;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.filter_groups);
        SearchSort searchSort = this.sort;
        int hashCode2 = (m + (searchSort != null ? searchSort.hashCode() : 0)) * 37;
        SearchOffset searchOffset = this.search_offset;
        int hashCode3 = (hashCode2 + (searchOffset != null ? searchOffset.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        ActivityToken activityToken = this.activity_token;
        int hashCode5 = (hashCode4 + (activityToken != null ? activityToken.hashCode() : 0)) * 37;
        String str2 = this.query_token;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.filters);
        Boolean bool = this.allow_overlap;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((m2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.ignore_chips);
        Boolean bool2 = this.sum_amount;
        int hashCode6 = m3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.free_text_search = this.free_text_search;
        builder.filter_groups = this.filter_groups;
        builder.sort = this.sort;
        builder.search_offset = this.search_offset;
        builder.page_size = this.page_size;
        builder.activity_token = this.activity_token;
        builder.query_token = this.query_token;
        builder.filters = this.filters;
        builder.allow_overlap = this.allow_overlap;
        builder.ignore_chips = this.ignore_chips;
        builder.sum_amount = this.sum_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.free_text_search != null) {
            arrayList.add("free_text_search=██");
        }
        if (!this.filter_groups.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("filter_groups=", arrayList, this.filter_groups);
        }
        SearchSort searchSort = this.sort;
        if (searchSort != null) {
            arrayList.add("sort=" + searchSort);
        }
        SearchOffset searchOffset = this.search_offset;
        if (searchOffset != null) {
            arrayList.add("search_offset=" + searchOffset);
        }
        Integer num = this.page_size;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("page_size=", num, arrayList);
        }
        ActivityToken activityToken = this.activity_token;
        if (activityToken != null) {
            arrayList.add("activity_token=" + activityToken);
        }
        String str = this.query_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "query_token=", arrayList);
        }
        if (!this.filters.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("filters=", arrayList, this.filters);
        }
        Boolean bool = this.allow_overlap;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_overlap=", bool, arrayList);
        }
        if (!this.ignore_chips.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("ignore_chips=", arrayList, this.ignore_chips);
        }
        Boolean bool2 = this.sum_amount;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sum_amount=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySearchRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActivitySearchRequest(String str, List list, SearchSort searchSort, SearchOffset searchOffset, Integer num, ActivityToken activityToken, String str2, int i) {
        this(r3, list, r5, searchOffset, num, activityToken, r9, r10, null, r10, null, ByteString.EMPTY);
        String str3 = (i & 1) != 0 ? null : str;
        SearchSort searchSort2 = (i & 4) != 0 ? null : searchSort;
        String str4 = (i & 64) != 0 ? null : str2;
        EmptyList emptyList = EmptyList.INSTANCE;
    }
}
