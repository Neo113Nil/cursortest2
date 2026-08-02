package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class SavingsScreens$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsScreens((SavingsScreen) obj, (LocalizedString) obj2, (SavingsScreen) obj3, (SavingsScreen) obj4, (LocalizedString) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(SavingsScreen.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(SavingsScreen.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(SavingsScreen.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsScreens savingsScreens = (SavingsScreens) obj;
        reverseProtoWriter.getClass();
        savingsScreens.getClass();
        reverseProtoWriter.writeBytes(savingsScreens.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, savingsScreens.home_binds_to_inferred_folder_from_single_goal_rules);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, savingsScreens.general_savings_details_title);
        ProtoAdapter protoAdapter2 = SavingsScreen.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, savingsScreens.general_savings_details);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, savingsScreens.goal_details);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, savingsScreens.home_title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, savingsScreens.home);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsScreens savingsScreens = (SavingsScreens) obj;
        savingsScreens.getClass();
        int size$okio = savingsScreens.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = SavingsScreen.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, savingsScreens.home) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(6, savingsScreens.home_binds_to_inferred_folder_from_single_goal_rules) + protoAdapter2.encodedSizeWithTag(5, savingsScreens.general_savings_details_title) + protoAdapter.encodedSizeWithTag(4, savingsScreens.general_savings_details) + protoAdapter.encodedSizeWithTag(3, savingsScreens.goal_details) + protoAdapter2.encodedSizeWithTag(2, savingsScreens.home_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsScreens savingsScreens = (SavingsScreens) obj;
        savingsScreens.getClass();
        SavingsScreen savingsScreen = savingsScreens.home;
        SavingsScreen savingsScreen2 = savingsScreen != null ? (SavingsScreen) SavingsScreen.ADAPTER.redact(savingsScreen) : null;
        LocalizedString localizedString = savingsScreens.home_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        SavingsScreen savingsScreen3 = savingsScreens.goal_details;
        SavingsScreen savingsScreen4 = savingsScreen3 != null ? (SavingsScreen) SavingsScreen.ADAPTER.redact(savingsScreen3) : null;
        SavingsScreen savingsScreen5 = savingsScreens.general_savings_details;
        SavingsScreen savingsScreen6 = savingsScreen5 != null ? (SavingsScreen) SavingsScreen.ADAPTER.redact(savingsScreen5) : null;
        LocalizedString localizedString3 = savingsScreens.general_savings_details_title;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = savingsScreens.home_binds_to_inferred_folder_from_single_goal_rules;
        byteString.getClass();
        return new SavingsScreens(savingsScreen2, localizedString2, savingsScreen4, savingsScreen6, localizedString4, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsScreens savingsScreens = (SavingsScreens) obj;
        savingsScreens.getClass();
        ProtoAdapter protoAdapter = SavingsScreen.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, savingsScreens.home);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, savingsScreens.home_title);
        protoAdapter.encodeWithTag(protoWriter, 3, savingsScreens.goal_details);
        protoAdapter.encodeWithTag(protoWriter, 4, savingsScreens.general_savings_details);
        protoAdapter2.encodeWithTag(protoWriter, 5, savingsScreens.general_savings_details_title);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, savingsScreens.home_binds_to_inferred_folder_from_single_goal_rules);
        protoWriter.writeBytes(savingsScreens.unknownFields());
    }
}
