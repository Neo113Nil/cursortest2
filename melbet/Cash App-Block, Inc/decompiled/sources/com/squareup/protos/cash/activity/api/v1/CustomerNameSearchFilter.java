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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/CustomerNameSearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerNameSearchFilter$Builder;", "", "name", "Ljava/lang/String;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerSearchFilterType;", "type", "Lcom/squareup/protos/cash/activity/api/v1/CustomerSearchFilterType;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomerNameSearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomerNameSearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.CustomerSearchFilterType#ADAPTER", schemaIndex = 1, tag = 2)
    public final CustomerSearchFilterType type;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/CustomerNameSearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerNameSearchFilter;", "<init>", "()V", "name", "", "type", "Lcom/squareup/protos/cash/activity/api/v1/CustomerSearchFilterType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String name;
        public CustomerSearchFilterType type;

        @Override // com.squareup.wire.Message.Builder
        public CustomerNameSearchFilter build() {
            return new CustomerNameSearchFilter(this.name, this.type, buildUnknownFields());
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder type(CustomerSearchFilterType type2) {
            this.type = type2;
            return this;
        }
    }

    static {
        CustomerNameSearchFilter$Companion$ADAPTER$1 customerNameSearchFilter$Companion$ADAPTER$1 = new CustomerNameSearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerNameSearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.CustomerNameSearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = customerNameSearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customerNameSearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerNameSearchFilter(String str, CustomerSearchFilterType customerSearchFilterType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.type = customerSearchFilterType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerNameSearchFilter)) {
            return false;
        }
        CustomerNameSearchFilter customerNameSearchFilter = (CustomerNameSearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), customerNameSearchFilter.unknownFields()) && Intrinsics.areEqual(this.name, customerNameSearchFilter.name) && this.type == customerNameSearchFilter.type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CustomerSearchFilterType customerSearchFilterType = this.type;
        int hashCode3 = hashCode2 + (customerSearchFilterType != null ? customerSearchFilterType.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.type = this.type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.name != null) {
            arrayList.add("name=██");
        }
        CustomerSearchFilterType customerSearchFilterType = this.type;
        if (customerSearchFilterType != null) {
            arrayList.add("type=" + customerSearchFilterType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerNameSearchFilter{", "}", 0, null, null, 56);
    }
}
