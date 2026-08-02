package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CollectionSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        CollectionSection$Content$RowSection collectionSection$Content$RowSection = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CollectionSection((AnalyticsEvent) obj, (String) obj2, collectionSection$Content$RowSection, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                collectionSection$Content$RowSection = new CollectionSection$Content$RowSection((RowSection) RowSection.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CollectionSection collectionSection = (CollectionSection) obj;
        reverseProtoWriter.getClass();
        collectionSection.getClass();
        reverseProtoWriter.writeBytes(collectionSection.unknownFields());
        CollectionSection$Content$RowSection collectionSection$Content$RowSection = collectionSection.content;
        if (collectionSection$Content$RowSection != null) {
            RowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, collectionSection$Content$RowSection.value);
        } else if (collectionSection$Content$RowSection != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, collectionSection.section_id);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, collectionSection.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CollectionSection collectionSection = (CollectionSection) obj;
        collectionSection.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, collectionSection.section_id) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, collectionSection.analytics_view_event) + collectionSection.unknownFields().getSize$okio();
        CollectionSection$Content$RowSection collectionSection$Content$RowSection = collectionSection.content;
        if (collectionSection$Content$RowSection != null) {
            return RowSection.ADAPTER.encodedSizeWithTag(4, collectionSection$Content$RowSection.value) + encodedSizeWithTag;
        }
        if (collectionSection$Content$RowSection == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CollectionSection collectionSection = (CollectionSection) obj;
        collectionSection.getClass();
        AnalyticsEvent analyticsEvent = collectionSection.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = collectionSection.section_id;
        CollectionSection$Content$RowSection collectionSection$Content$RowSection = collectionSection.content;
        byteString.getClass();
        return new CollectionSection(analyticsEvent2, str, collectionSection$Content$RowSection, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CollectionSection collectionSection = (CollectionSection) obj;
        collectionSection.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, collectionSection.analytics_view_event);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, collectionSection.section_id);
        CollectionSection$Content$RowSection collectionSection$Content$RowSection = collectionSection.content;
        if (collectionSection$Content$RowSection != null) {
            RowSection.ADAPTER.encodeWithTag(protoWriter, 4, collectionSection$Content$RowSection.value);
        } else if (collectionSection$Content$RowSection != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(collectionSection.unknownFields());
    }
}
