package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$InfoSection$Callout$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.InfoSection.Callout((CashCreditScoreHomeData.Action) obj, (CashCreditScoreHomeData.Graphic) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.Action.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.Graphic.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.InfoSection.Callout callout = (CashCreditScoreHomeData.InfoSection.Callout) obj;
        reverseProtoWriter.getClass();
        callout.getClass();
        reverseProtoWriter.writeBytes(callout.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, callout.title);
        CashCreditScoreHomeData.Graphic.ADAPTER.encodeWithTag(reverseProtoWriter, 2, callout.graphic);
        CashCreditScoreHomeData.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 1, callout.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.InfoSection.Callout callout = (CashCreditScoreHomeData.InfoSection.Callout) obj;
        callout.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(3, callout.title) + CashCreditScoreHomeData.Graphic.ADAPTER.encodedSizeWithTag(2, callout.graphic) + CashCreditScoreHomeData.Action.ADAPTER.encodedSizeWithTag(1, callout.action) + callout.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.InfoSection.Callout callout = (CashCreditScoreHomeData.InfoSection.Callout) obj;
        callout.getClass();
        CashCreditScoreHomeData.Action action = callout.action;
        CashCreditScoreHomeData.Action action2 = action != null ? (CashCreditScoreHomeData.Action) CashCreditScoreHomeData.Action.ADAPTER.redact(action) : null;
        CashCreditScoreHomeData.Graphic graphic = callout.graphic;
        CashCreditScoreHomeData.Graphic graphic2 = graphic != null ? (CashCreditScoreHomeData.Graphic) CashCreditScoreHomeData.Graphic.ADAPTER.redact(graphic) : null;
        LocalizedString localizedString = callout.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreHomeData.InfoSection.Callout(action2, graphic2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.InfoSection.Callout callout = (CashCreditScoreHomeData.InfoSection.Callout) obj;
        callout.getClass();
        CashCreditScoreHomeData.Action.ADAPTER.encodeWithTag(protoWriter, 1, callout.action);
        CashCreditScoreHomeData.Graphic.ADAPTER.encodeWithTag(protoWriter, 2, callout.graphic);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, callout.title);
        protoWriter.writeBytes(callout.unknownFields());
    }
}
