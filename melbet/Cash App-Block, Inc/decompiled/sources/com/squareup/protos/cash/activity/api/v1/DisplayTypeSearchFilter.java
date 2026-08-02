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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeSearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeSearchFilter$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayType;", "display_type", "Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayType;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisplayTypeSearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisplayTypeSearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityDisplayType#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActivityDisplayType display_type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeSearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeSearchFilter;", "<init>", "()V", "display_type", "Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ActivityDisplayType display_type;

        @Override // com.squareup.wire.Message.Builder
        public DisplayTypeSearchFilter build() {
            return new DisplayTypeSearchFilter(this.display_type, buildUnknownFields());
        }

        public final Builder display_type(ActivityDisplayType display_type) {
            this.display_type = display_type;
            return this;
        }
    }

    static {
        DisplayTypeSearchFilter$Companion$ADAPTER$1 displayTypeSearchFilter$Companion$ADAPTER$1 = new DisplayTypeSearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplayTypeSearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.DisplayTypeSearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = displayTypeSearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(displayTypeSearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayTypeSearchFilter(ActivityDisplayType activityDisplayType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_type = activityDisplayType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisplayTypeSearchFilter)) {
            return false;
        }
        DisplayTypeSearchFilter displayTypeSearchFilter = (DisplayTypeSearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), displayTypeSearchFilter.unknownFields()) && this.display_type == displayTypeSearchFilter.display_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityDisplayType activityDisplayType = this.display_type;
        int hashCode2 = hashCode + (activityDisplayType != null ? activityDisplayType.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.display_type = this.display_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityDisplayType activityDisplayType = this.display_type;
        if (activityDisplayType != null) {
            arrayList.add("display_type=" + activityDisplayType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayTypeSearchFilter{", "}", 0, null, null, 56);
    }
}
