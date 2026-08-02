package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SafetyEducationHub$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SafetyEducationHub((LocalizedString) obj, m, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(ColoredString.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                arrayList.add(SafetyEducationHubTile.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList2.add(SafetyEducationPage.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SafetyEducationHub safetyEducationHub = (SafetyEducationHub) obj;
        reverseProtoWriter.getClass();
        safetyEducationHub.getClass();
        reverseProtoWriter.writeBytes(safetyEducationHub.unknownFields());
        SafetyEducationPage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, safetyEducationHub.pages);
        SafetyEducationHubTile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, safetyEducationHub.tiles);
        ColoredString.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, safetyEducationHub.colored_title_segments);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, safetyEducationHub.navigation_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SafetyEducationHub safetyEducationHub = (SafetyEducationHub) obj;
        safetyEducationHub.getClass();
        return SafetyEducationPage.ADAPTER.asRepeated().encodedSizeWithTag(4, safetyEducationHub.pages) + SafetyEducationHubTile.ADAPTER.asRepeated().encodedSizeWithTag(3, safetyEducationHub.tiles) + ColoredString.ADAPTER.asRepeated().encodedSizeWithTag(2, safetyEducationHub.colored_title_segments) + LocalizedString.ADAPTER.encodedSizeWithTag(1, safetyEducationHub.navigation_title) + safetyEducationHub.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SafetyEducationHub safetyEducationHub = (SafetyEducationHub) obj;
        safetyEducationHub.getClass();
        LocalizedString localizedString = safetyEducationHub.navigation_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(safetyEducationHub.colored_title_segments, ColoredString.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(safetyEducationHub.tiles, SafetyEducationHubTile.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(safetyEducationHub.pages, SafetyEducationPage.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SafetyEducationHub(localizedString2, m1169redactElements, m1169redactElements2, m1169redactElements3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SafetyEducationHub safetyEducationHub = (SafetyEducationHub) obj;
        safetyEducationHub.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, safetyEducationHub.navigation_title);
        ColoredString.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, safetyEducationHub.colored_title_segments);
        SafetyEducationHubTile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, safetyEducationHub.tiles);
        SafetyEducationPage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, safetyEducationHub.pages);
        protoWriter.writeBytes(safetyEducationHub.unknownFields());
    }
}
