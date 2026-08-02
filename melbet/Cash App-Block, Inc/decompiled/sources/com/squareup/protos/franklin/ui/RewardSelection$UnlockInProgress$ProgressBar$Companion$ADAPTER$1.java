package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RewardSelection$UnlockInProgress$ProgressBar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RewardSelection.UnlockInProgress.ProgressBar((Integer) obj, (Integer) obj2, (RewardSelection.UnlockInProgress.ProgressBar.Type) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = RewardSelection.UnlockInProgress.ProgressBar.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RewardSelection.UnlockInProgress.ProgressBar progressBar = (RewardSelection.UnlockInProgress.ProgressBar) obj;
        reverseProtoWriter.getClass();
        progressBar.getClass();
        reverseProtoWriter.writeBytes(progressBar.unknownFields());
        RewardSelection.UnlockInProgress.ProgressBar.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 3, progressBar.f1399type);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, progressBar.target);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, progressBar.current);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RewardSelection.UnlockInProgress.ProgressBar progressBar = (RewardSelection.UnlockInProgress.ProgressBar) obj;
        progressBar.getClass();
        int size$okio = progressBar.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return RewardSelection.UnlockInProgress.ProgressBar.Type.ADAPTER.encodedSizeWithTag(3, progressBar.f1399type) + protoAdapter.encodedSizeWithTag(2, progressBar.target) + protoAdapter.encodedSizeWithTag(1, progressBar.current) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RewardSelection.UnlockInProgress.ProgressBar progressBar = (RewardSelection.UnlockInProgress.ProgressBar) obj;
        progressBar.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = progressBar.current;
        Integer num2 = progressBar.target;
        RewardSelection.UnlockInProgress.ProgressBar.Type type2 = progressBar.f1399type;
        byteString.getClass();
        return new RewardSelection.UnlockInProgress.ProgressBar(num, num2, type2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RewardSelection.UnlockInProgress.ProgressBar progressBar = (RewardSelection.UnlockInProgress.ProgressBar) obj;
        progressBar.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, progressBar.current);
        protoAdapter.encodeWithTag(protoWriter, 2, progressBar.target);
        RewardSelection.UnlockInProgress.ProgressBar.Type.ADAPTER.encodeWithTag(protoWriter, 3, progressBar.f1399type);
        protoWriter.writeBytes(progressBar.unknownFields());
    }
}
