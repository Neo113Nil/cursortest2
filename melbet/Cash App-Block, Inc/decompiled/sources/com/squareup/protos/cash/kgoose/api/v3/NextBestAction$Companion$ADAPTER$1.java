package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.NextBestAction;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/NextBestAction$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NextBestAction$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NextBestAction((String) obj, (LocalizedString) obj2, (LocalizedString) obj3, (ClientKickoffParams) obj4, (Long) obj5, (LocalizedString) obj6, (NextBestAction.CtaTapAction) obj7, (String) obj8, (LocalizedString) obj9, (Long) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(ClientKickoffParams.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(NextBestAction.CtaTapAction.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj9);
                    break;
                case 10:
                    obj10 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NextBestAction nextBestAction = (NextBestAction) obj;
        reverseProtoWriter.getClass();
        nextBestAction.getClass();
        reverseProtoWriter.writeBytes(nextBestAction.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, nextBestAction.expires_at);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, nextBestAction.detail);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 8, nextBestAction.category);
        NextBestAction.CtaTapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 7, nextBestAction.cta_tap_action);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, nextBestAction.cta_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, nextBestAction.created_at);
        ClientKickoffParams.ADAPTER.encodeWithTag(reverseProtoWriter, 4, nextBestAction.prompt);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, nextBestAction.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, nextBestAction.title);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, nextBestAction.next_best_action_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NextBestAction nextBestAction = (NextBestAction) obj;
        nextBestAction.getClass();
        int size$okio = nextBestAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, nextBestAction.next_best_action_id) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = ClientKickoffParams.ADAPTER.encodedSizeWithTag(4, nextBestAction.prompt) + protoAdapter2.encodedSizeWithTag(3, nextBestAction.subtitle) + protoAdapter2.encodedSizeWithTag(2, nextBestAction.title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return protoAdapter3.encodedSizeWithTag(10, nextBestAction.expires_at) + protoAdapter2.encodedSizeWithTag(9, nextBestAction.detail) + protoAdapter.encodedSizeWithTag(8, nextBestAction.category) + NextBestAction.CtaTapAction.ADAPTER.encodedSizeWithTag(7, nextBestAction.cta_tap_action) + protoAdapter2.encodedSizeWithTag(6, nextBestAction.cta_text) + protoAdapter3.encodedSizeWithTag(5, nextBestAction.created_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NextBestAction nextBestAction = (NextBestAction) obj;
        nextBestAction.getClass();
        LocalizedString localizedString = nextBestAction.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = nextBestAction.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ClientKickoffParams clientKickoffParams = nextBestAction.prompt;
        ClientKickoffParams clientKickoffParams2 = clientKickoffParams != null ? (ClientKickoffParams) ClientKickoffParams.ADAPTER.redact(clientKickoffParams) : null;
        LocalizedString localizedString5 = nextBestAction.cta_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        NextBestAction.CtaTapAction ctaTapAction = nextBestAction.cta_tap_action;
        NextBestAction.CtaTapAction ctaTapAction2 = ctaTapAction != null ? (NextBestAction.CtaTapAction) NextBestAction.CtaTapAction.ADAPTER.redact(ctaTapAction) : null;
        LocalizedString localizedString7 = nextBestAction.detail;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = nextBestAction.next_best_action_id;
        Long l = nextBestAction.created_at;
        String str2 = nextBestAction.category;
        Long l2 = nextBestAction.expires_at;
        byteString.getClass();
        return new NextBestAction(str, localizedString2, localizedString4, clientKickoffParams2, l, localizedString6, ctaTapAction2, str2, localizedString8, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NextBestAction nextBestAction = (NextBestAction) obj;
        nextBestAction.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, nextBestAction.next_best_action_id);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, nextBestAction.title);
        protoAdapter2.encodeWithTag(protoWriter, 3, nextBestAction.subtitle);
        ClientKickoffParams.ADAPTER.encodeWithTag(protoWriter, 4, nextBestAction.prompt);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 5, nextBestAction.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 6, nextBestAction.cta_text);
        NextBestAction.CtaTapAction.ADAPTER.encodeWithTag(protoWriter, 7, nextBestAction.cta_tap_action);
        protoAdapter.encodeWithTag(protoWriter, 8, nextBestAction.category);
        protoAdapter2.encodeWithTag(protoWriter, 9, nextBestAction.detail);
        protoAdapter3.encodeWithTag(protoWriter, 10, nextBestAction.expires_at);
        protoWriter.writeBytes(nextBestAction.unknownFields());
    }
}
