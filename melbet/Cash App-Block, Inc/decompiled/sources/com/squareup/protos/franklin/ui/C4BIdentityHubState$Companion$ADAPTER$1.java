package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.C4BIdentityHubState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class C4BIdentityHubState$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new C4BIdentityHubState((Long) obj, (Boolean) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (C4BIdentityHubState.C4BIdentityVerificationBadgeStyle) obj5, (C4BIdentityHubState.AccountVerification) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    try {
                        obj5 = C4BIdentityHubState.C4BIdentityVerificationBadgeStyle.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(C4BIdentityHubState.AccountVerification.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        C4BIdentityHubState c4BIdentityHubState = (C4BIdentityHubState) obj;
        reverseProtoWriter.getClass();
        c4BIdentityHubState.getClass();
        reverseProtoWriter.writeBytes(c4BIdentityHubState.unknownFields());
        C4BIdentityHubState.AccountVerification.ADAPTER.encodeWithTag(reverseProtoWriter, 6, c4BIdentityHubState.account_verification);
        C4BIdentityHubState.C4BIdentityVerificationBadgeStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 5, c4BIdentityHubState.security_verify_identity_control_label_style);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, c4BIdentityHubState.security_verify_identity_control_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, c4BIdentityHubState.security_verify_identity_description);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, c4BIdentityHubState.should_show_badge);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, c4BIdentityHubState.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        C4BIdentityHubState c4BIdentityHubState = (C4BIdentityHubState) obj;
        c4BIdentityHubState.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(2, c4BIdentityHubState.should_show_badge) + ProtoAdapter.INT64.encodedSizeWithTag(1, c4BIdentityHubState.version) + c4BIdentityHubState.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return C4BIdentityHubState.AccountVerification.ADAPTER.encodedSizeWithTag(6, c4BIdentityHubState.account_verification) + C4BIdentityHubState.C4BIdentityVerificationBadgeStyle.ADAPTER.encodedSizeWithTag(5, c4BIdentityHubState.security_verify_identity_control_label_style) + protoAdapter.encodedSizeWithTag(4, c4BIdentityHubState.security_verify_identity_control_label) + protoAdapter.encodedSizeWithTag(3, c4BIdentityHubState.security_verify_identity_description) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        C4BIdentityHubState c4BIdentityHubState = (C4BIdentityHubState) obj;
        c4BIdentityHubState.getClass();
        LocalizedString localizedString = c4BIdentityHubState.security_verify_identity_description;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = c4BIdentityHubState.security_verify_identity_control_label;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        C4BIdentityHubState.AccountVerification accountVerification = c4BIdentityHubState.account_verification;
        C4BIdentityHubState.AccountVerification accountVerification2 = accountVerification != null ? (C4BIdentityHubState.AccountVerification) C4BIdentityHubState.AccountVerification.ADAPTER.redact(accountVerification) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = c4BIdentityHubState.version;
        Boolean bool = c4BIdentityHubState.should_show_badge;
        C4BIdentityHubState.C4BIdentityVerificationBadgeStyle c4BIdentityVerificationBadgeStyle = c4BIdentityHubState.security_verify_identity_control_label_style;
        byteString.getClass();
        return new C4BIdentityHubState(l, bool, localizedString2, localizedString4, c4BIdentityVerificationBadgeStyle, accountVerification2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        C4BIdentityHubState c4BIdentityHubState = (C4BIdentityHubState) obj;
        c4BIdentityHubState.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c4BIdentityHubState.version);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c4BIdentityHubState.should_show_badge);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, c4BIdentityHubState.security_verify_identity_description);
        protoAdapter.encodeWithTag(protoWriter, 4, c4BIdentityHubState.security_verify_identity_control_label);
        C4BIdentityHubState.C4BIdentityVerificationBadgeStyle.ADAPTER.encodeWithTag(protoWriter, 5, c4BIdentityHubState.security_verify_identity_control_label_style);
        C4BIdentityHubState.AccountVerification.ADAPTER.encodeWithTag(protoWriter, 6, c4BIdentityHubState.account_verification);
        protoWriter.writeBytes(c4BIdentityHubState.unknownFields());
    }
}
