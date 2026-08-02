package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FilterGroupSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FilterGroupSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(FilterGroupSection.FilterGroupItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FilterGroupSection filterGroupSection = (FilterGroupSection) obj;
        reverseProtoWriter.getClass();
        filterGroupSection.getClass();
        reverseProtoWriter.writeBytes(filterGroupSection.unknownFields());
        FilterGroupSection.FilterGroupItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, filterGroupSection.filter_group_items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FilterGroupSection filterGroupSection = (FilterGroupSection) obj;
        filterGroupSection.getClass();
        return FilterGroupSection.FilterGroupItem.ADAPTER.asRepeated().encodedSizeWithTag(1, filterGroupSection.filter_group_items) + filterGroupSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FilterGroupSection filterGroupSection = (FilterGroupSection) obj;
        filterGroupSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(filterGroupSection.filter_group_items, FilterGroupSection.FilterGroupItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FilterGroupSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FilterGroupSection filterGroupSection = (FilterGroupSection) obj;
        filterGroupSection.getClass();
        FilterGroupSection.FilterGroupItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, filterGroupSection.filter_group_items);
        protoWriter.writeBytes(filterGroupSection.unknownFields());
    }
}
