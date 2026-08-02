package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.AllowanceRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AllowanceRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AllowanceRenderData((String) obj4, (String) obj5, (AllowanceRenderData.AllowanceState) obj6, (AllowanceRenderData.AllowanceStateReason) obj7, (Long) obj8, (String) obj9, (String) obj10, (AllowanceRenderData.Role) obj11, (Boolean) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                if (nextTag != 3) {
                    switch (nextTag) {
                        case 7:
                            obj8 = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            obj9 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            obj = obj4;
                            obj2 = obj5;
                            try {
                                obj4 = obj;
                                obj7 = AllowanceRenderData.AllowanceStateReason.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj3 = obj6;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 10:
                            obj10 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            try {
                                obj11 = AllowanceRenderData.Role.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj = obj4;
                                obj2 = obj5;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 12:
                            obj12 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj4;
                            obj2 = obj5;
                            obj3 = obj6;
                            obj4 = obj;
                            obj6 = obj3;
                            break;
                    }
                } else {
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    try {
                        obj4 = obj;
                        obj6 = AllowanceRenderData.AllowanceState.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                    }
                }
                obj5 = obj2;
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AllowanceRenderData allowanceRenderData = (AllowanceRenderData) obj;
        reverseProtoWriter.getClass();
        allowanceRenderData.getClass();
        reverseProtoWriter.writeBytes(allowanceRenderData.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 12, allowanceRenderData.is_managed_account);
        AllowanceRenderData.Role.ADAPTER.encodeWithTag(reverseProtoWriter, 11, allowanceRenderData.role);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, allowanceRenderData.icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, allowanceRenderData.time_zone);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, allowanceRenderData.allowance_payment_datetime_ms);
        AllowanceRenderData.AllowanceStateReason.ADAPTER.encodeWithTag(reverseProtoWriter, 9, allowanceRenderData.state_reason);
        AllowanceRenderData.AllowanceState.ADAPTER.encodeWithTag(reverseProtoWriter, 3, allowanceRenderData.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, allowanceRenderData.skip_allowance_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, allowanceRenderData.edit_allowance_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AllowanceRenderData allowanceRenderData = (AllowanceRenderData) obj;
        allowanceRenderData.getClass();
        int size$okio = allowanceRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(12, allowanceRenderData.is_managed_account) + AllowanceRenderData.Role.ADAPTER.encodedSizeWithTag(11, allowanceRenderData.role) + protoAdapter.encodedSizeWithTag(10, allowanceRenderData.icon_url) + protoAdapter.encodedSizeWithTag(8, allowanceRenderData.time_zone) + ProtoAdapter.INT64.encodedSizeWithTag(7, allowanceRenderData.allowance_payment_datetime_ms) + AllowanceRenderData.AllowanceStateReason.ADAPTER.encodedSizeWithTag(9, allowanceRenderData.state_reason) + AllowanceRenderData.AllowanceState.ADAPTER.encodedSizeWithTag(3, allowanceRenderData.state) + protoAdapter.encodedSizeWithTag(2, allowanceRenderData.skip_allowance_url) + protoAdapter.encodedSizeWithTag(1, allowanceRenderData.edit_allowance_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AllowanceRenderData allowanceRenderData = (AllowanceRenderData) obj;
        allowanceRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = allowanceRenderData.edit_allowance_url;
        String str2 = allowanceRenderData.skip_allowance_url;
        AllowanceRenderData.AllowanceState allowanceState = allowanceRenderData.state;
        AllowanceRenderData.AllowanceStateReason allowanceStateReason = allowanceRenderData.state_reason;
        Long l = allowanceRenderData.allowance_payment_datetime_ms;
        String str3 = allowanceRenderData.time_zone;
        String str4 = allowanceRenderData.icon_url;
        AllowanceRenderData.Role role = allowanceRenderData.role;
        Boolean bool = allowanceRenderData.is_managed_account;
        byteString.getClass();
        return new AllowanceRenderData(str, str2, allowanceState, allowanceStateReason, l, str3, str4, role, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AllowanceRenderData allowanceRenderData = (AllowanceRenderData) obj;
        allowanceRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, allowanceRenderData.edit_allowance_url);
        protoAdapter.encodeWithTag(protoWriter, 2, allowanceRenderData.skip_allowance_url);
        AllowanceRenderData.AllowanceState.ADAPTER.encodeWithTag(protoWriter, 3, allowanceRenderData.state);
        AllowanceRenderData.AllowanceStateReason.ADAPTER.encodeWithTag(protoWriter, 9, allowanceRenderData.state_reason);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, allowanceRenderData.allowance_payment_datetime_ms);
        protoAdapter.encodeWithTag(protoWriter, 8, allowanceRenderData.time_zone);
        protoAdapter.encodeWithTag(protoWriter, 10, allowanceRenderData.icon_url);
        AllowanceRenderData.Role.ADAPTER.encodeWithTag(protoWriter, 11, allowanceRenderData.role);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, allowanceRenderData.is_managed_account);
        protoWriter.writeBytes(allowanceRenderData.unknownFields());
    }
}
