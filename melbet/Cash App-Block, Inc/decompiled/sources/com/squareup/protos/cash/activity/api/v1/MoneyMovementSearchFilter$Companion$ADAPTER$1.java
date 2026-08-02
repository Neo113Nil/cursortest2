package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.MoneyMovementSearchFilter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MoneyMovementSearchFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneyMovementSearchFilter((MoneyMovementSearchFilter.Direction) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = MoneyMovementSearchFilter.Direction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneyMovementSearchFilter moneyMovementSearchFilter = (MoneyMovementSearchFilter) obj;
        reverseProtoWriter.getClass();
        moneyMovementSearchFilter.getClass();
        reverseProtoWriter.writeBytes(moneyMovementSearchFilter.unknownFields());
        MoneyMovementSearchFilter.Direction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, moneyMovementSearchFilter.direction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneyMovementSearchFilter moneyMovementSearchFilter = (MoneyMovementSearchFilter) obj;
        moneyMovementSearchFilter.getClass();
        return MoneyMovementSearchFilter.Direction.ADAPTER.encodedSizeWithTag(1, moneyMovementSearchFilter.direction) + moneyMovementSearchFilter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneyMovementSearchFilter moneyMovementSearchFilter = (MoneyMovementSearchFilter) obj;
        moneyMovementSearchFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        MoneyMovementSearchFilter.Direction direction = moneyMovementSearchFilter.direction;
        byteString.getClass();
        return new MoneyMovementSearchFilter(direction, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneyMovementSearchFilter moneyMovementSearchFilter = (MoneyMovementSearchFilter) obj;
        moneyMovementSearchFilter.getClass();
        MoneyMovementSearchFilter.Direction.ADAPTER.encodeWithTag(protoWriter, 1, moneyMovementSearchFilter.direction);
        protoWriter.writeBytes(moneyMovementSearchFilter.unknownFields());
    }
}
