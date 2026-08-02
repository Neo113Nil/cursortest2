package com.squareup.protos.wire.roster.mds;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Names$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Names((Name) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Name.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(Name.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Names names = (Names) obj;
        reverseProtoWriter.getClass();
        names.getClass();
        reverseProtoWriter.writeBytes(names.unknownFields());
        ProtoAdapter protoAdapter = Name.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, names.others);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, names.primary);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Names names = (Names) obj;
        names.getClass();
        int size$okio = names.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Name.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, names.others) + protoAdapter.encodedSizeWithTag(1, names.primary) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Names names = (Names) obj;
        names.getClass();
        Name name = names.primary;
        Name name2 = name != null ? (Name) Name.ADAPTER.redact(name) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(names.others, Name.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Names(name2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Names names = (Names) obj;
        names.getClass();
        ProtoAdapter protoAdapter = Name.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, names.primary);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, names.others);
        protoWriter.writeBytes(names.unknownFields());
    }
}
