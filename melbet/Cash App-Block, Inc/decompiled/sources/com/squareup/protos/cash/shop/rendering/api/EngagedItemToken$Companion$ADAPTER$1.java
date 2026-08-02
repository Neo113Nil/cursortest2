package com.squareup.protos.cash.shop.rendering.api;

import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class EngagedItemToken$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ErrorEvent.Meta.Companion companion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EngagedItemToken(companion, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                companion = new EngagedItemToken$Token$MerchantToken((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                companion = new EngagedItemToken$Token$CategoryToken((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EngagedItemToken engagedItemToken = (EngagedItemToken) obj;
        reverseProtoWriter.getClass();
        engagedItemToken.getClass();
        reverseProtoWriter.writeBytes(engagedItemToken.unknownFields());
        ErrorEvent.Meta.Companion companion = engagedItemToken.token;
        if (companion instanceof EngagedItemToken$Token$MerchantToken) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, ((EngagedItemToken$Token$MerchantToken) companion).value);
        } else if (companion instanceof EngagedItemToken$Token$CategoryToken) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((EngagedItemToken$Token$CategoryToken) companion).value);
        } else {
            if (companion == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        EngagedItemToken engagedItemToken = (EngagedItemToken) obj;
        engagedItemToken.getClass();
        int size$okio = engagedItemToken.unknownFields().getSize$okio();
        ErrorEvent.Meta.Companion companion = engagedItemToken.token;
        if (companion instanceof EngagedItemToken$Token$MerchantToken) {
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, ((EngagedItemToken$Token$MerchantToken) companion).value);
        } else {
            if (!(companion instanceof EngagedItemToken$Token$CategoryToken)) {
                if (companion == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, ((EngagedItemToken$Token$CategoryToken) companion).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EngagedItemToken engagedItemToken = (EngagedItemToken) obj;
        engagedItemToken.getClass();
        ByteString byteString = ByteString.EMPTY;
        ErrorEvent.Meta.Companion companion = engagedItemToken.token;
        byteString.getClass();
        return new EngagedItemToken(companion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EngagedItemToken engagedItemToken = (EngagedItemToken) obj;
        engagedItemToken.getClass();
        ErrorEvent.Meta.Companion companion = engagedItemToken.token;
        if (companion instanceof EngagedItemToken$Token$MerchantToken) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ((EngagedItemToken$Token$MerchantToken) companion).value);
        } else if (companion instanceof EngagedItemToken$Token$CategoryToken) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ((EngagedItemToken$Token$CategoryToken) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(engagedItemToken.unknownFields());
    }
}
