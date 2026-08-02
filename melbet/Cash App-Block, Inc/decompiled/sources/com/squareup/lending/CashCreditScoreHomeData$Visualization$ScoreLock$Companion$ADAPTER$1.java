package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$Visualization$ScoreLock$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.Visualization.ScoreLock((Float) obj, (LocalizedString) obj2, (Boolean) obj3, (Image) obj4, (LocalizedString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.FLOAT.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.Visualization.ScoreLock scoreLock = (CashCreditScoreHomeData.Visualization.ScoreLock) obj;
        reverseProtoWriter.getClass();
        scoreLock.getClass();
        reverseProtoWriter.writeBytes(scoreLock.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, scoreLock.unlock_celebration_text);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 4, scoreLock.image);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, scoreLock.show_unlock_celebration);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, scoreLock.text);
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 1, scoreLock.threshold);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.Visualization.ScoreLock scoreLock = (CashCreditScoreHomeData.Visualization.ScoreLock) obj;
        scoreLock.getClass();
        int encodedSizeWithTag = ProtoAdapter.FLOAT.encodedSizeWithTag(1, scoreLock.threshold) + scoreLock.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, scoreLock.unlock_celebration_text) + Image.ADAPTER.encodedSizeWithTag(4, scoreLock.image) + ProtoAdapter.BOOL.encodedSizeWithTag(3, scoreLock.show_unlock_celebration) + protoAdapter.encodedSizeWithTag(2, scoreLock.text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.Visualization.ScoreLock scoreLock = (CashCreditScoreHomeData.Visualization.ScoreLock) obj;
        scoreLock.getClass();
        LocalizedString localizedString = scoreLock.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Image image = scoreLock.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString3 = scoreLock.unlock_celebration_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        Float f = scoreLock.threshold;
        Boolean bool = scoreLock.show_unlock_celebration;
        byteString.getClass();
        return new CashCreditScoreHomeData.Visualization.ScoreLock(f, localizedString2, bool, image2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.Visualization.ScoreLock scoreLock = (CashCreditScoreHomeData.Visualization.ScoreLock) obj;
        scoreLock.getClass();
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, scoreLock.threshold);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, scoreLock.text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, scoreLock.show_unlock_celebration);
        Image.ADAPTER.encodeWithTag(protoWriter, 4, scoreLock.image);
        protoAdapter.encodeWithTag(protoWriter, 5, scoreLock.unlock_celebration_text);
        protoWriter.writeBytes(scoreLock.unknownFields());
    }
}
