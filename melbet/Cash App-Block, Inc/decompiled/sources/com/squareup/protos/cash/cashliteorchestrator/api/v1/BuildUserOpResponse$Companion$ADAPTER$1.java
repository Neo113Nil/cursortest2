package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BuildUserOpResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BuildUserOpResponse(m, (Chain) obj, (Chain) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Call.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                try {
                    obj = Chain.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = Chain.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BuildUserOpResponse buildUserOpResponse = (BuildUserOpResponse) obj;
        reverseProtoWriter.getClass();
        buildUserOpResponse.getClass();
        reverseProtoWriter.writeBytes(buildUserOpResponse.unknownFields());
        ProtoAdapter protoAdapter = Chain.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, buildUserOpResponse.dest_chain);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, buildUserOpResponse.source_chain);
        Call.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, buildUserOpResponse.calls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BuildUserOpResponse buildUserOpResponse = (BuildUserOpResponse) obj;
        buildUserOpResponse.getClass();
        int encodedSizeWithTag = Call.ADAPTER.asRepeated().encodedSizeWithTag(1, buildUserOpResponse.calls) + buildUserOpResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Chain.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, buildUserOpResponse.dest_chain) + protoAdapter.encodedSizeWithTag(2, buildUserOpResponse.source_chain) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BuildUserOpResponse buildUserOpResponse = (BuildUserOpResponse) obj;
        buildUserOpResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(buildUserOpResponse.calls, Call.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Chain chain = buildUserOpResponse.source_chain;
        Chain chain2 = buildUserOpResponse.dest_chain;
        byteString.getClass();
        return new BuildUserOpResponse(m1169redactElements, chain, chain2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BuildUserOpResponse buildUserOpResponse = (BuildUserOpResponse) obj;
        buildUserOpResponse.getClass();
        Call.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, buildUserOpResponse.calls);
        ProtoAdapter protoAdapter = Chain.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, buildUserOpResponse.source_chain);
        protoAdapter.encodeWithTag(protoWriter, 3, buildUserOpResponse.dest_chain);
        protoWriter.writeBytes(buildUserOpResponse.unknownFields());
    }
}
