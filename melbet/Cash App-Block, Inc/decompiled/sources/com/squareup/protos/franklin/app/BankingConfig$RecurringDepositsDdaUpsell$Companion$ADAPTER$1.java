package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class BankingConfig$RecurringDepositsDdaUpsell$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BankingConfig.RecurringDepositsDdaUpsell((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BankingConfig.RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = (BankingConfig.RecurringDepositsDdaUpsell) obj;
        reverseProtoWriter.getClass();
        recurringDepositsDdaUpsell.getClass();
        reverseProtoWriter.writeBytes(recurringDepositsDdaUpsell.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, recurringDepositsDdaUpsell.cta);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recurringDepositsDdaUpsell.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, recurringDepositsDdaUpsell.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BankingConfig.RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = (BankingConfig.RecurringDepositsDdaUpsell) obj;
        recurringDepositsDdaUpsell.getClass();
        int size$okio = recurringDepositsDdaUpsell.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, recurringDepositsDdaUpsell.cta) + protoAdapter.encodedSizeWithTag(2, recurringDepositsDdaUpsell.body) + protoAdapter.encodedSizeWithTag(1, recurringDepositsDdaUpsell.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BankingConfig.RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = (BankingConfig.RecurringDepositsDdaUpsell) obj;
        recurringDepositsDdaUpsell.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = recurringDepositsDdaUpsell.title;
        String str2 = recurringDepositsDdaUpsell.body;
        String str3 = recurringDepositsDdaUpsell.cta;
        byteString.getClass();
        return new BankingConfig.RecurringDepositsDdaUpsell(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BankingConfig.RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = (BankingConfig.RecurringDepositsDdaUpsell) obj;
        recurringDepositsDdaUpsell.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, recurringDepositsDdaUpsell.title);
        protoAdapter.encodeWithTag(protoWriter, 2, recurringDepositsDdaUpsell.body);
        protoAdapter.encodeWithTag(protoWriter, 3, recurringDepositsDdaUpsell.cta);
        protoWriter.writeBytes(recurringDepositsDdaUpsell.unknownFields());
    }
}
