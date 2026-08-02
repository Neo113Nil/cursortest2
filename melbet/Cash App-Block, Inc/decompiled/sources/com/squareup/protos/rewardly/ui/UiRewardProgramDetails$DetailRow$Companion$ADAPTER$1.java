package com.squareup.protos.rewardly.ui;

import com.squareup.cash.clientroutes.UriValidator;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UiRewardProgramDetails$DetailRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        UriValidator uriValidator = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiRewardProgramDetails.DetailRow((String) obj, (String) obj2, uriValidator, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                uriValidator = new UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly((UiRewardProgramDetails.DetailRow.ReadOnly) UiRewardProgramDetails.DetailRow.ReadOnly.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                uriValidator = new UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl((UiRewardProgramDetails.DetailRow.OpenUrl) UiRewardProgramDetails.DetailRow.OpenUrl.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardProgramDetails.DetailRow detailRow = (UiRewardProgramDetails.DetailRow) obj;
        reverseProtoWriter.getClass();
        detailRow.getClass();
        reverseProtoWriter.writeBytes(detailRow.unknownFields());
        UriValidator uriValidator = detailRow.RowAction;
        if (uriValidator instanceof UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly) {
            UiRewardProgramDetails.DetailRow.ReadOnly.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly) uriValidator).getValue());
        } else if (uriValidator instanceof UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl) {
            UiRewardProgramDetails.DetailRow.OpenUrl.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl) uriValidator).getValue());
        } else if (uriValidator != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, detailRow.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, detailRow.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        UiRewardProgramDetails.DetailRow detailRow = (UiRewardProgramDetails.DetailRow) obj;
        detailRow.getClass();
        int size$okio = detailRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, detailRow.value) + protoAdapter.encodedSizeWithTag(1, detailRow.label) + size$okio;
        UriValidator uriValidator = detailRow.RowAction;
        if (uriValidator instanceof UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly) {
            encodedSizeWithTag = UiRewardProgramDetails.DetailRow.ReadOnly.ADAPTER.encodedSizeWithTag(3, ((UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly) uriValidator).getValue());
        } else {
            if (!(uriValidator instanceof UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl)) {
                if (uriValidator == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = UiRewardProgramDetails.DetailRow.OpenUrl.ADAPTER.encodedSizeWithTag(4, ((UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl) uriValidator).getValue());
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardProgramDetails.DetailRow detailRow = (UiRewardProgramDetails.DetailRow) obj;
        detailRow.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = detailRow.label;
        String str2 = detailRow.value;
        UriValidator uriValidator = detailRow.RowAction;
        byteString.getClass();
        return new UiRewardProgramDetails.DetailRow(str, str2, uriValidator, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardProgramDetails.DetailRow detailRow = (UiRewardProgramDetails.DetailRow) obj;
        detailRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, detailRow.label);
        protoAdapter.encodeWithTag(protoWriter, 2, detailRow.value);
        UriValidator uriValidator = detailRow.RowAction;
        if (uriValidator instanceof UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly) {
            UiRewardProgramDetails.DetailRow.ReadOnly.ADAPTER.encodeWithTag(protoWriter, 3, ((UiRewardProgramDetails$DetailRow$RowAction_$ReadOnly) uriValidator).getValue());
        } else if (uriValidator instanceof UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl) {
            UiRewardProgramDetails.DetailRow.OpenUrl.ADAPTER.encodeWithTag(protoWriter, 4, ((UiRewardProgramDetails$DetailRow$RowAction_$OpenUrl) uriValidator).getValue());
        } else if (uriValidator != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(detailRow.unknownFields());
    }
}
