package com.squareup.protos.cash.trustedcontact;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncTrustedContact$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SyncTrustedContact((GlobalAddress) obj5, (String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncTrustedContact syncTrustedContact = (SyncTrustedContact) obj;
        reverseProtoWriter.getClass();
        syncTrustedContact.getClass();
        reverseProtoWriter.writeBytes(syncTrustedContact.unknownFields());
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 5, syncTrustedContact.address);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, syncTrustedContact.phone_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, syncTrustedContact.email_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, syncTrustedContact.last_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, syncTrustedContact.first_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncTrustedContact syncTrustedContact = (SyncTrustedContact) obj;
        syncTrustedContact.getClass();
        int size$okio = syncTrustedContact.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return GlobalAddress.ADAPTER.encodedSizeWithTag(5, syncTrustedContact.address) + protoAdapter.encodedSizeWithTag(4, syncTrustedContact.phone_number) + protoAdapter.encodedSizeWithTag(3, syncTrustedContact.email_address) + protoAdapter.encodedSizeWithTag(2, syncTrustedContact.last_name) + protoAdapter.encodedSizeWithTag(1, syncTrustedContact.first_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SyncTrustedContact) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncTrustedContact(null, null, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncTrustedContact syncTrustedContact = (SyncTrustedContact) obj;
        syncTrustedContact.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, syncTrustedContact.first_name);
        protoAdapter.encodeWithTag(protoWriter, 2, syncTrustedContact.last_name);
        protoAdapter.encodeWithTag(protoWriter, 3, syncTrustedContact.email_address);
        protoAdapter.encodeWithTag(protoWriter, 4, syncTrustedContact.phone_number);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 5, syncTrustedContact.address);
        protoWriter.writeBytes(syncTrustedContact.unknownFields());
    }
}
