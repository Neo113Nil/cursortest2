package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SafetyEducationHubTile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SafetyEducationHubTile((String) obj, (BookletTile) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BookletTile.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SafetyEducationHubTile safetyEducationHubTile = (SafetyEducationHubTile) obj;
        reverseProtoWriter.getClass();
        safetyEducationHubTile.getClass();
        reverseProtoWriter.writeBytes(safetyEducationHubTile.unknownFields());
        BookletTile.ADAPTER.encodeWithTag(reverseProtoWriter, 2, safetyEducationHubTile.tile);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, safetyEducationHubTile.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SafetyEducationHubTile safetyEducationHubTile = (SafetyEducationHubTile) obj;
        safetyEducationHubTile.getClass();
        return BookletTile.ADAPTER.encodedSizeWithTag(2, safetyEducationHubTile.tile) + ProtoAdapter.STRING.encodedSizeWithTag(1, safetyEducationHubTile.id) + safetyEducationHubTile.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SafetyEducationHubTile safetyEducationHubTile = (SafetyEducationHubTile) obj;
        safetyEducationHubTile.getClass();
        BookletTile bookletTile = safetyEducationHubTile.tile;
        BookletTile bookletTile2 = bookletTile != null ? (BookletTile) BookletTile.ADAPTER.redact(bookletTile) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = safetyEducationHubTile.id;
        byteString.getClass();
        return new SafetyEducationHubTile(str, bookletTile2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SafetyEducationHubTile safetyEducationHubTile = (SafetyEducationHubTile) obj;
        safetyEducationHubTile.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, safetyEducationHubTile.id);
        BookletTile.ADAPTER.encodeWithTag(protoWriter, 2, safetyEducationHubTile.tile);
        protoWriter.writeBytes(safetyEducationHubTile.unknownFields());
    }
}
