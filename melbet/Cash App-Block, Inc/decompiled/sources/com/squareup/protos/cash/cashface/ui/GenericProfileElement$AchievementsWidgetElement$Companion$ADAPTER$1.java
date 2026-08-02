package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$AchievementsWidgetElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.AchievementsWidgetElement((String) obj, (String) obj2, (String) obj3, m, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 5) {
                m.add(GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement.ADAPTER.decode(protoReader));
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.AchievementsWidgetElement achievementsWidgetElement = (GenericProfileElement.AchievementsWidgetElement) obj;
        reverseProtoWriter.getClass();
        achievementsWidgetElement.getClass();
        reverseProtoWriter.writeBytes(achievementsWidgetElement.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, achievementsWidgetElement.number_of_elements_shown);
        GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, achievementsWidgetElement.subelements);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, achievementsWidgetElement.button_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, achievementsWidgetElement.button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, achievementsWidgetElement.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.AchievementsWidgetElement achievementsWidgetElement = (GenericProfileElement.AchievementsWidgetElement) obj;
        achievementsWidgetElement.getClass();
        int size$okio = achievementsWidgetElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(6, achievementsWidgetElement.number_of_elements_shown) + GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement.ADAPTER.asRepeated().encodedSizeWithTag(5, achievementsWidgetElement.subelements) + protoAdapter.encodedSizeWithTag(3, achievementsWidgetElement.button_client_route) + protoAdapter.encodedSizeWithTag(2, achievementsWidgetElement.button_text) + protoAdapter.encodedSizeWithTag(1, achievementsWidgetElement.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.AchievementsWidgetElement achievementsWidgetElement = (GenericProfileElement.AchievementsWidgetElement) obj;
        achievementsWidgetElement.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(achievementsWidgetElement.subelements, GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = achievementsWidgetElement.title;
        String str2 = achievementsWidgetElement.button_text;
        String str3 = achievementsWidgetElement.button_client_route;
        Long l = achievementsWidgetElement.number_of_elements_shown;
        byteString.getClass();
        return new GenericProfileElement.AchievementsWidgetElement(str, str2, str3, m1169redactElements, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.AchievementsWidgetElement achievementsWidgetElement = (GenericProfileElement.AchievementsWidgetElement) obj;
        achievementsWidgetElement.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, achievementsWidgetElement.title);
        protoAdapter.encodeWithTag(protoWriter, 2, achievementsWidgetElement.button_text);
        protoAdapter.encodeWithTag(protoWriter, 3, achievementsWidgetElement.button_client_route);
        GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, achievementsWidgetElement.subelements);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, achievementsWidgetElement.number_of_elements_shown);
        protoWriter.writeBytes(achievementsWidgetElement.unknownFields());
    }
}
