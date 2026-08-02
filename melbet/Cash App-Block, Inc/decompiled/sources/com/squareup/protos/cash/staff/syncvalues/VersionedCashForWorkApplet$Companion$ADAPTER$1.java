package com.squareup.protos.cash.staff.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VersionedCashForWorkApplet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VersionedCashForWorkApplet((CashForWorkAppletV1) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CashForWorkAppletV1.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VersionedCashForWorkApplet versionedCashForWorkApplet = (VersionedCashForWorkApplet) obj;
        reverseProtoWriter.getClass();
        versionedCashForWorkApplet.getClass();
        reverseProtoWriter.writeBytes(versionedCashForWorkApplet.unknownFields());
        CashForWorkAppletV1.ADAPTER.encodeWithTag(reverseProtoWriter, 1, versionedCashForWorkApplet.cash_for_work_applet_v1);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VersionedCashForWorkApplet versionedCashForWorkApplet = (VersionedCashForWorkApplet) obj;
        versionedCashForWorkApplet.getClass();
        return CashForWorkAppletV1.ADAPTER.encodedSizeWithTag(1, versionedCashForWorkApplet.cash_for_work_applet_v1) + versionedCashForWorkApplet.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VersionedCashForWorkApplet versionedCashForWorkApplet = (VersionedCashForWorkApplet) obj;
        versionedCashForWorkApplet.getClass();
        CashForWorkAppletV1 cashForWorkAppletV1 = versionedCashForWorkApplet.cash_for_work_applet_v1;
        CashForWorkAppletV1 cashForWorkAppletV12 = cashForWorkAppletV1 != null ? (CashForWorkAppletV1) CashForWorkAppletV1.ADAPTER.redact(cashForWorkAppletV1) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VersionedCashForWorkApplet(cashForWorkAppletV12, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VersionedCashForWorkApplet versionedCashForWorkApplet = (VersionedCashForWorkApplet) obj;
        versionedCashForWorkApplet.getClass();
        CashForWorkAppletV1.ADAPTER.encodeWithTag(protoWriter, 1, versionedCashForWorkApplet.cash_for_work_applet_v1);
        protoWriter.writeBytes(versionedCashForWorkApplet.unknownFields());
    }
}
