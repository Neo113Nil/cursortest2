package com.squareup.protos.cash.aegis.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UiFamilyTile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiFamilyTile((LocalizedString) obj, (String) obj2, (FamilyTileContent) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj3 = TransactorKt.decodeMessageOrMerge(FamilyTileContent.ADAPTER, protoReader, obj3);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiFamilyTile uiFamilyTile = (UiFamilyTile) obj;
        reverseProtoWriter.getClass();
        uiFamilyTile.getClass();
        reverseProtoWriter.writeBytes(uiFamilyTile.unknownFields());
        FamilyTileContent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uiFamilyTile.family_tile_content);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, uiFamilyTile.tap_url);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiFamilyTile.localized_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiFamilyTile uiFamilyTile = (UiFamilyTile) obj;
        uiFamilyTile.getClass();
        return FamilyTileContent.ADAPTER.encodedSizeWithTag(2, uiFamilyTile.family_tile_content) + ProtoAdapter.STRING.encodedSizeWithTag(3, uiFamilyTile.tap_url) + LocalizedString.ADAPTER.encodedSizeWithTag(1, uiFamilyTile.localized_title) + uiFamilyTile.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiFamilyTile uiFamilyTile = (UiFamilyTile) obj;
        uiFamilyTile.getClass();
        LocalizedString localizedString = uiFamilyTile.localized_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        FamilyTileContent familyTileContent = uiFamilyTile.family_tile_content;
        FamilyTileContent familyTileContent2 = familyTileContent != null ? (FamilyTileContent) FamilyTileContent.ADAPTER.redact(familyTileContent) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = uiFamilyTile.tap_url;
        byteString.getClass();
        return new UiFamilyTile(localizedString2, str, familyTileContent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiFamilyTile uiFamilyTile = (UiFamilyTile) obj;
        uiFamilyTile.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, uiFamilyTile.localized_title);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uiFamilyTile.tap_url);
        FamilyTileContent.ADAPTER.encodeWithTag(protoWriter, 2, uiFamilyTile.family_tile_content);
        protoWriter.writeBytes(uiFamilyTile.unknownFields());
    }
}
