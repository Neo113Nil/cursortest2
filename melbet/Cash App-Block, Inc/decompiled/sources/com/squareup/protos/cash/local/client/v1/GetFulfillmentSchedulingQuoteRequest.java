package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteRequest;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetFulfillmentSchedulingQuoteRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetFulfillmentSchedulingQuoteRequest> CREATOR;
    public final String brand_token;
    public final StorageEvent fulfillment_filter;
    public final List item_tokens;
    public final String location_token;
    public final String scheduling_day_identifier_token;

    /* loaded from: classes7.dex */
    public final class FreeFormFulfillmentFilter extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FreeFormFulfillmentFilter> CREATOR;
        public final LocalAddress delivery_address;
        public final LocalFulfillmentType fulfillment_type;

        static {
            GetFulfillmentSchedulingQuoteRequest$FreeFormFulfillmentFilter$Companion$ADAPTER$1 getFulfillmentSchedulingQuoteRequest$FreeFormFulfillmentFilter$Companion$ADAPTER$1 = new GetFulfillmentSchedulingQuoteRequest$FreeFormFulfillmentFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FreeFormFulfillmentFilter.class), "type.googleapis.com/squareup.cash.local.client.v1.GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getFulfillmentSchedulingQuoteRequest$FreeFormFulfillmentFilter$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getFulfillmentSchedulingQuoteRequest$FreeFormFulfillmentFilter$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FreeFormFulfillmentFilter(LocalFulfillmentType localFulfillmentType, LocalAddress localAddress, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.fulfillment_type = localFulfillmentType;
            this.delivery_address = localAddress;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FreeFormFulfillmentFilter)) {
                return false;
            }
            FreeFormFulfillmentFilter freeFormFulfillmentFilter = (FreeFormFulfillmentFilter) obj;
            return Intrinsics.areEqual(unknownFields(), freeFormFulfillmentFilter.unknownFields()) && this.fulfillment_type == freeFormFulfillmentFilter.fulfillment_type && Intrinsics.areEqual(this.delivery_address, freeFormFulfillmentFilter.delivery_address);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalFulfillmentType localFulfillmentType = this.fulfillment_type;
            int hashCode2 = (hashCode + (localFulfillmentType != null ? localFulfillmentType.hashCode() : 0)) * 37;
            LocalAddress localAddress = this.delivery_address;
            int hashCode3 = hashCode2 + (localAddress != null ? localAddress.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            InputValue.Builder builder = new InputValue.Builder(11);
            builder.input_id = this.fulfillment_type;
            builder.value = this.delivery_address;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalFulfillmentType localFulfillmentType = this.fulfillment_type;
            if (localFulfillmentType != null) {
                arrayList.add("fulfillment_type=" + localFulfillmentType);
            }
            LocalAddress localAddress = this.delivery_address;
            if (localAddress != null) {
                arrayList.add("delivery_address=" + localAddress);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FreeFormFulfillmentFilter{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetFulfillmentSchedulingQuoteRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                StorageEvent storageEvent = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetFulfillmentSchedulingQuoteRequest((String) obj, (String) obj2, (String) obj3, storageEvent, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            storageEvent = new GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment((LocalFulfillment) LocalFulfillment.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            storageEvent = new GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment((GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter) GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetFulfillmentSchedulingQuoteRequest getFulfillmentSchedulingQuoteRequest = (GetFulfillmentSchedulingQuoteRequest) obj;
                reverseProtoWriter.getClass();
                getFulfillmentSchedulingQuoteRequest.getClass();
                reverseProtoWriter.writeBytes(getFulfillmentSchedulingQuoteRequest.unknownFields());
                StorageEvent storageEvent = getFulfillmentSchedulingQuoteRequest.fulfillment_filter;
                if (storageEvent instanceof GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment) {
                    LocalFulfillment.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment) storageEvent).value);
                } else if (storageEvent instanceof GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment) {
                    GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment) storageEvent).value);
                } else if (storageEvent != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 6, getFulfillmentSchedulingQuoteRequest.item_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, getFulfillmentSchedulingQuoteRequest.scheduling_day_identifier_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getFulfillmentSchedulingQuoteRequest.location_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getFulfillmentSchedulingQuoteRequest.brand_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                GetFulfillmentSchedulingQuoteRequest getFulfillmentSchedulingQuoteRequest = (GetFulfillmentSchedulingQuoteRequest) obj;
                getFulfillmentSchedulingQuoteRequest.getClass();
                int size$okio = getFulfillmentSchedulingQuoteRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, getFulfillmentSchedulingQuoteRequest.scheduling_day_identifier_token) + protoAdapter2.encodedSizeWithTag(2, getFulfillmentSchedulingQuoteRequest.location_token) + protoAdapter2.encodedSizeWithTag(1, getFulfillmentSchedulingQuoteRequest.brand_token) + size$okio;
                StorageEvent storageEvent = getFulfillmentSchedulingQuoteRequest.fulfillment_filter;
                if (storageEvent instanceof GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment) {
                    encodedSizeWithTag = LocalFulfillment.ADAPTER.encodedSizeWithTag(4, ((GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment) storageEvent).value);
                } else {
                    if (!(storageEvent instanceof GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment)) {
                        if (storageEvent != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return protoAdapter2.asRepeated().encodedSizeWithTag(6, getFulfillmentSchedulingQuoteRequest.item_tokens) + encodedSizeWithTag2;
                    }
                    encodedSizeWithTag = GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter.ADAPTER.encodedSizeWithTag(5, ((GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment) storageEvent).value);
                }
                encodedSizeWithTag2 += encodedSizeWithTag;
                return protoAdapter2.asRepeated().encodedSizeWithTag(6, getFulfillmentSchedulingQuoteRequest.item_tokens) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetFulfillmentSchedulingQuoteRequest getFulfillmentSchedulingQuoteRequest = (GetFulfillmentSchedulingQuoteRequest) obj;
                getFulfillmentSchedulingQuoteRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getFulfillmentSchedulingQuoteRequest.brand_token;
                String str2 = getFulfillmentSchedulingQuoteRequest.location_token;
                String str3 = getFulfillmentSchedulingQuoteRequest.scheduling_day_identifier_token;
                StorageEvent storageEvent = getFulfillmentSchedulingQuoteRequest.fulfillment_filter;
                List list = getFulfillmentSchedulingQuoteRequest.item_tokens;
                list.getClass();
                byteString.getClass();
                return new GetFulfillmentSchedulingQuoteRequest(str, str2, str3, storageEvent, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetFulfillmentSchedulingQuoteRequest getFulfillmentSchedulingQuoteRequest = (GetFulfillmentSchedulingQuoteRequest) obj;
                getFulfillmentSchedulingQuoteRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getFulfillmentSchedulingQuoteRequest.brand_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getFulfillmentSchedulingQuoteRequest.location_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, getFulfillmentSchedulingQuoteRequest.scheduling_day_identifier_token);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, getFulfillmentSchedulingQuoteRequest.item_tokens);
                StorageEvent storageEvent = getFulfillmentSchedulingQuoteRequest.fulfillment_filter;
                if (storageEvent instanceof GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment) {
                    LocalFulfillment.ADAPTER.encodeWithTag(protoWriter, 4, ((GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment) storageEvent).value);
                } else if (storageEvent instanceof GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment) {
                    GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter.ADAPTER.encodeWithTag(protoWriter, 5, ((GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$FreeFormFulfillment) storageEvent).value);
                } else if (storageEvent != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(getFulfillmentSchedulingQuoteRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFulfillmentSchedulingQuoteRequest(String str, String str2, String str3, StorageEvent storageEvent, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.brand_token = str;
        this.location_token = str2;
        this.scheduling_day_identifier_token = str3;
        this.fulfillment_filter = storageEvent;
        this.item_tokens = TransactorKt.immutableCopyOf("item_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetFulfillmentSchedulingQuoteRequest)) {
            return false;
        }
        GetFulfillmentSchedulingQuoteRequest getFulfillmentSchedulingQuoteRequest = (GetFulfillmentSchedulingQuoteRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getFulfillmentSchedulingQuoteRequest.unknownFields()) && Intrinsics.areEqual(this.brand_token, getFulfillmentSchedulingQuoteRequest.brand_token) && Intrinsics.areEqual(this.location_token, getFulfillmentSchedulingQuoteRequest.location_token) && Intrinsics.areEqual(this.scheduling_day_identifier_token, getFulfillmentSchedulingQuoteRequest.scheduling_day_identifier_token) && Intrinsics.areEqual(this.fulfillment_filter, getFulfillmentSchedulingQuoteRequest.fulfillment_filter) && Intrinsics.areEqual(this.item_tokens, getFulfillmentSchedulingQuoteRequest.item_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.brand_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.location_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.scheduling_day_identifier_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        StorageEvent storageEvent = this.fulfillment_filter;
        int hashCode5 = this.item_tokens.hashCode() + ((hashCode4 + (storageEvent != null ? storageEvent.hashCode() : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder();
        builder.icon = this.brand_token;
        builder.title = this.location_token;
        builder.subtitle = this.scheduling_day_identifier_token;
        builder.action = this.fulfillment_filter;
        builder.icon_background_color = this.item_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.brand_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_token=", arrayList);
        }
        String str2 = this.location_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_token=", arrayList);
        }
        String str3 = this.scheduling_day_identifier_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "scheduling_day_identifier_token=", arrayList);
        }
        StorageEvent storageEvent = this.fulfillment_filter;
        if (storageEvent != null) {
            arrayList.add("fulfillment_filter=" + storageEvent);
        }
        List list = this.item_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("item_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFulfillmentSchedulingQuoteRequest{", "}", 0, null, null, 56);
    }

    public GetFulfillmentSchedulingQuoteRequest(String str, String str2, String str3, GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment getFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment, ArrayList arrayList, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, getFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment, (i & 16) != 0 ? EmptyList.INSTANCE : arrayList, ByteString.EMPTY);
    }
}
