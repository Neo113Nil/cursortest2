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
public final class GetEditorialResponse$EditorialContent$Preview$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEditorialResponse.EditorialContent.Preview(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetEditorialResponse.EditorialContent.Preview.Card.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Preview preview = (GetEditorialResponse.EditorialContent.Preview) obj;
        reverseProtoWriter.getClass();
        preview.getClass();
        reverseProtoWriter.writeBytes(preview.unknownFields());
        GetEditorialResponse.EditorialContent.Preview.Card.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, preview.cards);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEditorialResponse.EditorialContent.Preview preview = (GetEditorialResponse.EditorialContent.Preview) obj;
        preview.getClass();
        return GetEditorialResponse.EditorialContent.Preview.Card.ADAPTER.asRepeated().encodedSizeWithTag(1, preview.cards) + preview.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse.EditorialContent.Preview preview = (GetEditorialResponse.EditorialContent.Preview) obj;
        preview.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(preview.cards, GetEditorialResponse.EditorialContent.Preview.Card.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetEditorialResponse.EditorialContent.Preview(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Preview preview = (GetEditorialResponse.EditorialContent.Preview) obj;
        preview.getClass();
        GetEditorialResponse.EditorialContent.Preview.Card.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, preview.cards);
        protoWriter.writeBytes(preview.unknownFields());
    }
}
