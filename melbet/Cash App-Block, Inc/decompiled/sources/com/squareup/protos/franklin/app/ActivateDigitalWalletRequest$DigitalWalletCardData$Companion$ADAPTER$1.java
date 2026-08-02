package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.ActivateDigitalWalletRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ActivateDigitalWalletRequest$DigitalWalletCardData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivateDigitalWalletRequest.DigitalWalletCardData((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivateDigitalWalletRequest.DigitalWalletCardData digitalWalletCardData = (ActivateDigitalWalletRequest.DigitalWalletCardData) obj;
        reverseProtoWriter.getClass();
        digitalWalletCardData.getClass();
        reverseProtoWriter.writeBytes(digitalWalletCardData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, digitalWalletCardData.issued_card_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, digitalWalletCardData.dpan_last_four);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, digitalWalletCardData.dpan_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, digitalWalletCardData.fpan_last_four);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, digitalWalletCardData.fpan_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivateDigitalWalletRequest.DigitalWalletCardData digitalWalletCardData = (ActivateDigitalWalletRequest.DigitalWalletCardData) obj;
        digitalWalletCardData.getClass();
        int size$okio = digitalWalletCardData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, digitalWalletCardData.issued_card_token) + protoAdapter.encodedSizeWithTag(4, digitalWalletCardData.dpan_last_four) + protoAdapter.encodedSizeWithTag(3, digitalWalletCardData.dpan_id) + protoAdapter.encodedSizeWithTag(2, digitalWalletCardData.fpan_last_four) + protoAdapter.encodedSizeWithTag(1, digitalWalletCardData.fpan_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivateDigitalWalletRequest.DigitalWalletCardData digitalWalletCardData = (ActivateDigitalWalletRequest.DigitalWalletCardData) obj;
        digitalWalletCardData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = digitalWalletCardData.fpan_id;
        String str2 = digitalWalletCardData.fpan_last_four;
        String str3 = digitalWalletCardData.dpan_id;
        String str4 = digitalWalletCardData.dpan_last_four;
        String str5 = digitalWalletCardData.issued_card_token;
        byteString.getClass();
        return new ActivateDigitalWalletRequest.DigitalWalletCardData(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivateDigitalWalletRequest.DigitalWalletCardData digitalWalletCardData = (ActivateDigitalWalletRequest.DigitalWalletCardData) obj;
        digitalWalletCardData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, digitalWalletCardData.fpan_id);
        protoAdapter.encodeWithTag(protoWriter, 2, digitalWalletCardData.fpan_last_four);
        protoAdapter.encodeWithTag(protoWriter, 3, digitalWalletCardData.dpan_id);
        protoAdapter.encodeWithTag(protoWriter, 4, digitalWalletCardData.dpan_last_four);
        protoAdapter.encodeWithTag(protoWriter, 5, digitalWalletCardData.issued_card_token);
        protoWriter.writeBytes(digitalWalletCardData.unknownFields());
    }
}
