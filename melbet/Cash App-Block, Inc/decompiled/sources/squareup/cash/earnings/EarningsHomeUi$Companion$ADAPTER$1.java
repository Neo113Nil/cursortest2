package squareup.cash.earnings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.earnings.EarningsHomeUi;

/* loaded from: classes10.dex */
public final class EarningsHomeUi$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsHomeUi(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(EarningsHomeUi.Section.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsHomeUi earningsHomeUi = (EarningsHomeUi) obj;
        reverseProtoWriter.getClass();
        earningsHomeUi.getClass();
        reverseProtoWriter.writeBytes(earningsHomeUi.unknownFields());
        EarningsHomeUi.Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, earningsHomeUi.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsHomeUi earningsHomeUi = (EarningsHomeUi) obj;
        earningsHomeUi.getClass();
        return EarningsHomeUi.Section.ADAPTER.asRepeated().encodedSizeWithTag(1, earningsHomeUi.sections) + earningsHomeUi.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsHomeUi earningsHomeUi = (EarningsHomeUi) obj;
        earningsHomeUi.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(earningsHomeUi.sections, EarningsHomeUi.Section.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EarningsHomeUi(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsHomeUi earningsHomeUi = (EarningsHomeUi) obj;
        earningsHomeUi.getClass();
        EarningsHomeUi.Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, earningsHomeUi.sections);
        protoWriter.writeBytes(earningsHomeUi.unknownFields());
    }
}
