package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.ActionCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$ClientRouteAction$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$ClientRouteAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionCard$CardTapAction$ClientRouteAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActionCard.CardTapAction.ClientRouteAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActionCard.CardTapAction.ClientRouteAction clientRouteAction = (ActionCard.CardTapAction.ClientRouteAction) obj;
        reverseProtoWriter.getClass();
        clientRouteAction.getClass();
        reverseProtoWriter.writeBytes(clientRouteAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, clientRouteAction.client_route_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActionCard.CardTapAction.ClientRouteAction clientRouteAction = (ActionCard.CardTapAction.ClientRouteAction) obj;
        clientRouteAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, clientRouteAction.client_route_url) + clientRouteAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActionCard.CardTapAction.ClientRouteAction clientRouteAction = (ActionCard.CardTapAction.ClientRouteAction) obj;
        clientRouteAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientRouteAction.client_route_url;
        byteString.getClass();
        return new ActionCard.CardTapAction.ClientRouteAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActionCard.CardTapAction.ClientRouteAction clientRouteAction = (ActionCard.CardTapAction.ClientRouteAction) obj;
        clientRouteAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, clientRouteAction.client_route_url);
        protoWriter.writeBytes(clientRouteAction.unknownFields());
    }
}
