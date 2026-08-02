package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.CreditDetailSheet;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreditDetailSheet$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreditDetailSheet((LocalizedString) obj, (LocalizedString) obj2, m, (Button) obj3, (AnalyticsEvent) obj4, (AnalyticsEvent) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    m.add(CreditDetailSheet.DetailRow.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditDetailSheet creditDetailSheet = (CreditDetailSheet) obj;
        reverseProtoWriter.getClass();
        creditDetailSheet.getClass();
        reverseProtoWriter.writeBytes(creditDetailSheet.unknownFields());
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, creditDetailSheet.analytic_dismiss_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, creditDetailSheet.analytic_view_event);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 4, creditDetailSheet.cta_button);
        CreditDetailSheet.DetailRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, creditDetailSheet.detail_rows);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, creditDetailSheet.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, creditDetailSheet.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditDetailSheet creditDetailSheet = (CreditDetailSheet) obj;
        creditDetailSheet.getClass();
        int size$okio = creditDetailSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = Button.ADAPTER.encodedSizeWithTag(4, creditDetailSheet.cta_button) + CreditDetailSheet.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(3, creditDetailSheet.detail_rows) + protoAdapter.encodedSizeWithTag(2, creditDetailSheet.subtitle) + protoAdapter.encodedSizeWithTag(1, creditDetailSheet.title) + size$okio;
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(6, creditDetailSheet.analytic_dismiss_event) + protoAdapter2.encodedSizeWithTag(5, creditDetailSheet.analytic_view_event) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditDetailSheet creditDetailSheet = (CreditDetailSheet) obj;
        creditDetailSheet.getClass();
        LocalizedString localizedString = creditDetailSheet.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = creditDetailSheet.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(creditDetailSheet.detail_rows, CreditDetailSheet.DetailRow.ADAPTER);
        Button button = creditDetailSheet.cta_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        AnalyticsEvent analyticsEvent = creditDetailSheet.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = creditDetailSheet.analytic_dismiss_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreditDetailSheet(localizedString2, localizedString4, m1169redactElements, button2, analyticsEvent2, analyticsEvent4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditDetailSheet creditDetailSheet = (CreditDetailSheet) obj;
        creditDetailSheet.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, creditDetailSheet.title);
        protoAdapter.encodeWithTag(protoWriter, 2, creditDetailSheet.subtitle);
        CreditDetailSheet.DetailRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, creditDetailSheet.detail_rows);
        Button.ADAPTER.encodeWithTag(protoWriter, 4, creditDetailSheet.cta_button);
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, creditDetailSheet.analytic_view_event);
        protoAdapter2.encodeWithTag(protoWriter, 6, creditDetailSheet.analytic_dismiss_event);
        protoWriter.writeBytes(creditDetailSheet.unknownFields());
    }
}
