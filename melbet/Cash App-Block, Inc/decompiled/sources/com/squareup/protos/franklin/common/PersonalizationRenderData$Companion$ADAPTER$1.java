package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PersonalizationRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PersonalizationRenderData((Personalization) obj, (Boolean) obj2, (com.squareup.cash.mosaic.personalization.api.v2.Personalization) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Personalization.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(com.squareup.cash.mosaic.personalization.api.v2.Personalization.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PersonalizationRenderData personalizationRenderData = (PersonalizationRenderData) obj;
        reverseProtoWriter.getClass();
        personalizationRenderData.getClass();
        reverseProtoWriter.writeBytes(personalizationRenderData.unknownFields());
        com.squareup.cash.mosaic.personalization.api.v2.Personalization.ADAPTER.encodeWithTag(reverseProtoWriter, 3, personalizationRenderData.personalization_payload);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, personalizationRenderData.customer_viewed);
        Personalization.ADAPTER.encodeWithTag(reverseProtoWriter, 1, personalizationRenderData.personalization);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PersonalizationRenderData personalizationRenderData = (PersonalizationRenderData) obj;
        personalizationRenderData.getClass();
        return com.squareup.cash.mosaic.personalization.api.v2.Personalization.ADAPTER.encodedSizeWithTag(3, personalizationRenderData.personalization_payload) + ProtoAdapter.BOOL.encodedSizeWithTag(2, personalizationRenderData.customer_viewed) + Personalization.ADAPTER.encodedSizeWithTag(1, personalizationRenderData.personalization) + personalizationRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PersonalizationRenderData personalizationRenderData = (PersonalizationRenderData) obj;
        personalizationRenderData.getClass();
        Personalization personalization = personalizationRenderData.personalization;
        Personalization personalization2 = personalization != null ? (Personalization) Personalization.ADAPTER.redact(personalization) : null;
        com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization3 = personalizationRenderData.personalization_payload;
        com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization4 = personalization3 != null ? (com.squareup.cash.mosaic.personalization.api.v2.Personalization) com.squareup.cash.mosaic.personalization.api.v2.Personalization.ADAPTER.redact(personalization3) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = personalizationRenderData.customer_viewed;
        byteString.getClass();
        return new PersonalizationRenderData(personalization2, bool, personalization4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PersonalizationRenderData personalizationRenderData = (PersonalizationRenderData) obj;
        personalizationRenderData.getClass();
        Personalization.ADAPTER.encodeWithTag(protoWriter, 1, personalizationRenderData.personalization);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, personalizationRenderData.customer_viewed);
        com.squareup.cash.mosaic.personalization.api.v2.Personalization.ADAPTER.encodeWithTag(protoWriter, 3, personalizationRenderData.personalization_payload);
        protoWriter.writeBytes(personalizationRenderData.unknownFields());
    }
}
