package com.squareup.protos.cash.referly.api.incentives.client;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ActivePromotion$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ActivePromotion((Icon) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
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
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivePromotion activePromotion = (ActivePromotion) obj;
        reverseProtoWriter.getClass();
        activePromotion.getClass();
        reverseProtoWriter.writeBytes(activePromotion.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, activePromotion.campaign_variant_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, activePromotion.campaign_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, activePromotion.action_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, activePromotion.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, activePromotion.title);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activePromotion.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivePromotion activePromotion = (ActivePromotion) obj;
        activePromotion.getClass();
        int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(1, activePromotion.icon) + activePromotion.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, activePromotion.campaign_variant_token) + protoAdapter.encodedSizeWithTag(5, activePromotion.campaign_token) + protoAdapter.encodedSizeWithTag(4, activePromotion.action_url) + protoAdapter.encodedSizeWithTag(3, activePromotion.subtitle) + protoAdapter.encodedSizeWithTag(2, activePromotion.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivePromotion activePromotion = (ActivePromotion) obj;
        activePromotion.getClass();
        Icon icon = activePromotion.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = activePromotion.title;
        String str2 = activePromotion.subtitle;
        String str3 = activePromotion.action_url;
        String str4 = activePromotion.campaign_token;
        String str5 = activePromotion.campaign_variant_token;
        byteString.getClass();
        return new ActivePromotion(icon2, str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivePromotion activePromotion = (ActivePromotion) obj;
        activePromotion.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, activePromotion.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, activePromotion.title);
        protoAdapter.encodeWithTag(protoWriter, 3, activePromotion.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 4, activePromotion.action_url);
        protoAdapter.encodeWithTag(protoWriter, 5, activePromotion.campaign_token);
        protoAdapter.encodeWithTag(protoWriter, 6, activePromotion.campaign_variant_token);
        protoWriter.writeBytes(activePromotion.unknownFields());
    }
}
