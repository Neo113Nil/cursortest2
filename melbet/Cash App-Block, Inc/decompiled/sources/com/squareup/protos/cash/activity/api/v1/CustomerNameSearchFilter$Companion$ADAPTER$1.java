package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/CustomerNameSearchFilter$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerNameSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomerNameSearchFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerNameSearchFilter((String) obj, (CustomerSearchFilterType) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = CustomerSearchFilterType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerNameSearchFilter customerNameSearchFilter = (CustomerNameSearchFilter) obj;
        reverseProtoWriter.getClass();
        customerNameSearchFilter.getClass();
        reverseProtoWriter.writeBytes(customerNameSearchFilter.unknownFields());
        CustomerSearchFilterType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, customerNameSearchFilter.type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, customerNameSearchFilter.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerNameSearchFilter customerNameSearchFilter = (CustomerNameSearchFilter) obj;
        customerNameSearchFilter.getClass();
        return CustomerSearchFilterType.ADAPTER.encodedSizeWithTag(2, customerNameSearchFilter.type) + ProtoAdapter.STRING.encodedSizeWithTag(1, customerNameSearchFilter.name) + customerNameSearchFilter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerNameSearchFilter customerNameSearchFilter = (CustomerNameSearchFilter) obj;
        customerNameSearchFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        CustomerSearchFilterType customerSearchFilterType = customerNameSearchFilter.type;
        byteString.getClass();
        return new CustomerNameSearchFilter(null, customerSearchFilterType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerNameSearchFilter customerNameSearchFilter = (CustomerNameSearchFilter) obj;
        customerNameSearchFilter.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customerNameSearchFilter.name);
        CustomerSearchFilterType.ADAPTER.encodeWithTag(protoWriter, 2, customerNameSearchFilter.type);
        protoWriter.writeBytes(customerNameSearchFilter.unknownFields());
    }
}
