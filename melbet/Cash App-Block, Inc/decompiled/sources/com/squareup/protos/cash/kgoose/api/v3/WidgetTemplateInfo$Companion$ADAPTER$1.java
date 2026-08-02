package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/WidgetTemplateInfo$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateInfo;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WidgetTemplateInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WidgetTemplateInfo((WidgetTemplateType) obj, (String) obj2, (String) obj3, (WidgetCategory) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = WidgetTemplateType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = WidgetCategory.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WidgetTemplateInfo widgetTemplateInfo = (WidgetTemplateInfo) obj;
        reverseProtoWriter.getClass();
        widgetTemplateInfo.getClass();
        reverseProtoWriter.writeBytes(widgetTemplateInfo.unknownFields());
        WidgetCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 4, widgetTemplateInfo.category);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, widgetTemplateInfo.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, widgetTemplateInfo.title);
        WidgetTemplateType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, widgetTemplateInfo.type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WidgetTemplateInfo widgetTemplateInfo = (WidgetTemplateInfo) obj;
        widgetTemplateInfo.getClass();
        int encodedSizeWithTag = WidgetTemplateType.ADAPTER.encodedSizeWithTag(1, widgetTemplateInfo.type) + widgetTemplateInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return WidgetCategory.ADAPTER.encodedSizeWithTag(4, widgetTemplateInfo.category) + protoAdapter.encodedSizeWithTag(3, widgetTemplateInfo.description) + protoAdapter.encodedSizeWithTag(2, widgetTemplateInfo.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WidgetTemplateInfo widgetTemplateInfo = (WidgetTemplateInfo) obj;
        widgetTemplateInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        WidgetTemplateType widgetTemplateType = widgetTemplateInfo.type;
        String str = widgetTemplateInfo.title;
        String str2 = widgetTemplateInfo.description;
        WidgetCategory widgetCategory = widgetTemplateInfo.category;
        byteString.getClass();
        return new WidgetTemplateInfo(widgetTemplateType, str, str2, widgetCategory, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WidgetTemplateInfo widgetTemplateInfo = (WidgetTemplateInfo) obj;
        widgetTemplateInfo.getClass();
        WidgetTemplateType.ADAPTER.encodeWithTag(protoWriter, 1, widgetTemplateInfo.type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, widgetTemplateInfo.title);
        protoAdapter.encodeWithTag(protoWriter, 3, widgetTemplateInfo.description);
        WidgetCategory.ADAPTER.encodeWithTag(protoWriter, 4, widgetTemplateInfo.category);
        protoWriter.writeBytes(widgetTemplateInfo.unknownFields());
    }
}
