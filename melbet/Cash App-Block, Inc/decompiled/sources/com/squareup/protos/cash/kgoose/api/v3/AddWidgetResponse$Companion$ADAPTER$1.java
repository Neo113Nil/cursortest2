package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/AddWidgetResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/AddWidgetResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddWidgetResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddWidgetResponse((Widget) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Widget.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddWidgetResponse addWidgetResponse = (AddWidgetResponse) obj;
        reverseProtoWriter.getClass();
        addWidgetResponse.getClass();
        reverseProtoWriter.writeBytes(addWidgetResponse.unknownFields());
        Widget.ADAPTER.encodeWithTag(reverseProtoWriter, 1, addWidgetResponse.widget);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddWidgetResponse addWidgetResponse = (AddWidgetResponse) obj;
        addWidgetResponse.getClass();
        return Widget.ADAPTER.encodedSizeWithTag(1, addWidgetResponse.widget) + addWidgetResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddWidgetResponse addWidgetResponse = (AddWidgetResponse) obj;
        addWidgetResponse.getClass();
        Widget widget = addWidgetResponse.widget;
        Widget widget2 = widget != null ? (Widget) Widget.ADAPTER.redact(widget) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AddWidgetResponse(widget2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddWidgetResponse addWidgetResponse = (AddWidgetResponse) obj;
        addWidgetResponse.getClass();
        Widget.ADAPTER.encodeWithTag(protoWriter, 1, addWidgetResponse.widget);
        protoWriter.writeBytes(addWidgetResponse.unknownFields());
    }
}
