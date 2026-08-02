package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzjb;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjb zzjbVar = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseAfterpayAppletData.AppletRow(zzjbVar, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzjbVar = new PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList((PrepurchaseAfterpayAppletData.AppletRow.UnorderedList) PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzjbVar = new PrepurchaseAfterpayAppletData$AppletRow$Content$Cell((PrepurchaseAfterpayAppletData.AppletRow.Cell) PrepurchaseAfterpayAppletData.AppletRow.Cell.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow appletRow = (PrepurchaseAfterpayAppletData.AppletRow) obj;
        reverseProtoWriter.getClass();
        appletRow.getClass();
        reverseProtoWriter.writeBytes(appletRow.unknownFields());
        zzjb zzjbVar = appletRow.content;
        if (zzjbVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList) {
            PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList) zzjbVar).value);
        } else if (zzjbVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Content$Cell) {
            PrepurchaseAfterpayAppletData.AppletRow.Cell.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PrepurchaseAfterpayAppletData$AppletRow$Content$Cell) zzjbVar).value);
        } else if (zzjbVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, appletRow.analytics_row_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PrepurchaseAfterpayAppletData.AppletRow appletRow = (PrepurchaseAfterpayAppletData.AppletRow) obj;
        appletRow.getClass();
        int size$okio = appletRow.unknownFields().getSize$okio();
        zzjb zzjbVar = appletRow.content;
        if (zzjbVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList) {
            encodedSizeWithTag = PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ADAPTER.encodedSizeWithTag(1, ((PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList) zzjbVar).value);
        } else {
            if (!(zzjbVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Content$Cell)) {
                if (zzjbVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(3, appletRow.analytics_row_type) + size$okio;
            }
            encodedSizeWithTag = PrepurchaseAfterpayAppletData.AppletRow.Cell.ADAPTER.encodedSizeWithTag(2, ((PrepurchaseAfterpayAppletData$AppletRow$Content$Cell) zzjbVar).value);
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.STRING.encodedSizeWithTag(3, appletRow.analytics_row_type) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow appletRow = (PrepurchaseAfterpayAppletData.AppletRow) obj;
        appletRow.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzjb zzjbVar = appletRow.content;
        String str = appletRow.analytics_row_type;
        byteString.getClass();
        return new PrepurchaseAfterpayAppletData.AppletRow(zzjbVar, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow appletRow = (PrepurchaseAfterpayAppletData.AppletRow) obj;
        appletRow.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, appletRow.analytics_row_type);
        zzjb zzjbVar = appletRow.content;
        if (zzjbVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList) {
            PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ADAPTER.encodeWithTag(protoWriter, 1, ((PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList) zzjbVar).value);
        } else if (zzjbVar instanceof PrepurchaseAfterpayAppletData$AppletRow$Content$Cell) {
            PrepurchaseAfterpayAppletData.AppletRow.Cell.ADAPTER.encodeWithTag(protoWriter, 2, ((PrepurchaseAfterpayAppletData$AppletRow$Content$Cell) zzjbVar).value);
        } else if (zzjbVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(appletRow.unknownFields());
    }
}
