package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzja;
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
public final class PrepurchaseAfterpayAppletData$AppletRow$Cell$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzja zzjaVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseAfterpayAppletData.AppletRow.Cell((LocalizedString) obj, zzjaVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                zzjaVar = new PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options((PrepurchaseAfterpayAppletData.AppletRow.Cell.Options) PrepurchaseAfterpayAppletData.AppletRow.Cell.Options.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    zzjaVar = new PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState((PrepurchaseAfterpayAppletData.AppletRow.Cell.UnknownState) PrepurchaseAfterpayAppletData.AppletRow.Cell.UnknownState.ADAPTER.decode(protoReader));
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell cell = (PrepurchaseAfterpayAppletData.AppletRow.Cell) obj;
        reverseProtoWriter.getClass();
        cell.getClass();
        reverseProtoWriter.writeBytes(cell.unknownFields());
        zzja zzjaVar = cell.trailing_content;
        if (zzjaVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options) {
            PrepurchaseAfterpayAppletData.AppletRow.Cell.Options.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options) zzjaVar).value);
        } else if (zzjaVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState) {
            PrepurchaseAfterpayAppletData.AppletRow.Cell.UnknownState.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState) zzjaVar).value);
        } else if (zzjaVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cell.leading_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell cell = (PrepurchaseAfterpayAppletData.AppletRow.Cell) obj;
        cell.getClass();
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, cell.leading_text) + cell.unknownFields().getSize$okio();
        zzja zzjaVar = cell.trailing_content;
        if (zzjaVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options) {
            return PrepurchaseAfterpayAppletData.AppletRow.Cell.Options.ADAPTER.encodedSizeWithTag(2, ((PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options) zzjaVar).value) + encodedSizeWithTag;
        }
        if (zzjaVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState) {
            return PrepurchaseAfterpayAppletData.AppletRow.Cell.UnknownState.ADAPTER.encodedSizeWithTag(3, ((PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState) zzjaVar).value) + encodedSizeWithTag;
        }
        if (zzjaVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell cell = (PrepurchaseAfterpayAppletData.AppletRow.Cell) obj;
        cell.getClass();
        LocalizedString localizedString = cell.leading_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        zzja zzjaVar = cell.trailing_content;
        byteString.getClass();
        return new PrepurchaseAfterpayAppletData.AppletRow.Cell(localizedString2, zzjaVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell cell = (PrepurchaseAfterpayAppletData.AppletRow.Cell) obj;
        cell.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, cell.leading_text);
        zzja zzjaVar = cell.trailing_content;
        if (zzjaVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options) {
            PrepurchaseAfterpayAppletData.AppletRow.Cell.Options.ADAPTER.encodeWithTag(protoWriter, 2, ((PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options) zzjaVar).value);
        } else if (zzjaVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState) {
            PrepurchaseAfterpayAppletData.AppletRow.Cell.UnknownState.ADAPTER.encodeWithTag(protoWriter, 3, ((PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState) zzjaVar).value);
        } else if (zzjaVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cell.unknownFields());
    }
}
