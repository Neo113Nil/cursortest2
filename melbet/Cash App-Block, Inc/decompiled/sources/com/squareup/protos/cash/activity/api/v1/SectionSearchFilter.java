package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SectionSearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/SectionSearchFilter$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection;", "section", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterEquals;", "equals", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterEquals;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SectionSearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SectionSearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterEquals#ADAPTER", schemaIndex = 1, tag = 2)
    public final SearchFilterEquals equals;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityRowSection#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActivityRowSection section;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SectionSearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SectionSearchFilter;", "<init>", "()V", "section", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection;", "equals", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterEquals;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public SearchFilterEquals equals;
        public ActivityRowSection section;

        @Override // com.squareup.wire.Message.Builder
        public SectionSearchFilter build() {
            return new SectionSearchFilter(this.section, this.equals, buildUnknownFields());
        }

        public final Builder equals(SearchFilterEquals equals) {
            this.equals = equals;
            return this;
        }

        public final Builder section(ActivityRowSection section) {
            this.section = section;
            return this;
        }
    }

    static {
        SectionSearchFilter$Companion$ADAPTER$1 sectionSearchFilter$Companion$ADAPTER$1 = new SectionSearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SectionSearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.SectionSearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = sectionSearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sectionSearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionSearchFilter(ActivityRowSection activityRowSection, SearchFilterEquals searchFilterEquals, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.section = activityRowSection;
        this.equals = searchFilterEquals;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionSearchFilter)) {
            return false;
        }
        SectionSearchFilter sectionSearchFilter = (SectionSearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), sectionSearchFilter.unknownFields()) && this.section == sectionSearchFilter.section && this.equals == sectionSearchFilter.equals;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityRowSection activityRowSection = this.section;
        int hashCode2 = (hashCode + (activityRowSection != null ? activityRowSection.hashCode() : 0)) * 37;
        SearchFilterEquals searchFilterEquals = this.equals;
        int hashCode3 = hashCode2 + (searchFilterEquals != null ? searchFilterEquals.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.section = this.section;
        builder.equals = this.equals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityRowSection activityRowSection = this.section;
        if (activityRowSection != null) {
            arrayList.add("section=" + activityRowSection);
        }
        SearchFilterEquals searchFilterEquals = this.equals;
        if (searchFilterEquals != null) {
            arrayList.add("equals=" + searchFilterEquals);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SectionSearchFilter{", "}", 0, null, null, 56);
    }
}
