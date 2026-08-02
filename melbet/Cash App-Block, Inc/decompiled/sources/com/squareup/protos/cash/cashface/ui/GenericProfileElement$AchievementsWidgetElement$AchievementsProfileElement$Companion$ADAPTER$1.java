package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$AchievementsWidgetElement$AchievementsProfileElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement((Image) obj, (String) obj2, (String) obj3, (GenericProfileElement.ProgressMeterElement) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(GenericProfileElement.ProgressMeterElement.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement achievementsProfileElement = (GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement) obj;
        reverseProtoWriter.getClass();
        achievementsProfileElement.getClass();
        reverseProtoWriter.writeBytes(achievementsProfileElement.unknownFields());
        GenericProfileElement.ProgressMeterElement.ADAPTER.encodeWithTag(reverseProtoWriter, 4, achievementsProfileElement.progress_meter_element);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, achievementsProfileElement.client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, achievementsProfileElement.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, achievementsProfileElement.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement achievementsProfileElement = (GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement) obj;
        achievementsProfileElement.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, achievementsProfileElement.icon) + achievementsProfileElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return GenericProfileElement.ProgressMeterElement.ADAPTER.encodedSizeWithTag(4, achievementsProfileElement.progress_meter_element) + protoAdapter.encodedSizeWithTag(3, achievementsProfileElement.client_route) + protoAdapter.encodedSizeWithTag(2, achievementsProfileElement.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement achievementsProfileElement = (GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement) obj;
        achievementsProfileElement.getClass();
        Image image = achievementsProfileElement.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        GenericProfileElement.ProgressMeterElement progressMeterElement = achievementsProfileElement.progress_meter_element;
        GenericProfileElement.ProgressMeterElement progressMeterElement2 = progressMeterElement != null ? (GenericProfileElement.ProgressMeterElement) GenericProfileElement.ProgressMeterElement.ADAPTER.redact(progressMeterElement) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = achievementsProfileElement.client_route;
        byteString.getClass();
        return new GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement(image2, null, str, progressMeterElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement achievementsProfileElement = (GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement) obj;
        achievementsProfileElement.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, achievementsProfileElement.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, achievementsProfileElement.title);
        protoAdapter.encodeWithTag(protoWriter, 3, achievementsProfileElement.client_route);
        GenericProfileElement.ProgressMeterElement.ADAPTER.encodeWithTag(protoWriter, 4, achievementsProfileElement.progress_meter_element);
        protoWriter.writeBytes(achievementsProfileElement.unknownFields());
    }
}
