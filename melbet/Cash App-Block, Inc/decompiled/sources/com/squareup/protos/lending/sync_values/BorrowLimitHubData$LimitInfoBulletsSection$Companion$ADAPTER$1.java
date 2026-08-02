package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$LimitInfoBulletsSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowLimitHubData.LimitInfoBulletsSection((LocalizedString) obj, (LocalizedString) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(BorrowLimitHubData.LimitInfoBulletsSection.Bullet.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowLimitHubData.LimitInfoBulletsSection limitInfoBulletsSection = (BorrowLimitHubData.LimitInfoBulletsSection) obj;
        reverseProtoWriter.getClass();
        limitInfoBulletsSection.getClass();
        reverseProtoWriter.writeBytes(limitInfoBulletsSection.unknownFields());
        BorrowLimitHubData.LimitInfoBulletsSection.Bullet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, limitInfoBulletsSection.bullets);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, limitInfoBulletsSection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, limitInfoBulletsSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowLimitHubData.LimitInfoBulletsSection limitInfoBulletsSection = (BorrowLimitHubData.LimitInfoBulletsSection) obj;
        limitInfoBulletsSection.getClass();
        int size$okio = limitInfoBulletsSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return BorrowLimitHubData.LimitInfoBulletsSection.Bullet.ADAPTER.asRepeated().encodedSizeWithTag(3, limitInfoBulletsSection.bullets) + protoAdapter.encodedSizeWithTag(2, limitInfoBulletsSection.subtitle) + protoAdapter.encodedSizeWithTag(1, limitInfoBulletsSection.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowLimitHubData.LimitInfoBulletsSection limitInfoBulletsSection = (BorrowLimitHubData.LimitInfoBulletsSection) obj;
        limitInfoBulletsSection.getClass();
        LocalizedString localizedString = limitInfoBulletsSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = limitInfoBulletsSection.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(limitInfoBulletsSection.bullets, BorrowLimitHubData.LimitInfoBulletsSection.Bullet.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowLimitHubData.LimitInfoBulletsSection(localizedString2, localizedString4, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowLimitHubData.LimitInfoBulletsSection limitInfoBulletsSection = (BorrowLimitHubData.LimitInfoBulletsSection) obj;
        limitInfoBulletsSection.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, limitInfoBulletsSection.title);
        protoAdapter.encodeWithTag(protoWriter, 2, limitInfoBulletsSection.subtitle);
        BorrowLimitHubData.LimitInfoBulletsSection.Bullet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, limitInfoBulletsSection.bullets);
        protoWriter.writeBytes(limitInfoBulletsSection.unknownFields());
    }
}
