package com.squareup.protos.cash.janus.api.trusthub;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.CellDefault;
import squareup.cash.ui.arcade.elements.HeroHeader;

/* loaded from: classes7.dex */
public final class GetTrustHubResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetTrustHubResponse((StatusIndicator) obj, (HeroHeader) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = StatusIndicator.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(HeroHeader.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CellDefault.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetTrustHubResponse getTrustHubResponse = (GetTrustHubResponse) obj;
        reverseProtoWriter.getClass();
        getTrustHubResponse.getClass();
        reverseProtoWriter.writeBytes(getTrustHubResponse.unknownFields());
        CellDefault.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getTrustHubResponse.alerts);
        HeroHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getTrustHubResponse.header);
        StatusIndicator.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getTrustHubResponse.indicator);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetTrustHubResponse getTrustHubResponse = (GetTrustHubResponse) obj;
        getTrustHubResponse.getClass();
        return CellDefault.ADAPTER.asRepeated().encodedSizeWithTag(3, getTrustHubResponse.alerts) + HeroHeader.ADAPTER.encodedSizeWithTag(2, getTrustHubResponse.header) + StatusIndicator.ADAPTER.encodedSizeWithTag(1, getTrustHubResponse.indicator) + getTrustHubResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetTrustHubResponse getTrustHubResponse = (GetTrustHubResponse) obj;
        getTrustHubResponse.getClass();
        HeroHeader heroHeader = getTrustHubResponse.header;
        HeroHeader heroHeader2 = heroHeader != null ? (HeroHeader) HeroHeader.ADAPTER.redact(heroHeader) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getTrustHubResponse.alerts, CellDefault.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        StatusIndicator statusIndicator = getTrustHubResponse.indicator;
        byteString.getClass();
        return new GetTrustHubResponse(statusIndicator, heroHeader2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetTrustHubResponse getTrustHubResponse = (GetTrustHubResponse) obj;
        getTrustHubResponse.getClass();
        StatusIndicator.ADAPTER.encodeWithTag(protoWriter, 1, getTrustHubResponse.indicator);
        HeroHeader.ADAPTER.encodeWithTag(protoWriter, 2, getTrustHubResponse.header);
        CellDefault.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getTrustHubResponse.alerts);
        protoWriter.writeBytes(getTrustHubResponse.unknownFields());
    }
}
