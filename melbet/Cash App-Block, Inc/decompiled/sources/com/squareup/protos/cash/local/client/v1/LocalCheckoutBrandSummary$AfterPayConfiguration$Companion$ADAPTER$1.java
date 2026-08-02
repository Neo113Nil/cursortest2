package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalCheckoutBrandSummary;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCheckoutBrandSummary$AfterPayConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalCheckoutBrandSummary.AfterPayConfiguration((Boolean) obj, (LocalMoney) obj2, (LocalMoney) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCheckoutBrandSummary.AfterPayConfiguration afterPayConfiguration = (LocalCheckoutBrandSummary.AfterPayConfiguration) obj;
        reverseProtoWriter.getClass();
        afterPayConfiguration.getClass();
        reverseProtoWriter.writeBytes(afterPayConfiguration.unknownFields());
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, afterPayConfiguration.maximum_order_total_required);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, afterPayConfiguration.minimum_order_total_required);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, afterPayConfiguration.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCheckoutBrandSummary.AfterPayConfiguration afterPayConfiguration = (LocalCheckoutBrandSummary.AfterPayConfiguration) obj;
        afterPayConfiguration.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, afterPayConfiguration.enabled) + afterPayConfiguration.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, afterPayConfiguration.maximum_order_total_required) + protoAdapter.encodedSizeWithTag(2, afterPayConfiguration.minimum_order_total_required) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCheckoutBrandSummary.AfterPayConfiguration afterPayConfiguration = (LocalCheckoutBrandSummary.AfterPayConfiguration) obj;
        afterPayConfiguration.getClass();
        LocalMoney localMoney = afterPayConfiguration.minimum_order_total_required;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        LocalMoney localMoney3 = afterPayConfiguration.maximum_order_total_required;
        LocalMoney localMoney4 = localMoney3 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney3) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = afterPayConfiguration.enabled;
        byteString.getClass();
        return new LocalCheckoutBrandSummary.AfterPayConfiguration(bool, localMoney2, localMoney4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCheckoutBrandSummary.AfterPayConfiguration afterPayConfiguration = (LocalCheckoutBrandSummary.AfterPayConfiguration) obj;
        afterPayConfiguration.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, afterPayConfiguration.enabled);
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, afterPayConfiguration.minimum_order_total_required);
        protoAdapter.encodeWithTag(protoWriter, 3, afterPayConfiguration.maximum_order_total_required);
        protoWriter.writeBytes(afterPayConfiguration.unknownFields());
    }
}
