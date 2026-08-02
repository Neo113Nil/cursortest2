package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.TemplateCardAction;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        TemplateCardAction.Action action = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TemplateCardAction(action, (CdfEvent) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                action = new TemplateCardAction.Action.ServerToolCall((TemplateCardServerToolCall) TemplateCardServerToolCall.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                action = new TemplateCardAction.Action.ClientRouteUrlTemplate((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TemplateCardAction templateCardAction = (TemplateCardAction) obj;
        reverseProtoWriter.getClass();
        templateCardAction.getClass();
        reverseProtoWriter.writeBytes(templateCardAction.unknownFields());
        TemplateCardAction.Action action = templateCardAction.action;
        if (action instanceof TemplateCardAction.Action.ServerToolCall) {
            TemplateCardServerToolCall.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((TemplateCardAction.Action.ServerToolCall) action).getValue());
        } else if (action instanceof TemplateCardAction.Action.ClientRouteUrlTemplate) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((TemplateCardAction.Action.ClientRouteUrlTemplate) action).getValue());
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 3, templateCardAction.tap_cdf_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        TemplateCardAction templateCardAction = (TemplateCardAction) obj;
        templateCardAction.getClass();
        int size$okio = templateCardAction.unknownFields().getSize$okio();
        TemplateCardAction.Action action = templateCardAction.action;
        if (action instanceof TemplateCardAction.Action.ServerToolCall) {
            encodedSizeWithTag = TemplateCardServerToolCall.ADAPTER.encodedSizeWithTag(1, ((TemplateCardAction.Action.ServerToolCall) action).getValue());
        } else {
            if (!(action instanceof TemplateCardAction.Action.ClientRouteUrlTemplate)) {
                if (action != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return CdfEvent.ADAPTER.encodedSizeWithTag(3, templateCardAction.tap_cdf_event) + size$okio;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, ((TemplateCardAction.Action.ClientRouteUrlTemplate) action).getValue());
        }
        size$okio += encodedSizeWithTag;
        return CdfEvent.ADAPTER.encodedSizeWithTag(3, templateCardAction.tap_cdf_event) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TemplateCardAction templateCardAction = (TemplateCardAction) obj;
        templateCardAction.getClass();
        CdfEvent cdfEvent = templateCardAction.tap_cdf_event;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        TemplateCardAction.Action action = templateCardAction.action;
        byteString.getClass();
        return new TemplateCardAction(action, cdfEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TemplateCardAction templateCardAction = (TemplateCardAction) obj;
        templateCardAction.getClass();
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 3, templateCardAction.tap_cdf_event);
        TemplateCardAction.Action action = templateCardAction.action;
        if (action instanceof TemplateCardAction.Action.ServerToolCall) {
            TemplateCardServerToolCall.ADAPTER.encodeWithTag(protoWriter, 1, ((TemplateCardAction.Action.ServerToolCall) action).getValue());
        } else if (action instanceof TemplateCardAction.Action.ClientRouteUrlTemplate) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ((TemplateCardAction.Action.ClientRouteUrlTemplate) action).getValue());
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(templateCardAction.unknownFields());
    }
}
