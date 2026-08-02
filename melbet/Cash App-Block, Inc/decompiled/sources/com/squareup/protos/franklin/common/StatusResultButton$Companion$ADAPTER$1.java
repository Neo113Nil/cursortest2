package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StatusResultButton$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StatusResultButton((StatusResultButton.ButtonAction) obj, (String) obj2, (LocalizableString) obj3, (String) obj4, (ClientScenario) obj5, (String) obj6, (BlockerAction) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = StatusResultButton.ButtonAction.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    try {
                        obj5 = ClientScenario.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj7 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, protoReader, obj7);
                    break;
                case 7:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StatusResultButton statusResultButton = (StatusResultButton) obj;
        reverseProtoWriter.getClass();
        statusResultButton.getClass();
        reverseProtoWriter.writeBytes(statusResultButton.unknownFields());
        BlockerAction.ADAPTER.encodeWithTag(reverseProtoWriter, 6, statusResultButton.blocker_action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, statusResultButton.support_flow_node);
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 4, statusResultButton.client_scenario);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, statusResultButton.url);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 7, statusResultButton.localizable_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, statusResultButton.text);
        StatusResultButton.ButtonAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, statusResultButton.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StatusResultButton statusResultButton = (StatusResultButton) obj;
        statusResultButton.getClass();
        int encodedSizeWithTag = StatusResultButton.ButtonAction.ADAPTER.encodedSizeWithTag(1, statusResultButton.action) + statusResultButton.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return BlockerAction.ADAPTER.encodedSizeWithTag(6, statusResultButton.blocker_action) + protoAdapter.encodedSizeWithTag(5, statusResultButton.support_flow_node) + ClientScenario.ADAPTER.encodedSizeWithTag(4, statusResultButton.client_scenario) + protoAdapter.encodedSizeWithTag(3, statusResultButton.url) + LocalizableString.ADAPTER.encodedSizeWithTag(7, statusResultButton.localizable_text) + protoAdapter.encodedSizeWithTag(2, statusResultButton.text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StatusResultButton statusResultButton = (StatusResultButton) obj;
        statusResultButton.getClass();
        LocalizableString localizableString = statusResultButton.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        BlockerAction blockerAction = statusResultButton.blocker_action;
        BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
        ByteString byteString = ByteString.EMPTY;
        StatusResultButton.ButtonAction buttonAction = statusResultButton.action;
        String str = statusResultButton.text;
        String str2 = statusResultButton.url;
        ClientScenario clientScenario = statusResultButton.client_scenario;
        String str3 = statusResultButton.support_flow_node;
        byteString.getClass();
        return new StatusResultButton(buttonAction, str, localizableString2, str2, clientScenario, str3, blockerAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StatusResultButton statusResultButton = (StatusResultButton) obj;
        statusResultButton.getClass();
        StatusResultButton.ButtonAction.ADAPTER.encodeWithTag(protoWriter, 1, statusResultButton.action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, statusResultButton.text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 7, statusResultButton.localizable_text);
        protoAdapter.encodeWithTag(protoWriter, 3, statusResultButton.url);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 4, statusResultButton.client_scenario);
        protoAdapter.encodeWithTag(protoWriter, 5, statusResultButton.support_flow_node);
        BlockerAction.ADAPTER.encodeWithTag(protoWriter, 6, statusResultButton.blocker_action);
        protoWriter.writeBytes(statusResultButton.unknownFields());
    }
}
