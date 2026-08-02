package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TriggeredActionRow$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggeredActionRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TriggeredActionRow((String) obj, (UiAvatar) obj2, (String) obj3, (String) obj4, (String) obj5, (Double) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.DOUBLE.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TriggeredActionRow triggeredActionRow = (TriggeredActionRow) obj;
        reverseProtoWriter.getClass();
        triggeredActionRow.getClass();
        reverseProtoWriter.writeBytes(triggeredActionRow.unknownFields());
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 6, triggeredActionRow.amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, triggeredActionRow.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, triggeredActionRow.client_route_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, triggeredActionRow.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, triggeredActionRow.avatar);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, triggeredActionRow.triggered_action_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TriggeredActionRow triggeredActionRow = (TriggeredActionRow) obj;
        triggeredActionRow.getClass();
        int size$okio = triggeredActionRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.DOUBLE.encodedSizeWithTag(6, triggeredActionRow.amount) + protoAdapter.encodedSizeWithTag(5, triggeredActionRow.subtitle) + protoAdapter.encodedSizeWithTag(4, triggeredActionRow.client_route_url) + protoAdapter.encodedSizeWithTag(3, triggeredActionRow.title) + UiAvatar.ADAPTER.encodedSizeWithTag(2, triggeredActionRow.avatar) + protoAdapter.encodedSizeWithTag(1, triggeredActionRow.triggered_action_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TriggeredActionRow triggeredActionRow = (TriggeredActionRow) obj;
        triggeredActionRow.getClass();
        UiAvatar uiAvatar = triggeredActionRow.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = triggeredActionRow.triggered_action_id;
        String str2 = triggeredActionRow.title;
        String str3 = triggeredActionRow.client_route_url;
        String str4 = triggeredActionRow.subtitle;
        Double d = triggeredActionRow.amount;
        byteString.getClass();
        return new TriggeredActionRow(str, uiAvatar2, str2, str3, str4, d, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TriggeredActionRow triggeredActionRow = (TriggeredActionRow) obj;
        triggeredActionRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, triggeredActionRow.triggered_action_id);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 2, triggeredActionRow.avatar);
        protoAdapter.encodeWithTag(protoWriter, 3, triggeredActionRow.title);
        protoAdapter.encodeWithTag(protoWriter, 4, triggeredActionRow.client_route_url);
        protoAdapter.encodeWithTag(protoWriter, 5, triggeredActionRow.subtitle);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 6, triggeredActionRow.amount);
        protoWriter.writeBytes(triggeredActionRow.unknownFields());
    }
}
