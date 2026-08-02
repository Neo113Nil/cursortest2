package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreEntryPointData$InstalledState$Subtitle$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashCreditScoreEntryPointData.InstalledState.Subtitle((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Subtitle subtitle = (CashCreditScoreEntryPointData.InstalledState.Subtitle) obj;
        reverseProtoWriter.getClass();
        subtitle.getClass();
        reverseProtoWriter.writeBytes(subtitle.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, subtitle.accessibility_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, subtitle.brief);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, subtitle.emphasis);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Subtitle subtitle = (CashCreditScoreEntryPointData.InstalledState.Subtitle) obj;
        subtitle.getClass();
        int size$okio = subtitle.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, subtitle.accessibility_description) + protoAdapter.encodedSizeWithTag(2, subtitle.brief) + protoAdapter.encodedSizeWithTag(1, subtitle.emphasis) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Subtitle subtitle = (CashCreditScoreEntryPointData.InstalledState.Subtitle) obj;
        subtitle.getClass();
        LocalizedString localizedString = subtitle.emphasis;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = subtitle.brief;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = subtitle.accessibility_description;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreEntryPointData.InstalledState.Subtitle(localizedString2, localizedString4, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Subtitle subtitle = (CashCreditScoreEntryPointData.InstalledState.Subtitle) obj;
        subtitle.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, subtitle.emphasis);
        protoAdapter.encodeWithTag(protoWriter, 2, subtitle.brief);
        protoAdapter.encodeWithTag(protoWriter, 3, subtitle.accessibility_description);
        protoWriter.writeBytes(subtitle.unknownFields());
    }
}
