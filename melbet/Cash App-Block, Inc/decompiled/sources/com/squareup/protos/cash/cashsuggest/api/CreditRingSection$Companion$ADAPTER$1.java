package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreditRingSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditRingSection((LocalizedString) obj, (Icon) obj2, (CreditDetailSheet) obj3, (Boolean) obj4, (AnalyticsEvent) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 4) {
                obj2 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj2);
            } else if (nextTag == 5) {
                obj5 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj5);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(CreditDetailSheet.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditRingSection creditRingSection = (CreditRingSection) obj;
        reverseProtoWriter.getClass();
        creditRingSection.getClass();
        reverseProtoWriter.writeBytes(creditRingSection.unknownFields());
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, creditRingSection.analytic_tap_event);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, creditRingSection.is_disabled);
        CreditDetailSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 6, creditRingSection.credit_detail);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 4, creditRingSection.arcade_icon);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, creditRingSection.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditRingSection creditRingSection = (CreditRingSection) obj;
        creditRingSection.getClass();
        return AnalyticsEvent.ADAPTER.encodedSizeWithTag(5, creditRingSection.analytic_tap_event) + ProtoAdapter.BOOL.encodedSizeWithTag(3, creditRingSection.is_disabled) + CreditDetailSheet.ADAPTER.encodedSizeWithTag(6, creditRingSection.credit_detail) + Icon.ADAPTER.encodedSizeWithTag(4, creditRingSection.arcade_icon) + LocalizedString.ADAPTER.encodedSizeWithTag(1, creditRingSection.text) + creditRingSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditRingSection creditRingSection = (CreditRingSection) obj;
        creditRingSection.getClass();
        LocalizedString localizedString = creditRingSection.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Icon icon = creditRingSection.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        CreditDetailSheet creditDetailSheet = creditRingSection.credit_detail;
        CreditDetailSheet creditDetailSheet2 = creditDetailSheet != null ? (CreditDetailSheet) CreditDetailSheet.ADAPTER.redact(creditDetailSheet) : null;
        AnalyticsEvent analyticsEvent = creditRingSection.analytic_tap_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = creditRingSection.is_disabled;
        byteString.getClass();
        return new CreditRingSection(localizedString2, icon2, creditDetailSheet2, bool, analyticsEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditRingSection creditRingSection = (CreditRingSection) obj;
        creditRingSection.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, creditRingSection.text);
        Icon.ADAPTER.encodeWithTag(protoWriter, 4, creditRingSection.arcade_icon);
        CreditDetailSheet.ADAPTER.encodeWithTag(protoWriter, 6, creditRingSection.credit_detail);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, creditRingSection.is_disabled);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 5, creditRingSection.analytic_tap_event);
        protoWriter.writeBytes(creditRingSection.unknownFields());
    }
}
