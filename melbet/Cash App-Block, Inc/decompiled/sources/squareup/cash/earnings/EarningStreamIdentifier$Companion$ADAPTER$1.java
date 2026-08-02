package squareup.cash.earnings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningStreamIdentifier$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningStreamIdentifier((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningStreamIdentifier earningStreamIdentifier = (EarningStreamIdentifier) obj;
        reverseProtoWriter.getClass();
        earningStreamIdentifier.getClass();
        reverseProtoWriter.writeBytes(earningStreamIdentifier.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, earningStreamIdentifier.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningStreamIdentifier earningStreamIdentifier = (EarningStreamIdentifier) obj;
        earningStreamIdentifier.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, earningStreamIdentifier.token) + earningStreamIdentifier.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningStreamIdentifier earningStreamIdentifier = (EarningStreamIdentifier) obj;
        earningStreamIdentifier.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = earningStreamIdentifier.token;
        byteString.getClass();
        return new EarningStreamIdentifier(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningStreamIdentifier earningStreamIdentifier = (EarningStreamIdentifier) obj;
        earningStreamIdentifier.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, earningStreamIdentifier.token);
        protoWriter.writeBytes(earningStreamIdentifier.unknownFields());
    }
}
