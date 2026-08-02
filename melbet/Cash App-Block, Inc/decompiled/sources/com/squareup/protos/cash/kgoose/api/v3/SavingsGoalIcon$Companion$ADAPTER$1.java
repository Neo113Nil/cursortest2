package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/SavingsGoalIcon$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsGoalIcon;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavingsGoalIcon$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsGoalIcon((String) obj, (Float) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.FLOAT.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsGoalIcon savingsGoalIcon = (SavingsGoalIcon) obj;
        reverseProtoWriter.getClass();
        savingsGoalIcon.getClass();
        reverseProtoWriter.writeBytes(savingsGoalIcon.unknownFields());
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 2, savingsGoalIcon.progress);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, savingsGoalIcon.icon_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsGoalIcon savingsGoalIcon = (SavingsGoalIcon) obj;
        savingsGoalIcon.getClass();
        return ProtoAdapter.FLOAT.encodedSizeWithTag(2, savingsGoalIcon.progress) + ProtoAdapter.STRING.encodedSizeWithTag(1, savingsGoalIcon.icon_id) + savingsGoalIcon.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsGoalIcon savingsGoalIcon = (SavingsGoalIcon) obj;
        savingsGoalIcon.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = savingsGoalIcon.icon_id;
        Float f = savingsGoalIcon.progress;
        byteString.getClass();
        return new SavingsGoalIcon(str, f, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsGoalIcon savingsGoalIcon = (SavingsGoalIcon) obj;
        savingsGoalIcon.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, savingsGoalIcon.icon_id);
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, savingsGoalIcon.progress);
        protoWriter.writeBytes(savingsGoalIcon.unknownFields());
    }
}
