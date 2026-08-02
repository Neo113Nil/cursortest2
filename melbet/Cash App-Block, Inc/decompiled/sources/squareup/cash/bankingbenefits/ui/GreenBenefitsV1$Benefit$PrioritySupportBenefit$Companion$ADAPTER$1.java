package squareup.cash.bankingbenefits.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$PrioritySupportBenefit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBenefitsV1.Benefit.PrioritySupportBenefit((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GreenBenefitsV1.Benefit.PrioritySupportBenefit prioritySupportBenefit = (GreenBenefitsV1.Benefit.PrioritySupportBenefit) obj;
        reverseProtoWriter.getClass();
        prioritySupportBenefit.getClass();
        reverseProtoWriter.writeBytes(prioritySupportBenefit.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, prioritySupportBenefit.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GreenBenefitsV1.Benefit.PrioritySupportBenefit prioritySupportBenefit = (GreenBenefitsV1.Benefit.PrioritySupportBenefit) obj;
        prioritySupportBenefit.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, prioritySupportBenefit.enabled) + prioritySupportBenefit.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBenefitsV1.Benefit.PrioritySupportBenefit prioritySupportBenefit = (GreenBenefitsV1.Benefit.PrioritySupportBenefit) obj;
        prioritySupportBenefit.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = prioritySupportBenefit.enabled;
        byteString.getClass();
        return new GreenBenefitsV1.Benefit.PrioritySupportBenefit(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBenefitsV1.Benefit.PrioritySupportBenefit prioritySupportBenefit = (GreenBenefitsV1.Benefit.PrioritySupportBenefit) obj;
        prioritySupportBenefit.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, prioritySupportBenefit.enabled);
        protoWriter.writeBytes(prioritySupportBenefit.unknownFields());
    }
}
