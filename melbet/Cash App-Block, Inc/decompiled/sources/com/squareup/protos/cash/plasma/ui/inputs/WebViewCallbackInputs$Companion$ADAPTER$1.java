package com.squareup.protos.cash.plasma.ui.inputs;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.plasma.ui.inputs.WebViewCallbackInputs;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class WebViewCallbackInputs$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WebViewCallbackInputs(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(WebViewCallbackInputs.QueryParam.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WebViewCallbackInputs webViewCallbackInputs = (WebViewCallbackInputs) obj;
        reverseProtoWriter.getClass();
        webViewCallbackInputs.getClass();
        reverseProtoWriter.writeBytes(webViewCallbackInputs.unknownFields());
        WebViewCallbackInputs.QueryParam.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, webViewCallbackInputs.query_params);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WebViewCallbackInputs webViewCallbackInputs = (WebViewCallbackInputs) obj;
        webViewCallbackInputs.getClass();
        return WebViewCallbackInputs.QueryParam.ADAPTER.asRepeated().encodedSizeWithTag(1, webViewCallbackInputs.query_params) + webViewCallbackInputs.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WebViewCallbackInputs webViewCallbackInputs = (WebViewCallbackInputs) obj;
        webViewCallbackInputs.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(webViewCallbackInputs.query_params, WebViewCallbackInputs.QueryParam.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new WebViewCallbackInputs(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WebViewCallbackInputs webViewCallbackInputs = (WebViewCallbackInputs) obj;
        webViewCallbackInputs.getClass();
        WebViewCallbackInputs.QueryParam.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, webViewCallbackInputs.query_params);
        protoWriter.writeBytes(webViewCallbackInputs.unknownFields());
    }
}
