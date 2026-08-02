package com.squareup.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$Visualization$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.Visualization((Float) obj, (Float) obj2, m, (CashCreditScoreHomeData.Visualization.ScoreLock) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.FLOAT.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.FLOAT.decode(protoReader));
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.Visualization.ScoreLock.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.FLOAT.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.Visualization visualization = (CashCreditScoreHomeData.Visualization) obj;
        reverseProtoWriter.getClass();
        visualization.getClass();
        reverseProtoWriter.writeBytes(visualization.unknownFields());
        CashCreditScoreHomeData.Visualization.ScoreLock.ADAPTER.encodeWithTag(reverseProtoWriter, 3, visualization.score_lock);
        ProtoAdapter protoAdapter = ProtoAdapter.FLOAT;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, visualization.dot_fraction);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, visualization.previous_fill_fraction);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, visualization.fill_fraction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.Visualization visualization = (CashCreditScoreHomeData.Visualization) obj;
        visualization.getClass();
        int size$okio = visualization.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.FLOAT;
        return CashCreditScoreHomeData.Visualization.ScoreLock.ADAPTER.encodedSizeWithTag(3, visualization.score_lock) + protoAdapter.asRepeated().encodedSizeWithTag(2, visualization.dot_fraction) + protoAdapter.encodedSizeWithTag(4, visualization.previous_fill_fraction) + protoAdapter.encodedSizeWithTag(1, visualization.fill_fraction) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.Visualization visualization = (CashCreditScoreHomeData.Visualization) obj;
        visualization.getClass();
        CashCreditScoreHomeData.Visualization.ScoreLock scoreLock = visualization.score_lock;
        CashCreditScoreHomeData.Visualization.ScoreLock scoreLock2 = scoreLock != null ? (CashCreditScoreHomeData.Visualization.ScoreLock) CashCreditScoreHomeData.Visualization.ScoreLock.ADAPTER.redact(scoreLock) : null;
        ByteString byteString = ByteString.EMPTY;
        Float f = visualization.fill_fraction;
        Float f2 = visualization.previous_fill_fraction;
        List list = visualization.dot_fraction;
        list.getClass();
        byteString.getClass();
        return new CashCreditScoreHomeData.Visualization(f, f2, list, scoreLock2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.Visualization visualization = (CashCreditScoreHomeData.Visualization) obj;
        visualization.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.FLOAT;
        protoAdapter.encodeWithTag(protoWriter, 1, visualization.fill_fraction);
        protoAdapter.encodeWithTag(protoWriter, 4, visualization.previous_fill_fraction);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, visualization.dot_fraction);
        CashCreditScoreHomeData.Visualization.ScoreLock.ADAPTER.encodeWithTag(protoWriter, 3, visualization.score_lock);
        protoWriter.writeBytes(visualization.unknownFields());
    }
}
