package squareup.cash.earnings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes10.dex */
public final class EarningsTimeFrame$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        EarningsTimeFrame.TimeFrame timeFrame = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsTimeFrame(timeFrame, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                timeFrame = new EarningsTimeFrame.TimeFrame.YearMonth((EarningsYearMonth) EarningsYearMonth.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                timeFrame = new EarningsTimeFrame.TimeFrame.YearToDate((EarningsYearToDate) EarningsYearToDate.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsTimeFrame earningsTimeFrame = (EarningsTimeFrame) obj;
        reverseProtoWriter.getClass();
        earningsTimeFrame.getClass();
        reverseProtoWriter.writeBytes(earningsTimeFrame.unknownFields());
        EarningsTimeFrame.TimeFrame timeFrame = earningsTimeFrame.time_frame;
        if (timeFrame instanceof EarningsTimeFrame.TimeFrame.YearMonth) {
            EarningsYearMonth.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((EarningsTimeFrame.TimeFrame.YearMonth) timeFrame).value);
        } else if (timeFrame instanceof EarningsTimeFrame.TimeFrame.YearToDate) {
            EarningsYearToDate.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((EarningsTimeFrame.TimeFrame.YearToDate) timeFrame).value);
        } else {
            if (timeFrame == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        EarningsTimeFrame earningsTimeFrame = (EarningsTimeFrame) obj;
        earningsTimeFrame.getClass();
        int size$okio = earningsTimeFrame.unknownFields().getSize$okio();
        EarningsTimeFrame.TimeFrame timeFrame = earningsTimeFrame.time_frame;
        if (timeFrame instanceof EarningsTimeFrame.TimeFrame.YearMonth) {
            encodedSizeWithTag = EarningsYearMonth.ADAPTER.encodedSizeWithTag(1, ((EarningsTimeFrame.TimeFrame.YearMonth) timeFrame).value);
        } else {
            if (!(timeFrame instanceof EarningsTimeFrame.TimeFrame.YearToDate)) {
                if (timeFrame == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = EarningsYearToDate.ADAPTER.encodedSizeWithTag(2, ((EarningsTimeFrame.TimeFrame.YearToDate) timeFrame).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsTimeFrame earningsTimeFrame = (EarningsTimeFrame) obj;
        earningsTimeFrame.getClass();
        ByteString byteString = ByteString.EMPTY;
        EarningsTimeFrame.TimeFrame timeFrame = earningsTimeFrame.time_frame;
        byteString.getClass();
        return new EarningsTimeFrame(timeFrame, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsTimeFrame earningsTimeFrame = (EarningsTimeFrame) obj;
        earningsTimeFrame.getClass();
        EarningsTimeFrame.TimeFrame timeFrame = earningsTimeFrame.time_frame;
        if (timeFrame instanceof EarningsTimeFrame.TimeFrame.YearMonth) {
            EarningsYearMonth.ADAPTER.encodeWithTag(protoWriter, 1, ((EarningsTimeFrame.TimeFrame.YearMonth) timeFrame).value);
        } else if (timeFrame instanceof EarningsTimeFrame.TimeFrame.YearToDate) {
            EarningsYearToDate.ADAPTER.encodeWithTag(protoWriter, 2, ((EarningsTimeFrame.TimeFrame.YearToDate) timeFrame).value);
        } else if (timeFrame != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(earningsTimeFrame.unknownFields());
    }
}
