package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalCashConfiguration;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCashConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalCashConfiguration((LocalMoney) obj, (String) obj2, (Long) obj3, (Boolean) obj4, (LocalCashConfiguration.ApplicationMethod) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = LocalCashConfiguration.ApplicationMethod.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCashConfiguration localCashConfiguration = (LocalCashConfiguration) obj;
        reverseProtoWriter.getClass();
        localCashConfiguration.getClass();
        reverseProtoWriter.writeBytes(localCashConfiguration.unknownFields());
        LocalCashConfiguration.ApplicationMethod.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localCashConfiguration.application_method);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, localCashConfiguration.should_apply_by_default);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, localCashConfiguration.local_cash_amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, localCashConfiguration.description);
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localCashConfiguration.local_cash_monetary_value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCashConfiguration localCashConfiguration = (LocalCashConfiguration) obj;
        localCashConfiguration.getClass();
        return LocalCashConfiguration.ApplicationMethod.ADAPTER.encodedSizeWithTag(5, localCashConfiguration.application_method) + ProtoAdapter.BOOL.encodedSizeWithTag(4, localCashConfiguration.should_apply_by_default) + ProtoAdapter.INT64.encodedSizeWithTag(3, localCashConfiguration.local_cash_amount) + ProtoAdapter.STRING.encodedSizeWithTag(2, localCashConfiguration.description) + LocalMoney.ADAPTER.encodedSizeWithTag(1, localCashConfiguration.local_cash_monetary_value) + localCashConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCashConfiguration localCashConfiguration = (LocalCashConfiguration) obj;
        localCashConfiguration.getClass();
        LocalMoney localMoney = localCashConfiguration.local_cash_monetary_value;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localCashConfiguration.description;
        Long l = localCashConfiguration.local_cash_amount;
        Boolean bool = localCashConfiguration.should_apply_by_default;
        LocalCashConfiguration.ApplicationMethod applicationMethod = localCashConfiguration.application_method;
        byteString.getClass();
        return new LocalCashConfiguration(localMoney2, str, l, bool, applicationMethod, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCashConfiguration localCashConfiguration = (LocalCashConfiguration) obj;
        localCashConfiguration.getClass();
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 1, localCashConfiguration.local_cash_monetary_value);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, localCashConfiguration.description);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, localCashConfiguration.local_cash_amount);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, localCashConfiguration.should_apply_by_default);
        LocalCashConfiguration.ApplicationMethod.ADAPTER.encodeWithTag(protoWriter, 5, localCashConfiguration.application_method);
        protoWriter.writeBytes(localCashConfiguration.unknownFields());
    }
}
