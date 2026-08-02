package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$AccessData$DetailRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LendingInfo.AccessData.DetailRow((LendingInfo.AccessData.DetailRow.Icon) obj, (String) obj2, (String) obj3, (LocalizableString) obj4, (LocalizableString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LendingInfo.AccessData.DetailRow.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.AccessData.DetailRow detailRow = (LendingInfo.AccessData.DetailRow) obj;
        reverseProtoWriter.getClass();
        detailRow.getClass();
        reverseProtoWriter.writeBytes(detailRow.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, detailRow.localizable_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, detailRow.localizable_title);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, detailRow.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, detailRow.title);
        LendingInfo.AccessData.DetailRow.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailRow.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.AccessData.DetailRow detailRow = (LendingInfo.AccessData.DetailRow) obj;
        detailRow.getClass();
        int encodedSizeWithTag = LendingInfo.AccessData.DetailRow.Icon.ADAPTER.encodedSizeWithTag(1, detailRow.icon) + detailRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, detailRow.subtitle) + protoAdapter.encodedSizeWithTag(2, detailRow.title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(5, detailRow.localizable_subtitle) + protoAdapter2.encodedSizeWithTag(4, detailRow.localizable_title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.AccessData.DetailRow detailRow = (LendingInfo.AccessData.DetailRow) obj;
        detailRow.getClass();
        LocalizableString localizableString = detailRow.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = detailRow.localizable_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        LendingInfo.AccessData.DetailRow.Icon icon = detailRow.icon;
        String str = detailRow.title;
        String str2 = detailRow.subtitle;
        byteString.getClass();
        return new LendingInfo.AccessData.DetailRow(icon, str, str2, localizableString2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.AccessData.DetailRow detailRow = (LendingInfo.AccessData.DetailRow) obj;
        detailRow.getClass();
        LendingInfo.AccessData.DetailRow.Icon.ADAPTER.encodeWithTag(protoWriter, 1, detailRow.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, detailRow.title);
        protoAdapter.encodeWithTag(protoWriter, 3, detailRow.subtitle);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, detailRow.localizable_title);
        protoAdapter2.encodeWithTag(protoWriter, 5, detailRow.localizable_subtitle);
        protoWriter.writeBytes(detailRow.unknownFields());
    }
}
