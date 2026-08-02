package com.squareup.protos.franklin.common;

import com.datadog.android.rum.model.ResourceEvent;
import com.squareup.protos.franklin.common.AfterPayRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterPayRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ResourceEvent.Companion companion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterPayRenderData(companion, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                companion = new AfterPayRenderData$RowType$Summary((AfterPayRenderData.Summary) AfterPayRenderData.Summary.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                companion = new AfterPayRenderData$RowType$Installment((AfterPayRenderData.Installment) AfterPayRenderData.Installment.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterPayRenderData afterPayRenderData = (AfterPayRenderData) obj;
        reverseProtoWriter.getClass();
        afterPayRenderData.getClass();
        reverseProtoWriter.writeBytes(afterPayRenderData.unknownFields());
        ResourceEvent.Companion companion = afterPayRenderData.rowType;
        if (companion instanceof AfterPayRenderData$RowType$Summary) {
            AfterPayRenderData.Summary.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AfterPayRenderData$RowType$Summary) companion).value);
        } else if (companion instanceof AfterPayRenderData$RowType$Installment) {
            AfterPayRenderData.Installment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AfterPayRenderData$RowType$Installment) companion).value);
        } else {
            if (companion == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AfterPayRenderData afterPayRenderData = (AfterPayRenderData) obj;
        afterPayRenderData.getClass();
        int size$okio = afterPayRenderData.unknownFields().getSize$okio();
        ResourceEvent.Companion companion = afterPayRenderData.rowType;
        if (companion instanceof AfterPayRenderData$RowType$Summary) {
            encodedSizeWithTag = AfterPayRenderData.Summary.ADAPTER.encodedSizeWithTag(1, ((AfterPayRenderData$RowType$Summary) companion).value);
        } else {
            if (!(companion instanceof AfterPayRenderData$RowType$Installment)) {
                if (companion == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = AfterPayRenderData.Installment.ADAPTER.encodedSizeWithTag(2, ((AfterPayRenderData$RowType$Installment) companion).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterPayRenderData afterPayRenderData = (AfterPayRenderData) obj;
        afterPayRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        ResourceEvent.Companion companion = afterPayRenderData.rowType;
        byteString.getClass();
        return new AfterPayRenderData(companion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterPayRenderData afterPayRenderData = (AfterPayRenderData) obj;
        afterPayRenderData.getClass();
        ResourceEvent.Companion companion = afterPayRenderData.rowType;
        if (companion instanceof AfterPayRenderData$RowType$Summary) {
            AfterPayRenderData.Summary.ADAPTER.encodeWithTag(protoWriter, 1, ((AfterPayRenderData$RowType$Summary) companion).value);
        } else if (companion instanceof AfterPayRenderData$RowType$Installment) {
            AfterPayRenderData.Installment.ADAPTER.encodeWithTag(protoWriter, 2, ((AfterPayRenderData$RowType$Installment) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(afterPayRenderData.unknownFields());
    }
}
