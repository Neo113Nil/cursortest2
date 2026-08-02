package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.ActionCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionCard$CardTapAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        ActionCard.CardTapAction.Action.ClientRouteAction clientRouteAction = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActionCard.CardTapAction((String) obj, (CdfEvent) obj2, clientRouteAction, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                clientRouteAction = new ActionCard.CardTapAction.Action.ClientRouteAction((ActionCard.CardTapAction.ClientRouteAction) ActionCard.CardTapAction.ClientRouteAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActionCard.CardTapAction cardTapAction = (ActionCard.CardTapAction) obj;
        reverseProtoWriter.getClass();
        cardTapAction.getClass();
        reverseProtoWriter.writeBytes(cardTapAction.unknownFields());
        ActionCard.CardTapAction.Action action = cardTapAction.action;
        if (action instanceof ActionCard.CardTapAction.Action.ClientRouteAction) {
            ActionCard.CardTapAction.ClientRouteAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ActionCard.CardTapAction.Action.ClientRouteAction) action).getValue());
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cardTapAction.cdf_event);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cardTapAction.hidden_message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActionCard.CardTapAction cardTapAction = (ActionCard.CardTapAction) obj;
        cardTapAction.getClass();
        int encodedSizeWithTag = CdfEvent.ADAPTER.encodedSizeWithTag(2, cardTapAction.cdf_event) + ProtoAdapter.STRING.encodedSizeWithTag(1, cardTapAction.hidden_message) + cardTapAction.unknownFields().getSize$okio();
        ActionCard.CardTapAction.Action action = cardTapAction.action;
        if (action instanceof ActionCard.CardTapAction.Action.ClientRouteAction) {
            return ActionCard.CardTapAction.ClientRouteAction.ADAPTER.encodedSizeWithTag(3, ((ActionCard.CardTapAction.Action.ClientRouteAction) action).getValue()) + encodedSizeWithTag;
        }
        if (action == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActionCard.CardTapAction cardTapAction = (ActionCard.CardTapAction) obj;
        cardTapAction.getClass();
        CdfEvent cdfEvent = cardTapAction.cdf_event;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cardTapAction.hidden_message;
        ActionCard.CardTapAction.Action action = cardTapAction.action;
        byteString.getClass();
        return new ActionCard.CardTapAction(str, cdfEvent2, action, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActionCard.CardTapAction cardTapAction = (ActionCard.CardTapAction) obj;
        cardTapAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardTapAction.hidden_message);
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 2, cardTapAction.cdf_event);
        ActionCard.CardTapAction.Action action = cardTapAction.action;
        if (action instanceof ActionCard.CardTapAction.Action.ClientRouteAction) {
            ActionCard.CardTapAction.ClientRouteAction.ADAPTER.encodeWithTag(protoWriter, 3, ((ActionCard.CardTapAction.Action.ClientRouteAction) action).getValue());
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cardTapAction.unknownFields());
    }
}
