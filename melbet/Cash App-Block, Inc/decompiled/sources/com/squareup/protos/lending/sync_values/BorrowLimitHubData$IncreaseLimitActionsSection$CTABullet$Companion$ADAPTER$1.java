package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet((LocalizedString) obj, (LocalizedString) obj2, (Icon) obj3, (LocalizedString) obj4, borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute = new BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet cTABullet = (BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet) obj;
        reverseProtoWriter.getClass();
        cTABullet.getClass();
        reverseProtoWriter.writeBytes(cTABullet.unknownFields());
        BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute = cTABullet.action;
        if (borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute.value);
        } else if (borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cTABullet.accessory_label);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cTABullet.icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cTABullet.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cTABullet.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet cTABullet = (BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet) obj;
        cTABullet.getClass();
        int size$okio = cTABullet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, cTABullet.accessory_label) + Icon.ADAPTER.encodedSizeWithTag(3, cTABullet.icon) + protoAdapter.encodedSizeWithTag(2, cTABullet.body) + protoAdapter.encodedSizeWithTag(1, cTABullet.title) + size$okio;
        BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute = cTABullet.action;
        if (borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null) {
            return ProtoAdapter.STRING.encodedSizeWithTag(5, borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute.value) + encodedSizeWithTag;
        }
        if (borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet cTABullet = (BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet) obj;
        cTABullet.getClass();
        LocalizedString localizedString = cTABullet.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = cTABullet.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Icon icon = cTABullet.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString5 = cTABullet.accessory_label;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute = cTABullet.action;
        byteString.getClass();
        return new BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet(localizedString2, localizedString4, icon2, localizedString6, borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet cTABullet = (BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet) obj;
        cTABullet.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, cTABullet.title);
        protoAdapter.encodeWithTag(protoWriter, 2, cTABullet.body);
        Icon.ADAPTER.encodeWithTag(protoWriter, 3, cTABullet.icon);
        protoAdapter.encodeWithTag(protoWriter, 4, cTABullet.accessory_label);
        BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute = cTABullet.action;
        if (borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute.value);
        } else if (borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cTABullet.unknownFields());
    }
}
