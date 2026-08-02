package com.squareup.protos.cash.discover.api.app.v1.message;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.PreloadRequestContext;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetDiscoverContentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDiscoverContentResponse(m, (Integer) obj, (String) obj2, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Section.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                arrayList.add(PreloadRequestContext.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList2.add(Section.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDiscoverContentResponse getDiscoverContentResponse = (GetDiscoverContentResponse) obj;
        reverseProtoWriter.getClass();
        getDiscoverContentResponse.getClass();
        reverseProtoWriter.writeBytes(getDiscoverContentResponse.unknownFields());
        ProtoAdapter protoAdapter = Section.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, getDiscoverContentResponse.empty_search_sections);
        PreloadRequestContext.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, getDiscoverContentResponse.preload_request_contexts);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, getDiscoverContentResponse.screen_title);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, getDiscoverContentResponse.ttl_in_sec);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, getDiscoverContentResponse.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDiscoverContentResponse getDiscoverContentResponse = (GetDiscoverContentResponse) obj;
        getDiscoverContentResponse.getClass();
        int size$okio = getDiscoverContentResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Section.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(5, getDiscoverContentResponse.empty_search_sections) + PreloadRequestContext.ADAPTER.asRepeated().encodedSizeWithTag(4, getDiscoverContentResponse.preload_request_contexts) + ProtoAdapter.STRING.encodedSizeWithTag(3, getDiscoverContentResponse.screen_title) + ProtoAdapter.INT32.encodedSizeWithTag(2, getDiscoverContentResponse.ttl_in_sec) + protoAdapter.asRepeated().encodedSizeWithTag(1, getDiscoverContentResponse.sections) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDiscoverContentResponse getDiscoverContentResponse = (GetDiscoverContentResponse) obj;
        getDiscoverContentResponse.getClass();
        List list = getDiscoverContentResponse.sections;
        ProtoAdapter protoAdapter = Section.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getDiscoverContentResponse.preload_request_contexts, PreloadRequestContext.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(getDiscoverContentResponse.empty_search_sections, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        Integer num = getDiscoverContentResponse.ttl_in_sec;
        String str = getDiscoverContentResponse.screen_title;
        byteString.getClass();
        return new GetDiscoverContentResponse(m1169redactElements, num, str, m1169redactElements2, m1169redactElements3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDiscoverContentResponse getDiscoverContentResponse = (GetDiscoverContentResponse) obj;
        getDiscoverContentResponse.getClass();
        ProtoAdapter protoAdapter = Section.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, getDiscoverContentResponse.sections);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getDiscoverContentResponse.ttl_in_sec);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getDiscoverContentResponse.screen_title);
        PreloadRequestContext.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getDiscoverContentResponse.preload_request_contexts);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, getDiscoverContentResponse.empty_search_sections);
        protoWriter.writeBytes(getDiscoverContentResponse.unknownFields());
    }
}
