package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GetNextBestActionResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetNextBestActionResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetNextBestActionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetNextBestActionResponse((NextBestAction) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(NextBestAction.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(NextBestAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetNextBestActionResponse getNextBestActionResponse = (GetNextBestActionResponse) obj;
        reverseProtoWriter.getClass();
        getNextBestActionResponse.getClass();
        reverseProtoWriter.writeBytes(getNextBestActionResponse.unknownFields());
        ProtoAdapter protoAdapter = NextBestAction.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, getNextBestActionResponse.actions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getNextBestActionResponse.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetNextBestActionResponse getNextBestActionResponse = (GetNextBestActionResponse) obj;
        getNextBestActionResponse.getClass();
        int size$okio = getNextBestActionResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = NextBestAction.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, getNextBestActionResponse.actions) + protoAdapter.encodedSizeWithTag(1, getNextBestActionResponse.action) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetNextBestActionResponse getNextBestActionResponse = (GetNextBestActionResponse) obj;
        getNextBestActionResponse.getClass();
        NextBestAction nextBestAction = getNextBestActionResponse.action;
        NextBestAction nextBestAction2 = nextBestAction != null ? (NextBestAction) NextBestAction.ADAPTER.redact(nextBestAction) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getNextBestActionResponse.actions, NextBestAction.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetNextBestActionResponse(nextBestAction2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetNextBestActionResponse getNextBestActionResponse = (GetNextBestActionResponse) obj;
        getNextBestActionResponse.getClass();
        ProtoAdapter protoAdapter = NextBestAction.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, getNextBestActionResponse.action);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, getNextBestActionResponse.actions);
        protoWriter.writeBytes(getNextBestActionResponse.unknownFields());
    }
}
