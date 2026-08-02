package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.CustomerAdjustmentRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomerAdjustmentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerAdjustmentRenderData((CustomerAdjustmentRenderData.Product) obj, (CustomerAdjustmentRenderData.Action) obj2, (String) obj3, (String) obj4, (Long) obj5, (CustomerAdjustmentRenderData.AdditionalAchContext) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CustomerAdjustmentRenderData.Product.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                try {
                    obj2 = CustomerAdjustmentRenderData.Action.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 10) {
                obj6 = TransactorKt.decodeMessageOrMerge(CustomerAdjustmentRenderData.AdditionalAchContext.ADAPTER, protoReader, obj6);
            } else if (nextTag == 6) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 7) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 8) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerAdjustmentRenderData customerAdjustmentRenderData = (CustomerAdjustmentRenderData) obj;
        reverseProtoWriter.getClass();
        customerAdjustmentRenderData.getClass();
        reverseProtoWriter.writeBytes(customerAdjustmentRenderData.unknownFields());
        CustomerAdjustmentRenderData.AdditionalAchContext.ADAPTER.encodeWithTag(reverseProtoWriter, 10, customerAdjustmentRenderData.additional_ach_context);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 8, customerAdjustmentRenderData.original_transaction_created_at);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, customerAdjustmentRenderData.instrument_display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, customerAdjustmentRenderData.bank_name);
        CustomerAdjustmentRenderData.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, customerAdjustmentRenderData.adjustment_action);
        CustomerAdjustmentRenderData.Product.ADAPTER.encodeWithTag(reverseProtoWriter, 1, customerAdjustmentRenderData.product_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerAdjustmentRenderData customerAdjustmentRenderData = (CustomerAdjustmentRenderData) obj;
        customerAdjustmentRenderData.getClass();
        int encodedSizeWithTag = CustomerAdjustmentRenderData.Action.ADAPTER.encodedSizeWithTag(3, customerAdjustmentRenderData.adjustment_action) + CustomerAdjustmentRenderData.Product.ADAPTER.encodedSizeWithTag(1, customerAdjustmentRenderData.product_type) + customerAdjustmentRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CustomerAdjustmentRenderData.AdditionalAchContext.ADAPTER.encodedSizeWithTag(10, customerAdjustmentRenderData.additional_ach_context) + ProtoAdapter.INT64.encodedSizeWithTag(8, customerAdjustmentRenderData.original_transaction_created_at) + protoAdapter.encodedSizeWithTag(7, customerAdjustmentRenderData.instrument_display_name) + protoAdapter.encodedSizeWithTag(6, customerAdjustmentRenderData.bank_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerAdjustmentRenderData customerAdjustmentRenderData = (CustomerAdjustmentRenderData) obj;
        customerAdjustmentRenderData.getClass();
        CustomerAdjustmentRenderData.AdditionalAchContext additionalAchContext = customerAdjustmentRenderData.additional_ach_context;
        CustomerAdjustmentRenderData.AdditionalAchContext additionalAchContext2 = additionalAchContext != null ? (CustomerAdjustmentRenderData.AdditionalAchContext) CustomerAdjustmentRenderData.AdditionalAchContext.ADAPTER.redact(additionalAchContext) : null;
        ByteString byteString = ByteString.EMPTY;
        CustomerAdjustmentRenderData.Product product = customerAdjustmentRenderData.product_type;
        CustomerAdjustmentRenderData.Action action = customerAdjustmentRenderData.adjustment_action;
        String str = customerAdjustmentRenderData.bank_name;
        String str2 = customerAdjustmentRenderData.instrument_display_name;
        Long l = customerAdjustmentRenderData.original_transaction_created_at;
        byteString.getClass();
        return new CustomerAdjustmentRenderData(product, action, str, str2, l, additionalAchContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerAdjustmentRenderData customerAdjustmentRenderData = (CustomerAdjustmentRenderData) obj;
        customerAdjustmentRenderData.getClass();
        CustomerAdjustmentRenderData.Product.ADAPTER.encodeWithTag(protoWriter, 1, customerAdjustmentRenderData.product_type);
        CustomerAdjustmentRenderData.Action.ADAPTER.encodeWithTag(protoWriter, 3, customerAdjustmentRenderData.adjustment_action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 6, customerAdjustmentRenderData.bank_name);
        protoAdapter.encodeWithTag(protoWriter, 7, customerAdjustmentRenderData.instrument_display_name);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, customerAdjustmentRenderData.original_transaction_created_at);
        CustomerAdjustmentRenderData.AdditionalAchContext.ADAPTER.encodeWithTag(protoWriter, 10, customerAdjustmentRenderData.additional_ach_context);
        protoWriter.writeBytes(customerAdjustmentRenderData.unknownFields());
    }
}
