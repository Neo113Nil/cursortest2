package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FilterGroupSection$FilterGroupItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        ErrorEvent.Os.Companion companion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FilterGroupSection.FilterGroupItem((LocalizedString) obj, companion, (FilterGroupSection.FilterGroupItem.Sheet) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(FilterGroupSection.FilterGroupItem.Sheet.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 4) {
                companion = new FilterGroupSection$FilterGroupItem$Style$FilterSheet((FilterGroupSection.FilterGroupItem.Sheet) FilterGroupSection.FilterGroupItem.Sheet.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                companion = new FilterGroupSection$FilterGroupItem$Style$FilterToggle((FilterGroupSection.FilterGroupItem.Toggle) FilterGroupSection.FilterGroupItem.Toggle.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FilterGroupSection.FilterGroupItem filterGroupItem = (FilterGroupSection.FilterGroupItem) obj;
        reverseProtoWriter.getClass();
        filterGroupItem.getClass();
        reverseProtoWriter.writeBytes(filterGroupItem.unknownFields());
        ErrorEvent.Os.Companion companion = filterGroupItem.style;
        if (companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterSheet) {
            FilterGroupSection.FilterGroupItem.Sheet.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((FilterGroupSection$FilterGroupItem$Style$FilterSheet) companion).value);
        } else if (companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterToggle) {
            FilterGroupSection.FilterGroupItem.Toggle.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((FilterGroupSection$FilterGroupItem$Style$FilterToggle) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, filterGroupItem.default_name);
        FilterGroupSection.FilterGroupItem.Sheet.ADAPTER.encodeWithTag(reverseProtoWriter, 2, filterGroupItem.sheet);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, filterGroupItem.l_default_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        FilterGroupSection.FilterGroupItem filterGroupItem = (FilterGroupSection.FilterGroupItem) obj;
        filterGroupItem.getClass();
        int encodedSizeWithTag2 = LocalizedString.ADAPTER.encodedSizeWithTag(3, filterGroupItem.l_default_name) + filterGroupItem.unknownFields().getSize$okio();
        ErrorEvent.Os.Companion companion = filterGroupItem.style;
        if (companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterSheet) {
            encodedSizeWithTag = FilterGroupSection.FilterGroupItem.Sheet.ADAPTER.encodedSizeWithTag(4, ((FilterGroupSection$FilterGroupItem$Style$FilterSheet) companion).value);
        } else {
            if (!(companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterToggle)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(1, filterGroupItem.default_name) + FilterGroupSection.FilterGroupItem.Sheet.ADAPTER.encodedSizeWithTag(2, filterGroupItem.sheet) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = FilterGroupSection.FilterGroupItem.Toggle.ADAPTER.encodedSizeWithTag(5, ((FilterGroupSection$FilterGroupItem$Style$FilterToggle) companion).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.STRING.encodedSizeWithTag(1, filterGroupItem.default_name) + FilterGroupSection.FilterGroupItem.Sheet.ADAPTER.encodedSizeWithTag(2, filterGroupItem.sheet) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FilterGroupSection.FilterGroupItem filterGroupItem = (FilterGroupSection.FilterGroupItem) obj;
        filterGroupItem.getClass();
        LocalizedString localizedString = filterGroupItem.l_default_name;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        FilterGroupSection.FilterGroupItem.Sheet sheet = filterGroupItem.sheet;
        FilterGroupSection.FilterGroupItem.Sheet sheet2 = sheet != null ? (FilterGroupSection.FilterGroupItem.Sheet) FilterGroupSection.FilterGroupItem.Sheet.ADAPTER.redact(sheet) : null;
        ByteString byteString = ByteString.EMPTY;
        ErrorEvent.Os.Companion companion = filterGroupItem.style;
        String str = filterGroupItem.default_name;
        byteString.getClass();
        return new FilterGroupSection.FilterGroupItem(localizedString2, companion, sheet2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FilterGroupSection.FilterGroupItem filterGroupItem = (FilterGroupSection.FilterGroupItem) obj;
        filterGroupItem.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, filterGroupItem.l_default_name);
        ProtoAdapter protoAdapter = FilterGroupSection.FilterGroupItem.Sheet.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, filterGroupItem.sheet);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, filterGroupItem.default_name);
        ErrorEvent.Os.Companion companion = filterGroupItem.style;
        if (companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterSheet) {
            protoAdapter.encodeWithTag(protoWriter, 4, ((FilterGroupSection$FilterGroupItem$Style$FilterSheet) companion).value);
        } else if (companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterToggle) {
            FilterGroupSection.FilterGroupItem.Toggle.ADAPTER.encodeWithTag(protoWriter, 5, ((FilterGroupSection$FilterGroupItem$Style$FilterToggle) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(filterGroupItem.unknownFields());
    }
}
