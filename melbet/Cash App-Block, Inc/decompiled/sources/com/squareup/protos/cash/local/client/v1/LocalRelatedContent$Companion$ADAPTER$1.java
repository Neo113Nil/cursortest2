package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalRelatedContent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalRelatedContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalRelatedContent((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(LocalRelatedContent.Item.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalRelatedContent localRelatedContent = (LocalRelatedContent) obj;
        reverseProtoWriter.getClass();
        localRelatedContent.getClass();
        reverseProtoWriter.writeBytes(localRelatedContent.unknownFields());
        LocalRelatedContent.Item.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, localRelatedContent.items);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, localRelatedContent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalRelatedContent localRelatedContent = (LocalRelatedContent) obj;
        localRelatedContent.getClass();
        return LocalRelatedContent.Item.ADAPTER.asRepeated().encodedSizeWithTag(2, localRelatedContent.items) + ProtoAdapter.STRING.encodedSizeWithTag(1, localRelatedContent.title) + localRelatedContent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalRelatedContent localRelatedContent = (LocalRelatedContent) obj;
        localRelatedContent.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localRelatedContent.items, LocalRelatedContent.Item.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = localRelatedContent.title;
        byteString.getClass();
        return new LocalRelatedContent(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalRelatedContent localRelatedContent = (LocalRelatedContent) obj;
        localRelatedContent.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, localRelatedContent.title);
        LocalRelatedContent.Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, localRelatedContent.items);
        protoWriter.writeBytes(localRelatedContent.unknownFields());
    }
}
