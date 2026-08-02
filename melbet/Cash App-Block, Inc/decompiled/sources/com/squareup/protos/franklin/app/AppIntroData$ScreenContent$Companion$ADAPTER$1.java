package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.AppIntroData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AppIntroData$ScreenContent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = AppIntroData.Panel.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str == null) {
            TransactorKt.missingRequiredFields(obj, "content_id");
            throw null;
        }
        AppIntroData.Panel panel = (AppIntroData.Panel) obj2;
        if (panel == null) {
            TransactorKt.missingRequiredFields(obj2, "panel");
            throw null;
        }
        String str2 = (String) obj3;
        if (str2 == null) {
            TransactorKt.missingRequiredFields(obj3, "content_image_url");
            throw null;
        }
        String str3 = (String) obj4;
        if (str3 != null) {
            return new AppIntroData.ScreenContent(str, panel, str2, str3, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj4, "title_text");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppIntroData.ScreenContent screenContent = (AppIntroData.ScreenContent) obj;
        reverseProtoWriter.getClass();
        screenContent.getClass();
        reverseProtoWriter.writeBytes(screenContent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, screenContent.title_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, screenContent.content_image_url);
        AppIntroData.Panel.ADAPTER.encodeWithTag(reverseProtoWriter, 2, screenContent.panel);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, screenContent.content_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppIntroData.ScreenContent screenContent = (AppIntroData.ScreenContent) obj;
        screenContent.getClass();
        int size$okio = screenContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, screenContent.title_text) + protoAdapter.encodedSizeWithTag(3, screenContent.content_image_url) + AppIntroData.Panel.ADAPTER.encodedSizeWithTag(2, screenContent.panel) + protoAdapter.encodedSizeWithTag(1, screenContent.content_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppIntroData.ScreenContent screenContent = (AppIntroData.ScreenContent) obj;
        screenContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = screenContent.content_id;
        AppIntroData.Panel panel = screenContent.panel;
        String str2 = screenContent.content_image_url;
        String str3 = screenContent.title_text;
        str.getClass();
        panel.getClass();
        str2.getClass();
        str3.getClass();
        byteString.getClass();
        return new AppIntroData.ScreenContent(str, panel, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppIntroData.ScreenContent screenContent = (AppIntroData.ScreenContent) obj;
        screenContent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, screenContent.content_id);
        AppIntroData.Panel.ADAPTER.encodeWithTag(protoWriter, 2, screenContent.panel);
        protoAdapter.encodeWithTag(protoWriter, 3, screenContent.content_image_url);
        protoAdapter.encodeWithTag(protoWriter, 4, screenContent.title_text);
        protoWriter.writeBytes(screenContent.unknownFields());
    }
}
