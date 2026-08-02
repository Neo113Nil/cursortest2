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
public final class BorrowLimitHubData$IncreaseLimitActionsSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowLimitHubData.IncreaseLimitActionsSection((LocalizedString) obj, (LocalizedString) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowLimitHubData.IncreaseLimitActionsSection increaseLimitActionsSection = (BorrowLimitHubData.IncreaseLimitActionsSection) obj;
        reverseProtoWriter.getClass();
        increaseLimitActionsSection.getClass();
        reverseProtoWriter.writeBytes(increaseLimitActionsSection.unknownFields());
        BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, increaseLimitActionsSection.cta_bullets);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, increaseLimitActionsSection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, increaseLimitActionsSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowLimitHubData.IncreaseLimitActionsSection increaseLimitActionsSection = (BorrowLimitHubData.IncreaseLimitActionsSection) obj;
        increaseLimitActionsSection.getClass();
        int size$okio = increaseLimitActionsSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet.ADAPTER.asRepeated().encodedSizeWithTag(3, increaseLimitActionsSection.cta_bullets) + protoAdapter.encodedSizeWithTag(2, increaseLimitActionsSection.subtitle) + protoAdapter.encodedSizeWithTag(1, increaseLimitActionsSection.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowLimitHubData.IncreaseLimitActionsSection increaseLimitActionsSection = (BorrowLimitHubData.IncreaseLimitActionsSection) obj;
        increaseLimitActionsSection.getClass();
        LocalizedString localizedString = increaseLimitActionsSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = increaseLimitActionsSection.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(increaseLimitActionsSection.cta_bullets, BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowLimitHubData.IncreaseLimitActionsSection(localizedString2, localizedString4, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowLimitHubData.IncreaseLimitActionsSection increaseLimitActionsSection = (BorrowLimitHubData.IncreaseLimitActionsSection) obj;
        increaseLimitActionsSection.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, increaseLimitActionsSection.title);
        protoAdapter.encodeWithTag(protoWriter, 2, increaseLimitActionsSection.subtitle);
        BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, increaseLimitActionsSection.cta_bullets);
        protoWriter.writeBytes(increaseLimitActionsSection.unknownFields());
    }
}
