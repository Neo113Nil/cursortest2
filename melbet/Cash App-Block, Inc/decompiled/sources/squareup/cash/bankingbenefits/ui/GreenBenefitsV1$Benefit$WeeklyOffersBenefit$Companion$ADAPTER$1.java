package squareup.cash.bankingbenefits.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$WeeklyOffersBenefit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBenefitsV1.Benefit.WeeklyOffersBenefit((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GreenBenefitsV1.Benefit.WeeklyOffersBenefit weeklyOffersBenefit = (GreenBenefitsV1.Benefit.WeeklyOffersBenefit) obj;
        reverseProtoWriter.getClass();
        weeklyOffersBenefit.getClass();
        reverseProtoWriter.writeBytes(weeklyOffersBenefit.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, weeklyOffersBenefit.limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GreenBenefitsV1.Benefit.WeeklyOffersBenefit weeklyOffersBenefit = (GreenBenefitsV1.Benefit.WeeklyOffersBenefit) obj;
        weeklyOffersBenefit.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, weeklyOffersBenefit.limit) + weeklyOffersBenefit.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBenefitsV1.Benefit.WeeklyOffersBenefit weeklyOffersBenefit = (GreenBenefitsV1.Benefit.WeeklyOffersBenefit) obj;
        weeklyOffersBenefit.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = weeklyOffersBenefit.limit;
        byteString.getClass();
        return new GreenBenefitsV1.Benefit.WeeklyOffersBenefit(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBenefitsV1.Benefit.WeeklyOffersBenefit weeklyOffersBenefit = (GreenBenefitsV1.Benefit.WeeklyOffersBenefit) obj;
        weeklyOffersBenefit.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, weeklyOffersBenefit.limit);
        protoWriter.writeBytes(weeklyOffersBenefit.unknownFields());
    }
}
