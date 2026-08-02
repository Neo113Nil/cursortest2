package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Loan$DetailRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Loan.DetailRow((String) obj, (LocalizableString) obj3, (String) obj2, (LocalizableString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Loan.DetailRow detailRow = (Loan.DetailRow) obj;
        reverseProtoWriter.getClass();
        detailRow.getClass();
        reverseProtoWriter.writeBytes(detailRow.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, detailRow.localizable_value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, detailRow.localizable_label);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, detailRow.value);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, detailRow.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Loan.DetailRow detailRow = (Loan.DetailRow) obj;
        detailRow.getClass();
        int size$okio = detailRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, detailRow.value) + protoAdapter.encodedSizeWithTag(1, detailRow.label) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, detailRow.localizable_value) + protoAdapter2.encodedSizeWithTag(3, detailRow.localizable_label) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Loan.DetailRow detailRow = (Loan.DetailRow) obj;
        detailRow.getClass();
        LocalizableString localizableString = detailRow.localizable_label;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = detailRow.localizable_value;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = detailRow.label;
        String str2 = detailRow.value;
        byteString.getClass();
        return new Loan.DetailRow(str, localizableString2, str2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Loan.DetailRow detailRow = (Loan.DetailRow) obj;
        detailRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, detailRow.label);
        protoAdapter.encodeWithTag(protoWriter, 2, detailRow.value);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, detailRow.localizable_label);
        protoAdapter2.encodeWithTag(protoWriter, 4, detailRow.localizable_value);
        protoWriter.writeBytes(detailRow.unknownFields());
    }
}
