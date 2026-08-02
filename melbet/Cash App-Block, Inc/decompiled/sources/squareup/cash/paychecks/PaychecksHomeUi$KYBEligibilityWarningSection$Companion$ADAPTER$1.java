package squareup.cash.paychecks;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$KYBEligibilityWarningSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaychecksHomeUi.KYBEligibilityWarningSection(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.KYBEligibilityWarningSection kYBEligibilityWarningSection = (PaychecksHomeUi.KYBEligibilityWarningSection) obj;
        reverseProtoWriter.getClass();
        kYBEligibilityWarningSection.getClass();
        reverseProtoWriter.writeBytes(kYBEligibilityWarningSection.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.KYBEligibilityWarningSection kYBEligibilityWarningSection = (PaychecksHomeUi.KYBEligibilityWarningSection) obj;
        kYBEligibilityWarningSection.getClass();
        return kYBEligibilityWarningSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((PaychecksHomeUi.KYBEligibilityWarningSection) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaychecksHomeUi.KYBEligibilityWarningSection(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.KYBEligibilityWarningSection kYBEligibilityWarningSection = (PaychecksHomeUi.KYBEligibilityWarningSection) obj;
        kYBEligibilityWarningSection.getClass();
        protoWriter.writeBytes(kYBEligibilityWarningSection.unknownFields());
    }
}
