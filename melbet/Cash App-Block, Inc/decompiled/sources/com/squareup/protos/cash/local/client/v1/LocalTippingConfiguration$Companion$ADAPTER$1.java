package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalTippingConfiguration;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalTippingConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalTippingConfiguration((Boolean) obj, (String) obj2, (String) obj3, (String) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(LocalTippingConfiguration.Suggestion.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalTippingConfiguration localTippingConfiguration = (LocalTippingConfiguration) obj;
        reverseProtoWriter.getClass();
        localTippingConfiguration.getClass();
        reverseProtoWriter.writeBytes(localTippingConfiguration.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, localTippingConfiguration.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localTippingConfiguration.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localTippingConfiguration.default_description_label);
        LocalTippingConfiguration.Suggestion.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, localTippingConfiguration.suggestions);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, localTippingConfiguration.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalTippingConfiguration localTippingConfiguration = (LocalTippingConfiguration) obj;
        localTippingConfiguration.getClass();
        int encodedSizeWithTag = LocalTippingConfiguration.Suggestion.ADAPTER.asRepeated().encodedSizeWithTag(2, localTippingConfiguration.suggestions) + ProtoAdapter.BOOL.encodedSizeWithTag(1, localTippingConfiguration.enabled) + localTippingConfiguration.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, localTippingConfiguration.subtitle) + protoAdapter.encodedSizeWithTag(4, localTippingConfiguration.title) + protoAdapter.encodedSizeWithTag(3, localTippingConfiguration.default_description_label) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalTippingConfiguration localTippingConfiguration = (LocalTippingConfiguration) obj;
        localTippingConfiguration.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localTippingConfiguration.suggestions, LocalTippingConfiguration.Suggestion.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = localTippingConfiguration.enabled;
        String str = localTippingConfiguration.default_description_label;
        String str2 = localTippingConfiguration.title;
        String str3 = localTippingConfiguration.subtitle;
        byteString.getClass();
        return new LocalTippingConfiguration(bool, str, str2, str3, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalTippingConfiguration localTippingConfiguration = (LocalTippingConfiguration) obj;
        localTippingConfiguration.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, localTippingConfiguration.enabled);
        LocalTippingConfiguration.Suggestion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, localTippingConfiguration.suggestions);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, localTippingConfiguration.default_description_label);
        protoAdapter.encodeWithTag(protoWriter, 4, localTippingConfiguration.title);
        protoAdapter.encodeWithTag(protoWriter, 5, localTippingConfiguration.subtitle);
        protoWriter.writeBytes(localTippingConfiguration.unknownFields());
    }
}
