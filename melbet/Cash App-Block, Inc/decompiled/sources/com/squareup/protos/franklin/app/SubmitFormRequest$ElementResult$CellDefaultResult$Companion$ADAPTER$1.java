package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$CellDefaultResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult.CellDefaultResult((String) obj2, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitFormRequest.ElementResult.CellDefaultResult cellDefaultResult = (SubmitFormRequest.ElementResult.CellDefaultResult) obj;
        reverseProtoWriter.getClass();
        cellDefaultResult.getClass();
        reverseProtoWriter.writeBytes(cellDefaultResult.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, cellDefaultResult.selection_group_id);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, cellDefaultResult.is_checked);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult.CellDefaultResult cellDefaultResult = (SubmitFormRequest.ElementResult.CellDefaultResult) obj;
        cellDefaultResult.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, cellDefaultResult.selection_group_id) + ProtoAdapter.BOOL.encodedSizeWithTag(1, cellDefaultResult.is_checked) + cellDefaultResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitFormRequest.ElementResult.CellDefaultResult cellDefaultResult = (SubmitFormRequest.ElementResult.CellDefaultResult) obj;
        cellDefaultResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = cellDefaultResult.is_checked;
        String str = cellDefaultResult.selection_group_id;
        byteString.getClass();
        return new SubmitFormRequest.ElementResult.CellDefaultResult(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult.CellDefaultResult cellDefaultResult = (SubmitFormRequest.ElementResult.CellDefaultResult) obj;
        cellDefaultResult.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, cellDefaultResult.is_checked);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cellDefaultResult.selection_group_id);
        protoWriter.writeBytes(cellDefaultResult.unknownFields());
    }
}
