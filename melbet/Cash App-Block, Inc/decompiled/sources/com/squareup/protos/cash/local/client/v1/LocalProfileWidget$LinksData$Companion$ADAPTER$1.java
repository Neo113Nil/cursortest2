package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$LinksData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalProfileWidget.LinksData(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalProfileWidget.LinksData.Link.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalProfileWidget.LinksData linksData = (LocalProfileWidget.LinksData) obj;
        reverseProtoWriter.getClass();
        linksData.getClass();
        reverseProtoWriter.writeBytes(linksData.unknownFields());
        LocalProfileWidget.LinksData.Link.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, linksData.links);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalProfileWidget.LinksData linksData = (LocalProfileWidget.LinksData) obj;
        linksData.getClass();
        return LocalProfileWidget.LinksData.Link.ADAPTER.asRepeated().encodedSizeWithTag(1, linksData.links) + linksData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalProfileWidget.LinksData linksData = (LocalProfileWidget.LinksData) obj;
        linksData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(linksData.links, LocalProfileWidget.LinksData.Link.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalProfileWidget.LinksData(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalProfileWidget.LinksData linksData = (LocalProfileWidget.LinksData) obj;
        linksData.getClass();
        LocalProfileWidget.LinksData.Link.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, linksData.links);
        protoWriter.writeBytes(linksData.unknownFields());
    }
}
