package com.squareup.protos.cash.janus.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FullAccount$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FullAccount((String) obj, (String) obj2, (String) obj3, (Avatar) obj4, (Boolean) obj5, (String) obj6, (Long) obj7, (String) obj8, (String) obj9, (Boolean) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj10 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FullAccount fullAccount = (FullAccount) obj;
        reverseProtoWriter.getClass();
        fullAccount.getClass();
        reverseProtoWriter.writeBytes(fullAccount.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, fullAccount.is_dependent);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, fullAccount.account_holder_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, fullAccount.business_category);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, fullAccount.joined_date_millis);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, fullAccount.switching_identifier);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, fullAccount.is_business);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 4, fullAccount.avatar);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, fullAccount.cash_tag);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, fullAccount.title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, fullAccount.account_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FullAccount fullAccount = (FullAccount) obj;
        fullAccount.getClass();
        int size$okio = fullAccount.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(4, fullAccount.avatar) + protoAdapter.encodedSizeWithTag(3, fullAccount.cash_tag) + protoAdapter.encodedSizeWithTag(2, fullAccount.title) + protoAdapter.encodedSizeWithTag(1, fullAccount.account_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(10, fullAccount.is_dependent) + protoAdapter.encodedSizeWithTag(9, fullAccount.account_holder_token) + protoAdapter.encodedSizeWithTag(8, fullAccount.business_category) + ProtoAdapter.INT64.encodedSizeWithTag(7, fullAccount.joined_date_millis) + protoAdapter.encodedSizeWithTag(6, fullAccount.switching_identifier) + protoAdapter2.encodedSizeWithTag(5, fullAccount.is_business) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FullAccount fullAccount = (FullAccount) obj;
        fullAccount.getClass();
        Avatar avatar = fullAccount.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = fullAccount.account_id;
        Boolean bool = fullAccount.is_business;
        String str2 = fullAccount.switching_identifier;
        Long l = fullAccount.joined_date_millis;
        String str3 = fullAccount.business_category;
        String str4 = fullAccount.account_holder_token;
        Boolean bool2 = fullAccount.is_dependent;
        byteString.getClass();
        return new FullAccount(str, null, null, avatar2, bool, str2, l, str3, str4, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FullAccount fullAccount = (FullAccount) obj;
        fullAccount.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, fullAccount.account_id);
        protoAdapter.encodeWithTag(protoWriter, 2, fullAccount.title);
        protoAdapter.encodeWithTag(protoWriter, 3, fullAccount.cash_tag);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 4, fullAccount.avatar);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, fullAccount.is_business);
        protoAdapter.encodeWithTag(protoWriter, 6, fullAccount.switching_identifier);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, fullAccount.joined_date_millis);
        protoAdapter.encodeWithTag(protoWriter, 8, fullAccount.business_category);
        protoAdapter.encodeWithTag(protoWriter, 9, fullAccount.account_holder_token);
        protoAdapter2.encodeWithTag(protoWriter, 10, fullAccount.is_dependent);
        protoWriter.writeBytes(fullAccount.unknownFields());
    }
}
