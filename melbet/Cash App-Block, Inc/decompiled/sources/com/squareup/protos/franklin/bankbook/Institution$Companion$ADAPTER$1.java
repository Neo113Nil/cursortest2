package com.squareup.protos.franklin.bankbook;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Institution$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Institution((String) obj, (Institution.DisplayInformation) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Institution.DisplayInformation.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(Institution.BankbookMenuItem.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Institution institution = (Institution) obj;
        reverseProtoWriter.getClass();
        institution.getClass();
        reverseProtoWriter.writeBytes(institution.unknownFields());
        Institution.BankbookMenuItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, institution.help_menu_items);
        Institution.DisplayInformation.ADAPTER.encodeWithTag(reverseProtoWriter, 2, institution.display_info);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, institution.institution_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Institution institution = (Institution) obj;
        institution.getClass();
        return Institution.BankbookMenuItem.ADAPTER.asRepeated().encodedSizeWithTag(3, institution.help_menu_items) + Institution.DisplayInformation.ADAPTER.encodedSizeWithTag(2, institution.display_info) + ProtoAdapter.STRING.encodedSizeWithTag(1, institution.institution_token) + institution.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Institution institution = (Institution) obj;
        institution.getClass();
        Institution.DisplayInformation displayInformation = institution.display_info;
        Institution.DisplayInformation displayInformation2 = displayInformation != null ? (Institution.DisplayInformation) Institution.DisplayInformation.ADAPTER.redact(displayInformation) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(institution.help_menu_items, Institution.BankbookMenuItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = institution.institution_token;
        byteString.getClass();
        return new Institution(str, displayInformation2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Institution institution = (Institution) obj;
        institution.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, institution.institution_token);
        Institution.DisplayInformation.ADAPTER.encodeWithTag(protoWriter, 2, institution.display_info);
        Institution.BankbookMenuItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, institution.help_menu_items);
        protoWriter.writeBytes(institution.unknownFields());
    }
}
