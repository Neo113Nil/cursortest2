package com.squareup.protos.cash.local.client.app.v1.poscheckin;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalPOSCheckIn$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalPOSCheckIn((LocalPOSCheckIn.State) obj, (Long) obj2, (String) obj3, (String) obj4, (LocalPOSCheckIn.Location) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LocalPOSCheckIn.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalPOSCheckIn.Location.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalPOSCheckIn localPOSCheckIn = (LocalPOSCheckIn) obj;
        reverseProtoWriter.getClass();
        localPOSCheckIn.getClass();
        reverseProtoWriter.writeBytes(localPOSCheckIn.unknownFields());
        LocalPOSCheckIn.Location.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localPOSCheckIn.location);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localPOSCheckIn.check_in_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localPOSCheckIn.sort_key);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, localPOSCheckIn.local_cash_adjusted_amount);
        LocalPOSCheckIn.State.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localPOSCheckIn.state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalPOSCheckIn localPOSCheckIn = (LocalPOSCheckIn) obj;
        localPOSCheckIn.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(2, localPOSCheckIn.local_cash_adjusted_amount) + LocalPOSCheckIn.State.ADAPTER.encodedSizeWithTag(1, localPOSCheckIn.state) + localPOSCheckIn.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalPOSCheckIn.Location.ADAPTER.encodedSizeWithTag(5, localPOSCheckIn.location) + protoAdapter.encodedSizeWithTag(4, localPOSCheckIn.check_in_token) + protoAdapter.encodedSizeWithTag(3, localPOSCheckIn.sort_key) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalPOSCheckIn localPOSCheckIn = (LocalPOSCheckIn) obj;
        localPOSCheckIn.getClass();
        LocalPOSCheckIn.Location location = localPOSCheckIn.location;
        LocalPOSCheckIn.Location location2 = location != null ? (LocalPOSCheckIn.Location) LocalPOSCheckIn.Location.ADAPTER.redact(location) : null;
        ByteString byteString = ByteString.EMPTY;
        LocalPOSCheckIn.State state = localPOSCheckIn.state;
        Long l = localPOSCheckIn.local_cash_adjusted_amount;
        String str = localPOSCheckIn.sort_key;
        String str2 = localPOSCheckIn.check_in_token;
        byteString.getClass();
        return new LocalPOSCheckIn(state, l, str, str2, location2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalPOSCheckIn localPOSCheckIn = (LocalPOSCheckIn) obj;
        localPOSCheckIn.getClass();
        LocalPOSCheckIn.State.ADAPTER.encodeWithTag(protoWriter, 1, localPOSCheckIn.state);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, localPOSCheckIn.local_cash_adjusted_amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, localPOSCheckIn.sort_key);
        protoAdapter.encodeWithTag(protoWriter, 4, localPOSCheckIn.check_in_token);
        LocalPOSCheckIn.Location.ADAPTER.encodeWithTag(protoWriter, 5, localPOSCheckIn.location);
        protoWriter.writeBytes(localPOSCheckIn.unknownFields());
    }
}
