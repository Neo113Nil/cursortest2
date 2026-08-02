package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RewardStatus$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        String str;
        Boolean bool;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Boolean bool2 = null;
        Object obj2 = null;
        String str2 = null;
        Boolean bool3 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        Integer num2 = null;
        Integer num3 = null;
        Object obj3 = null;
        RewardStatus.Expiration expiration = null;
        Integer num4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RewardStatus(bool2, num4, str2, bool3, str3, num, str4, str5, num2, num3, (Money) obj3, expiration, (ProfileRow) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 2:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 3:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool2;
                    break;
                case 4:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool2;
                    break;
                case 5:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool2;
                    break;
                case 6:
                    num2 = ProtoAdapter.INT32.decode(protoReader);
                    decode = bool2;
                    break;
                case 7:
                    num3 = ProtoAdapter.INT32.decode(protoReader);
                    decode = bool2;
                    break;
                case 8:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    decode = bool2;
                    break;
                case 9:
                    try {
                        expiration = RewardStatus.Expiration.ADAPTER.decode(protoReader);
                        decode = bool2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj2;
                        str = str2;
                        bool = bool3;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 10:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = bool2;
                    break;
                case 11:
                    num4 = ProtoAdapter.INT32.decode(protoReader);
                    decode = bool2;
                    break;
                case 12:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool2;
                    break;
                case 13:
                    obj2 = TransactorKt.decodeMessageOrMerge(ProfileRow.ADAPTER, protoReader, obj2);
                    decode = bool2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    str = str2;
                    bool = bool3;
                    decode = bool2;
                    obj2 = obj;
                    bool3 = bool;
                    str2 = str;
                    break;
            }
            bool2 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RewardStatus rewardStatus = (RewardStatus) obj;
        reverseProtoWriter.getClass();
        rewardStatus.getClass();
        reverseProtoWriter.writeBytes(rewardStatus.unknownFields());
        ProfileRow.ADAPTER.encodeWithTag(reverseProtoWriter, 13, rewardStatus.referral_status_screen);
        RewardStatus.Expiration.ADAPTER.encodeWithTag(reverseProtoWriter, 9, rewardStatus.expiration);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 8, rewardStatus.reward_payment_amount);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, rewardStatus.available_reward_payments);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, rewardStatus.completed_reward_payments);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, rewardStatus.reward_main_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, rewardStatus.reward_header_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, rewardStatus.reward_button_priority);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, rewardStatus.reward_button_text);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, rewardStatus.reward_screen_enabled);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, rewardStatus.code_entry_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, rewardStatus.minimum_code_length);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, rewardStatus.code_entry_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RewardStatus rewardStatus = (RewardStatus) obj;
        rewardStatus.getClass();
        int size$okio = rewardStatus.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rewardStatus.code_entry_enabled) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(11, rewardStatus.minimum_code_length) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        return ProfileRow.ADAPTER.encodedSizeWithTag(13, rewardStatus.referral_status_screen) + RewardStatus.Expiration.ADAPTER.encodedSizeWithTag(9, rewardStatus.expiration) + Money.ADAPTER.encodedSizeWithTag(8, rewardStatus.reward_payment_amount) + protoAdapter2.encodedSizeWithTag(7, rewardStatus.available_reward_payments) + protoAdapter2.encodedSizeWithTag(6, rewardStatus.completed_reward_payments) + protoAdapter3.encodedSizeWithTag(5, rewardStatus.reward_main_text) + protoAdapter3.encodedSizeWithTag(4, rewardStatus.reward_header_text) + protoAdapter2.encodedSizeWithTag(10, rewardStatus.reward_button_priority) + protoAdapter3.encodedSizeWithTag(3, rewardStatus.reward_button_text) + protoAdapter.encodedSizeWithTag(2, rewardStatus.reward_screen_enabled) + protoAdapter3.encodedSizeWithTag(12, rewardStatus.code_entry_client_route) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RewardStatus rewardStatus = (RewardStatus) obj;
        rewardStatus.getClass();
        Money money = rewardStatus.reward_payment_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ProfileRow profileRow = rewardStatus.referral_status_screen;
        ProfileRow profileRow2 = profileRow != null ? (ProfileRow) ProfileRow.ADAPTER.redact(profileRow) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = rewardStatus.code_entry_enabled;
        Integer num = rewardStatus.minimum_code_length;
        Boolean bool2 = rewardStatus.reward_screen_enabled;
        String str = rewardStatus.reward_button_text;
        Integer num2 = rewardStatus.reward_button_priority;
        String str2 = rewardStatus.reward_header_text;
        String str3 = rewardStatus.reward_main_text;
        Integer num3 = rewardStatus.completed_reward_payments;
        Integer num4 = rewardStatus.available_reward_payments;
        RewardStatus.Expiration expiration = rewardStatus.expiration;
        byteString.getClass();
        return new RewardStatus(bool, num, null, bool2, str, num2, str2, str3, num3, num4, money2, expiration, profileRow2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RewardStatus rewardStatus = (RewardStatus) obj;
        rewardStatus.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, rewardStatus.code_entry_enabled);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 11, rewardStatus.minimum_code_length);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 12, rewardStatus.code_entry_client_route);
        protoAdapter.encodeWithTag(protoWriter, 2, rewardStatus.reward_screen_enabled);
        protoAdapter3.encodeWithTag(protoWriter, 3, rewardStatus.reward_button_text);
        protoAdapter2.encodeWithTag(protoWriter, 10, rewardStatus.reward_button_priority);
        protoAdapter3.encodeWithTag(protoWriter, 4, rewardStatus.reward_header_text);
        protoAdapter3.encodeWithTag(protoWriter, 5, rewardStatus.reward_main_text);
        protoAdapter2.encodeWithTag(protoWriter, 6, rewardStatus.completed_reward_payments);
        protoAdapter2.encodeWithTag(protoWriter, 7, rewardStatus.available_reward_payments);
        Money.ADAPTER.encodeWithTag(protoWriter, 8, rewardStatus.reward_payment_amount);
        RewardStatus.Expiration.ADAPTER.encodeWithTag(protoWriter, 9, rewardStatus.expiration);
        ProfileRow.ADAPTER.encodeWithTag(protoWriter, 13, rewardStatus.referral_status_screen);
        protoWriter.writeBytes(rewardStatus.unknownFields());
    }
}
