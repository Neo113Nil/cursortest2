package squareup.cash.earnings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningFdicFooterSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningFdicFooterSection(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningFdicFooterSection earningFdicFooterSection = (EarningFdicFooterSection) obj;
        reverseProtoWriter.getClass();
        earningFdicFooterSection.getClass();
        reverseProtoWriter.writeBytes(earningFdicFooterSection.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningFdicFooterSection earningFdicFooterSection = (EarningFdicFooterSection) obj;
        earningFdicFooterSection.getClass();
        return earningFdicFooterSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((EarningFdicFooterSection) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EarningFdicFooterSection(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningFdicFooterSection earningFdicFooterSection = (EarningFdicFooterSection) obj;
        earningFdicFooterSection.getClass();
        protoWriter.writeBytes(earningFdicFooterSection.unknownFields());
    }
}
