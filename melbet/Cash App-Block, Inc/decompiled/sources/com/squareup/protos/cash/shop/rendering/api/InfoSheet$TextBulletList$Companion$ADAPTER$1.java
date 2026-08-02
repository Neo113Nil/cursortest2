package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InfoSheet$TextBulletList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InfoSheet.TextBulletList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalizedString.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InfoSheet.TextBulletList textBulletList = (InfoSheet.TextBulletList) obj;
        reverseProtoWriter.getClass();
        textBulletList.getClass();
        reverseProtoWriter.writeBytes(textBulletList.unknownFields());
        LocalizedString.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, textBulletList.text_bullet_list_item);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InfoSheet.TextBulletList textBulletList = (InfoSheet.TextBulletList) obj;
        textBulletList.getClass();
        return LocalizedString.ADAPTER.asRepeated().encodedSizeWithTag(1, textBulletList.text_bullet_list_item) + textBulletList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InfoSheet.TextBulletList textBulletList = (InfoSheet.TextBulletList) obj;
        textBulletList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(textBulletList.text_bullet_list_item, LocalizedString.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InfoSheet.TextBulletList(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InfoSheet.TextBulletList textBulletList = (InfoSheet.TextBulletList) obj;
        textBulletList.getClass();
        LocalizedString.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, textBulletList.text_bullet_list_item);
        protoWriter.writeBytes(textBulletList.unknownFields());
    }
}
