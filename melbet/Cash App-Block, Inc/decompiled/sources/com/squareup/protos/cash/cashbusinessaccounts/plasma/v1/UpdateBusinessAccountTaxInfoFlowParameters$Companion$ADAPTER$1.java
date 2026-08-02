package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.UpdateBusinessAccountTaxInfoFlowParameters;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateBusinessAccountTaxInfoFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateBusinessAccountTaxInfoFlowParameters((EntryPointType) obj, (BusinessAccountSegment) obj2, (String) obj3, (UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = EntryPointType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj2 = BusinessAccountSegment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                try {
                    obj4 = UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateBusinessAccountTaxInfoFlowParameters updateBusinessAccountTaxInfoFlowParameters = (UpdateBusinessAccountTaxInfoFlowParameters) obj;
        reverseProtoWriter.getClass();
        updateBusinessAccountTaxInfoFlowParameters.getClass();
        reverseProtoWriter.writeBytes(updateBusinessAccountTaxInfoFlowParameters.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, updateBusinessAccountTaxInfoFlowParameters.rerequest);
        UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 4, updateBusinessAccountTaxInfoFlowParameters.entry_point);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, updateBusinessAccountTaxInfoFlowParameters.root_flow_token);
        BusinessAccountSegment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updateBusinessAccountTaxInfoFlowParameters.business_account_segment);
        EntryPointType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateBusinessAccountTaxInfoFlowParameters.entry_point_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateBusinessAccountTaxInfoFlowParameters updateBusinessAccountTaxInfoFlowParameters = (UpdateBusinessAccountTaxInfoFlowParameters) obj;
        updateBusinessAccountTaxInfoFlowParameters.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(5, updateBusinessAccountTaxInfoFlowParameters.rerequest) + UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.ADAPTER.encodedSizeWithTag(4, updateBusinessAccountTaxInfoFlowParameters.entry_point) + ProtoAdapter.STRING.encodedSizeWithTag(3, updateBusinessAccountTaxInfoFlowParameters.root_flow_token) + BusinessAccountSegment.ADAPTER.encodedSizeWithTag(2, updateBusinessAccountTaxInfoFlowParameters.business_account_segment) + EntryPointType.ADAPTER.encodedSizeWithTag(1, updateBusinessAccountTaxInfoFlowParameters.entry_point_type) + updateBusinessAccountTaxInfoFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateBusinessAccountTaxInfoFlowParameters updateBusinessAccountTaxInfoFlowParameters = (UpdateBusinessAccountTaxInfoFlowParameters) obj;
        updateBusinessAccountTaxInfoFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        EntryPointType entryPointType = updateBusinessAccountTaxInfoFlowParameters.entry_point_type;
        BusinessAccountSegment businessAccountSegment = updateBusinessAccountTaxInfoFlowParameters.business_account_segment;
        String str = updateBusinessAccountTaxInfoFlowParameters.root_flow_token;
        UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint entryPoint = updateBusinessAccountTaxInfoFlowParameters.entry_point;
        Boolean bool = updateBusinessAccountTaxInfoFlowParameters.rerequest;
        byteString.getClass();
        return new UpdateBusinessAccountTaxInfoFlowParameters(entryPointType, businessAccountSegment, str, entryPoint, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateBusinessAccountTaxInfoFlowParameters updateBusinessAccountTaxInfoFlowParameters = (UpdateBusinessAccountTaxInfoFlowParameters) obj;
        updateBusinessAccountTaxInfoFlowParameters.getClass();
        EntryPointType.ADAPTER.encodeWithTag(protoWriter, 1, updateBusinessAccountTaxInfoFlowParameters.entry_point_type);
        BusinessAccountSegment.ADAPTER.encodeWithTag(protoWriter, 2, updateBusinessAccountTaxInfoFlowParameters.business_account_segment);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, updateBusinessAccountTaxInfoFlowParameters.root_flow_token);
        UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint.ADAPTER.encodeWithTag(protoWriter, 4, updateBusinessAccountTaxInfoFlowParameters.entry_point);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, updateBusinessAccountTaxInfoFlowParameters.rerequest);
        protoWriter.writeBytes(updateBusinessAccountTaxInfoFlowParameters.unknownFields());
    }
}
