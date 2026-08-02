package squareup.cash.savings;

import androidx.camera.camera2.pipe.AeMode;
import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class SavingsFolderV2$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        AeMode.Companion companion = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsFolderV2(companion, (Money) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    companion = new SavingsFolderV2$FolderType$GeneralFolder((GeneralFolder) GeneralFolder.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    companion = new SavingsFolderV2$FolderType$GoalFolder((GoalFolder) GoalFolder.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    break;
                case 4:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsFolderV2 savingsFolderV2 = (SavingsFolderV2) obj;
        reverseProtoWriter.getClass();
        savingsFolderV2.getClass();
        reverseProtoWriter.writeBytes(savingsFolderV2.unknownFields());
        AeMode.Companion companion = savingsFolderV2.folder_type;
        if (companion instanceof SavingsFolderV2$FolderType$GeneralFolder) {
            GeneralFolder.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SavingsFolderV2$FolderType$GeneralFolder) companion).value);
        } else if (companion instanceof SavingsFolderV2$FolderType$GoalFolder) {
            GoalFolder.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SavingsFolderV2$FolderType$GoalFolder) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, savingsFolderV2.icon_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, savingsFolderV2.icon_accessibility_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, savingsFolderV2.icon_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, savingsFolderV2.icon_unicode);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, savingsFolderV2.owning_customer_token);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, savingsFolderV2.balance);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SavingsFolderV2 savingsFolderV2 = (SavingsFolderV2) obj;
        savingsFolderV2.getClass();
        int size$okio = savingsFolderV2.unknownFields().getSize$okio();
        AeMode.Companion companion = savingsFolderV2.folder_type;
        if (companion instanceof SavingsFolderV2$FolderType$GeneralFolder) {
            encodedSizeWithTag = GeneralFolder.ADAPTER.encodedSizeWithTag(1, ((SavingsFolderV2$FolderType$GeneralFolder) companion).value);
        } else {
            if (!(companion instanceof SavingsFolderV2$FolderType$GoalFolder)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag2 = Money.ADAPTER.encodedSizeWithTag(3, savingsFolderV2.balance) + size$okio;
                ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                return protoAdapter.encodedSizeWithTag(8, savingsFolderV2.icon_id) + protoAdapter.encodedSizeWithTag(7, savingsFolderV2.icon_accessibility_text) + protoAdapter.encodedSizeWithTag(6, savingsFolderV2.icon_name) + protoAdapter.encodedSizeWithTag(5, savingsFolderV2.icon_unicode) + protoAdapter.encodedSizeWithTag(4, savingsFolderV2.owning_customer_token) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = GoalFolder.ADAPTER.encodedSizeWithTag(2, ((SavingsFolderV2$FolderType$GoalFolder) companion).value);
        }
        size$okio += encodedSizeWithTag;
        int encodedSizeWithTag22 = Money.ADAPTER.encodedSizeWithTag(3, savingsFolderV2.balance) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(8, savingsFolderV2.icon_id) + protoAdapter2.encodedSizeWithTag(7, savingsFolderV2.icon_accessibility_text) + protoAdapter2.encodedSizeWithTag(6, savingsFolderV2.icon_name) + protoAdapter2.encodedSizeWithTag(5, savingsFolderV2.icon_unicode) + protoAdapter2.encodedSizeWithTag(4, savingsFolderV2.owning_customer_token) + encodedSizeWithTag22;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsFolderV2 savingsFolderV2 = (SavingsFolderV2) obj;
        savingsFolderV2.getClass();
        Money money = savingsFolderV2.balance;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        AeMode.Companion companion = savingsFolderV2.folder_type;
        String str = savingsFolderV2.owning_customer_token;
        String str2 = savingsFolderV2.icon_unicode;
        String str3 = savingsFolderV2.icon_name;
        String str4 = savingsFolderV2.icon_accessibility_text;
        String str5 = savingsFolderV2.icon_id;
        byteString.getClass();
        return new SavingsFolderV2(companion, money2, str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsFolderV2 savingsFolderV2 = (SavingsFolderV2) obj;
        savingsFolderV2.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 3, savingsFolderV2.balance);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, savingsFolderV2.owning_customer_token);
        protoAdapter.encodeWithTag(protoWriter, 5, savingsFolderV2.icon_unicode);
        protoAdapter.encodeWithTag(protoWriter, 6, savingsFolderV2.icon_name);
        protoAdapter.encodeWithTag(protoWriter, 7, savingsFolderV2.icon_accessibility_text);
        protoAdapter.encodeWithTag(protoWriter, 8, savingsFolderV2.icon_id);
        AeMode.Companion companion = savingsFolderV2.folder_type;
        if (companion instanceof SavingsFolderV2$FolderType$GeneralFolder) {
            GeneralFolder.ADAPTER.encodeWithTag(protoWriter, 1, ((SavingsFolderV2$FolderType$GeneralFolder) companion).value);
        } else if (companion instanceof SavingsFolderV2$FolderType$GoalFolder) {
            GoalFolder.ADAPTER.encodeWithTag(protoWriter, 2, ((SavingsFolderV2$FolderType$GoalFolder) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(savingsFolderV2.unknownFields());
    }
}
