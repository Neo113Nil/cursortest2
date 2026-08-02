package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$Header$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaychecksHomeUi.Header((PaychecksHomeUi.Header.NullStateUpsell) obj, (PaychecksHomeUi.Header.ViewBenefitsButton) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PaychecksHomeUi.Header.NullStateUpsell.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(PaychecksHomeUi.Header.ViewBenefitsButton.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.Header header = (PaychecksHomeUi.Header) obj;
        reverseProtoWriter.getClass();
        header.getClass();
        reverseProtoWriter.writeBytes(header.unknownFields());
        PaychecksHomeUi.Header.ViewBenefitsButton.ADAPTER.encodeWithTag(reverseProtoWriter, 2, header.view_benefits_button);
        PaychecksHomeUi.Header.NullStateUpsell.ADAPTER.encodeWithTag(reverseProtoWriter, 1, header.null_state_upsell);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.Header header = (PaychecksHomeUi.Header) obj;
        header.getClass();
        return PaychecksHomeUi.Header.ViewBenefitsButton.ADAPTER.encodedSizeWithTag(2, header.view_benefits_button) + PaychecksHomeUi.Header.NullStateUpsell.ADAPTER.encodedSizeWithTag(1, header.null_state_upsell) + header.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.Header header = (PaychecksHomeUi.Header) obj;
        header.getClass();
        PaychecksHomeUi.Header.NullStateUpsell nullStateUpsell = header.null_state_upsell;
        PaychecksHomeUi.Header.NullStateUpsell nullStateUpsell2 = nullStateUpsell != null ? (PaychecksHomeUi.Header.NullStateUpsell) PaychecksHomeUi.Header.NullStateUpsell.ADAPTER.redact(nullStateUpsell) : null;
        PaychecksHomeUi.Header.ViewBenefitsButton viewBenefitsButton = header.view_benefits_button;
        PaychecksHomeUi.Header.ViewBenefitsButton viewBenefitsButton2 = viewBenefitsButton != null ? (PaychecksHomeUi.Header.ViewBenefitsButton) PaychecksHomeUi.Header.ViewBenefitsButton.ADAPTER.redact(viewBenefitsButton) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaychecksHomeUi.Header(nullStateUpsell2, viewBenefitsButton2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.Header header = (PaychecksHomeUi.Header) obj;
        header.getClass();
        PaychecksHomeUi.Header.NullStateUpsell.ADAPTER.encodeWithTag(protoWriter, 1, header.null_state_upsell);
        PaychecksHomeUi.Header.ViewBenefitsButton.ADAPTER.encodeWithTag(protoWriter, 2, header.view_benefits_button);
        protoWriter.writeBytes(header.unknownFields());
    }
}
