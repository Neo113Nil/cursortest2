package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorCustomer;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.franklin.api.Region;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecipientSelectorCustomer$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Region region;
        Boolean bool;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Region region2 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Long l = null;
        Object obj5 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSelectorCustomer(str, (Avatar) obj3, str5, (Cashtag) obj4, region2, bool2, bool3, l, (RecipientSelectorCustomer.Metadata) obj5, bool4, bool5, str2, (RecipientSelectorCustomer.C4bInfo) obj2, str3, str4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 3:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Cashtag.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 5:
                    try {
                        region2 = Region.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj2;
                        region = region2;
                        bool = bool2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str;
                    break;
                case 7:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str;
                    break;
                case 8:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 9:
                    obj5 = TransactorKt.decodeMessageOrMerge(RecipientSelectorCustomer.Metadata.ADAPTER, protoReader, obj5);
                    decode = str;
                    break;
                case 10:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str;
                    break;
                case 11:
                    bool5 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str;
                    break;
                case 12:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 13:
                    obj2 = TransactorKt.decodeMessageOrMerge(RecipientSelectorCustomer.C4bInfo.ADAPTER, protoReader, obj2);
                    decode = str;
                    break;
                case 14:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 15:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    region = region2;
                    bool = bool2;
                    decode = str;
                    obj2 = obj;
                    bool2 = bool;
                    region2 = region;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecipientSelectorCustomer recipientSelectorCustomer = (RecipientSelectorCustomer) obj;
        reverseProtoWriter.getClass();
        recipientSelectorCustomer.getClass();
        reverseProtoWriter.writeBytes(recipientSelectorCustomer.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, recipientSelectorCustomer.matched_sms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, recipientSelectorCustomer.subtitle);
        RecipientSelectorCustomer.C4bInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 13, recipientSelectorCustomer.c4b_info);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, recipientSelectorCustomer.account_holder_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, recipientSelectorCustomer.is_blocked);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, recipientSelectorCustomer.can_accept_payments);
        RecipientSelectorCustomer.Metadata.ADAPTER.encodeWithTag(reverseProtoWriter, 9, recipientSelectorCustomer.metadata);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 8, recipientSelectorCustomer.credit_card_fee_bps);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, recipientSelectorCustomer.is_business);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, recipientSelectorCustomer.is_verified);
        Region.ADAPTER.encodeWithTag(reverseProtoWriter, 5, recipientSelectorCustomer.region);
        Cashtag.ADAPTER.encodeWithTag(reverseProtoWriter, 4, recipientSelectorCustomer.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, recipientSelectorCustomer.full_name);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, recipientSelectorCustomer.avatar);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, recipientSelectorCustomer.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientSelectorCustomer recipientSelectorCustomer = (RecipientSelectorCustomer) obj;
        recipientSelectorCustomer.getClass();
        int size$okio = recipientSelectorCustomer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Region.ADAPTER.encodedSizeWithTag(5, recipientSelectorCustomer.region) + Cashtag.ADAPTER.encodedSizeWithTag(4, recipientSelectorCustomer.cashtag) + protoAdapter.encodedSizeWithTag(3, recipientSelectorCustomer.full_name) + Avatar.ADAPTER.encodedSizeWithTag(2, recipientSelectorCustomer.avatar) + protoAdapter.encodedSizeWithTag(1, recipientSelectorCustomer.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(15, recipientSelectorCustomer.matched_sms) + protoAdapter.encodedSizeWithTag(14, recipientSelectorCustomer.subtitle) + RecipientSelectorCustomer.C4bInfo.ADAPTER.encodedSizeWithTag(13, recipientSelectorCustomer.c4b_info) + protoAdapter.encodedSizeWithTag(12, recipientSelectorCustomer.account_holder_token) + protoAdapter2.encodedSizeWithTag(11, recipientSelectorCustomer.is_blocked) + protoAdapter2.encodedSizeWithTag(10, recipientSelectorCustomer.can_accept_payments) + RecipientSelectorCustomer.Metadata.ADAPTER.encodedSizeWithTag(9, recipientSelectorCustomer.metadata) + ProtoAdapter.INT64.encodedSizeWithTag(8, recipientSelectorCustomer.credit_card_fee_bps) + protoAdapter2.encodedSizeWithTag(7, recipientSelectorCustomer.is_business) + protoAdapter2.encodedSizeWithTag(6, recipientSelectorCustomer.is_verified) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientSelectorCustomer recipientSelectorCustomer = (RecipientSelectorCustomer) obj;
        recipientSelectorCustomer.getClass();
        Avatar avatar = recipientSelectorCustomer.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        RecipientSelectorCustomer.Metadata metadata = recipientSelectorCustomer.metadata;
        RecipientSelectorCustomer.Metadata metadata2 = metadata != null ? (RecipientSelectorCustomer.Metadata) RecipientSelectorCustomer.Metadata.ADAPTER.redact(metadata) : null;
        RecipientSelectorCustomer.C4bInfo c4bInfo = recipientSelectorCustomer.c4b_info;
        RecipientSelectorCustomer.C4bInfo c4bInfo2 = c4bInfo != null ? (RecipientSelectorCustomer.C4bInfo) RecipientSelectorCustomer.C4bInfo.ADAPTER.redact(c4bInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = recipientSelectorCustomer.token;
        Long l = recipientSelectorCustomer.credit_card_fee_bps;
        Boolean bool = recipientSelectorCustomer.can_accept_payments;
        String str2 = recipientSelectorCustomer.account_holder_token;
        byteString.getClass();
        return new RecipientSelectorCustomer(str, avatar2, null, null, null, null, null, l, metadata2, bool, null, str2, c4bInfo2, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSelectorCustomer recipientSelectorCustomer = (RecipientSelectorCustomer) obj;
        recipientSelectorCustomer.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, recipientSelectorCustomer.token);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 2, recipientSelectorCustomer.avatar);
        protoAdapter.encodeWithTag(protoWriter, 3, recipientSelectorCustomer.full_name);
        Cashtag.ADAPTER.encodeWithTag(protoWriter, 4, recipientSelectorCustomer.cashtag);
        Region.ADAPTER.encodeWithTag(protoWriter, 5, recipientSelectorCustomer.region);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 6, recipientSelectorCustomer.is_verified);
        protoAdapter2.encodeWithTag(protoWriter, 7, recipientSelectorCustomer.is_business);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, recipientSelectorCustomer.credit_card_fee_bps);
        RecipientSelectorCustomer.Metadata.ADAPTER.encodeWithTag(protoWriter, 9, recipientSelectorCustomer.metadata);
        protoAdapter2.encodeWithTag(protoWriter, 10, recipientSelectorCustomer.can_accept_payments);
        protoAdapter2.encodeWithTag(protoWriter, 11, recipientSelectorCustomer.is_blocked);
        protoAdapter.encodeWithTag(protoWriter, 12, recipientSelectorCustomer.account_holder_token);
        RecipientSelectorCustomer.C4bInfo.ADAPTER.encodeWithTag(protoWriter, 13, recipientSelectorCustomer.c4b_info);
        protoAdapter.encodeWithTag(protoWriter, 14, recipientSelectorCustomer.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 15, recipientSelectorCustomer.matched_sms);
        protoWriter.writeBytes(recipientSelectorCustomer.unknownFields());
    }
}
