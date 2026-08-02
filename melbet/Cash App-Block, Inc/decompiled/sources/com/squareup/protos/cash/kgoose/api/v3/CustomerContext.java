package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CustomerContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CustomerContext$Builder;", "", "", "Lcom/squareup/protos/cash/kgoose/api/v3/CustomerData;", "data_attributes", "Ljava/util/Map;", "headers_attributes", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomerContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomerContext> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CustomerData#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final Map<String, CustomerData> data_attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final Map<String, String> headers_attributes;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u001a\u0010\t\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016R\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CustomerContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CustomerContext;", "<init>", "()V", "data_attributes", "", "", "Lcom/squareup/protos/cash/kgoose/api/v3/CustomerData;", "headers_attributes", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Map<String, CustomerData> data_attributes;
        public Map<String, String> headers_attributes;

        public Builder() {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.data_attributes = emptyMap;
            emptyMap.getClass();
            this.headers_attributes = emptyMap;
        }

        @Override // com.squareup.wire.Message.Builder
        public CustomerContext build() {
            return new CustomerContext(this.data_attributes, this.headers_attributes, buildUnknownFields());
        }

        public final Builder data_attributes(Map<String, CustomerData> data_attributes) {
            data_attributes.getClass();
            this.data_attributes = data_attributes;
            return this;
        }

        public final Builder headers_attributes(Map<String, String> headers_attributes) {
            headers_attributes.getClass();
            this.headers_attributes = headers_attributes;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CustomerContext.class);
        Syntax syntax = Syntax.PROTO_2;
        CustomerContext$Companion$ADAPTER$1 customerContext$Companion$ADAPTER$1 = new CustomerContext$Companion$ADAPTER$1(orCreateKotlinClass);
        ADAPTER = customerContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customerContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerContext(Map map, Map map2, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        map2.getClass();
        byteString.getClass();
        this.data_attributes = TransactorKt.immutableCopyOf("data_attributes", map);
        this.headers_attributes = TransactorKt.immutableCopyOf("headers_attributes", map2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerContext)) {
            return false;
        }
        CustomerContext customerContext = (CustomerContext) obj;
        return Intrinsics.areEqual(unknownFields(), customerContext.unknownFields()) && Intrinsics.areEqual(this.data_attributes, customerContext.data_attributes) && Intrinsics.areEqual(this.headers_attributes, customerContext.headers_attributes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.headers_attributes.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(unknownFields().hashCode() * 37, this.data_attributes, 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.data_attributes = this.data_attributes;
        builder.headers_attributes = this.headers_attributes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.data_attributes.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("data_attributes=", this.data_attributes, arrayList);
        }
        if (!this.headers_attributes.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("headers_attributes=", this.headers_attributes, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerContext{", "}", 0, null, null, 56);
    }
}
