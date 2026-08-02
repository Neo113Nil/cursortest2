package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$CardElementAction$DoClientScenario$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.CardElementAction.DoClientScenario((ClientScenario) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ClientScenario.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.CardElementAction.DoClientScenario doClientScenario = (CardModule.CardElementAction.DoClientScenario) obj;
        reverseProtoWriter.getClass();
        doClientScenario.getClass();
        reverseProtoWriter.writeBytes(doClientScenario.unknownFields());
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 1, doClientScenario.client_scenario);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.CardElementAction.DoClientScenario doClientScenario = (CardModule.CardElementAction.DoClientScenario) obj;
        doClientScenario.getClass();
        return ClientScenario.ADAPTER.encodedSizeWithTag(1, doClientScenario.client_scenario) + doClientScenario.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.CardElementAction.DoClientScenario doClientScenario = (CardModule.CardElementAction.DoClientScenario) obj;
        doClientScenario.getClass();
        ByteString byteString = ByteString.EMPTY;
        ClientScenario clientScenario = doClientScenario.client_scenario;
        byteString.getClass();
        return new CardModule.CardElementAction.DoClientScenario(clientScenario, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.CardElementAction.DoClientScenario doClientScenario = (CardModule.CardElementAction.DoClientScenario) obj;
        doClientScenario.getClass();
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 1, doClientScenario.client_scenario);
        protoWriter.writeBytes(doClientScenario.unknownFields());
    }
}
