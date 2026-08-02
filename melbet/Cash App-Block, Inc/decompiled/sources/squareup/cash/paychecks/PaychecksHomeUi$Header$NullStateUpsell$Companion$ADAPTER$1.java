package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$Header$NullStateUpsell$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaychecksHomeUi.Header.NullStateUpsell(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PaychecksHomeUi.Header.NullStateUpsell.DetailRow.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.Header.NullStateUpsell nullStateUpsell = (PaychecksHomeUi.Header.NullStateUpsell) obj;
        reverseProtoWriter.getClass();
        nullStateUpsell.getClass();
        reverseProtoWriter.writeBytes(nullStateUpsell.unknownFields());
        PaychecksHomeUi.Header.NullStateUpsell.DetailRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, nullStateUpsell.detail_rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.Header.NullStateUpsell nullStateUpsell = (PaychecksHomeUi.Header.NullStateUpsell) obj;
        nullStateUpsell.getClass();
        return PaychecksHomeUi.Header.NullStateUpsell.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(1, nullStateUpsell.detail_rows) + nullStateUpsell.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.Header.NullStateUpsell nullStateUpsell = (PaychecksHomeUi.Header.NullStateUpsell) obj;
        nullStateUpsell.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(nullStateUpsell.detail_rows, PaychecksHomeUi.Header.NullStateUpsell.DetailRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaychecksHomeUi.Header.NullStateUpsell(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.Header.NullStateUpsell nullStateUpsell = (PaychecksHomeUi.Header.NullStateUpsell) obj;
        nullStateUpsell.getClass();
        PaychecksHomeUi.Header.NullStateUpsell.DetailRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, nullStateUpsell.detail_rows);
        protoWriter.writeBytes(nullStateUpsell.unknownFields());
    }
}
