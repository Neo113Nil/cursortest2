package com.squareup.protos.cash.cashstorefronts.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppGenericBusinessMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppGenericBusinessMetadata(m, (ExternalAppLink) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 4) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 5) {
                obj = TransactorKt.decodeMessageOrMerge(ExternalAppLink.ADAPTER, protoReader, obj);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppGenericBusinessMetadata cashAppGenericBusinessMetadata = (CashAppGenericBusinessMetadata) obj;
        reverseProtoWriter.getClass();
        cashAppGenericBusinessMetadata.getClass();
        reverseProtoWriter.writeBytes(cashAppGenericBusinessMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, cashAppGenericBusinessMetadata.iab_url);
        ExternalAppLink.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cashAppGenericBusinessMetadata.external_app_link);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, cashAppGenericBusinessMetadata.post_checkout_url_patterns);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppGenericBusinessMetadata cashAppGenericBusinessMetadata = (CashAppGenericBusinessMetadata) obj;
        cashAppGenericBusinessMetadata.getClass();
        int size$okio = cashAppGenericBusinessMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, cashAppGenericBusinessMetadata.iab_url) + ExternalAppLink.ADAPTER.encodedSizeWithTag(5, cashAppGenericBusinessMetadata.external_app_link) + protoAdapter.asRepeated().encodedSizeWithTag(4, cashAppGenericBusinessMetadata.post_checkout_url_patterns) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppGenericBusinessMetadata cashAppGenericBusinessMetadata = (CashAppGenericBusinessMetadata) obj;
        cashAppGenericBusinessMetadata.getClass();
        ExternalAppLink externalAppLink = cashAppGenericBusinessMetadata.external_app_link;
        ExternalAppLink externalAppLink2 = externalAppLink != null ? (ExternalAppLink) ExternalAppLink.ADAPTER.redact(externalAppLink) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = cashAppGenericBusinessMetadata.post_checkout_url_patterns;
        String str = cashAppGenericBusinessMetadata.iab_url;
        list.getClass();
        byteString.getClass();
        return new CashAppGenericBusinessMetadata(list, externalAppLink2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppGenericBusinessMetadata cashAppGenericBusinessMetadata = (CashAppGenericBusinessMetadata) obj;
        cashAppGenericBusinessMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, cashAppGenericBusinessMetadata.post_checkout_url_patterns);
        ExternalAppLink.ADAPTER.encodeWithTag(protoWriter, 5, cashAppGenericBusinessMetadata.external_app_link);
        protoAdapter.encodeWithTag(protoWriter, 6, cashAppGenericBusinessMetadata.iab_url);
        protoWriter.writeBytes(cashAppGenericBusinessMetadata.unknownFields());
    }
}
