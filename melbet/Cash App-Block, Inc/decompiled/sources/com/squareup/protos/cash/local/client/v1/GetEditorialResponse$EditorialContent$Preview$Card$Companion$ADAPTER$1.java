package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$Preview$Card$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEditorialResponse.EditorialContent.Preview.Card((LocalImage) obj, m, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(GetEditorialResponse.EditorialContent.Text.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Preview.Card card = (GetEditorialResponse.EditorialContent.Preview.Card) obj;
        reverseProtoWriter.getClass();
        card.getClass();
        reverseProtoWriter.writeBytes(card.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, card.client_route_url);
        GetEditorialResponse.EditorialContent.Text.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, card.texts);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, card.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEditorialResponse.EditorialContent.Preview.Card card = (GetEditorialResponse.EditorialContent.Preview.Card) obj;
        card.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, card.client_route_url) + GetEditorialResponse.EditorialContent.Text.ADAPTER.asRepeated().encodedSizeWithTag(2, card.texts) + LocalImage.ADAPTER.encodedSizeWithTag(1, card.image) + card.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse.EditorialContent.Preview.Card card = (GetEditorialResponse.EditorialContent.Preview.Card) obj;
        card.getClass();
        LocalImage localImage = card.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(card.texts, GetEditorialResponse.EditorialContent.Text.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = card.client_route_url;
        byteString.getClass();
        return new GetEditorialResponse.EditorialContent.Preview.Card(localImage2, m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Preview.Card card = (GetEditorialResponse.EditorialContent.Preview.Card) obj;
        card.getClass();
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 1, card.image);
        GetEditorialResponse.EditorialContent.Text.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, card.texts);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, card.client_route_url);
        protoWriter.writeBytes(card.unknownFields());
    }
}
