package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import coil3.network.internal.UtilsKt;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        UtilsKt utilsKt = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action(utilsKt, (AnalyticsData) obj, (AnalyticsEvent) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                utilsKt = new Action$Action$OpenUrl((Action.OpenUrlAction) Action.OpenUrlAction.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                utilsKt = new Action$Action$Dismiss((Action.DismissAction) Action.DismissAction.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                switch (nextTag) {
                    case 100:
                        obj = TransactorKt.decodeMessageOrMerge(AnalyticsData.ADAPTER, protoReader, obj);
                        break;
                    case 101:
                        obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
                        break;
                    case 102:
                        obj3 = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                utilsKt = new Action$Action$Overlay((Action.OverlayAction) Action.OverlayAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action action = (Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        UtilsKt utilsKt = action.action;
        if (utilsKt instanceof Action$Action$OpenUrl) {
            Action.OpenUrlAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Action$Action$OpenUrl) utilsKt).value);
        } else if (utilsKt instanceof Action$Action$Dismiss) {
            Action.DismissAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((Action$Action$Dismiss) utilsKt).value);
        } else if (utilsKt instanceof Action$Action$Overlay) {
            Action.OverlayAction.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((Action$Action$Overlay) utilsKt).value);
        } else if (utilsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 102, action.mark_context_stale);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 101, action.analytics_event);
        AnalyticsData.ADAPTER.encodeWithTag(reverseProtoWriter, 100, action.analytics_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Action action = (Action) obj;
        action.getClass();
        int size$okio = action.unknownFields().getSize$okio();
        UtilsKt utilsKt = action.action;
        if (utilsKt instanceof Action$Action$OpenUrl) {
            encodedSizeWithTag = Action.OpenUrlAction.ADAPTER.encodedSizeWithTag(3, ((Action$Action$OpenUrl) utilsKt).value);
        } else if (utilsKt instanceof Action$Action$Dismiss) {
            encodedSizeWithTag = Action.DismissAction.ADAPTER.encodedSizeWithTag(4, ((Action$Action$Dismiss) utilsKt).value);
        } else {
            if (!(utilsKt instanceof Action$Action$Overlay)) {
                if (utilsKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BOOL.encodedSizeWithTag(102, action.mark_context_stale) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(101, action.analytics_event) + AnalyticsData.ADAPTER.encodedSizeWithTag(100, action.analytics_data) + size$okio;
            }
            encodedSizeWithTag = Action.OverlayAction.ADAPTER.encodedSizeWithTag(5, ((Action$Action$Overlay) utilsKt).value);
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.BOOL.encodedSizeWithTag(102, action.mark_context_stale) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(101, action.analytics_event) + AnalyticsData.ADAPTER.encodedSizeWithTag(100, action.analytics_data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action action = (Action) obj;
        action.getClass();
        AnalyticsData analyticsData = action.analytics_data;
        AnalyticsData analyticsData2 = analyticsData != null ? (AnalyticsData) AnalyticsData.ADAPTER.redact(analyticsData) : null;
        AnalyticsEvent analyticsEvent = action.analytics_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        UtilsKt utilsKt = action.action;
        Boolean bool = action.mark_context_stale;
        byteString.getClass();
        return new Action(utilsKt, analyticsData2, analyticsEvent2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action action = (Action) obj;
        action.getClass();
        AnalyticsData.ADAPTER.encodeWithTag(protoWriter, 100, action.analytics_data);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 101, action.analytics_event);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 102, action.mark_context_stale);
        UtilsKt utilsKt = action.action;
        if (utilsKt instanceof Action$Action$OpenUrl) {
            Action.OpenUrlAction.ADAPTER.encodeWithTag(protoWriter, 3, ((Action$Action$OpenUrl) utilsKt).value);
        } else if (utilsKt instanceof Action$Action$Dismiss) {
            Action.DismissAction.ADAPTER.encodeWithTag(protoWriter, 4, ((Action$Action$Dismiss) utilsKt).value);
        } else if (utilsKt instanceof Action$Action$Overlay) {
            Action.OverlayAction.ADAPTER.encodeWithTag(protoWriter, 5, ((Action$Action$Overlay) utilsKt).value);
        } else if (utilsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(action.unknownFields());
    }
}
