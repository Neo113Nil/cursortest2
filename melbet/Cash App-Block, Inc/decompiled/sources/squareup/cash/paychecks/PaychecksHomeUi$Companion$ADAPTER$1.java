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
public final class PaychecksHomeUi$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaychecksHomeUi(m, (PaychecksHomeUi.Header) obj, (PaychecksHomeUi.TermsOfService) obj2, (String) obj3, (PaychecksHomeUi.TermsOfService) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PaychecksHomeUi.Section.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(PaychecksHomeUi.Header.ADAPTER, protoReader, obj);
            } else if (nextTag == 4) {
                obj2 = TransactorKt.decodeMessageOrMerge(PaychecksHomeUi.TermsOfService.ADAPTER, protoReader, obj2);
            } else if (nextTag == 5) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(PaychecksHomeUi.TermsOfService.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi paychecksHomeUi = (PaychecksHomeUi) obj;
        reverseProtoWriter.getClass();
        paychecksHomeUi.getClass();
        reverseProtoWriter.writeBytes(paychecksHomeUi.unknownFields());
        ProtoAdapter protoAdapter = PaychecksHomeUi.TermsOfService.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, paychecksHomeUi.paychecks_terms);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, paychecksHomeUi.banking_benefits_booklet_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, paychecksHomeUi.terms_of_service);
        PaychecksHomeUi.Header.ADAPTER.encodeWithTag(reverseProtoWriter, 3, paychecksHomeUi.header);
        PaychecksHomeUi.Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, paychecksHomeUi.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi paychecksHomeUi = (PaychecksHomeUi) obj;
        paychecksHomeUi.getClass();
        int encodedSizeWithTag = PaychecksHomeUi.Header.ADAPTER.encodedSizeWithTag(3, paychecksHomeUi.header) + PaychecksHomeUi.Section.ADAPTER.asRepeated().encodedSizeWithTag(1, paychecksHomeUi.sections) + paychecksHomeUi.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = PaychecksHomeUi.TermsOfService.ADAPTER;
        return protoAdapter.encodedSizeWithTag(6, paychecksHomeUi.paychecks_terms) + ProtoAdapter.STRING.encodedSizeWithTag(5, paychecksHomeUi.banking_benefits_booklet_client_route) + protoAdapter.encodedSizeWithTag(4, paychecksHomeUi.terms_of_service) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi paychecksHomeUi = (PaychecksHomeUi) obj;
        paychecksHomeUi.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paychecksHomeUi.sections, PaychecksHomeUi.Section.ADAPTER);
        PaychecksHomeUi.Header header = paychecksHomeUi.header;
        PaychecksHomeUi.Header header2 = header != null ? (PaychecksHomeUi.Header) PaychecksHomeUi.Header.ADAPTER.redact(header) : null;
        PaychecksHomeUi.TermsOfService termsOfService = paychecksHomeUi.terms_of_service;
        PaychecksHomeUi.TermsOfService termsOfService2 = termsOfService != null ? (PaychecksHomeUi.TermsOfService) PaychecksHomeUi.TermsOfService.ADAPTER.redact(termsOfService) : null;
        PaychecksHomeUi.TermsOfService termsOfService3 = paychecksHomeUi.paychecks_terms;
        PaychecksHomeUi.TermsOfService termsOfService4 = termsOfService3 != null ? (PaychecksHomeUi.TermsOfService) PaychecksHomeUi.TermsOfService.ADAPTER.redact(termsOfService3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = paychecksHomeUi.banking_benefits_booklet_client_route;
        byteString.getClass();
        return new PaychecksHomeUi(m1169redactElements, header2, termsOfService2, str, termsOfService4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi paychecksHomeUi = (PaychecksHomeUi) obj;
        paychecksHomeUi.getClass();
        PaychecksHomeUi.Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, paychecksHomeUi.sections);
        PaychecksHomeUi.Header.ADAPTER.encodeWithTag(protoWriter, 3, paychecksHomeUi.header);
        ProtoAdapter protoAdapter = PaychecksHomeUi.TermsOfService.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, paychecksHomeUi.terms_of_service);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, paychecksHomeUi.banking_benefits_booklet_client_route);
        protoAdapter.encodeWithTag(protoWriter, 6, paychecksHomeUi.paychecks_terms);
        protoWriter.writeBytes(paychecksHomeUi.unknownFields());
    }
}
