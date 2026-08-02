package com.squareup.protos.cash.notificationsettings.common.v1;

import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NotificationCategoryExtraConfig$PriceMovementConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationCategoryExtraConfig.PriceMovementConfiguration((Integer) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationCategoryExtraConfig.PriceMovementConfiguration priceMovementConfiguration = (NotificationCategoryExtraConfig.PriceMovementConfiguration) obj;
        reverseProtoWriter.getClass();
        priceMovementConfiguration.getClass();
        reverseProtoWriter.writeBytes(priceMovementConfiguration.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, priceMovementConfiguration.price_movement_percent_default);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, priceMovementConfiguration.price_movement_percent_max);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, priceMovementConfiguration.price_movement_percent_min);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, priceMovementConfiguration.price_movement_percent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationCategoryExtraConfig.PriceMovementConfiguration priceMovementConfiguration = (NotificationCategoryExtraConfig.PriceMovementConfiguration) obj;
        priceMovementConfiguration.getClass();
        int size$okio = priceMovementConfiguration.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(4, priceMovementConfiguration.price_movement_percent_default) + protoAdapter.encodedSizeWithTag(3, priceMovementConfiguration.price_movement_percent_max) + protoAdapter.encodedSizeWithTag(2, priceMovementConfiguration.price_movement_percent_min) + protoAdapter.encodedSizeWithTag(1, priceMovementConfiguration.price_movement_percent) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationCategoryExtraConfig.PriceMovementConfiguration priceMovementConfiguration = (NotificationCategoryExtraConfig.PriceMovementConfiguration) obj;
        priceMovementConfiguration.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = priceMovementConfiguration.price_movement_percent;
        Integer num2 = priceMovementConfiguration.price_movement_percent_min;
        Integer num3 = priceMovementConfiguration.price_movement_percent_max;
        Integer num4 = priceMovementConfiguration.price_movement_percent_default;
        byteString.getClass();
        return new NotificationCategoryExtraConfig.PriceMovementConfiguration(num, num2, num3, num4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationCategoryExtraConfig.PriceMovementConfiguration priceMovementConfiguration = (NotificationCategoryExtraConfig.PriceMovementConfiguration) obj;
        priceMovementConfiguration.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, priceMovementConfiguration.price_movement_percent);
        protoAdapter.encodeWithTag(protoWriter, 2, priceMovementConfiguration.price_movement_percent_min);
        protoAdapter.encodeWithTag(protoWriter, 3, priceMovementConfiguration.price_movement_percent_max);
        protoAdapter.encodeWithTag(protoWriter, 4, priceMovementConfiguration.price_movement_percent_default);
        protoWriter.writeBytes(priceMovementConfiguration.unknownFields());
    }
}
