package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.client.ClientKickoffParams;
import com.squareup.protos.cash.messagingplatformcommon.app.MoneybotSuggestionView;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MoneybotSuggestionView$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneybotSuggestionView((UiAvatar) obj, (String) obj2, (ClientKickoffParams) obj3, (String) obj4, (MoneybotSuggestionView.Category) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(ClientKickoffParams.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = MoneybotSuggestionView.Category.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotSuggestionView moneybotSuggestionView = (MoneybotSuggestionView) obj;
        reverseProtoWriter.getClass();
        moneybotSuggestionView.getClass();
        reverseProtoWriter.writeBytes(moneybotSuggestionView.unknownFields());
        MoneybotSuggestionView.Category.ADAPTER.encodeWithTag(reverseProtoWriter, 5, moneybotSuggestionView.category);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, moneybotSuggestionView.tip);
        ClientKickoffParams.ADAPTER.encodeWithTag(reverseProtoWriter, 3, moneybotSuggestionView.chat_params);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, moneybotSuggestionView.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, moneybotSuggestionView.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotSuggestionView moneybotSuggestionView = (MoneybotSuggestionView) obj;
        moneybotSuggestionView.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(1, moneybotSuggestionView.avatar) + moneybotSuggestionView.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return MoneybotSuggestionView.Category.ADAPTER.encodedSizeWithTag(5, moneybotSuggestionView.category) + protoAdapter.encodedSizeWithTag(4, moneybotSuggestionView.tip) + ClientKickoffParams.ADAPTER.encodedSizeWithTag(3, moneybotSuggestionView.chat_params) + protoAdapter.encodedSizeWithTag(2, moneybotSuggestionView.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotSuggestionView moneybotSuggestionView = (MoneybotSuggestionView) obj;
        moneybotSuggestionView.getClass();
        UiAvatar uiAvatar = moneybotSuggestionView.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        ClientKickoffParams clientKickoffParams = moneybotSuggestionView.chat_params;
        ClientKickoffParams clientKickoffParams2 = clientKickoffParams != null ? (ClientKickoffParams) ClientKickoffParams.ADAPTER.redact(clientKickoffParams) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = moneybotSuggestionView.title;
        String str2 = moneybotSuggestionView.tip;
        MoneybotSuggestionView.Category category = moneybotSuggestionView.category;
        byteString.getClass();
        return new MoneybotSuggestionView(uiAvatar2, str, clientKickoffParams2, str2, category, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotSuggestionView moneybotSuggestionView = (MoneybotSuggestionView) obj;
        moneybotSuggestionView.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, moneybotSuggestionView.avatar);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, moneybotSuggestionView.title);
        ClientKickoffParams.ADAPTER.encodeWithTag(protoWriter, 3, moneybotSuggestionView.chat_params);
        protoAdapter.encodeWithTag(protoWriter, 4, moneybotSuggestionView.tip);
        MoneybotSuggestionView.Category.ADAPTER.encodeWithTag(protoWriter, 5, moneybotSuggestionView.category);
        protoWriter.writeBytes(moneybotSuggestionView.unknownFields());
    }
}
