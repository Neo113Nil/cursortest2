package com.squareup.protos.cash.discover.api.app.v2.api;

import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SectionPageResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        SectionPageResponse$Page$RowSection sectionPageResponse$Page$RowSection = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SectionPageResponse(sectionPageResponse$Page$RowSection, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                sectionPageResponse$Page$RowSection = new SectionPageResponse$Page$RowSection((RowSection.Page) RowSection.Page.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SectionPageResponse sectionPageResponse = (SectionPageResponse) obj;
        reverseProtoWriter.getClass();
        sectionPageResponse.getClass();
        reverseProtoWriter.writeBytes(sectionPageResponse.unknownFields());
        SectionPageResponse$Page$RowSection sectionPageResponse$Page$RowSection = sectionPageResponse.page;
        if (sectionPageResponse$Page$RowSection != null) {
            RowSection.Page.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sectionPageResponse$Page$RowSection.value);
        } else {
            if (sectionPageResponse$Page$RowSection == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SectionPageResponse sectionPageResponse = (SectionPageResponse) obj;
        sectionPageResponse.getClass();
        int size$okio = sectionPageResponse.unknownFields().getSize$okio();
        SectionPageResponse$Page$RowSection sectionPageResponse$Page$RowSection = sectionPageResponse.page;
        if (sectionPageResponse$Page$RowSection != null) {
            return RowSection.Page.ADAPTER.encodedSizeWithTag(1, sectionPageResponse$Page$RowSection.value) + size$okio;
        }
        if (sectionPageResponse$Page$RowSection == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SectionPageResponse sectionPageResponse = (SectionPageResponse) obj;
        sectionPageResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        SectionPageResponse$Page$RowSection sectionPageResponse$Page$RowSection = sectionPageResponse.page;
        byteString.getClass();
        return new SectionPageResponse(sectionPageResponse$Page$RowSection, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SectionPageResponse sectionPageResponse = (SectionPageResponse) obj;
        sectionPageResponse.getClass();
        SectionPageResponse$Page$RowSection sectionPageResponse$Page$RowSection = sectionPageResponse.page;
        if (sectionPageResponse$Page$RowSection != null) {
            RowSection.Page.ADAPTER.encodeWithTag(protoWriter, 1, sectionPageResponse$Page$RowSection.value);
        } else if (sectionPageResponse$Page$RowSection != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(sectionPageResponse.unknownFields());
    }
}
