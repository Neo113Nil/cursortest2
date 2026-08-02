package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FilterGroupSection$FilterGroupItem$Sheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
                return new FilterGroupSection.FilterGroupItem.Sheet((LocalizedString) obj, m, (FilterGroupSection.FilterGroupItem.ItemLayout) obj2, (Button) obj3, (Button) obj4, (AnalyticsEvent) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 3:
                    m.add(FilterGroupSection.FilterGroupItem.FilterItem.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    try {
                        obj2 = FilterGroupSection.FilterGroupItem.ItemLayout.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj3);
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj5);
                    break;
                case 8:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FilterGroupSection.FilterGroupItem.Sheet sheet = (FilterGroupSection.FilterGroupItem.Sheet) obj;
        reverseProtoWriter.getClass();
        sheet.getClass();
        reverseProtoWriter.writeBytes(sheet.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, sheet.title);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, sheet.analytics_view_event);
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, sheet.apply_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, sheet.reset_button);
        FilterGroupSection.FilterGroupItem.ItemLayout.ADAPTER.encodeWithTag(reverseProtoWriter, 4, sheet.item_layout);
        FilterGroupSection.FilterGroupItem.FilterItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, sheet.filter_items);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, sheet.l_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FilterGroupSection.FilterGroupItem.Sheet sheet = (FilterGroupSection.FilterGroupItem.Sheet) obj;
        sheet.getClass();
        int encodedSizeWithTag = FilterGroupSection.FilterGroupItem.ItemLayout.ADAPTER.encodedSizeWithTag(4, sheet.item_layout) + FilterGroupSection.FilterGroupItem.FilterItem.ADAPTER.asRepeated().encodedSizeWithTag(3, sheet.filter_items) + LocalizedString.ADAPTER.encodedSizeWithTag(8, sheet.l_title) + sheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Button.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(1, sheet.title) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(7, sheet.analytics_view_event) + protoAdapter.encodedSizeWithTag(6, sheet.apply_button) + protoAdapter.encodedSizeWithTag(5, sheet.reset_button) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FilterGroupSection.FilterGroupItem.Sheet sheet = (FilterGroupSection.FilterGroupItem.Sheet) obj;
        sheet.getClass();
        LocalizedString localizedString = sheet.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(sheet.filter_items, FilterGroupSection.FilterGroupItem.FilterItem.ADAPTER);
        Button button = sheet.reset_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = sheet.apply_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        AnalyticsEvent analyticsEvent = sheet.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        FilterGroupSection.FilterGroupItem.ItemLayout itemLayout = sheet.item_layout;
        String str = sheet.title;
        byteString.getClass();
        return new FilterGroupSection.FilterGroupItem.Sheet(localizedString2, m1169redactElements, itemLayout, button2, button4, analyticsEvent2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FilterGroupSection.FilterGroupItem.Sheet sheet = (FilterGroupSection.FilterGroupItem.Sheet) obj;
        sheet.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 8, sheet.l_title);
        FilterGroupSection.FilterGroupItem.FilterItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, sheet.filter_items);
        FilterGroupSection.FilterGroupItem.ItemLayout.ADAPTER.encodeWithTag(protoWriter, 4, sheet.item_layout);
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, sheet.reset_button);
        protoAdapter.encodeWithTag(protoWriter, 6, sheet.apply_button);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 7, sheet.analytics_view_event);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sheet.title);
        protoWriter.writeBytes(sheet.unknownFields());
    }
}
