package com.squareup.protos.cash.notificationsettings.common.v1;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NotificationCategoryExtraConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzkb zzkbVar = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationCategoryExtraConfig(zzkbVar, (NotificationCategoryExtraConfig.CategoryEligibility) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzkbVar = new NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement((NotificationCategoryExtraConfig.PriceMovementConfiguration) NotificationCategoryExtraConfig.PriceMovementConfiguration.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzkbVar = new NotificationCategoryExtraConfig$Configuration$StockPriceMovement((NotificationCategoryExtraConfig.PriceMovementConfiguration) NotificationCategoryExtraConfig.PriceMovementConfiguration.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzkbVar = new NotificationCategoryExtraConfig$Configuration$Families((NotificationCategoryExtraConfig.FamiliesConfiguration) NotificationCategoryExtraConfig.FamiliesConfiguration.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(NotificationCategoryExtraConfig.CategoryEligibility.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = (NotificationCategoryExtraConfig) obj;
        reverseProtoWriter.getClass();
        notificationCategoryExtraConfig.getClass();
        reverseProtoWriter.writeBytes(notificationCategoryExtraConfig.unknownFields());
        zzkb zzkbVar = notificationCategoryExtraConfig.configuration;
        if (zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement) {
            NotificationCategoryExtraConfig.PriceMovementConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement) zzkbVar).value);
        } else if (zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$StockPriceMovement) {
            NotificationCategoryExtraConfig.PriceMovementConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((NotificationCategoryExtraConfig$Configuration$StockPriceMovement) zzkbVar).value);
        } else if (zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$Families) {
            NotificationCategoryExtraConfig.FamiliesConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((NotificationCategoryExtraConfig$Configuration$Families) zzkbVar).value);
        } else if (zzkbVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        NotificationCategoryExtraConfig.CategoryEligibility.ADAPTER.encodeWithTag(reverseProtoWriter, 4, notificationCategoryExtraConfig.category_eligibility);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = (NotificationCategoryExtraConfig) obj;
        notificationCategoryExtraConfig.getClass();
        int size$okio = notificationCategoryExtraConfig.unknownFields().getSize$okio();
        zzkb zzkbVar = notificationCategoryExtraConfig.configuration;
        if (zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement) {
            encodedSizeWithTag = NotificationCategoryExtraConfig.PriceMovementConfiguration.ADAPTER.encodedSizeWithTag(1, ((NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement) zzkbVar).value);
        } else if (zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$StockPriceMovement) {
            encodedSizeWithTag = NotificationCategoryExtraConfig.PriceMovementConfiguration.ADAPTER.encodedSizeWithTag(2, ((NotificationCategoryExtraConfig$Configuration$StockPriceMovement) zzkbVar).value);
        } else {
            if (!(zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$Families)) {
                if (zzkbVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return NotificationCategoryExtraConfig.CategoryEligibility.ADAPTER.encodedSizeWithTag(4, notificationCategoryExtraConfig.category_eligibility) + size$okio;
            }
            encodedSizeWithTag = NotificationCategoryExtraConfig.FamiliesConfiguration.ADAPTER.encodedSizeWithTag(3, ((NotificationCategoryExtraConfig$Configuration$Families) zzkbVar).value);
        }
        size$okio += encodedSizeWithTag;
        return NotificationCategoryExtraConfig.CategoryEligibility.ADAPTER.encodedSizeWithTag(4, notificationCategoryExtraConfig.category_eligibility) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = (NotificationCategoryExtraConfig) obj;
        notificationCategoryExtraConfig.getClass();
        NotificationCategoryExtraConfig.CategoryEligibility categoryEligibility = notificationCategoryExtraConfig.category_eligibility;
        NotificationCategoryExtraConfig.CategoryEligibility categoryEligibility2 = categoryEligibility != null ? (NotificationCategoryExtraConfig.CategoryEligibility) NotificationCategoryExtraConfig.CategoryEligibility.ADAPTER.redact(categoryEligibility) : null;
        ByteString byteString = ByteString.EMPTY;
        zzkb zzkbVar = notificationCategoryExtraConfig.configuration;
        byteString.getClass();
        return new NotificationCategoryExtraConfig(zzkbVar, categoryEligibility2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = (NotificationCategoryExtraConfig) obj;
        notificationCategoryExtraConfig.getClass();
        NotificationCategoryExtraConfig.CategoryEligibility.ADAPTER.encodeWithTag(protoWriter, 4, notificationCategoryExtraConfig.category_eligibility);
        zzkb zzkbVar = notificationCategoryExtraConfig.configuration;
        if (zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement) {
            NotificationCategoryExtraConfig.PriceMovementConfiguration.ADAPTER.encodeWithTag(protoWriter, 1, ((NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement) zzkbVar).value);
        } else if (zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$StockPriceMovement) {
            NotificationCategoryExtraConfig.PriceMovementConfiguration.ADAPTER.encodeWithTag(protoWriter, 2, ((NotificationCategoryExtraConfig$Configuration$StockPriceMovement) zzkbVar).value);
        } else if (zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$Families) {
            NotificationCategoryExtraConfig.FamiliesConfiguration.ADAPTER.encodeWithTag(protoWriter, 3, ((NotificationCategoryExtraConfig$Configuration$Families) zzkbVar).value);
        } else if (zzkbVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(notificationCategoryExtraConfig.unknownFields());
    }
}
