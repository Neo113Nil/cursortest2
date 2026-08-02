package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.CustomerData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomerData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerData((CustomerData.State) obj, (Region) obj2, (CustomerData.IDVStatus) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Long) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = CustomerData.State.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    try {
                        obj2 = Region.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(CustomerData.IDVStatus.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerData customerData = (CustomerData) obj;
        reverseProtoWriter.getClass();
        customerData.getClass();
        reverseProtoWriter.writeBytes(customerData.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, customerData.joined_at);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, customerData.cashtag);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, customerData.security_lock_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, customerData.has_passcode);
        CustomerData.IDVStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, customerData.idv_status);
        Region.ADAPTER.encodeWithTag(reverseProtoWriter, 2, customerData.region);
        CustomerData.State.ADAPTER.encodeWithTag(reverseProtoWriter, 1, customerData.state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerData customerData = (CustomerData) obj;
        customerData.getClass();
        int encodedSizeWithTag = CustomerData.IDVStatus.ADAPTER.encodedSizeWithTag(3, customerData.idv_status) + Region.ADAPTER.encodedSizeWithTag(2, customerData.region) + CustomerData.State.ADAPTER.encodedSizeWithTag(1, customerData.state) + customerData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return ProtoAdapter.INT64.encodedSizeWithTag(7, customerData.joined_at) + ProtoAdapter.STRING.encodedSizeWithTag(6, customerData.cashtag) + protoAdapter.encodedSizeWithTag(5, customerData.security_lock_enabled) + protoAdapter.encodedSizeWithTag(4, customerData.has_passcode) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerData customerData = (CustomerData) obj;
        customerData.getClass();
        CustomerData.IDVStatus iDVStatus = customerData.idv_status;
        CustomerData.IDVStatus iDVStatus2 = iDVStatus != null ? (CustomerData.IDVStatus) CustomerData.IDVStatus.ADAPTER.redact(iDVStatus) : null;
        ByteString byteString = ByteString.EMPTY;
        CustomerData.State state = customerData.state;
        Region region = customerData.region;
        Boolean bool = customerData.has_passcode;
        Boolean bool2 = customerData.security_lock_enabled;
        Long l = customerData.joined_at;
        byteString.getClass();
        return new CustomerData(state, region, iDVStatus2, bool, bool2, null, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerData customerData = (CustomerData) obj;
        customerData.getClass();
        CustomerData.State.ADAPTER.encodeWithTag(protoWriter, 1, customerData.state);
        Region.ADAPTER.encodeWithTag(protoWriter, 2, customerData.region);
        CustomerData.IDVStatus.ADAPTER.encodeWithTag(protoWriter, 3, customerData.idv_status);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 4, customerData.has_passcode);
        protoAdapter.encodeWithTag(protoWriter, 5, customerData.security_lock_enabled);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, customerData.cashtag);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, customerData.joined_at);
        protoWriter.writeBytes(customerData.unknownFields());
    }
}
