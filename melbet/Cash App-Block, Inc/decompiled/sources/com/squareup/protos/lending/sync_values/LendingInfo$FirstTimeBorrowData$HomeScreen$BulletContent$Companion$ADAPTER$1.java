package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent(m, (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData) obj, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(LocalizableString.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent bulletContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent) obj;
        reverseProtoWriter.getClass();
        bulletContent.getClass();
        reverseProtoWriter.writeBytes(bulletContent.unknownFields());
        LocalizableString.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, bulletContent.localizable_bullets);
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, bulletContent.support_data);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, bulletContent.bullets);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent bulletContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent) obj;
        bulletContent.getClass();
        return LocalizableString.ADAPTER.asRepeated().encodedSizeWithTag(3, bulletContent.localizable_bullets) + LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData.ADAPTER.encodedSizeWithTag(2, bulletContent.support_data) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, bulletContent.bullets) + bulletContent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent bulletContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent) obj;
        bulletContent.getClass();
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData supportData = bulletContent.support_data;
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData supportData2 = supportData != null ? (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData) LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData.ADAPTER.redact(supportData) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(bulletContent.localizable_bullets, LocalizableString.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        List list = bulletContent.bullets;
        list.getClass();
        byteString.getClass();
        return new LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent(list, supportData2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent bulletContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent) obj;
        bulletContent.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, bulletContent.bullets);
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData.ADAPTER.encodeWithTag(protoWriter, 2, bulletContent.support_data);
        LocalizableString.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, bulletContent.localizable_bullets);
        protoWriter.writeBytes(bulletContent.unknownFields());
    }
}
