package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.appmessaging.AppMessagePayload;
import com.squareup.protos.franklin.ui.BackNavigationPrompt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class StatusResult$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0023. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StatusResult((StatusResult.Icon) obj5, (String) obj17, (LocalizableString) obj8, (StatusResultButton) obj9, (StatusResultButton) obj10, (String) obj18, (LocalizableString) obj11, (AppMessagePayload) obj12, (StatusResult.Action) obj13, (String) obj14, (Boolean) obj15, (StatusResult.SupportAction) obj16, (BlockerAction.EndActivityAction) obj6, (BackNavigationPrompt) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj6;
                    obj2 = obj7;
                    obj3 = obj8;
                    try {
                        obj4 = StatusResult.Icon.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj6 = obj;
                    obj7 = obj2;
                    obj8 = obj3;
                    break;
                case 2:
                    obj17 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 3:
                    obj9 = TransactorKt.decodeMessageOrMerge(StatusResultButton.ADAPTER, protoReader, obj9);
                    obj4 = obj5;
                    break;
                case 4:
                    obj10 = TransactorKt.decodeMessageOrMerge(StatusResultButton.ADAPTER, protoReader, obj10);
                    obj4 = obj5;
                    break;
                case 5:
                    obj18 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 6:
                    obj12 = TransactorKt.decodeMessageOrMerge(AppMessagePayload.ADAPTER, protoReader, obj12);
                    obj4 = obj5;
                    break;
                case 7:
                    try {
                        obj13 = StatusResult.Action.ADAPTER.decode(protoReader);
                        obj4 = obj5;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj6;
                        obj2 = obj7;
                        obj3 = obj8;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 8:
                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 9:
                    obj15 = ProtoAdapter.BOOL.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 10:
                    obj16 = TransactorKt.decodeMessageOrMerge(StatusResult.SupportAction.ADAPTER, protoReader, obj16);
                    obj4 = obj5;
                    break;
                case 11:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj8);
                    obj4 = obj5;
                    break;
                case 12:
                    obj11 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj11);
                    obj4 = obj5;
                    break;
                case 13:
                    obj6 = TransactorKt.decodeMessageOrMerge(BlockerAction.EndActivityAction.ADAPTER, protoReader, obj6);
                    obj4 = obj5;
                    break;
                case 14:
                    obj7 = TransactorKt.decodeMessageOrMerge(BackNavigationPrompt.ADAPTER, protoReader, obj7);
                    obj4 = obj5;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj6;
                    obj2 = obj7;
                    obj3 = obj8;
                    obj4 = obj5;
                    obj6 = obj;
                    obj7 = obj2;
                    obj8 = obj3;
                    break;
            }
            obj5 = obj4;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StatusResult statusResult = (StatusResult) obj;
        reverseProtoWriter.getClass();
        statusResult.getClass();
        reverseProtoWriter.writeBytes(statusResult.unknownFields());
        BackNavigationPrompt.ADAPTER.encodeWithTag(reverseProtoWriter, 14, statusResult.back_navigation_prompt);
        BlockerAction.EndActivityAction.ADAPTER.encodeWithTag(reverseProtoWriter, 13, statusResult.end_activity_action);
        StatusResult.SupportAction.ADAPTER.encodeWithTag(reverseProtoWriter, 10, statusResult.support_action);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, statusResult.show_confetti);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, statusResult.redirect_uri);
        StatusResult.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 7, statusResult.action);
        AppMessagePayload.ADAPTER.encodeWithTag(reverseProtoWriter, 6, statusResult.promo_payload);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, statusResult.localizable_promo_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, statusResult.promo_text);
        ProtoAdapter protoAdapter3 = StatusResultButton.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, statusResult.secondary_button);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, statusResult.primary_button);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, statusResult.localizable_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, statusResult.text);
        StatusResult.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, statusResult.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StatusResult statusResult = (StatusResult) obj;
        statusResult.getClass();
        int encodedSizeWithTag = StatusResult.Icon.ADAPTER.encodedSizeWithTag(1, statusResult.icon) + statusResult.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, statusResult.text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(11, statusResult.localizable_text) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = StatusResultButton.ADAPTER;
        return BackNavigationPrompt.ADAPTER.encodedSizeWithTag(14, statusResult.back_navigation_prompt) + BlockerAction.EndActivityAction.ADAPTER.encodedSizeWithTag(13, statusResult.end_activity_action) + StatusResult.SupportAction.ADAPTER.encodedSizeWithTag(10, statusResult.support_action) + ProtoAdapter.BOOL.encodedSizeWithTag(9, statusResult.show_confetti) + protoAdapter.encodedSizeWithTag(8, statusResult.redirect_uri) + StatusResult.Action.ADAPTER.encodedSizeWithTag(7, statusResult.action) + AppMessagePayload.ADAPTER.encodedSizeWithTag(6, statusResult.promo_payload) + protoAdapter2.encodedSizeWithTag(12, statusResult.localizable_promo_text) + protoAdapter.encodedSizeWithTag(5, statusResult.promo_text) + protoAdapter3.encodedSizeWithTag(4, statusResult.secondary_button) + protoAdapter3.encodedSizeWithTag(3, statusResult.primary_button) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StatusResult statusResult = (StatusResult) obj;
        statusResult.getClass();
        StatusResultButton statusResultButton = statusResult.primary_button;
        StatusResultButton statusResultButton2 = statusResultButton != null ? (StatusResultButton) StatusResultButton.ADAPTER.redact(statusResultButton) : null;
        StatusResultButton statusResultButton3 = statusResult.secondary_button;
        StatusResultButton statusResultButton4 = statusResultButton3 != null ? (StatusResultButton) StatusResultButton.ADAPTER.redact(statusResultButton3) : null;
        LocalizableString localizableString = statusResult.localizable_promo_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        AppMessagePayload appMessagePayload = statusResult.promo_payload;
        AppMessagePayload appMessagePayload2 = appMessagePayload != null ? (AppMessagePayload) AppMessagePayload.ADAPTER.redact(appMessagePayload) : null;
        StatusResult.SupportAction supportAction = statusResult.support_action;
        StatusResult.SupportAction supportAction2 = supportAction != null ? (StatusResult.SupportAction) StatusResult.SupportAction.ADAPTER.redact(supportAction) : null;
        BlockerAction.EndActivityAction endActivityAction = statusResult.end_activity_action;
        BlockerAction.EndActivityAction endActivityAction2 = endActivityAction != null ? (BlockerAction.EndActivityAction) BlockerAction.EndActivityAction.ADAPTER.redact(endActivityAction) : null;
        BackNavigationPrompt backNavigationPrompt = statusResult.back_navigation_prompt;
        return StatusResult.copy$default(statusResult, null, statusResultButton2, statusResultButton4, null, localizableString2, appMessagePayload2, supportAction2, endActivityAction2, backNavigationPrompt != null ? (BackNavigationPrompt) BackNavigationPrompt.ADAPTER.redact(backNavigationPrompt) : null, ByteString.EMPTY, 1825);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StatusResult statusResult = (StatusResult) obj;
        statusResult.getClass();
        StatusResult.Icon.ADAPTER.encodeWithTag(protoWriter, 1, statusResult.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, statusResult.text);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 11, statusResult.localizable_text);
        ProtoAdapter protoAdapter3 = StatusResultButton.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 3, statusResult.primary_button);
        protoAdapter3.encodeWithTag(protoWriter, 4, statusResult.secondary_button);
        protoAdapter.encodeWithTag(protoWriter, 5, statusResult.promo_text);
        protoAdapter2.encodeWithTag(protoWriter, 12, statusResult.localizable_promo_text);
        AppMessagePayload.ADAPTER.encodeWithTag(protoWriter, 6, statusResult.promo_payload);
        StatusResult.Action.ADAPTER.encodeWithTag(protoWriter, 7, statusResult.action);
        protoAdapter.encodeWithTag(protoWriter, 8, statusResult.redirect_uri);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, statusResult.show_confetti);
        StatusResult.SupportAction.ADAPTER.encodeWithTag(protoWriter, 10, statusResult.support_action);
        BlockerAction.EndActivityAction.ADAPTER.encodeWithTag(protoWriter, 13, statusResult.end_activity_action);
        BackNavigationPrompt.ADAPTER.encodeWithTag(protoWriter, 14, statusResult.back_navigation_prompt);
        protoWriter.writeBytes(statusResult.unknownFields());
    }
}
