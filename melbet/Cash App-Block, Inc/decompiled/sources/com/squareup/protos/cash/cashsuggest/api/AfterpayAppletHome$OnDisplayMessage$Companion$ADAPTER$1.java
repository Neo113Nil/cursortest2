package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuCardKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.shop.rendering.api.UpsellSheet;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletHome$OnDisplayMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        LocalMenuCardKt localMenuCardKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletHome.OnDisplayMessage((String) obj, localMenuCardKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                localMenuCardKt = new AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet((UpsellSheet) UpsellSheet.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                localMenuCardKt = new AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletHome.OnDisplayMessage onDisplayMessage = (AfterpayAppletHome.OnDisplayMessage) obj;
        reverseProtoWriter.getClass();
        onDisplayMessage.getClass();
        reverseProtoWriter.writeBytes(onDisplayMessage.unknownFields());
        LocalMenuCardKt localMenuCardKt = onDisplayMessage.treatment;
        if (localMenuCardKt instanceof AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet) {
            UpsellSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet) localMenuCardKt).value);
        } else if (localMenuCardKt instanceof AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl) localMenuCardKt).value);
        } else if (localMenuCardKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, onDisplayMessage.message_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletHome.OnDisplayMessage onDisplayMessage = (AfterpayAppletHome.OnDisplayMessage) obj;
        onDisplayMessage.getClass();
        int size$okio = onDisplayMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, onDisplayMessage.message_id) + size$okio;
        LocalMenuCardKt localMenuCardKt = onDisplayMessage.treatment;
        if (localMenuCardKt instanceof AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet) {
            return UpsellSheet.ADAPTER.encodedSizeWithTag(2, ((AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet) localMenuCardKt).value) + encodedSizeWithTag;
        }
        if (localMenuCardKt instanceof AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl) {
            return protoAdapter.encodedSizeWithTag(3, ((AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl) localMenuCardKt).value) + encodedSizeWithTag;
        }
        if (localMenuCardKt == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletHome.OnDisplayMessage onDisplayMessage = (AfterpayAppletHome.OnDisplayMessage) obj;
        onDisplayMessage.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = onDisplayMessage.message_id;
        LocalMenuCardKt localMenuCardKt = onDisplayMessage.treatment;
        byteString.getClass();
        return new AfterpayAppletHome.OnDisplayMessage(str, localMenuCardKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletHome.OnDisplayMessage onDisplayMessage = (AfterpayAppletHome.OnDisplayMessage) obj;
        onDisplayMessage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, onDisplayMessage.message_id);
        LocalMenuCardKt localMenuCardKt = onDisplayMessage.treatment;
        if (localMenuCardKt instanceof AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet) {
            UpsellSheet.ADAPTER.encodeWithTag(protoWriter, 2, ((AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet) localMenuCardKt).value);
        } else if (localMenuCardKt instanceof AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl) {
            protoAdapter.encodeWithTag(protoWriter, 3, ((AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl) localMenuCardKt).value);
        } else if (localMenuCardKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(onDisplayMessage.unknownFields());
    }
}
