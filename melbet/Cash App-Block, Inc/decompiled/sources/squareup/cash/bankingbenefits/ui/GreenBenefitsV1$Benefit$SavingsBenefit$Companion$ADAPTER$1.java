package squareup.cash.bankingbenefits.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$SavingsBenefit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBenefitsV1.Benefit.SavingsBenefit((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GreenBenefitsV1.Benefit.SavingsBenefit savingsBenefit = (GreenBenefitsV1.Benefit.SavingsBenefit) obj;
        reverseProtoWriter.getClass();
        savingsBenefit.getClass();
        reverseProtoWriter.writeBytes(savingsBenefit.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, savingsBenefit.apy_bips);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GreenBenefitsV1.Benefit.SavingsBenefit savingsBenefit = (GreenBenefitsV1.Benefit.SavingsBenefit) obj;
        savingsBenefit.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, savingsBenefit.apy_bips) + savingsBenefit.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBenefitsV1.Benefit.SavingsBenefit savingsBenefit = (GreenBenefitsV1.Benefit.SavingsBenefit) obj;
        savingsBenefit.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = savingsBenefit.apy_bips;
        byteString.getClass();
        return new GreenBenefitsV1.Benefit.SavingsBenefit(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBenefitsV1.Benefit.SavingsBenefit savingsBenefit = (GreenBenefitsV1.Benefit.SavingsBenefit) obj;
        savingsBenefit.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, savingsBenefit.apy_bips);
        protoWriter.writeBytes(savingsBenefit.unknownFields());
    }
}
