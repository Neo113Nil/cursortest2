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
public final class C4BIdentityHubState$AccountVerification$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new C4BIdentityHubState.AccountVerification((LocalizedString) obj, (LocalizedString) obj2, (C4BIdentityHubState.C4BIdentityVerificationBadgeIcon) obj3, (C4BIdentityHubState.ClientRouteAction) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = C4BIdentityHubState.C4BIdentityVerificationBadgeIcon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(C4BIdentityHubState.ClientRouteAction.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        C4BIdentityHubState.AccountVerification accountVerification = (C4BIdentityHubState.AccountVerification) obj;
        reverseProtoWriter.getClass();
        accountVerification.getClass();
        reverseProtoWriter.writeBytes(accountVerification.unknownFields());
        C4BIdentityHubState.ClientRouteAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, accountVerification.client_route);
        C4BIdentityHubState.C4BIdentityVerificationBadgeIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, accountVerification.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, accountVerification.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, accountVerification.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        C4BIdentityHubState.AccountVerification accountVerification = (C4BIdentityHubState.AccountVerification) obj;
        accountVerification.getClass();
        int size$okio = accountVerification.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return C4BIdentityHubState.ClientRouteAction.ADAPTER.encodedSizeWithTag(4, accountVerification.client_route) + C4BIdentityHubState.C4BIdentityVerificationBadgeIcon.ADAPTER.encodedSizeWithTag(3, accountVerification.image) + protoAdapter.encodedSizeWithTag(2, accountVerification.subtitle) + protoAdapter.encodedSizeWithTag(1, accountVerification.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        C4BIdentityHubState.AccountVerification accountVerification = (C4BIdentityHubState.AccountVerification) obj;
        accountVerification.getClass();
        LocalizedString localizedString = accountVerification.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = accountVerification.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        C4BIdentityHubState.ClientRouteAction clientRouteAction = accountVerification.client_route;
        C4BIdentityHubState.ClientRouteAction clientRouteAction2 = clientRouteAction != null ? (C4BIdentityHubState.ClientRouteAction) C4BIdentityHubState.ClientRouteAction.ADAPTER.redact(clientRouteAction) : null;
        ByteString byteString = ByteString.EMPTY;
        C4BIdentityHubState.C4BIdentityVerificationBadgeIcon c4BIdentityVerificationBadgeIcon = accountVerification.image;
        byteString.getClass();
        return new C4BIdentityHubState.AccountVerification(localizedString2, localizedString4, c4BIdentityVerificationBadgeIcon, clientRouteAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        C4BIdentityHubState.AccountVerification accountVerification = (C4BIdentityHubState.AccountVerification) obj;
        accountVerification.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, accountVerification.title);
        protoAdapter.encodeWithTag(protoWriter, 2, accountVerification.subtitle);
        C4BIdentityHubState.C4BIdentityVerificationBadgeIcon.ADAPTER.encodeWithTag(protoWriter, 3, accountVerification.image);
        C4BIdentityHubState.ClientRouteAction.ADAPTER.encodeWithTag(protoWriter, 4, accountVerification.client_route);
        protoWriter.writeBytes(accountVerification.unknownFields());
    }
}
