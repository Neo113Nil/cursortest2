package com.squareup.protos.cash.cardspendinginsights;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardSpendingInsightsConfig$ActivitySection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSpendingInsightsConfig.ActivitySection((LocalizedString) obj, m, arrayList, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 3) {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSpendingInsightsConfig.ActivitySection activitySection = (CardSpendingInsightsConfig.ActivitySection) obj;
        reverseProtoWriter.getClass();
        activitySection.getClass();
        reverseProtoWriter.writeBytes(activitySection.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, activitySection.page_size);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, activitySection.exclude_product_classifiers);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, activitySection.include_product_classifiers);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activitySection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSpendingInsightsConfig.ActivitySection activitySection = (CardSpendingInsightsConfig.ActivitySection) obj;
        activitySection.getClass();
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, activitySection.title) + activitySection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT32.encodedSizeWithTag(4, activitySection.page_size) + protoAdapter.asRepeated().encodedSizeWithTag(3, activitySection.exclude_product_classifiers) + protoAdapter.asRepeated().encodedSizeWithTag(2, activitySection.include_product_classifiers) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSpendingInsightsConfig.ActivitySection activitySection = (CardSpendingInsightsConfig.ActivitySection) obj;
        activitySection.getClass();
        LocalizedString localizedString = activitySection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = activitySection.include_product_classifiers;
        List list2 = activitySection.exclude_product_classifiers;
        Integer num = activitySection.page_size;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new CardSpendingInsightsConfig.ActivitySection(localizedString2, list, list2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSpendingInsightsConfig.ActivitySection activitySection = (CardSpendingInsightsConfig.ActivitySection) obj;
        activitySection.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, activitySection.title);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, activitySection.include_product_classifiers);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, activitySection.exclude_product_classifiers);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, activitySection.page_size);
        protoWriter.writeBytes(activitySection.unknownFields());
    }
}
