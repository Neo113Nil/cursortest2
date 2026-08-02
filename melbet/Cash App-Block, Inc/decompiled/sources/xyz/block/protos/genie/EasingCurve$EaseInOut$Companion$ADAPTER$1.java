package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes10.dex */
public final class EasingCurve$EaseInOut$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EasingCurve.EaseInOut(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EasingCurve.EaseInOut easeInOut = (EasingCurve.EaseInOut) obj;
        reverseProtoWriter.getClass();
        easeInOut.getClass();
        reverseProtoWriter.writeBytes(easeInOut.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EasingCurve.EaseInOut easeInOut = (EasingCurve.EaseInOut) obj;
        easeInOut.getClass();
        return easeInOut.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((EasingCurve.EaseInOut) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EasingCurve.EaseInOut(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EasingCurve.EaseInOut easeInOut = (EasingCurve.EaseInOut) obj;
        easeInOut.getClass();
        protoWriter.writeBytes(easeInOut.unknownFields());
    }
}
