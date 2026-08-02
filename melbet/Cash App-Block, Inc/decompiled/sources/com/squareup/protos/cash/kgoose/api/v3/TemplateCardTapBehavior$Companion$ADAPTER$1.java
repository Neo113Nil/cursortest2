package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.TemplateCardTapBehavior;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardTapBehavior;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardTapBehavior$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        TemplateCardTapBehavior.Behavior behavior = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TemplateCardTapBehavior(behavior, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                behavior = new TemplateCardTapBehavior.Behavior.TapAction((TemplateCardTapAction) TemplateCardTapAction.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                behavior = new TemplateCardTapBehavior.Behavior.CardButtons((TemplateCardButtons) TemplateCardButtons.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TemplateCardTapBehavior templateCardTapBehavior = (TemplateCardTapBehavior) obj;
        reverseProtoWriter.getClass();
        templateCardTapBehavior.getClass();
        reverseProtoWriter.writeBytes(templateCardTapBehavior.unknownFields());
        TemplateCardTapBehavior.Behavior behavior = templateCardTapBehavior.behavior;
        if (behavior instanceof TemplateCardTapBehavior.Behavior.TapAction) {
            TemplateCardTapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((TemplateCardTapBehavior.Behavior.TapAction) behavior).getValue());
        } else if (behavior instanceof TemplateCardTapBehavior.Behavior.CardButtons) {
            TemplateCardButtons.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((TemplateCardTapBehavior.Behavior.CardButtons) behavior).getValue());
        } else {
            if (behavior == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        TemplateCardTapBehavior templateCardTapBehavior = (TemplateCardTapBehavior) obj;
        templateCardTapBehavior.getClass();
        int size$okio = templateCardTapBehavior.unknownFields().getSize$okio();
        TemplateCardTapBehavior.Behavior behavior = templateCardTapBehavior.behavior;
        if (behavior instanceof TemplateCardTapBehavior.Behavior.TapAction) {
            encodedSizeWithTag = TemplateCardTapAction.ADAPTER.encodedSizeWithTag(1, ((TemplateCardTapBehavior.Behavior.TapAction) behavior).getValue());
        } else {
            if (!(behavior instanceof TemplateCardTapBehavior.Behavior.CardButtons)) {
                if (behavior == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = TemplateCardButtons.ADAPTER.encodedSizeWithTag(2, ((TemplateCardTapBehavior.Behavior.CardButtons) behavior).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TemplateCardTapBehavior templateCardTapBehavior = (TemplateCardTapBehavior) obj;
        templateCardTapBehavior.getClass();
        ByteString byteString = ByteString.EMPTY;
        TemplateCardTapBehavior.Behavior behavior = templateCardTapBehavior.behavior;
        byteString.getClass();
        return new TemplateCardTapBehavior(behavior, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TemplateCardTapBehavior templateCardTapBehavior = (TemplateCardTapBehavior) obj;
        templateCardTapBehavior.getClass();
        TemplateCardTapBehavior.Behavior behavior = templateCardTapBehavior.behavior;
        if (behavior instanceof TemplateCardTapBehavior.Behavior.TapAction) {
            TemplateCardTapAction.ADAPTER.encodeWithTag(protoWriter, 1, ((TemplateCardTapBehavior.Behavior.TapAction) behavior).getValue());
        } else if (behavior instanceof TemplateCardTapBehavior.Behavior.CardButtons) {
            TemplateCardButtons.ADAPTER.encodeWithTag(protoWriter, 2, ((TemplateCardTapBehavior.Behavior.CardButtons) behavior).getValue());
        } else if (behavior != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(templateCardTapBehavior.unknownFields());
    }
}
