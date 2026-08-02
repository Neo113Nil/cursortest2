package com.squareup.protos.cash.taply.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.taply.app.v1.SuccessScreen;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SuccessScreen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SuccessScreen((String) obj, (String) obj2, (String) obj3, (BookletTile) obj4, m, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(BookletTile.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    m.add(SuccessScreen.Card.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SuccessScreen successScreen = (SuccessScreen) obj;
        reverseProtoWriter.getClass();
        successScreen.getClass();
        reverseProtoWriter.writeBytes(successScreen.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, successScreen.disclosure_text);
        SuccessScreen.Card.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, successScreen.cards);
        BookletTile.ADAPTER.encodeWithTag(reverseProtoWriter, 4, successScreen.tiles);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, successScreen.button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, successScreen.standard_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, successScreen.highlighted_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SuccessScreen successScreen = (SuccessScreen) obj;
        successScreen.getClass();
        int size$okio = successScreen.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, successScreen.disclosure_text) + SuccessScreen.Card.ADAPTER.asRepeated().encodedSizeWithTag(5, successScreen.cards) + BookletTile.ADAPTER.encodedSizeWithTag(4, successScreen.tiles) + protoAdapter.encodedSizeWithTag(3, successScreen.button_text) + protoAdapter.encodedSizeWithTag(2, successScreen.standard_title) + protoAdapter.encodedSizeWithTag(1, successScreen.highlighted_title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SuccessScreen successScreen = (SuccessScreen) obj;
        successScreen.getClass();
        BookletTile bookletTile = successScreen.tiles;
        BookletTile bookletTile2 = bookletTile != null ? (BookletTile) BookletTile.ADAPTER.redact(bookletTile) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(successScreen.cards, SuccessScreen.Card.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = successScreen.highlighted_title;
        String str2 = successScreen.standard_title;
        String str3 = successScreen.button_text;
        String str4 = successScreen.disclosure_text;
        byteString.getClass();
        return new SuccessScreen(str, str2, str3, bookletTile2, m1169redactElements, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SuccessScreen successScreen = (SuccessScreen) obj;
        successScreen.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, successScreen.highlighted_title);
        protoAdapter.encodeWithTag(protoWriter, 2, successScreen.standard_title);
        protoAdapter.encodeWithTag(protoWriter, 3, successScreen.button_text);
        BookletTile.ADAPTER.encodeWithTag(protoWriter, 4, successScreen.tiles);
        SuccessScreen.Card.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, successScreen.cards);
        protoAdapter.encodeWithTag(protoWriter, 6, successScreen.disclosure_text);
        protoWriter.writeBytes(successScreen.unknownFields());
    }
}
