package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class SavingsFolder$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SavingsFolder((String) obj, (GoalFolder) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(GoalFolder.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsFolder savingsFolder = (SavingsFolder) obj;
        reverseProtoWriter.getClass();
        savingsFolder.getClass();
        reverseProtoWriter.writeBytes(savingsFolder.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, savingsFolder.owning_customer_token);
        GoalFolder.ADAPTER.encodeWithTag(reverseProtoWriter, 2, savingsFolder.active_goal);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, savingsFolder.instrument_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsFolder savingsFolder = (SavingsFolder) obj;
        savingsFolder.getClass();
        int size$okio = savingsFolder.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, savingsFolder.owning_customer_token) + GoalFolder.ADAPTER.encodedSizeWithTag(2, savingsFolder.active_goal) + protoAdapter.encodedSizeWithTag(1, savingsFolder.instrument_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsFolder savingsFolder = (SavingsFolder) obj;
        savingsFolder.getClass();
        GoalFolder goalFolder = savingsFolder.active_goal;
        GoalFolder goalFolder2 = goalFolder != null ? (GoalFolder) GoalFolder.ADAPTER.redact(goalFolder) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = savingsFolder.instrument_token;
        String str2 = savingsFolder.owning_customer_token;
        byteString.getClass();
        return new SavingsFolder(str, goalFolder2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsFolder savingsFolder = (SavingsFolder) obj;
        savingsFolder.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, savingsFolder.instrument_token);
        GoalFolder.ADAPTER.encodeWithTag(protoWriter, 2, savingsFolder.active_goal);
        protoAdapter.encodeWithTag(protoWriter, 3, savingsFolder.owning_customer_token);
        protoWriter.writeBytes(savingsFolder.unknownFields());
    }
}
