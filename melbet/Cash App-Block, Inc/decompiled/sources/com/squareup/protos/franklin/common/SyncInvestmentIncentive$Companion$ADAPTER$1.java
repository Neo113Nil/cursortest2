package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentIncentive;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncInvestmentIncentive$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SyncInvestmentIncentive((String) obj, (Money) obj2, (SyncInvestmentIncentive.IncentiveState) obj3, (Image) obj4, (String) obj5, (Long) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    try {
                        obj3 = SyncInvestmentIncentive.IncentiveState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvestmentIncentive syncInvestmentIncentive = (SyncInvestmentIncentive) obj;
        reverseProtoWriter.getClass();
        syncInvestmentIncentive.getClass();
        reverseProtoWriter.writeBytes(syncInvestmentIncentive.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, syncInvestmentIncentive.incentive_expiration_timestamp);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, syncInvestmentIncentive.text);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 4, syncInvestmentIncentive.incentive_icon);
        SyncInvestmentIncentive.IncentiveState.ADAPTER.encodeWithTag(reverseProtoWriter, 3, syncInvestmentIncentive.state);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, syncInvestmentIncentive.offer_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, syncInvestmentIncentive.investment_incentive_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentIncentive syncInvestmentIncentive = (SyncInvestmentIncentive) obj;
        syncInvestmentIncentive.getClass();
        int size$okio = syncInvestmentIncentive.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(6, syncInvestmentIncentive.incentive_expiration_timestamp) + protoAdapter.encodedSizeWithTag(5, syncInvestmentIncentive.text) + Image.ADAPTER.encodedSizeWithTag(4, syncInvestmentIncentive.incentive_icon) + SyncInvestmentIncentive.IncentiveState.ADAPTER.encodedSizeWithTag(3, syncInvestmentIncentive.state) + Money.ADAPTER.encodedSizeWithTag(2, syncInvestmentIncentive.offer_amount) + protoAdapter.encodedSizeWithTag(1, syncInvestmentIncentive.investment_incentive_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentIncentive syncInvestmentIncentive = (SyncInvestmentIncentive) obj;
        syncInvestmentIncentive.getClass();
        Money money = syncInvestmentIncentive.offer_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Image image = syncInvestmentIncentive.incentive_icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = syncInvestmentIncentive.investment_incentive_token;
        SyncInvestmentIncentive.IncentiveState incentiveState = syncInvestmentIncentive.state;
        String str2 = syncInvestmentIncentive.text;
        Long l = syncInvestmentIncentive.incentive_expiration_timestamp;
        byteString.getClass();
        return new SyncInvestmentIncentive(str, money2, incentiveState, image2, str2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentIncentive syncInvestmentIncentive = (SyncInvestmentIncentive) obj;
        syncInvestmentIncentive.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, syncInvestmentIncentive.investment_incentive_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, syncInvestmentIncentive.offer_amount);
        SyncInvestmentIncentive.IncentiveState.ADAPTER.encodeWithTag(protoWriter, 3, syncInvestmentIncentive.state);
        Image.ADAPTER.encodeWithTag(protoWriter, 4, syncInvestmentIncentive.incentive_icon);
        protoAdapter.encodeWithTag(protoWriter, 5, syncInvestmentIncentive.text);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, syncInvestmentIncentive.incentive_expiration_timestamp);
        protoWriter.writeBytes(syncInvestmentIncentive.unknownFields());
    }
}
