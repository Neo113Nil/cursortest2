package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalCashBackOfferPercentage;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.protos.cash.local.client.v1.LocalOpenStatus;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenRowCell$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        LocalOpenStatus localOpenStatus;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        String str4 = null;
        String str5 = null;
        LocalOpenStatus localOpenStatus2 = null;
        Object obj = null;
        Object obj2 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketScreenRowCell(str3, str4, str5, localOpenStatus2, (LocalOpenHours) obj, (LocalCashBackOfferPercentage) obj2, str6, str7, str8, str9, str10, (LocalEstimatedCompletionDuration) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 3:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 4:
                    try {
                        localOpenStatus2 = LocalOpenStatus.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        str = str4;
                        str2 = str5;
                        localOpenStatus = localOpenStatus2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj = TransactorKt.decodeMessageOrMerge(LocalOpenHours.ADAPTER, protoReader, obj);
                    decode = str3;
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalCashBackOfferPercentage.ADAPTER, protoReader, obj2);
                    decode = str3;
                    break;
                case 7:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 8:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 10:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 11:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 12:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalEstimatedCompletionDuration.ADAPTER, protoReader, obj3);
                    decode = str3;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str4;
                    str2 = str5;
                    localOpenStatus = localOpenStatus2;
                    decode = str3;
                    str4 = str;
                    str5 = str2;
                    localOpenStatus2 = localOpenStatus;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketScreenRowCell marketScreenRowCell = (MarketScreenRowCell) obj;
        reverseProtoWriter.getClass();
        marketScreenRowCell.getClass();
        reverseProtoWriter.writeBytes(marketScreenRowCell.unknownFields());
        LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(reverseProtoWriter, 12, marketScreenRowCell.estimated_pickup_wait_time);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, marketScreenRowCell.cashback_offer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, marketScreenRowCell.time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, marketScreenRowCell.default_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, marketScreenRowCell.button_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, marketScreenRowCell.button_text);
        LocalCashBackOfferPercentage.ADAPTER.encodeWithTag(reverseProtoWriter, 6, marketScreenRowCell.percentage);
        LocalOpenHours.ADAPTER.encodeWithTag(reverseProtoWriter, 5, marketScreenRowCell.open_hours);
        LocalOpenStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, marketScreenRowCell.open_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, marketScreenRowCell.category);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, marketScreenRowCell.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, marketScreenRowCell.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketScreenRowCell marketScreenRowCell = (MarketScreenRowCell) obj;
        marketScreenRowCell.getClass();
        int size$okio = marketScreenRowCell.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalEstimatedCompletionDuration.ADAPTER.encodedSizeWithTag(12, marketScreenRowCell.estimated_pickup_wait_time) + protoAdapter.encodedSizeWithTag(11, marketScreenRowCell.cashback_offer_token) + protoAdapter.encodedSizeWithTag(10, marketScreenRowCell.time_zone) + protoAdapter.encodedSizeWithTag(9, marketScreenRowCell.default_client_route) + protoAdapter.encodedSizeWithTag(8, marketScreenRowCell.button_client_route) + protoAdapter.encodedSizeWithTag(7, marketScreenRowCell.button_text) + LocalCashBackOfferPercentage.ADAPTER.encodedSizeWithTag(6, marketScreenRowCell.percentage) + LocalOpenHours.ADAPTER.encodedSizeWithTag(5, marketScreenRowCell.open_hours) + LocalOpenStatus.ADAPTER.encodedSizeWithTag(4, marketScreenRowCell.open_status) + protoAdapter.encodedSizeWithTag(3, marketScreenRowCell.category) + protoAdapter.encodedSizeWithTag(2, marketScreenRowCell.title) + protoAdapter.encodedSizeWithTag(1, marketScreenRowCell.brand_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketScreenRowCell marketScreenRowCell = (MarketScreenRowCell) obj;
        marketScreenRowCell.getClass();
        LocalOpenHours localOpenHours = marketScreenRowCell.open_hours;
        LocalOpenHours localOpenHours2 = localOpenHours != null ? (LocalOpenHours) LocalOpenHours.ADAPTER.redact(localOpenHours) : null;
        LocalCashBackOfferPercentage localCashBackOfferPercentage = marketScreenRowCell.percentage;
        LocalCashBackOfferPercentage localCashBackOfferPercentage2 = localCashBackOfferPercentage != null ? (LocalCashBackOfferPercentage) LocalCashBackOfferPercentage.ADAPTER.redact(localCashBackOfferPercentage) : null;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = marketScreenRowCell.estimated_pickup_wait_time;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration2 = localEstimatedCompletionDuration != null ? (LocalEstimatedCompletionDuration) LocalEstimatedCompletionDuration.ADAPTER.redact(localEstimatedCompletionDuration) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = marketScreenRowCell.brand_token;
        String str2 = marketScreenRowCell.title;
        String str3 = marketScreenRowCell.category;
        LocalOpenStatus localOpenStatus = marketScreenRowCell.open_status;
        String str4 = marketScreenRowCell.button_text;
        String str5 = marketScreenRowCell.button_client_route;
        String str6 = marketScreenRowCell.default_client_route;
        String str7 = marketScreenRowCell.time_zone;
        String str8 = marketScreenRowCell.cashback_offer_token;
        byteString.getClass();
        return new MarketScreenRowCell(str, str2, str3, localOpenStatus, localOpenHours2, localCashBackOfferPercentage2, str4, str5, str6, str7, str8, localEstimatedCompletionDuration2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketScreenRowCell marketScreenRowCell = (MarketScreenRowCell) obj;
        marketScreenRowCell.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, marketScreenRowCell.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 2, marketScreenRowCell.title);
        protoAdapter.encodeWithTag(protoWriter, 3, marketScreenRowCell.category);
        LocalOpenStatus.ADAPTER.encodeWithTag(protoWriter, 4, marketScreenRowCell.open_status);
        LocalOpenHours.ADAPTER.encodeWithTag(protoWriter, 5, marketScreenRowCell.open_hours);
        LocalCashBackOfferPercentage.ADAPTER.encodeWithTag(protoWriter, 6, marketScreenRowCell.percentage);
        protoAdapter.encodeWithTag(protoWriter, 7, marketScreenRowCell.button_text);
        protoAdapter.encodeWithTag(protoWriter, 8, marketScreenRowCell.button_client_route);
        protoAdapter.encodeWithTag(protoWriter, 9, marketScreenRowCell.default_client_route);
        protoAdapter.encodeWithTag(protoWriter, 10, marketScreenRowCell.time_zone);
        protoAdapter.encodeWithTag(protoWriter, 11, marketScreenRowCell.cashback_offer_token);
        LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(protoWriter, 12, marketScreenRowCell.estimated_pickup_wait_time);
        protoWriter.writeBytes(marketScreenRowCell.unknownFields());
    }
}
