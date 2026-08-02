package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/InChatPrompt$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/InChatPrompt;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InChatPrompt$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InChatPrompt((UiAvatar) obj2, (String) obj, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InChatPrompt inChatPrompt = (InChatPrompt) obj;
        reverseProtoWriter.getClass();
        inChatPrompt.getClass();
        reverseProtoWriter.writeBytes(inChatPrompt.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, inChatPrompt.id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, inChatPrompt.category);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, inChatPrompt.prompt);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, inChatPrompt.avatar);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, inChatPrompt.body_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InChatPrompt inChatPrompt = (InChatPrompt) obj;
        inChatPrompt.getClass();
        int size$okio = inChatPrompt.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, inChatPrompt.id) + protoAdapter.encodedSizeWithTag(4, inChatPrompt.category) + protoAdapter.encodedSizeWithTag(3, inChatPrompt.prompt) + UiAvatar.ADAPTER.encodedSizeWithTag(2, inChatPrompt.avatar) + protoAdapter.encodedSizeWithTag(1, inChatPrompt.body_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InChatPrompt inChatPrompt = (InChatPrompt) obj;
        inChatPrompt.getClass();
        UiAvatar uiAvatar = inChatPrompt.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = inChatPrompt.body_text;
        String str2 = inChatPrompt.prompt;
        String str3 = inChatPrompt.category;
        String str4 = inChatPrompt.id;
        byteString.getClass();
        return new InChatPrompt(uiAvatar2, str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InChatPrompt inChatPrompt = (InChatPrompt) obj;
        inChatPrompt.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, inChatPrompt.body_text);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 2, inChatPrompt.avatar);
        protoAdapter.encodeWithTag(protoWriter, 3, inChatPrompt.prompt);
        protoAdapter.encodeWithTag(protoWriter, 4, inChatPrompt.category);
        protoAdapter.encodeWithTag(protoWriter, 5, inChatPrompt.id);
        protoWriter.writeBytes(inChatPrompt.unknownFields());
    }
}
