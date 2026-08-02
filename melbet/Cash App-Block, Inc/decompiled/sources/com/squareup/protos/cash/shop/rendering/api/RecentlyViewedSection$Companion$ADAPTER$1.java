package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.RecentlyViewedSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RecentlyViewedSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecentlyViewedSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(RecentlyViewedSection.Logo.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecentlyViewedSection recentlyViewedSection = (RecentlyViewedSection) obj;
        reverseProtoWriter.getClass();
        recentlyViewedSection.getClass();
        reverseProtoWriter.writeBytes(recentlyViewedSection.unknownFields());
        RecentlyViewedSection.Logo.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, recentlyViewedSection.logos);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecentlyViewedSection recentlyViewedSection = (RecentlyViewedSection) obj;
        recentlyViewedSection.getClass();
        return RecentlyViewedSection.Logo.ADAPTER.asRepeated().encodedSizeWithTag(1, recentlyViewedSection.logos) + recentlyViewedSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecentlyViewedSection recentlyViewedSection = (RecentlyViewedSection) obj;
        recentlyViewedSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(recentlyViewedSection.logos, RecentlyViewedSection.Logo.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RecentlyViewedSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecentlyViewedSection recentlyViewedSection = (RecentlyViewedSection) obj;
        recentlyViewedSection.getClass();
        RecentlyViewedSection.Logo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, recentlyViewedSection.logos);
        protoWriter.writeBytes(recentlyViewedSection.unknownFields());
    }
}
