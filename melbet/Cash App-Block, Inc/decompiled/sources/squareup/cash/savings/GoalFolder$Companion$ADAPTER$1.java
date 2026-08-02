package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class GoalFolder$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GoalFolder((String) obj, (Boolean) obj2, (Money) obj3, (String) obj4, (String) obj5, (String) obj6, (Integer) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GoalFolder goalFolder = (GoalFolder) obj;
        reverseProtoWriter.getClass();
        goalFolder.getClass();
        reverseProtoWriter.writeBytes(goalFolder.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, goalFolder.goal_flow_parameters);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 7, goalFolder.goal_progress_percentage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, goalFolder.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, goalFolder.completion_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, goalFolder.icon_unicode);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, goalFolder.goal_amount);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, goalFolder.met_goal);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, goalFolder.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GoalFolder goalFolder = (GoalFolder) obj;
        goalFolder.getClass();
        int size$okio = goalFolder.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(8, goalFolder.goal_flow_parameters) + ProtoAdapter.INT32.encodedSizeWithTag(7, goalFolder.goal_progress_percentage) + protoAdapter.encodedSizeWithTag(6, goalFolder.label) + protoAdapter.encodedSizeWithTag(5, goalFolder.completion_token) + protoAdapter.encodedSizeWithTag(4, goalFolder.icon_unicode) + Money.ADAPTER.encodedSizeWithTag(3, goalFolder.goal_amount) + ProtoAdapter.BOOL.encodedSizeWithTag(2, goalFolder.met_goal) + protoAdapter.encodedSizeWithTag(1, goalFolder.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GoalFolder goalFolder = (GoalFolder) obj;
        goalFolder.getClass();
        Money money = goalFolder.goal_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = goalFolder.token;
        Boolean bool = goalFolder.met_goal;
        String str2 = goalFolder.icon_unicode;
        String str3 = goalFolder.completion_token;
        String str4 = goalFolder.label;
        Integer num = goalFolder.goal_progress_percentage;
        String str5 = goalFolder.goal_flow_parameters;
        byteString.getClass();
        return new GoalFolder(str, bool, money2, str2, str3, str4, num, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GoalFolder goalFolder = (GoalFolder) obj;
        goalFolder.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, goalFolder.token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, goalFolder.met_goal);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, goalFolder.goal_amount);
        protoAdapter.encodeWithTag(protoWriter, 4, goalFolder.icon_unicode);
        protoAdapter.encodeWithTag(protoWriter, 5, goalFolder.completion_token);
        protoAdapter.encodeWithTag(protoWriter, 6, goalFolder.label);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, goalFolder.goal_progress_percentage);
        protoAdapter.encodeWithTag(protoWriter, 8, goalFolder.goal_flow_parameters);
        protoWriter.writeBytes(goalFolder.unknownFields());
    }
}
