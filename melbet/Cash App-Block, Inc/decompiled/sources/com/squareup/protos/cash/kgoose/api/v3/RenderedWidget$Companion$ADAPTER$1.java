package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/RenderedWidget$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/RenderedWidget;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RenderedWidget$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RenderedWidget((String) obj, (Long) obj2, (ClientRenderable) obj3, (String) obj4, (ClientKickoffParams) obj5, (TapAction) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(ClientRenderable.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(ClientKickoffParams.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RenderedWidget renderedWidget = (RenderedWidget) obj;
        reverseProtoWriter.getClass();
        renderedWidget.getClass();
        reverseProtoWriter.writeBytes(renderedWidget.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, renderedWidget.permanent);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 6, renderedWidget.tap_action);
        ClientKickoffParams.ADAPTER.encodeWithTag(reverseProtoWriter, 5, renderedWidget.kickoff_params);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, renderedWidget.session_id);
        ClientRenderable.ADAPTER.encodeWithTag(reverseProtoWriter, 3, renderedWidget.client_renderable);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, renderedWidget.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, renderedWidget.widget_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RenderedWidget renderedWidget = (RenderedWidget) obj;
        renderedWidget.getClass();
        int size$okio = renderedWidget.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, renderedWidget.permanent) + TapAction.ADAPTER.encodedSizeWithTag(6, renderedWidget.tap_action) + ClientKickoffParams.ADAPTER.encodedSizeWithTag(5, renderedWidget.kickoff_params) + protoAdapter.encodedSizeWithTag(4, renderedWidget.session_id) + ClientRenderable.ADAPTER.encodedSizeWithTag(3, renderedWidget.client_renderable) + ProtoAdapter.INT64.encodedSizeWithTag(2, renderedWidget.created_at) + protoAdapter.encodedSizeWithTag(1, renderedWidget.widget_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RenderedWidget renderedWidget = (RenderedWidget) obj;
        renderedWidget.getClass();
        ClientRenderable clientRenderable = renderedWidget.client_renderable;
        ClientRenderable clientRenderable2 = clientRenderable != null ? (ClientRenderable) ClientRenderable.ADAPTER.redact(clientRenderable) : null;
        ClientKickoffParams clientKickoffParams = renderedWidget.kickoff_params;
        ClientKickoffParams clientKickoffParams2 = clientKickoffParams != null ? (ClientKickoffParams) ClientKickoffParams.ADAPTER.redact(clientKickoffParams) : null;
        TapAction tapAction = renderedWidget.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = renderedWidget.widget_id;
        Long l = renderedWidget.created_at;
        String str2 = renderedWidget.session_id;
        Boolean bool = renderedWidget.permanent;
        byteString.getClass();
        return new RenderedWidget(str, l, clientRenderable2, str2, clientKickoffParams2, tapAction2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RenderedWidget renderedWidget = (RenderedWidget) obj;
        renderedWidget.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, renderedWidget.widget_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, renderedWidget.created_at);
        ClientRenderable.ADAPTER.encodeWithTag(protoWriter, 3, renderedWidget.client_renderable);
        protoAdapter.encodeWithTag(protoWriter, 4, renderedWidget.session_id);
        ClientKickoffParams.ADAPTER.encodeWithTag(protoWriter, 5, renderedWidget.kickoff_params);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 6, renderedWidget.tap_action);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, renderedWidget.permanent);
        protoWriter.writeBytes(renderedWidget.unknownFields());
    }
}
