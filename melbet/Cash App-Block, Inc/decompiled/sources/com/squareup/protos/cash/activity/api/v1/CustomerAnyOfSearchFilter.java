package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/CustomerAnyOfSearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerAnyOfSearchFilter$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerSearchFilterType;", "type", "Lcom/squareup/protos/cash/activity/api/v1/CustomerSearchFilterType;", "", "", "tokens", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomerAnyOfSearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomerAnyOfSearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<String> tokens;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.CustomerSearchFilterType#ADAPTER", schemaIndex = 1, tag = 2)
    public final CustomerSearchFilterType type;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/CustomerAnyOfSearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerAnyOfSearchFilter;", "<init>", "()V", "tokens", "", "", "type", "Lcom/squareup/protos/cash/activity/api/v1/CustomerSearchFilterType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<String> tokens = EmptyList.INSTANCE;
        public CustomerSearchFilterType type;

        @Override // com.squareup.wire.Message.Builder
        public CustomerAnyOfSearchFilter build() {
            return new CustomerAnyOfSearchFilter(this.tokens, this.type, buildUnknownFields());
        }

        public final Builder tokens(List<String> tokens) {
            tokens.getClass();
            TransactorKt.checkElementsNotNull(tokens);
            this.tokens = tokens;
            return this;
        }

        public final Builder type(CustomerSearchFilterType type2) {
            this.type = type2;
            return this;
        }
    }

    static {
        CustomerAnyOfSearchFilter$Companion$ADAPTER$1 customerAnyOfSearchFilter$Companion$ADAPTER$1 = new CustomerAnyOfSearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerAnyOfSearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.CustomerAnyOfSearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = customerAnyOfSearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customerAnyOfSearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerAnyOfSearchFilter(List list, CustomerSearchFilterType customerSearchFilterType, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.type = customerSearchFilterType;
        this.tokens = TransactorKt.immutableCopyOf("tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerAnyOfSearchFilter)) {
            return false;
        }
        CustomerAnyOfSearchFilter customerAnyOfSearchFilter = (CustomerAnyOfSearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), customerAnyOfSearchFilter.unknownFields()) && Intrinsics.areEqual(this.tokens, customerAnyOfSearchFilter.tokens) && this.type == customerAnyOfSearchFilter.type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.tokens);
        CustomerSearchFilterType customerSearchFilterType = this.type;
        int hashCode = m + (customerSearchFilterType != null ? customerSearchFilterType.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.tokens = this.tokens;
        builder.type = this.type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.tokens.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tokens=", arrayList, this.tokens);
        }
        CustomerSearchFilterType customerSearchFilterType = this.type;
        if (customerSearchFilterType != null) {
            arrayList.add("type=" + customerSearchFilterType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerAnyOfSearchFilter{", "}", 0, null, null, 56);
    }
}
