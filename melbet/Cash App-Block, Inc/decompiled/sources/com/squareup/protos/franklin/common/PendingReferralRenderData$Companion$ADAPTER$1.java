package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.PendingReferralRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PendingReferralRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PendingReferralRenderData((PendingReferralRenderData.Role) obj, (PendingReferralRenderData.State) obj2, (String) obj3, (String) obj4, (Long) obj5, (LocalizableString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = PendingReferralRenderData.Role.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    try {
                        obj2 = PendingReferralRenderData.State.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PendingReferralRenderData pendingReferralRenderData = (PendingReferralRenderData) obj;
        reverseProtoWriter.getClass();
        pendingReferralRenderData.getClass();
        reverseProtoWriter.writeBytes(pendingReferralRenderData.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 6, pendingReferralRenderData.localizable_instruction_text);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, pendingReferralRenderData.expires_at);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, pendingReferralRenderData.expires_in_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, pendingReferralRenderData.instruction_text);
        PendingReferralRenderData.State.ADAPTER.encodeWithTag(reverseProtoWriter, 2, pendingReferralRenderData.state);
        PendingReferralRenderData.Role.ADAPTER.encodeWithTag(reverseProtoWriter, 1, pendingReferralRenderData.role);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PendingReferralRenderData pendingReferralRenderData = (PendingReferralRenderData) obj;
        pendingReferralRenderData.getClass();
        int encodedSizeWithTag = PendingReferralRenderData.State.ADAPTER.encodedSizeWithTag(2, pendingReferralRenderData.state) + PendingReferralRenderData.Role.ADAPTER.encodedSizeWithTag(1, pendingReferralRenderData.role) + pendingReferralRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(6, pendingReferralRenderData.localizable_instruction_text) + ProtoAdapter.INT64.encodedSizeWithTag(5, pendingReferralRenderData.expires_at) + protoAdapter.encodedSizeWithTag(4, pendingReferralRenderData.expires_in_text) + protoAdapter.encodedSizeWithTag(3, pendingReferralRenderData.instruction_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PendingReferralRenderData pendingReferralRenderData = (PendingReferralRenderData) obj;
        pendingReferralRenderData.getClass();
        LocalizableString localizableString = pendingReferralRenderData.localizable_instruction_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        PendingReferralRenderData.Role role = pendingReferralRenderData.role;
        PendingReferralRenderData.State state = pendingReferralRenderData.state;
        String str = pendingReferralRenderData.instruction_text;
        String str2 = pendingReferralRenderData.expires_in_text;
        Long l = pendingReferralRenderData.expires_at;
        byteString.getClass();
        return new PendingReferralRenderData(role, state, str, str2, l, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PendingReferralRenderData pendingReferralRenderData = (PendingReferralRenderData) obj;
        pendingReferralRenderData.getClass();
        PendingReferralRenderData.Role.ADAPTER.encodeWithTag(protoWriter, 1, pendingReferralRenderData.role);
        PendingReferralRenderData.State.ADAPTER.encodeWithTag(protoWriter, 2, pendingReferralRenderData.state);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, pendingReferralRenderData.instruction_text);
        protoAdapter.encodeWithTag(protoWriter, 4, pendingReferralRenderData.expires_in_text);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, pendingReferralRenderData.expires_at);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 6, pendingReferralRenderData.localizable_instruction_text);
        protoWriter.writeBytes(pendingReferralRenderData.unknownFields());
    }
}
