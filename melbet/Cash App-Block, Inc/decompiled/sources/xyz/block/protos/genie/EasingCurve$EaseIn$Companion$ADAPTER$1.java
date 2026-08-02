package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes10.dex */
public final class EasingCurve$EaseIn$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EasingCurve.EaseIn(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EasingCurve.EaseIn easeIn = (EasingCurve.EaseIn) obj;
        reverseProtoWriter.getClass();
        easeIn.getClass();
        reverseProtoWriter.writeBytes(easeIn.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EasingCurve.EaseIn easeIn = (EasingCurve.EaseIn) obj;
        easeIn.getClass();
        return easeIn.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((EasingCurve.EaseIn) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EasingCurve.EaseIn(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EasingCurve.EaseIn easeIn = (EasingCurve.EaseIn) obj;
        easeIn.getClass();
        protoWriter.writeBytes(easeIn.unknownFields());
    }
}
