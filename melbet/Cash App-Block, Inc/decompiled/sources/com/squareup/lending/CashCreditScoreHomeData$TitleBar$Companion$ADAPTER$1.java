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
public final class CashCreditScoreHomeData$TitleBar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.TitleBar((LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.TitleBar titleBar = (CashCreditScoreHomeData.TitleBar) obj;
        reverseProtoWriter.getClass();
        titleBar.getClass();
        reverseProtoWriter.writeBytes(titleBar.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, titleBar.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.TitleBar titleBar = (CashCreditScoreHomeData.TitleBar) obj;
        titleBar.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(1, titleBar.title) + titleBar.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.TitleBar titleBar = (CashCreditScoreHomeData.TitleBar) obj;
        titleBar.getClass();
        LocalizedString localizedString = titleBar.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreHomeData.TitleBar(localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.TitleBar titleBar = (CashCreditScoreHomeData.TitleBar) obj;
        titleBar.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, titleBar.title);
        protoWriter.writeBytes(titleBar.unknownFields());
    }
}
