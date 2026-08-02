package com.squareup.protos.cash.portfolios.syncvalues;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BalanceTick$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BalanceTick((Long) obj, (Long) obj2, (Long) obj3, (Long) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 5) {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceTick balanceTick = (BalanceTick) obj;
        reverseProtoWriter.getClass();
        balanceTick.getClass();
        reverseProtoWriter.writeBytes(balanceTick.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, balanceTick.display_text);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, balanceTick.gain_bps);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, balanceTick.gain_amount_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, balanceTick.time_sec);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, balanceTick.amount_cents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceTick balanceTick = (BalanceTick) obj;
        balanceTick.getClass();
        int size$okio = balanceTick.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return ProtoAdapter.STRING.encodedSizeWithTag(6, balanceTick.display_text) + protoAdapter.encodedSizeWithTag(5, balanceTick.gain_bps) + protoAdapter.encodedSizeWithTag(4, balanceTick.gain_amount_cents) + protoAdapter.encodedSizeWithTag(3, balanceTick.time_sec) + protoAdapter.encodedSizeWithTag(1, balanceTick.amount_cents) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceTick balanceTick = (BalanceTick) obj;
        balanceTick.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = balanceTick.time_sec;
        Long l2 = balanceTick.gain_bps;
        String str = balanceTick.display_text;
        byteString.getClass();
        return new BalanceTick(null, l, null, l2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceTick balanceTick = (BalanceTick) obj;
        balanceTick.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, balanceTick.amount_cents);
        protoAdapter.encodeWithTag(protoWriter, 3, balanceTick.time_sec);
        protoAdapter.encodeWithTag(protoWriter, 4, balanceTick.gain_amount_cents);
        protoAdapter.encodeWithTag(protoWriter, 5, balanceTick.gain_bps);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, balanceTick.display_text);
        protoWriter.writeBytes(balanceTick.unknownFields());
    }
}
