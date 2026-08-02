package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AccountListConfig$Account$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AccountListConfig.Account((String) obj3, (String) obj4, (Avatar) obj5, m, (UiAlias) obj6, (String) obj7, (String) obj8, (Region) obj9, (Boolean) obj10, (Boolean) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj5);
                    continue;
                case 4:
                    obj = obj3;
                    obj2 = obj4;
                    m.add(UiAlias.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj6 = TransactorKt.decodeMessageOrMerge(UiAlias.ADAPTER, protoReader, obj6);
                    continue;
                case 6:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 7:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 8:
                    try {
                        obj9 = Region.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 9:
                    obj10 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 10:
                    obj11 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    break;
            }
            obj3 = obj;
            obj4 = obj2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AccountListConfig.Account account = (AccountListConfig.Account) obj;
        reverseProtoWriter.getClass();
        account.getClass();
        reverseProtoWriter.writeBytes(account.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, account.is_business);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, account.is_passkey_registered);
        Region.ADAPTER.encodeWithTag(reverseProtoWriter, 8, account.region);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, account.cash_tag);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, account.account_id);
        ProtoAdapter protoAdapter3 = UiAlias.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, account.preferred_alias);
        protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 4, account.aliases);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, account.avatar);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, account.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, account.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AccountListConfig.Account account = (AccountListConfig.Account) obj;
        account.getClass();
        int size$okio = account.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(3, account.avatar) + protoAdapter.encodedSizeWithTag(2, account.subtitle) + protoAdapter.encodedSizeWithTag(1, account.title) + size$okio;
        ProtoAdapter protoAdapter2 = UiAlias.ADAPTER;
        int encodedSizeWithTag2 = Region.ADAPTER.encodedSizeWithTag(8, account.region) + protoAdapter.encodedSizeWithTag(7, account.cash_tag) + protoAdapter.encodedSizeWithTag(6, account.account_id) + protoAdapter2.encodedSizeWithTag(5, account.preferred_alias) + protoAdapter2.asRepeated().encodedSizeWithTag(4, account.aliases) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return protoAdapter3.encodedSizeWithTag(10, account.is_business) + protoAdapter3.encodedSizeWithTag(9, account.is_passkey_registered) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AccountListConfig.Account account = (AccountListConfig.Account) obj;
        account.getClass();
        Avatar avatar = account.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        List list = account.aliases;
        ProtoAdapter protoAdapter = UiAlias.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        UiAlias uiAlias = account.preferred_alias;
        UiAlias uiAlias2 = uiAlias != null ? (UiAlias) protoAdapter.redact(uiAlias) : null;
        ByteString byteString = ByteString.EMPTY;
        Region region = account.region;
        Boolean bool = account.is_passkey_registered;
        Boolean bool2 = account.is_business;
        byteString.getClass();
        return new AccountListConfig.Account(null, null, avatar2, m1169redactElements, uiAlias2, null, null, region, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AccountListConfig.Account account = (AccountListConfig.Account) obj;
        account.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, account.title);
        protoAdapter.encodeWithTag(protoWriter, 2, account.subtitle);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 3, account.avatar);
        ProtoAdapter protoAdapter2 = UiAlias.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, account.aliases);
        protoAdapter2.encodeWithTag(protoWriter, 5, account.preferred_alias);
        protoAdapter.encodeWithTag(protoWriter, 6, account.account_id);
        protoAdapter.encodeWithTag(protoWriter, 7, account.cash_tag);
        Region.ADAPTER.encodeWithTag(protoWriter, 8, account.region);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 9, account.is_passkey_registered);
        protoAdapter3.encodeWithTag(protoWriter, 10, account.is_business);
        protoWriter.writeBytes(account.unknownFields());
    }
}
