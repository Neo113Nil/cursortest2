package squareup.cash.cryptocurrency;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class BtcP2pConversionBps$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BtcP2pConversionBps((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BtcP2pConversionBps btcP2pConversionBps = (BtcP2pConversionBps) obj;
        reverseProtoWriter.getClass();
        btcP2pConversionBps.getClass();
        reverseProtoWriter.writeBytes(btcP2pConversionBps.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, btcP2pConversionBps.conversion_bps);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BtcP2pConversionBps btcP2pConversionBps = (BtcP2pConversionBps) obj;
        btcP2pConversionBps.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, btcP2pConversionBps.conversion_bps) + btcP2pConversionBps.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BtcP2pConversionBps btcP2pConversionBps = (BtcP2pConversionBps) obj;
        btcP2pConversionBps.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = btcP2pConversionBps.conversion_bps;
        byteString.getClass();
        return new BtcP2pConversionBps(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BtcP2pConversionBps btcP2pConversionBps = (BtcP2pConversionBps) obj;
        btcP2pConversionBps.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, btcP2pConversionBps.conversion_bps);
        protoWriter.writeBytes(btcP2pConversionBps.unknownFields());
    }
}
