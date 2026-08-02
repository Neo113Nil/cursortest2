package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CategoryTileSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CategoryTileSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CategoryTileSection.CategoryTile.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CategoryTileSection categoryTileSection = (CategoryTileSection) obj;
        reverseProtoWriter.getClass();
        categoryTileSection.getClass();
        reverseProtoWriter.writeBytes(categoryTileSection.unknownFields());
        CategoryTileSection.CategoryTile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, categoryTileSection.tiles);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CategoryTileSection categoryTileSection = (CategoryTileSection) obj;
        categoryTileSection.getClass();
        return CategoryTileSection.CategoryTile.ADAPTER.asRepeated().encodedSizeWithTag(1, categoryTileSection.tiles) + categoryTileSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CategoryTileSection categoryTileSection = (CategoryTileSection) obj;
        categoryTileSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(categoryTileSection.tiles, CategoryTileSection.CategoryTile.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CategoryTileSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CategoryTileSection categoryTileSection = (CategoryTileSection) obj;
        categoryTileSection.getClass();
        CategoryTileSection.CategoryTile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, categoryTileSection.tiles);
        protoWriter.writeBytes(categoryTileSection.unknownFields());
    }
}
