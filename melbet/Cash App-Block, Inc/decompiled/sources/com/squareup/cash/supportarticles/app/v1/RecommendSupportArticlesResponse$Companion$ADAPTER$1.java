package com.squareup.cash.supportarticles.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecommendSupportArticlesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecommendSupportArticlesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SupportLink.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecommendSupportArticlesResponse recommendSupportArticlesResponse = (RecommendSupportArticlesResponse) obj;
        reverseProtoWriter.getClass();
        recommendSupportArticlesResponse.getClass();
        reverseProtoWriter.writeBytes(recommendSupportArticlesResponse.unknownFields());
        SupportLink.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, recommendSupportArticlesResponse.links);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecommendSupportArticlesResponse recommendSupportArticlesResponse = (RecommendSupportArticlesResponse) obj;
        recommendSupportArticlesResponse.getClass();
        return SupportLink.ADAPTER.asRepeated().encodedSizeWithTag(1, recommendSupportArticlesResponse.links) + recommendSupportArticlesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecommendSupportArticlesResponse recommendSupportArticlesResponse = (RecommendSupportArticlesResponse) obj;
        recommendSupportArticlesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(recommendSupportArticlesResponse.links, SupportLink.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RecommendSupportArticlesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecommendSupportArticlesResponse recommendSupportArticlesResponse = (RecommendSupportArticlesResponse) obj;
        recommendSupportArticlesResponse.getClass();
        SupportLink.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, recommendSupportArticlesResponse.links);
        protoWriter.writeBytes(recommendSupportArticlesResponse.unknownFields());
    }
}
