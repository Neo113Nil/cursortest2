package com.squareup.protos.cash.marketdata.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.marketdata.model.News;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class News$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        News.Action openUrlAction;
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
        News.Action action = null;
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new News((Long) obj5, (String) obj6, (String) obj7, (Image) obj8, action, (Long) obj9, (String) obj10, (String) obj11, (NewsType) obj12, (Long) obj13, (Long) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 2:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj8 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj8);
                    break;
                case 5:
                    obj4 = obj5;
                    openUrlAction = new News.Action.OpenUrlAction((OpenUrlAction) OpenUrlAction.ADAPTER.decode(protoReader));
                    obj5 = obj4;
                    action = openUrlAction;
                    break;
                case 6:
                    obj4 = obj5;
                    openUrlAction = new News.Action.DisplayMessageAction((DisplayMessageAction) DisplayMessageAction.ADAPTER.decode(protoReader));
                    obj5 = obj4;
                    action = openUrlAction;
                    break;
                case 7:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 8:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    try {
                        obj12 = NewsType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj5;
                        obj2 = obj6;
                        obj3 = obj7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 11:
                    obj13 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 12:
                    obj14 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj5;
                    obj2 = obj6;
                    obj3 = obj7;
                    obj5 = obj;
                    obj6 = obj2;
                    obj7 = obj3;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        News news = (News) obj;
        reverseProtoWriter.getClass();
        news.getClass();
        reverseProtoWriter.writeBytes(news.unknownFields());
        News.Action action = news.action;
        if (action instanceof News.Action.OpenUrlAction) {
            OpenUrlAction.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((News.Action.OpenUrlAction) action).value);
        } else if (action instanceof News.Action.DisplayMessageAction) {
            DisplayMessageAction.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((News.Action.DisplayMessageAction) action).value);
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, news.expires_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, news.id);
        NewsType.ADAPTER.encodeWithTag(reverseProtoWriter, 10, news.f1317type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, news.investment_entity_symbol);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, news.investment_entity_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, news.deleted_at);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 4, news.avatar);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, news.provider_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, news.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, news.published_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        News news = (News) obj;
        news.getClass();
        int size$okio = news.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(1, news.published_at) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = Image.ADAPTER.encodedSizeWithTag(4, news.avatar) + protoAdapter2.encodedSizeWithTag(3, news.provider_name) + protoAdapter2.encodedSizeWithTag(2, news.title) + encodedSizeWithTag2;
        News.Action action = news.action;
        if (action instanceof News.Action.OpenUrlAction) {
            encodedSizeWithTag = OpenUrlAction.ADAPTER.encodedSizeWithTag(5, ((News.Action.OpenUrlAction) action).value);
        } else {
            if (!(action instanceof News.Action.DisplayMessageAction)) {
                if (action != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(12, news.expires_at) + protoAdapter.encodedSizeWithTag(11, news.id) + NewsType.ADAPTER.encodedSizeWithTag(10, news.f1317type) + protoAdapter2.encodedSizeWithTag(9, news.investment_entity_symbol) + protoAdapter2.encodedSizeWithTag(8, news.investment_entity_token) + protoAdapter.encodedSizeWithTag(7, news.deleted_at) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = DisplayMessageAction.ADAPTER.encodedSizeWithTag(6, ((News.Action.DisplayMessageAction) action).value);
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        return protoAdapter.encodedSizeWithTag(12, news.expires_at) + protoAdapter.encodedSizeWithTag(11, news.id) + NewsType.ADAPTER.encodedSizeWithTag(10, news.f1317type) + protoAdapter2.encodedSizeWithTag(9, news.investment_entity_symbol) + protoAdapter2.encodedSizeWithTag(8, news.investment_entity_token) + protoAdapter.encodedSizeWithTag(7, news.deleted_at) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        News news = (News) obj;
        news.getClass();
        Image image = news.avatar;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = news.published_at;
        String str = news.title;
        String str2 = news.provider_name;
        News.Action action = news.action;
        Long l2 = news.deleted_at;
        String str3 = news.investment_entity_token;
        String str4 = news.investment_entity_symbol;
        NewsType newsType = news.f1317type;
        Long l3 = news.id;
        Long l4 = news.expires_at;
        byteString.getClass();
        return new News(l, str, str2, image2, action, l2, str3, str4, newsType, l3, l4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        News news = (News) obj;
        news.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, news.published_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, news.title);
        protoAdapter2.encodeWithTag(protoWriter, 3, news.provider_name);
        Image.ADAPTER.encodeWithTag(protoWriter, 4, news.avatar);
        protoAdapter.encodeWithTag(protoWriter, 7, news.deleted_at);
        protoAdapter2.encodeWithTag(protoWriter, 8, news.investment_entity_token);
        protoAdapter2.encodeWithTag(protoWriter, 9, news.investment_entity_symbol);
        NewsType.ADAPTER.encodeWithTag(protoWriter, 10, news.f1317type);
        protoAdapter.encodeWithTag(protoWriter, 11, news.id);
        protoAdapter.encodeWithTag(protoWriter, 12, news.expires_at);
        News.Action action = news.action;
        if (action instanceof News.Action.OpenUrlAction) {
            OpenUrlAction.ADAPTER.encodeWithTag(protoWriter, 5, ((News.Action.OpenUrlAction) action).value);
        } else if (action instanceof News.Action.DisplayMessageAction) {
            DisplayMessageAction.ADAPTER.encodeWithTag(protoWriter, 6, ((News.Action.DisplayMessageAction) action).value);
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(news.unknownFields());
    }
}
