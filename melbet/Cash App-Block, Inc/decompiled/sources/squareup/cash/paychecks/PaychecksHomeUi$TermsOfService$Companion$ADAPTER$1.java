package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$TermsOfService$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaychecksHomeUi.TermsOfService(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalizedString.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.TermsOfService termsOfService = (PaychecksHomeUi.TermsOfService) obj;
        reverseProtoWriter.getClass();
        termsOfService.getClass();
        reverseProtoWriter.writeBytes(termsOfService.unknownFields());
        LocalizedString.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, termsOfService.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.TermsOfService termsOfService = (PaychecksHomeUi.TermsOfService) obj;
        termsOfService.getClass();
        return LocalizedString.ADAPTER.asRepeated().encodedSizeWithTag(1, termsOfService.text) + termsOfService.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.TermsOfService termsOfService = (PaychecksHomeUi.TermsOfService) obj;
        termsOfService.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(termsOfService.text, LocalizedString.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaychecksHomeUi.TermsOfService(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.TermsOfService termsOfService = (PaychecksHomeUi.TermsOfService) obj;
        termsOfService.getClass();
        LocalizedString.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, termsOfService.text);
        protoWriter.writeBytes(termsOfService.unknownFields());
    }
}
