package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.ItemizedTable;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ItemizedTable$Row$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ItemizedTable$Row;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemizedTable$Row$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ItemizedTable.Row.Icon.Avatar avatar = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ItemizedTable.Row(avatar, (LocalizedString) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                avatar = new ItemizedTable.Row.Icon.Avatar((UiAvatar) UiAvatar.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ItemizedTable.Row row = (ItemizedTable.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        ItemizedTable.Row.Icon icon = row.icon;
        if (icon instanceof ItemizedTable.Row.Icon.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ItemizedTable.Row.Icon.Avatar) icon).getValue());
        } else if (icon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, row.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, row.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ItemizedTable.Row row = (ItemizedTable.Row) obj;
        row.getClass();
        int size$okio = row.unknownFields().getSize$okio();
        ItemizedTable.Row.Icon icon = row.icon;
        if (icon instanceof ItemizedTable.Row.Icon.Avatar) {
            size$okio += UiAvatar.ADAPTER.encodedSizeWithTag(1, ((ItemizedTable.Row.Icon.Avatar) icon).getValue());
        } else if (icon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, row.label) + protoAdapter.encodedSizeWithTag(2, row.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ItemizedTable.Row row = (ItemizedTable.Row) obj;
        row.getClass();
        LocalizedString localizedString = row.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = row.label;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        ItemizedTable.Row.Icon icon = row.icon;
        byteString.getClass();
        return new ItemizedTable.Row(icon, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ItemizedTable.Row row = (ItemizedTable.Row) obj;
        row.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, row.title);
        protoAdapter.encodeWithTag(protoWriter, 3, row.label);
        ItemizedTable.Row.Icon icon = row.icon;
        if (icon instanceof ItemizedTable.Row.Icon.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, ((ItemizedTable.Row.Icon.Avatar) icon).getValue());
        } else if (icon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(row.unknownFields());
    }
}
