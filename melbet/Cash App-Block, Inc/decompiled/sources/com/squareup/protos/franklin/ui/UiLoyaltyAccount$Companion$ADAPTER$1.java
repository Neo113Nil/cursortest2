package com.squareup.protos.franklin.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiLoyaltyAccount$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiLoyaltyAccount((String) obj, (String) obj2, (Long) obj3, (Long) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 5) {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 6) {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj6 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiLoyaltyAccount uiLoyaltyAccount = (UiLoyaltyAccount) obj;
        reverseProtoWriter.getClass();
        uiLoyaltyAccount.getClass();
        reverseProtoWriter.writeBytes(uiLoyaltyAccount.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, uiLoyaltyAccount.loyalty_program_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, uiLoyaltyAccount.account_status_url);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, uiLoyaltyAccount.last_time_visited);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, uiLoyaltyAccount.points_earned);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, uiLoyaltyAccount.phone_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, uiLoyaltyAccount.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiLoyaltyAccount uiLoyaltyAccount = (UiLoyaltyAccount) obj;
        uiLoyaltyAccount.getClass();
        int size$okio = uiLoyaltyAccount.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, uiLoyaltyAccount.phone_number) + protoAdapter.encodedSizeWithTag(1, uiLoyaltyAccount.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(7, uiLoyaltyAccount.loyalty_program_id) + protoAdapter.encodedSizeWithTag(6, uiLoyaltyAccount.account_status_url) + protoAdapter2.encodedSizeWithTag(5, uiLoyaltyAccount.last_time_visited) + protoAdapter2.encodedSizeWithTag(4, uiLoyaltyAccount.points_earned) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiLoyaltyAccount uiLoyaltyAccount = (UiLoyaltyAccount) obj;
        uiLoyaltyAccount.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = uiLoyaltyAccount.id;
        Long l = uiLoyaltyAccount.points_earned;
        Long l2 = uiLoyaltyAccount.last_time_visited;
        String str2 = uiLoyaltyAccount.account_status_url;
        String str3 = uiLoyaltyAccount.loyalty_program_id;
        byteString.getClass();
        return new UiLoyaltyAccount(str, null, l, l2, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiLoyaltyAccount uiLoyaltyAccount = (UiLoyaltyAccount) obj;
        uiLoyaltyAccount.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, uiLoyaltyAccount.id);
        protoAdapter.encodeWithTag(protoWriter, 3, uiLoyaltyAccount.phone_number);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 4, uiLoyaltyAccount.points_earned);
        protoAdapter2.encodeWithTag(protoWriter, 5, uiLoyaltyAccount.last_time_visited);
        protoAdapter.encodeWithTag(protoWriter, 6, uiLoyaltyAccount.account_status_url);
        protoAdapter.encodeWithTag(protoWriter, 7, uiLoyaltyAccount.loyalty_program_id);
        protoWriter.writeBytes(uiLoyaltyAccount.unknownFields());
    }
}
