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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayCategorySearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayCategorySearchFilter$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayCategory;", "display_category", "Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayCategory;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisplayCategorySearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisplayCategorySearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityDisplayCategory#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActivityDisplayCategory display_category;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayCategorySearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayCategorySearchFilter;", "<init>", "()V", "display_category", "Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayCategory;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ActivityDisplayCategory display_category;

        @Override // com.squareup.wire.Message.Builder
        public DisplayCategorySearchFilter build() {
            return new DisplayCategorySearchFilter(this.display_category, buildUnknownFields());
        }

        public final Builder display_category(ActivityDisplayCategory display_category) {
            this.display_category = display_category;
            return this;
        }
    }

    static {
        DisplayCategorySearchFilter$Companion$ADAPTER$1 displayCategorySearchFilter$Companion$ADAPTER$1 = new DisplayCategorySearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplayCategorySearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.DisplayCategorySearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = displayCategorySearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(displayCategorySearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayCategorySearchFilter(ActivityDisplayCategory activityDisplayCategory, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_category = activityDisplayCategory;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisplayCategorySearchFilter)) {
            return false;
        }
        DisplayCategorySearchFilter displayCategorySearchFilter = (DisplayCategorySearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), displayCategorySearchFilter.unknownFields()) && this.display_category == displayCategorySearchFilter.display_category;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityDisplayCategory activityDisplayCategory = this.display_category;
        int hashCode2 = hashCode + (activityDisplayCategory != null ? activityDisplayCategory.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.display_category = this.display_category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityDisplayCategory activityDisplayCategory = this.display_category;
        if (activityDisplayCategory != null) {
            arrayList.add("display_category=" + activityDisplayCategory);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayCategorySearchFilter{", "}", 0, null, null, 56);
    }
}
