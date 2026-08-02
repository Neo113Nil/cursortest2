package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEditorialResponse((String) obj, (String) obj2, m, (GetEditorialResponse.ShareLinkInfo) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(GetEditorialResponse.EditorialContent.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(GetEditorialResponse.ShareLinkInfo.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse getEditorialResponse = (GetEditorialResponse) obj;
        reverseProtoWriter.getClass();
        getEditorialResponse.getClass();
        reverseProtoWriter.writeBytes(getEditorialResponse.unknownFields());
        GetEditorialResponse.ShareLinkInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getEditorialResponse.share_link_info);
        GetEditorialResponse.EditorialContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getEditorialResponse.contents);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getEditorialResponse.share_link_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getEditorialResponse.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEditorialResponse getEditorialResponse = (GetEditorialResponse) obj;
        getEditorialResponse.getClass();
        int size$okio = getEditorialResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return GetEditorialResponse.ShareLinkInfo.ADAPTER.encodedSizeWithTag(4, getEditorialResponse.share_link_info) + GetEditorialResponse.EditorialContent.ADAPTER.asRepeated().encodedSizeWithTag(3, getEditorialResponse.contents) + protoAdapter.encodedSizeWithTag(2, getEditorialResponse.share_link_url) + protoAdapter.encodedSizeWithTag(1, getEditorialResponse.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse getEditorialResponse = (GetEditorialResponse) obj;
        getEditorialResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getEditorialResponse.contents, GetEditorialResponse.EditorialContent.ADAPTER);
        GetEditorialResponse.ShareLinkInfo shareLinkInfo = getEditorialResponse.share_link_info;
        GetEditorialResponse.ShareLinkInfo shareLinkInfo2 = shareLinkInfo != null ? (GetEditorialResponse.ShareLinkInfo) GetEditorialResponse.ShareLinkInfo.ADAPTER.redact(shareLinkInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getEditorialResponse.title;
        String str2 = getEditorialResponse.share_link_url;
        byteString.getClass();
        return new GetEditorialResponse(str, str2, m1169redactElements, shareLinkInfo2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse getEditorialResponse = (GetEditorialResponse) obj;
        getEditorialResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getEditorialResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 2, getEditorialResponse.share_link_url);
        GetEditorialResponse.EditorialContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getEditorialResponse.contents);
        GetEditorialResponse.ShareLinkInfo.ADAPTER.encodeWithTag(protoWriter, 4, getEditorialResponse.share_link_info);
        protoWriter.writeBytes(getEditorialResponse.unknownFields());
    }
}
