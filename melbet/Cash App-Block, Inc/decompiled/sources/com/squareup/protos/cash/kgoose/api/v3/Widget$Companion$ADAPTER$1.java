package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Widget$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Widget;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Widget$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Widget((String) obj, (String) obj2, (WidgetTemplateType) obj3, (Long) obj4, (WidgetConfig) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = WidgetTemplateType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(WidgetConfig.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Widget widget = (Widget) obj;
        reverseProtoWriter.getClass();
        widget.getClass();
        reverseProtoWriter.writeBytes(widget.unknownFields());
        WidgetConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 5, widget.widget_config);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, widget.created_at);
        WidgetTemplateType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, widget.template_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, widget.creator);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, widget.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Widget widget = (Widget) obj;
        widget.getClass();
        int size$okio = widget.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return WidgetConfig.ADAPTER.encodedSizeWithTag(5, widget.widget_config) + ProtoAdapter.INT64.encodedSizeWithTag(4, widget.created_at) + WidgetTemplateType.ADAPTER.encodedSizeWithTag(3, widget.template_type) + protoAdapter.encodedSizeWithTag(2, widget.creator) + protoAdapter.encodedSizeWithTag(1, widget.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Widget widget = (Widget) obj;
        widget.getClass();
        WidgetConfig widgetConfig = widget.widget_config;
        WidgetConfig widgetConfig2 = widgetConfig != null ? (WidgetConfig) WidgetConfig.ADAPTER.redact(widgetConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = widget.id;
        String str2 = widget.creator;
        WidgetTemplateType widgetTemplateType = widget.template_type;
        Long l = widget.created_at;
        byteString.getClass();
        return new Widget(str, str2, widgetTemplateType, l, widgetConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Widget widget = (Widget) obj;
        widget.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, widget.id);
        protoAdapter.encodeWithTag(protoWriter, 2, widget.creator);
        WidgetTemplateType.ADAPTER.encodeWithTag(protoWriter, 3, widget.template_type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, widget.created_at);
        WidgetConfig.ADAPTER.encodeWithTag(protoWriter, 5, widget.widget_config);
        protoWriter.writeBytes(widget.unknownFields());
    }
}
