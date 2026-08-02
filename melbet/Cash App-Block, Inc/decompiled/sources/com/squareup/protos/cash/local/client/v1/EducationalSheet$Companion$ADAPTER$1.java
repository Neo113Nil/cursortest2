package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EducationalSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EducationalSheet(m, arrayList, (String) obj, (Boolean) obj2, (EducationalSheetButton) obj3, (String) obj4, (Boolean) obj5, (EducationalSheetButton) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(EducationalSheetContent.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    arrayList.add(EducationalSheetContent.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(EducationalSheetButton.ADAPTER, protoReader, obj3);
                    break;
                case 6:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(EducationalSheetButton.ADAPTER, protoReader, obj6);
                    break;
                case 9:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EducationalSheet educationalSheet = (EducationalSheet) obj;
        reverseProtoWriter.getClass();
        educationalSheet.getClass();
        reverseProtoWriter.writeBytes(educationalSheet.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, educationalSheet.should_force_full_height_layout);
        ProtoAdapter protoAdapter2 = EducationalSheetButton.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, educationalSheet.dismiss_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, educationalSheet.show_page_progress);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, educationalSheet.token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, educationalSheet.primary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, educationalSheet.requires_full_scroll);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, educationalSheet.expand_nudge_text);
        ProtoAdapter protoAdapter4 = EducationalSheetContent.ADAPTER;
        protoAdapter4.asRepeated().encodeWithTag(reverseProtoWriter, 2, educationalSheet.expanded_contents);
        protoAdapter4.asRepeated().encodeWithTag(reverseProtoWriter, 1, educationalSheet.half_sheet_contents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EducationalSheet educationalSheet = (EducationalSheet) obj;
        educationalSheet.getClass();
        int size$okio = educationalSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = EducationalSheetContent.ADAPTER;
        int encodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(2, educationalSheet.expanded_contents) + protoAdapter.asRepeated().encodedSizeWithTag(1, educationalSheet.half_sheet_contents) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, educationalSheet.expand_nudge_text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(4, educationalSheet.requires_full_scroll) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter4 = EducationalSheetButton.ADAPTER;
        return protoAdapter3.encodedSizeWithTag(9, educationalSheet.should_force_full_height_layout) + protoAdapter4.encodedSizeWithTag(8, educationalSheet.dismiss_button) + protoAdapter3.encodedSizeWithTag(7, educationalSheet.show_page_progress) + protoAdapter2.encodedSizeWithTag(6, educationalSheet.token) + protoAdapter4.encodedSizeWithTag(5, educationalSheet.primary_button) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EducationalSheet educationalSheet = (EducationalSheet) obj;
        educationalSheet.getClass();
        List list = educationalSheet.half_sheet_contents;
        ProtoAdapter protoAdapter = EducationalSheetContent.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(educationalSheet.expanded_contents, protoAdapter);
        EducationalSheetButton educationalSheetButton = educationalSheet.primary_button;
        EducationalSheetButton educationalSheetButton2 = educationalSheetButton != null ? (EducationalSheetButton) EducationalSheetButton.ADAPTER.redact(educationalSheetButton) : null;
        EducationalSheetButton educationalSheetButton3 = educationalSheet.dismiss_button;
        EducationalSheetButton educationalSheetButton4 = educationalSheetButton3 != null ? (EducationalSheetButton) EducationalSheetButton.ADAPTER.redact(educationalSheetButton3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = educationalSheet.expand_nudge_text;
        Boolean bool = educationalSheet.requires_full_scroll;
        String str2 = educationalSheet.token;
        Boolean bool2 = educationalSheet.show_page_progress;
        Boolean bool3 = educationalSheet.should_force_full_height_layout;
        byteString.getClass();
        return new EducationalSheet(m1169redactElements, m1169redactElements2, str, bool, educationalSheetButton2, str2, bool2, educationalSheetButton4, bool3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EducationalSheet educationalSheet = (EducationalSheet) obj;
        educationalSheet.getClass();
        ProtoAdapter protoAdapter = EducationalSheetContent.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, educationalSheet.half_sheet_contents);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, educationalSheet.expanded_contents);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, educationalSheet.expand_nudge_text);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 4, educationalSheet.requires_full_scroll);
        ProtoAdapter protoAdapter4 = EducationalSheetButton.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 5, educationalSheet.primary_button);
        protoAdapter2.encodeWithTag(protoWriter, 6, educationalSheet.token);
        protoAdapter3.encodeWithTag(protoWriter, 7, educationalSheet.show_page_progress);
        protoAdapter4.encodeWithTag(protoWriter, 8, educationalSheet.dismiss_button);
        protoAdapter3.encodeWithTag(protoWriter, 9, educationalSheet.should_force_full_height_layout);
        protoWriter.writeBytes(educationalSheet.unknownFields());
    }
}
