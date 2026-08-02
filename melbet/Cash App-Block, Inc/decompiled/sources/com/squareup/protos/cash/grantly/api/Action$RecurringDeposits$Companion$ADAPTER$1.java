package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$RecurringDeposits$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Action.RecurringDeposits((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Action.RecurringDeposits recurringDeposits = (Action.RecurringDeposits) obj;
        reverseProtoWriter.getClass();
        recurringDeposits.getClass();
        reverseProtoWriter.writeBytes(recurringDeposits.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, recurringDeposits.account_reference_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recurringDeposits.logo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, recurringDeposits.primary_alias);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.RecurringDeposits recurringDeposits = (Action.RecurringDeposits) obj;
        recurringDeposits.getClass();
        int size$okio = recurringDeposits.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, recurringDeposits.account_reference_id) + protoAdapter.encodedSizeWithTag(2, recurringDeposits.logo_url) + protoAdapter.encodedSizeWithTag(1, recurringDeposits.primary_alias) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.RecurringDeposits recurringDeposits = (Action.RecurringDeposits) obj;
        recurringDeposits.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = recurringDeposits.logo_url;
        String str2 = recurringDeposits.account_reference_id;
        byteString.getClass();
        return new Action.RecurringDeposits(null, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.RecurringDeposits recurringDeposits = (Action.RecurringDeposits) obj;
        recurringDeposits.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, recurringDeposits.primary_alias);
        protoAdapter.encodeWithTag(protoWriter, 2, recurringDeposits.logo_url);
        protoAdapter.encodeWithTag(protoWriter, 3, recurringDeposits.account_reference_id);
        protoWriter.writeBytes(recurringDeposits.unknownFields());
    }
}
