package squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBenefitsV1(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GreenBenefitsV1.Benefit.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(GreenBenefitsV1.Benefit.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GreenBenefitsV1 greenBenefitsV1 = (GreenBenefitsV1) obj;
        reverseProtoWriter.getClass();
        greenBenefitsV1.getClass();
        reverseProtoWriter.writeBytes(greenBenefitsV1.unknownFields());
        ProtoAdapter protoAdapter = GreenBenefitsV1.Benefit.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, greenBenefitsV1.green_status_benefits);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, greenBenefitsV1.card_holder_benefits);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GreenBenefitsV1 greenBenefitsV1 = (GreenBenefitsV1) obj;
        greenBenefitsV1.getClass();
        int size$okio = greenBenefitsV1.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = GreenBenefitsV1.Benefit.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, greenBenefitsV1.green_status_benefits) + protoAdapter.asRepeated().encodedSizeWithTag(1, greenBenefitsV1.card_holder_benefits) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBenefitsV1 greenBenefitsV1 = (GreenBenefitsV1) obj;
        greenBenefitsV1.getClass();
        List list = greenBenefitsV1.card_holder_benefits;
        ProtoAdapter protoAdapter = GreenBenefitsV1.Benefit.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(greenBenefitsV1.green_status_benefits, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GreenBenefitsV1(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBenefitsV1 greenBenefitsV1 = (GreenBenefitsV1) obj;
        greenBenefitsV1.getClass();
        ProtoAdapter protoAdapter = GreenBenefitsV1.Benefit.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, greenBenefitsV1.card_holder_benefits);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, greenBenefitsV1.green_status_benefits);
        protoWriter.writeBytes(greenBenefitsV1.unknownFields());
    }
}
