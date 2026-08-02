package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.AfterPayRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterPayRenderData$Summary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterPayRenderData.Summary(m, (Long) obj, (Money) obj2, (String) obj3, (AfterPayRenderData.Summary.Status) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(Image.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj4 = AfterPayRenderData.Summary.Status.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterPayRenderData.Summary summary = (AfterPayRenderData.Summary) obj;
        reverseProtoWriter.getClass();
        summary.getClass();
        reverseProtoWriter.writeBytes(summary.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, summary.next_merchant_name);
        AfterPayRenderData.Summary.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 5, summary.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, summary.due_date);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, summary.next_amount_due);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, summary.number_of_active_payments);
        Image.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, summary.merchant_logos);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterPayRenderData.Summary summary = (AfterPayRenderData.Summary) obj;
        summary.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(3, summary.next_amount_due) + ProtoAdapter.INT64.encodedSizeWithTag(2, summary.number_of_active_payments) + Image.ADAPTER.asRepeated().encodedSizeWithTag(1, summary.merchant_logos) + summary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, summary.next_merchant_name) + AfterPayRenderData.Summary.Status.ADAPTER.encodedSizeWithTag(5, summary.status) + protoAdapter.encodedSizeWithTag(4, summary.due_date) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterPayRenderData.Summary summary = (AfterPayRenderData.Summary) obj;
        summary.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(summary.merchant_logos, Image.ADAPTER);
        Money money = summary.next_amount_due;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = summary.number_of_active_payments;
        String str = summary.due_date;
        AfterPayRenderData.Summary.Status status = summary.status;
        String str2 = summary.next_merchant_name;
        byteString.getClass();
        return new AfterPayRenderData.Summary(m1169redactElements, l, money2, str, status, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterPayRenderData.Summary summary = (AfterPayRenderData.Summary) obj;
        summary.getClass();
        Image.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, summary.merchant_logos);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, summary.number_of_active_payments);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, summary.next_amount_due);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, summary.due_date);
        AfterPayRenderData.Summary.Status.ADAPTER.encodeWithTag(protoWriter, 5, summary.status);
        protoAdapter.encodeWithTag(protoWriter, 6, summary.next_merchant_name);
        protoWriter.writeBytes(summary.unknownFields());
    }
}
