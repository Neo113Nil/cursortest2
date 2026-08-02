package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.PillSection;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PillSection$Pill$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PillSection.Pill((AnalyticsEvent) obj, (TapAction) obj2, (LocalizedString) obj3, (Color) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
            } else if (nextTag == 4) {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PillSection.Pill pill = (PillSection.Pill) obj;
        reverseProtoWriter.getClass();
        pill.getClass();
        reverseProtoWriter.writeBytes(pill.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, pill.text);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 3, pill.background_color);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, pill.l_text);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, pill.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, pill.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PillSection.Pill pill = (PillSection.Pill) obj;
        pill.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(4, pill.text) + Color.ADAPTER.encodedSizeWithTag(3, pill.background_color) + LocalizedString.ADAPTER.encodedSizeWithTag(5, pill.l_text) + TapAction.ADAPTER.encodedSizeWithTag(2, pill.tap_action) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, pill.analytics_view_event) + pill.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PillSection.Pill pill = (PillSection.Pill) obj;
        pill.getClass();
        AnalyticsEvent analyticsEvent = pill.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        TapAction tapAction = pill.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        LocalizedString localizedString = pill.l_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Color color = pill.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = pill.text;
        byteString.getClass();
        return new PillSection.Pill(analyticsEvent2, tapAction2, localizedString2, color2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PillSection.Pill pill = (PillSection.Pill) obj;
        pill.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, pill.analytics_view_event);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 2, pill.tap_action);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 5, pill.l_text);
        Color.ADAPTER.encodeWithTag(protoWriter, 3, pill.background_color);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pill.text);
        protoWriter.writeBytes(pill.unknownFields());
    }
}
