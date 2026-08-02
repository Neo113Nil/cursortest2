package com.squareup.protos.invest.ui;

import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Section$Row$MoreInfo$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Section.Row.MoreInfo((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section.Row.MoreInfo moreInfo = (Section.Row.MoreInfo) obj;
        reverseProtoWriter.getClass();
        moreInfo.getClass();
        reverseProtoWriter.writeBytes(moreInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, moreInfo.url_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, moreInfo.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, moreInfo.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, moreInfo.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section.Row.MoreInfo moreInfo = (Section.Row.MoreInfo) obj;
        moreInfo.getClass();
        int size$okio = moreInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, moreInfo.url_text) + protoAdapter.encodedSizeWithTag(3, moreInfo.url) + protoAdapter.encodedSizeWithTag(2, moreInfo.text) + protoAdapter.encodedSizeWithTag(1, moreInfo.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section.Row.MoreInfo moreInfo = (Section.Row.MoreInfo) obj;
        moreInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = moreInfo.title;
        String str2 = moreInfo.text;
        String str3 = moreInfo.url;
        String str4 = moreInfo.url_text;
        byteString.getClass();
        return new Section.Row.MoreInfo(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section.Row.MoreInfo moreInfo = (Section.Row.MoreInfo) obj;
        moreInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, moreInfo.title);
        protoAdapter.encodeWithTag(protoWriter, 2, moreInfo.text);
        protoAdapter.encodeWithTag(protoWriter, 3, moreInfo.url);
        protoAdapter.encodeWithTag(protoWriter, 4, moreInfo.url_text);
        protoWriter.writeBytes(moreInfo.unknownFields());
    }
}
