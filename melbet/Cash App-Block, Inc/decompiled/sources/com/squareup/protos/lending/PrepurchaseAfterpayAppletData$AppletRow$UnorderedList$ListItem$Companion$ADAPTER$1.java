package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzjc;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzjc zzjcVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem((LocalizedString) obj, zzjcVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                zzjcVar = new PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString((LocalizedString) LocalizedString.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    zzjcVar = new PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$UnknownState((PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem.UnknownState) PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem.UnknownState.ADAPTER.decode(protoReader));
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem listItem = (PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem) obj;
        reverseProtoWriter.getClass();
        listItem.getClass();
        reverseProtoWriter.writeBytes(listItem.unknownFields());
        zzjc zzjcVar = listItem.trailing_content;
        if (zzjcVar instanceof PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString) zzjcVar).value);
        } else if (zzjcVar instanceof PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$UnknownState) {
            PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem.UnknownState.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$UnknownState) zzjcVar).value);
        } else if (zzjcVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, listItem.leading_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem listItem = (PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem) obj;
        listItem.getClass();
        int size$okio = listItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, listItem.leading_text) + size$okio;
        zzjc zzjcVar = listItem.trailing_content;
        if (zzjcVar instanceof PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString) {
            return protoAdapter.encodedSizeWithTag(2, ((PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString) zzjcVar).value) + encodedSizeWithTag;
        }
        if (zzjcVar instanceof PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$UnknownState) {
            return PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem.UnknownState.ADAPTER.encodedSizeWithTag(3, ((PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$UnknownState) zzjcVar).value) + encodedSizeWithTag;
        }
        if (zzjcVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem listItem = (PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem) obj;
        listItem.getClass();
        LocalizedString localizedString = listItem.leading_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        zzjc zzjcVar = listItem.trailing_content;
        byteString.getClass();
        return new PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem(localizedString2, zzjcVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem listItem = (PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem) obj;
        listItem.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, listItem.leading_text);
        zzjc zzjcVar = listItem.trailing_content;
        if (zzjcVar instanceof PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString) {
            protoAdapter.encodeWithTag(protoWriter, 2, ((PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString) zzjcVar).value);
        } else if (zzjcVar instanceof PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$UnknownState) {
            PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem.UnknownState.ADAPTER.encodeWithTag(protoWriter, 3, ((PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$UnknownState) zzjcVar).value);
        } else if (zzjcVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(listItem.unknownFields());
    }
}
