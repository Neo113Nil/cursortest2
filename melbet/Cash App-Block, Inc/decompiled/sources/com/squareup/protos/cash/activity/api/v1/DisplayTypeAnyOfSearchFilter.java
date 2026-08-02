package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeAnyOfSearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeAnyOfSearchFilter$Builder;", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayType;", "display_types", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisplayTypeAnyOfSearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisplayTypeAnyOfSearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityDisplayType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ActivityDisplayType> display_types;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeAnyOfSearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeAnyOfSearchFilter;", "<init>", "()V", "display_types", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<? extends ActivityDisplayType> display_types = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public DisplayTypeAnyOfSearchFilter build() {
            return new DisplayTypeAnyOfSearchFilter(this.display_types, buildUnknownFields());
        }

        public final Builder display_types(List<? extends ActivityDisplayType> display_types) {
            display_types.getClass();
            TransactorKt.checkElementsNotNull(display_types);
            this.display_types = display_types;
            return this;
        }
    }

    static {
        DisplayTypeAnyOfSearchFilter$Companion$ADAPTER$1 displayTypeAnyOfSearchFilter$Companion$ADAPTER$1 = new DisplayTypeAnyOfSearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplayTypeAnyOfSearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.DisplayTypeAnyOfSearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = displayTypeAnyOfSearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(displayTypeAnyOfSearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayTypeAnyOfSearchFilter(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.display_types = TransactorKt.immutableCopyOf("display_types", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisplayTypeAnyOfSearchFilter)) {
            return false;
        }
        DisplayTypeAnyOfSearchFilter displayTypeAnyOfSearchFilter = (DisplayTypeAnyOfSearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), displayTypeAnyOfSearchFilter.unknownFields()) && Intrinsics.areEqual(this.display_types, displayTypeAnyOfSearchFilter.display_types);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.display_types.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.display_types = this.display_types;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.display_types.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("display_types=", arrayList, this.display_types);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayTypeAnyOfSearchFilter{", "}", 0, null, null, 56);
    }
}
