package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.ViewContextRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ViewContextRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ViewContextRenderData((ViewContextRenderData.ViewContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ViewContextRenderData.ViewContext.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ViewContextRenderData viewContextRenderData = (ViewContextRenderData) obj;
        reverseProtoWriter.getClass();
        viewContextRenderData.getClass();
        reverseProtoWriter.writeBytes(viewContextRenderData.unknownFields());
        ViewContextRenderData.ViewContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, viewContextRenderData.view_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ViewContextRenderData viewContextRenderData = (ViewContextRenderData) obj;
        viewContextRenderData.getClass();
        return ViewContextRenderData.ViewContext.ADAPTER.encodedSizeWithTag(1, viewContextRenderData.view_context) + viewContextRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ViewContextRenderData viewContextRenderData = (ViewContextRenderData) obj;
        viewContextRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        ViewContextRenderData.ViewContext viewContext = viewContextRenderData.view_context;
        byteString.getClass();
        return new ViewContextRenderData(viewContext, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ViewContextRenderData viewContextRenderData = (ViewContextRenderData) obj;
        viewContextRenderData.getClass();
        ViewContextRenderData.ViewContext.ADAPTER.encodeWithTag(protoWriter, 1, viewContextRenderData.view_context);
        protoWriter.writeBytes(viewContextRenderData.unknownFields());
    }
}
