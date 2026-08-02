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
public final class BulletPoints$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BulletPoints(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        BulletPoints bulletPoints = (BulletPoints) obj;
        reverseProtoWriter.getClass();
        bulletPoints.getClass();
        reverseProtoWriter.writeBytes(bulletPoints.unknownFields());
        LocalizedString.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, bulletPoints.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BulletPoints bulletPoints = (BulletPoints) obj;
        bulletPoints.getClass();
        return LocalizedString.ADAPTER.asRepeated().encodedSizeWithTag(1, bulletPoints.text) + bulletPoints.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BulletPoints bulletPoints = (BulletPoints) obj;
        bulletPoints.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(bulletPoints.text, LocalizedString.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BulletPoints(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BulletPoints bulletPoints = (BulletPoints) obj;
        bulletPoints.getClass();
        LocalizedString.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, bulletPoints.text);
        protoWriter.writeBytes(bulletPoints.unknownFields());
    }
}
