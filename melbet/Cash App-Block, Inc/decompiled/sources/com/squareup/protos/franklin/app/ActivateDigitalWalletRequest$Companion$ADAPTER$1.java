package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.ActivateDigitalWalletRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ActivateDigitalWalletRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivateDigitalWalletRequest((RequestContext) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ActivateDigitalWalletRequest.DigitalWalletCardData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivateDigitalWalletRequest activateDigitalWalletRequest = (ActivateDigitalWalletRequest) obj;
        reverseProtoWriter.getClass();
        activateDigitalWalletRequest.getClass();
        reverseProtoWriter.writeBytes(activateDigitalWalletRequest.unknownFields());
        ActivateDigitalWalletRequest.DigitalWalletCardData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, activateDigitalWalletRequest.digital_wallet_cards);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, activateDigitalWalletRequest.pan_reference_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, activateDigitalWalletRequest.issued_card_token);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activateDigitalWalletRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivateDigitalWalletRequest activateDigitalWalletRequest = (ActivateDigitalWalletRequest) obj;
        activateDigitalWalletRequest.getClass();
        int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, activateDigitalWalletRequest.request_context) + activateDigitalWalletRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ActivateDigitalWalletRequest.DigitalWalletCardData.ADAPTER.asRepeated().encodedSizeWithTag(4, activateDigitalWalletRequest.digital_wallet_cards) + protoAdapter.encodedSizeWithTag(3, activateDigitalWalletRequest.pan_reference_id) + protoAdapter.encodedSizeWithTag(2, activateDigitalWalletRequest.issued_card_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivateDigitalWalletRequest activateDigitalWalletRequest = (ActivateDigitalWalletRequest) obj;
        activateDigitalWalletRequest.getClass();
        RequestContext requestContext = activateDigitalWalletRequest.request_context;
        return ActivateDigitalWalletRequest.copy$default(activateDigitalWalletRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, TransactorKt.m1169redactElements(activateDigitalWalletRequest.digital_wallet_cards, ActivateDigitalWalletRequest.DigitalWalletCardData.ADAPTER), ByteString.EMPTY, 6);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivateDigitalWalletRequest activateDigitalWalletRequest = (ActivateDigitalWalletRequest) obj;
        activateDigitalWalletRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, activateDigitalWalletRequest.request_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, activateDigitalWalletRequest.issued_card_token);
        protoAdapter.encodeWithTag(protoWriter, 3, activateDigitalWalletRequest.pan_reference_id);
        ActivateDigitalWalletRequest.DigitalWalletCardData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, activateDigitalWalletRequest.digital_wallet_cards);
        protoWriter.writeBytes(activateDigitalWalletRequest.unknownFields());
    }
}
