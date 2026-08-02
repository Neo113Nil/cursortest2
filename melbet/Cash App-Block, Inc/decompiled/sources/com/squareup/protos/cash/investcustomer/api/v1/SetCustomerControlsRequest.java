package com.squareup.protos.cash.investcustomer.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SetCustomerControlsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCustomerControlsRequest> CREATOR;
    public final String customer_token;
    public final CustomerLimit trading_buy_limit;
    public final Boolean trading_enabled;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetCustomerControlsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.investcustomer.api.v1.SetCustomerControlsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetCustomerControlsRequest((String) obj, (Boolean) obj2, (CustomerLimit) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(CustomerLimit.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetCustomerControlsRequest setCustomerControlsRequest = (SetCustomerControlsRequest) obj;
                reverseProtoWriter.getClass();
                setCustomerControlsRequest.getClass();
                reverseProtoWriter.writeBytes(setCustomerControlsRequest.unknownFields());
                CustomerLimit.ADAPTER.encodeWithTag(reverseProtoWriter, 4, setCustomerControlsRequest.trading_buy_limit);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, setCustomerControlsRequest.trading_enabled);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, setCustomerControlsRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetCustomerControlsRequest setCustomerControlsRequest = (SetCustomerControlsRequest) obj;
                setCustomerControlsRequest.getClass();
                return CustomerLimit.ADAPTER.encodedSizeWithTag(4, setCustomerControlsRequest.trading_buy_limit) + ProtoAdapter.BOOL.encodedSizeWithTag(2, setCustomerControlsRequest.trading_enabled) + ProtoAdapter.STRING.encodedSizeWithTag(1, setCustomerControlsRequest.customer_token) + setCustomerControlsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetCustomerControlsRequest setCustomerControlsRequest = (SetCustomerControlsRequest) obj;
                setCustomerControlsRequest.getClass();
                CustomerLimit customerLimit = setCustomerControlsRequest.trading_buy_limit;
                CustomerLimit customerLimit2 = customerLimit != null ? (CustomerLimit) CustomerLimit.ADAPTER.redact(customerLimit) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = setCustomerControlsRequest.customer_token;
                Boolean bool = setCustomerControlsRequest.trading_enabled;
                byteString.getClass();
                return new SetCustomerControlsRequest(str, bool, customerLimit2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetCustomerControlsRequest setCustomerControlsRequest = (SetCustomerControlsRequest) obj;
                setCustomerControlsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setCustomerControlsRequest.customer_token);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setCustomerControlsRequest.trading_enabled);
                CustomerLimit.ADAPTER.encodeWithTag(protoWriter, 4, setCustomerControlsRequest.trading_buy_limit);
                protoWriter.writeBytes(setCustomerControlsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCustomerControlsRequest(String str, Boolean bool, CustomerLimit customerLimit, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.trading_enabled = bool;
        this.trading_buy_limit = customerLimit;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCustomerControlsRequest)) {
            return false;
        }
        SetCustomerControlsRequest setCustomerControlsRequest = (SetCustomerControlsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setCustomerControlsRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, setCustomerControlsRequest.customer_token) && Intrinsics.areEqual(this.trading_enabled, setCustomerControlsRequest.trading_enabled) && Intrinsics.areEqual(this.trading_buy_limit, setCustomerControlsRequest.trading_buy_limit);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.trading_enabled;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        CustomerLimit customerLimit = this.trading_buy_limit;
        int hashCode4 = hashCode3 + (customerLimit != null ? customerLimit.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(6);
        builder.name = this.customer_token;
        builder.group_image = this.trading_enabled;
        builder.participants = this.trading_buy_limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        Boolean bool = this.trading_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("trading_enabled=", bool, arrayList);
        }
        CustomerLimit customerLimit = this.trading_buy_limit;
        if (customerLimit != null) {
            arrayList.add("trading_buy_limit=" + customerLimit);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCustomerControlsRequest{", "}", 0, null, null, 56);
    }
}
