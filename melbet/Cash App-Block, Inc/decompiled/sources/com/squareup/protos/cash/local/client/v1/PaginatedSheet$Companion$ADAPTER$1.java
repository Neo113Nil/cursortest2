package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaginatedSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaginatedSheet(m, (EducationalSheetButton) obj, (EducationalSheetButton) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(EducationalSheetContent.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(EducationalSheetButton.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(EducationalSheetButton.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaginatedSheet paginatedSheet = (PaginatedSheet) obj;
        reverseProtoWriter.getClass();
        paginatedSheet.getClass();
        reverseProtoWriter.writeBytes(paginatedSheet.unknownFields());
        ProtoAdapter protoAdapter = EducationalSheetButton.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, paginatedSheet.dismiss_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paginatedSheet.primary_button);
        EducationalSheetContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, paginatedSheet.contents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaginatedSheet paginatedSheet = (PaginatedSheet) obj;
        paginatedSheet.getClass();
        int encodedSizeWithTag = EducationalSheetContent.ADAPTER.asRepeated().encodedSizeWithTag(1, paginatedSheet.contents) + paginatedSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = EducationalSheetButton.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, paginatedSheet.dismiss_button) + protoAdapter.encodedSizeWithTag(2, paginatedSheet.primary_button) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaginatedSheet paginatedSheet = (PaginatedSheet) obj;
        paginatedSheet.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paginatedSheet.contents, EducationalSheetContent.ADAPTER);
        EducationalSheetButton educationalSheetButton = paginatedSheet.primary_button;
        EducationalSheetButton educationalSheetButton2 = educationalSheetButton != null ? (EducationalSheetButton) EducationalSheetButton.ADAPTER.redact(educationalSheetButton) : null;
        EducationalSheetButton educationalSheetButton3 = paginatedSheet.dismiss_button;
        EducationalSheetButton educationalSheetButton4 = educationalSheetButton3 != null ? (EducationalSheetButton) EducationalSheetButton.ADAPTER.redact(educationalSheetButton3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaginatedSheet(m1169redactElements, educationalSheetButton2, educationalSheetButton4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaginatedSheet paginatedSheet = (PaginatedSheet) obj;
        paginatedSheet.getClass();
        EducationalSheetContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, paginatedSheet.contents);
        ProtoAdapter protoAdapter = EducationalSheetButton.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, paginatedSheet.primary_button);
        protoAdapter.encodeWithTag(protoWriter, 3, paginatedSheet.dismiss_button);
        protoWriter.writeBytes(paginatedSheet.unknownFields());
    }
}
